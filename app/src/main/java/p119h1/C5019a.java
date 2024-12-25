package p119h1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:h1/a.class
 */
/* renamed from: h1.a */
/* loaded from: combined.jar:classes1.jar:h1/a.class */
public final class C5019a {

    /* renamed from: f */
    public static final Object f29049f = new Object();

    /* renamed from: g */
    public static C5019a f29050g;

    /* renamed from: a */
    public final Context f29051a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f29052b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<c>> f29053c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<b> f29054d = new ArrayList<>();

    /* renamed from: e */
    public final Handler f29055e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:h1/a$a.class
     */
    /* renamed from: h1.a$a */
    /* loaded from: combined.jar:classes1.jar:h1/a$a.class */
    public class a extends Handler {

        /* renamed from: a */
        public final C5019a f29056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5019a c5019a, Looper looper) {
            super(looper);
            this.f29056a = c5019a;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                this.f29056a.m25221a();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:h1/a$b.class
     */
    /* renamed from: h1.a$b */
    /* loaded from: combined.jar:classes1.jar:h1/a$b.class */
    public static final class b {

        /* renamed from: a */
        public final Intent f29057a;

        /* renamed from: b */
        public final ArrayList<c> f29058b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f29057a = intent;
            this.f29058b = arrayList;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:h1/a$c.class
     */
    /* renamed from: h1.a$c */
    /* loaded from: combined.jar:classes1.jar:h1/a$c.class */
    public static final class c {

        /* renamed from: a */
        public final IntentFilter f29059a;

        /* renamed from: b */
        public final BroadcastReceiver f29060b;

        /* renamed from: c */
        public boolean f29061c;

        /* renamed from: d */
        public boolean f29062d;

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f29060b);
            sb2.append(" filter=");
            sb2.append(this.f29059a);
            if (this.f29062d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C5019a(Context context) {
        this.f29051a = context;
        this.f29055e = new a(this, context.getMainLooper());
    }

    /* renamed from: b */
    public static C5019a m25220b(Context context) {
        C5019a c5019a;
        synchronized (f29049f) {
            if (f29050g == null) {
                f29050g = new C5019a(context.getApplicationContext());
            }
            c5019a = f29050g;
        }
        return c5019a;
    }

    /* renamed from: a */
    public void m25221a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f29052b) {
                size = this.f29054d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f29054d.toArray(bVarArr);
                this.f29054d.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f29058b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f29058b.get(i11);
                    if (!cVar.f29062d) {
                        cVar.f29060b.onReceive(this.f29051a, bVar.f29057a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public boolean m25222c(Intent intent) {
        synchronized (this.f29052b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f29051a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList = this.f29053c.get(intent.getAction());
            if (arrayList != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                }
                ArrayList arrayList2 = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c cVar = arrayList.get(i10);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f29059a);
                    }
                    if (!cVar.f29061c) {
                        int match = cVar.f29059a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(cVar);
                            cVar.f29061c = true;
                        } else if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    } else if (z10) {
                        Log.v("LocalBroadcastManager", "  Filter's target already added");
                    }
                }
                if (arrayList2 != null) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        ((c) arrayList2.get(i11)).f29061c = false;
                    }
                    this.f29054d.add(new b(intent, arrayList2));
                    if (!this.f29055e.hasMessages(1)) {
                        this.f29055e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
