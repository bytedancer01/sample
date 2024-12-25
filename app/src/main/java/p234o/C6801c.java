package p234o;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o/c.class
 */
/* renamed from: o.c */
/* loaded from: combined.jar:classes1.jar:o/c.class */
public class C6801c {

    /* renamed from: a */
    public final ICustomTabsService f35452a;

    /* renamed from: b */
    public final ComponentName f35453b;

    /* renamed from: c */
    public final Context f35454c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o/c$a.class
     */
    /* renamed from: o.c$a */
    /* loaded from: combined.jar:classes1.jar:o/c$a.class */
    public class a extends ICustomTabsCallback.Stub {

        /* renamed from: b */
        public Handler f35455b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        public final C6800b f35456c;

        /* renamed from: d */
        public final C6801c f35457d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:o/c$a$a.class
         */
        /* renamed from: o.c$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:o/c$a$a.class */
        public class RunnableC10327a implements Runnable {

            /* renamed from: b */
            public final int f35458b;

            /* renamed from: c */
            public final Bundle f35459c;

            /* renamed from: d */
            public final a f35460d;

            public RunnableC10327a(a aVar, int i10, Bundle bundle) {
                this.f35460d = aVar;
                this.f35458b = i10;
                this.f35459c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f35460d.f35456c.onNavigationEvent(this.f35458b, this.f35459c);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:o/c$a$b.class
         */
        /* renamed from: o.c$a$b */
        /* loaded from: combined.jar:classes1.jar:o/c$a$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final String f35461b;

            /* renamed from: c */
            public final Bundle f35462c;

            /* renamed from: d */
            public final a f35463d;

            public b(a aVar, String str, Bundle bundle) {
                this.f35463d = aVar;
                this.f35461b = str;
                this.f35462c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f35463d.f35456c.extraCallback(this.f35461b, this.f35462c);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:o/c$a$c.class
         */
        /* renamed from: o.c$a$c */
        /* loaded from: combined.jar:classes1.jar:o/c$a$c.class */
        public class c implements Runnable {

            /* renamed from: b */
            public final Bundle f35464b;

            /* renamed from: c */
            public final a f35465c;

            public c(a aVar, Bundle bundle) {
                this.f35465c = aVar;
                this.f35464b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f35465c.f35456c.onMessageChannelReady(this.f35464b);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:o/c$a$d.class
         */
        /* renamed from: o.c$a$d */
        /* loaded from: combined.jar:classes1.jar:o/c$a$d.class */
        public class d implements Runnable {

            /* renamed from: b */
            public final String f35466b;

            /* renamed from: c */
            public final Bundle f35467c;

            /* renamed from: d */
            public final a f35468d;

            public d(a aVar, String str, Bundle bundle) {
                this.f35468d = aVar;
                this.f35466b = str;
                this.f35467c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f35468d.f35456c.onPostMessage(this.f35466b, this.f35467c);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:o/c$a$e.class
         */
        /* renamed from: o.c$a$e */
        /* loaded from: combined.jar:classes1.jar:o/c$a$e.class */
        public class e implements Runnable {

            /* renamed from: b */
            public final int f35469b;

            /* renamed from: c */
            public final Uri f35470c;

            /* renamed from: d */
            public final boolean f35471d;

            /* renamed from: e */
            public final Bundle f35472e;

            /* renamed from: f */
            public final a f35473f;

            public e(a aVar, int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f35473f = aVar;
                this.f35469b = i10;
                this.f35470c = uri;
                this.f35471d = z10;
                this.f35472e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f35473f.f35456c.onRelationshipValidationResult(this.f35469b, this.f35470c, this.f35471d, this.f35472e);
            }
        }

        public a(C6801c c6801c, C6800b c6800b) {
            this.f35457d = c6801c;
            this.f35456c = c6800b;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
            if (this.f35456c == null) {
                return;
            }
            this.f35455b.post(new b(this, str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            C6800b c6800b = this.f35456c;
            if (c6800b == null) {
                return null;
            }
            return c6800b.extraCallbackWithResult(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
            if (this.f35456c == null) {
                return;
            }
            this.f35455b.post(new c(this, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            if (this.f35456c == null) {
                return;
            }
            this.f35455b.post(new RunnableC10327a(this, i10, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
            if (this.f35456c == null) {
                return;
            }
            this.f35455b.post(new d(this, str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.f35456c == null) {
                return;
            }
            this.f35455b.post(new e(this, i10, uri, z10, bundle));
        }
    }

    public C6801c(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f35452a = iCustomTabsService;
        this.f35453b = componentName;
        this.f35454c = context;
    }

    /* renamed from: a */
    public static boolean m31350a(Context context, String str, AbstractServiceConnectionC6803e abstractServiceConnectionC6803e) {
        abstractServiceConnectionC6803e.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC6803e, 33);
    }

    /* renamed from: c */
    public static String m31351c(Context context, List<String> list) {
        return m31352d(context, list, false);
    }

    /* renamed from: d */
    public static String m31352d(Context context, List<String> list, boolean z10) {
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        List<String> list2 = arrayList;
        if (!z10) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            list2 = arrayList;
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                list2 = new ArrayList(arrayList.size() + 1);
                list2.add(str);
                if (list != null) {
                    list2.addAll(list);
                }
            }
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : list2) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    /* renamed from: b */
    public final ICustomTabsCallback.Stub m31353b(C6800b c6800b) {
        return new a(this, c6800b);
    }

    /* renamed from: e */
    public C6804f m31354e(C6800b c6800b) {
        return m31355f(c6800b, null);
    }

    /* renamed from: f */
    public final C6804f m31355f(C6800b c6800b, PendingIntent pendingIntent) {
        boolean newSession;
        ICustomTabsCallback.Stub m31353b = m31353b(c6800b);
        C6804f c6804f = null;
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                newSession = this.f35452a.newSessionWithExtras(m31353b, bundle);
            } else {
                newSession = this.f35452a.newSession(m31353b);
            }
        } catch (RemoteException e10) {
        }
        if (!newSession) {
            return null;
        }
        c6804f = new C6804f(this.f35452a, m31353b, this.f35453b, pendingIntent);
        return c6804f;
    }

    /* renamed from: g */
    public boolean m31356g(long j10) {
        try {
            return this.f35452a.warmup(j10);
        } catch (RemoteException e10) {
            return false;
        }
    }
}
