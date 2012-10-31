/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Font;
import java.text.DecimalFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
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
                false,
                true,
                false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.9f);
        
        chart.getTitle().setFont(new Font("Ubuntu", Font.BOLD, 20));
        PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator("{0} ({1}, {2})");
        plot.setLabelGenerator(generator);
        
        return chart;
    }

    public ChartPanel getChartPanel() {
        PieDataset dataset = createDataset(dataSet);
        JFreeChart chart = createChart(dataset);
        chartPanel = new ChartPanel(chart);
        return chartPanel;
    }

    public String getCharTitle() {
        return charTitle;
    }
    
    
}
