package org.achartengine.chart;

import org.achartengine.chart.BarChart;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/RangeStackedBarChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/RangeStackedBarChart.class */
public class RangeStackedBarChart extends RangeBarChart {
    public static final String TYPE = "RangeStackedBar";

    public RangeStackedBarChart() {
        super(BarChart.Type.STACKED);
    }

    @Override // org.achartengine.chart.RangeBarChart, org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }
}
