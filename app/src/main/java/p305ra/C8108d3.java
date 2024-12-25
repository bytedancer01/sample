package p305ra;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/d3.class
 */
/* renamed from: ra.d3 */
/* loaded from: combined.jar:classes2.jar:ra/d3.class */
public final class C8108d3 implements InterfaceC8168h3 {

    /* renamed from: g */
    public static final Map<Uri, C8108d3> f38986g = new C7928a();

    /* renamed from: h */
    public static final String[] f38987h = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f38988a;

    /* renamed from: b */
    public final Uri f38989b;

    /* renamed from: c */
    public final ContentObserver f38990c;

    /* renamed from: d */
    public final Object f38991d;

    /* renamed from: e */
    public volatile Map<String, String> f38992e;

    /* renamed from: f */
    public final List<InterfaceC8123e3> f38993f;

    public C8108d3(ContentResolver contentResolver, Uri uri) {
        C8093c3 c8093c3 = new C8093c3(this, null);
        this.f38990c = c8093c3;
        this.f38991d = new Object();
        this.f38993f = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f38988a = contentResolver;
        this.f38989b = uri;
        contentResolver.registerContentObserver(uri, false, c8093c3);
    }

    /* renamed from: a */
    public static C8108d3 m35194a(ContentResolver contentResolver, Uri uri) {
        C8108d3 c8108d3;
        synchronized (C8108d3.class) {
            try {
                Map<Uri, C8108d3> map = f38986g;
                C8108d3 c8108d32 = map.get(uri);
                c8108d3 = c8108d32;
                if (c8108d32 == null) {
                    try {
                        c8108d3 = new C8108d3(contentResolver, uri);
                        try {
                            map.put(uri, c8108d3);
                        } catch (SecurityException e10) {
                        }
                    } catch (SecurityException e11) {
                        c8108d3 = c8108d32;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8108d3;
    }

    /* renamed from: d */
    public static void m35195d() {
        synchronized (C8108d3.class) {
            try {
                for (C8108d3 c8108d3 : f38986g.values()) {
                    c8108d3.f38988a.unregisterContentObserver(c8108d3.f38990c);
                }
                f38986g.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final Map<String, String> m35196b() {
        Map<String, String> map = this.f38992e;
        Map<String, String> map2 = map;
        if (map == null) {
            synchronized (this.f38991d) {
                Map<String, String> map3 = this.f38992e;
                map2 = map3;
                if (map3 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map2 = (Map) C8138f3.m35359a(new InterfaceC8153g3(this) { // from class: ra.b3

                                /* renamed from: a */
                                public final C8108d3 f38943a;

                                {
                                    this.f38943a = this;
                                }

                                @Override // p305ra.InterfaceC8153g3
                                public final Object zza() {
                                    return this.f38943a.m35198e();
                                }
                            });
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map2 = null;
                        }
                        this.f38992e = map2;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th2;
                    }
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* renamed from: c */
    public final void m35197c() {
        synchronized (this.f38991d) {
            this.f38992e = null;
            AbstractC8408x3.m36063c();
        }
        synchronized (this) {
            Iterator<InterfaceC8123e3> it = this.f38993f.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ Map m35198e() {
        Cursor query = this.f38988a.query(this.f38989b, f38987h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c7928a = count <= 256 ? new C7928a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                c7928a.put(query.getString(0), query.getString(1));
            }
            query.close();
            return c7928a;
        } finally {
            query.close();
        }
    }

    @Override // p305ra.InterfaceC8168h3
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo35199g(String str) {
        return m35196b().get(str);
    }
}
