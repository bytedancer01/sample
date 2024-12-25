package p438z6;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p047v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p047v3.api.AdError;
import com.google.ads.interactivemedia.p047v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p047v3.api.AdEvent;
import com.google.ads.interactivemedia.p047v3.api.AdsLoader;
import com.google.ads.interactivemedia.p047v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p047v3.api.AdsRequest;
import com.google.ads.interactivemedia.p047v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p047v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p047v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.p047v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p047v3.api.UiElement;
import com.google.ads.interactivemedia.p047v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p047v3.api.player.VideoProgressUpdate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p027b9.C0848j;
import p027b9.C0858p;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z6/d.class
 */
/* renamed from: z6.d */
/* loaded from: combined.jar:classes2.jar:z6/d.class */
public final class C10064d {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z6/d$a.class
     */
    /* renamed from: z6.d$a */
    /* loaded from: combined.jar:classes2.jar:z6/d$a.class */
    public static final class a {

        /* renamed from: a */
        public final long f46205a;

        /* renamed from: b */
        public final int f46206b;

        /* renamed from: c */
        public final int f46207c;

        /* renamed from: d */
        public final boolean f46208d;

        /* renamed from: e */
        public final boolean f46209e;

        /* renamed from: f */
        public final int f46210f;

        /* renamed from: g */
        public final Boolean f46211g;

        /* renamed from: h */
        public final List<String> f46212h;

        /* renamed from: i */
        public final Set<UiElement> f46213i;

        /* renamed from: j */
        public final Collection<CompanionAdSlot> f46214j;

        /* renamed from: k */
        public final AdErrorEvent.AdErrorListener f46215k;

        /* renamed from: l */
        public final AdEvent.AdEventListener f46216l;

        /* renamed from: m */
        public final VideoAdPlayer.VideoAdPlayerCallback f46217m;

        /* renamed from: n */
        public final ImaSdkSettings f46218n;

        /* renamed from: o */
        public final boolean f46219o;

        public a(long j10, int i10, int i11, boolean z10, boolean z11, int i12, Boolean bool, List<String> list, Set<UiElement> set, Collection<CompanionAdSlot> collection, AdErrorEvent.AdErrorListener adErrorListener, AdEvent.AdEventListener adEventListener, VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback, ImaSdkSettings imaSdkSettings, boolean z12) {
            this.f46205a = j10;
            this.f46206b = i10;
            this.f46207c = i11;
            this.f46208d = z10;
            this.f46209e = z11;
            this.f46210f = i12;
            this.f46211g = bool;
            this.f46212h = list;
            this.f46213i = set;
            this.f46214j = collection;
            this.f46215k = adErrorListener;
            this.f46216l = adEventListener;
            this.f46217m = videoAdPlayerCallback;
            this.f46218n = imaSdkSettings;
            this.f46219o = z12;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z6/d$b.class
     */
    /* renamed from: z6.d$b */
    /* loaded from: combined.jar:classes2.jar:z6/d$b.class */
    public interface b {
        /* renamed from: a */
        AdsLoader mo42346a(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer);

        /* renamed from: b */
        AdDisplayContainer mo42347b(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer);

        /* renamed from: c */
        ImaSdkSettings mo42348c();

        /* renamed from: d */
        FriendlyObstruction mo42349d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

        /* renamed from: e */
        AdsRenderingSettings mo42350e();

        /* renamed from: f */
        AdsRequest mo42351f();

        /* renamed from: g */
        AdDisplayContainer mo42352g(Context context, VideoAdPlayer videoAdPlayer);
    }

    /* renamed from: a */
    public static long[] m42353a(List<Float> list) {
        if (list.isEmpty()) {
            return new long[]{0};
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            double floatValue = list.get(i11).floatValue();
            if (floatValue == -1.0d) {
                jArr[size - 1] = Long.MIN_VALUE;
            } else {
                jArr[i10] = Math.round(floatValue * 1000000.0d);
                i10++;
            }
        }
        Arrays.sort(jArr, 0, i10);
        return jArr;
    }

    /* renamed from: b */
    public static AdsRequest m42354b(b bVar, C0858p c0858p) {
        AdsRequest mo42351f = bVar.mo42351f();
        if ("data".equals(c0858p.f5847a.getScheme())) {
            C0848j c0848j = new C0848j();
            try {
                c0848j.mo521a(c0858p);
                mo42351f.setAdsResponse(C4401z0.m22323F(C4401z0.m22340N0(c0848j)));
            } finally {
                c0848j.close();
            }
        } else {
            mo42351f.setAdTagUrl(c0858p.f5847a.toString());
        }
        return mo42351f;
    }

    /* renamed from: c */
    public static FriendlyObstructionPurpose m42355c(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 3 ? FriendlyObstructionPurpose.OTHER : FriendlyObstructionPurpose.NOT_VISIBLE : FriendlyObstructionPurpose.CLOSE_AD : FriendlyObstructionPurpose.VIDEO_CONTROLS;
    }

    /* renamed from: d */
    public static Looper m42356d() {
        return Looper.getMainLooper();
    }

    /* renamed from: e */
    public static String m42357e(VideoProgressUpdate videoProgressUpdate) {
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY.equals(videoProgressUpdate) ? "not ready" : C4401z0.m22321E("%d ms of %d ms", Long.valueOf(videoProgressUpdate.getCurrentTimeMs()), Long.valueOf(videoProgressUpdate.getDurationMs()));
    }

    /* renamed from: f */
    public static boolean m42358f(AdError adError) {
        return adError.getErrorCode() == AdError.AdErrorCode.VAST_LINEAR_ASSET_MISMATCH || adError.getErrorCode() == AdError.AdErrorCode.UNKNOWN_ERROR;
    }
}
