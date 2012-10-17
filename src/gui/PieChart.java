/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author gustavo
 */
public class PieChart {

    private ChartPanel chartPanel;
    private String charTitle;
    private String[][] dataSet;

    public PieChart(String charTitle, String[][] dataSet) {
        this.charTitle = charTitle;
        this.dataSet = dataSet;
    }

    
//    public PieChart(String title, String[][] dataSet) {
//
//
//        dataset = createDataset(dataSet);
//
//        // based on the dataset we create the chart
//        chart = createChart(dataset, title);
//
//        // we put the chart into a panel
//        chartPanel = new ChartPanel(chart);
//
//    }

    private PieDataset createDataset(String[][] dataSet) {
        DefaultPieDataset result = new DefaultPieDataset();
        for (int i = 0; i < dataSet.length; i++) {
            result.setValue(dataSet[i][0], Integer.parseInt(dataSet[i][1]));
        }
        return result;

    }

    private JFreeChart createChart(PieDataset dataset) {

        JFreeChart chart = ChartFactory.createPieChart3D(charTitle,
                dataset,
                true,
                true,
                false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.9f);
        return chart;
    }

    public ChartPanel getChartPanel() {
        PieDataset dataset = createDataset(dataSet);
        JFreeChart chart = createChart(dataset);
        chartPanel = new ChartPanel(chart);
        return chartPanel;
    }
}
