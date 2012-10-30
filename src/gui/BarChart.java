package gui;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart {

    private ChartPanel chartPanel;
    private String charTitle;
    private String domainAxisLabel;
    private String rangeAxisLabel;
    private boolean includeLegen;
    private String[][] dataSet;

    public BarChart(String charTitle, String domainAxisLabel, String rangeAxisLabel, boolean includeLegen, String[][] dataSet) {
        this.charTitle = charTitle;
        this.domainAxisLabel = domainAxisLabel;
        this.rangeAxisLabel = rangeAxisLabel;
        this.includeLegen = includeLegen;
        this.dataSet = dataSet;
    }

    public BarChart(String charTitle, String[][] dataSet) {
        this.charTitle = charTitle;
        this.dataSet = dataSet;
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

        JFreeChart chart = ChartFactory.createBarChart(
                charTitle,
                domainAxisLabel,
                rangeAxisLabel,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

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
