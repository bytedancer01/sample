package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import p304r9.C8013a;
import p323s9.C8550a;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/n.class
 */
/* renamed from: l9.n */
/* loaded from: combined.jar:classes2.jar:l9/n.class */
public class C5788n extends AbstractC10125a {
    public static final Parcelable.Creator<C5788n> CREATOR = new C5787m1();

    /* renamed from: d */
    public String f32319d;

    /* renamed from: e */
    public String f32320e;

    /* renamed from: f */
    public int f32321f;

    /* renamed from: g */
    public String f32322g;

    /* renamed from: h */
    public C5785m f32323h;

    /* renamed from: i */
    public int f32324i;

    /* renamed from: j */
    public List f32325j;

    /* renamed from: k */
    public int f32326k;

    /* renamed from: l */
    public long f32327l;

    /* renamed from: m */
    public boolean f32328m;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/n$a.class
     */
    /* renamed from: l9.n$a */
    /* loaded from: combined.jar:classes2.jar:l9/n$a.class */
    public static class a {

        /* renamed from: a */
        public final C5788n f32329a = new C5788n(null);

        /* renamed from: a */
        public C5788n m28276a() {
            return new C5788n(this.f32329a, null);
        }

        /* renamed from: b */
        public final a m28277b(JSONObject jSONObject) {
            C5788n.m28264Y(this.f32329a, jSONObject);
            return this;
        }
    }

    public C5788n() {
        m28275a0();
    }

    public C5788n(String str, String str2, int i10, String str3, C5785m c5785m, int i11, List list, int i12, long j10, boolean z10) {
        this.f32319d = str;
        this.f32320e = str2;
        this.f32321f = i10;
        this.f32322g = str3;
        this.f32323h = c5785m;
        this.f32324i = i11;
        this.f32325j = list;
        this.f32326k = i12;
        this.f32327l = j10;
        this.f32328m = z10;
    }

    public /* synthetic */ C5788n(C5784l1 c5784l1) {
        m28275a0();
    }

    public /* synthetic */ C5788n(C5788n c5788n, C5784l1 c5784l1) {
        this.f32319d = c5788n.f32319d;
        this.f32320e = c5788n.f32320e;
        this.f32321f = c5788n.f32321f;
        this.f32322g = c5788n.f32322g;
        this.f32323h = c5788n.f32323h;
        this.f32324i = c5788n.f32324i;
        this.f32325j = c5788n.f32325j;
        this.f32326k = c5788n.f32326k;
        this.f32327l = c5788n.f32327l;
        this.f32328m = c5788n.f32328m;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x026d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: Y */
    public static /* bridge */ /* synthetic */ void m28264Y(p200l9.C5788n r6, org.json.JSONObject r7) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200l9.C5788n.m28264Y(l9.n, org.json.JSONObject):void");
    }

    /* renamed from: P */
    public C5785m m28265P() {
        return this.f32323h;
    }

    /* renamed from: Q */
    public String m28266Q() {
        return this.f32320e;
    }

    /* renamed from: R */
    public List<C5791o> m28267R() {
        List list = this.f32325j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: S */
    public String m28268S() {
        return this.f32319d;
    }

    /* renamed from: T */
    public int m28269T() {
        return this.f32321f;
    }

    /* renamed from: U */
    public int m28270U() {
        return this.f32324i;
    }

    /* renamed from: V */
    public int m28271V() {
        return this.f32326k;
    }

    /* renamed from: W */
    public long m28272W() {
        return this.f32327l;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003b. Please report as an issue. */
    /* renamed from: X */
    public final JSONObject m28273X() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f32319d)) {
                jSONObject.put(Name.MARK, this.f32319d);
            }
            if (!TextUtils.isEmpty(this.f32320e)) {
                jSONObject.put("entity", this.f32320e);
            }
            switch (this.f32321f) {
                case 1:
                    obj = "ALBUM";
                    jSONObject.put("queueType", obj);
                    break;
                case 2:
                    obj = "PLAYLIST";
                    jSONObject.put("queueType", obj);
                    break;
                case 3:
                    obj = "AUDIOBOOK";
                    jSONObject.put("queueType", obj);
                    break;
                case 4:
                    obj = "RADIO_STATION";
                    jSONObject.put("queueType", obj);
                    break;
                case 5:
                    obj = "PODCAST_SERIES";
                    jSONObject.put("queueType", obj);
                    break;
                case 6:
                    obj = "TV_SERIES";
                    jSONObject.put("queueType", obj);
                    break;
                case 7:
                    obj = "VIDEO_PLAYLIST";
                    jSONObject.put("queueType", obj);
                    break;
                case 8:
                    obj = "LIVE_TV";
                    jSONObject.put("queueType", obj);
                    break;
                case 9:
                    obj = "MOVIE";
                    jSONObject.put("queueType", obj);
                    break;
            }
            if (!TextUtils.isEmpty(this.f32322g)) {
                jSONObject.put("name", this.f32322g);
            }
            C5785m c5785m = this.f32323h;
            if (c5785m != null) {
                jSONObject.put("containerMetadata", c5785m.m28260U());
            }
            String m36776b = C8550a.m36776b(Integer.valueOf(this.f32324i));
            if (m36776b != null) {
                jSONObject.put("repeatMode", m36776b);
            }
            List list = this.f32325j;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f32325j.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C5791o) it.next()).m28288Y());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f32326k);
            long j10 = this.f32327l;
            if (j10 != -1) {
                jSONObject.put("startTime", C8013a.m34861b(j10));
            }
            jSONObject.put("shuffle", this.f32328m);
        } catch (JSONException e10) {
        }
        return jSONObject;
    }

    /* renamed from: Z */
    public final boolean m28274Z() {
        return this.f32328m;
    }

    /* renamed from: a0 */
    public final void m28275a0() {
        this.f32319d = null;
        this.f32320e = null;
        this.f32321f = 0;
        this.f32322g = null;
        this.f32324i = 0;
        this.f32325j = null;
        this.f32326k = 0;
        this.f32327l = -1L;
        this.f32328m = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5788n)) {
            return false;
        }
        C5788n c5788n = (C5788n) obj;
        return TextUtils.equals(this.f32319d, c5788n.f32319d) && TextUtils.equals(this.f32320e, c5788n.f32320e) && this.f32321f == c5788n.f32321f && TextUtils.equals(this.f32322g, c5788n.f32322g) && C9932n.m41832b(this.f32323h, c5788n.f32323h) && this.f32324i == c5788n.f32324i && C9932n.m41832b(this.f32325j, c5788n.f32325j) && this.f32326k == c5788n.f32326k && this.f32327l == c5788n.f32327l && this.f32328m == c5788n.f32328m;
    }

    public String getName() {
        return this.f32322g;
    }

    public int hashCode() {
        return C9932n.m41833c(this.f32319d, this.f32320e, Integer.valueOf(this.f32321f), this.f32322g, this.f32323h, Integer.valueOf(this.f32324i), this.f32325j, Integer.valueOf(this.f32326k), Long.valueOf(this.f32327l), Boolean.valueOf(this.f32328m));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, m28268S(), false);
        C10127c.m42536s(parcel, 3, m28266Q(), false);
        C10127c.m42529l(parcel, 4, m28269T());
        C10127c.m42536s(parcel, 5, getName(), false);
        C10127c.m42535r(parcel, 6, m28265P(), i10, false);
        C10127c.m42529l(parcel, 7, m28270U());
        C10127c.m42540w(parcel, 8, m28267R(), false);
        C10127c.m42529l(parcel, 9, m28271V());
        C10127c.m42532o(parcel, 10, m28272W());
        C10127c.m42520c(parcel, 11, this.f32328m);
        C10127c.m42519b(parcel, m42518a);
    }
}
