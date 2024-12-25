package p404xb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p012ab.C0152l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xb/k.class
 */
/* renamed from: xb.k */
/* loaded from: combined.jar:classes2.jar:xb/k.class */
public class C9716k {

    /* renamed from: m */
    public static final InterfaceC9708c f44305m = new C9714i(0.5f);

    /* renamed from: a */
    public C9709d f44306a;

    /* renamed from: b */
    public C9709d f44307b;

    /* renamed from: c */
    public C9709d f44308c;

    /* renamed from: d */
    public C9709d f44309d;

    /* renamed from: e */
    public InterfaceC9708c f44310e;

    /* renamed from: f */
    public InterfaceC9708c f44311f;

    /* renamed from: g */
    public InterfaceC9708c f44312g;

    /* renamed from: h */
    public InterfaceC9708c f44313h;

    /* renamed from: i */
    public C9711f f44314i;

    /* renamed from: j */
    public C9711f f44315j;

    /* renamed from: k */
    public C9711f f44316k;

    /* renamed from: l */
    public C9711f f44317l;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/k$b.class
     */
    /* renamed from: xb.k$b */
    /* loaded from: combined.jar:classes2.jar:xb/k$b.class */
    public static final class b {

        /* renamed from: a */
        public C9709d f44318a;

        /* renamed from: b */
        public C9709d f44319b;

        /* renamed from: c */
        public C9709d f44320c;

        /* renamed from: d */
        public C9709d f44321d;

        /* renamed from: e */
        public InterfaceC9708c f44322e;

        /* renamed from: f */
        public InterfaceC9708c f44323f;

        /* renamed from: g */
        public InterfaceC9708c f44324g;

        /* renamed from: h */
        public InterfaceC9708c f44325h;

        /* renamed from: i */
        public C9711f f44326i;

        /* renamed from: j */
        public C9711f f44327j;

        /* renamed from: k */
        public C9711f f44328k;

        /* renamed from: l */
        public C9711f f44329l;

        public b() {
            this.f44318a = C9713h.m40876b();
            this.f44319b = C9713h.m40876b();
            this.f44320c = C9713h.m40876b();
            this.f44321d = C9713h.m40876b();
            this.f44322e = new C9706a(0.0f);
            this.f44323f = new C9706a(0.0f);
            this.f44324g = new C9706a(0.0f);
            this.f44325h = new C9706a(0.0f);
            this.f44326i = C9713h.m40877c();
            this.f44327j = C9713h.m40877c();
            this.f44328k = C9713h.m40877c();
            this.f44329l = C9713h.m40877c();
        }

        public b(C9716k c9716k) {
            this.f44318a = C9713h.m40876b();
            this.f44319b = C9713h.m40876b();
            this.f44320c = C9713h.m40876b();
            this.f44321d = C9713h.m40876b();
            this.f44322e = new C9706a(0.0f);
            this.f44323f = new C9706a(0.0f);
            this.f44324g = new C9706a(0.0f);
            this.f44325h = new C9706a(0.0f);
            this.f44326i = C9713h.m40877c();
            this.f44327j = C9713h.m40877c();
            this.f44328k = C9713h.m40877c();
            this.f44329l = C9713h.m40877c();
            this.f44318a = c9716k.f44306a;
            this.f44319b = c9716k.f44307b;
            this.f44320c = c9716k.f44308c;
            this.f44321d = c9716k.f44309d;
            this.f44322e = c9716k.f44310e;
            this.f44323f = c9716k.f44311f;
            this.f44324g = c9716k.f44312g;
            this.f44325h = c9716k.f44313h;
            this.f44326i = c9716k.f44314i;
            this.f44327j = c9716k.f44315j;
            this.f44328k = c9716k.f44316k;
            this.f44329l = c9716k.f44317l;
        }

        /* renamed from: n */
        public static float m40918n(C9709d c9709d) {
            if (c9709d instanceof C9715j) {
                return ((C9715j) c9709d).f44304a;
            }
            if (c9709d instanceof C9710e) {
                return ((C9710e) c9709d).f44253a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public b m40919A(float f10) {
            this.f44322e = new C9706a(f10);
            return this;
        }

        /* renamed from: B */
        public b m40920B(InterfaceC9708c interfaceC9708c) {
            this.f44322e = interfaceC9708c;
            return this;
        }

        /* renamed from: C */
        public b m40921C(int i10, InterfaceC9708c interfaceC9708c) {
            return m40922D(C9713h.m40875a(i10)).m40924F(interfaceC9708c);
        }

        /* renamed from: D */
        public b m40922D(C9709d c9709d) {
            this.f44319b = c9709d;
            float m40918n = m40918n(c9709d);
            if (m40918n != -1.0f) {
                m40923E(m40918n);
            }
            return this;
        }

        /* renamed from: E */
        public b m40923E(float f10) {
            this.f44323f = new C9706a(f10);
            return this;
        }

        /* renamed from: F */
        public b m40924F(InterfaceC9708c interfaceC9708c) {
            this.f44323f = interfaceC9708c;
            return this;
        }

        /* renamed from: m */
        public C9716k m40925m() {
            return new C9716k(this);
        }

        /* renamed from: o */
        public b m40926o(float f10) {
            return m40919A(f10).m40923E(f10).m40934w(f10).m40930s(f10);
        }

        /* renamed from: p */
        public b m40927p(InterfaceC9708c interfaceC9708c) {
            return m40920B(interfaceC9708c).m40924F(interfaceC9708c).m40935x(interfaceC9708c).m40931t(interfaceC9708c);
        }

        /* renamed from: q */
        public b m40928q(int i10, InterfaceC9708c interfaceC9708c) {
            return m40929r(C9713h.m40875a(i10)).m40931t(interfaceC9708c);
        }

        /* renamed from: r */
        public b m40929r(C9709d c9709d) {
            this.f44321d = c9709d;
            float m40918n = m40918n(c9709d);
            if (m40918n != -1.0f) {
                m40930s(m40918n);
            }
            return this;
        }

        /* renamed from: s */
        public b m40930s(float f10) {
            this.f44325h = new C9706a(f10);
            return this;
        }

        /* renamed from: t */
        public b m40931t(InterfaceC9708c interfaceC9708c) {
            this.f44325h = interfaceC9708c;
            return this;
        }

        /* renamed from: u */
        public b m40932u(int i10, InterfaceC9708c interfaceC9708c) {
            return m40933v(C9713h.m40875a(i10)).m40935x(interfaceC9708c);
        }

        /* renamed from: v */
        public b m40933v(C9709d c9709d) {
            this.f44320c = c9709d;
            float m40918n = m40918n(c9709d);
            if (m40918n != -1.0f) {
                m40934w(m40918n);
            }
            return this;
        }

        /* renamed from: w */
        public b m40934w(float f10) {
            this.f44324g = new C9706a(f10);
            return this;
        }

        /* renamed from: x */
        public b m40935x(InterfaceC9708c interfaceC9708c) {
            this.f44324g = interfaceC9708c;
            return this;
        }

        /* renamed from: y */
        public b m40936y(int i10, InterfaceC9708c interfaceC9708c) {
            return m40937z(C9713h.m40875a(i10)).m40920B(interfaceC9708c);
        }

        /* renamed from: z */
        public b m40937z(C9709d c9709d) {
            this.f44318a = c9709d;
            float m40918n = m40918n(c9709d);
            if (m40918n != -1.0f) {
                m40919A(m40918n);
            }
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/k$c.class
     */
    /* renamed from: xb.k$c */
    /* loaded from: combined.jar:classes2.jar:xb/k$c.class */
    public interface c {
        /* renamed from: a */
        InterfaceC9708c mo40874a(InterfaceC9708c interfaceC9708c);
    }

    public C9716k() {
        this.f44306a = C9713h.m40876b();
        this.f44307b = C9713h.m40876b();
        this.f44308c = C9713h.m40876b();
        this.f44309d = C9713h.m40876b();
        this.f44310e = new C9706a(0.0f);
        this.f44311f = new C9706a(0.0f);
        this.f44312g = new C9706a(0.0f);
        this.f44313h = new C9706a(0.0f);
        this.f44314i = C9713h.m40877c();
        this.f44315j = C9713h.m40877c();
        this.f44316k = C9713h.m40877c();
        this.f44317l = C9713h.m40877c();
    }

    public C9716k(b bVar) {
        this.f44306a = bVar.f44318a;
        this.f44307b = bVar.f44319b;
        this.f44308c = bVar.f44320c;
        this.f44309d = bVar.f44321d;
        this.f44310e = bVar.f44322e;
        this.f44311f = bVar.f44323f;
        this.f44312g = bVar.f44324g;
        this.f44313h = bVar.f44325h;
        this.f44314i = bVar.f44326i;
        this.f44315j = bVar.f44327j;
        this.f44316k = bVar.f44328k;
        this.f44317l = bVar.f44329l;
    }

    /* renamed from: a */
    public static b m40881a() {
        return new b();
    }

    /* renamed from: b */
    public static b m40882b(Context context, int i10, int i11) {
        return m40883c(context, i10, i11, 0);
    }

    /* renamed from: c */
    public static b m40883c(Context context, int i10, int i11, int i12) {
        return m40884d(context, i10, i11, new C9706a(i12));
    }

    /* renamed from: d */
    public static b m40884d(Context context, int i10, int i11, InterfaceC9708c interfaceC9708c) {
        Context context2 = context;
        int i12 = i10;
        if (i11 != 0) {
            context2 = new ContextThemeWrapper(context, i10);
            i12 = i11;
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i12, C0152l.f1066c4);
        try {
            int i13 = obtainStyledAttributes.getInt(C0152l.f1074d4, 0);
            int i14 = obtainStyledAttributes.getInt(C0152l.f1098g4, i13);
            int i15 = obtainStyledAttributes.getInt(C0152l.f1106h4, i13);
            int i16 = obtainStyledAttributes.getInt(C0152l.f1090f4, i13);
            int i17 = obtainStyledAttributes.getInt(C0152l.f1082e4, i13);
            InterfaceC9708c m40888m = m40888m(obtainStyledAttributes, C0152l.f1114i4, interfaceC9708c);
            InterfaceC9708c m40888m2 = m40888m(obtainStyledAttributes, C0152l.f1138l4, m40888m);
            InterfaceC9708c m40888m3 = m40888m(obtainStyledAttributes, C0152l.f1146m4, m40888m);
            InterfaceC9708c m40888m4 = m40888m(obtainStyledAttributes, C0152l.f1130k4, m40888m);
            return new b().m40936y(i14, m40888m2).m40921C(i15, m40888m3).m40932u(i16, m40888m4).m40928q(i17, m40888m(obtainStyledAttributes, C0152l.f1122j4, m40888m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static b m40885e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return m40886f(context, attributeSet, i10, i11, 0);
    }

    /* renamed from: f */
    public static b m40886f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return m40887g(context, attributeSet, i10, i11, new C9706a(i12));
    }

    /* renamed from: g */
    public static b m40887g(Context context, AttributeSet attributeSet, int i10, int i11, InterfaceC9708c interfaceC9708c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0152l.f1177q3, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(C0152l.f1185r3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C0152l.f1193s3, 0);
        obtainStyledAttributes.recycle();
        return m40884d(context, resourceId, resourceId2, interfaceC9708c);
    }

    /* renamed from: m */
    public static InterfaceC9708c m40888m(TypedArray typedArray, int i10, InterfaceC9708c interfaceC9708c) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return interfaceC9708c;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new C9706a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new C9714i(peekValue.getFraction(1.0f, 1.0f)) : interfaceC9708c;
    }

    /* renamed from: h */
    public C9711f m40889h() {
        return this.f44316k;
    }

    /* renamed from: i */
    public C9709d m40890i() {
        return this.f44309d;
    }

    /* renamed from: j */
    public InterfaceC9708c m40891j() {
        return this.f44313h;
    }

    /* renamed from: k */
    public C9709d m40892k() {
        return this.f44308c;
    }

    /* renamed from: l */
    public InterfaceC9708c m40893l() {
        return this.f44312g;
    }

    /* renamed from: n */
    public C9711f m40894n() {
        return this.f44317l;
    }

    /* renamed from: o */
    public C9711f m40895o() {
        return this.f44315j;
    }

    /* renamed from: p */
    public C9711f m40896p() {
        return this.f44314i;
    }

    /* renamed from: q */
    public C9709d m40897q() {
        return this.f44306a;
    }

    /* renamed from: r */
    public InterfaceC9708c m40898r() {
        return this.f44310e;
    }

    /* renamed from: s */
    public C9709d m40899s() {
        return this.f44307b;
    }

    /* renamed from: t */
    public InterfaceC9708c m40900t() {
        return this.f44311f;
    }

    /* renamed from: u */
    public boolean m40901u(RectF rectF) {
        boolean z10 = true;
        boolean z11 = this.f44317l.getClass().equals(C9711f.class) && this.f44315j.getClass().equals(C9711f.class) && this.f44314i.getClass().equals(C9711f.class) && this.f44316k.getClass().equals(C9711f.class);
        float mo40809a = this.f44310e.mo40809a(rectF);
        boolean z12 = this.f44311f.mo40809a(rectF) == mo40809a && this.f44313h.mo40809a(rectF) == mo40809a && this.f44312g.mo40809a(rectF) == mo40809a;
        boolean z13 = (this.f44307b instanceof C9715j) && (this.f44306a instanceof C9715j) && (this.f44308c instanceof C9715j) && (this.f44309d instanceof C9715j);
        if (!z11 || !z12 || !z13) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: v */
    public b m40902v() {
        return new b(this);
    }

    /* renamed from: w */
    public C9716k m40903w(float f10) {
        return m40902v().m40926o(f10).m40925m();
    }

    /* renamed from: x */
    public C9716k m40904x(InterfaceC9708c interfaceC9708c) {
        return m40902v().m40927p(interfaceC9708c).m40925m();
    }

    /* renamed from: y */
    public C9716k m40905y(c cVar) {
        return m40902v().m40920B(cVar.mo40874a(m40898r())).m40924F(cVar.mo40874a(m40900t())).m40931t(cVar.mo40874a(m40891j())).m40935x(cVar.mo40874a(m40893l())).m40925m();
    }
}
