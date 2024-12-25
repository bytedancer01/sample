package p438z6;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p047v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p047v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p047v3.api.AdEvent;
import com.google.ads.interactivemedia.p047v3.api.AdsLoader;
import com.google.ads.interactivemedia.p047v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p047v3.api.AdsRequest;
import com.google.ads.interactivemedia.p047v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p047v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p047v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.p047v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.p047v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p047v3.api.UiElement;
import com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p009a8.C0083a1;
import p026b8.C0825f;
import p026b8.InterfaceC0822c;
import p027b9.C0858p;
import p059d9.C4349a;
import p059d9.C4401z0;
import p078e9.C4670d0;
import p078e9.C4682p;
import p099fc.AbstractC4834t;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7565c1;
import p267p6.C7583h;
import p267p6.C7597l1;
import p267p6.C7603n1;
import p267p6.C7609p1;
import p267p6.C7612q1;
import p267p6.C7623u0;
import p267p6.InterfaceC7606o1;
import p283q7.C7839a;
import p301r6.C7972d;
import p347u6.C8795a;
import p421y8.C9888l;
import p438z6.C10064d;
import p440z8.InterfaceC10075b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z6/c.class
 */
/* renamed from: z6.c */
/* loaded from: combined.jar:classes2.jar:z6/c.class */
public final class C10063c implements InterfaceC7606o1.e, InterfaceC0822c {

    /* renamed from: b */
    public final C10064d.a f46176b;

    /* renamed from: c */
    public final Context f46177c;

    /* renamed from: d */
    public final C10064d.b f46178d;

    /* renamed from: e */
    public final HashMap<Object, C10062b> f46179e;

    /* renamed from: f */
    public final HashMap<C0825f, C10062b> f46180f;

    /* renamed from: g */
    public final AbstractC7574e2.b f46181g;

    /* renamed from: h */
    public final AbstractC7574e2.c f46182h;

    /* renamed from: i */
    public boolean f46183i;

    /* renamed from: j */
    public InterfaceC7606o1 f46184j;

    /* renamed from: k */
    public List<String> f46185k;

    /* renamed from: l */
    public InterfaceC7606o1 f46186l;

    /* renamed from: m */
    public C10062b f46187m;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z6/c$b.class
     */
    /* renamed from: z6.c$b */
    /* loaded from: combined.jar:classes2.jar:z6/c$b.class */
    public static final class b {

        /* renamed from: a */
        public final Context f46188a;

        /* renamed from: b */
        public ImaSdkSettings f46189b;

        /* renamed from: c */
        public AdErrorEvent.AdErrorListener f46190c;

        /* renamed from: d */
        public AdEvent.AdEventListener f46191d;

        /* renamed from: e */
        public VideoAdPlayer.VideoAdPlayerCallback f46192e;

        /* renamed from: f */
        public List<String> f46193f;

        /* renamed from: g */
        public Set<UiElement> f46194g;

        /* renamed from: h */
        public Collection<CompanionAdSlot> f46195h;

        /* renamed from: i */
        public Boolean f46196i;

        /* renamed from: p */
        public boolean f46203p;

        /* renamed from: j */
        public long f46197j = 10000;

        /* renamed from: k */
        public int f46198k = -1;

        /* renamed from: l */
        public int f46199l = -1;

        /* renamed from: m */
        public int f46200m = -1;

        /* renamed from: n */
        public boolean f46201n = true;

        /* renamed from: o */
        public boolean f46202o = true;

        /* renamed from: q */
        public C10064d.b f46204q = new c();

        public b(Context context) {
            this.f46188a = ((Context) C4349a.m21882e(context)).getApplicationContext();
        }

        /* renamed from: a */
        public C10063c m42345a() {
            return new C10063c(this.f46188a, new C10064d.a(this.f46197j, this.f46198k, this.f46199l, this.f46201n, this.f46202o, this.f46200m, this.f46196i, this.f46193f, this.f46194g, this.f46195h, this.f46190c, this.f46191d, this.f46192e, this.f46189b, this.f46203p), this.f46204q);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z6/c$c.class
     */
    /* renamed from: z6.c$c */
    /* loaded from: combined.jar:classes2.jar:z6/c$c.class */
    public static final class c implements C10064d.b {
        public c() {
        }

        @Override // p438z6.C10064d.b
        /* renamed from: a */
        public AdsLoader mo42346a(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
            return ImaSdkFactory.getInstance().createAdsLoader(context, imaSdkSettings, adDisplayContainer);
        }

        @Override // p438z6.C10064d.b
        /* renamed from: b */
        public AdDisplayContainer mo42347b(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAdDisplayContainer(viewGroup, videoAdPlayer);
        }

        @Override // p438z6.C10064d.b
        /* renamed from: c */
        public ImaSdkSettings mo42348c() {
            ImaSdkSettings createImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
            createImaSdkSettings.setLanguage(C4401z0.m22387h0()[0]);
            return createImaSdkSettings;
        }

        @Override // p438z6.C10064d.b
        /* renamed from: d */
        public FriendlyObstruction mo42349d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
            return ImaSdkFactory.getInstance().createFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }

        @Override // p438z6.C10064d.b
        /* renamed from: e */
        public AdsRenderingSettings mo42350e() {
            return ImaSdkFactory.getInstance().createAdsRenderingSettings();
        }

        @Override // p438z6.C10064d.b
        /* renamed from: f */
        public AdsRequest mo42351f() {
            return ImaSdkFactory.getInstance().createAdsRequest();
        }

        @Override // p438z6.C10064d.b
        /* renamed from: g */
        public AdDisplayContainer mo42352g(Context context, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAudioAdDisplayContainer(context, videoAdPlayer);
        }
    }

    static {
        C7623u0.m33152a("goog.exo.ima");
    }

    public C10063c(Context context, C10064d.a aVar, C10064d.b bVar) {
        this.f46177c = context.getApplicationContext();
        this.f46176b = aVar;
        this.f46178d = bVar;
        this.f46185k = AbstractC4834t.m24539E();
        this.f46179e = new HashMap<>();
        this.f46180f = new HashMap<>();
        this.f46181g = new AbstractC7574e2.b();
        this.f46182h = new AbstractC7574e2.c();
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: A */
    public /* synthetic */ void mo12514A(C7597l1 c7597l1) {
        C7612q1.m32997p(this, c7597l1);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: C */
    public /* synthetic */ void mo12515C(InterfaceC7606o1 interfaceC7606o1, InterfaceC7606o1.d dVar) {
        C7612q1.m32987f(this, interfaceC7606o1, dVar);
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: D */
    public /* synthetic */ void mo12516D() {
        C7612q1.m33000s(this);
    }

    @Override // p243o8.InterfaceC6929k
    /* renamed from: E */
    public /* synthetic */ void mo12517E(List list) {
        C7612q1.m32984c(this, list);
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: I */
    public /* synthetic */ void mo12518I(int i10, int i11) {
        C7612q1.m33004w(this, i10, i11);
    }

    @Override // p283q7.InterfaceC7844f
    /* renamed from: L */
    public /* synthetic */ void mo12519L(C7839a c7839a) {
        C7612q1.m32992k(this, c7839a);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: M */
    public /* synthetic */ void mo12520M(int i10) {
        C7609p1.m32891l(this, i10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: N */
    public /* synthetic */ void mo12521N(boolean z10) {
        C7612q1.m32988g(this, z10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: O */
    public /* synthetic */ void mo12522O() {
        C7609p1.m32894o(this);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: Q */
    public /* synthetic */ void mo12523Q(InterfaceC7606o1.b bVar) {
        C7612q1.m32983b(this, bVar);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: R */
    public /* synthetic */ void mo12524R(C7597l1 c7597l1) {
        C7612q1.m32998q(this, c7597l1);
    }

    @Override // p301r6.InterfaceC7978g
    /* renamed from: S */
    public /* synthetic */ void mo12525S(C7972d c7972d) {
        C7612q1.m32982a(this, c7972d);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: Y */
    public /* synthetic */ void mo12526Y(boolean z10, int i10) {
        C7609p1.m32890k(this, z10, i10);
    }

    @Override // p301r6.InterfaceC7978g
    /* renamed from: a */
    public /* synthetic */ void mo12527a(boolean z10) {
        C7612q1.m33003v(this, z10);
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: a0 */
    public /* synthetic */ void mo12528a0(int i10, int i11, int i12, float f10) {
        C4682p.m23609a(this, i10, i11, i12, f10);
    }

    @Override // p026b8.InterfaceC0822c
    /* renamed from: b */
    public void mo5249b(C0825f c0825f, C0858p c0858p, Object obj, InterfaceC10075b interfaceC10075b, InterfaceC0822c.a aVar) {
        C4349a.m21885h(this.f46183i, "Set player using adsLoader.setPlayer before preparing the player.");
        if (this.f46180f.isEmpty()) {
            InterfaceC7606o1 interfaceC7606o1 = this.f46184j;
            this.f46186l = interfaceC7606o1;
            if (interfaceC7606o1 == null) {
                return;
            } else {
                interfaceC7606o1.mo32447g(this);
            }
        }
        C10062b c10062b = this.f46179e.get(obj);
        C10062b c10062b2 = c10062b;
        if (c10062b == null) {
            m42344r(c0858p, obj, interfaceC10075b.getAdViewGroup());
            c10062b2 = this.f46179e.get(obj);
        }
        this.f46180f.put(c0825f, (C10062b) C4349a.m21882e(c10062b2));
        c10062b2.m42323c0(aVar, interfaceC10075b);
        m42343q();
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: c */
    public /* synthetic */ void mo12529c(C4670d0 c4670d0) {
        C7612q1.m33007z(this, c4670d0);
    }

    @Override // p026b8.InterfaceC0822c
    /* renamed from: d */
    public void mo5250d(C0825f c0825f, int i10, int i11) {
        if (this.f46186l == null) {
            return;
        }
        ((C10062b) C4349a.m21882e(this.f46180f.get(c0825f))).m42338x0(i10, i11);
    }

    @Override // p347u6.InterfaceC8796b
    /* renamed from: d0 */
    public /* synthetic */ void mo12531d0(C8795a c8795a) {
        C7612q1.m32985d(this, c8795a);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: e */
    public /* synthetic */ void mo12532e(C7603n1 c7603n1) {
        C7612q1.m32994m(this, c7603n1);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: e0 */
    public /* synthetic */ void mo12533e0(C0083a1 c0083a1, C9888l c9888l) {
        C7612q1.m33006y(this, c0083a1, c9888l);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: f */
    public /* synthetic */ void mo12534f(int i10) {
        C7612q1.m32996o(this, i10);
    }

    @Override // p026b8.InterfaceC0822c
    /* renamed from: g */
    public void mo5251g(int... iArr) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 == 0) {
                obj = "application/dash+xml";
            } else if (i10 == 2) {
                obj = "application/x-mpegURL";
            } else {
                if (i10 == 4) {
                    arrayList.addAll(Arrays.asList("video/mp4", "video/webm", "video/3gpp", "audio/mp4", "audio/mpeg"));
                }
            }
            arrayList.add(obj);
        }
        this.f46185k = Collections.unmodifiableList(arrayList);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: g0 */
    public /* synthetic */ void mo12535g0(boolean z10, int i10) {
        C7612q1.m32993l(this, z10, i10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: h */
    public /* synthetic */ void mo12536h(boolean z10) {
        C7609p1.m32883d(this, z10);
    }

    @Override // p026b8.InterfaceC0822c
    /* renamed from: i */
    public void mo5252i(C0825f c0825f, int i10, int i11, IOException iOException) {
        if (this.f46186l == null) {
            return;
        }
        ((C10062b) C4349a.m21882e(this.f46180f.get(c0825f))).m42339y0(i10, i11, iOException);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: i0 */
    public void mo12537i0(InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, int i10) {
        m42343q();
        m42342o();
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: j */
    public /* synthetic */ void mo12538j(List list) {
        C7609p1.m32896q(this, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r4.mo32469s() == p438z6.C10064d.m42356d()) goto L10;
     */
    @Override // p026b8.InterfaceC0822c
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5253k(p267p6.InterfaceC7606o1 r4) {
        /*
            r3 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            r8 = r0
            android.os.Looper r0 = p438z6.C10064d.m42356d()
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r8
            r1 = r7
            if (r0 != r1) goto L18
            r0 = 1
            r5 = r0
            goto L1a
        L18:
            r0 = 0
            r5 = r0
        L1a:
            r0 = r5
            p059d9.C4349a.m21884g(r0)
            r0 = r4
            if (r0 == 0) goto L30
            r0 = r6
            r5 = r0
            r0 = r4
            android.os.Looper r0 = r0.mo32469s()
            android.os.Looper r1 = p438z6.C10064d.m42356d()
            if (r0 != r1) goto L32
        L30:
            r0 = 1
            r5 = r0
        L32:
            r0 = r5
            p059d9.C4349a.m21884g(r0)
            r0 = r3
            r1 = r4
            r0.f46184j = r1
            r0 = r3
            r1 = 1
            r0.f46183i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p438z6.C10063c.mo5253k(p6.o1):void");
    }

    @Override // p026b8.InterfaceC0822c
    /* renamed from: l */
    public void mo5254l(C0825f c0825f, InterfaceC0822c.a aVar) {
        C10062b remove = this.f46180f.remove(c0825f);
        m42343q();
        if (remove != null) {
            remove.m42313M0(aVar);
        }
        if (this.f46186l == null || !this.f46180f.isEmpty()) {
            return;
        }
        this.f46186l.mo32410A(this);
        this.f46186l = null;
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: m */
    public /* synthetic */ void mo12539m(int i10) {
        C7612q1.m32995n(this, i10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: m0 */
    public /* synthetic */ void mo12540m0(boolean z10) {
        C7612q1.m32989h(this, z10);
    }

    /* renamed from: n */
    public final C10062b m42341n() {
        Object m32676h;
        C10062b c10062b;
        InterfaceC7606o1 interfaceC7606o1 = this.f46186l;
        if (interfaceC7606o1 == null) {
            return null;
        }
        AbstractC7574e2 mo32467r = interfaceC7606o1.mo32467r();
        if (mo32467r.m32667q() || (m32676h = mo32467r.m32663f(interfaceC7606o1.mo32412C(), this.f46181g).m32676h()) == null || (c10062b = this.f46179e.get(m32676h)) == null || !this.f46180f.containsValue(c10062b)) {
            return null;
        }
        return c10062b;
    }

    /* renamed from: o */
    public final void m42342o() {
        int m32662d;
        C10062b c10062b;
        InterfaceC7606o1 interfaceC7606o1 = this.f46186l;
        if (interfaceC7606o1 == null) {
            return;
        }
        AbstractC7574e2 mo32467r = interfaceC7606o1.mo32467r();
        if (mo32467r.m32667q() || (m32662d = mo32467r.m32662d(interfaceC7606o1.mo32412C(), this.f46181g, this.f46182h, interfaceC7606o1.getRepeatMode(), interfaceC7606o1.mo32420K())) == -1) {
            return;
        }
        mo32467r.m32663f(m32662d, this.f46181g);
        Object m32676h = this.f46181g.m32676h();
        if (m32676h == null || (c10062b = this.f46179e.get(m32676h)) == null || c10062b == this.f46187m) {
            return;
        }
        AbstractC7574e2.c cVar = this.f46182h;
        AbstractC7574e2.b bVar = this.f46181g;
        c10062b.m42308H0(C7583h.m32761e(((Long) mo32467r.m32664j(cVar, bVar, bVar.f36711c, -9223372036854775807L).second).longValue()), C7583h.m32761e(this.f46181g.f36712d));
    }

    @Override // p267p6.InterfaceC7606o1.c
    public void onRepeatModeChanged(int i10) {
        m42342o();
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: p */
    public void mo12541p(AbstractC7574e2 abstractC7574e2, int i10) {
        if (abstractC7574e2.m32667q()) {
            return;
        }
        m42343q();
        m42342o();
    }

    /* renamed from: q */
    public final void m42343q() {
        C10062b c10062b = this.f46187m;
        C10062b m42341n = m42341n();
        if (C4401z0.m22371c(c10062b, m42341n)) {
            return;
        }
        if (c10062b != null) {
            c10062b.m42324f0();
        }
        this.f46187m = m42341n;
        if (m42341n != null) {
            m42341n.m42322b0((InterfaceC7606o1) C4349a.m21882e(this.f46186l));
        }
    }

    /* renamed from: r */
    public void m42344r(C0858p c0858p, Object obj, ViewGroup viewGroup) {
        if (this.f46179e.containsKey(obj)) {
            return;
        }
        this.f46179e.put(obj, new C10062b(this.f46177c, this.f46176b, this.f46178d, this.f46185k, c0858p, obj, viewGroup));
    }

    @Override // p026b8.InterfaceC0822c
    public void release() {
        InterfaceC7606o1 interfaceC7606o1 = this.f46186l;
        if (interfaceC7606o1 != null) {
            interfaceC7606o1.mo32410A(this);
            this.f46186l = null;
            m42343q();
        }
        this.f46184j = null;
        Iterator<C10062b> it = this.f46180f.values().iterator();
        while (it.hasNext()) {
            it.next().m42312L0();
        }
        this.f46180f.clear();
        Iterator<C10062b> it2 = this.f46179e.values().iterator();
        while (it2.hasNext()) {
            it2.next().m42312L0();
        }
        this.f46179e.clear();
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: s */
    public void mo12542s(boolean z10) {
        m42342o();
    }

    @Override // p347u6.InterfaceC8796b
    /* renamed from: w */
    public /* synthetic */ void mo12543w(int i10, boolean z10) {
        C7612q1.m32986e(this, i10, z10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: x */
    public /* synthetic */ void mo12544x(C7561b1 c7561b1, int i10) {
        C7612q1.m32990i(this, c7561b1, i10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: y */
    public /* synthetic */ void mo12545y(C7565c1 c7565c1) {
        C7612q1.m32991j(this, c7565c1);
    }
}
