package tg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import vg.C9351f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/o.class
 */
/* renamed from: tg.o */
/* loaded from: combined.jar:classes2.jar:tg/o.class */
public final class C8739o {

    /* renamed from: a */
    public final String[] f40646a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/o$b.class
     */
    /* renamed from: tg.o$b */
    /* loaded from: combined.jar:classes2.jar:tg/o$b.class */
    public static final class b {

        /* renamed from: a */
        public final List<String> f40647a = new ArrayList(20);

        /* renamed from: b */
        public b m37405b(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            if (str.length() != 0 && str.indexOf(0) == -1 && str2.indexOf(0) == -1) {
                return m37406c(str, str2);
            }
            throw new IllegalArgumentException("Unexpected header: " + str + ": " + str2);
        }

        /* renamed from: c */
        public final b m37406c(String str, String str2) {
            this.f40647a.add(str);
            this.f40647a.add(str2.trim());
            return this;
        }

        /* renamed from: d */
        public b m37407d(String str) {
            int indexOf = str.indexOf(":", 1);
            return indexOf != -1 ? m37406c(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(":") ? m37406c("", str.substring(1)) : m37406c("", str);
        }

        /* renamed from: e */
        public C8739o m37408e() {
            return new C8739o(this);
        }

        /* renamed from: f */
        public b m37409f(String str) {
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 >= this.f40647a.size()) {
                    return this;
                }
                int i12 = i11;
                if (str.equalsIgnoreCase(this.f40647a.get(i11))) {
                    this.f40647a.remove(i11);
                    this.f40647a.remove(i11);
                    i12 = i11 - 2;
                }
                i10 = i12 + 2;
            }
        }

        /* renamed from: g */
        public b m37410g(String str, String str2) {
            m37409f(str);
            m37405b(str, str2);
            return this;
        }
    }

    public C8739o(b bVar) {
        this.f40646a = (String[]) bVar.f40647a.toArray(new String[bVar.f40647a.size()]);
    }

    /* renamed from: b */
    public static String m37396b(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m37397a(String str) {
        return m37396b(this.f40646a, str);
    }

    /* renamed from: c */
    public Date m37398c(String str) {
        String m37397a = m37397a(str);
        return m37397a != null ? C9351f.m39435b(m37397a) : null;
    }

    /* renamed from: d */
    public String m37399d(int i10) {
        int i11 = i10 * 2;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f40646a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    /* renamed from: e */
    public b m37400e() {
        b bVar = new b();
        bVar.f40647a.addAll(Arrays.asList(this.f40646a));
        return bVar;
    }

    /* renamed from: f */
    public int m37401f() {
        return this.f40646a.length / 2;
    }

    /* renamed from: g */
    public String m37402g(int i10) {
        int i11 = (i10 * 2) + 1;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f40646a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    /* renamed from: h */
    public List<String> m37403h(String str) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < m37401f()) {
            ArrayList arrayList2 = arrayList;
            if (str.equalsIgnoreCase(m37399d(i10))) {
                arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList(2);
                }
                arrayList2.add(m37402g(i10));
            }
            i10++;
            arrayList = arrayList2;
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < m37401f(); i10++) {
            sb2.append(m37399d(i10));
            sb2.append(": ");
            sb2.append(m37402g(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
