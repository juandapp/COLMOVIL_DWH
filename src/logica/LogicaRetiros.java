package logica;

import dao.ControladorRetiros;
import gui.BarChart;
import gui.PieChart;
import java.util.ArrayList;

public class LogicaRetiros {

    private ControladorRetiros controladorRetiros;
    // Análisis Unidimensional
    // Uno
    private ArrayList<String>[] comboBoxHechos;
    // Dos
    private ArrayList<String>[] comboBoxAtributos;
    private ArrayList<String>[] comboBoxDimensiones;
    // Tres
    private ArrayList<String>[] comboBoxDimensiones1;
    private ArrayList<String>[] comboBoxAtributos1;
    private ArrayList<String>[] comboBoxHechos1;
    // Análisis Bidimensional
    // Cuatro
    private ArrayList<String>[] comboBoxDimensionesA;
    private ArrayList<String>[] comboBoxAtributosA;
    private ArrayList<String>[] comboBoxDimensionesB;
    private ArrayList<String>[] comboBoxAtributosB;

    public LogicaRetiros() {
        controladorRetiros = new ControladorRetiros();

        comboBoxHechos = controladorRetiros.getAtributosInteresantes("Retiros");
        comboBoxHechos1 = controladorRetiros.getAtributosInteresantes("Retiros");

        comboBoxDimensiones = controladorRetiros.getDimensionesRelacionadas("Retiros");
        comboBoxDimensiones1 = controladorRetiros.getDimensionesRelacionadas("Retiros");
        comboBoxDimensionesA = controladorRetiros.getDimensionesRelacionadas("Retiros");
        comboBoxDimensionesB = controladorRetiros.getDimensionesRelacionadas("Retiros");
    }

    public Object[] getDataComboBoxDimensiones() {
        return comboBoxDimensiones[0].toArray();
    }

    public Object[] getDataComboBoxDimensiones1() {
        return comboBoxDimensiones1[0].toArray();
    }

    public Object[] getDataComboBoxDimensionesA() {
        return comboBoxDimensionesA[0].toArray();
    }

    public Object[] getDataComboBoxDimensionesB() {
        return comboBoxDimensionesB[0].toArray();
    }

    public Object[] getDataComboBoxAtributos(int dimension) {
        comboBoxAtributos = controladorRetiros.getAtributosInteresantes(comboBoxDimensiones[1].get(dimension));
        return comboBoxAtributos[0].toArray();
    }

    public Object[] getDataComboBoxAtributos1(int dimension) {
        comboBoxAtributos1 = controladorRetiros.getAtributosInteresantes(comboBoxDimensiones1[1].get(dimension));
        return comboBoxAtributos1[0].toArray();
    }

    public Object[] getDataComboBoxAtributosA(int dimension) {
        comboBoxAtributosA = controladorRetiros.getAtributosInteresantes(comboBoxDimensionesA[1].get(dimension));
        return comboBoxAtributosA[0].toArray();
    }

    public Object[] getDataComboBoxAtributosB(int dimension) {
        comboBoxAtributosB = controladorRetiros.getAtributosInteresantes(comboBoxDimensionesB[1].get(dimension));
        return comboBoxAtributosB[0].toArray();
    }

    public Object[] getDataComboBoxHechos() {
        return comboBoxHechos[0].toArray();
    }

    public Object[] getDataComboBoxHechos1() {
        return comboBoxHechos1[0].toArray();
    }

    public PieChart reporteUnParametroPie(int hecho) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroPie(
                comboBoxHechos[1].get(hecho));
        PieChart pieChart = new PieChart("Retiros y Causas", matrizCausas);
        return pieChart;
    }

    public BarChart reporteUnParametroBarra(int hecho) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroBarra(
                comboBoxHechos[1].get(hecho));
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        return barChart;
    }

    public BarChart reporteUnParametroJoinBarra(int dimension, int atributo) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinBarra(
                comboBoxDimensiones[1].get(dimension),
                comboBoxAtributos[1].get(atributo));
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        return barChart;
    }

    public PieChart reporteUnParametroJoinPie(int dimension, int atributo) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinPie(
                comboBoxDimensiones[1].get(dimension),
                comboBoxAtributos[1].get(atributo));
        PieChart pieChart = new PieChart("Retiros y Causas", matrizCausas);
        return pieChart;
    }

    public BarChart reporteBivariadoBarra(int dimension, int atributo, String valor, int hecho) {
        String[][] matrizCausas = controladorRetiros.reporteBivariadoBarra(
                comboBoxDimensiones1[1].get(dimension),
                comboBoxAtributos1[1].get(atributo),
                valor,
                comboBoxHechos1[1].get(hecho));
        BarChart barChart = new BarChart("Retiros y Causas", matrizCausas);
        return barChart;
    }

    public Object[] getDataComboBoxValores(int dimension, int atributo) {
        String dimensionName = comboBoxDimensiones1[1].get(dimension);
        String atributoName = comboBoxAtributos1[1].get(atributo);
        return controladorRetiros.getValores(dimensionName, atributoName);
    }

    public BarChart reporteBiDimensionalBarra(int dimensionA, int atributoA, int dimensionB, int atributoB) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
