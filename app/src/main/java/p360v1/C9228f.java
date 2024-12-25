package p360v1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.simpleframework.xml.strategy.Name;
import p375w1.InterfaceC9397b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v1/f.class
 */
/* renamed from: v1.f */
/* loaded from: combined.jar:classes1.jar:v1/f.class */
public class C9228f {

    /* renamed from: a */
    public final String f42152a;

    /* renamed from: b */
    public final Map<String, a> f42153b;

    /* renamed from: c */
    public final Set<b> f42154c;

    /* renamed from: d */
    public final Set<d> f42155d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v1/f$a.class
     */
    /* renamed from: v1.f$a */
    /* loaded from: combined.jar:classes1.jar:v1/f$a.class */
    public static class a {

        /* renamed from: a */
        public final String f42156a;

        /* renamed from: b */
        public final String f42157b;

        /* renamed from: c */
        public final int f42158c;

        /* renamed from: d */
        public final boolean f42159d;

        /* renamed from: e */
        public final int f42160e;

        /* renamed from: f */
        public final String f42161f;

        /* renamed from: g */
        public final int f42162g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f42156a = str;
            this.f42157b = str2;
            this.f42159d = z10;
            this.f42160e = i10;
            this.f42158c = m38904a(str2);
            this.f42161f = str3;
            this.f42162g = i11;
        }

        /* renamed from: a */
        public static int m38904a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f42160e != aVar.f42160e || !this.f42156a.equals(aVar.f42156a) || this.f42159d != aVar.f42159d) {
                return false;
            }
            if (this.f42162g == 1 && aVar.f42162g == 2 && (str2 = this.f42161f) != null && !str2.equals(aVar.f42161f)) {
                return false;
            }
            if (this.f42162g == 2 && aVar.f42162g == 1 && (str = aVar.f42161f) != null && !str.equals(this.f42161f)) {
                return false;
            }
            int i10 = this.f42162g;
            if (i10 != 0 && i10 == aVar.f42162g) {
                String str3 = this.f42161f;
                if (str3 != null) {
                    if (!str3.equals(aVar.f42161f)) {
                        return false;
                    }
                } else if (aVar.f42161f != null) {
                    return false;
                }
            }
            if (this.f42158c != aVar.f42158c) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            int hashCode = this.f42156a.hashCode();
            return (((((hashCode * 31) + this.f42158c) * 31) + (this.f42159d ? 1231 : 1237)) * 31) + this.f42160e;
        }

        public String toString() {
            return "Column{name='" + this.f42156a + "', type='" + this.f42157b + "', affinity='" + this.f42158c + "', notNull=" + this.f42159d + ", primaryKeyPosition=" + this.f42160e + ", defaultValue='" + this.f42161f + "'}";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v1/f$b.class
     */
    /* renamed from: v1.f$b */
    /* loaded from: combined.jar:classes1.jar:v1/f$b.class */
    public static class b {

        /* renamed from: a */
        public final String f42163a;

        /* renamed from: b */
        public final String f42164b;

        /* renamed from: c */
        public final String f42165c;

        /* renamed from: d */
        public final List<String> f42166d;

        /* renamed from: e */
        public final List<String> f42167e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f42163a = str;
            this.f42164b = str2;
            this.f42165c = str3;
            this.f42166d = Collections.unmodifiableList(list);
            this.f42167e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f42163a.equals(bVar.f42163a) && this.f42164b.equals(bVar.f42164b) && this.f42165c.equals(bVar.f42165c) && this.f42166d.equals(bVar.f42166d)) {
                return this.f42167e.equals(bVar.f42167e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f42163a.hashCode() * 31) + this.f42164b.hashCode()) * 31) + this.f42165c.hashCode()) * 31) + this.f42166d.hashCode()) * 31) + this.f42167e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f42163a + "', onDelete='" + this.f42164b + "', onUpdate='" + this.f42165c + "', columnNames=" + this.f42166d + ", referenceColumnNames=" + this.f42167e + '}';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v1/f$c.class
     */
    /* renamed from: v1.f$c */
    /* loaded from: combined.jar:classes1.jar:v1/f$c.class */
    public static class c implements Comparable<c> {

        /* renamed from: b */
        public final int f42168b;

        /* renamed from: c */
        public final int f42169c;

        /* renamed from: d */
        public final String f42170d;

        /* renamed from: e */
        public final String f42171e;

        public c(int i10, int i11, String str, String str2) {
            this.f42168b = i10;
            this.f42169c = i11;
            this.f42170d = str;
            this.f42171e = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i10 = this.f42168b - cVar.f42168b;
            int i11 = i10;
            if (i10 == 0) {
                i11 = this.f42169c - cVar.f42169c;
            }
            return i11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v1/f$d.class
     */
    /* renamed from: v1.f$d */
    /* loaded from: combined.jar:classes1.jar:v1/f$d.class */
    public static class d {

        /* renamed from: a */
        public final String f42172a;

        /* renamed from: b */
        public final boolean f42173b;

        /* renamed from: c */
        public final List<String> f42174c;

        public d(String str, boolean z10, List<String> list) {
            this.f42172a = str;
            this.f42173b = z10;
            this.f42174c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f42173b == dVar.f42173b && this.f42174c.equals(dVar.f42174c)) {
                return this.f42172a.startsWith("index_") ? dVar.f42172a.startsWith("index_") : this.f42172a.equals(dVar.f42172a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f42172a.startsWith("index_") ? -1184239155 : this.f42172a.hashCode()) * 31) + (this.f42173b ? 1 : 0)) * 31) + this.f42174c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f42172a + "', unique=" + this.f42173b + ", columns=" + this.f42174c + '}';
        }
    }

    public C9228f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f42152a = str;
        this.f42153b = Collections.unmodifiableMap(map);
        this.f42154c = Collections.unmodifiableSet(set);
        this.f42155d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static C9228f m38898a(InterfaceC9397b interfaceC9397b, String str) {
        return new C9228f(str, m38899b(interfaceC9397b, str), m38901d(interfaceC9397b, str), m38903f(interfaceC9397b, str));
    }

    /* renamed from: b */
    public static Map<String, a> m38899b(InterfaceC9397b interfaceC9397b, String str) {
        Cursor mo39719p0 = interfaceC9397b.mo39719p0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (mo39719p0.getColumnCount() > 0) {
                int columnIndex = mo39719p0.getColumnIndex("name");
                int columnIndex2 = mo39719p0.getColumnIndex("type");
                int columnIndex3 = mo39719p0.getColumnIndex("notnull");
                int columnIndex4 = mo39719p0.getColumnIndex("pk");
                int columnIndex5 = mo39719p0.getColumnIndex("dflt_value");
                while (mo39719p0.moveToNext()) {
                    String string = mo39719p0.getString(columnIndex);
                    hashMap.put(string, new a(string, mo39719p0.getString(columnIndex2), mo39719p0.getInt(columnIndex3) != 0, mo39719p0.getInt(columnIndex4), mo39719p0.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            mo39719p0.close();
        }
    }

    /* renamed from: c */
    public static List<c> m38900c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(Name.MARK);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static Set<b> m38901d(InterfaceC9397b interfaceC9397b, String str) {
        HashSet hashSet = new HashSet();
        Cursor mo39719p0 = interfaceC9397b.mo39719p0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = mo39719p0.getColumnIndex(Name.MARK);
            int columnIndex2 = mo39719p0.getColumnIndex("seq");
            int columnIndex3 = mo39719p0.getColumnIndex("table");
            int columnIndex4 = mo39719p0.getColumnIndex("on_delete");
            int columnIndex5 = mo39719p0.getColumnIndex("on_update");
            List<c> m38900c = m38900c(mo39719p0);
            int count = mo39719p0.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                mo39719p0.moveToPosition(i10);
                if (mo39719p0.getInt(columnIndex2) == 0) {
                    int i11 = mo39719p0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : m38900c) {
                        if (cVar.f42168b == i11) {
                            arrayList.add(cVar.f42170d);
                            arrayList2.add(cVar.f42171e);
                        }
                    }
                    hashSet.add(new b(mo39719p0.getString(columnIndex3), mo39719p0.getString(columnIndex4), mo39719p0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            mo39719p0.close();
        }
    }

    /* renamed from: e */
    public static d m38902e(InterfaceC9397b interfaceC9397b, String str, boolean z10) {
        Cursor mo39719p0 = interfaceC9397b.mo39719p0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = mo39719p0.getColumnIndex("seqno");
            int columnIndex2 = mo39719p0.getColumnIndex("cid");
            int columnIndex3 = mo39719p0.getColumnIndex("name");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                mo39719p0.close();
                return null;
            }
            TreeMap treeMap = new TreeMap();
            while (mo39719p0.moveToNext()) {
                if (mo39719p0.getInt(columnIndex2) >= 0) {
                    treeMap.put(Integer.valueOf(mo39719p0.getInt(columnIndex)), mo39719p0.getString(columnIndex3));
                }
            }
            ArrayList arrayList = new ArrayList(treeMap.size());
            arrayList.addAll(treeMap.values());
            return new d(str, z10, arrayList);
        } finally {
            mo39719p0.close();
        }
    }

    /* renamed from: f */
    public static Set<d> m38903f(InterfaceC9397b interfaceC9397b, String str) {
        Cursor mo39719p0 = interfaceC9397b.mo39719p0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = mo39719p0.getColumnIndex("name");
            int columnIndex2 = mo39719p0.getColumnIndex("origin");
            int columnIndex3 = mo39719p0.getColumnIndex("unique");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                mo39719p0.close();
                return null;
            }
            HashSet hashSet = new HashSet();
            while (mo39719p0.moveToNext()) {
                if ("c".equals(mo39719p0.getString(columnIndex2))) {
                    String string = mo39719p0.getString(columnIndex);
                    boolean z10 = true;
                    if (mo39719p0.getInt(columnIndex3) != 1) {
                        z10 = false;
                    }
                    d m38902e = m38902e(interfaceC9397b, string, z10);
                    if (m38902e == null) {
                        mo39719p0.close();
                        return null;
                    }
                    hashSet.add(m38902e);
                }
            }
            return hashSet;
        } finally {
            mo39719p0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9228f c9228f = (C9228f) obj;
        String str = this.f42152a;
        if (str != null) {
            if (!str.equals(c9228f.f42152a)) {
                return false;
            }
        } else if (c9228f.f42152a != null) {
            return false;
        }
        Map<String, a> map = this.f42153b;
        if (map != null) {
            if (!map.equals(c9228f.f42153b)) {
                return false;
            }
        } else if (c9228f.f42153b != null) {
            return false;
        }
        Set<b> set2 = this.f42154c;
        if (set2 != null) {
            if (!set2.equals(c9228f.f42154c)) {
                return false;
            }
        } else if (c9228f.f42154c != null) {
            return false;
        }
        Set<d> set3 = this.f42155d;
        if (set3 == null || (set = c9228f.f42155d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f42152a;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Map<String, a> map = this.f42153b;
        int hashCode2 = map != null ? map.hashCode() : 0;
        Set<b> set = this.f42154c;
        if (set != null) {
            i10 = set.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i10;
    }

    public String toString() {
        return "TableInfo{name='" + this.f42152a + "', columns=" + this.f42153b + ", foreignKeys=" + this.f42154c + ", indices=" + this.f42155d + '}';
    }
}
