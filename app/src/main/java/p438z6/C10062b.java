package p438z6;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p047v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p047v3.api.AdError;
import com.google.ads.interactivemedia.p047v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p047v3.api.AdEvent;
import com.google.ads.interactivemedia.p047v3.api.AdPodInfo;
import com.google.ads.interactivemedia.p047v3.api.AdsLoader;
import com.google.ads.interactivemedia.p047v3.api.AdsManager;
import com.google.ads.interactivemedia.p047v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.p047v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p047v3.api.AdsRequest;
import com.google.ads.interactivemedia.p047v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p047v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p047v3.api.UiElement;
import com.google.ads.interactivemedia.p047v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p047v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p047v3.api.player.VideoProgressUpdate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p009a8.C0083a1;
import p026b8.C0820a;
import p026b8.C0825f;
import p026b8.InterfaceC0822c;
import p027b9.C0858p;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p078e9.C4670d0;
import p078e9.C4682p;
import p099fc.C4826p;
import p099fc.InterfaceC4810h;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7565c1;
import p267p6.C7583h;
import p267p6.C7597l1;
import p267p6.C7603n1;
import p267p6.C7609p1;
import p267p6.C7612q1;
import p267p6.InterfaceC7606o1;
import p283q7.C7839a;
import p301r6.C7972d;
import p347u6.C8795a;
import p421y8.C9888l;
import p421y8.C9890n;
import p438z6.C10064d;
import p440z8.C10072a;
import p440z8.InterfaceC10075b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z6/b.class
 */
/* renamed from: z6.b */
/* loaded from: combined.jar:classes2.jar:z6/b.class */
public final class C10062b implements InterfaceC7606o1.e {

    /* renamed from: A */
    public boolean f46132A;

    /* renamed from: B */
    public boolean f46133B;

    /* renamed from: C */
    public int f46134C;

    /* renamed from: D */
    public AdMediaInfo f46135D;

    /* renamed from: E */
    public b f46136E;

    /* renamed from: F */
    public boolean f46137F;

    /* renamed from: G */
    public boolean f46138G;

    /* renamed from: H */
    public boolean f46139H;

    /* renamed from: I */
    public int f46140I;

    /* renamed from: J */
    public b f46141J;

    /* renamed from: K */
    public long f46142K;

    /* renamed from: L */
    public long f46143L;

    /* renamed from: M */
    public long f46144M;

    /* renamed from: N */
    public boolean f46145N;

    /* renamed from: O */
    public long f46146O;

    /* renamed from: b */
    public final C10064d.a f46147b;

    /* renamed from: c */
    public final C10064d.b f46148c;

    /* renamed from: d */
    public final List<String> f46149d;

    /* renamed from: e */
    public final C0858p f46150e;

    /* renamed from: f */
    public final Object f46151f;

    /* renamed from: g */
    public final AbstractC7574e2.b f46152g;

    /* renamed from: h */
    public final Handler f46153h;

    /* renamed from: i */
    public final c f46154i;

    /* renamed from: j */
    public final List<InterfaceC0822c.a> f46155j;

    /* renamed from: k */
    public final List<VideoAdPlayer.VideoAdPlayerCallback> f46156k;

    /* renamed from: l */
    public final Runnable f46157l;

    /* renamed from: m */
    public final InterfaceC4810h<AdMediaInfo, b> f46158m;

    /* renamed from: n */
    public final AdDisplayContainer f46159n;

    /* renamed from: o */
    public final AdsLoader f46160o;

    /* renamed from: p */
    public Object f46161p;

    /* renamed from: q */
    public InterfaceC7606o1 f46162q;

    /* renamed from: r */
    public VideoProgressUpdate f46163r;

    /* renamed from: s */
    public VideoProgressUpdate f46164s;

    /* renamed from: t */
    public int f46165t;

    /* renamed from: u */
    public AdsManager f46166u;

    /* renamed from: v */
    public boolean f46167v;

    /* renamed from: w */
    public C0825f.a f46168w;

    /* renamed from: x */
    public AbstractC7574e2 f46169x;

    /* renamed from: y */
    public long f46170y;

    /* renamed from: z */
    public C0820a f46171z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z6/b$a.class
     */
    /* renamed from: z6.b$a */
    /* loaded from: combined.jar:classes2.jar:z6/b$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f46172a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x005d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType[] r0 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p438z6.C10062b.a.f46172a = r0
                r0 = r4
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.AD_BREAK_FETCH_ERROR     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L14:
                int[] r0 = p438z6.C10062b.a.f46172a     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L1f:
                int[] r0 = p438z6.C10062b.a.f46172a     // Catch: java.lang.NoSuchFieldError -> L51 java.lang.NoSuchFieldError -> L55
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.TAPPED     // Catch: java.lang.NoSuchFieldError -> L55
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L55
            L2a:
                int[] r0 = p438z6.C10062b.a.f46172a     // Catch: java.lang.NoSuchFieldError -> L55 java.lang.NoSuchFieldError -> L59
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CLICKED     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L35:
                int[] r0 = p438z6.C10062b.a.f46172a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CONTENT_RESUME_REQUESTED     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L40:
                int[] r0 = p438z6.C10062b.a.f46172a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.LOG     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L4c:
                return
            L4d:
                r4 = move-exception
                goto L14
            L51:
                r4 = move-exception
                goto L1f
            L55:
                r4 = move-exception
                goto L2a
            L59:
                r4 = move-exception
                goto L35
            L5d:
                r4 = move-exception
                goto L40
            L61:
                r4 = move-exception
                goto L4c
            */
            throw new UnsupportedOperationException("Method not decompiled: p438z6.C10062b.a.m46501clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z6/b$b.class
     */
    /* renamed from: z6.b$b */
    /* loaded from: combined.jar:classes2.jar:z6/b$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f46173a;

        /* renamed from: b */
        public final int f46174b;

        public b(int i10, int i11) {
            this.f46173a = i10;
            this.f46174b = i11;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f46173a != bVar.f46173a) {
                return false;
            }
            if (this.f46174b != bVar.f46174b) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return (this.f46173a * 31) + this.f46174b;
        }

        public String toString() {
            return "(" + this.f46173a + ", " + this.f46174b + ')';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z6/b$c.class
     */
    /* renamed from: z6.b$c */
    /* loaded from: combined.jar:classes2.jar:z6/b$c.class */
    public final class c implements AdsLoader.AdsLoadedListener, ContentProgressProvider, AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, VideoAdPlayer {

        /* renamed from: a */
        public final C10062b f46175a;

        public c(C10062b c10062b) {
            this.f46175a = c10062b;
        }

        public /* synthetic */ c(C10062b c10062b, a aVar) {
            this(c10062b);
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer
        public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            this.f46175a.f46156k.add(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.AdProgressProvider
        public VideoProgressUpdate getAdProgress() {
            throw new IllegalStateException("Unexpected call to getAdProgress when using preloading");
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.ContentProgressProvider
        public VideoProgressUpdate getContentProgress() {
            VideoProgressUpdate m42331q0 = this.f46175a.m42331q0();
            if (this.f46175a.f46147b.f46219o) {
                C4392v.m22268b("AdTagLoader", "Content progress: " + C10064d.m42357e(m42331q0));
            }
            if (this.f46175a.f46146O != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() - this.f46175a.f46146O >= 4000) {
                    this.f46175a.f46146O = -9223372036854775807L;
                    this.f46175a.m42335u0(new IOException("Ad preloading timed out"));
                    this.f46175a.m42307G0();
                }
            } else if (this.f46175a.f46144M != -9223372036854775807L && this.f46175a.f46162q != null && this.f46175a.f46162q.getPlaybackState() == 2 && this.f46175a.m42302B0()) {
                this.f46175a.f46146O = SystemClock.elapsedRealtime();
            }
            return m42331q0;
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.VolumeProvider
        public int getVolume() {
            return this.f46175a.m42333s0();
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer
        public void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            try {
                this.f46175a.m42303C0(adMediaInfo, adPodInfo);
            } catch (RuntimeException e10) {
                this.f46175a.m42306F0("loadAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
        public void onAdError(AdErrorEvent adErrorEvent) {
            AdError error = adErrorEvent.getError();
            if (this.f46175a.f46147b.f46219o) {
                C4392v.m22269c("AdTagLoader", "onAdError", error);
            }
            if (this.f46175a.f46166u == null) {
                this.f46175a.f46161p = null;
                this.f46175a.f46171z = new C0820a(this.f46175a.f46151f, new long[0]);
                this.f46175a.m42320T0();
            } else if (C10064d.m42358f(error)) {
                try {
                    this.f46175a.m42335u0(error);
                } catch (RuntimeException e10) {
                    this.f46175a.m42306F0("onAdError", e10);
                }
            }
            if (this.f46175a.f46168w == null) {
                this.f46175a.f46168w = C0825f.a.m5279c(error);
            }
            this.f46175a.m42307G0();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            AdEvent.AdEventType type = adEvent.getType();
            if (this.f46175a.f46147b.f46219o && type != AdEvent.AdEventType.AD_PROGRESS) {
                C4392v.m22268b("AdTagLoader", "onAdEvent: " + type);
            }
            try {
                this.f46175a.m42334t0(adEvent);
            } catch (RuntimeException e10) {
                this.f46175a.m42306F0("onAdEvent", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener
        public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            AdsManager adsManager = adsManagerLoadedEvent.getAdsManager();
            if (!C4401z0.m22371c(this.f46175a.f46161p, adsManagerLoadedEvent.getUserRequestContext())) {
                adsManager.destroy();
                return;
            }
            this.f46175a.f46161p = null;
            this.f46175a.f46166u = adsManager;
            adsManager.addAdErrorListener(this);
            if (this.f46175a.f46147b.f46215k != null) {
                adsManager.addAdErrorListener(this.f46175a.f46147b.f46215k);
            }
            adsManager.addAdEventListener(this);
            if (this.f46175a.f46147b.f46216l != null) {
                adsManager.addAdEventListener(this.f46175a.f46147b.f46216l);
            }
            try {
                this.f46175a.f46171z = new C0820a(this.f46175a.f46151f, C10064d.m42353a(adsManager.getAdCuePoints()));
                this.f46175a.m42320T0();
            } catch (RuntimeException e10) {
                this.f46175a.m42306F0("onAdsManagerLoaded", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer
        public void pauseAd(AdMediaInfo adMediaInfo) {
            try {
                this.f46175a.m42309I0(adMediaInfo);
            } catch (RuntimeException e10) {
                this.f46175a.m42306F0("pauseAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer
        public void playAd(AdMediaInfo adMediaInfo) {
            try {
                this.f46175a.m42311K0(adMediaInfo);
            } catch (RuntimeException e10) {
                this.f46175a.m42306F0("playAd", e10);
            }
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer
        public void release() {
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer
        public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            this.f46175a.f46156k.remove(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer
        public void stopAd(AdMediaInfo adMediaInfo) {
            try {
                this.f46175a.m42318R0(adMediaInfo);
            } catch (RuntimeException e10) {
                this.f46175a.m42306F0("stopAd", e10);
            }
        }
    }

    public C10062b(Context context, C10064d.a aVar, C10064d.b bVar, List<String> list, C0858p c0858p, Object obj, ViewGroup viewGroup) {
        this.f46147b = aVar;
        this.f46148c = bVar;
        ImaSdkSettings imaSdkSettings = aVar.f46218n;
        ImaSdkSettings imaSdkSettings2 = imaSdkSettings;
        if (imaSdkSettings == null) {
            ImaSdkSettings mo42348c = bVar.mo42348c();
            imaSdkSettings2 = mo42348c;
            if (aVar.f46219o) {
                mo42348c.setDebugMode(true);
                imaSdkSettings2 = mo42348c;
            }
        }
        imaSdkSettings2.setPlayerType("google/exo.ext.ima");
        imaSdkSettings2.setPlayerVersion("2.15.0");
        this.f46149d = list;
        this.f46150e = c0858p;
        this.f46151f = obj;
        this.f46152g = new AbstractC7574e2.b();
        this.f46153h = C4401z0.m22419x(C10064d.m42356d(), null);
        c cVar = new c(this, null);
        this.f46154i = cVar;
        this.f46155j = new ArrayList();
        ArrayList arrayList = new ArrayList(1);
        this.f46156k = arrayList;
        VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback = aVar.f46217m;
        if (videoAdPlayerCallback != null) {
            arrayList.add(videoAdPlayerCallback);
        }
        this.f46157l = new Runnable(this) { // from class: z6.a

            /* renamed from: b */
            public final C10062b f46131b;

            {
                this.f46131b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f46131b.m42321U0();
            }
        };
        this.f46158m = C4826p.m24486g();
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.f46163r = videoProgressUpdate;
        this.f46164s = videoProgressUpdate;
        this.f46142K = -9223372036854775807L;
        this.f46143L = -9223372036854775807L;
        this.f46144M = -9223372036854775807L;
        this.f46146O = -9223372036854775807L;
        this.f46170y = -9223372036854775807L;
        this.f46169x = AbstractC7574e2.f36706a;
        this.f46171z = C0820a.f5682g;
        this.f46159n = viewGroup != null ? bVar.mo42347b(viewGroup, cVar) : bVar.mo42352g(context, cVar);
        Collection<CompanionAdSlot> collection = aVar.f46214j;
        if (collection != null) {
            this.f46159n.setCompanionSlots(collection);
        }
        this.f46160o = m42314N0(context, imaSdkSettings2, this.f46159n);
    }

    /* renamed from: A0 */
    public static boolean m42273A0(C0820a c0820a) {
        int i10 = c0820a.f5686b;
        boolean z10 = false;
        if (i10 != 1) {
            if (i10 != 2) {
                return true;
            }
            if (c0820a.m5222b(0).f5692a != 0 || c0820a.m5222b(1).f5692a != Long.MIN_VALUE) {
                z10 = true;
            }
            return z10;
        }
        long j10 = c0820a.m5222b(0).f5692a;
        boolean z11 = false;
        if (j10 != 0) {
            z11 = false;
            if (j10 != Long.MIN_VALUE) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: p0 */
    public static long m42295p0(InterfaceC7606o1 interfaceC7606o1, AbstractC7574e2 abstractC7574e2, AbstractC7574e2.b bVar) {
        long mo32417H = interfaceC7606o1.mo32417H();
        return abstractC7574e2.m32667q() ? mo32417H : mo32417H - abstractC7574e2.m32663f(interfaceC7606o1.mo32412C(), bVar).m32682n();
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: A */
    public void mo12514A(C7597l1 c7597l1) {
        if (this.f46134C != 0) {
            AdMediaInfo adMediaInfo = (AdMediaInfo) C4349a.m21882e(this.f46135D);
            for (int i10 = 0; i10 < this.f46156k.size(); i10++) {
                this.f46156k.get(i10).onError(adMediaInfo);
            }
        }
    }

    /* renamed from: B0 */
    public final boolean m42302B0() {
        int m42332r0;
        InterfaceC7606o1 interfaceC7606o1 = this.f46162q;
        boolean z10 = false;
        if (interfaceC7606o1 == null || (m42332r0 = m42332r0()) == -1) {
            return false;
        }
        C0820a.a m5222b = this.f46171z.m5222b(m42332r0);
        int i10 = m5222b.f5693b;
        if (i10 != -1 && i10 != 0 && m5222b.f5695d[0] != 0) {
            return false;
        }
        if (C7583h.m32761e(m5222b.f5692a) - m42295p0(interfaceC7606o1, this.f46169x, this.f46152g) < this.f46147b.f46205a) {
            z10 = true;
        }
        return z10;
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: C */
    public /* synthetic */ void mo12515C(InterfaceC7606o1 interfaceC7606o1, InterfaceC7606o1.d dVar) {
        C7612q1.m32987f(this, interfaceC7606o1, dVar);
    }

    /* renamed from: C0 */
    public final void m42303C0(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.f46166u == null) {
            if (this.f46147b.f46219o) {
                C4392v.m22268b("AdTagLoader", "loadAd after release " + m42329n0(adMediaInfo) + ", ad pod " + adPodInfo);
                return;
            }
            return;
        }
        int m42327k0 = m42327k0(adPodInfo);
        int adPosition = adPodInfo.getAdPosition() - 1;
        b bVar = new b(m42327k0, adPosition);
        this.f46158m.mo24393a(adMediaInfo, bVar);
        if (this.f46147b.f46219o) {
            C4392v.m22268b("AdTagLoader", "loadAd " + m42329n0(adMediaInfo));
        }
        if (this.f46171z.m5225e(m42327k0, adPosition)) {
            return;
        }
        C0820a m5227g = this.f46171z.m5227g(bVar.f46173a, Math.max(adPodInfo.getTotalAds(), this.f46171z.m5222b(bVar.f46173a).f5695d.length));
        this.f46171z = m5227g;
        C0820a.a m5222b = m5227g.m5222b(bVar.f46173a);
        for (int i10 = 0; i10 < adPosition; i10++) {
            if (m5222b.f5695d[i10] == 0) {
                this.f46171z = this.f46171z.m5229i(m42327k0, i10);
            }
        }
        this.f46171z = this.f46171z.m5231k(bVar.f46173a, bVar.f46174b, Uri.parse(adMediaInfo.getUrl()));
        m42320T0();
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: D */
    public /* synthetic */ void mo12516D() {
        C7612q1.m33000s(this);
    }

    /* renamed from: D0 */
    public final void m42304D0(int i10) {
        C0820a.a m5222b = this.f46171z.m5222b(i10);
        C0820a.a aVar = m5222b;
        if (m5222b.f5693b == -1) {
            C0820a m5227g = this.f46171z.m5227g(i10, Math.max(1, m5222b.f5695d.length));
            this.f46171z = m5227g;
            aVar = m5227g.m5222b(i10);
        }
        for (int i11 = 0; i11 < aVar.f5693b; i11++) {
            if (aVar.f5695d[i11] == 0) {
                if (this.f46147b.f46219o) {
                    C4392v.m22268b("AdTagLoader", "Removing ad " + i11 + " in ad group " + i10);
                }
                this.f46171z = this.f46171z.m5229i(i10, i11);
            }
        }
        m42320T0();
        this.f46144M = -9223372036854775807L;
        this.f46142K = -9223372036854775807L;
    }

    @Override // p243o8.InterfaceC6929k
    /* renamed from: E */
    public /* synthetic */ void mo12517E(List list) {
        C7612q1.m32984c(this, list);
    }

    /* renamed from: E0 */
    public final void m42305E0(long j10, long j11) {
        AdsManager adsManager = this.f46166u;
        if (this.f46167v || adsManager == null) {
            return;
        }
        this.f46167v = true;
        AdsRenderingSettings m42317Q0 = m42317Q0(j10, j11);
        if (m42317Q0 == null) {
            m42325h0();
        } else {
            adsManager.init(m42317Q0);
            adsManager.start();
            if (this.f46147b.f46219o) {
                C4392v.m22268b("AdTagLoader", "Initialized with ads rendering settings: " + m42317Q0);
            }
        }
        m42320T0();
    }

    /* renamed from: F0 */
    public final void m42306F0(String str, Exception exc) {
        String str2 = "Internal error in " + str;
        C4392v.m22271e("AdTagLoader", str2, exc);
        int i10 = 0;
        while (true) {
            C0820a c0820a = this.f46171z;
            if (i10 >= c0820a.f5686b) {
                break;
            }
            this.f46171z = c0820a.m5235o(i10);
            i10++;
        }
        m42320T0();
        for (int i11 = 0; i11 < this.f46155j.size(); i11++) {
            this.f46155j.get(i11).mo5258d(C0825f.a.m5280d(new RuntimeException(str2, exc)), this.f46150e);
        }
    }

    /* renamed from: G0 */
    public final void m42307G0() {
        if (this.f46168w != null) {
            for (int i10 = 0; i10 < this.f46155j.size(); i10++) {
                this.f46155j.get(i10).mo5258d(this.f46168w, this.f46150e);
            }
            this.f46168w = null;
        }
    }

    /* renamed from: H0 */
    public void m42308H0(long j10, long j11) {
        m42305E0(j10, j11);
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: I */
    public /* synthetic */ void mo12518I(int i10, int i11) {
        C7612q1.m33004w(this, i10, i11);
    }

    /* renamed from: I0 */
    public final void m42309I0(AdMediaInfo adMediaInfo) {
        if (this.f46147b.f46219o) {
            C4392v.m22268b("AdTagLoader", "pauseAd " + m42329n0(adMediaInfo));
        }
        if (this.f46166u == null || this.f46134C == 0) {
            return;
        }
        if (this.f46147b.f46219o && !adMediaInfo.equals(this.f46135D)) {
            C4392v.m22275i("AdTagLoader", "Unexpected pauseAd for " + m42329n0(adMediaInfo) + ", expected " + m42329n0(this.f46135D));
        }
        this.f46134C = 2;
        for (int i10 = 0; i10 < this.f46156k.size(); i10++) {
            this.f46156k.get(i10).onPause(adMediaInfo);
        }
    }

    /* renamed from: J0 */
    public final void m42310J0() {
        this.f46134C = 0;
        if (this.f46145N) {
            this.f46144M = -9223372036854775807L;
            this.f46145N = false;
        }
    }

    /* renamed from: K0 */
    public final void m42311K0(AdMediaInfo adMediaInfo) {
        if (this.f46147b.f46219o) {
            C4392v.m22268b("AdTagLoader", "playAd " + m42329n0(adMediaInfo));
        }
        if (this.f46166u == null) {
            return;
        }
        if (this.f46134C == 1) {
            C4392v.m22275i("AdTagLoader", "Unexpected playAd without stopAd");
        }
        if (this.f46134C == 0) {
            this.f46142K = -9223372036854775807L;
            this.f46143L = -9223372036854775807L;
            this.f46134C = 1;
            this.f46135D = adMediaInfo;
            this.f46136E = (b) C4349a.m21882e(this.f46158m.get(adMediaInfo));
            for (int i10 = 0; i10 < this.f46156k.size(); i10++) {
                this.f46156k.get(i10).onPlay(adMediaInfo);
            }
            b bVar = this.f46141J;
            if (bVar != null && bVar.equals(this.f46136E)) {
                this.f46141J = null;
                for (int i11 = 0; i11 < this.f46156k.size(); i11++) {
                    this.f46156k.get(i11).onError(adMediaInfo);
                }
            }
            m42321U0();
        } else {
            this.f46134C = 1;
            C4349a.m21884g(adMediaInfo.equals(this.f46135D));
            for (int i12 = 0; i12 < this.f46156k.size(); i12++) {
                this.f46156k.get(i12).onResume(adMediaInfo);
            }
        }
        InterfaceC7606o1 interfaceC7606o1 = this.f46162q;
        if (interfaceC7606o1 == null || !interfaceC7606o1.mo32480y()) {
            ((AdsManager) C4349a.m21882e(this.f46166u)).pause();
        }
    }

    @Override // p283q7.InterfaceC7844f
    /* renamed from: L */
    public /* synthetic */ void mo12519L(C7839a c7839a) {
        C7612q1.m32992k(this, c7839a);
    }

    /* renamed from: L0 */
    public void m42312L0() {
        if (this.f46132A) {
            return;
        }
        this.f46132A = true;
        this.f46161p = null;
        m42325h0();
        this.f46160o.removeAdsLoadedListener(this.f46154i);
        this.f46160o.removeAdErrorListener(this.f46154i);
        AdErrorEvent.AdErrorListener adErrorListener = this.f46147b.f46215k;
        if (adErrorListener != null) {
            this.f46160o.removeAdErrorListener(adErrorListener);
        }
        this.f46160o.release();
        int i10 = 0;
        this.f46133B = false;
        this.f46134C = 0;
        this.f46135D = null;
        m42319S0();
        this.f46136E = null;
        this.f46168w = null;
        while (true) {
            C0820a c0820a = this.f46171z;
            if (i10 >= c0820a.f5686b) {
                m42320T0();
                return;
            } else {
                this.f46171z = c0820a.m5235o(i10);
                i10++;
            }
        }
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: M */
    public /* synthetic */ void mo12520M(int i10) {
        C7609p1.m32891l(this, i10);
    }

    /* renamed from: M0 */
    public void m42313M0(InterfaceC0822c.a aVar) {
        this.f46155j.remove(aVar);
        if (this.f46155j.isEmpty()) {
            this.f46159n.unregisterAllFriendlyObstructions();
        }
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: N */
    public /* synthetic */ void mo12521N(boolean z10) {
        C7612q1.m32988g(this, z10);
    }

    /* renamed from: N0 */
    public final AdsLoader m42314N0(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        AdsLoader mo42346a = this.f46148c.mo42346a(context, imaSdkSettings, adDisplayContainer);
        mo42346a.addAdErrorListener(this.f46154i);
        AdErrorEvent.AdErrorListener adErrorListener = this.f46147b.f46215k;
        if (adErrorListener != null) {
            mo42346a.addAdErrorListener(adErrorListener);
        }
        mo42346a.addAdsLoadedListener(this.f46154i);
        try {
            AdsRequest m42354b = C10064d.m42354b(this.f46148c, this.f46150e);
            Object obj = new Object();
            this.f46161p = obj;
            m42354b.setUserRequestContext(obj);
            Boolean bool = this.f46147b.f46211g;
            if (bool != null) {
                m42354b.setContinuousPlayback(bool.booleanValue());
            }
            int i10 = this.f46147b.f46206b;
            if (i10 != -1) {
                m42354b.setVastLoadTimeout(i10);
            }
            m42354b.setContentProgressProvider(this.f46154i);
            mo42346a.requestAds(m42354b);
            return mo42346a;
        } catch (IOException e10) {
            this.f46171z = new C0820a(this.f46151f, new long[0]);
            m42320T0();
            this.f46168w = C0825f.a.m5279c(e10);
            m42307G0();
            return mo42346a;
        }
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: O */
    public /* synthetic */ void mo12522O() {
        C7609p1.m32894o(this);
    }

    /* renamed from: O0 */
    public final void m42315O0() {
        b bVar = this.f46136E;
        if (bVar != null) {
            this.f46171z = this.f46171z.m5235o(bVar.f46173a);
            m42320T0();
        }
    }

    /* renamed from: P0 */
    public final void m42316P0() {
        for (int i10 = 0; i10 < this.f46156k.size(); i10++) {
            this.f46156k.get(i10).onContentComplete();
        }
        this.f46137F = true;
        int i11 = 0;
        if (this.f46147b.f46219o) {
            C4392v.m22268b("AdTagLoader", "adsLoader.contentComplete");
            i11 = 0;
        }
        while (true) {
            C0820a c0820a = this.f46171z;
            if (i11 >= c0820a.f5686b) {
                m42320T0();
                return;
            } else {
                if (c0820a.m5222b(i11).f5692a != Long.MIN_VALUE) {
                    this.f46171z = this.f46171z.m5235o(i11);
                }
                i11++;
            }
        }
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: Q */
    public /* synthetic */ void mo12523Q(InterfaceC7606o1.b bVar) {
        C7612q1.m32983b(this, bVar);
    }

    /* renamed from: Q0 */
    public final AdsRenderingSettings m42317Q0(long j10, long j11) {
        int i10;
        C0820a c0820a;
        AdsRenderingSettings mo42350e = this.f46148c.mo42350e();
        mo42350e.setEnablePreloading(true);
        List<String> list = this.f46147b.f46212h;
        if (list == null) {
            list = this.f46149d;
        }
        mo42350e.setMimeTypes(list);
        int i11 = this.f46147b.f46207c;
        if (i11 != -1) {
            mo42350e.setLoadVideoTimeout(i11);
        }
        int i12 = this.f46147b.f46210f;
        if (i12 != -1) {
            mo42350e.setBitrateKbps(i12 / 1000);
        }
        mo42350e.setFocusSkipButtonWhenAvailable(this.f46147b.f46208d);
        Set<UiElement> set = this.f46147b.f46213i;
        if (set != null) {
            mo42350e.setUiElements(set);
        }
        int m5224d = this.f46171z.m5224d(C7583h.m32760d(j10), C7583h.m32760d(j11));
        if (m5224d != -1) {
            int i13 = 0;
            if (this.f46171z.m5222b(m5224d).f5692a == C7583h.m32760d(j10) || this.f46147b.f46209e) {
                i10 = m5224d;
                if (m42273A0(this.f46171z)) {
                    this.f46144M = j10;
                    i10 = m5224d;
                }
            } else {
                i10 = m5224d + 1;
            }
            if (i10 > 0) {
                while (true) {
                    c0820a = this.f46171z;
                    if (i13 >= i10) {
                        break;
                    }
                    this.f46171z = c0820a.m5235o(i13);
                    i13++;
                }
                if (i10 == c0820a.f5686b) {
                    return null;
                }
                mo42350e.setPlayAdsAfterTime(c0820a.m5222b(i10).f5692a == Long.MIN_VALUE ? (this.f46171z.m5222b(i10 - 1).f5692a / 1000000.0d) + 1.0d : ((r0 + r0) / 2.0d) / 1000000.0d);
            }
        }
        return mo42350e;
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: R */
    public /* synthetic */ void mo12524R(C7597l1 c7597l1) {
        C7612q1.m32998q(this, c7597l1);
    }

    /* renamed from: R0 */
    public final void m42318R0(AdMediaInfo adMediaInfo) {
        if (this.f46147b.f46219o) {
            C4392v.m22268b("AdTagLoader", "stopAd " + m42329n0(adMediaInfo));
        }
        if (this.f46166u == null) {
            return;
        }
        if (this.f46134C == 0) {
            b bVar = this.f46158m.get(adMediaInfo);
            if (bVar != null) {
                this.f46171z = this.f46171z.m5234n(bVar.f46173a, bVar.f46174b);
                m42320T0();
                return;
            }
            return;
        }
        this.f46134C = 0;
        m42319S0();
        C4349a.m21882e(this.f46136E);
        b bVar2 = this.f46136E;
        int i10 = bVar2.f46173a;
        int i11 = bVar2.f46174b;
        if (this.f46171z.m5225e(i10, i11)) {
            return;
        }
        this.f46171z = this.f46171z.m5233m(i10, i11).m5230j(0L);
        m42320T0();
        if (this.f46138G) {
            return;
        }
        this.f46135D = null;
        this.f46136E = null;
    }

    @Override // p301r6.InterfaceC7978g
    /* renamed from: S */
    public /* synthetic */ void mo12525S(C7972d c7972d) {
        C7612q1.m32982a(this, c7972d);
    }

    /* renamed from: S0 */
    public final void m42319S0() {
        this.f46153h.removeCallbacks(this.f46157l);
    }

    /* renamed from: T0 */
    public final void m42320T0() {
        for (int i10 = 0; i10 < this.f46155j.size(); i10++) {
            this.f46155j.get(i10).mo5257c(this.f46171z);
        }
    }

    /* renamed from: U0 */
    public final void m42321U0() {
        VideoProgressUpdate m42330o0 = m42330o0();
        if (this.f46147b.f46219o) {
            C4392v.m22268b("AdTagLoader", "Ad progress: " + C10064d.m42357e(m42330o0));
        }
        AdMediaInfo adMediaInfo = (AdMediaInfo) C4349a.m21882e(this.f46135D);
        for (int i10 = 0; i10 < this.f46156k.size(); i10++) {
            this.f46156k.get(i10).onAdProgress(adMediaInfo, m42330o0);
        }
        this.f46153h.removeCallbacks(this.f46157l);
        this.f46153h.postDelayed(this.f46157l, 100L);
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

    /* renamed from: b0 */
    public void m42322b0(InterfaceC7606o1 interfaceC7606o1) {
        b bVar;
        this.f46162q = interfaceC7606o1;
        interfaceC7606o1.mo32447g(this);
        boolean mo32480y = interfaceC7606o1.mo32480y();
        mo12541p(interfaceC7606o1.mo32467r(), 1);
        AdsManager adsManager = this.f46166u;
        if (C0820a.f5682g.equals(this.f46171z) || adsManager == null || !this.f46133B) {
            return;
        }
        int m5224d = this.f46171z.m5224d(C7583h.m32760d(m42295p0(interfaceC7606o1, this.f46169x, this.f46152g)), C7583h.m32760d(this.f46170y));
        if (m5224d != -1 && (bVar = this.f46136E) != null && bVar.f46173a != m5224d) {
            if (this.f46147b.f46219o) {
                C4392v.m22268b("AdTagLoader", "Discarding preloaded ad " + this.f46136E);
            }
            adsManager.discardAdBreak();
        }
        if (mo32480y) {
            adsManager.resume();
        }
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: c */
    public /* synthetic */ void mo12529c(C4670d0 c4670d0) {
        C7612q1.m33007z(this, c4670d0);
    }

    /* renamed from: c0 */
    public void m42323c0(InterfaceC0822c.a aVar, InterfaceC10075b interfaceC10075b) {
        boolean isEmpty = this.f46155j.isEmpty();
        this.f46155j.add(aVar);
        if (!isEmpty) {
            if (C0820a.f5682g.equals(this.f46171z)) {
                return;
            }
            aVar.mo5257c(this.f46171z);
            return;
        }
        this.f46165t = 0;
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.f46164s = videoProgressUpdate;
        this.f46163r = videoProgressUpdate;
        m42307G0();
        if (!C0820a.f5682g.equals(this.f46171z)) {
            aVar.mo5257c(this.f46171z);
        } else if (this.f46166u != null) {
            this.f46171z = new C0820a(this.f46151f, C10064d.m42353a(this.f46166u.getAdCuePoints()));
            m42320T0();
        }
        for (C10072a c10072a : interfaceC10075b.getAdOverlayInfos()) {
            this.f46159n.registerFriendlyObstruction(this.f46148c.mo42349d(c10072a.f46238a, C10064d.m42355c(c10072a.f46239b), c10072a.f46240c));
        }
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

    /* renamed from: f0 */
    public void m42324f0() {
        InterfaceC7606o1 interfaceC7606o1 = (InterfaceC7606o1) C4349a.m21882e(this.f46162q);
        if (!C0820a.f5682g.equals(this.f46171z) && this.f46133B) {
            AdsManager adsManager = this.f46166u;
            if (adsManager != null) {
                adsManager.pause();
            }
            this.f46171z = this.f46171z.m5230j(this.f46138G ? C7583h.m32760d(interfaceC7606o1.getCurrentPosition()) : 0L);
        }
        this.f46165t = m42333s0();
        this.f46164s = m42330o0();
        this.f46163r = m42331q0();
        interfaceC7606o1.mo32410A(this);
        this.f46162q = null;
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: g0 */
    public void mo12535g0(boolean z10, int i10) {
        InterfaceC7606o1 interfaceC7606o1;
        AdsManager adsManager = this.f46166u;
        if (adsManager == null || (interfaceC7606o1 = this.f46162q) == null) {
            return;
        }
        int i11 = this.f46134C;
        if (i11 == 1 && !z10) {
            adsManager.pause();
        } else if (i11 == 2 && z10) {
            adsManager.resume();
        } else {
            m42337w0(z10, interfaceC7606o1.getPlaybackState());
        }
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: h */
    public /* synthetic */ void mo12536h(boolean z10) {
        C7609p1.m32883d(this, z10);
    }

    /* renamed from: h0 */
    public final void m42325h0() {
        AdsManager adsManager = this.f46166u;
        if (adsManager != null) {
            adsManager.removeAdErrorListener(this.f46154i);
            AdErrorEvent.AdErrorListener adErrorListener = this.f46147b.f46215k;
            if (adErrorListener != null) {
                this.f46166u.removeAdErrorListener(adErrorListener);
            }
            this.f46166u.removeAdEventListener(this.f46154i);
            AdEvent.AdEventListener adEventListener = this.f46147b.f46216l;
            if (adEventListener != null) {
                this.f46166u.removeAdEventListener(adEventListener);
            }
            this.f46166u.destroy();
            this.f46166u = null;
        }
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: i0 */
    public void mo12537i0(InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, int i10) {
        m42340z0();
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: j */
    public /* synthetic */ void mo12538j(List list) {
        C7609p1.m32896q(this, list);
    }

    /* renamed from: j0 */
    public final void m42326j0() {
        if (this.f46137F || this.f46170y == -9223372036854775807L || this.f46144M != -9223372036854775807L || m42295p0((InterfaceC7606o1) C4349a.m21882e(this.f46162q), this.f46169x, this.f46152g) + 5000 < this.f46170y) {
            return;
        }
        m42316P0();
    }

    /* renamed from: k0 */
    public final int m42327k0(AdPodInfo adPodInfo) {
        return adPodInfo.getPodIndex() == -1 ? this.f46171z.f5686b - 1 : m42328l0(adPodInfo.getTimeOffset());
    }

    /* renamed from: l0 */
    public final int m42328l0(double d10) {
        long round = Math.round(((float) d10) * 1000000.0d);
        int i10 = 0;
        while (true) {
            C0820a c0820a = this.f46171z;
            if (i10 >= c0820a.f5686b) {
                throw new IllegalStateException("Failed to find cue point");
            }
            long j10 = c0820a.m5222b(i10).f5692a;
            if (j10 != Long.MIN_VALUE && Math.abs(j10 - round) < 1000) {
                return i10;
            }
            i10++;
        }
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: m */
    public void mo12539m(int i10) {
        long j10;
        InterfaceC7606o1 interfaceC7606o1 = this.f46162q;
        if (this.f46166u == null || interfaceC7606o1 == null) {
            return;
        }
        if (i10 != 2 || interfaceC7606o1.mo32436a() || !m42302B0()) {
            if (i10 == 3) {
                j10 = -9223372036854775807L;
            }
            m42337w0(interfaceC7606o1.mo32480y(), i10);
        }
        j10 = SystemClock.elapsedRealtime();
        this.f46146O = j10;
        m42337w0(interfaceC7606o1.mo32480y(), i10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: m0 */
    public /* synthetic */ void mo12540m0(boolean z10) {
        C7612q1.m32989h(this, z10);
    }

    /* renamed from: n0 */
    public final String m42329n0(AdMediaInfo adMediaInfo) {
        b bVar = this.f46158m.get(adMediaInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdMediaInfo[");
        sb2.append(adMediaInfo == null ? "null" : adMediaInfo.getUrl());
        sb2.append(", ");
        sb2.append(bVar);
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: o0 */
    public final VideoProgressUpdate m42330o0() {
        InterfaceC7606o1 interfaceC7606o1 = this.f46162q;
        if (interfaceC7606o1 == null) {
            return this.f46164s;
        }
        if (this.f46134C == 0 || !this.f46138G) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        long duration = interfaceC7606o1.getDuration();
        return duration == -9223372036854775807L ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : new VideoProgressUpdate(this.f46162q.getCurrentPosition(), duration);
    }

    @Override // p267p6.InterfaceC7606o1.c
    public /* synthetic */ void onRepeatModeChanged(int i10) {
        C7612q1.m33001t(this, i10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: p */
    public void mo12541p(AbstractC7574e2 abstractC7574e2, int i10) {
        if (abstractC7574e2.m32667q()) {
            return;
        }
        this.f46169x = abstractC7574e2;
        InterfaceC7606o1 interfaceC7606o1 = (InterfaceC7606o1) C4349a.m21882e(this.f46162q);
        long j10 = abstractC7574e2.m32663f(interfaceC7606o1.mo32412C(), this.f46152g).f36712d;
        this.f46170y = C7583h.m32761e(j10);
        C0820a c0820a = this.f46171z;
        if (j10 != c0820a.f5688d) {
            this.f46171z = c0820a.m5232l(j10);
            m42320T0();
        }
        m42305E0(m42295p0(interfaceC7606o1, abstractC7574e2, this.f46152g), this.f46170y);
        m42340z0();
    }

    /* renamed from: q0 */
    public final VideoProgressUpdate m42331q0() {
        boolean z10 = this.f46170y != -9223372036854775807L;
        long j10 = this.f46144M;
        if (j10 != -9223372036854775807L) {
            this.f46145N = true;
        } else {
            InterfaceC7606o1 interfaceC7606o1 = this.f46162q;
            if (interfaceC7606o1 == null) {
                return this.f46163r;
            }
            if (this.f46142K != -9223372036854775807L) {
                j10 = this.f46143L + (SystemClock.elapsedRealtime() - this.f46142K);
            } else {
                if (this.f46134C != 0 || this.f46138G || !z10) {
                    return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
                }
                j10 = m42295p0(interfaceC7606o1, this.f46169x, this.f46152g);
            }
        }
        return new VideoProgressUpdate(j10, z10 ? this.f46170y : -1L);
    }

    /* renamed from: r0 */
    public final int m42332r0() {
        InterfaceC7606o1 interfaceC7606o1 = this.f46162q;
        if (interfaceC7606o1 == null) {
            return -1;
        }
        long m32760d = C7583h.m32760d(m42295p0(interfaceC7606o1, this.f46169x, this.f46152g));
        int m5224d = this.f46171z.m5224d(m32760d, C7583h.m32760d(this.f46170y));
        int i10 = m5224d;
        if (m5224d == -1) {
            i10 = this.f46171z.m5223c(m32760d, C7583h.m32760d(this.f46170y));
        }
        return i10;
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: s */
    public /* synthetic */ void mo12542s(boolean z10) {
        C7612q1.m33002u(this, z10);
    }

    /* renamed from: s0 */
    public final int m42333s0() {
        InterfaceC7606o1 interfaceC7606o1 = this.f46162q;
        if (interfaceC7606o1 == null) {
            return this.f46165t;
        }
        if (interfaceC7606o1.mo32658o(21)) {
            return (int) (interfaceC7606o1.getVolume() * 100.0f);
        }
        return C9890n.m41744b(interfaceC7606o1.mo32474v(), 1) ? 100 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: t0 */
    public final void m42334t0(AdEvent adEvent) {
        if (this.f46166u == null) {
        }
        switch (a.f46172a[adEvent.getType().ordinal()]) {
            case 1:
                String str = (String) C4349a.m21882e(adEvent.getAdData().get("adBreakTime"));
                if (this.f46147b.f46219o) {
                    C4392v.m22268b("AdTagLoader", "Fetch error for ad at " + str + " seconds");
                }
                double parseDouble = Double.parseDouble(str);
                m42304D0(parseDouble == -1.0d ? this.f46171z.f5686b - 1 : m42328l0(parseDouble));
                break;
            case 2:
                this.f46133B = true;
                m42310J0();
                break;
            case 3:
                for (int i10 = 0; i10 < this.f46155j.size(); i10++) {
                    this.f46155j.get(i10).mo5256b();
                }
                break;
            case 4:
                for (int i11 = 0; i11 < this.f46155j.size(); i11++) {
                    this.f46155j.get(i11).mo5255a();
                }
                break;
            case 5:
                this.f46133B = false;
                m42315O0();
                break;
            case 6:
                C4392v.m22273g("AdTagLoader", "AdEvent: " + adEvent.getAdData());
                break;
        }
    }

    /* renamed from: u0 */
    public final void m42335u0(Exception exc) {
        int m42332r0 = m42332r0();
        if (m42332r0 == -1) {
            C4392v.m22276j("AdTagLoader", "Unable to determine ad group index for ad group load error", exc);
            return;
        }
        m42304D0(m42332r0);
        if (this.f46168w == null) {
            this.f46168w = C0825f.a.m5278b(exc, m42332r0);
        }
    }

    /* renamed from: v0 */
    public final void m42336v0(int i10, int i11, Exception exc) {
        if (this.f46147b.f46219o) {
            C4392v.m22269c("AdTagLoader", "Prepare error for ad " + i11 + " in group " + i10, exc);
        }
        if (this.f46166u == null) {
            C4392v.m22275i("AdTagLoader", "Ignoring ad prepare error after release");
            return;
        }
        if (this.f46134C == 0) {
            this.f46142K = SystemClock.elapsedRealtime();
            long m32761e = C7583h.m32761e(this.f46171z.m5222b(i10).f5692a);
            this.f46143L = m32761e;
            if (m32761e == Long.MIN_VALUE) {
                this.f46143L = this.f46170y;
            }
            this.f46141J = new b(i10, i11);
        } else {
            AdMediaInfo adMediaInfo = (AdMediaInfo) C4349a.m21882e(this.f46135D);
            if (i11 > this.f46140I) {
                for (int i12 = 0; i12 < this.f46156k.size(); i12++) {
                    this.f46156k.get(i12).onEnded(adMediaInfo);
                }
            }
            this.f46140I = this.f46171z.m5222b(i10).m5238c();
            for (int i13 = 0; i13 < this.f46156k.size(); i13++) {
                this.f46156k.get(i13).onError((AdMediaInfo) C4349a.m21882e(adMediaInfo));
            }
        }
        this.f46171z = this.f46171z.m5229i(i10, i11);
        m42320T0();
    }

    @Override // p347u6.InterfaceC8796b
    /* renamed from: w */
    public /* synthetic */ void mo12543w(int i10, boolean z10) {
        C7612q1.m32986e(this, i10, z10);
    }

    /* renamed from: w0 */
    public final void m42337w0(boolean z10, int i10) {
        if (this.f46138G && this.f46134C == 1) {
            boolean z11 = this.f46139H;
            if (!z11 && i10 == 2) {
                this.f46139H = true;
                AdMediaInfo adMediaInfo = (AdMediaInfo) C4349a.m21882e(this.f46135D);
                for (int i11 = 0; i11 < this.f46156k.size(); i11++) {
                    this.f46156k.get(i11).onBuffering(adMediaInfo);
                }
                m42319S0();
            } else if (z11 && i10 == 3) {
                this.f46139H = false;
                m42321U0();
            }
        }
        int i12 = this.f46134C;
        if (i12 == 0 && i10 == 2 && z10) {
            m42326j0();
            return;
        }
        if (i12 == 0 || i10 != 4) {
            return;
        }
        AdMediaInfo adMediaInfo2 = this.f46135D;
        if (adMediaInfo2 == null) {
            C4392v.m22275i("AdTagLoader", "onEnded without ad media info");
        } else {
            for (int i13 = 0; i13 < this.f46156k.size(); i13++) {
                this.f46156k.get(i13).onEnded(adMediaInfo2);
            }
        }
        if (this.f46147b.f46219o) {
            C4392v.m22268b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onPlaybackStateChanged");
        }
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: x */
    public /* synthetic */ void mo12544x(C7561b1 c7561b1, int i10) {
        C7612q1.m32990i(this, c7561b1, i10);
    }

    /* renamed from: x0 */
    public void m42338x0(int i10, int i11) {
        b bVar = new b(i10, i11);
        if (this.f46147b.f46219o) {
            C4392v.m22268b("AdTagLoader", "Prepared ad " + bVar);
        }
        AdMediaInfo adMediaInfo = this.f46158m.mo24394x().get(bVar);
        if (adMediaInfo != null) {
            for (int i12 = 0; i12 < this.f46156k.size(); i12++) {
                this.f46156k.get(i12).onLoaded(adMediaInfo);
            }
            return;
        }
        C4392v.m22275i("AdTagLoader", "Unexpected prepared ad " + bVar);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: y */
    public /* synthetic */ void mo12545y(C7565c1 c7565c1) {
        C7612q1.m32991j(this, c7565c1);
    }

    /* renamed from: y0 */
    public void m42339y0(int i10, int i11, IOException iOException) {
        if (this.f46162q == null) {
            return;
        }
        try {
            m42336v0(i10, i11, iOException);
        } catch (RuntimeException e10) {
            m42306F0("handlePrepareError", e10);
        }
    }

    /* renamed from: z0 */
    public final void m42340z0() {
        InterfaceC7606o1 interfaceC7606o1 = this.f46162q;
        if (this.f46166u == null || interfaceC7606o1 == null) {
            return;
        }
        if (!this.f46138G && !interfaceC7606o1.mo32436a()) {
            m42326j0();
            if (!this.f46137F && !this.f46169x.m32667q()) {
                long m42295p0 = m42295p0(interfaceC7606o1, this.f46169x, this.f46152g);
                this.f46169x.m32663f(interfaceC7606o1.mo32412C(), this.f46152g);
                if (this.f46152g.m32673e(C7583h.m32760d(m42295p0)) != -1) {
                    this.f46145N = false;
                    this.f46144M = m42295p0;
                }
            }
        }
        boolean z10 = this.f46138G;
        int i10 = this.f46140I;
        boolean mo32436a = interfaceC7606o1.mo32436a();
        this.f46138G = mo32436a;
        int mo32415F = mo32436a ? interfaceC7606o1.mo32415F() : -1;
        this.f46140I = mo32415F;
        if (z10 && mo32415F != i10) {
            AdMediaInfo adMediaInfo = this.f46135D;
            if (adMediaInfo == null) {
                C4392v.m22275i("AdTagLoader", "onEnded without ad media info");
            } else {
                b bVar = this.f46158m.get(adMediaInfo);
                int i11 = this.f46140I;
                int i12 = 0;
                if (i11 != -1) {
                    if (bVar != null && bVar.f46174b < i11) {
                        i12 = 0;
                    }
                }
                while (i12 < this.f46156k.size()) {
                    this.f46156k.get(i12).onEnded(adMediaInfo);
                    i12++;
                }
                if (this.f46147b.f46219o) {
                    C4392v.m22268b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onTimelineChanged/onPositionDiscontinuity");
                }
            }
        }
        if (this.f46137F || z10 || !this.f46138G || this.f46134C != 0) {
            return;
        }
        C0820a.a m5222b = this.f46171z.m5222b(interfaceC7606o1.mo32460n());
        if (m5222b.f5692a == Long.MIN_VALUE) {
            m42316P0();
            return;
        }
        this.f46142K = SystemClock.elapsedRealtime();
        long m32761e = C7583h.m32761e(m5222b.f5692a);
        this.f46143L = m32761e;
        if (m32761e == Long.MIN_VALUE) {
            this.f46143L = this.f46170y;
        }
    }
}
