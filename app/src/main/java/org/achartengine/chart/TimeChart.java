package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/TimeChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/TimeChart.class */
public class TimeChart extends LineChart {
    public static final long DAY = 86400000;
    public static final String TYPE = "Time";
    private String mDateFormat;
    private Double mStartPoint;

    public TimeChart() {
    }

    public TimeChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    private DateFormat getDateFormat(double d10, double d11) {
        if (this.mDateFormat != null) {
            try {
                return new SimpleDateFormat(this.mDateFormat);
            } catch (Exception e10) {
            }
        }
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        double d12 = d11 - d10;
        if (d12 > 8.64E7d && d12 < 4.32E8d) {
            dateInstance = DateFormat.getDateTimeInstance(3, 3);
        } else if (d12 < 8.64E7d) {
            dateInstance = DateFormat.getTimeInstance(2);
        }
        return dateInstance;
    }

    @Override // org.achartengine.chart.XYChart
    public void drawXLabels(List<Double> list, Double[] dArr, Canvas canvas, Paint paint, int i10, int i11, int i12, double d10, double d11, double d12) {
        int size = list.size();
        if (size > 0) {
            boolean isShowXLabels = this.mRenderer.isShowXLabels();
            boolean isShowGridY = this.mRenderer.isShowGridY();
            if (isShowGridY) {
                this.mGridPaint.setStyle(Paint.Style.STROKE);
                this.mGridPaint.setStrokeWidth(this.mRenderer.getGridLineWidth());
            }
            boolean isShowTickMarks = this.mRenderer.isShowTickMarks();
            DateFormat dateFormat = getDateFormat(list.get(0).doubleValue(), list.get(size - 1).doubleValue());
            for (int i13 = 0; i13 < size; i13++) {
                long round = Math.round(list.get(i13).doubleValue());
                float f10 = (float) (i10 + ((round - d11) * d10));
                if (isShowXLabels) {
                    paint.setColor(this.mRenderer.getXLabelsColor());
                    if (isShowTickMarks) {
                        float f11 = i12;
                        canvas.drawLine(f10, f11, f10, f11 + (this.mRenderer.getLabelsTextSize() / 3.0f), paint);
                    }
                    drawText(canvas, dateFormat.format(new Date(round)), f10, i12 + ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + this.mRenderer.getXLabelsPadding(), paint, this.mRenderer.getXLabelsAngle());
                }
                if (isShowGridY) {
                    this.mGridPaint.setColor(this.mRenderer.getGridColor(0));
                    canvas.drawLine(f10, i12, f10, i11, this.mGridPaint);
                }
            }
        }
        drawXTextLabels(dArr, canvas, paint, true, i10, i11, i12, d10, d11, d12);
    }

    @Override // org.achartengine.chart.LineChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    public String getDateFormat() {
        return this.mDateFormat;
    }

    @Override // org.achartengine.chart.XYChart
    public List<Double> getXLabels(double d10, double d11, int i10) {
        double d12;
        int i11;
        ArrayList arrayList = new ArrayList();
        if (this.mRenderer.isXRoundedLabels()) {
            if (this.mStartPoint == null) {
                this.mStartPoint = Double.valueOf((d10 - (d10 % 8.64E7d)) + 8.64E7d + (new Date(Math.round(d10)).getTimezoneOffset() * 60 * 1000));
            }
            int i12 = i10;
            if (i10 > 25) {
                i12 = 25;
            }
            double d13 = (d11 - d10) / i12;
            if (d13 <= 0.0d) {
                return arrayList;
            }
            double d14 = 8.64E7d;
            if (d13 > 8.64E7d) {
                while (true) {
                    d12 = d14;
                    if (d13 <= d14) {
                        break;
                    }
                    d14 *= 2.0d;
                }
            } else {
                double d15 = 8.64E7d;
                while (true) {
                    double d16 = d15;
                    double d17 = d16 / 2.0d;
                    d12 = d16;
                    if (d13 >= d17) {
                        break;
                    }
                    d15 = d17;
                }
            }
            double doubleValue = this.mStartPoint.doubleValue() - (Math.floor((this.mStartPoint.doubleValue() - d10) / d12) * d12);
            for (int i13 = 0; doubleValue < d11 && i13 <= i12; i13++) {
                arrayList.add(Double.valueOf(doubleValue));
                doubleValue += d12;
            }
            return arrayList;
        }
        if (this.mDataset.getSeriesCount() <= 0) {
            return super.getXLabels(d10, d11, i10);
        }
        XYSeries seriesAt = this.mDataset.getSeriesAt(0);
        int itemCount = seriesAt.getItemCount();
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = i16;
            if (i15 >= itemCount) {
                break;
            }
            double x10 = seriesAt.getX(i15);
            int i17 = i14;
            int i18 = i11;
            if (d10 <= x10) {
                i17 = i14;
                i18 = i11;
                if (x10 <= d11) {
                    int i19 = i11 + 1;
                    i17 = i14;
                    i18 = i19;
                    if (i14 < 0) {
                        i17 = i15;
                        i18 = i19;
                    }
                }
            }
            i15++;
            i14 = i17;
            i16 = i18;
        }
        if (i11 < i10) {
            for (int i20 = i14; i20 < i14 + i11; i20++) {
                arrayList.add(Double.valueOf(seriesAt.getX(i20)));
            }
        } else {
            float f10 = i11 / i10;
            int i21 = 0;
            int i22 = 0;
            while (i22 < itemCount && i21 < i10) {
                double x11 = seriesAt.getX(Math.round(i22 * f10));
                int i23 = i21;
                if (d10 <= x11) {
                    i23 = i21;
                    if (x11 <= d11) {
                        arrayList.add(Double.valueOf(x11));
                        i23 = i21 + 1;
                    }
                }
                i22++;
                i21 = i23;
            }
        }
        return arrayList;
    }

    public void setDateFormat(String str) {
        this.mDateFormat = str;
    }
}
