package p146i8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p267p6.C7629w0;
import p365v6.C9273n;
import p420y7.C9858i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i8/f.class
 */
/* renamed from: i8.f */
/* loaded from: combined.jar:classes2.jar:i8/f.class */
public final class C5205f extends AbstractC5207h {

    /* renamed from: n */
    public static final C5205f f29768n = new C5205f("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List<Uri> f29769d;

    /* renamed from: e */
    public final List<b> f29770e;

    /* renamed from: f */
    public final List<a> f29771f;

    /* renamed from: g */
    public final List<a> f29772g;

    /* renamed from: h */
    public final List<a> f29773h;

    /* renamed from: i */
    public final List<a> f29774i;

    /* renamed from: j */
    public final C7629w0 f29775j;

    /* renamed from: k */
    public final List<C7629w0> f29776k;

    /* renamed from: l */
    public final Map<String, String> f29777l;

    /* renamed from: m */
    public final List<C9273n> f29778m;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/f$a.class
     */
    /* renamed from: i8.f$a */
    /* loaded from: combined.jar:classes2.jar:i8/f$a.class */
    public static final class a {

        /* renamed from: a */
        public final Uri f29779a;

        /* renamed from: b */
        public final C7629w0 f29780b;

        /* renamed from: c */
        public final String f29781c;

        /* renamed from: d */
        public final String f29782d;

        public a(Uri uri, C7629w0 c7629w0, String str, String str2) {
            this.f29779a = uri;
            this.f29780b = c7629w0;
            this.f29781c = str;
            this.f29782d = str2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/f$b.class
     */
    /* renamed from: i8.f$b */
    /* loaded from: combined.jar:classes2.jar:i8/f$b.class */
    public static final class b {

        /* renamed from: a */
        public final Uri f29783a;

        /* renamed from: b */
        public final C7629w0 f29784b;

        /* renamed from: c */
        public final String f29785c;

        /* renamed from: d */
        public final String f29786d;

        /* renamed from: e */
        public final String f29787e;

        /* renamed from: f */
        public final String f29788f;

        public b(Uri uri, C7629w0 c7629w0, String str, String str2, String str3, String str4) {
            this.f29783a = uri;
            this.f29784b = c7629w0;
            this.f29785c = str;
            this.f29786d = str2;
            this.f29787e = str3;
            this.f29788f = str4;
        }

        /* renamed from: b */
        public static b m26026b(Uri uri) {
            return new b(uri, new C7629w0.b().m33208S("0").m33200K("application/x-mpegURL").m33194E(), null, null, null, null);
        }

        /* renamed from: a */
        public b m26027a(C7629w0 c7629w0) {
            return new b(this.f29783a, c7629w0, this.f29785c, this.f29786d, this.f29787e, this.f29788f);
        }
    }

    public C5205f(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, C7629w0 c7629w0, List<C7629w0> list7, boolean z10, Map<String, String> map, List<C9273n> list8) {
        super(str, list, z10);
        this.f29769d = Collections.unmodifiableList(m26024f(list2, list3, list4, list5, list6));
        this.f29770e = Collections.unmodifiableList(list2);
        this.f29771f = Collections.unmodifiableList(list3);
        this.f29772g = Collections.unmodifiableList(list4);
        this.f29773h = Collections.unmodifiableList(list5);
        this.f29774i = Collections.unmodifiableList(list6);
        this.f29775j = c7629w0;
        this.f29776k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f29777l = Collections.unmodifiableMap(map);
        this.f29778m = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    public static void m26021b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f29779a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    public static <T> List<T> m26022d(List<T> list, int i10, List<C9858i0> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    C9858i0 c9858i0 = list2.get(i12);
                    if (c9858i0.f45228c == i10 && c9858i0.f45229d == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C5205f m26023e(String str) {
        return new C5205f("", Collections.emptyList(), Collections.singletonList(b.m26026b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: f */
    public static List<Uri> m26024f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f29783a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m26021b(list2, arrayList);
        m26021b(list3, arrayList);
        m26021b(list4, arrayList);
        m26021b(list5, arrayList);
        return arrayList;
    }

    @Override // p420y7.InterfaceC9848d0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C5205f mo23296a(List<C9858i0> list) {
        return new C5205f(this.f29831a, this.f29832b, m26022d(this.f29770e, 0, list), Collections.emptyList(), m26022d(this.f29772g, 1, list), m26022d(this.f29773h, 2, list), Collections.emptyList(), this.f29775j, this.f29776k, this.f29833c, this.f29777l, this.f29778m);
    }
}
