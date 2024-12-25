package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.achartengine.renderer.DefaultRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/core/graphics/drawable/IconCompat.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/core/graphics/drawable/IconCompat.class */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f2658k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f2659a;

    /* renamed from: b */
    public Object f2660b;

    /* renamed from: c */
    public byte[] f2661c;

    /* renamed from: d */
    public Parcelable f2662d;

    /* renamed from: e */
    public int f2663e;

    /* renamed from: f */
    public int f2664f;

    /* renamed from: g */
    public ColorStateList f2665g;

    /* renamed from: h */
    public PorterDuff.Mode f2666h;

    /* renamed from: i */
    public String f2667i;

    /* renamed from: j */
    public String f2668j;

    public IconCompat() {
        this.f2659a = -1;
        this.f2661c = null;
        this.f2662d = null;
        this.f2663e = 0;
        this.f2664f = 0;
        this.f2665g = null;
        this.f2666h = f2658k;
        this.f2667i = null;
    }

    public IconCompat(int i10) {
        this.f2661c = null;
        this.f2662d = null;
        this.f2663e = 0;
        this.f2664f = 0;
        this.f2665g = null;
        this.f2666h = f2658k;
        this.f2667i = null;
        this.f2659a = i10;
    }

    /* renamed from: b */
    public static Bitmap m1880b(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(DefaultRenderer.BACKGROUND_COLOR);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: c */
    public static IconCompat m1881c(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2660b = bitmap;
        return iconCompat;
    }

    /* renamed from: d */
    public static IconCompat m1882d(Resources resources, String str, int i10) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2663e = i10;
        if (resources != null) {
            try {
                iconCompat.f2660b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException e10) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f2660b = str;
        }
        iconCompat.f2668j = str;
        return iconCompat;
    }

    /* renamed from: g */
    public static int m1883g(Icon icon) {
        int resId;
        if (Build.VERSION.SDK_INT >= 28) {
            resId = icon.getResId();
            return resId;
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    /* renamed from: i */
    public static String m1884i(Icon icon) {
        String resPackage;
        if (Build.VERSION.SDK_INT >= 28) {
            resPackage = icon.getResPackage();
            return resPackage;
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    /* renamed from: k */
    public static int m1885k(Icon icon) {
        StringBuilder sb2;
        int type;
        if (Build.VERSION.SDK_INT >= 28) {
            type = icon.getType();
            return type;
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            e = e10;
            sb2 = new StringBuilder();
            sb2.append("Unable to get icon type ");
            sb2.append(icon);
            Log.e("IconCompat", sb2.toString(), e);
            return -1;
        } catch (NoSuchMethodException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("Unable to get icon type ");
            sb2.append(icon);
            Log.e("IconCompat", sb2.toString(), e);
            return -1;
        } catch (InvocationTargetException e12) {
            e = e12;
            sb2 = new StringBuilder();
            sb2.append("Unable to get icon type ");
            sb2.append(icon);
            Log.e("IconCompat", sb2.toString(), e);
            return -1;
        }
    }

    /* renamed from: m */
    public static Uri m1886m(Icon icon) {
        Uri uri;
        if (Build.VERSION.SDK_INT >= 28) {
            uri = icon.getUri();
            return uri;
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    /* renamed from: s */
    public static String m1887s(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: e */
    public Bitmap m1888e() {
        int i10 = this.f2659a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f2660b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f2660b;
        }
        if (i10 == 5) {
            return m1880b((Bitmap) this.f2660b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* renamed from: f */
    public int m1889f() {
        int i10 = this.f2659a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1883g((Icon) this.f2660b);
        }
        if (i10 == 2) {
            return this.f2663e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: h */
    public String m1890h() {
        int i10 = this.f2659a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1884i((Icon) this.f2660b);
        }
        if (i10 == 2) {
            return TextUtils.isEmpty(this.f2668j) ? ((String) this.f2660b).split(":", -1)[0] : this.f2668j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: j */
    public int m1891j() {
        int i10 = this.f2659a;
        int i11 = i10;
        if (i10 == -1) {
            i11 = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                i11 = m1885k((Icon) this.f2660b);
            }
        }
        return i11;
    }

    /* renamed from: l */
    public Uri m1892l() {
        int i10 = this.f2659a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1886m((Icon) this.f2660b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f2660b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: n */
    public InputStream m1893n(Context context) {
        StringBuilder sb2;
        String str;
        Uri m1892l = m1892l();
        String scheme = m1892l.getScheme();
        if ("content".equals(scheme) || TransferTable.COLUMN_FILE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(m1892l);
            } catch (Exception e10) {
                e = e10;
                sb2 = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2660b));
            } catch (FileNotFoundException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb2.append(str);
        sb2.append(m1892l);
        Log.w("IconCompat", sb2.toString(), e);
        return null;
    }

    /* renamed from: o */
    public void m1894o() {
        Parcelable parcelable;
        this.f2666h = PorterDuff.Mode.valueOf(this.f2667i);
        switch (this.f2659a) {
            case -1:
                parcelable = this.f2662d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f2662d;
                if (parcelable == null) {
                    byte[] bArr = this.f2661c;
                    this.f2660b = bArr;
                    this.f2659a = 3;
                    this.f2663e = 0;
                    this.f2664f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2661c, Charset.forName("UTF-16"));
                this.f2660b = str;
                if (this.f2659a == 2 && this.f2668j == null) {
                    this.f2668j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2660b = this.f2661c;
                return;
        }
        this.f2660b = parcelable;
    }

    /* renamed from: p */
    public void m1895p(boolean z10) {
        this.f2667i = this.f2666h.name();
        switch (this.f2659a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    Bitmap bitmap = (Bitmap) this.f2660b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2661c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f2661c = ((String) this.f2660b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2661c = (byte[]) this.f2660b;
                return;
            case 4:
            case 6:
                this.f2661c = this.f2660b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f2662d = (Parcelable) this.f2660b;
    }

    @Deprecated
    /* renamed from: q */
    public Icon m1896q() {
        return m1897r(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0143  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.drawable.Icon m1897r(android.content.Context r5) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.m1897r(android.content.Context):android.graphics.drawable.Icon");
    }

    public String toString() {
        int height;
        if (this.f2659a == -1) {
            return String.valueOf(this.f2660b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m1887s(this.f2659a));
        switch (this.f2659a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2660b).getWidth());
                sb2.append("x");
                height = ((Bitmap) this.f2660b).getHeight();
                sb2.append(height);
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2668j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m1889f())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2663e);
                if (this.f2664f != 0) {
                    sb2.append(" off=");
                    height = this.f2664f;
                    sb2.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2660b);
                break;
        }
        if (this.f2665g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2665g);
        }
        if (this.f2666h != f2658k) {
            sb2.append(" mode=");
            sb2.append(this.f2666h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
