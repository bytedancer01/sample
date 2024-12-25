package p195l4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import p005a4.InterfaceC0065b;
import p160j4.AbstractC5293b;
import p195l4.C5676f;
import p362v3.C9231a;
import p362v3.C9233c;
import p396x3.InterfaceC9650g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l4/b.class
 */
/* renamed from: l4.b */
/* loaded from: combined.jar:classes1.jar:l4/b.class */
public class C5672b extends AbstractC5293b implements C5676f.c {

    /* renamed from: b */
    public final Paint f31962b;

    /* renamed from: c */
    public final Rect f31963c;

    /* renamed from: d */
    public final a f31964d;

    /* renamed from: e */
    public final C9231a f31965e;

    /* renamed from: f */
    public final C5676f f31966f;

    /* renamed from: g */
    public boolean f31967g;

    /* renamed from: h */
    public boolean f31968h;

    /* renamed from: i */
    public boolean f31969i;

    /* renamed from: j */
    public boolean f31970j;

    /* renamed from: k */
    public int f31971k;

    /* renamed from: l */
    public int f31972l;

    /* renamed from: m */
    public boolean f31973m;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l4/b$a.class
     */
    /* renamed from: l4.b$a */
    /* loaded from: combined.jar:classes1.jar:l4/b$a.class */
    public static class a extends Drawable.ConstantState {

        /* renamed from: a */
        public C9233c f31974a;

        /* renamed from: b */
        public byte[] f31975b;

        /* renamed from: c */
        public Context f31976c;

        /* renamed from: d */
        public InterfaceC9650g<Bitmap> f31977d;

        /* renamed from: e */
        public int f31978e;

        /* renamed from: f */
        public int f31979f;

        /* renamed from: g */
        public C9231a.a f31980g;

        /* renamed from: h */
        public InterfaceC0065b f31981h;

        /* renamed from: i */
        public Bitmap f31982i;

        public a(C9233c c9233c, byte[] bArr, Context context, InterfaceC9650g<Bitmap> interfaceC9650g, int i10, int i11, C9231a.a aVar, InterfaceC0065b interfaceC0065b, Bitmap bitmap) {
            if (bitmap == null) {
                throw new NullPointerException("The first frame of the GIF must not be null");
            }
            this.f31974a = c9233c;
            this.f31975b = bArr;
            this.f31981h = interfaceC0065b;
            this.f31982i = bitmap;
            this.f31976c = context.getApplicationContext();
            this.f31977d = interfaceC9650g;
            this.f31978e = i10;
            this.f31979f = i11;
            this.f31980g = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C5672b(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C5672b(Context context, C9231a.a aVar, InterfaceC0065b interfaceC0065b, InterfaceC9650g<Bitmap> interfaceC9650g, int i10, int i11, C9233c c9233c, byte[] bArr, Bitmap bitmap) {
        this(new a(c9233c, bArr, context, interfaceC9650g, i10, i11, aVar, interfaceC0065b, bitmap));
    }

    public C5672b(a aVar) {
        this.f31963c = new Rect();
        this.f31970j = true;
        this.f31972l = -1;
        if (aVar == null) {
            throw new NullPointerException("GifState must not be null");
        }
        this.f31964d = aVar;
        C9231a c9231a = new C9231a(aVar.f31980g);
        this.f31965e = c9231a;
        this.f31962b = new Paint();
        c9231a.m38921n(aVar.f31974a, aVar.f31975b);
        C5676f c5676f = new C5676f(aVar.f31976c, this, c9231a, aVar.f31978e, aVar.f31979f);
        this.f31966f = c5676f;
        c5676f.m27916f(aVar.f31977d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5672b(p195l4.C5672b r14, android.graphics.Bitmap r15, p396x3.InterfaceC9650g<android.graphics.Bitmap> r16) {
        /*
            r13 = this;
            r0 = r14
            l4.b$a r0 = r0.f31964d
            r14 = r0
            r0 = r13
            l4.b$a r1 = new l4.b$a
            r2 = r1
            r3 = r14
            v3.c r3 = r3.f31974a
            r4 = r14
            byte[] r4 = r4.f31975b
            r5 = r14
            android.content.Context r5 = r5.f31976c
            r6 = r16
            r7 = r14
            int r7 = r7.f31978e
            r8 = r14
            int r8 = r8.f31979f
            r9 = r14
            v3.a$a r9 = r9.f31980g
            r10 = r14
            a4.b r10 = r10.f31981h
            r11 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p195l4.C5672b.<init>(l4.b, android.graphics.Bitmap, x3.g):void");
    }

    @Override // p195l4.C5676f.c
    @TargetApi(11)
    /* renamed from: a */
    public void mo27901a(int i10) {
        if (getCallback() == null) {
            stop();
            m27907i();
            return;
        }
        invalidateSelf();
        if (i10 == this.f31965e.m38914f() - 1) {
            this.f31971k++;
        }
        int i11 = this.f31972l;
        if (i11 == -1 || this.f31971k < i11) {
            return;
        }
        stop();
    }

    @Override // p160j4.AbstractC5293b
    /* renamed from: b */
    public boolean mo25845b() {
        return true;
    }

    @Override // p160j4.AbstractC5293b
    /* renamed from: c */
    public void mo25846c(int i10) {
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i10 != 0) {
            this.f31972l = i10;
            return;
        }
        int m38918j = this.f31965e.m38918j();
        if (m38918j == 0) {
            m38918j = -1;
        }
        this.f31972l = m38918j;
    }

    /* renamed from: d */
    public byte[] m27902d() {
        return this.f31964d.f31975b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f31969i) {
            return;
        }
        if (this.f31973m) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f31963c);
            this.f31973m = false;
        }
        Bitmap m27913b = this.f31966f.m27913b();
        if (m27913b == null) {
            m27913b = this.f31964d.f31982i;
        }
        canvas.drawBitmap(m27913b, (Rect) null, this.f31963c, this.f31962b);
    }

    /* renamed from: e */
    public Bitmap m27903e() {
        return this.f31964d.f31982i;
    }

    /* renamed from: f */
    public int m27904f() {
        return this.f31965e.m38914f();
    }

    /* renamed from: g */
    public InterfaceC9650g<Bitmap> m27905g() {
        return this.f31964d.f31977d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f31964d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f31964d.f31982i.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f31964d.f31982i.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public void m27906h() {
        this.f31969i = true;
        a aVar = this.f31964d;
        aVar.f31981h.mo231a(aVar.f31982i);
        this.f31966f.m27912a();
        this.f31966f.m27918h();
    }

    /* renamed from: i */
    public final void m27907i() {
        this.f31966f.m27912a();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f31967g;
    }

    /* renamed from: j */
    public final void m27908j() {
        this.f31971k = 0;
    }

    /* renamed from: k */
    public final void m27909k() {
        if (this.f31965e.m38914f() != 1) {
            if (this.f31967g) {
                return;
            }
            this.f31967g = true;
            this.f31966f.m27917g();
        }
        invalidateSelf();
    }

    /* renamed from: l */
    public final void m27910l() {
        this.f31967g = false;
        this.f31966f.m27918h();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f31973m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f31962b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f31962b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        this.f31970j = z10;
        if (!z10) {
            m27910l();
        } else if (this.f31968h) {
            m27909k();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f31968h = true;
        m27908j();
        if (this.f31970j) {
            m27909k();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f31968h = false;
        m27910l();
    }
}
