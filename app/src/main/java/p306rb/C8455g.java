package p306rb;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/g.class
 */
/* renamed from: rb.g */
/* loaded from: combined.jar:classes2.jar:rb/g.class */
public final class C8455g {

    /* renamed from: k */
    public static boolean f39522k;

    /* renamed from: l */
    public static Constructor<StaticLayout> f39523l;

    /* renamed from: m */
    public static Object f39524m;

    /* renamed from: a */
    public CharSequence f39525a;

    /* renamed from: b */
    public final TextPaint f39526b;

    /* renamed from: c */
    public final int f39527c;

    /* renamed from: e */
    public int f39529e;

    /* renamed from: i */
    public boolean f39533i;

    /* renamed from: d */
    public int f39528d = 0;

    /* renamed from: f */
    public Layout.Alignment f39530f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    public int f39531g = Integer.MAX_VALUE;

    /* renamed from: h */
    public boolean f39532h = true;

    /* renamed from: j */
    public TextUtils.TruncateAt f39534j = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/g$a.class
     */
    /* renamed from: rb.g$a */
    /* loaded from: combined.jar:classes2.jar:rb/g$a.class */
    public static class a extends Exception {
        public a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    public C8455g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f39525a = charSequence;
        this.f39526b = textPaint;
        this.f39527c = i10;
        this.f39529e = charSequence.length();
    }

    /* renamed from: c */
    public static C8455g m36313c(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new C8455g(charSequence, textPaint, i10);
    }

    /* renamed from: a */
    public StaticLayout m36314a() {
        if (this.f39525a == null) {
            this.f39525a = "";
        }
        int max = Math.max(0, this.f39527c);
        CharSequence charSequence = this.f39525a;
        CharSequence charSequence2 = charSequence;
        if (this.f39531g == 1) {
            charSequence2 = TextUtils.ellipsize(charSequence, this.f39526b, max, this.f39534j);
        }
        int min = Math.min(charSequence2.length(), this.f39529e);
        this.f39529e = min;
        if (Build.VERSION.SDK_INT < 23) {
            m36315b();
            try {
                return (StaticLayout) ((Constructor) C6616h.m30527e(f39523l)).newInstance(charSequence2, Integer.valueOf(this.f39528d), Integer.valueOf(this.f39529e), this.f39526b, Integer.valueOf(max), this.f39530f, C6616h.m30527e(f39524m), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f39532h), null, Integer.valueOf(max), Integer.valueOf(this.f39531g));
            } catch (Exception e10) {
                throw new a(e10);
            }
        }
        if (this.f39533i) {
            this.f39530f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence2, this.f39528d, min, this.f39526b, max);
        obtain.setAlignment(this.f39530f);
        obtain.setIncludePad(this.f39532h);
        obtain.setTextDirection(this.f39533i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f39534j;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f39531g);
        return obtain.build();
    }

    /* renamed from: b */
    public final void m36315b() {
        if (f39522k) {
            return;
        }
        try {
            f39524m = this.f39533i && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f39523l = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f39522k = true;
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    /* renamed from: d */
    public C8455g m36316d(Layout.Alignment alignment) {
        this.f39530f = alignment;
        return this;
    }

    /* renamed from: e */
    public C8455g m36317e(TextUtils.TruncateAt truncateAt) {
        this.f39534j = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C8455g m36318f(boolean z10) {
        this.f39532h = z10;
        return this;
    }

    /* renamed from: g */
    public C8455g m36319g(boolean z10) {
        this.f39533i = z10;
        return this;
    }

    /* renamed from: h */
    public C8455g m36320h(int i10) {
        this.f39531g = i10;
        return this;
    }
}
