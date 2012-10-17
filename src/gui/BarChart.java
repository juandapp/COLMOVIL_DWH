/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author gustavo
 */
public class BarChart {

    private final DefaultCategoryDataset dataset;
    private final JFreeChart chart;
    private final ChartPanel chartPanel;

    public BarChart(String title, String[][] dataSet) {


        dataset = createDataset(dataSet);

        // based on the dataset we create the chart
        chart = createChart(dataset, title);

        // we put the chart into a panel
        chartPanel = new ChartPanel(chart);

    }

    private DefaultCategoryDataset createDataset(String[][] dataSet) {

        DefaultCategoryDataset result = new DefaultCategoryDataset();

        for (int i = 0; i < dataSet.length; i++) {
            result.addValue(Double.parseDouble(dataSet[i][0]), dataSet[i][1], dataSet[i][2]);
        }
        return result;

    }

    private JFreeChart createChart(DefaultCategoryDataset dataset, String title) {

        JFreeChart chart = ChartFactory.createBarChart(
                "Bar Chart Demo", // chart title
                "Estrato", // domain axis label
                "Causa Retiro", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips?
                false // URLs?
                );
        
        return chart;
    }

    public ChartPanel getChartPanel() {
        
        return chartPanel;
    }
}
