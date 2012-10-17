/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.FachadaBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */
public class ControladorRetiros {

    private final FachadaBD fachadaBD;

    public ControladorRetiros() {

        fachadaBD = new FachadaBD();
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
        }
        return null;
    }

    public String[][] reporteUnParametroJoin(String tabla, String parametro) {

        try {
            String joinCondition = null;

            if (tabla == "Fecha") {
                joinCondition = "j.cod_Fecha = r.cod_Fecha";
            }

            if (tabla == "PlanDatos") {
                joinCondition = "j.cod_PlanDatos = r.cod_PlanDatos";
            }

            if (tabla == "PlanVoz") {
                joinCondition = "j.cod_PlanVoz = r.cod_PlanVoz";
            }

            if (tabla == "Demografia_Cliente") {
                joinCondition = "j.cod_Demografia = r.cod_Demografia";
            }

            if (tabla == "Cliente") {
                joinCondition = "j.cod_Cliente = r.cod_Cliente";
            }

            if (tabla == "Oficina") {
                joinCondition = "j.cod_Oficina = r.cod_Oficina";
            }

            ResultSet resultSet = fachadaBD.executeQuery("SELECT j." + parametro + ", COUNT( * ) "
                    + "FROM Retiros r "
                    + "INNER JOIN " + tabla + " j ON " + joinCondition + " "
                    + "GROUP BY j." + parametro);

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
        }
        return null;

    }
}
