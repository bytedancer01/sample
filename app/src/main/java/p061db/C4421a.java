package p061db;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;
import p012ab.C0142b;
import p012ab.C0144d;
import p012ab.C0146f;
import p012ab.C0149i;
import p012ab.C0150j;
import p012ab.C0151k;
import p012ab.C0152l;
import p235o0.C6824g0;
import p306rb.C8456h;
import p306rb.C8458j;
import p351ub.C9148c;
import p351ub.C9149d;
import p404xb.C9712g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:db/a.class
 */
/* renamed from: db.a */
/* loaded from: combined.jar:classes2.jar:db/a.class */
public class C4421a extends Drawable implements C8456h.b {

    /* renamed from: r */
    public static final int f26716r = C0151k.f829k;

    /* renamed from: s */
    public static final int f26717s = C0142b.f643c;

    /* renamed from: b */
    public final WeakReference<Context> f26718b;

    /* renamed from: c */
    public final C9712g f26719c;

    /* renamed from: d */
    public final C8456h f26720d;

    /* renamed from: e */
    public final Rect f26721e;

    /* renamed from: f */
    public final float f26722f;

    /* renamed from: g */
    public final float f26723g;

    /* renamed from: h */
    public final float f26724h;

    /* renamed from: i */
    public final b f26725i;

    /* renamed from: j */
    public float f26726j;

    /* renamed from: k */
    public float f26727k;

    /* renamed from: l */
    public int f26728l;

    /* renamed from: m */
    public float f26729m;

    /* renamed from: n */
    public float f26730n;

    /* renamed from: o */
    public float f26731o;

    /* renamed from: p */
    public WeakReference<View> f26732p;

    /* renamed from: q */
    public WeakReference<FrameLayout> f26733q;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:db/a$a.class
     */
    /* renamed from: db.a$a */
    /* loaded from: combined.jar:classes2.jar:db/a$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final View f26734b;

        /* renamed from: c */
        public final FrameLayout f26735c;

        /* renamed from: d */
        public final C4421a f26736d;

        public a(C4421a c4421a, View view, FrameLayout frameLayout) {
            this.f26736d = c4421a;
            this.f26734b = view;
            this.f26735c = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26736d.m22497y(this.f26734b, this.f26735c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:db/a$b.class
     */
    /* renamed from: db.a$b */
    /* loaded from: combined.jar:classes2.jar:db/a$b.class */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b */
        public int f26737b;

        /* renamed from: c */
        public int f26738c;

        /* renamed from: d */
        public int f26739d;

        /* renamed from: e */
        public int f26740e;

        /* renamed from: f */
        public int f26741f;

        /* renamed from: g */
        public CharSequence f26742g;

        /* renamed from: h */
        public int f26743h;

        /* renamed from: i */
        public int f26744i;

        /* renamed from: j */
        public int f26745j;

        /* renamed from: k */
        public boolean f26746k;

        /* renamed from: l */
        public int f26747l;

        /* renamed from: m */
        public int f26748m;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:db/a$b$a.class
         */
        /* renamed from: db.a$b$a */
        /* loaded from: combined.jar:classes2.jar:db/a$b$a.class */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Context context) {
            this.f26739d = 255;
            this.f26740e = -1;
            this.f26738c = new C9149d(context, C0151k.f821c).f41837a.getDefaultColor();
            this.f26742g = context.getString(C0150j.f807i);
            this.f26743h = C0149i.f798a;
            this.f26744i = C0150j.f809k;
            this.f26746k = true;
        }

        public b(Parcel parcel) {
            this.f26739d = 255;
            this.f26740e = -1;
            this.f26737b = parcel.readInt();
            this.f26738c = parcel.readInt();
            this.f26739d = parcel.readInt();
            this.f26740e = parcel.readInt();
            this.f26741f = parcel.readInt();
            this.f26742g = parcel.readString();
            this.f26743h = parcel.readInt();
            this.f26745j = parcel.readInt();
            this.f26747l = parcel.readInt();
            this.f26748m = parcel.readInt();
            this.f26746k = parcel.readInt() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f26737b);
            parcel.writeInt(this.f26738c);
            parcel.writeInt(this.f26739d);
            parcel.writeInt(this.f26740e);
            parcel.writeInt(this.f26741f);
            parcel.writeString(this.f26742g.toString());
            parcel.writeInt(this.f26743h);
            parcel.writeInt(this.f26745j);
            parcel.writeInt(this.f26747l);
            parcel.writeInt(this.f26748m);
            parcel.writeInt(this.f26746k ? 1 : 0);
        }
    }

    public C4421a(Context context) {
        this.f26718b = new WeakReference<>(context);
        C8458j.m36333c(context);
        Resources resources = context.getResources();
        this.f26721e = new Rect();
        this.f26719c = new C9712g();
        this.f26722f = resources.getDimensionPixelSize(C0144d.f727z);
        this.f26724h = resources.getDimensionPixelSize(C0144d.f726y);
        this.f26723g = resources.getDimensionPixelSize(C0144d.f678B);
        C8456h c8456h = new C8456h(this);
        this.f26720d = c8456h;
        c8456h.m36325e().setTextAlign(Paint.Align.CENTER);
        this.f26725i = new b(context);
        m22494u(C0151k.f821c);
    }

    /* renamed from: c */
    public static C4421a m22473c(Context context) {
        return m22474d(context, null, f26717s, f26716r);
    }

    /* renamed from: d */
    public static C4421a m22474d(Context context, AttributeSet attributeSet, int i10, int i11) {
        C4421a c4421a = new C4421a(context);
        c4421a.m22486l(context, attributeSet, i10, i11);
        return c4421a;
    }

    /* renamed from: m */
    public static int m22475m(Context context, TypedArray typedArray, int i10) {
        return C9148c.m38476a(context, typedArray, i10).getDefaultColor();
    }

    /* renamed from: x */
    public static void m22476x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: A */
    public final void m22477A() {
        this.f26728l = ((int) Math.pow(10.0d, m22483i() - 1.0d)) - 1;
    }

    @Override // p306rb.C8456h.b
    /* renamed from: a */
    public void mo13563a() {
        invalidateSelf();
    }

    /* renamed from: b */
    public final void m22478b(Context context, Rect rect, View view) {
        float m36326f;
        int i10 = this.f26725i.f26745j;
        this.f26727k = (i10 == 8388691 || i10 == 8388693) ? rect.bottom - this.f26725i.f26748m : rect.top + this.f26725i.f26748m;
        if (m22484j() <= 9) {
            m36326f = !m22485k() ? this.f26722f : this.f26723g;
            this.f26729m = m36326f;
            this.f26731o = m36326f;
        } else {
            float f10 = this.f26723g;
            this.f26729m = f10;
            this.f26731o = f10;
            m36326f = (this.f26720d.m36326f(m22480f()) / 2.0f) + this.f26724h;
        }
        this.f26730n = m36326f;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m22485k() ? C0144d.f677A : C0144d.f725x);
        int i11 = this.f26725i.f26745j;
        this.f26726j = (i11 == 8388659 || i11 == 8388691 ? C6824g0.m31473C(view) != 0 : C6824g0.m31473C(view) == 0) ? ((rect.right + this.f26730n) - dimensionPixelSize) - this.f26725i.f26747l : (rect.left - this.f26730n) + dimensionPixelSize + this.f26725i.f26747l;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f26719c.draw(canvas);
        if (m22485k()) {
            m22479e(canvas);
        }
    }

    /* renamed from: e */
    public final void m22479e(Canvas canvas) {
        Rect rect = new Rect();
        String m22480f = m22480f();
        this.f26720d.m36325e().getTextBounds(m22480f, 0, m22480f.length(), rect);
        canvas.drawText(m22480f, this.f26726j, this.f26727k + (rect.height() / 2), this.f26720d.m36325e());
    }

    /* renamed from: f */
    public final String m22480f() {
        if (m22484j() <= this.f26728l) {
            return NumberFormat.getInstance().format(m22484j());
        }
        Context context = this.f26718b.get();
        return context == null ? "" : context.getString(C0150j.f810l, Integer.valueOf(this.f26728l), Marker.ANY_NON_NULL_MARKER);
    }

    /* renamed from: g */
    public CharSequence m22481g() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!m22485k()) {
            return this.f26725i.f26742g;
        }
        if (this.f26725i.f26743h <= 0 || (context = this.f26718b.get()) == null) {
            return null;
        }
        return m22484j() <= this.f26728l ? context.getResources().getQuantityString(this.f26725i.f26743h, m22484j(), Integer.valueOf(m22484j())) : context.getString(this.f26725i.f26744i, Integer.valueOf(this.f26728l));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f26725i.f26739d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26721e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26721e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public FrameLayout m22482h() {
        WeakReference<FrameLayout> weakReference = this.f26733q;
        return weakReference != null ? weakReference.get() : null;
    }

    /* renamed from: i */
    public int m22483i() {
        return this.f26725i.f26741f;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int m22484j() {
        if (m22485k()) {
            return this.f26725i.f26740e;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean m22485k() {
        return this.f26725i.f26740e != -1;
    }

    /* renamed from: l */
    public final void m22486l(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray m36338h = C8458j.m36338h(context, attributeSet, C0152l.f858C, i10, i11, new int[0]);
        m22491r(m36338h.getInt(C0152l.f898H, 4));
        int i12 = C0152l.f906I;
        if (m36338h.hasValue(i12)) {
            m22492s(m36338h.getInt(i12, 0));
        }
        m22487n(m22475m(context, m36338h, C0152l.f866D));
        int i13 = C0152l.f882F;
        if (m36338h.hasValue(i13)) {
            m22489p(m22475m(context, m36338h, i13));
        }
        m22488o(m36338h.getInt(C0152l.f874E, 8388661));
        m22490q(m36338h.getDimensionPixelOffset(C0152l.f890G, 0));
        m22495v(m36338h.getDimensionPixelOffset(C0152l.f914J, 0));
        m36338h.recycle();
    }

    /* renamed from: n */
    public void m22487n(int i10) {
        this.f26725i.f26737b = i10;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        if (this.f26719c.m40869x() != valueOf) {
            this.f26719c.m40841X(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public void m22488o(int i10) {
        if (this.f26725i.f26745j != i10) {
            this.f26725i.f26745j = i10;
            WeakReference<View> weakReference = this.f26732p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.f26732p.get();
            WeakReference<FrameLayout> weakReference2 = this.f26733q;
            m22497y(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    @Override // android.graphics.drawable.Drawable, p306rb.C8456h.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p */
    public void m22489p(int i10) {
        this.f26725i.f26738c = i10;
        if (this.f26720d.m36325e().getColor() != i10) {
            this.f26720d.m36325e().setColor(i10);
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void m22490q(int i10) {
        this.f26725i.f26747l = i10;
        m22498z();
    }

    /* renamed from: r */
    public void m22491r(int i10) {
        if (this.f26725i.f26741f != i10) {
            this.f26725i.f26741f = i10;
            m22477A();
            this.f26720d.m36329i(true);
            m22498z();
            invalidateSelf();
        }
    }

    /* renamed from: s */
    public void m22492s(int i10) {
        int max = Math.max(0, i10);
        if (this.f26725i.f26740e != max) {
            this.f26725i.f26740e = max;
            this.f26720d.m36329i(true);
            m22498z();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f26725i.f26739d = i10;
        this.f26720d.m36325e().setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public final void m22493t(C9149d c9149d) {
        Context context;
        if (this.f26720d.m36324d() == c9149d || (context = this.f26718b.get()) == null) {
            return;
        }
        this.f26720d.m36328h(c9149d, context);
        m22498z();
    }

    /* renamed from: u */
    public final void m22494u(int i10) {
        Context context = this.f26718b.get();
        if (context == null) {
            return;
        }
        m22493t(new C9149d(context, i10));
    }

    /* renamed from: v */
    public void m22495v(int i10) {
        this.f26725i.f26748m = i10;
        m22498z();
    }

    /* renamed from: w */
    public final void m22496w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C0146f.f770t) {
            WeakReference<FrameLayout> weakReference = this.f26733q;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m22476x(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C0146f.f770t);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f26733q = new WeakReference<>(frameLayout);
                frameLayout.post(new a(this, view, frameLayout));
            }
        }
    }

    /* renamed from: y */
    public void m22497y(View view, FrameLayout frameLayout) {
        this.f26732p = new WeakReference<>(view);
        boolean z10 = C4422b.f26749a;
        if (z10 && frameLayout == null) {
            m22496w(view);
        } else {
            this.f26733q = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            m22476x(view);
        }
        m22498z();
        invalidateSelf();
    }

    /* renamed from: z */
    public final void m22498z() {
        Context context = this.f26718b.get();
        WeakReference<View> weakReference = this.f26732p;
        FrameLayout frameLayout = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f26721e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f26733q;
        if (weakReference2 != null) {
            frameLayout = weakReference2.get();
        }
        if (frameLayout != null || C4422b.f26749a) {
            ViewGroup viewGroup = frameLayout;
            if (frameLayout == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        m22478b(context, rect2, view);
        C4422b.m22521d(this.f26721e, this.f26726j, this.f26727k, this.f26730n, this.f26731o);
        this.f26719c.m40838U(this.f26729m);
        if (rect.equals(this.f26721e)) {
            return;
        }
        this.f26719c.setBounds(this.f26721e);
    }
}
