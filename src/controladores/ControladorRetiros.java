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
            
            int i=0;
            do {
                resultado[i][0]=tabla.getString(1);
                resultado[i][1]=tabla.getString(2);
                i++;
            } while (tabla.next());


            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRetiros.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        return null;
    }
}
