package p235o0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/c.class
 */
/* renamed from: o0.c */
/* loaded from: combined.jar:classes1.jar:o0/c.class */
public final class C6811c {

    /* renamed from: a */
    public final ClipData f35499a;

    /* renamed from: b */
    public final int f35500b;

    /* renamed from: c */
    public final int f35501c;

    /* renamed from: d */
    public final Uri f35502d;

    /* renamed from: e */
    public final Bundle f35503e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c$a.class
     */
    /* renamed from: o0.c$a */
    /* loaded from: combined.jar:classes1.jar:o0/c$a.class */
    public static final class a {

        /* renamed from: a */
        public ClipData f35504a;

        /* renamed from: b */
        public int f35505b;

        /* renamed from: c */
        public int f35506c;

        /* renamed from: d */
        public Uri f35507d;

        /* renamed from: e */
        public Bundle f35508e;

        public a(ClipData clipData, int i10) {
            this.f35504a = clipData;
            this.f35505b = i10;
        }

        /* renamed from: a */
        public C6811c m31383a() {
            return new C6811c(this);
        }

        /* renamed from: b */
        public a m31384b(Bundle bundle) {
            this.f35508e = bundle;
            return this;
        }

        /* renamed from: c */
        public a m31385c(int i10) {
            this.f35506c = i10;
            return this;
        }

        /* renamed from: d */
        public a m31386d(Uri uri) {
            this.f35507d = uri;
            return this;
        }
    }

    public C6811c(a aVar) {
        this.f35499a = (ClipData) C6616h.m30527e(aVar.f35504a);
        this.f35500b = C6616h.m30524b(aVar.f35505b, 0, 3, "source");
        this.f35501c = C6616h.m30526d(aVar.f35506c, 1);
        this.f35502d = aVar.f35507d;
        this.f35503e = aVar.f35508e;
    }

    /* renamed from: a */
    public static String m31378a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    /* renamed from: e */
    public static String m31379e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? String.valueOf(i10) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: b */
    public ClipData m31380b() {
        return this.f35499a;
    }

    /* renamed from: c */
    public int m31381c() {
        return this.f35501c;
    }

    /* renamed from: d */
    public int m31382d() {
        return this.f35500b;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ContentInfoCompat{clip=");
        sb2.append(this.f35499a.getDescription());
        sb2.append(", source=");
        sb2.append(m31379e(this.f35500b));
        sb2.append(", flags=");
        sb2.append(m31378a(this.f35501c));
        if (this.f35502d == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + this.f35502d.toString().length() + ")";
        }
        sb2.append(str);
        sb2.append(this.f35503e == null ? "" : ", hasExtras");
        sb2.append("}");
        return sb2.toString();
    }
}
