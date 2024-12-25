package p142i4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import p005a4.InterfaceC0065b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/r.class
 */
/* renamed from: i4.r */
/* loaded from: combined.jar:classes1.jar:i4/r.class */
public final class C5187r {
    /* renamed from: a */
    public static Bitmap m25872a(Bitmap bitmap, Bitmap bitmap2, int i10, int i11) {
        float width;
        float height;
        if (bitmap2 == null) {
            return null;
        }
        if (bitmap2.getWidth() == i10 && bitmap2.getHeight() == i11) {
            return bitmap2;
        }
        Matrix matrix = new Matrix();
        float f10 = 0.0f;
        if (bitmap2.getWidth() * i11 > bitmap2.getHeight() * i10) {
            width = i11 / bitmap2.getHeight();
            f10 = (i10 - (bitmap2.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap2.getWidth();
            height = (i11 - (bitmap2.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f10 + 0.5f), (int) (height + 0.5f));
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i10, i11, m25875d(bitmap2));
        }
        m25878g(bitmap2, bitmap);
        new Canvas(bitmap).drawBitmap(bitmap2, matrix, new Paint(6));
        return bitmap;
    }

    /* renamed from: b */
    public static Bitmap m25873b(Bitmap bitmap, InterfaceC0065b interfaceC0065b, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int width = (int) (bitmap.getWidth() * min);
        int height = (int) (bitmap.getHeight() * min);
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap.Config m25875d = m25875d(bitmap);
        Bitmap mo234d = interfaceC0065b.mo234d(width, height, m25875d);
        Bitmap bitmap2 = mo234d;
        if (mo234d == null) {
            bitmap2 = Bitmap.createBitmap(width, height, m25875d);
        }
        m25878g(bitmap, bitmap2);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i10 + "x" + i11);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmap2.getWidth() + "x" + bitmap2.getHeight());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("minPct:   ");
            sb2.append(min);
            Log.v("TransformationUtils", sb2.toString());
        }
        Canvas canvas = new Canvas(bitmap2);
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        canvas.drawBitmap(bitmap, matrix, new Paint(6));
        return bitmap2;
    }

    /* renamed from: c */
    public static int m25874c(int i10) {
        int i11;
        switch (i10) {
            case 3:
            case 4:
                i11 = 180;
                break;
            case 5:
            case 6:
                i11 = 90;
                break;
            case 7:
            case 8:
                i11 = 270;
                break;
            default:
                i11 = 0;
                break;
        }
        return i11;
    }

    /* renamed from: d */
    public static Bitmap.Config m25875d(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: e */
    public static void m25876e(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
        matrix.postScale(-1.0f, 1.0f);
    }

    /* renamed from: f */
    public static Bitmap m25877f(Bitmap bitmap, InterfaceC0065b interfaceC0065b, int i10) {
        Matrix matrix = new Matrix();
        m25876e(i10, matrix);
        if (matrix.isIdentity()) {
            return bitmap;
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        Bitmap.Config m25875d = m25875d(bitmap);
        Bitmap mo234d = interfaceC0065b.mo234d(round, round2, m25875d);
        Bitmap bitmap2 = mo234d;
        if (mo234d == null) {
            bitmap2 = Bitmap.createBitmap(round, round2, m25875d);
        }
        matrix.postTranslate(-rectF.left, -rectF.top);
        new Canvas(bitmap2).drawBitmap(bitmap, matrix, new Paint(6));
        return bitmap2;
    }

    @TargetApi(12)
    /* renamed from: g */
    public static void m25878g(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            bitmap2.setHasAlpha(bitmap.hasAlpha());
        }
    }
}
