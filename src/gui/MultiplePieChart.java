package gui;

import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.util.Rotation;
import org.jfree.util.TableOrder;

public class MultiplePieChart {

    private ChartPanel chartPanel;
    private String charTitle;
    private String domainAxisLabel;
    private String rangeAxisLabel;
    private boolean includeLegen;
    private String[][] dataSet;

    public MultiplePieChart(String charTitle, String domainAxisLabel, String rangeAxisLabel, boolean includeLegen, String[][] dataSet) {
        this.charTitle = charTitle;
        this.domainAxisLabel = domainAxisLabel;
        this.rangeAxisLabel = rangeAxisLabel;
        this.includeLegen = includeLegen;
        this.dataSet = dataSet;
    }

    public MultiplePieChart(String charTitle, String[][] dataSet, String rangeAxisLabel) {
        this.charTitle = charTitle;
        this.dataSet = dataSet;
        this.rangeAxisLabel=rangeAxisLabel;
    }

    public void setDomainAxisLabel(String domainAxisLabel) {
        this.domainAxisLabel = domainAxisLabel;
    }

    public void setRangeAxisLabel(String rangeAxisLabel) {
        this.rangeAxisLabel = rangeAxisLabel;
    }

    public void setIncludeLegen(boolean includeLegen) {
        this.includeLegen = includeLegen;
    }

    private DefaultCategoryDataset createDataset(String[][] dataSet) {

        DefaultCategoryDataset result = new DefaultCategoryDataset();
        for (int i = 0; i < dataSet.length; i++) {
            result.addValue(Double.parseDouble(dataSet[i][0]), dataSet[i][1], dataSet[i][2]);
        }
        return result;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart chart = ChartFactory.createMultiplePieChart3D(
                charTitle,
                dataset,
                TableOrder.BY_COLUMN,
                false,
                true,
                false);

        //Cambiar la orientacion de los labels!!
        chart.getTitle().setFont(new Font("Ubuntu", Font.BOLD, 20));
        
        MultiplePiePlot multiplePlot = (MultiplePiePlot) chart.getPlot();
        PiePlot3D plot = (PiePlot3D) multiplePlot.getPieChart().getPlot();
        PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator("{0} ({2})");
        plot.setLabelGenerator(generator);
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.9f);
        return chart;
    }

    public ChartPanel getChartPanel() {
        DefaultCategoryDataset dataset = createDataset(dataSet);
        JFreeChart chart = createChart(dataset);
        chartPanel = new ChartPanel(chart);
        return chartPanel;
    }

    public String getCharTitle() {
        return charTitle;
    }
    
    
}
