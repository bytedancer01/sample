package p069e0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p018b0.C0779d;
import p191l0.C5641d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e0/c.class
 */
/* renamed from: e0.c */
/* loaded from: combined.jar:classes1.jar:e0/c.class */
public class C4564c {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e0/c$a.class
     */
    /* renamed from: e0.c$a */
    /* loaded from: combined.jar:classes1.jar:e0/c$a.class */
    public interface a {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e0/c$b.class
     */
    /* renamed from: e0.c$b */
    /* loaded from: combined.jar:classes1.jar:e0/c$b.class */
    public static final class b implements a {

        /* renamed from: a */
        public final c[] f27167a;

        public b(c[] cVarArr) {
            this.f27167a = cVarArr;
        }

        /* renamed from: a */
        public c[] m23031a() {
            return this.f27167a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e0/c$c.class
     */
    /* renamed from: e0.c$c */
    /* loaded from: combined.jar:classes1.jar:e0/c$c.class */
    public static final class c {

        /* renamed from: a */
        public final String f27168a;

        /* renamed from: b */
        public int f27169b;

        /* renamed from: c */
        public boolean f27170c;

        /* renamed from: d */
        public String f27171d;

        /* renamed from: e */
        public int f27172e;

        /* renamed from: f */
        public int f27173f;

        public c(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f27168a = str;
            this.f27169b = i10;
            this.f27170c = z10;
            this.f27171d = str2;
            this.f27172e = i11;
            this.f27173f = i12;
        }

        /* renamed from: a */
        public String m23032a() {
            return this.f27168a;
        }

        /* renamed from: b */
        public int m23033b() {
            return this.f27173f;
        }

        /* renamed from: c */
        public int m23034c() {
            return this.f27172e;
        }

        /* renamed from: d */
        public String m23035d() {
            return this.f27171d;
        }

        /* renamed from: e */
        public int m23036e() {
            return this.f27169b;
        }

        /* renamed from: f */
        public boolean m23037f() {
            return this.f27170c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e0/c$d.class
     */
    /* renamed from: e0.c$d */
    /* loaded from: combined.jar:classes1.jar:e0/c$d.class */
    public static final class d implements a {

        /* renamed from: a */
        public final C5641d f27174a;

        /* renamed from: b */
        public final int f27175b;

        /* renamed from: c */
        public final int f27176c;

        /* renamed from: d */
        public final String f27177d;

        public d(C5641d c5641d, int i10, int i11, String str) {
            this.f27174a = c5641d;
            this.f27176c = i10;
            this.f27175b = i11;
            this.f27177d = str;
        }

        /* renamed from: a */
        public int m23038a() {
            return this.f27176c;
        }

        /* renamed from: b */
        public C5641d m23039b() {
            return this.f27174a;
        }

        /* renamed from: c */
        public String m23040c() {
            return this.f27177d;
        }

        /* renamed from: d */
        public int m23041d() {
            return this.f27175b;
        }
    }

    /* renamed from: a */
    public static int m23023a(TypedArray typedArray, int i10) {
        return typedArray.getType(i10);
    }

    /* renamed from: b */
    public static a m23024b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m23026d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m23025c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m23023a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(m23030h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m23030h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    public static a m23026d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m23027e(xmlPullParser, resources);
        }
        m23029g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    public static a m23027e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0779d.f5371f);
        String string = obtainAttributes.getString(C0779d.f5372g);
        String string2 = obtainAttributes.getString(C0779d.f5376k);
        String string3 = obtainAttributes.getString(C0779d.f5377l);
        int resourceId = obtainAttributes.getResourceId(C0779d.f5373h, 0);
        int integer = obtainAttributes.getInteger(C0779d.f5374i, 1);
        int integer2 = obtainAttributes.getInteger(C0779d.f5375j, 500);
        String string4 = obtainAttributes.getString(C0779d.f5378m);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m23029g(xmlPullParser);
            }
            return new d(new C5641d(string, string2, string3, m23025c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m23028f(xmlPullParser, resources));
                } else {
                    m23029g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    /* renamed from: f */
    public static c m23028f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0779d.f5379n);
        int i10 = C0779d.f5388w;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = C0779d.f5381p;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = C0779d.f5386u;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = C0779d.f5382q;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = C0779d.f5389x;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = C0779d.f5383r;
        }
        int i14 = C0779d.f5387v;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = C0779d.f5384s;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = C0779d.f5385t;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = C0779d.f5380o;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m23029g(xmlPullParser);
        }
        return new c(string2, i11, z10, string, i15, resourceId);
    }

    /* renamed from: g */
    public static void m23029g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    /* renamed from: h */
    public static List<byte[]> m23030h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
