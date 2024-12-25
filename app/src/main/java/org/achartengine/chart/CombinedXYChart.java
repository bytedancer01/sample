package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.Serializable;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/CombinedXYChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/CombinedXYChart.class */
public class CombinedXYChart extends XYChart {
    private XYCombinedChartDef[] chartDefinitions;
    private XYChart[] mCharts;
    private Class<?>[] xyChartTypes;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/achartengine/chart/CombinedXYChart$XYCombinedChartDef.class
     */
    /* loaded from: combined.jar:classes2.jar:org/achartengine/chart/CombinedXYChart$XYCombinedChartDef.class */
    public static class XYCombinedChartDef implements Serializable {
        private int[] seriesIndex;
        private String type;

        public XYCombinedChartDef(String str, int... iArr) {
            this.type = str;
            this.seriesIndex = iArr;
        }

        public boolean containsSeries(int i10) {
            return getChartSeriesIndex(i10) >= 0;
        }

        public int getChartSeriesIndex(int i10) {
            for (int i11 = 0; i11 < getSeriesIndex().length; i11++) {
                if (this.seriesIndex[i11] == i10) {
                    return i11;
                }
            }
            return -1;
        }

        public int[] getSeriesIndex() {
            return this.seriesIndex;
        }

        public String getType() {
            return this.type;
        }
    }

    public CombinedXYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, XYCombinedChartDef[] xYCombinedChartDefArr) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.xyChartTypes = new Class[]{TimeChart.class, LineChart.class, CubicLineChart.class, BarChart.class, BubbleChart.class, ScatterChart.class, RangeBarChart.class, RangeStackedBarChart.class};
        this.chartDefinitions = xYCombinedChartDefArr;
        int length = xYCombinedChartDefArr.length;
        this.mCharts = new XYChart[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                this.mCharts[i10] = getXYChart(xYCombinedChartDefArr[i10].getType());
            } catch (Exception e10) {
            }
            if (this.mCharts[i10] == null) {
                throw new IllegalArgumentException("Unknown chart type " + xYCombinedChartDefArr[i10].getType());
            }
            XYMultipleSeriesDataset xYMultipleSeriesDataset2 = new XYMultipleSeriesDataset();
            XYMultipleSeriesRenderer xYMultipleSeriesRenderer2 = new XYMultipleSeriesRenderer();
            for (int i11 : xYCombinedChartDefArr[i10].getSeriesIndex()) {
                xYMultipleSeriesDataset2.addSeries(xYMultipleSeriesDataset.getSeriesAt(i11));
                xYMultipleSeriesRenderer2.addSeriesRenderer(xYMultipleSeriesRenderer.getSeriesRendererAt(i11));
            }
            xYMultipleSeriesRenderer2.setBarSpacing(xYMultipleSeriesRenderer.getBarSpacing());
            xYMultipleSeriesRenderer2.setPointSize(xYMultipleSeriesRenderer.getPointSize());
            this.mCharts[i10].setDatasetRenderer(xYMultipleSeriesDataset2, xYMultipleSeriesRenderer2);
        }
    }

    public CombinedXYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, XYCombinedChartDef[] xYCombinedChartDefArr, XYChart[] xYChartArr) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.xyChartTypes = new Class[]{TimeChart.class, LineChart.class, CubicLineChart.class, BarChart.class, BubbleChart.class, ScatterChart.class, RangeBarChart.class, RangeStackedBarChart.class};
        this.chartDefinitions = xYCombinedChartDefArr;
        this.mCharts = xYChartArr;
    }

    private int getChartSeriesIndex(int i10) {
        int i11 = 0;
        while (true) {
            XYCombinedChartDef[] xYCombinedChartDefArr = this.chartDefinitions;
            if (i11 >= xYCombinedChartDefArr.length) {
                throw new IllegalArgumentException("Unknown series with index " + i10);
            }
            if (xYCombinedChartDefArr[i11].containsSeries(i10)) {
                return this.chartDefinitions[i11].getChartSeriesIndex(i10);
            }
            i11++;
        }
    }

    private XYChart getXYChart(int i10) {
        int i11 = 0;
        while (true) {
            XYCombinedChartDef[] xYCombinedChartDefArr = this.chartDefinitions;
            if (i11 >= xYCombinedChartDefArr.length) {
                throw new IllegalArgumentException("Unknown series with index " + i10);
            }
            if (xYCombinedChartDefArr[i11].containsSeries(i10)) {
                return this.mCharts[i11];
            }
            i11++;
        }
    }

    private XYChart getXYChart(String str) {
        int length = this.xyChartTypes.length;
        XYChart xYChart = null;
        for (int i10 = 0; i10 < length && xYChart == null; i10++) {
            XYChart xYChart2 = (XYChart) this.xyChartTypes[i10].newInstance();
            if (str.equals(xYChart2.getChartType())) {
                xYChart = xYChart2;
            }
        }
        return xYChart;
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f10, int i10, int i11) {
        return getXYChart(i10).clickableAreasForPoints(list, list2, f10, getChartSeriesIndex(i10), i11);
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        getXYChart(i10).drawLegendShape(canvas, simpleSeriesRenderer, f10, f11, getChartSeriesIndex(i10), paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, int i11) {
        XYChart xYChart = getXYChart(i10);
        xYChart.setScreenR(getScreenR());
        xYChart.setCalcRange(getCalcRange(this.mDataset.getSeriesAt(i10).getScaleNumber()), 0);
        xYChart.drawSeries(canvas, paint, list, xYSeriesRenderer, f10, getChartSeriesIndex(i10), i11);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(XYSeries xYSeries, Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, XYMultipleSeriesRenderer.Orientation orientation, int i11) {
        XYChart xYChart = getXYChart(i10);
        xYChart.setScreenR(getScreenR());
        xYChart.setCalcRange(getCalcRange(this.mDataset.getSeriesAt(i10).getScaleNumber()), 0);
        xYChart.drawSeries(xYSeries, canvas, paint, list, xYSeriesRenderer, f10, getChartSeriesIndex(i10), orientation, i11);
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return "Combined";
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i10) {
        return getXYChart(i10).getLegendShapeWidth(getChartSeriesIndex(i10));
    }
}
