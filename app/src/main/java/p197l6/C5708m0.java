package p197l6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.logging.LogFactory;
import p036c6.AbstractC0998i;
import p036c6.AbstractC1004o;
import p036c6.C0997h;
import p075e6.InterfaceC4645a;
import p112g6.C4956a;
import p112g6.C4957b;
import p112g6.C4958c;
import p112g6.C4959d;
import p112g6.C4960e;
import p112g6.C4961f;
import p124h6.C5036a;
import p213m6.C5930a;
import p213m6.InterfaceC5931b;
import p227n6.InterfaceC6654a;
import p241o6.C6913a;
import p437z5.C10054b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l6/m0.class
 */
/* renamed from: l6.m0 */
/* loaded from: combined.jar:classes1.jar:l6/m0.class */
public class C5708m0 implements InterfaceC5689d, InterfaceC5931b, InterfaceC5687c {

    /* renamed from: g */
    public static final C10054b f32052g = C10054b.m42268b("proto");

    /* renamed from: b */
    public final C5722t0 f32053b;

    /* renamed from: c */
    public final InterfaceC6654a f32054c;

    /* renamed from: d */
    public final InterfaceC6654a f32055d;

    /* renamed from: e */
    public final AbstractC5691e f32056e;

    /* renamed from: f */
    public final InterfaceC4645a<String> f32057f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l6/m0$b.class
     */
    /* renamed from: l6.m0$b */
    /* loaded from: combined.jar:classes1.jar:l6/m0$b.class */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l6/m0$c.class
     */
    /* renamed from: l6.m0$c */
    /* loaded from: combined.jar:classes1.jar:l6/m0$c.class */
    public static class c {

        /* renamed from: a */
        public final String f32058a;

        /* renamed from: b */
        public final String f32059b;

        public c(String str, String str2) {
            this.f32058a = str;
            this.f32059b = str2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l6/m0$d.class
     */
    /* renamed from: l6.m0$d */
    /* loaded from: combined.jar:classes1.jar:l6/m0$d.class */
    public interface d<T> {
        /* renamed from: a */
        T mo27977a();
    }

    public C5708m0(InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2, AbstractC5691e abstractC5691e, C5722t0 c5722t0, InterfaceC4645a<String> interfaceC4645a) {
        this.f32053b = c5722t0;
        this.f32054c = interfaceC6654a;
        this.f32055d = interfaceC6654a2;
        this.f32056e = abstractC5691e;
        this.f32057f = interfaceC4645a;
    }

    /* renamed from: A1 */
    public static /* synthetic */ Object m27991A1(long j10, AbstractC1004o abstractC1004o, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC1004o.mo5927b(), String.valueOf(C6913a.m31838a(abstractC1004o.mo5929d()))}) >= 1) {
            return null;
        }
        contentValues.put("backend_name", abstractC1004o.mo5927b());
        contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(C6913a.m31838a(abstractC1004o.mo5929d())));
        sQLiteDatabase.insert("transport_contexts", null, contentValues);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public /* synthetic */ Object m27994B1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f32054c.mo30655a()).execute();
        return null;
    }

    /* renamed from: E1 */
    public static byte[] m27998E1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: I1 */
    public static C10054b m28003I1(String str) {
        return str == null ? f32052g : C10054b.m42268b(str);
    }

    /* renamed from: J1 */
    public static String m28005J1(Iterable<AbstractC5703k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC5703k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().mo27954c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: K1 */
    public static <T> T m28007K1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public /* synthetic */ Object m28013d1(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo27957l(cursor.getInt(0), C4958c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public /* synthetic */ Integer m28014e1(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        m28007K1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b(this) { // from class: l6.r

            /* renamed from: a */
            public final C5708m0 f32073a;

            {
                this.f32073a = this;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Object m28013d1;
                m28013d1 = this.f32073a.m28013d1((Cursor) obj);
                return m28013d1;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: f1 */
    public static /* synthetic */ Object m28015f1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* renamed from: g1 */
    public static /* synthetic */ Object m28016g1(Throwable th2) {
        throw new C5930a("Timed out while trying to acquire the lock.", th2);
    }

    /* renamed from: h1 */
    public static /* synthetic */ SQLiteDatabase m28017h1(Throwable th2) {
        throw new C5930a("Timed out while trying to open db.", th2);
    }

    /* renamed from: i1 */
    public static /* synthetic */ Long m28018i1(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* renamed from: j1 */
    public static /* synthetic */ C4961f m28019j1(long j10, Cursor cursor) {
        cursor.moveToNext();
        return C4961f.m24978c().m24983c(cursor.getLong(0)).m24982b(j10).m24981a();
    }

    /* renamed from: k1 */
    public static /* synthetic */ C4961f m28020k1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (C4961f) m28007K1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b(j10) { // from class: l6.d0

            /* renamed from: a */
            public final long f32035a;

            {
                this.f32035a = j10;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                C4961f m28019j1;
                m28019j1 = C5708m0.m28019j1(this.f32035a, (Cursor) obj);
                return m28019j1;
            }
        });
    }

    /* renamed from: l1 */
    public static /* synthetic */ Long m28021l1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ Boolean m28022m1(AbstractC1004o abstractC1004o, SQLiteDatabase sQLiteDatabase) {
        Long m28058Z0 = m28058Z0(sQLiteDatabase, abstractC1004o);
        return m28058Z0 == null ? Boolean.FALSE : (Boolean) m28007K1(m28053U0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m28058Z0.toString()}), new b() { // from class: l6.z
            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* renamed from: n1 */
    public static /* synthetic */ List m28023n1(SQLiteDatabase sQLiteDatabase) {
        return (List) m28007K1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: l6.k0
            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                List m28025o1;
                m28025o1 = C5708m0.m28025o1((Cursor) obj);
                return m28025o1;
            }
        });
    }

    /* renamed from: o1 */
    public static /* synthetic */ List m28025o1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC1004o.m5960a().mo5931b(cursor.getString(1)).mo5933d(C6913a.m31839b(cursor.getInt(2))).mo5932c(m27998E1(cursor.getString(3))).mo5930a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ List m28026p1(AbstractC1004o abstractC1004o, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC5703k> m28044C1 = m28044C1(sQLiteDatabase, abstractC1004o);
        return m28061c1(m28044C1, m28045D1(sQLiteDatabase, m28044C1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ C4956a m28029q1(Map map, C4956a.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C4958c.b m28049Q0 = m28049Q0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C4958c.m24960c().m24965c(m28049Q0).m24964b(j10).m24963a());
        }
        m28046F1(aVar, map);
        aVar.m24955e(m28057Y0());
        aVar.m24954d(m28054V0());
        aVar.m24953c(this.f32057f.get());
        return aVar.m24952b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ C4956a m28030r1(String str, final Map map, final C4956a.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C4956a) m28007K1(sQLiteDatabase.rawQuery(str, new String[0]), new b(this, map, aVar) { // from class: l6.b0

            /* renamed from: a */
            public final C5708m0 f32031a;

            /* renamed from: b */
            public final Map f32032b;

            /* renamed from: c */
            public final C4956a.a f32033c;

            {
                this.f32031a = this;
                this.f32032b = map;
                this.f32033c = aVar;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                C4956a m28029q1;
                m28029q1 = this.f32031a.m28029q1(this.f32032b, this.f32033c, (Cursor) obj);
                return m28029q1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ Object m28031s1(List list, AbstractC1004o abstractC1004o, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            AbstractC0998i.a mo5915k = AbstractC0998i.m5942a().mo5914j(cursor.getString(1)).mo5913i(cursor.getLong(2)).mo5915k(cursor.getLong(3));
            mo5915k.mo5912h(z10 ? new C0997h(m28003I1(cursor.getString(4)), cursor.getBlob(5)) : new C0997h(m28003I1(cursor.getString(4)), m28047G1(j10)));
            if (!cursor.isNull(6)) {
                mo5915k.mo5911g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC5703k.m27989a(j10, abstractC1004o, mo5915k.mo5908d()));
        }
        return null;
    }

    /* renamed from: t1 */
    public static /* synthetic */ Object m28033t1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            Set set2 = set;
            if (set == null) {
                set2 = new HashSet();
                map.put(Long.valueOf(j10), set2);
            }
            set2.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ Long m28034u1(AbstractC0998i abstractC0998i, AbstractC1004o abstractC1004o, SQLiteDatabase sQLiteDatabase) {
        if (m28060b1()) {
            mo27957l(1L, C4958c.b.CACHE_FULL, abstractC0998i.mo5906j());
            return -1L;
        }
        long m28051S0 = m28051S0(sQLiteDatabase, abstractC1004o);
        int mo27945e = this.f32056e.mo27945e();
        byte[] m5940a = abstractC0998i.mo5904e().m5940a();
        boolean z10 = m5940a.length <= mo27945e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m28051S0));
        contentValues.put("transport_name", abstractC0998i.mo5906j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC0998i.mo5905f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC0998i.mo5907k()));
        contentValues.put("payload_encoding", abstractC0998i.mo5904e().m5941b().m42269a());
        contentValues.put("code", abstractC0998i.mo5903d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? m5940a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(m5940a.length / mo27945e);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(m5940a, (i10 - 1) * mo27945e, Math.min(i10 * mo27945e, m5940a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC0998i.m5946i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: v1 */
    public static /* synthetic */ byte[] m28037v1(Cursor cursor) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            i10 = i11;
            if (!cursor.moveToNext()) {
                break;
            }
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i11 = i10 + blob.length;
        }
        byte[] bArr = new byte[i10];
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            byte[] bArr2 = (byte[]) arrayList.get(i13);
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public /* synthetic */ Object m28039w1(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo27957l(cursor.getInt(0), C4958c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public /* synthetic */ Object m28040x1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m28007K1(sQLiteDatabase.rawQuery(str2, null), new b(this) { // from class: l6.y

            /* renamed from: a */
            public final C5708m0 f32096a;

            {
                this.f32096a = this;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Object m28039w1;
                m28039w1 = this.f32096a.m28039w1((Cursor) obj);
                return m28039w1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: y1 */
    public static /* synthetic */ Boolean m28042y1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: z1 */
    public static /* synthetic */ Object m28043z1(String str, C4958c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m28007K1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: l6.x
            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Boolean m28042y1;
                m28042y1 = C5708m0.m28042y1((Cursor) obj);
                return m28042y1;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    @Override // p197l6.InterfaceC5689d
    /* renamed from: C */
    public int mo27959C() {
        final long mo30655a = this.f32054c.mo30655a() - this.f32056e.mo27943c();
        return ((Integer) m28059a1(new b(this, mo30655a) { // from class: l6.j0

            /* renamed from: a */
            public final C5708m0 f32045a;

            /* renamed from: b */
            public final long f32046b;

            {
                this.f32045a = this;
                this.f32046b = mo30655a;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Integer m28014e1;
                m28014e1 = this.f32045a.m28014e1(this.f32046b, (SQLiteDatabase) obj);
                return m28014e1;
            }
        })).intValue();
    }

    /* renamed from: C1 */
    public final List<AbstractC5703k> m28044C1(SQLiteDatabase sQLiteDatabase, final AbstractC1004o abstractC1004o) {
        final ArrayList arrayList = new ArrayList();
        Long m28058Z0 = m28058Z0(sQLiteDatabase, abstractC1004o);
        if (m28058Z0 == null) {
            return arrayList;
        }
        m28007K1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m28058Z0.toString()}, null, null, null, String.valueOf(this.f32056e.mo27944d())), new b(this, arrayList, abstractC1004o) { // from class: l6.v

            /* renamed from: a */
            public final C5708m0 f32092a;

            /* renamed from: b */
            public final List f32093b;

            /* renamed from: c */
            public final AbstractC1004o f32094c;

            {
                this.f32092a = this;
                this.f32093b = arrayList;
                this.f32094c = abstractC1004o;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Object m28031s1;
                m28031s1 = this.f32092a.m28031s1(this.f32093b, this.f32094c, (Cursor) obj);
                return m28031s1;
            }
        });
        return arrayList;
    }

    @Override // p197l6.InterfaceC5689d
    /* renamed from: D */
    public void mo27960D(Iterable<AbstractC5703k> iterable) {
        if (iterable.iterator().hasNext()) {
            m28053U0().compileStatement("DELETE FROM events WHERE _id in " + m28005J1(iterable)).execute();
        }
    }

    /* renamed from: D1 */
    public final Map<Long, Set<c>> m28045D1(SQLiteDatabase sQLiteDatabase, List<AbstractC5703k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).mo27954c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m28007K1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b(hashMap) { // from class: l6.t

            /* renamed from: a */
            public final Map f32074a;

            {
                this.f32074a = hashMap;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Object m28033t1;
                m28033t1 = C5708m0.m28033t1(this.f32074a, (Cursor) obj);
                return m28033t1;
            }
        });
        return hashMap;
    }

    /* renamed from: F1 */
    public final void m28046F1(C4956a.a aVar, Map<String, List<C4958c>> map) {
        for (Map.Entry<String, List<C4958c>> entry : map.entrySet()) {
            aVar.m24951a(C4959d.m24966c().m24971c(entry.getKey()).m24970b(entry.getValue()).m24969a());
        }
    }

    /* renamed from: G1 */
    public final byte[] m28047G1(long j10) {
        return (byte[]) m28007K1(m28053U0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: l6.a0
            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                byte[] m28037v1;
                m28037v1 = C5708m0.m28037v1((Cursor) obj);
                return m28037v1;
            }
        });
    }

    /* renamed from: H1 */
    public final <T> T m28048H1(d<T> dVar, b<Throwable, T> bVar) {
        long mo30655a = this.f32055d.mo30655a();
        while (true) {
            try {
                return dVar.mo27977a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f32055d.mo30655a() >= this.f32056e.mo27942b() + mo30655a) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p197l6.InterfaceC5689d
    /* renamed from: K */
    public Iterable<AbstractC1004o> mo27961K() {
        return (Iterable) m28059a1(new b() { // from class: l6.l
            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                List m28023n1;
                m28023n1 = C5708m0.m28023n1((SQLiteDatabase) obj);
                return m28023n1;
            }
        });
    }

    @Override // p197l6.InterfaceC5689d
    /* renamed from: L */
    public void mo27962L(final AbstractC1004o abstractC1004o, final long j10) {
        m28059a1(new b(j10, abstractC1004o) { // from class: l6.n

            /* renamed from: a */
            public final long f32060a;

            /* renamed from: b */
            public final AbstractC1004o f32061b;

            {
                this.f32060a = j10;
                this.f32061b = abstractC1004o;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Object m27991A1;
                m27991A1 = C5708m0.m27991A1(this.f32060a, this.f32061b, (SQLiteDatabase) obj);
                return m27991A1;
            }
        });
    }

    @Override // p197l6.InterfaceC5689d
    /* renamed from: N */
    public AbstractC5703k mo27963N(final AbstractC1004o abstractC1004o, final AbstractC0998i abstractC0998i) {
        C5036a.m25236b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC1004o.mo5929d(), abstractC0998i.mo5906j(), abstractC1004o.mo5927b());
        long longValue = ((Long) m28059a1(new b(this, abstractC0998i, abstractC1004o) { // from class: l6.i0

            /* renamed from: a */
            public final C5708m0 f32041a;

            /* renamed from: b */
            public final AbstractC0998i f32042b;

            /* renamed from: c */
            public final AbstractC1004o f32043c;

            {
                this.f32041a = this;
                this.f32042b = abstractC0998i;
                this.f32043c = abstractC1004o;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Long m28034u1;
                m28034u1 = this.f32041a.m28034u1(this.f32042b, this.f32043c, (SQLiteDatabase) obj);
                return m28034u1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC5703k.m27989a(longValue, abstractC1004o, abstractC0998i);
    }

    /* renamed from: Q0 */
    public final C4958c.b m28049Q0(int i10) {
        C4958c.b bVar = C4958c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        C4958c.b bVar2 = C4958c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        C4958c.b bVar3 = C4958c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        C4958c.b bVar4 = C4958c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        C4958c.b bVar5 = C4958c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        C4958c.b bVar6 = C4958c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        C4958c.b bVar7 = C4958c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        C5036a.m25235a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    /* renamed from: R0 */
    public final void m28050R0(final SQLiteDatabase sQLiteDatabase) {
        m28048H1(new d(sQLiteDatabase) { // from class: l6.g0

            /* renamed from: a */
            public final SQLiteDatabase f32038a;

            {
                this.f32038a = sQLiteDatabase;
            }

            @Override // p197l6.C5708m0.d
            /* renamed from: a */
            public final Object mo27977a() {
                Object m28015f1;
                m28015f1 = C5708m0.m28015f1(this.f32038a);
                return m28015f1;
            }
        }, new b() { // from class: l6.h0
            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Object m28016g1;
                m28016g1 = C5708m0.m28016g1((Throwable) obj);
                return m28016g1;
            }
        });
    }

    /* renamed from: S0 */
    public final long m28051S0(SQLiteDatabase sQLiteDatabase, AbstractC1004o abstractC1004o) {
        Long m28058Z0 = m28058Z0(sQLiteDatabase, abstractC1004o);
        if (m28058Z0 != null) {
            return m28058Z0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC1004o.mo5927b());
        contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(C6913a.m31838a(abstractC1004o.mo5929d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC1004o.mo5928c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC1004o.mo5928c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: T0 */
    public long m28052T0() {
        return m28055W0() * m28056X0();
    }

    /* renamed from: U0 */
    public SQLiteDatabase m28053U0() {
        final C5722t0 c5722t0 = this.f32053b;
        Objects.requireNonNull(c5722t0);
        return (SQLiteDatabase) m28048H1(new d(c5722t0) { // from class: l6.w

            /* renamed from: a */
            public final C5722t0 f32095a;

            {
                this.f32095a = c5722t0;
            }

            @Override // p197l6.C5708m0.d
            /* renamed from: a */
            public final Object mo27977a() {
                return this.f32095a.getWritableDatabase();
            }
        }, new b() { // from class: l6.e0
            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                SQLiteDatabase m28017h1;
                m28017h1 = C5708m0.m28017h1((Throwable) obj);
                return m28017h1;
            }
        });
    }

    /* renamed from: V0 */
    public final C4957b m28054V0() {
        return C4957b.m24956b().m24959b(C4960e.m24972c().m24976b(m28052T0()).m24977c(AbstractC5691e.f32036a.mo27946f()).m24975a()).m24958a();
    }

    /* renamed from: W0 */
    public final long m28055W0() {
        return m28053U0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // p197l6.InterfaceC5689d
    /* renamed from: X */
    public boolean mo27964X(final AbstractC1004o abstractC1004o) {
        return ((Boolean) m28059a1(new b(this, abstractC1004o) { // from class: l6.l0

            /* renamed from: a */
            public final C5708m0 f32047a;

            /* renamed from: b */
            public final AbstractC1004o f32048b;

            {
                this.f32047a = this;
                this.f32048b = abstractC1004o;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Boolean m28022m1;
                m28022m1 = this.f32047a.m28022m1(this.f32048b, (SQLiteDatabase) obj);
                return m28022m1;
            }
        })).booleanValue();
    }

    /* renamed from: X0 */
    public final long m28056X0() {
        return m28053U0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: Y0 */
    public final C4961f m28057Y0() {
        final long mo30655a = this.f32054c.mo30655a();
        return (C4961f) m28059a1(new b(mo30655a) { // from class: l6.c0

            /* renamed from: a */
            public final long f32034a;

            {
                this.f32034a = mo30655a;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                C4961f m28020k1;
                m28020k1 = C5708m0.m28020k1(this.f32034a, (SQLiteDatabase) obj);
                return m28020k1;
            }
        });
    }

    @Override // p197l6.InterfaceC5689d
    /* renamed from: Z */
    public void mo27965Z(Iterable<AbstractC5703k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m28005J1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m28059a1(new b(this, str, str2) { // from class: l6.q

                /* renamed from: a */
                public final C5708m0 f32070a;

                /* renamed from: b */
                public final String f32071b;

                /* renamed from: c */
                public final String f32072c;

                {
                    this.f32070a = this;
                    this.f32071b = str;
                    this.f32072c = str2;
                }

                @Override // p197l6.C5708m0.b
                public final Object apply(Object obj) {
                    Object m28040x1;
                    m28040x1 = this.f32070a.m28040x1(this.f32071b, this.f32072c, (SQLiteDatabase) obj);
                    return m28040x1;
                }
            });
        }
    }

    /* renamed from: Z0 */
    public final Long m28058Z0(SQLiteDatabase sQLiteDatabase, AbstractC1004o abstractC1004o) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC1004o.mo5927b(), String.valueOf(C6913a.m31838a(abstractC1004o.mo5929d()))));
        if (abstractC1004o.mo5928c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC1004o.mo5928c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m28007K1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: l6.s
            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Long m28021l1;
                m28021l1 = C5708m0.m28021l1((Cursor) obj);
                return m28021l1;
            }
        });
    }

    /* renamed from: a1 */
    public <T> T m28059a1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m28053U0 = m28053U0();
        m28053U0.beginTransaction();
        try {
            T apply = bVar.apply(m28053U0);
            m28053U0.setTransactionSuccessful();
            return apply;
        } finally {
            m28053U0.endTransaction();
        }
    }

    /* renamed from: b1 */
    public final boolean m28060b1() {
        return m28055W0() * m28056X0() >= this.f32056e.mo27946f();
    }

    /* renamed from: c1 */
    public final List<AbstractC5703k> m28061c1(List<AbstractC5703k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC5703k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC5703k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo27954c()))) {
                AbstractC0998i.a m5947l = next.mo27953b().m5947l();
                for (c cVar : map.get(Long.valueOf(next.mo27954c()))) {
                    m5947l.m5950c(cVar.f32058a, cVar.f32059b);
                }
                listIterator.set(AbstractC5703k.m27989a(next.mo27954c(), next.mo27955d(), m5947l.mo5908d()));
            }
        }
        return list;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32053b.close();
    }

    @Override // p197l6.InterfaceC5687c
    /* renamed from: f */
    public void mo27956f() {
        m28059a1(new b(this) { // from class: l6.o

            /* renamed from: a */
            public final C5708m0 f32067a;

            {
                this.f32067a = this;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Object m27994B1;
                m27994B1 = this.f32067a.m27994B1((SQLiteDatabase) obj);
                return m27994B1;
            }
        });
    }

    @Override // p197l6.InterfaceC5689d
    /* renamed from: f0 */
    public Iterable<AbstractC5703k> mo27966f0(final AbstractC1004o abstractC1004o) {
        return (Iterable) m28059a1(new b(this, abstractC1004o) { // from class: l6.p

            /* renamed from: a */
            public final C5708m0 f32068a;

            /* renamed from: b */
            public final AbstractC1004o f32069b;

            {
                this.f32068a = this;
                this.f32069b = abstractC1004o;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                List m28026p1;
                m28026p1 = this.f32068a.m28026p1(this.f32069b, (SQLiteDatabase) obj);
                return m28026p1;
            }
        });
    }

    @Override // p197l6.InterfaceC5687c
    /* renamed from: l */
    public void mo27957l(final long j10, final C4958c.b bVar, final String str) {
        m28059a1(new b(str, bVar, j10) { // from class: l6.m

            /* renamed from: a */
            public final String f32049a;

            /* renamed from: b */
            public final C4958c.b f32050b;

            /* renamed from: c */
            public final long f32051c;

            {
                this.f32049a = str;
                this.f32050b = bVar;
                this.f32051c = j10;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Object m28043z1;
                m28043z1 = C5708m0.m28043z1(this.f32049a, this.f32050b, this.f32051c, (SQLiteDatabase) obj);
                return m28043z1;
            }
        });
    }

    @Override // p197l6.InterfaceC5689d
    /* renamed from: l0 */
    public long mo27967l0(AbstractC1004o abstractC1004o) {
        return ((Long) m28007K1(m28053U0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC1004o.mo5927b(), String.valueOf(C6913a.m31838a(abstractC1004o.mo5929d()))}), new b() { // from class: l6.f0
            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                Long m28018i1;
                m28018i1 = C5708m0.m28018i1((Cursor) obj);
                return m28018i1;
            }
        })).longValue();
    }

    @Override // p197l6.InterfaceC5687c
    /* renamed from: o */
    public C4956a mo27958o() {
        final C4956a.a m24945e = C4956a.m24945e();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        final HashMap hashMap = new HashMap();
        return (C4956a) m28059a1(new b(this, str, hashMap, m24945e) { // from class: l6.u

            /* renamed from: a */
            public final C5708m0 f32085a;

            /* renamed from: b */
            public final String f32086b;

            /* renamed from: c */
            public final Map f32087c;

            /* renamed from: d */
            public final C4956a.a f32088d;

            {
                this.f32085a = this;
                this.f32086b = str;
                this.f32087c = hashMap;
                this.f32088d = m24945e;
            }

            @Override // p197l6.C5708m0.b
            public final Object apply(Object obj) {
                C4956a m28030r1;
                m28030r1 = this.f32085a.m28030r1(this.f32086b, this.f32087c, this.f32088d, (SQLiteDatabase) obj);
                return m28030r1;
            }
        });
    }

    @Override // p213m6.InterfaceC5931b
    /* renamed from: p */
    public <T> T mo28062p(InterfaceC5931b.a<T> aVar) {
        SQLiteDatabase m28053U0 = m28053U0();
        m28050R0(m28053U0);
        try {
            T execute = aVar.execute();
            m28053U0.setTransactionSuccessful();
            return execute;
        } finally {
            m28053U0.endTransaction();
        }
    }
}
