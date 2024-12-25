package pl.droidsonroids.gif;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.MediaController;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p014aj.InterfaceC0167a;
import p449zi.AbstractRunnableC10247g;
import p449zi.C10243c;
import p449zi.HandlerC10244d;
import p449zi.InterfaceC10241a;

/* renamed from: pl.droidsonroids.gif.a */
/* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/a.class */
public class C7735a extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: b */
    public final ScheduledThreadPoolExecutor f37521b;

    /* renamed from: c */
    public volatile boolean f37522c;

    /* renamed from: d */
    public long f37523d;

    /* renamed from: e */
    public final Rect f37524e;

    /* renamed from: f */
    public final Paint f37525f;

    /* renamed from: g */
    public final Bitmap f37526g;

    /* renamed from: h */
    public final GifInfoHandle f37527h;

    /* renamed from: i */
    public final ConcurrentLinkedQueue<InterfaceC10241a> f37528i;

    /* renamed from: j */
    public ColorStateList f37529j;

    /* renamed from: k */
    public PorterDuffColorFilter f37530k;

    /* renamed from: l */
    public PorterDuff.Mode f37531l;

    /* renamed from: m */
    public final boolean f37532m;

    /* renamed from: n */
    public final HandlerC10244d f37533n;

    /* renamed from: o */
    public final C7738d f37534o;

    /* renamed from: p */
    public final Rect f37535p;

    /* renamed from: q */
    public ScheduledFuture<?> f37536q;

    /* renamed from: r */
    public int f37537r;

    /* renamed from: s */
    public int f37538s;

    /* renamed from: t */
    public InterfaceC0167a f37539t;

    /* renamed from: pl.droidsonroids.gif.a$a */
    /* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/a$a.class */
    public class a extends AbstractRunnableC10247g {

        /* renamed from: c */
        public final C7735a f37540c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7735a c7735a, C7735a c7735a2) {
            super(c7735a2);
            this.f37540c = c7735a;
        }

        @Override // p449zi.AbstractRunnableC10247g
        /* renamed from: a */
        public void mo33804a() {
            if (this.f37540c.f37527h.m33783q()) {
                this.f37540c.start();
            }
        }
    }

    /* renamed from: pl.droidsonroids.gif.a$b */
    /* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/a$b.class */
    public class b extends AbstractRunnableC10247g {

        /* renamed from: c */
        public final int f37541c;

        /* renamed from: d */
        public final C7735a f37542d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7735a c7735a, C7735a c7735a2, int i10) {
            super(c7735a2);
            this.f37542d = c7735a;
            this.f37541c = i10;
        }

        @Override // p449zi.AbstractRunnableC10247g
        /* renamed from: a */
        public void mo33804a() {
            C7735a c7735a = this.f37542d;
            c7735a.f37527h.m33787u(this.f37541c, c7735a.f37526g);
            this.f46849b.f37533n.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public C7735a(AssetFileDescriptor assetFileDescriptor) {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public C7735a(Resources resources, int i10) {
        this(resources.openRawResourceFd(i10));
        float m33809b = C7737c.m33809b(resources, i10);
        this.f37538s = (int) (this.f37527h.m33773e() * m33809b);
        this.f37537r = (int) (this.f37527h.m33778k() * m33809b);
    }

    public C7735a(GifInfoHandle gifInfoHandle, C7735a c7735a, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10) {
        this.f37522c = true;
        this.f37523d = Long.MIN_VALUE;
        this.f37524e = new Rect();
        this.f37525f = new Paint(6);
        this.f37528i = new ConcurrentLinkedQueue<>();
        C7738d c7738d = new C7738d(this);
        this.f37534o = c7738d;
        this.f37532m = z10;
        this.f37521b = scheduledThreadPoolExecutor == null ? C10243c.m42843a() : scheduledThreadPoolExecutor;
        this.f37527h = gifInfoHandle;
        Bitmap bitmap = null;
        if (c7735a != null) {
            synchronized (c7735a.f37527h) {
                bitmap = null;
                if (!c7735a.f37527h.m33780m()) {
                    bitmap = null;
                    if (c7735a.f37527h.m33773e() >= gifInfoHandle.m33773e()) {
                        bitmap = null;
                        if (c7735a.f37527h.m33778k() >= gifInfoHandle.m33778k()) {
                            c7735a.m33801i();
                            bitmap = c7735a.f37526g;
                            bitmap.eraseColor(0);
                        }
                    }
                }
            }
        }
        if (bitmap == null) {
            this.f37526g = Bitmap.createBitmap(gifInfoHandle.m33778k(), gifInfoHandle.m33773e(), Bitmap.Config.ARGB_8888);
        } else {
            this.f37526g = bitmap;
        }
        this.f37526g.setHasAlpha(!gifInfoHandle.m33779l());
        this.f37535p = new Rect(0, 0, gifInfoHandle.m33778k(), gifInfoHandle.m33773e());
        this.f37533n = new HandlerC10244d(this);
        c7738d.mo33804a();
        this.f37537r = gifInfoHandle.m33778k();
        this.f37538s = gifInfoHandle.m33773e();
    }

    /* renamed from: a */
    public final void m33793a() {
        ScheduledFuture<?> scheduledFuture = this.f37536q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f37533n.removeMessages(-1);
    }

    /* renamed from: b */
    public int m33794b() {
        return this.f37527h.m33769a();
    }

    /* renamed from: c */
    public int m33795c() {
        int m33770b = this.f37527h.m33770b();
        int i10 = m33770b;
        if (m33770b != 0) {
            i10 = m33770b < this.f37527h.m33774f() ? m33770b : m33770b - 1;
        }
        return i10;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        boolean z10 = true;
        if (m33796d() <= 1) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        boolean z10 = true;
        if (m33796d() <= 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: d */
    public int m33796d() {
        return this.f37527h.m33776i();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        if (this.f37530k == null || this.f37525f.getColorFilter() != null) {
            z10 = false;
        } else {
            this.f37525f.setColorFilter(this.f37530k);
            z10 = true;
        }
        InterfaceC0167a interfaceC0167a = this.f37539t;
        if (interfaceC0167a == null) {
            canvas.drawBitmap(this.f37526g, this.f37535p, this.f37524e, this.f37525f);
        } else {
            interfaceC0167a.m757b(canvas, this.f37525f, this.f37526g);
        }
        if (z10) {
            this.f37525f.setColorFilter(null);
        }
    }

    /* renamed from: e */
    public boolean m33797e() {
        return this.f37527h.m33780m();
    }

    /* renamed from: f */
    public void m33798f() {
        this.f37521b.execute(new a(this, this));
    }

    /* renamed from: g */
    public final void m33799g() {
        if (this.f37532m && this.f37522c) {
            long j10 = this.f37523d;
            if (j10 != Long.MIN_VALUE) {
                long max = Math.max(0L, j10 - SystemClock.uptimeMillis());
                this.f37523d = Long.MIN_VALUE;
                this.f37521b.remove(this.f37534o);
                this.f37536q = this.f37521b.schedule(this.f37534o, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37525f.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f37525f.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.f37527h.m33771c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.f37527h.m33772d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f37538s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f37537r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.f37527h.m33779l() || this.f37525f.getAlpha() < 255) ? -2 : -1;
    }

    /* renamed from: h */
    public void m33800h(int i10) {
        this.f37527h.m33788v(i10);
    }

    /* renamed from: i */
    public final void m33801i() {
        this.f37522c = false;
        this.f37533n.removeMessages(-1);
        this.f37527h.m33781o();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        m33799g();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f37522c;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f37522c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f37529j) != null && colorStateList.isStateful());
    }

    /* renamed from: j */
    public void m33802j(long j10) {
        if (this.f37532m) {
            this.f37523d = 0L;
            this.f37533n.sendEmptyMessageAtTime(-1, 0L);
        } else {
            m33793a();
            this.f37536q = this.f37521b.schedule(this.f37534o, Math.max(j10, 0L), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: k */
    public final PorterDuffColorFilter m33803k(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f37524e.set(rect);
        InterfaceC0167a interfaceC0167a = this.f37539t;
        if (interfaceC0167a != null) {
            interfaceC0167a.m756a(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f37529j;
        if (colorStateList == null || (mode = this.f37531l) == null) {
            return false;
        }
        this.f37530k = m33803k(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f37521b.execute(new b(this, this, i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f37525f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37525f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f37525f.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f37525f.setFilterBitmap(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f37529j = colorStateList;
        this.f37530k = m33803k(colorStateList, this.f37531l);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f37531l = mode;
        this.f37530k = m33803k(this.f37529j, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (!this.f37532m) {
            if (z10) {
                if (z11) {
                    m33798f();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            if (this.f37522c) {
                return;
            }
            this.f37522c = true;
            m33802j(this.f37527h.m33784r());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            if (this.f37522c) {
                this.f37522c = false;
                m33793a();
                this.f37527h.m33786t();
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f37527h.m33778k()), Integer.valueOf(this.f37527h.m33773e()), Integer.valueOf(this.f37527h.m33776i()), Integer.valueOf(this.f37527h.m33775g()));
    }
}
