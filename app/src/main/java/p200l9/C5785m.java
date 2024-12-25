package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.achartengine.ChartFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import p304r9.C8013a;
import p323s9.C8551b;
import p402x9.C9691a;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/m.class
 */
/* renamed from: l9.m */
/* loaded from: combined.jar:classes2.jar:l9/m.class */
public class C5785m extends AbstractC10125a {
    public static final Parcelable.Creator<C5785m> CREATOR = new C5781k1();

    /* renamed from: d */
    public int f32310d;

    /* renamed from: e */
    public String f32311e;

    /* renamed from: f */
    public List f32312f;

    /* renamed from: g */
    public List f32313g;

    /* renamed from: h */
    public double f32314h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/m$a.class
     */
    /* renamed from: l9.m$a */
    /* loaded from: combined.jar:classes2.jar:l9/m$a.class */
    public static class a {

        /* renamed from: a */
        public final C5785m f32315a = new C5785m(null);

        /* renamed from: a */
        public C5785m m28262a() {
            return new C5785m(this.f32315a, null);
        }

        /* renamed from: b */
        public final a m28263b(JSONObject jSONObject) {
            C5785m.m28254V(this.f32315a, jSONObject);
            return this;
        }
    }

    public C5785m() {
        m28261W();
    }

    public C5785m(int i10, String str, List list, List list2, double d10) {
        this.f32310d = i10;
        this.f32311e = str;
        this.f32312f = list;
        this.f32313g = list2;
        this.f32314h = d10;
    }

    public /* synthetic */ C5785m(C5778j1 c5778j1) {
        m28261W();
    }

    public /* synthetic */ C5785m(C5785m c5785m, C5778j1 c5778j1) {
        this.f32310d = c5785m.f32310d;
        this.f32311e = c5785m.f32311e;
        this.f32312f = c5785m.f32312f;
        this.f32313g = c5785m.f32313g;
        this.f32314h = c5785m.f32314h;
    }

    /* renamed from: V */
    public static /* bridge */ /* synthetic */ void m28254V(C5785m c5785m, JSONObject jSONObject) {
        boolean z10;
        c5785m.m28261W();
        String optString = jSONObject.optString("containerType", "");
        int hashCode = optString.hashCode();
        if (hashCode != 6924225) {
            if (hashCode == 828666841 && optString.equals("GENERIC_CONTAINER")) {
                z10 = false;
            }
            z10 = -1;
        } else {
            if (optString.equals("AUDIOBOOK_CONTAINER")) {
                z10 = true;
            }
            z10 = -1;
        }
        if (!z10) {
            c5785m.f32310d = 0;
        } else if (z10) {
            c5785m.f32310d = 1;
        }
        c5785m.f32311e = C8013a.m34862c(jSONObject, ChartFactory.TITLE);
        JSONArray optJSONArray = jSONObject.optJSONArray("sections");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            c5785m.f32312f = arrayList;
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    C5782l c5782l = new C5782l();
                    c5782l.m28251Y(optJSONObject);
                    arrayList.add(c5782l);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("containerImages");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            c5785m.f32313g = arrayList2;
            C8551b.m36779c(arrayList2, optJSONArray2);
        }
        c5785m.f32314h = jSONObject.optDouble("containerDuration", c5785m.f32314h);
    }

    /* renamed from: P */
    public double m28255P() {
        return this.f32314h;
    }

    /* renamed from: Q */
    public List<C9691a> m28256Q() {
        List list = this.f32313g;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: R */
    public int m28257R() {
        return this.f32310d;
    }

    /* renamed from: S */
    public List<C5782l> m28258S() {
        List list = this.f32312f;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: T */
    public String m28259T() {
        return this.f32311e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: JSONException -> 0x00bb, TryCatch #0 {JSONException -> 0x00bb, blocks: (B:3:0x0008, B:8:0x001c, B:9:0x002d, B:11:0x0037, B:13:0x0043, B:15:0x004b, B:17:0x0054, B:19:0x0069, B:21:0x0071, B:23:0x0086, B:25:0x008f, B:27:0x0097, B:29:0x00a0, B:31:0x00af), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: JSONException -> 0x00bb, LOOP:0: B:18:0x0067->B:21:0x0071, LOOP_END, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00bb, blocks: (B:3:0x0008, B:8:0x001c, B:9:0x002d, B:11:0x0037, B:13:0x0043, B:15:0x004b, B:17:0x0054, B:19:0x0069, B:21:0x0071, B:23:0x0086, B:25:0x008f, B:27:0x0097, B:29:0x00a0, B:31:0x00af), top: B:2:0x0008 }] */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject m28260U() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            int r0 = r0.f32310d     // Catch: org.json.JSONException -> Lbb
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L27
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L19
            goto L2d
        L19:
            java.lang.String r0 = "AUDIOBOOK_CONTAINER"
            r7 = r0
        L1c:
            r0 = r8
            java.lang.String r1 = "containerType"
            r2 = r7
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lbb
            goto L2d
        L27:
            java.lang.String r0 = "GENERIC_CONTAINER"
            r7 = r0
            goto L1c
        L2d:
            r0 = r5
            java.lang.String r0 = r0.f32311e     // Catch: org.json.JSONException -> Lbb
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> Lbb
            if (r0 != 0) goto L42
            r0 = r8
            java.lang.String r1 = "title"
            r2 = r5
            java.lang.String r2 = r2.f32311e     // Catch: org.json.JSONException -> Lbb
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lbb
        L42:
            r0 = r5
            java.util.List r0 = r0.f32312f     // Catch: org.json.JSONException -> Lbb
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L8e
            r0 = r7
            boolean r0 = r0.isEmpty()     // Catch: org.json.JSONException -> Lbb
            if (r0 != 0) goto L8e
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lbb
            r7 = r0
            r0 = r7
            r0.<init>()     // Catch: org.json.JSONException -> Lbb
            r0 = r5
            java.util.List r0 = r0.f32312f     // Catch: org.json.JSONException -> Lbb
            java.util.Iterator r0 = r0.iterator()     // Catch: org.json.JSONException -> Lbb
            r9 = r0
        L67:
            r0 = r9
            boolean r0 = r0.hasNext()     // Catch: org.json.JSONException -> Lbb
            if (r0 == 0) goto L86
            r0 = r7
            r1 = r9
            java.lang.Object r1 = r1.next()     // Catch: org.json.JSONException -> Lbb
            l9.l r1 = (p200l9.C5782l) r1     // Catch: org.json.JSONException -> Lbb
            org.json.JSONObject r1 = r1.m28250X()     // Catch: org.json.JSONException -> Lbb
            org.json.JSONArray r0 = r0.put(r1)     // Catch: org.json.JSONException -> Lbb
            goto L67
        L86:
            r0 = r8
            java.lang.String r1 = "sections"
            r2 = r7
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lbb
        L8e:
            r0 = r5
            java.util.List r0 = r0.f32313g     // Catch: org.json.JSONException -> Lbb
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Lae
            r0 = r7
            boolean r0 = r0.isEmpty()     // Catch: org.json.JSONException -> Lbb
            if (r0 != 0) goto Lae
            r0 = r8
            java.lang.String r1 = "containerImages"
            r2 = r5
            java.util.List r2 = r2.f32313g     // Catch: org.json.JSONException -> Lbb
            org.json.JSONArray r2 = p323s9.C8551b.m36778b(r2)     // Catch: org.json.JSONException -> Lbb
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lbb
        Lae:
            r0 = r8
            java.lang.String r1 = "containerDuration"
            r2 = r5
            double r2 = r2.f32314h     // Catch: org.json.JSONException -> Lbb
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lbb
        Lb9:
            r0 = r8
            return r0
        Lbb:
            r7 = move-exception
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: p200l9.C5785m.m28260U():org.json.JSONObject");
    }

    /* renamed from: W */
    public final void m28261W() {
        this.f32310d = 0;
        this.f32311e = null;
        this.f32312f = null;
        this.f32313g = null;
        this.f32314h = 0.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5785m)) {
            return false;
        }
        C5785m c5785m = (C5785m) obj;
        return this.f32310d == c5785m.f32310d && TextUtils.equals(this.f32311e, c5785m.f32311e) && C9932n.m41832b(this.f32312f, c5785m.f32312f) && C9932n.m41832b(this.f32313g, c5785m.f32313g) && this.f32314h == c5785m.f32314h;
    }

    public int hashCode() {
        return C9932n.m41833c(Integer.valueOf(this.f32310d), this.f32311e, this.f32312f, this.f32313g, Double.valueOf(this.f32314h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 2, m28257R());
        C10127c.m42536s(parcel, 3, m28259T(), false);
        C10127c.m42540w(parcel, 4, m28258S(), false);
        C10127c.m42540w(parcel, 5, m28256Q(), false);
        C10127c.m42524g(parcel, 6, m28255P());
        C10127c.m42519b(parcel, m42518a);
    }
}
