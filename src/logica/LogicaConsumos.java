package logica;

import dao.ControladorConsumos;
import dao.ControladorRetiros;
import gui.BarChart;
import gui.MultiplePieChart;
import gui.PieChart;
import java.util.ArrayList;

public class LogicaConsumos {

    private ControladorConsumos controladorConsumos;
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

    public LogicaConsumos() {
        controladorConsumos = new ControladorConsumos();

        comboBoxHechos = controladorConsumos.getAtributosInteresantes("Consumos_Voz");
        comboBoxHechos1 = controladorConsumos.getAtributosInteresantes("Consumos_Voz");

        comboBoxDimensiones = controladorConsumos.getDimensionesRelacionadas("Consumos_Voz");
        comboBoxDimensiones1 = controladorConsumos.getDimensionesRelacionadas("Consumos_Voz");
        comboBoxDimensionesA = controladorConsumos.getDimensionesRelacionadas("Consumos_Voz");
        comboBoxDimensionesB = controladorConsumos.getDimensionesRelacionadas("Consumos_Voz");
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
        comboBoxAtributos = controladorConsumos.getAtributosInteresantes(comboBoxDimensiones[1].get(dimension));
        return comboBoxAtributos[0].toArray();
    }

    public Object[] getDataComboBoxAtributos1(int dimension) {
        comboBoxAtributos1 = controladorConsumos.getAtributosInteresantes(comboBoxDimensiones1[1].get(dimension));
        return comboBoxAtributos1[0].toArray();
    }

    public Object[] getDataComboBoxAtributosA(int dimension) {
        comboBoxAtributosA = controladorConsumos.getAtributosInteresantes(comboBoxDimensionesA[1].get(dimension));
        return comboBoxAtributosA[0].toArray();
    }

    public Object[] getDataComboBoxAtributosB(int dimension) {
        comboBoxAtributosB = controladorConsumos.getAtributosInteresantes(comboBoxDimensionesB[1].get(dimension));
        return comboBoxAtributosB[0].toArray();
    }

    public Object[] getDataComboBoxHechos() {
        return comboBoxHechos[0].toArray();
    }

    public Object[] getDataComboBoxHechos1() {
        return comboBoxHechos1[0].toArray();
    }

    public PieChart reporteUnParametroPie(int hecho) {
        String[][] matrizCausas = controladorConsumos.reporteUnParametroPie(
                comboBoxHechos[1].get(hecho));
        PieChart pieChart = new PieChart("Consumos - " + comboBoxHechos[0].get(hecho), matrizCausas);
        return pieChart;
    }

    public BarChart reporteUnParametroBarra(int hecho) {
        String[][] matrizCausas = controladorConsumos.reporteUnParametroBarra(
                comboBoxHechos[1].get(hecho));
        BarChart barChart = new BarChart("Consumos - " + comboBoxHechos[0].get(hecho), matrizCausas, "Consumos");
        return barChart;
    }

    public BarChart reporteUnParametroJoinBarra(int dimension, int atributo) {
        String[][] matrizCausas = controladorConsumos.reporteUnParametroJoinBarra(
                comboBoxDimensiones[1].get(dimension),
                comboBoxAtributos[1].get(atributo));
        String title = "Consumos por " + comboBoxAtributos[0].get(atributo)+" de "+comboBoxDimensiones[0].get(dimension);
        BarChart barChart = new BarChart(title, matrizCausas, "Consumos");
        return barChart;
    }

    public PieChart reporteUnParametroJoinPie(int dimension, int atributo) {
        String[][] matrizCausas = controladorConsumos.reporteUnParametroJoinPie(
                comboBoxDimensiones[1].get(dimension),
                comboBoxAtributos[1].get(atributo));
        String title = "Consumos por " + comboBoxAtributos[0].get(atributo)+" de "+comboBoxDimensiones[0].get(dimension);
        PieChart pieChart = new PieChart(title, matrizCausas);
        return pieChart;
    }

    public BarChart reporteBivariadoBarra(int dimension, int atributo, String valor, int hecho) {
        String[][] matrizCausas = controladorConsumos.reporteBivariado(
                comboBoxDimensiones1[1].get(dimension),
                comboBoxAtributos1[1].get(atributo),
                valor,
                comboBoxHechos1[1].get(hecho));

        String title = "Consumos - " + comboBoxHechos[0].get(hecho) + " por " + comboBoxAtributos1[0].get(atributo)
                + " de "+comboBoxDimensiones1[0].get(dimension);

        if (!valor.equalsIgnoreCase("todos")) {
            title = title + " = [" + valor + "]";
        }

        BarChart barChart = new BarChart(title, matrizCausas, "Consumos");
        return barChart;
    }

    public MultiplePieChart reporteBivariadoPie(int dimension, int atributo, String valor, int hecho) {
        String[][] matrizCausas = controladorConsumos.reporteBivariado(
                comboBoxDimensiones1[1].get(dimension),
                comboBoxAtributos1[1].get(atributo),
                valor,
                comboBoxHechos1[1].get(hecho));

        String title = "Consumos - " + comboBoxHechos[0].get(hecho) + " por " + comboBoxAtributos1[0].get(atributo)
                + " de "+comboBoxDimensiones1[0].get(dimension);

        if (!valor.equalsIgnoreCase("todos")) {
            title = title + " = [" + valor + "]";
        }

        MultiplePieChart multiplePieChart = new MultiplePieChart(title, matrizCausas, "Consumos");
        return multiplePieChart;
    }

    public Object[] getDataComboBoxValores(int dimension, int atributo) {
        String dimensionName = comboBoxDimensiones1[1].get(dimension);
        String atributoName = comboBoxAtributos1[1].get(atributo);
        return controladorConsumos.getValores(dimensionName, atributoName);
    }

    public BarChart reporteBiDimensionalBarra(int dimensionA, int atributoA, String valorA, int dimensionB, int atributoB, String valorB) {
        String dimensionNameA = comboBoxDimensionesA[1].get(dimensionA);
        String atributoNameA = comboBoxAtributosA[1].get(atributoA);
        String dimensionNameB = comboBoxDimensionesB[1].get(dimensionB);
        String atributoNameB = comboBoxAtributosB[1].get(atributoB);

        String[][] matrizCausas = controladorConsumos.reporteBidimensional(dimensionNameA, atributoNameA, valorA, dimensionNameB, atributoNameB, valorB);

        String title = "Consumos " + " por " + comboBoxAtributosA[0].get(atributoA);

        if (!valorA.equalsIgnoreCase("todos")) {
            title = title + " = [" + valorA + "] ";
        }

        title = title + " de "+comboBoxDimensionesA[0].get(dimensionA)+" por " + comboBoxAtributosB[0].get(atributoB);

        if (!valorB.equalsIgnoreCase("todos")) {
            title = title + " = [" + valorB + "] ";
        }
        
        title = title + " de "+comboBoxDimensionesB[0].get(dimensionB);

        BarChart barChart = new BarChart(title, matrizCausas, "Consumos");
        return barChart;
    }

    public MultiplePieChart reporteBiDimensionalPie(int dimensionA, int atributoA, String valorA, int dimensionB, int atributoB, String valorB) {
        String dimensionNameA = comboBoxDimensionesA[1].get(dimensionA);
        String atributoNameA = comboBoxAtributosA[1].get(atributoA);
        String dimensionNameB = comboBoxDimensionesB[1].get(dimensionB);
        String atributoNameB = comboBoxAtributosB[1].get(atributoB);

        String[][] matrizCausas = controladorConsumos.reporteBidimensional(dimensionNameA, atributoNameA, valorA, dimensionNameB, atributoNameB, valorB);

        String title = "Consumos " + " por " + comboBoxAtributosA[0].get(atributoA);

        if (!valorA.equalsIgnoreCase("todos")) {
            title = title + " = [" + valorA + "] ";
        }

        title = title + " de "+comboBoxDimensionesA[0].get(dimensionA)+" por " + comboBoxAtributosB[0].get(atributoB);

        if (!valorB.equalsIgnoreCase("todos")) {
            title = title + " = [" + valorB + "] ";
        }
        
        title = title + " de "+comboBoxDimensionesB[0].get(dimensionB);

        MultiplePieChart multiplePieChart = new MultiplePieChart(title, matrizCausas, "Consumos");
        return multiplePieChart;
    }

    public Object[] getDataComboBoxValoresA(int dimension, int atributo) {
        String dimensionName = comboBoxDimensionesA[1].get(dimension);
        String atributoName = comboBoxAtributosA[1].get(atributo);
        return controladorConsumos.getValores(dimensionName, atributoName);
    }

    public Object[] getDataComboBoxValoresB(int dimension, int atributo) {
        String dimensionName = comboBoxDimensionesB[1].get(dimension);
        String atributoName = comboBoxAtributosB[1].get(atributo);
        return controladorConsumos.getValores(dimensionName, atributoName);
    }
}
