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
                    + "column_name "
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

        dimension = convertidorDimensiones(dimension);
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

        dimension = convertidorDimensiones(dimension);
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

    public String[][] reporteUnParametroJoinPie(String fk, String parametro) {

        String dimensionConvertida = convertidorDimensiones(fk);
        try {
            String joinCondition = null;
            System.out.println(fk);

            if ("Fecha".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Fecha = r.cod_Fecha";
            }

            if ("OperadorDWH".equals(dimensionConvertida)) {
                System.out.println("Operador: "+fk);
                if (fk.equals("cod_Operador_Origen")) {
                    joinCondition = "j.cod_Operador = r.cod_Operador_Origen";
                } else {
                    joinCondition = "j.cod_Operador = r.cod_Operador_Destino";
                }
            }

            if ("PlanVoz".equals(dimensionConvertida)) {
                joinCondition = "j.cod_PlanVoz = r.cod_PlanVoz";
            }

            if ("Demografia_Cliente".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Demografia = r.cod_Demografia";
            }

            if ("ClienteDWH".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Cliente = r.cod_Cliente";
            }

            if ("OficinaDWH".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Oficina = r.cod_Oficina";
            }


            String consulta = "SELECT j." + parametro + ", COUNT( * ) "
                    + "FROM Consumos_Voz r "
                    + "INNER JOIN " + dimensionConvertida + " j ON " + joinCondition + " "
                    + "GROUP BY j." + parametro;

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

    public String[][] reporteUnParametroJoinBarra(String fk, String parametro) {

        String dimensionConvertida = convertidorDimensiones(fk);
        try {
            String joinCondition = null;
            System.out.println(fk);

            if ("Fecha".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Fecha = r.cod_Fecha";
            }

            if ("OperadorDWH".equals(dimensionConvertida)) {
                System.out.println("Operador: "+fk);
                if (fk.equals("cod_Operador_Origen")) {
                    joinCondition = "j.cod_Operador = r.cod_Operador_Origen";
                } else {
                    joinCondition = "j.cod_Operador = r.cod_Operador_Destino";
                }
            }

            if ("PlanVoz".equals(dimensionConvertida)) {
                joinCondition = "j.cod_PlanVoz = r.cod_PlanVoz";
            }

            if ("Demografia_Cliente".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Demografia = r.cod_Demografia";
            }

            if ("ClienteDWH".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Cliente = r.cod_Cliente";
            }

            if ("OficinaDWH".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Oficina = r.cod_Oficina";
            }


            String consulta = "SELECT COUNT(*), j." + parametro + " "
                    + "FROM Consumos_Voz r "
                    + "INNER JOIN " + dimensionConvertida + " j ON " + joinCondition + " "
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

    public String[][] reporteDuracionPie(int rangoMinutos) {

        try {

            String consulta = "SELECT tt.rango , COUNT( tt.rango ) "
                    + "FROM (SELECT FLOOR( EXTRACT(MINUTE FROM Consumos_Voz.duracion) /"+rangoMinutos+" ) AS rango "
                    + "FROM Consumos_Voz) AS tt GROUP BY tt.rango";
            System.out.println(consulta);

            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();


            String[][] resultado = new String[numeroFilas][2];

            int i = 0;
            resultSet.first();
            resultSet.previous();
            while (resultSet.next()) {
                resultado[i][0] = formatearDuracion(resultSet.getString(1), rangoMinutos);
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

    public String[][] reporteDuracionBar(int rangoMinutos) {

        try {

            String consulta = "SELECT tt.rango , COUNT( tt.rango ) "
                    + "FROM (SELECT FLOOR( EXTRACT(MINUTE FROM Consumos_Voz.duracion) /"+rangoMinutos+" ) AS rango "
                    + "FROM Consumos_Voz) AS tt GROUP BY tt.rango";

            ResultSet resultSet = fachadaBD.executeQuery(consulta);

            resultSet.last();
            int numeroFilas = resultSet.getRow();

            String[][] resultado = new String[numeroFilas][3];

            int i = 0;
            resultSet.first();
            resultSet.previous();
            while (resultSet.next()) {
                resultado[i][0] = resultSet.getString(2);
                resultado[i][1] = "";
                resultado[i][2] = formatearDuracion(resultSet.getString(1), rangoMinutos);
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

    public String[][] reporteBivariadoBarra(String fk, String atributo, String valueAtributo, String hecho) {

        String dimensionConvertida = convertidorDimensiones(fk);
        try {
            String joinCondition = null;
            System.out.println(fk);

            if ("Fecha".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Fecha = r.cod_Fecha";
            }

            if ("OperadorDWH".equals(dimensionConvertida)) {
                System.out.println("Operador: "+fk);
                if (fk.equals("cod_Operador_Origen")) {
                    joinCondition = "j.cod_Operador = r.cod_Operador_Origen";
                } else {
                    joinCondition = "j.cod_Operador = r.cod_Operador_Destino";
                }
            }

            if ("PlanVoz".equals(dimensionConvertida)) {
                joinCondition = "j.cod_PlanVoz = r.cod_PlanVoz";
            }

            if ("Demografia_Cliente".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Demografia = r.cod_Demografia";
            }

            if ("ClienteDWH".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Cliente = r.cod_Cliente";
            }

            if ("OficinaDWH".equals(dimensionConvertida)) {
                joinCondition = "j.cod_Oficina = r.cod_Oficina";
            }

            String consulta = "SELECT COUNT( r." + hecho + " ), r." + hecho + ", j." + atributo + " "
                    + "FROM Consumos_Voz r" + " "
                    + "INNER JOIN " + dimensionConvertida + " j ON " + joinCondition + " ";

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

    public String[][] reporteBidimensional(String fkA, String atributoA, String valorA, String fkB, String atributoB, String valorB) {
        try {

            String joinConditionA = null;
            String joinConditionB = null;
            
            String dimensionConvertidaA = convertidorDimensiones(fkA);
            String dimensionConvertidaB = convertidorDimensiones(fkA);



            if ("Fecha".equals(fkA)) {
                joinConditionA = "j.cod_Fecha = r.cod_Fecha";
            }
            if ("OperadorDWH".equals(dimensionConvertidaA)) {
                if (fkA.equals("cod_Operador_Origen")) {
                    joinConditionA = "j.cod_Operador = r.cod_Operador_Origen";
                } else {
                    joinConditionA = "j.cod_Operador = r.cod_Operador_Destino";
                }
            }
            if ("PlanVoz".equals(fkA)) {
                joinConditionA = "j.cod_PlanVoz = r.cod_PlanVoz";
            }
            if ("Demografia_Cliente".equals(fkA)) {
                joinConditionA = "j.cod_Demografia = r.cod_Demografia";
            }
            if ("ClienteDWH".equals(fkA)) {
                joinConditionA = "j.cod_Cliente = r.cod_Cliente";
            }
            if ("OficinaDWH".equals(fkA)) {
                joinConditionA = "j.cod_Oficina = r.cod_Oficina";
            }

            if ("Fecha".equals(fkB)) {
                joinConditionB = "k.cod_Fecha = r.cod_Fecha";
            }
            if ("OperadorDWH".equals(dimensionConvertidaB)) {
                if (fkB.equals("cod_Operador_Origen")) {
                    joinConditionB = "j.cod_Operador = r.cod_Operador_Origen";
                } else {
                    joinConditionB = "j.cod_Operador = r.cod_Operador_Destino";
                }
            }
            if ("PlanVoz".equals(fkB)) {
                joinConditionB = "k.cod_PlanVoz = r.cod_PlanVoz";
            }
            if ("Demografia_Cliente".equals(fkB)) {
                joinConditionB = "k.cod_Demografia = r.cod_Demografia";
            }
            if ("ClienteDWH".equals(fkB)) {
                joinConditionB = "k.cod_Cliente = r.cod_Cliente";
            }
            if ("OficinaDWH".equals(fkB)) {
                joinConditionB = "k.cod_Oficina = r.cod_Oficina";
            }

            String consulta = "SELECT COUNT(*), j." + atributoA + ", k." + atributoB + " "
                    + "FROM Consumos_Voz r" + " "
                    + "INNER JOIN " + dimensionConvertidaA + " j ON " + joinConditionA + " "
                    + "INNER JOIN " + dimensionConvertidaB + " k ON " + joinConditionB + " ";


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

    private String convertidorDimensiones(String dimension) {

        if (dimension.equals("cod_Cliente")) {
            return "ClienteDWH";
        }
        if (dimension.equals("cod_Fecha")) {
            return "Fecha";
        }
        if (dimension.equals("cod_Demografia")) {
            return "Demografia_Cliente";
        }
        if (dimension.equals("cod_PlaVoz")) {
            return "PlanVoz";
        }
        if (dimension.equals("cod_Operador_Origen")) {
            return "OperadorDWH";
        }
        if (dimension.equals("cod_Operador_Destino")) {
            return "OperadorDWH";
        }
        if (dimension.equals("Consumos_Voz")) {
            return "Consumos_Voz";
        }
        return "";
    }
    
      private String formatearDuracion(String rango, int rangoMinutos) {
        String rangoFormateado = "";
        
        int rangoInt = Integer.parseInt(rango);
        int inicio = rangoInt*rangoMinutos;
        int finalR = inicio+rangoMinutos;
        
        if(finalR>60){
            finalR = 60;
        }
        rangoFormateado = inicio + " - "+finalR; 
        return rangoFormateado;
    }
}
