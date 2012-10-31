package dao;

import accesoDatos.FachadaBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorConsumos {

    private final FachadaBD fachadaBD;

    public ControladorConsumos() {

        fachadaBD = new FachadaBD();
    }

    public ArrayList<String>[] getDimensionesRelacionadas(String hecho) {
        try {
            String consulta = "select "
                    + "referenced_table_name "
                    + "from information_schema.key_column_usage "
                    + "where referenced_table_name is not null and table_name = '" + hecho + "';";

            ResultSet tabla = fachadaBD.executeQuery(consulta);
            ArrayList<String>[] dimensiones = new ArrayList[2];

            // Formato para la GUI
            dimensiones[0] = new ArrayList<>();
            // Formato SQL
            dimensiones[1] = new ArrayList<>();
            while (tabla.next()) {
                String dimension = tabla.getString(1);
                dimensiones[0].add(formatearAtributo(dimension));
                dimensiones[1].add(dimension);
            }

            return dimensiones;

        } catch (SQLException ex) {
            System.out.println("Error getDimensionesRelacionadas: " + ex);
        } finally {
            fachadaBD.cerrarConexion("getDimensionesRelacionadas");
        }

        return null;
    }

    public ArrayList<String>[] getAtributosInteresantes(String dimension) {

        try {
            String consulta = "DESC " + dimension;
            ResultSet tabla = fachadaBD.executeQuery(consulta);
            ArrayList<String>[] atributos = new ArrayList[2];

            // Formato para la GUI
            atributos[0] = new ArrayList<>();
            // Formato SQL
            atributos[1] = new ArrayList<>();

            while (tabla.next()) {
                String atributo = tabla.getString(1);
                if (esIntesante(atributo, dimension)) {
                    atributos[0].add(formatearAtributo(atributo));
                    atributos[1].add(atributo);
                }
            }

            return atributos;

        } catch (SQLException ex) {

            System.out.println("Error getAtributosInteresantes: " + ex);
        } finally {
            fachadaBD.cerrarConexion("getAtributosInteresantes");
        }
        return null;
    }

    public Object[] getValores(String dimension, String atributo) {

        ArrayList<String> valores = new ArrayList<>();
        try {
            String consulta = "SELECT DISTINCT " + atributo + " FROM " + dimension;
            ResultSet tabla = fachadaBD.executeQuery(consulta);

            valores.add("Todos");
            while (tabla.next()) {
                String valor = tabla.getString(1);
                valores.add(valor);
            }

            return valores.toArray();

        } catch (SQLException ex) {

            System.out.println("Error valor Interesante: " + ex);
        } finally {
            fachadaBD.cerrarConexion("Get Valores Interesantes");
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

            System.out.println("Error esIntesante: " + ex);
        }
        return false;
    }

    public String[][] reporteUnParametroJoinPie(String dimension, String parametro) {

        try {
            String joinCondition = null;
            System.out.println(dimension);

            if ("Fecha".equals(dimension)) {
                joinCondition = "j.cod_Fecha = r.cod_Fecha";
            }

            if ("PlanDatos".equals(dimension)) {
                joinCondition = "j.cod_PlanDatos = r.cod_PlanDatos";
            }

            if ("PlanVoz".equals(dimension)) {
                joinCondition = "j.cod_PlanVoz = r.cod_PlanVoz";
            }

            if ("Demografia_Cliente".equals(dimension)) {
                joinCondition = "j.cod_Demografia = r.cod_Demografia";
            }

            if ("ClienteDWH".equals(dimension)) {
                joinCondition = "j.cod_Cliente = r.cod_Cliente";
            }

            if ("OficinaDWH".equals(dimension)) {
                joinCondition = "j.cod_Oficina = r.cod_Oficina";
            }


            String consulta = "SELECT j." + parametro + ", COUNT( * ) "
                    + "FROM Consumos_Voz r "
                    + "INNER JOIN " + dimension + " j ON " + joinCondition + " "
                    + "GROUP BY j." + parametro;
            System.out.println(consulta);

            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();
            System.out.println("numeroFilas: " + numeroFilas);

            String[][] resultado = new String[numeroFilas][2];

            int i = 0;
            resultSet.first();
            resultSet.previous();
            while (resultSet.next()) {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = resultSet.getString(2);
                i++;
            }

            return resultado;

        } catch (SQLException ex) {

            System.out.println("Error reporteUnParametroJoinPie: " + ex);
        } finally {
            fachadaBD.cerrarConexion("reporteUnParametroJoinPie");
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
                    + "FROM Consumos_Voz r "
                    + "INNER JOIN " + tabla + " j ON " + joinCondition + " "
                    + "GROUP BY j." + parametro;
            System.out.println(consulta);

            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();

            String[][] resultado = new String[numeroFilas][3];

            int i = 0;
            resultSet.first();
            resultSet.previous();
            while (resultSet.next()) {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = "";
                resultado[i][2] = resultSet.getString(2);
                i++;
            }
            return resultado;

        } catch (SQLException ex) {

            System.out.println("Error reporteUnParametroJoinBarra: " + ex);
        } finally {
            fachadaBD.cerrarConexion("reporteUnParametroJoinBarra");

        }
        return null;

    }

    public String[][] reporteUnParametroPie(String parametro) {

        try {

            String consulta = "SELECT " + parametro + ", COUNT( " + parametro + " ) FROM  Consumos_Voz GROUP BY " + parametro;
            System.out.println(consulta);

            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();


            String[][] resultado = new String[numeroFilas][2];

            int i = 0;
            resultSet.first();
            resultSet.previous();
            while (resultSet.next()) {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = resultSet.getString(2);
                i++;
            }

            return resultado;

        } catch (SQLException ex) {

            System.out.println("Error reporteUnParametroPie: " + ex);
        } finally {
            fachadaBD.cerrarConexion("reporteUnParametroPie");
        }
        return null;

    }

    public String[][] reporteUnParametroBarra(String parametro) {

        try {

            String consulta = "SELECT COUNT( " + parametro + " ), " + parametro + "  FROM  Consumos_Voz GROUP BY " + parametro;
            System.out.println(consulta);

            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();

            String[][] resultado = new String[numeroFilas][3];

            int i = 0;
            resultSet.first();
            resultSet.previous();
            while (resultSet.next()) {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = "";
                resultado[i][2] = resultSet.getString(2);
                i++;
            }

            return resultado;

        } catch (SQLException ex) {

            System.out.println("Error reporteUnParametroBarra: " + ex);
        } finally {
            fachadaBD.cerrarConexion("reporteUnParametroBarra");
        }
        return null;

    }

    public String[][] reporteBivariadoBarra(String dimension, String atributo, String valueAtributo, String hecho) {

        try {

            String joinCondition = null;
            System.out.println(dimension);

            if ("Fecha".equals(dimension)) {
                joinCondition = "j.cod_Fecha = r.cod_Fecha";
            }

            if ("PlanDatos".equals(dimension)) {
                joinCondition = "j.cod_PlanDatos = r.cod_PlanDatos";
            }

            if ("PlanVoz".equals(dimension)) {
                joinCondition = "j.cod_PlanVoz = r.cod_PlanVoz";
            }

            if ("Demografia_Cliente".equals(dimension)) {
                joinCondition = "j.cod_Demografia = r.cod_Demografia";
            }

            if ("ClienteDWH".equals(dimension)) {
                joinCondition = "j.cod_Cliente = r.cod_Cliente";
            }

            if ("OficinaDWH".equals(dimension)) {
                joinCondition = "j.cod_Oficina = r.cod_Oficina";
            }

            String consulta = "SELECT COUNT( r." + hecho + " ), r." + hecho + ", j." + atributo + " "
                    + "FROM Consumos_Voz r" + " "
                    + "INNER JOIN " + dimension + " j ON " + joinCondition + " ";

            if (!valueAtributo.equalsIgnoreCase("todos")) {
                consulta = consulta + "WHERE j." + atributo + " = '" + valueAtributo + "' ";
            }

            consulta = consulta + "GROUP BY r." + hecho + ", j." + atributo;

            System.out.println(consulta);
            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();

            String[][] resultado = new String[numeroFilas][3];

            int i = 0;
            resultSet.first();
            resultSet.previous();
            while (resultSet.next()) {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = resultSet.getString(2);
                resultado[i][2] = resultSet.getString(3);
                i++;
            }

            return resultado;

        } catch (SQLException ex) {

            System.out.println("Error reporteBivariadoBarra: " + ex);
        } finally {
            fachadaBD.cerrarConexion("reporteBivariadoBarra");

        }
        return null;

    }

    private String formatearAtributo(String atributo) {

        String newAtributo = atributo;
        if (newAtributo.startsWith("cod") || newAtributo.startsWith("COD")) {
            newAtributo = atributo.substring(3);
        }

        String[] split = newAtributo.split("DWH|_|(?=\\p{Lu})");
        newAtributo = "";
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                newAtributo = newAtributo + String.valueOf(split[i].charAt(0)).toUpperCase() + split[i].substring(1) + " ";
            }
        }

        return newAtributo.substring(0, newAtributo.length() - 1);
    }

    public String[][] reporteBidimensional(String dimensionA, String atributoA, String valorA, String dimensionB, String atributoB, String valorB) {
        try {

            String joinConditionA = null;
            String joinConditionB = null;
            System.out.println(dimensionA);

            if ("Fecha".equals(dimensionA)) {
                joinConditionA = "j.cod_Fecha = r.cod_Fecha";
            }
            if ("PlanDatos".equals(dimensionA)) {
                joinConditionA = "j.cod_PlanDatos = r.cod_PlanDatos";
            }
            if ("PlanVoz".equals(dimensionA)) {
                joinConditionA = "j.cod_PlanVoz = r.cod_PlanVoz";
            }
            if ("Demografia_Cliente".equals(dimensionA)) {
                joinConditionA = "j.cod_Demografia = r.cod_Demografia";
            }
            if ("ClienteDWH".equals(dimensionA)) {
                joinConditionA = "j.cod_Cliente = r.cod_Cliente";
            }
            if ("OficinaDWH".equals(dimensionA)) {
                joinConditionA = "j.cod_Oficina = r.cod_Oficina";
            }

            if ("Fecha".equals(dimensionB)) {
                joinConditionB = "k.cod_Fecha = r.cod_Fecha";
            }
            if ("PlanDatos".equals(dimensionB)) {
                joinConditionB = "k.cod_PlanDatos = r.cod_PlanDatos";
            }
            if ("PlanVoz".equals(dimensionB)) {
                joinConditionB = "k.cod_PlanVoz = r.cod_PlanVoz";
            }
            if ("Demografia_Cliente".equals(dimensionB)) {
                joinConditionB = "k.cod_Demografia = r.cod_Demografia";
            }
            if ("ClienteDWH".equals(dimensionB)) {
                joinConditionB = "k.cod_Cliente = r.cod_Cliente";
            }
            if ("OficinaDWH".equals(dimensionB)) {
                joinConditionB = "k.cod_Oficina = r.cod_Oficina";
            }

            String consulta = "SELECT COUNT(*), j." + atributoA + ", k." + atributoB + " "
                    + "FROM Consumos_Voz r" + " "
                    + "INNER JOIN " + dimensionA + " j ON " + joinConditionA + " "
                    + "INNER JOIN " + dimensionB + " k ON " + joinConditionB + " ";


            if (!valorA.equalsIgnoreCase("todos") && valorB.equalsIgnoreCase("todos")) {
                consulta = consulta + "WHERE j." + atributoA + " = '" + valorA + "' ";
            }

            if (!valorB.equalsIgnoreCase("todos") && valorA.equalsIgnoreCase("todos")) {
                consulta = consulta + "WHERE k." + atributoB + " = '" + valorB + "' ";
            }

            if (!valorB.equalsIgnoreCase("todos") && !valorA.equalsIgnoreCase("todos")) {
                consulta = consulta + "WHERE k." + atributoB + " = '" + valorB + "' "
                        + "AND j." + atributoA + " = '" + valorA + "' ";
            }

            consulta = consulta + "GROUP BY j." + atributoA + ", k." + atributoB;

            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();

            String[][] resultado = new String[numeroFilas][3];

            // Esto aqui y en todas las demas esta mal!!! porque puede que la consulta no arroje resultados!!
            int i = 0;
            resultSet.first();
            resultSet.previous();
            while (resultSet.next()) {
                resultado[i][0] = resultSet.getString(1);
                resultado[i][1] = resultSet.getString(2);
                resultado[i][2] = resultSet.getString(3);
                i++;
            }

            return resultado;

        } catch (SQLException ex) {
            System.out.println("Error reporteBivariadoBarra: " + ex);
        } finally {
            fachadaBD.cerrarConexion("reporteBivariadoBarra");

        }
        return null;
    }
}
