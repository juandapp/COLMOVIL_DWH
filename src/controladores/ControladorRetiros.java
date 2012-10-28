/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.FachadaBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 *
 * @author gustavo
 */
public class ControladorRetiros {

    private final FachadaBD fachadaBD;

    public ControladorRetiros() {

        fachadaBD = new FachadaBD();
    }

    public Object[] getDimensionesRelacionadas(String hecho) {
        try {
            String consulta = "select "
                    + "referenced_table_name "
                    + "from information_schema.key_column_usage "
                    + "where referenced_table_name is not null and table_name = '" + hecho + "';";

            ResultSet tabla = fachadaBD.executeQuery(consulta);
            ArrayList<String> dimensiones = new ArrayList<>();

            while (tabla.next()) {
                dimensiones.add(tabla.getString(1));
            }

            return dimensiones.toArray();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fachadaBD.cerrarConexion();
        }

        return null;
    }

    public Object[] getAtributosInteresantes(String dimension) {
        try {
            String consulta = "DESC " + dimension;
            ResultSet tabla = fachadaBD.executeQuery(consulta);

            ArrayList<String> atributos = new ArrayList<>();

            while (tabla.next()) {
                String atributo = tabla.getString(1);
                if (esIntesante(atributo, dimension)) {
                    atributos.add(atributo);
                }
            }
            return atributos.toArray();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            fachadaBD.cerrarConexion();
        }
        return null;
    }

    private boolean esIntesante(String atributo, String dimension) {
        try {
            if (!atributo.startsWith("cod")) {
                String consulta = "SELECT COUNT(DISTINCT " + atributo + ") FROM " + dimension;
                ResultSet tabla = fachadaBD.executeQuery(consulta);

                tabla.next();
                int value = Integer.parseInt(tabla.getString(1));

                if (value < 33) {
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return false;
    }

    public String[][] reporteCausa() {

        try {
            ResultSet tabla = fachadaBD.executeQuery("SELECT causa, COUNT( causa ) FROM  Retiros GROUP BY causa");

            tabla.last();
            int numeroFilas = tabla.getRow();
            tabla.first();

            String[][] resultado = new String[numeroFilas][2];

            int i = 0;
            do {
                resultado[i][0] = tabla.getString(1);
                resultado[i][1] = tabla.getString(2);
                i++;
            } while (tabla.next());


            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }finally {
            fachadaBD.cerrarConexion();
        }
        return null;
    }

    public String[][] reporteCausaEstrato() {

        try {
            ResultSet tabla = fachadaBD.executeQuery("SELECT COUNT( r.causa ), r.causa, d.estrato "
                    + "FROM Retiros r "
                    + "INNER JOIN Demografia_Cliente d ON r.cod_Demografia = d.cod_Demografia "
                    + "GROUP BY r.causa, d.estrato");

            tabla.last();
            int numeroFilas = tabla.getRow();
            tabla.first();

            String[][] resultado = new String[numeroFilas][3];

            int i = 0;
            do {
                resultado[i][0] = tabla.getString(1);
                resultado[i][1] = tabla.getString(2);
                resultado[i][2] = tabla.getString(3);
                i++;
            } while (tabla.next());


            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }finally {
            fachadaBD.cerrarConexion();
        }
        return null;
    }

    public String[][] reporteUnParametroJoinPie(String tabla, String parametro) {

        try {
            String joinCondition = null;
            System.out.println(tabla);

            if ("Fecha".equals(tabla)) {
                joinCondition = "j.cod_Fecha = r.cod_Fecha";
            }

            if ("PlanDatos".equals(tabla)) {
                joinCondition = "j.cod_PlanDatos = r.cod_PlanDatos";
            }

            if ("PlanVoz".equals(tabla)) {
                joinCondition = "j.cod_PlanVoz = r.cod_PlanVoz";
            }

            if ("Demografia_Cliente".equals(tabla)) {
                joinCondition = "j.cod_Demografia = r.cod_Demografia";
            }

            if ("ClienteDWH".equals(tabla)) {
                joinCondition = "j.cod_Cliente = r.cod_Cliente";
            }

            if ("OficinaDWH".equals(tabla)) {
                joinCondition = "j.cod_Oficina = r.cod_Oficina";
            }


            String consulta = "SELECT j." + parametro + ", COUNT( * ) "
                    + "FROM Retiros r "
                    + "INNER JOIN " + tabla + " j ON " + joinCondition + " "
                    + "GROUP BY j." + parametro;
            System.out.println(consulta);
            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();
            resultSet.first();

            String[][] resultado = new String[numeroFilas][2];

            int i = 0;
            do {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = resultSet.getString(2);
                i++;
            } while (resultSet.next());

            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            fachadaBD.cerrarConexion();
        }
        return null;

    }

    public String[][] reporteUnParametroJoinBarra(String tabla, String parametro) {

        try {
            String joinCondition = null;
            System.out.println(tabla);

            if ("Fecha".equals(tabla)) {
                joinCondition = "j.cod_Fecha = r.cod_Fecha";
            }

            if ("PlanDatos".equals(tabla)) {
                joinCondition = "j.cod_PlanDatos = r.cod_PlanDatos";
            }

            if ("PlanVoz".equals(tabla)) {
                joinCondition = "j.cod_PlanVoz = r.cod_PlanVoz";
            }

            if ("Demografia_Cliente".equals(tabla)) {
                joinCondition = "j.cod_Demografia = r.cod_Demografia";
            }

            if ("ClienteDWH".equals(tabla)) {
                joinCondition = "j.cod_Cliente = r.cod_Cliente";
            }

            if ("OficinaDWH".equals(tabla)) {
                joinCondition = "j.cod_Oficina = r.cod_Oficina";
            }


            String consulta = "SELECT COUNT(*), j." + parametro + " "
                    + "FROM Retiros r "
                    + "INNER JOIN " + tabla + " j ON " + joinCondition + " "
                    + "GROUP BY j." + parametro;
            System.out.println(consulta);
            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();
            resultSet.first();

            String[][] resultado = new String[numeroFilas][3];

            int i = 0;
            do {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = "";
                resultado[i][2] = resultSet.getString(2);
                i++;
            } while (resultSet.next());

            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            fachadaBD.cerrarConexion();
        }
        return null;

    }

    public String[][] reporteUnParametroPie(String parametro) {

        try {

            String consulta = "SELECT " + parametro + ", COUNT( " + parametro + " ) FROM  Retiros GROUP BY " + parametro;
            System.out.println(consulta);
            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();
            resultSet.first();

            String[][] resultado = new String[numeroFilas][2];

            int i = 0;
            do {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = resultSet.getString(2);
                i++;
            } while (resultSet.next());

            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            fachadaBD.cerrarConexion();
        }
        return null;

    }

    public String[][] reporteUnParametroBarra(String parametro) {

        try {

            String consulta = "SELECT COUNT( " + parametro + " ), " + parametro + "  FROM  Retiros GROUP BY " + parametro;
            System.out.println(consulta);
            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();
            resultSet.first();

            String[][] resultado = new String[numeroFilas][3];

            int i = 0;
            do {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = "";
                resultado[i][2] = resultSet.getString(2);
                i++;
            } while (resultSet.next());

            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            fachadaBD.cerrarConexion();
        }
        return null;

    }

    public String[][] reporteBivariadoBarra(String parametroHecho, String parametroDimension, String tablaDim) {

        try {

            String joinCondition = null;
            System.out.println(tablaDim);

            if ("Fecha".equals(tablaDim)) {
                joinCondition = "j.cod_Fecha = r.cod_Fecha";
            }

            if ("PlanDatos".equals(tablaDim)) {
                joinCondition = "j.cod_PlanDatos = r.cod_PlanDatos";
            }

            if ("PlanVoz".equals(tablaDim)) {
                joinCondition = "j.cod_PlanVoz = r.cod_PlanVoz";
            }

            if ("Demografia_Cliente".equals(tablaDim)) {
                joinCondition = "j.cod_Demografia = r.cod_Demografia";
            }

            if ("ClienteDWH".equals(tablaDim)) {
                joinCondition = "j.cod_Cliente = r.cod_Cliente";
            }

            if ("OficinaDWH".equals(tablaDim)) {
                joinCondition = "j.cod_Oficina = r.cod_Oficina";
            }


            //String consulta = "SELECT COUNT( " + parametro + " ), " + parametro + "  FROM  Retiros GROUP BY " + parametro;
            String consulta = "SELECT COUNT( r." + parametroHecho + " ), r." + parametroHecho + ", j." + parametroDimension
                    + "FROM Retiros r"
                    + "INNER JOIN" + tablaDim + " j ON " + joinCondition + " "
                    + "GROUP BY r." + parametroHecho + ", j." + parametroDimension;

            System.out.println(consulta);
            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();
            resultSet.first();

            String[][] resultado = new String[numeroFilas][3];

            int i = 0;
            do {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = resultSet.getString(2);
                resultado[i][2] = resultSet.getString(3);
                i++;
            } while (resultSet.next());

            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            fachadaBD.cerrarConexion();
        }
        return null;

    }
}
