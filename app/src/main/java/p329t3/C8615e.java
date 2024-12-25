package p329t3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p122h4.C5026d;
import p239o4.C6904m;
import p239o4.InterfaceC6898g;
import p280q4.C7752a;
import p280q4.InterfaceC7757f;
import p299r4.C7953a;
import p299r4.C7958f;
import p299r4.InterfaceC7954b;
import p299r4.InterfaceC7955c;
import p299r4.InterfaceC7956d;
import p318s4.C8529e;
import p318s4.InterfaceC8528d;
import p330t4.InterfaceC8630j;
import p345u4.C8789a;
import p363v4.C9242h;
import p396x3.C9647d;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9646c;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9650g;
import p435z3.EnumC10038b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t3/e.class
 */
/* renamed from: t3.e */
/* loaded from: combined.jar:classes1.jar:t3/e.class */
public class C8615e<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {

    /* renamed from: A */
    public boolean f40203A;

    /* renamed from: B */
    public boolean f40204B;

    /* renamed from: C */
    public Drawable f40205C;

    /* renamed from: D */
    public int f40206D;

    /* renamed from: b */
    public final Class<ModelType> f40207b;

    /* renamed from: c */
    public final Context f40208c;

    /* renamed from: d */
    public final C8617g f40209d;

    /* renamed from: e */
    public final Class<TranscodeType> f40210e;

    /* renamed from: f */
    public final C6904m f40211f;

    /* renamed from: g */
    public final InterfaceC6898g f40212g;

    /* renamed from: h */
    public C7752a<ModelType, DataType, ResourceType, TranscodeType> f40213h;

    /* renamed from: i */
    public ModelType f40214i;

    /* renamed from: j */
    public InterfaceC9646c f40215j;

    /* renamed from: k */
    public boolean f40216k;

    /* renamed from: l */
    public int f40217l;

    /* renamed from: m */
    public int f40218m;

    /* renamed from: n */
    public InterfaceC7956d<? super ModelType, TranscodeType> f40219n;

    /* renamed from: o */
    public Float f40220o;

    /* renamed from: p */
    public C8615e<?, ?, ?, TranscodeType> f40221p;

    /* renamed from: q */
    public Float f40222q;

    /* renamed from: r */
    public Drawable f40223r;

    /* renamed from: s */
    public Drawable f40224s;

    /* renamed from: t */
    public EnumC8619i f40225t;

    /* renamed from: u */
    public boolean f40226u;

    /* renamed from: v */
    public InterfaceC8528d<TranscodeType> f40227v;

    /* renamed from: w */
    public int f40228w;

    /* renamed from: x */
    public int f40229x;

    /* renamed from: y */
    public EnumC10038b f40230y;

    /* renamed from: z */
    public InterfaceC9650g<ResourceType> f40231z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t3/e$a.class
     */
    /* renamed from: t3.e$a */
    /* loaded from: combined.jar:classes1.jar:t3/e$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f40232a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p329t3.C8615e.a.f40232a = r0
                r0 = r4
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = p329t3.C8615e.a.f40232a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = p329t3.C8615e.a.f40232a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = p329t3.C8615e.a.f40232a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: p329t3.C8615e.a.m46057clinit():void");
        }
    }

    public C8615e(Context context, Class<ModelType> cls, InterfaceC7757f<ModelType, DataType, ResourceType, TranscodeType> interfaceC7757f, Class<TranscodeType> cls2, C8617g c8617g, C6904m c6904m, InterfaceC6898g interfaceC6898g) {
        this.f40215j = C8789a.m37645b();
        this.f40222q = Float.valueOf(1.0f);
        this.f40225t = null;
        this.f40226u = true;
        this.f40227v = C8529e.m36750d();
        this.f40228w = -1;
        this.f40229x = -1;
        this.f40230y = EnumC10038b.RESULT;
        this.f40231z = C5026d.m25233b();
        this.f40208c = context;
        this.f40207b = cls;
        this.f40210e = cls2;
        this.f40209d = c8617g;
        this.f40211f = c6904m;
        this.f40212g = interfaceC6898g;
        this.f40213h = interfaceC7757f != null ? new C7752a<>(interfaceC7757f) : null;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        }
        if (cls != null && interfaceC7757f == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    public C8615e(InterfaceC7757f<ModelType, DataType, ResourceType, TranscodeType> interfaceC7757f, Class<TranscodeType> cls, C8615e<ModelType, ?, ?, ?> c8615e) {
        this(c8615e.f40208c, c8615e.f40207b, interfaceC7757f, cls, c8615e.f40209d, c8615e.f40211f, c8615e.f40212g);
        this.f40214i = c8615e.f40214i;
        this.f40216k = c8615e.f40216k;
        this.f40215j = c8615e.f40215j;
        this.f40230y = c8615e.f40230y;
        this.f40226u = c8615e.f40226u;
    }

    /* renamed from: a */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> m36989a(InterfaceC8528d<TranscodeType> interfaceC8528d) {
        if (interfaceC8528d == null) {
            throw new NullPointerException("Animation factory must not be null!");
        }
        this.f40227v = interfaceC8528d;
        return this;
    }

    /* renamed from: b */
    public void mo36963b() {
    }

    /* renamed from: c */
    public void mo36964c() {
    }

    /* renamed from: d */
    public final InterfaceC7954b m36990d(InterfaceC8630j<TranscodeType> interfaceC8630j) {
        if (this.f40225t == null) {
            this.f40225t = EnumC8619i.NORMAL;
        }
        return m36991e(interfaceC8630j, null);
    }

    /* renamed from: e */
    public final InterfaceC7954b m36991e(InterfaceC8630j<TranscodeType> interfaceC8630j, C7958f c7958f) {
        C7958f c7958f2;
        InterfaceC7954b m36995n;
        InterfaceC7954b m36995n2;
        C8615e<?, ?, ?, TranscodeType> c8615e = this.f40221p;
        if (c8615e != null) {
            if (this.f40204B) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (c8615e.f40227v.equals(C8529e.m36750d())) {
                this.f40221p.f40227v = this.f40227v;
            }
            C8615e<?, ?, ?, TranscodeType> c8615e2 = this.f40221p;
            if (c8615e2.f40225t == null) {
                c8615e2.f40225t = m36992j();
            }
            if (C9242h.m38973k(this.f40229x, this.f40228w)) {
                C8615e<?, ?, ?, TranscodeType> c8615e3 = this.f40221p;
                if (!C9242h.m38973k(c8615e3.f40229x, c8615e3.f40228w)) {
                    this.f40221p.mo36968o(this.f40229x, this.f40228w);
                }
            }
            c7958f2 = new C7958f(c7958f);
            m36995n = m36995n(interfaceC8630j, this.f40222q.floatValue(), this.f40225t, c7958f2);
            this.f40204B = true;
            m36995n2 = this.f40221p.m36991e(interfaceC8630j, c7958f2);
            this.f40204B = false;
        } else {
            if (this.f40220o == null) {
                return m36995n(interfaceC8630j, this.f40222q.floatValue(), this.f40225t, c7958f);
            }
            c7958f2 = new C7958f(c7958f);
            m36995n = m36995n(interfaceC8630j, this.f40222q.floatValue(), this.f40225t, c7958f2);
            m36995n2 = m36995n(interfaceC8630j, this.f40220o.floatValue(), m36992j(), c7958f2);
        }
        c7958f2.m34513k(m36995n, m36995n2);
        return c7958f2;
    }

    @Override // 
    /* renamed from: g */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> mo36965g() {
        try {
            C8615e<ModelType, DataType, ResourceType, TranscodeType> c8615e = (C8615e) super.clone();
            C7752a<ModelType, DataType, ResourceType, TranscodeType> c7752a = this.f40213h;
            c8615e.f40213h = c7752a != null ? c7752a.clone() : null;
            return c8615e;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: h */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> mo36966h(InterfaceC9648e<DataType, ResourceType> interfaceC9648e) {
        C7752a<ModelType, DataType, ResourceType, TranscodeType> c7752a = this.f40213h;
        if (c7752a != null) {
            c7752a.m33908i(interfaceC9648e);
        }
        return this;
    }

    /* renamed from: i */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> mo36967i(EnumC10038b enumC10038b) {
        this.f40230y = enumC10038b;
        return this;
    }

    /* renamed from: j */
    public final EnumC8619i m36992j() {
        EnumC8619i enumC8619i = this.f40225t;
        return enumC8619i == EnumC8619i.LOW ? EnumC8619i.NORMAL : enumC8619i == EnumC8619i.NORMAL ? EnumC8619i.HIGH : EnumC8619i.IMMEDIATE;
    }

    /* renamed from: k */
    public InterfaceC8630j<TranscodeType> mo36984k(ImageView imageView) {
        C9242h.m38963a();
        if (imageView == null) {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (!this.f40203A && imageView.getScaleType() != null) {
            int i10 = a.f40232a[imageView.getScaleType().ordinal()];
            if (i10 == 1) {
                mo36963b();
            } else if (i10 == 2 || i10 == 3 || i10 == 4) {
                mo36964c();
            }
        }
        return m36993l(this.f40209d.m37006c(imageView, this.f40210e));
    }

    /* renamed from: l */
    public <Y extends InterfaceC8630j<TranscodeType>> Y m36993l(Y y10) {
        C9242h.m38963a();
        if (y10 == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        }
        if (!this.f40216k) {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        InterfaceC7954b mo37043f = y10.mo37043f();
        if (mo37043f != null) {
            mo37043f.clear();
            this.f40211f.m31828c(mo37043f);
            mo37043f.mo34485b();
        }
        InterfaceC7954b m36990d = m36990d(y10);
        y10.mo37045h(m36990d);
        this.f40212g.mo31798a(y10);
        this.f40211f.m31831f(m36990d);
        return y10;
    }

    /* renamed from: m */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> m36994m(ModelType modeltype) {
        this.f40214i = modeltype;
        this.f40216k = true;
        return this;
    }

    /* renamed from: n */
    public final InterfaceC7954b m36995n(InterfaceC8630j<TranscodeType> interfaceC8630j, float f10, EnumC8619i enumC8619i, InterfaceC7955c interfaceC7955c) {
        return C7953a.m34483t(this.f40213h, this.f40214i, this.f40215j, this.f40208c, enumC8619i, interfaceC8630j, f10, this.f40223r, this.f40217l, this.f40224s, this.f40218m, this.f40205C, this.f40206D, this.f40219n, interfaceC7955c, this.f40209d.m37015p(), this.f40231z, this.f40210e, this.f40226u, this.f40227v, this.f40229x, this.f40228w, this.f40230y);
    }

    /* renamed from: o */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> mo36968o(int i10, int i11) {
        if (!C9242h.m38973k(i10, i11)) {
            throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
        }
        this.f40229x = i10;
        this.f40228w = i11;
        return this;
    }

    /* renamed from: p */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> mo36969p(InterfaceC9646c interfaceC9646c) {
        if (interfaceC9646c == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f40215j = interfaceC9646c;
        return this;
    }

    /* renamed from: r */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> mo36970r(boolean z10) {
        this.f40226u = !z10;
        return this;
    }

    /* renamed from: s */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> m36996s(InterfaceC9645b<DataType> interfaceC9645b) {
        C7752a<ModelType, DataType, ResourceType, TranscodeType> c7752a = this.f40213h;
        if (c7752a != null) {
            c7752a.m33909j(interfaceC9645b);
        }
        return this;
    }

    /* renamed from: u */
    public C8615e<ModelType, DataType, ResourceType, TranscodeType> mo36971u(InterfaceC9650g<ResourceType>... interfaceC9650gArr) {
        this.f40203A = true;
        if (interfaceC9650gArr.length == 1) {
            this.f40231z = interfaceC9650gArr[0];
        } else {
            this.f40231z = new C9647d(interfaceC9650gArr);
        }
        return this;
    }
}
