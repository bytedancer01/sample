package p134hg;

import android.content.ContentValues;
import android.database.Cursor;
import com.onesignal.InterfaceC4198q3;
import com.onesignal.InterfaceC4216t2;
import com.onesignal.InterfaceC4239x1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.slf4j.Logger;
import p103fg.EnumC4858b;
import p103fg.EnumC4859c;
import p152ig.C5256a;
import p152ig.C5257b;
import p152ig.C5259d;
import p152ig.C5260e;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hg/a.class
 */
/* renamed from: hg.a */
/* loaded from: combined.jar:classes2.jar:hg/a.class */
public final class C5078a {

    /* renamed from: a */
    @NotNull
    public final InterfaceC4239x1 f29197a;

    /* renamed from: b */
    @NotNull
    public final InterfaceC4198q3 f29198b;

    /* renamed from: c */
    @NotNull
    public final InterfaceC4216t2 f29199c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hg/a$a.class
     */
    /* renamed from: hg.a$a */
    /* loaded from: combined.jar:classes2.jar:hg/a$a.class */
    public final /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f29200a;

        static {
            int[] iArr = new int[EnumC4859c.values().length];
            iArr[EnumC4859c.DIRECT.ordinal()] = 1;
            iArr[EnumC4859c.INDIRECT.ordinal()] = 2;
            f29200a = iArr;
        }
    }

    public C5078a(@NotNull InterfaceC4239x1 interfaceC4239x1, @NotNull InterfaceC4198q3 interfaceC4198q3, @NotNull InterfaceC4216t2 interfaceC4216t2) {
        C9367f.m39526e(interfaceC4239x1, "logger");
        C9367f.m39526e(interfaceC4198q3, "dbHelper");
        C9367f.m39526e(interfaceC4216t2, "preferences");
        this.f29197a = interfaceC4239x1;
        this.f29198b = interfaceC4198q3;
        this.f29199c = interfaceC4216t2;
    }

    /* renamed from: a */
    public final void m25359a(List<C5256a> list, JSONArray jSONArray, EnumC4858b enumC4858b) {
        if (jSONArray == null) {
            return;
        }
        int i10 = 0;
        int length = jSONArray.length();
        if (length <= 0) {
            return;
        }
        while (true) {
            int i11 = i10 + 1;
            try {
                String string = jSONArray.getString(i10);
                C9367f.m39525d(string, "influenceId");
                list.add(new C5256a(string, enumC4858b));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            if (i11 >= length) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    /* renamed from: b */
    public final void m25360b(List<C5256a> list, C5260e c5260e) {
        if (c5260e == null) {
            return;
        }
        JSONArray m26323a = c5260e.m26323a();
        JSONArray m26324b = c5260e.m26324b();
        m25359a(list, m26323a, EnumC4858b.IAM);
        m25359a(list, m26324b, EnumC4858b.NOTIFICATION);
    }

    /* renamed from: c */
    public final void m25361c(@NotNull String str, @NotNull String str2) {
        synchronized (this) {
            C9367f.m39526e(str, "notificationTableName");
            C9367f.m39526e(str2, "notificationIdColumnName");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NOT EXISTS(SELECT NULL FROM ");
            sb2.append(str);
            sb2.append(" n WHERE n.");
            sb2.append(str2);
            sb2.append(" = channel_influence_id AND channel_type = \"");
            String enumC4858b = EnumC4858b.NOTIFICATION.toString();
            Locale locale = Locale.ROOT;
            C9367f.m39525d(locale, Logger.ROOT_LOGGER_NAME);
            if (enumC4858b == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = enumC4858b.toLowerCase(locale);
            C9367f.m39525d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb2.append(lowerCase);
            sb2.append("\")");
            this.f29198b.mo20745p("cached_unique_outcome", sb2.toString(), null);
        }
    }

    /* renamed from: d */
    public final void m25362d(@NotNull C5257b c5257b) {
        synchronized (this) {
            C9367f.m39526e(c5257b, "event");
            this.f29198b.mo20745p("outcome", "timestamp = ?", new String[]{String.valueOf(c5257b.m26311c())});
        }
    }

    @NotNull
    /* renamed from: e */
    public final List<C5257b> m25363e() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                Cursor mo20744o = this.f29198b.mo20744o("outcome", null, null, null, null, null, null);
                try {
                    if (mo20744o.moveToFirst()) {
                        do {
                            String string = mo20744o.getString(mo20744o.getColumnIndex("notification_influence_type"));
                            EnumC4859c.a aVar = EnumC4859c.Companion;
                            EnumC4859c m24729a = aVar.m24729a(string);
                            EnumC4859c m24729a2 = aVar.m24729a(mo20744o.getString(mo20744o.getColumnIndex("iam_influence_type")));
                            String string2 = mo20744o.getString(mo20744o.getColumnIndex("notification_ids"));
                            String str = string2;
                            if (string2 == null) {
                                str = "[]";
                            }
                            String string3 = mo20744o.getString(mo20744o.getColumnIndex("iam_ids"));
                            String str2 = string3;
                            if (string3 == null) {
                                str2 = "[]";
                            }
                            String string4 = mo20744o.getString(mo20744o.getColumnIndex("name"));
                            float f10 = mo20744o.getFloat(mo20744o.getColumnIndex("weight"));
                            long j10 = mo20744o.getLong(mo20744o.getColumnIndex("timestamp"));
                            try {
                                C5260e c5260e = new C5260e(null, null, 3, null);
                                C5260e c5260e2 = new C5260e(null, null, 3, null);
                                C5259d m25366h = m25366h(m24729a, c5260e, c5260e2, str);
                                m25364f(m24729a2, c5260e, c5260e2, str2, m25366h);
                                C5259d c5259d = m25366h;
                                if (m25366h == null) {
                                    c5259d = new C5259d(null, null);
                                }
                                C9367f.m39525d(string4, "name");
                                arrayList.add(new C5257b(string4, c5259d, f10, j10));
                            } catch (JSONException e10) {
                                this.f29197a.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e10);
                            }
                        } while (mo20744o.moveToNext());
                    }
                    if (!mo20744o.isClosed()) {
                        mo20744o.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = mo20744o;
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final C5259d m25364f(EnumC4859c enumC4859c, C5260e c5260e, C5260e c5260e2, String str, C5259d c5259d) {
        int i10 = a.f29200a[enumC4859c.ordinal()];
        if (i10 == 1) {
            c5260e.m26325c(new JSONArray(str));
            C5259d m26318c = c5259d == null ? null : c5259d.m26318c(c5260e);
            c5259d = m26318c;
            if (m26318c == null) {
                c5259d = new C5259d(c5260e, null);
            }
        } else if (i10 == 2) {
            c5260e2.m26325c(new JSONArray(str));
            C5259d m26320e = c5259d == null ? null : c5259d.m26320e(c5260e2);
            c5259d = m26320e;
            if (m26320e == null) {
                c5259d = new C5259d(null, c5260e2);
            }
        }
        return c5259d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0168, code lost:
    
        if (r12.isClosed() != false) goto L72;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<p103fg.C4857a> m25365g(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.util.List<p103fg.C4857a> r12) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p134hg.C5078a.m25365g(java.lang.String, java.util.List):java.util.List");
    }

    /* renamed from: h */
    public final C5259d m25366h(EnumC4859c enumC4859c, C5260e c5260e, C5260e c5260e2, String str) {
        int i10 = a.f29200a[enumC4859c.ordinal()];
        C5259d c5259d = null;
        if (i10 == 1) {
            c5260e.m26326d(new JSONArray(str));
            c5259d = new C5259d(c5260e, null);
        } else if (i10 == 2) {
            c5260e2.m26326d(new JSONArray(str));
            c5259d = new C5259d(null, c5260e2);
        }
        return c5259d;
    }

    @Nullable
    /* renamed from: i */
    public final Set<String> m25367i() {
        InterfaceC4216t2 interfaceC4216t2 = this.f29199c;
        return interfaceC4216t2.mo20884c(interfaceC4216t2.mo20890i(), "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    /* renamed from: j */
    public final boolean m25368j() {
        InterfaceC4216t2 interfaceC4216t2 = this.f29199c;
        return interfaceC4216t2.mo20888g(interfaceC4216t2.mo20890i(), this.f29199c.mo20891j(), false);
    }

    /* renamed from: k */
    public final void m25369k(@NotNull C5257b c5257b) {
        EnumC4859c enumC4859c;
        JSONArray jSONArray;
        EnumC4859c enumC4859c2;
        C5260e m26316a;
        EnumC4859c enumC4859c3;
        synchronized (this) {
            C9367f.m39526e(c5257b, "eventParams");
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            EnumC4859c enumC4859c4 = EnumC4859c.UNATTRIBUTED;
            C5259d m26310b = c5257b.m26310b();
            if (m26310b == null || (m26316a = m26310b.m26316a()) == null) {
                enumC4859c = enumC4859c4;
            } else {
                JSONArray m26324b = m26316a.m26324b();
                if (m26324b != null && m26324b.length() > 0) {
                    enumC4859c3 = EnumC4859c.DIRECT;
                    jSONArray2 = m26324b;
                } else {
                    enumC4859c3 = enumC4859c4;
                }
                JSONArray m26323a = m26316a.m26323a();
                if (m26323a != null && m26323a.length() > 0) {
                    enumC4859c4 = EnumC4859c.DIRECT;
                    jSONArray3 = m26323a;
                }
                EnumC4859c enumC4859c5 = enumC4859c4;
                enumC4859c4 = enumC4859c3;
                enumC4859c = enumC4859c5;
            }
            C5259d m26310b2 = c5257b.m26310b();
            if (m26310b2 == null) {
                jSONArray = jSONArray2;
                enumC4859c2 = enumC4859c4;
            } else {
                C5260e m26317b = m26310b2.m26317b();
                if (m26317b == null) {
                    jSONArray = jSONArray2;
                    enumC4859c2 = enumC4859c4;
                } else {
                    JSONArray m26324b2 = m26317b.m26324b();
                    if (m26324b2 != null && m26324b2.length() > 0) {
                        enumC4859c4 = EnumC4859c.INDIRECT;
                        jSONArray2 = m26324b2;
                    }
                    JSONArray m26323a2 = m26317b.m26323a();
                    if (m26323a2 == null) {
                        jSONArray = jSONArray2;
                        enumC4859c2 = enumC4859c4;
                    } else {
                        jSONArray = jSONArray2;
                        enumC4859c2 = enumC4859c4;
                        if (m26323a2.length() > 0) {
                            enumC4859c = EnumC4859c.INDIRECT;
                            jSONArray3 = m26323a2;
                            enumC4859c2 = enumC4859c4;
                            jSONArray = jSONArray2;
                        }
                    }
                }
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_ids", jSONArray.toString());
            contentValues.put("iam_ids", jSONArray3.toString());
            String obj = enumC4859c2.toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj.toLowerCase();
            C9367f.m39525d(lowerCase, "(this as java.lang.String).toLowerCase()");
            contentValues.put("notification_influence_type", lowerCase);
            String obj2 = enumC4859c.toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = obj2.toLowerCase();
            C9367f.m39525d(lowerCase2, "(this as java.lang.String).toLowerCase()");
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put("name", c5257b.m26309a());
            contentValues.put("weight", Float.valueOf(c5257b.m26312d()));
            contentValues.put("timestamp", Long.valueOf(c5257b.m26311c()));
            this.f29198b.mo20746q("outcome", null, contentValues);
        }
    }

    /* renamed from: l */
    public final void m25370l(@Nullable Set<String> set) {
        InterfaceC4216t2 interfaceC4216t2 = this.f29199c;
        String mo20890i = interfaceC4216t2.mo20890i();
        C9367f.m39524c(set);
        interfaceC4216t2.mo20886e(mo20890i, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    /* renamed from: m */
    public final void m25371m(@NotNull C5257b c5257b) {
        synchronized (this) {
            C9367f.m39526e(c5257b, "eventParams");
            this.f29197a.debug(C9367f.m39532k("OneSignal saveUniqueOutcomeEventParams: ", c5257b));
            String m26309a = c5257b.m26309a();
            ArrayList arrayList = new ArrayList();
            C5259d m26310b = c5257b.m26310b();
            C5260e m26316a = m26310b == null ? null : m26310b.m26316a();
            C5259d m26310b2 = c5257b.m26310b();
            C5260e m26317b = m26310b2 == null ? null : m26310b2.m26317b();
            m25360b(arrayList, m26316a);
            m25360b(arrayList, m26317b);
            for (C5256a c5256a : arrayList) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", c5256a.m26308b());
                contentValues.put("channel_type", c5256a.m26307a().toString());
                contentValues.put("name", m26309a);
                this.f29198b.mo20746q("cached_unique_outcome", null, contentValues);
            }
        }
    }
}
