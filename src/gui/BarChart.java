package gui;

import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

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

    public BarChart(String charTitle, String[][] dataSet, String rangeAxisLabel) {
        this.charTitle = charTitle;
        this.dataSet = dataSet;
        this.rangeAxisLabel = rangeAxisLabel;
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

        JFreeChart chart = ChartFactory.createBarChart3D(
                charTitle,
                domainAxisLabel,
                rangeAxisLabel,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        //Cambiar la orientacion de los labels!!
        chart.getCategoryPlot().getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        chart.getCategoryPlot().getRangeAxis().setLabelFont(new Font("Ubuntu", Font.BOLD, 14));
        chart.getLegend().setItemFont(new Font("Ubuntu", Font.PLAIN, 12));
        chart.getTitle().setFont(new Font("Ubuntu", Font.BOLD, 20));

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setItemMargin(0.05);

        renderer.setBaseItemLabelsVisible(true);
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseLegendTextFont(new Font("Ubuntu", Font.PLAIN, 12));

//        renderer.setSeriesItemLabelFont(0, new Font("Ubuntu", Font.BOLD, 10));
       

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
