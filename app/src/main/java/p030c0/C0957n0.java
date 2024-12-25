package p030c0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/n0.class
 */
/* renamed from: c0.n0 */
/* loaded from: combined.jar:classes1.jar:c0/n0.class */
public final class C0957n0 {

    /* renamed from: d */
    public static String f6613d;

    /* renamed from: g */
    public static c f6616g;

    /* renamed from: a */
    public final Context f6617a;

    /* renamed from: b */
    public final NotificationManager f6618b;

    /* renamed from: c */
    public static final Object f6612c = new Object();

    /* renamed from: e */
    public static Set<String> f6614e = new HashSet();

    /* renamed from: f */
    public static final Object f6615f = new Object();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/n0$a.class
     */
    /* renamed from: c0.n0$a */
    /* loaded from: combined.jar:classes1.jar:c0/n0$a.class */
    public static class a implements d {

        /* renamed from: a */
        public final String f6619a;

        /* renamed from: b */
        public final int f6620b;

        /* renamed from: c */
        public final String f6621c;

        /* renamed from: d */
        public final Notification f6622d;

        public a(String str, int i10, String str2, Notification notification) {
            this.f6619a = str;
            this.f6620b = i10;
            this.f6621c = str2;
            this.f6622d = notification;
        }

        @Override // p030c0.C0957n0.d
        /* renamed from: a */
        public void mo5708a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.notify(this.f6619a, this.f6620b, this.f6621c, this.f6622d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f6619a + ", id:" + this.f6620b + ", tag:" + this.f6621c + "]";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/n0$b.class
     */
    /* renamed from: c0.n0$b */
    /* loaded from: combined.jar:classes1.jar:c0/n0$b.class */
    public static class b {

        /* renamed from: a */
        public final ComponentName f6623a;

        /* renamed from: b */
        public final IBinder f6624b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.f6623a = componentName;
            this.f6624b = iBinder;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/n0$c.class
     */
    /* renamed from: c0.n0$c */
    /* loaded from: combined.jar:classes1.jar:c0/n0$c.class */
    public static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: b */
        public final Context f6625b;

        /* renamed from: c */
        public final HandlerThread f6626c;

        /* renamed from: d */
        public final Handler f6627d;

        /* renamed from: e */
        public final Map<ComponentName, a> f6628e = new HashMap();

        /* renamed from: f */
        public Set<String> f6629f = new HashSet();

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:c0/n0$c$a.class
         */
        /* renamed from: c0.n0$c$a */
        /* loaded from: combined.jar:classes1.jar:c0/n0$c$a.class */
        public static class a {

            /* renamed from: a */
            public final ComponentName f6630a;

            /* renamed from: c */
            public INotificationSideChannel f6632c;

            /* renamed from: b */
            public boolean f6631b = false;

            /* renamed from: d */
            public ArrayDeque<d> f6633d = new ArrayDeque<>();

            /* renamed from: e */
            public int f6634e = 0;

            public a(ComponentName componentName) {
                this.f6630a = componentName;
            }
        }

        public c(Context context) {
            this.f6625b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f6626c = handlerThread;
            handlerThread.start();
            this.f6627d = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final boolean m5709a(a aVar) {
            if (aVar.f6631b) {
                return true;
            }
            boolean bindService = this.f6625b.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f6630a), this, 33);
            aVar.f6631b = bindService;
            if (bindService) {
                aVar.f6634e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f6630a);
                this.f6625b.unbindService(this);
            }
            return aVar.f6631b;
        }

        /* renamed from: b */
        public final void m5710b(a aVar) {
            if (aVar.f6631b) {
                this.f6625b.unbindService(this);
                aVar.f6631b = false;
            }
            aVar.f6632c = null;
        }

        /* renamed from: c */
        public final void m5711c(d dVar) {
            m5718j();
            for (a aVar : this.f6628e.values()) {
                aVar.f6633d.add(dVar);
                m5715g(aVar);
            }
        }

        /* renamed from: d */
        public final void m5712d(ComponentName componentName) {
            a aVar = this.f6628e.get(componentName);
            if (aVar != null) {
                m5715g(aVar);
            }
        }

        /* renamed from: e */
        public final void m5713e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f6628e.get(componentName);
            if (aVar != null) {
                aVar.f6632c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.f6634e = 0;
                m5715g(aVar);
            }
        }

        /* renamed from: f */
        public final void m5714f(ComponentName componentName) {
            a aVar = this.f6628e.get(componentName);
            if (aVar != null) {
                m5710b(aVar);
            }
        }

        /* renamed from: g */
        public final void m5715g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f6630a + ", " + aVar.f6633d.size() + " queued tasks");
            }
            if (aVar.f6633d.isEmpty()) {
                return;
            }
            if (!m5709a(aVar) || aVar.f6632c == null) {
                m5717i(aVar);
                return;
            }
            while (true) {
                d peek = aVar.f6633d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.mo5708a(aVar.f6632c);
                    aVar.f6633d.remove();
                } catch (DeadObjectException e10) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f6630a);
                    }
                } catch (RemoteException e11) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f6630a, e11);
                }
            }
            if (aVar.f6633d.isEmpty()) {
                return;
            }
            m5717i(aVar);
        }

        /* renamed from: h */
        public void m5716h(d dVar) {
            this.f6627d.obtainMessage(0, dVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                m5711c((d) message.obj);
                return true;
            }
            if (i10 == 1) {
                b bVar = (b) message.obj;
                m5713e(bVar.f6623a, bVar.f6624b);
                return true;
            }
            if (i10 == 2) {
                m5714f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            m5712d((ComponentName) message.obj);
            return true;
        }

        /* renamed from: i */
        public final void m5717i(a aVar) {
            if (this.f6627d.hasMessages(3, aVar.f6630a)) {
                return;
            }
            int i10 = aVar.f6634e + 1;
            aVar.f6634e = i10;
            if (i10 <= 6) {
                int i11 = (1 << (i10 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f6627d.sendMessageDelayed(this.f6627d.obtainMessage(3, aVar.f6630a), i11);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f6633d.size() + " tasks to " + aVar.f6630a + " after " + aVar.f6634e + " retries");
            aVar.f6633d.clear();
        }

        /* renamed from: j */
        public final void m5718j() {
            Set<String> m5700e = C0957n0.m5700e(this.f6625b);
            if (m5700e.equals(this.f6629f)) {
                return;
            }
            this.f6629f = m5700e;
            List<ResolveInfo> queryIntentServices = this.f6625b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (m5700e.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f6628e.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f6628e.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f6628e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    m5710b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f6627d.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f6627d.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/n0$d.class
     */
    /* renamed from: c0.n0$d */
    /* loaded from: combined.jar:classes1.jar:c0/n0$d.class */
    public interface d {
        /* renamed from: a */
        void mo5708a(INotificationSideChannel iNotificationSideChannel);
    }

    public C0957n0(Context context) {
        this.f6617a = context;
        this.f6618b = (NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
    }

    /* renamed from: d */
    public static C0957n0 m5699d(Context context) {
        return new C0957n0(context);
    }

    /* renamed from: e */
    public static Set<String> m5700e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f6612c) {
            if (string != null) {
                if (!string.equals(f6613d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f6614e = hashSet;
                    f6613d = string;
                }
            }
            set = f6614e;
        }
        return set;
    }

    /* renamed from: i */
    public static boolean m5701i(Notification notification) {
        Bundle m5736a = C0964r.m5736a(notification);
        return m5736a != null && m5736a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean m5702a() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.f6618b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f6617a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f6617a.getApplicationInfo();
        String packageName = this.f6617a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        boolean z10 = true;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() != 0) {
                z10 = false;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException e10) {
        }
        return z10;
    }

    /* renamed from: b */
    public void m5703b(int i10) {
        m5704c(null, i10);
    }

    /* renamed from: c */
    public void m5704c(String str, int i10) {
        this.f6618b.cancel(str, i10);
    }

    /* renamed from: f */
    public void m5705f(int i10, Notification notification) {
        m5706g(null, i10, notification);
    }

    /* renamed from: g */
    public void m5706g(String str, int i10, Notification notification) {
        if (!m5701i(notification)) {
            this.f6618b.notify(str, i10, notification);
        } else {
            m5707h(new a(this.f6617a.getPackageName(), i10, str, notification));
            this.f6618b.cancel(str, i10);
        }
    }

    /* renamed from: h */
    public final void m5707h(d dVar) {
        synchronized (f6615f) {
            if (f6616g == null) {
                f6616g = new c(this.f6617a.getApplicationContext());
            }
            f6616g.m5716h(dVar);
        }
    }
}
