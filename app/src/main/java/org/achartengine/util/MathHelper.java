package org.achartengine.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/util/MathHelper.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/util/MathHelper.class */
public class MathHelper {
    private static final NumberFormat FORMAT = NumberFormat.getNumberInstance();
    public static final double NULL_VALUE = Double.MAX_VALUE;

    private MathHelper() {
    }

    private static double[] computeLabels(double d10, double d11, int i10) {
        boolean z10;
        double d12;
        if (Math.abs(d10 - d11) < 1.0000000116860974E-7d) {
            return new double[]{d10, d10, 0.0d};
        }
        if (d10 > d11) {
            z10 = true;
            d12 = d11;
        } else {
            z10 = false;
            d12 = d10;
            d10 = d11;
        }
        double roundUp = roundUp(Math.abs(d12 - d10) / i10);
        double ceil = Math.ceil(d12 / roundUp) * roundUp;
        double floor = Math.floor(d10 / roundUp) * roundUp;
        double[] dArr = new double[3];
        if (z10) {
            dArr[0] = floor;
            dArr[1] = ceil;
            dArr[2] = roundUp * (-1.0d);
            return dArr;
        }
        dArr[0] = ceil;
        dArr[1] = floor;
        dArr[2] = roundUp;
        return dArr;
    }

    public static List<Double> getLabels(double d10, double d11, int i10) {
        ArrayList arrayList = new ArrayList();
        if (i10 <= 0) {
            return arrayList;
        }
        FORMAT.setMaximumFractionDigits(5);
        double[] computeLabels = computeLabels(d10, d11, i10);
        int i11 = (int) ((computeLabels[1] - computeLabels[0]) / computeLabels[2]);
        for (int i12 = 0; i12 < i11 + 1; i12++) {
            double d12 = computeLabels[0] + (i12 * computeLabels[2]);
            try {
                NumberFormat numberFormat = FORMAT;
                d12 = numberFormat.parse(numberFormat.format(d12)).doubleValue();
            } catch (ParseException e10) {
            }
            arrayList.add(Double.valueOf(d12));
        }
        return arrayList;
    }

    public static double[] minmax(List<Double> list) {
        if (list.size() == 0) {
            return new double[2];
        }
        double doubleValue = list.get(0).doubleValue();
        int size = list.size();
        double d10 = doubleValue;
        for (int i10 = 1; i10 < size; i10++) {
            double doubleValue2 = list.get(i10).doubleValue();
            doubleValue = Math.min(doubleValue, doubleValue2);
            d10 = Math.max(d10, doubleValue2);
        }
        return new double[]{doubleValue, d10};
    }

    private static double roundUp(double d10) {
        double d11;
        int floor = (int) Math.floor(Math.log10(d10));
        double pow = d10 * Math.pow(10.0d, -floor);
        if (pow > 5.0d) {
            d11 = 10.0d;
        } else if (pow > 2.0d) {
            d11 = 5.0d;
        } else {
            d11 = pow;
            if (pow > 1.0d) {
                d11 = 2.0d;
            }
        }
        return d11 * Math.pow(10.0d, floor);
    }
}
