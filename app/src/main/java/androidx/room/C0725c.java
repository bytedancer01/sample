package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import org.apache.http.client.methods.HttpDelete;
import p190l.C5637b;
import p327t1.AbstractC8597e;
import p327t1.C8595c;
import p375w1.C9396a;
import p375w1.InterfaceC9397b;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/room/c.class
 */
/* renamed from: androidx.room.c */
/* loaded from: combined.jar:classes1.jar:androidx/room/c.class */
public class C0725c {

    /* renamed from: m */
    public static final String[] f4988m = {"UPDATE", HttpDelete.METHOD_NAME, "INSERT"};

    /* renamed from: b */
    public final String[] f4990b;

    /* renamed from: c */
    public Map<String, Set<String>> f4991c;

    /* renamed from: d */
    public final AbstractC8597e f4992d;

    /* renamed from: g */
    public volatile InterfaceC9401f f4995g;

    /* renamed from: h */
    public b f4996h;

    /* renamed from: i */
    public final C8595c f4997i;

    /* renamed from: k */
    public C0726d f4999k;

    /* renamed from: e */
    public AtomicBoolean f4993e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile boolean f4994f = false;

    /* renamed from: j */
    @SuppressLint({"RestrictedApi"})
    public final C5637b<c, d> f4998j = new C5637b<>();

    /* renamed from: l */
    public Runnable f5000l = new a(this);

    /* renamed from: a */
    public final HashMap<String, Integer> f4989a = new HashMap<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/c$a.class
     */
    /* renamed from: androidx.room.c$a */
    /* loaded from: combined.jar:classes1.jar:androidx/room/c$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C0725c f5001b;

        public a(C0725c c0725c) {
            this.f5001b = c0725c;
        }

        /* renamed from: a */
        public final Set<Integer> m4723a() {
            HashSet hashSet = new HashSet();
            Cursor m36908p = this.f5001b.f4992d.m36908p(new C9396a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (m36908p.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(m36908p.getInt(0)));
                } catch (Throwable th2) {
                    m36908p.close();
                    throw th2;
                }
            }
            m36908p.close();
            if (!hashSet.isEmpty()) {
                this.f5001b.f4995g.mo39729H();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0171 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 379
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0725c.a.run():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/c$b.class
     */
    /* renamed from: androidx.room.c$b */
    /* loaded from: combined.jar:classes1.jar:androidx/room/c$b.class */
    public static class b {

        /* renamed from: a */
        public final long[] f5002a;

        /* renamed from: b */
        public final boolean[] f5003b;

        /* renamed from: c */
        public final int[] f5004c;

        /* renamed from: d */
        public boolean f5005d;

        /* renamed from: e */
        public boolean f5006e;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f5002a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f5003b = zArr;
            this.f5004c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* renamed from: a */
        public int[] m4724a() {
            synchronized (this) {
                if (this.f5005d && !this.f5006e) {
                    int length = this.f5002a.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 >= length) {
                            this.f5006e = true;
                            this.f5005d = false;
                            return this.f5004c;
                        }
                        boolean z10 = this.f5002a[i10] > 0;
                        boolean[] zArr = this.f5003b;
                        if (z10 != zArr[i10]) {
                            int[] iArr = this.f5004c;
                            if (!z10) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            this.f5004c[i10] = 0;
                        }
                        zArr[i10] = z10;
                        i10++;
                    }
                }
                return null;
            }
        }

        /* renamed from: b */
        public boolean m4725b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f5002a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f5005d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* renamed from: c */
        public boolean m4726c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f5002a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f5005d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* renamed from: d */
        public void m4727d() {
            synchronized (this) {
                this.f5006e = false;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/c$c.class
     */
    /* renamed from: androidx.room.c$c */
    /* loaded from: combined.jar:classes1.jar:androidx/room/c$c.class */
    public static abstract class c {

        /* renamed from: a */
        public final String[] f5007a;

        public c(String[] strArr) {
            this.f5007a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public boolean mo4728a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo4729b(Set<String> set);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/c$d.class
     */
    /* renamed from: androidx.room.c$d */
    /* loaded from: combined.jar:classes1.jar:androidx/room/c$d.class */
    public static class d {

        /* renamed from: a */
        public final int[] f5008a;

        /* renamed from: b */
        public final String[] f5009b;

        /* renamed from: c */
        public final c f5010c;

        /* renamed from: d */
        public final Set<String> f5011d;

        public d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f5010c = cVar;
            this.f5008a = iArr;
            this.f5009b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f5011d = set;
        }

        /* renamed from: a */
        public void m4730a(Set<Integer> set) {
            int length = this.f5008a.length;
            Set<String> set2 = null;
            int i10 = 0;
            while (i10 < length) {
                Set<String> set3 = set2;
                if (set.contains(Integer.valueOf(this.f5008a[i10]))) {
                    if (length == 1) {
                        set3 = this.f5011d;
                    } else {
                        set3 = set2;
                        if (set2 == null) {
                            set3 = new HashSet(length);
                        }
                        set3.add(this.f5009b[i10]);
                    }
                }
                i10++;
                set2 = set3;
            }
            if (set2 != null) {
                this.f5010c.mo4729b(set2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m4731b(String[] strArr) {
            Set set;
            if (this.f5009b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    set = null;
                    if (i10 >= length) {
                        break;
                    }
                    if (strArr[i10].equalsIgnoreCase(this.f5009b[0])) {
                        set = this.f5011d;
                        break;
                    }
                    i10++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f5009b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            String str2 = strArr2[i11];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                set = null;
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f5010c.mo4729b(set);
            }
        }
    }

    public C0725c(AbstractC8597e abstractC8597e, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4992d = abstractC8597e;
        this.f4996h = new b(strArr.length);
        this.f4991c = map2;
        this.f4997i = new C8595c(abstractC8597e);
        int length = strArr.length;
        this.f4990b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4989a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f4990b[i10] = str2.toLowerCase(locale);
            } else {
                this.f4990b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f4989a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f4989a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: b */
    public static void m4710b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append(AWSAppSyncClient.DATABASE_NAME_DELIMITER);
        sb2.append(str2);
        sb2.append("`");
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void m4711a(c cVar) {
        d mo27808i;
        String[] m4717h = m4717h(cVar.f5007a);
        int[] iArr = new int[m4717h.length];
        int length = m4717h.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = this.f4989a.get(m4717h[i10].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + m4717h[i10]);
            }
            iArr[i10] = num.intValue();
        }
        d dVar = new d(cVar, iArr, m4717h);
        synchronized (this.f4998j) {
            mo27808i = this.f4998j.mo27808i(cVar, dVar);
        }
        if (mo27808i == null && this.f4996h.m4725b(iArr)) {
            m4721l();
        }
    }

    /* renamed from: c */
    public boolean m4712c() {
        if (!this.f4992d.m36907o()) {
            return false;
        }
        if (!this.f4994f) {
            this.f4992d.m36902i().getWritableDatabase();
        }
        if (this.f4994f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: d */
    public void m4713d(InterfaceC9397b interfaceC9397b) {
        synchronized (this) {
            if (this.f4994f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC9397b.mo39713F("PRAGMA temp_store = MEMORY;");
            interfaceC9397b.mo39713F("PRAGMA recursive_triggers='ON';");
            interfaceC9397b.mo39713F("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m4722m(interfaceC9397b);
            this.f4995g = interfaceC9397b.mo39718j0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f4994f = true;
        }
    }

    /* renamed from: e */
    public void m4714e(String... strArr) {
        synchronized (this.f4998j) {
            Iterator<Map.Entry<c, d>> it = this.f4998j.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().mo4728a()) {
                    next.getValue().m4731b(strArr);
                }
            }
        }
    }

    /* renamed from: f */
    public void m4715f() {
        if (this.f4993e.compareAndSet(false, true)) {
            this.f4992d.m36903j().execute(this.f5000l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: g */
    public void m4716g(c cVar) {
        d mo27809q;
        synchronized (this.f4998j) {
            mo27809q = this.f4998j.mo27809q(cVar);
        }
        if (mo27809q == null || !this.f4996h.m4726c(mo27809q.f5008a)) {
            return;
        }
        m4721l();
    }

    /* renamed from: h */
    public final String[] m4717h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4991c.containsKey(lowerCase)) {
                hashSet.addAll(this.f4991c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: i */
    public void m4718i(Context context, String str) {
        this.f4999k = new C0726d(context, str, this, this.f4992d.m36903j());
    }

    /* renamed from: j */
    public final void m4719j(InterfaceC9397b interfaceC9397b, int i10) {
        interfaceC9397b.mo39713F("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f4990b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f4988m) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m4710b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            interfaceC9397b.mo39713F(sb2.toString());
        }
    }

    /* renamed from: k */
    public final void m4720k(InterfaceC9397b interfaceC9397b, int i10) {
        String str = this.f4990b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f4988m) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            m4710b(sb2, str, str2);
            interfaceC9397b.mo39713F(sb2.toString());
        }
    }

    /* renamed from: l */
    public void m4721l() {
        if (this.f4992d.m36907o()) {
            m4722m(this.f4992d.m36902i().getWritableDatabase());
        }
    }

    /* renamed from: m */
    public void m4722m(InterfaceC9397b interfaceC9397b) {
        if (interfaceC9397b.mo39720u0()) {
            return;
        }
        while (true) {
            try {
                Lock m36901h = this.f4992d.m36901h();
                m36901h.lock();
                try {
                    int[] m4724a = this.f4996h.m4724a();
                    if (m4724a == null) {
                        return;
                    }
                    int length = m4724a.length;
                    interfaceC9397b.mo39711A();
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = m4724a[i10];
                        if (i11 == 1) {
                            m4719j(interfaceC9397b, i10);
                        } else if (i11 == 2) {
                            try {
                                m4720k(interfaceC9397b, i10);
                            } finally {
                            }
                        }
                    }
                    interfaceC9397b.mo39714O();
                    interfaceC9397b.mo39717S();
                    this.f4996h.m4727d();
                    m36901h.unlock();
                } finally {
                    m36901h.unlock();
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}
