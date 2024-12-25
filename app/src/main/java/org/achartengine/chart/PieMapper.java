package org.achartengine.chart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/PieMapper.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/PieMapper.class */
public class PieMapper implements Serializable {
    private int mCenterX;
    private int mCenterY;
    private int mPieChartRadius;
    private List<PieSegment> mPieSegmentList = new ArrayList();

    public void addPieSegment(int i10, float f10, float f11, float f12) {
        this.mPieSegmentList.add(new PieSegment(i10, f10, f11, f12));
    }

    public boolean areAllSegmentPresent(int i10) {
        return this.mPieSegmentList.size() == i10;
    }

    public void clearPieSegments() {
        this.mPieSegmentList.clear();
    }

    public double getAngle(Point point) {
        double atan2 = Math.atan2(-(point.getY() - this.mCenterY), point.getX() - this.mCenterX);
        return Math.toDegrees(atan2 < 0.0d ? Math.abs(atan2) : 6.283185307179586d - atan2);
    }

    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        if (!isOnPieChart(point)) {
            return null;
        }
        double angle = getAngle(point);
        for (PieSegment pieSegment : this.mPieSegmentList) {
            if (pieSegment.isInSegment(angle)) {
                return new SeriesSelection(0, pieSegment.getDataIndex(), pieSegment.getValue(), pieSegment.getValue());
            }
        }
        return null;
    }

    public boolean isOnPieChart(Point point) {
        double pow = Math.pow(this.mCenterX - point.getX(), 2.0d);
        double pow2 = Math.pow(this.mCenterY - point.getY(), 2.0d);
        int i10 = this.mPieChartRadius;
        return pow + pow2 <= ((double) (i10 * i10));
    }

    public void setDimensions(int i10, int i11, int i12) {
        this.mPieChartRadius = i10;
        this.mCenterX = i11;
        this.mCenterY = i12;
    }
}
