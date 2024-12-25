package p351ub;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import p012ab.C0152l;
import p069e0.C4568g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ub/d.class
 */
/* renamed from: ub.d */
/* loaded from: combined.jar:classes2.jar:ub/d.class */
public class C9149d {

    /* renamed from: a */
    public final ColorStateList f41837a;

    /* renamed from: b */
    public final ColorStateList f41838b;

    /* renamed from: c */
    public final ColorStateList f41839c;

    /* renamed from: d */
    public final ColorStateList f41840d;

    /* renamed from: e */
    public final String f41841e;

    /* renamed from: f */
    public final int f41842f;

    /* renamed from: g */
    public final int f41843g;

    /* renamed from: h */
    public final boolean f41844h;

    /* renamed from: i */
    public final float f41845i;

    /* renamed from: j */
    public final float f41846j;

    /* renamed from: k */
    public final float f41847k;

    /* renamed from: l */
    public final boolean f41848l;

    /* renamed from: m */
    public final float f41849m;

    /* renamed from: n */
    public float f41850n;

    /* renamed from: o */
    public final int f41851o;

    /* renamed from: p */
    public boolean f41852p = false;

    /* renamed from: q */
    public Typeface f41853q;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ub/d$a.class
     */
    /* renamed from: ub.d$a */
    /* loaded from: combined.jar:classes2.jar:ub/d$a.class */
    public class a extends C4568g.c {

        /* renamed from: a */
        public final AbstractC9151f f41854a;

        /* renamed from: b */
        public final C9149d f41855b;

        public a(C9149d c9149d, AbstractC9151f abstractC9151f) {
            this.f41855b = c9149d;
            this.f41854a = abstractC9151f;
        }

        @Override // p069e0.C4568g.c
        /* renamed from: d */
        public void mo1356d(int i10) {
            this.f41855b.f41852p = true;
            this.f41854a.mo13465a(i10);
        }

        @Override // p069e0.C4568g.c
        /* renamed from: e */
        public void mo1357e(Typeface typeface) {
            C9149d c9149d = this.f41855b;
            c9149d.f41853q = Typeface.create(typeface, c9149d.f41842f);
            this.f41855b.f41852p = true;
            this.f41854a.mo13466b(this.f41855b.f41853q, false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ub/d$b.class
     */
    /* renamed from: ub.d$b */
    /* loaded from: combined.jar:classes2.jar:ub/d$b.class */
    public class b extends AbstractC9151f {

        /* renamed from: a */
        public final TextPaint f41856a;

        /* renamed from: b */
        public final AbstractC9151f f41857b;

        /* renamed from: c */
        public final C9149d f41858c;

        public b(C9149d c9149d, TextPaint textPaint, AbstractC9151f abstractC9151f) {
            this.f41858c = c9149d;
            this.f41856a = textPaint;
            this.f41857b = abstractC9151f;
        }

        @Override // p351ub.AbstractC9151f
        /* renamed from: a */
        public void mo13465a(int i10) {
            this.f41857b.mo13465a(i10);
        }

        @Override // p351ub.AbstractC9151f
        /* renamed from: b */
        public void mo13466b(Typeface typeface, boolean z10) {
            this.f41858c.m38495l(this.f41856a, typeface);
            this.f41857b.mo13466b(typeface, z10);
        }
    }

    public C9149d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, C0152l.f1115i5);
        this.f41850n = obtainStyledAttributes.getDimension(C0152l.f1123j5, 0.0f);
        this.f41837a = C9148c.m38476a(context, obtainStyledAttributes, C0152l.f1147m5);
        this.f41838b = C9148c.m38476a(context, obtainStyledAttributes, C0152l.f1155n5);
        this.f41839c = C9148c.m38476a(context, obtainStyledAttributes, C0152l.f1163o5);
        this.f41842f = obtainStyledAttributes.getInt(C0152l.f1139l5, 0);
        this.f41843g = obtainStyledAttributes.getInt(C0152l.f1131k5, 1);
        int m38480e = C9148c.m38480e(obtainStyledAttributes, C0152l.f1211u5, C0152l.f1203t5);
        this.f41851o = obtainStyledAttributes.getResourceId(m38480e, 0);
        this.f41841e = obtainStyledAttributes.getString(m38480e);
        this.f41844h = obtainStyledAttributes.getBoolean(C0152l.f1219v5, false);
        this.f41840d = C9148c.m38476a(context, obtainStyledAttributes, C0152l.f1171p5);
        this.f41845i = obtainStyledAttributes.getFloat(C0152l.f1179q5, 0.0f);
        this.f41846j = obtainStyledAttributes.getFloat(C0152l.f1187r5, 0.0f);
        this.f41847k = obtainStyledAttributes.getFloat(C0152l.f1195s5, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, C0152l.f1201t3);
        int i11 = C0152l.f1209u3;
        this.f41848l = obtainStyledAttributes2.hasValue(i11);
        this.f41849m = obtainStyledAttributes2.getFloat(i11, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    public final void m38487d() {
        String str;
        if (this.f41853q == null && (str = this.f41841e) != null) {
            this.f41853q = Typeface.create(str, this.f41842f);
        }
        if (this.f41853q == null) {
            int i10 = this.f41843g;
            this.f41853q = i10 != 1 ? i10 != 2 ? i10 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f41853q = Typeface.create(this.f41853q, this.f41842f);
        }
    }

    /* renamed from: e */
    public Typeface m38488e() {
        m38487d();
        return this.f41853q;
    }

    /* renamed from: f */
    public Typeface m38489f(Context context) {
        if (this.f41852p) {
            return this.f41853q;
        }
        if (!context.isRestricted()) {
            try {
                try {
                    Typeface m23054e = C4568g.m23054e(context, this.f41851o);
                    this.f41853q = m23054e;
                    if (m23054e != null) {
                        this.f41853q = Typeface.create(m23054e, this.f41842f);
                    }
                } catch (Exception e10) {
                    Log.d("TextAppearance", "Error loading font " + this.f41841e, e10);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException e11) {
            }
        }
        m38487d();
        this.f41852p = true;
        return this.f41853q;
    }

    /* renamed from: g */
    public void m38490g(Context context, TextPaint textPaint, AbstractC9151f abstractC9151f) {
        m38495l(textPaint, m38488e());
        m38491h(context, new b(this, textPaint, abstractC9151f));
    }

    /* renamed from: h */
    public void m38491h(Context context, AbstractC9151f abstractC9151f) {
        if (m38492i(context)) {
            m38489f(context);
        } else {
            m38487d();
        }
        int i10 = this.f41851o;
        if (i10 == 0) {
            this.f41852p = true;
        }
        if (this.f41852p) {
            abstractC9151f.mo13466b(this.f41853q, true);
            return;
        }
        try {
            C4568g.m23056g(context, i10, new a(this, abstractC9151f), null);
        } catch (Resources.NotFoundException e10) {
            this.f41852p = true;
            abstractC9151f.mo13465a(1);
        } catch (Exception e11) {
            Log.d("TextAppearance", "Error loading font " + this.f41841e, e11);
            this.f41852p = true;
            abstractC9151f.mo13465a(-3);
        }
    }

    /* renamed from: i */
    public final boolean m38492i(Context context) {
        return C9150e.m38496a();
    }

    /* renamed from: j */
    public void m38493j(Context context, TextPaint textPaint, AbstractC9151f abstractC9151f) {
        m38494k(context, textPaint, abstractC9151f);
        ColorStateList colorStateList = this.f41837a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f41847k;
        float f11 = this.f41845i;
        float f12 = this.f41846j;
        ColorStateList colorStateList2 = this.f41840d;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: k */
    public void m38494k(Context context, TextPaint textPaint, AbstractC9151f abstractC9151f) {
        if (m38492i(context)) {
            m38495l(textPaint, m38489f(context));
        } else {
            m38490g(context, textPaint, abstractC9151f);
        }
    }

    /* renamed from: l */
    public void m38495l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f41842f;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f41850n);
        if (this.f41848l) {
            textPaint.setLetterSpacing(this.f41849m);
        }
    }
}
