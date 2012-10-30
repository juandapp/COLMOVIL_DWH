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
        PieChart pieChart = new PieChart("Retiros - " + comboBoxHechos[0].get(hecho), matrizCausas);
        return pieChart;
    }

    public BarChart reporteUnParametroBarra(int hecho) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroBarra(
                comboBoxHechos[1].get(hecho));
        BarChart barChart = new BarChart("Retiros - " + comboBoxHechos[0].get(hecho), matrizCausas);
        return barChart;
    }

    public BarChart reporteUnParametroJoinBarra(int dimension, int atributo) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinBarra(
                comboBoxDimensiones[1].get(dimension),
                comboBoxAtributos[1].get(atributo));
        BarChart barChart = new BarChart("Retiros - " + comboBoxAtributos[0].get(atributo), matrizCausas);
        return barChart;
    }

    public PieChart reporteUnParametroJoinPie(int dimension, int atributo) {
        String[][] matrizCausas = controladorRetiros.reporteUnParametroJoinPie(
                comboBoxDimensiones[1].get(dimension),
                comboBoxAtributos[1].get(atributo));
        PieChart pieChart = new PieChart("Retiros - " + comboBoxAtributos[0].get(atributo), matrizCausas);
        return pieChart;
    }

    public BarChart reporteBivariadoBarra(int dimension, int atributo, String valor, int hecho) {
        String[][] matrizCausas = controladorRetiros.reporteBivariadoBarra(
                comboBoxDimensiones1[1].get(dimension),
                comboBoxAtributos1[1].get(atributo),
                valor,
                comboBoxHechos1[1].get(hecho));

        String title = "Retiros - " + comboBoxHechos[0].get(hecho) + " por " + comboBoxAtributos1[0].get(atributo);

        if (!valor.equalsIgnoreCase("todos")) {
            title = title + " = [" + valor + "]";
        }

        BarChart barChart = new BarChart(title, matrizCausas);
        return barChart;
    }

    public Object[] getDataComboBoxValores(int dimension, int atributo) {
        String dimensionName = comboBoxDimensiones1[1].get(dimension);
        String atributoName = comboBoxAtributos1[1].get(atributo);
        return controladorRetiros.getValores(dimensionName, atributoName);
    }

    public BarChart reporteBiDimensionalBarra(int dimensionA, int atributoA, String valorA, int dimensionB, int atributoB, String valorB) {
        String dimensionNameA = comboBoxDimensionesA[1].get(dimensionA);
        String atributoNameA = comboBoxAtributosA[1].get(atributoA);
        String dimensionNameB = comboBoxDimensionesB[1].get(dimensionB);
        String atributoNameB = comboBoxAtributosB[1].get(atributoB);

        String[][] matrizCausas = controladorRetiros.reporteBidimensional(dimensionNameA, atributoNameA, valorA, dimensionNameB, atributoNameB, valorB);

        String title = "Retiros - " + " por " + comboBoxAtributosA[0].get(atributoA);

        if (!valorA.equalsIgnoreCase("todos")) {
            title = title + " = [" + valorA + "] ";
        }

        title = title + " por " + comboBoxAtributosB[0].get(atributoB);

        if (!valorB.equalsIgnoreCase("todos")) {
            title = title + " = [" + valorB + "] ";
        }

        BarChart barChart = new BarChart(title, matrizCausas);
        return barChart;
    }

    public Object[] getDataComboBoxValoresA(int dimension, int atributo) {
        String dimensionName = comboBoxDimensionesA[1].get(dimension);
        String atributoName = comboBoxAtributosA[1].get(atributo);
        return controladorRetiros.getValores(dimensionName, atributoName);
    }

    public Object[] getDataComboBoxValoresB(int dimension, int atributo) {
        String dimensionName = comboBoxDimensionesB[1].get(dimension);
        String atributoName = comboBoxAtributosB[1].get(atributo);
        return controladorRetiros.getValores(dimensionName, atributoName);
    }
}
