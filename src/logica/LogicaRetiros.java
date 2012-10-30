package logica;

import dao.ControladorRetiros;
import gui.BarChart;
import gui.PieChart;
import java.util.ArrayList;

public class LogicaRetiros {

    private ControladorRetiros controladorRetiros;
    private ArrayList<String>[] hechosInteresantes;
    private ArrayList<String>[] atributosInteresantes;
    private ArrayList<String>[] dimensionesRelacionadas;

    public LogicaRetiros() {
        controladorRetiros = new ControladorRetiros();
        hechosInteresantes = controladorRetiros.getAtributosInteresantes("Retiros");
        dimensionesRelacionadas = controladorRetiros.getDimensionesRelacionadas("Retiros");
    }

    public Object[] getAtributosInteresantes(int dimension) {
        atributosInteresantes = controladorRetiros.getAtributosInteresantes(dimensionesRelacionadas[1].get(dimension));
        return atributosInteresantes[0].toArray();
    }

    public Object[] getHechos() {
        return hechosInteresantes[0].toArray();
    }

    public Object[] getDimensionesRelacionadas() {

        return dimensionesRelacionadas[0].toArray();
    }

    public PieChart reporteUnParametroPie(int hecho) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroPie(
                hechosInteresantes[1].get(hecho));
        PieChart pieChart = new PieChart("Retiros y Causas", matrizCausas);
        return pieChart;
    }

    public BarChart reporteUnParametroBarra(int hecho) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroBarra(
                hechosInteresantes[1].get(hecho));
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        return barChart;
    }

    public BarChart reporteUnParametroJoinBarra(int dimension, int atributo) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinBarra(
                dimensionesRelacionadas[1].get(dimension),
                atributosInteresantes[1].get(atributo));
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        return barChart;
    }

    public PieChart reporteUnParametroJoinPie(int dimension, int atributo) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinPie(
                dimensionesRelacionadas[1].get(dimension),
                atributosInteresantes[1].get(atributo));
        PieChart pieChart = new PieChart("Retiros y Causas", matrizCausas);
        return pieChart;
    }

    public BarChart reporteBivariadoBarra(int hecho, int atributo, int dimension) {
         String[][] matrizCausas = controladorRetiros.reporteBivariadoBarra(
                hechosInteresantes[1].get(hecho),
                atributosInteresantes[1].get(atributo),
                dimensionesRelacionadas[1].get(dimension));
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        return barChart;
    }

    public Object[] getValores(int dimension, int atributo) {
        String dimensionName = dimensionesRelacionadas[1].get(dimension);
        String atributoName = atributosInteresantes[1].get(atributo);
        return controladorRetiros.getValores(dimensionName, atributoName);
    }
}
