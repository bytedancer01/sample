package id;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/u.class
 */
/* renamed from: id.u */
/* loaded from: combined.jar:classes2.jar:id/u.class */
public final class C5239u {

    /* renamed from: a */
    public final SharedPreferences f29942a;

    /* renamed from: e */
    public final Executor f29946e;

    /* renamed from: d */
    public final ArrayDeque<String> f29945d = new ArrayDeque<>();

    /* renamed from: f */
    public boolean f29947f = false;

    /* renamed from: b */
    public final String f29943b = "topic_operation_queue";

    /* renamed from: c */
    public final String f29944c = ",";

    public C5239u(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f29942a = sharedPreferences;
        this.f29946e = executor;
    }

    /* renamed from: c */
    public static C5239u m26116c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C5239u c5239u = new C5239u(sharedPreferences, "topic_operation_queue", ",", executor);
        c5239u.m26119d();
        return c5239u;
    }

    /* renamed from: b */
    public final boolean m26118b(boolean z10) {
        boolean z11 = z10;
        if (z10) {
            z11 = z10;
            if (!this.f29947f) {
                m26124i();
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: d */
    public final void m26119d() {
        synchronized (this.f29945d) {
            this.f29945d.clear();
            String string = this.f29942a.getString(this.f29943b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f29944c)) {
                String[] split = string.split(this.f29944c, -1);
                int length = split.length;
                int i10 = 0;
                if (length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    i10 = 0;
                }
                while (i10 < length) {
                    String str = split[i10];
                    if (!TextUtils.isEmpty(str)) {
                        this.f29945d.add(str);
                    }
                    i10++;
                }
            }
        }
    }

    /* renamed from: e */
    public String m26120e() {
        String peek;
        synchronized (this.f29945d) {
            peek = this.f29945d.peek();
        }
        return peek;
    }

    /* renamed from: f */
    public boolean m26121f(Object obj) {
        boolean remove;
        synchronized (this.f29945d) {
            remove = this.f29945d.remove(obj);
            m26118b(remove);
        }
        return remove;
    }

    /* renamed from: g */
    public String m26122g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f29945d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f29944c);
        }
        return sb2.toString();
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m26117a() {
        synchronized (this.f29945d) {
            this.f29942a.edit().putString(this.f29943b, m26122g()).commit();
        }
    }

    /* renamed from: i */
    public final void m26124i() {
        this.f29946e.execute(new Runnable(this) { // from class: id.t

            /* renamed from: b */
            public final C5239u f29941b;

            {
                this.f29941b = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f29941b.m26117a();
            }
        });
    }
}
