package p030c0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p050d0.C4290b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/t0.class
 */
/* renamed from: c0.t0 */
/* loaded from: combined.jar:classes1.jar:c0/t0.class */
public final class C0969t0 implements Iterable<Intent> {

    /* renamed from: b */
    public final ArrayList<Intent> f6723b = new ArrayList<>();

    /* renamed from: c */
    public final Context f6724c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/t0$a.class
     */
    /* renamed from: c0.t0$a */
    /* loaded from: combined.jar:classes1.jar:c0/t0$a.class */
    public interface a {
        /* renamed from: m */
        Intent mo876m();
    }

    public C0969t0(Context context) {
        this.f6724c = context;
    }

    /* renamed from: f */
    public static C0969t0 m5815f(Context context) {
        return new C0969t0(context);
    }

    /* renamed from: a */
    public C0969t0 m5816a(Intent intent) {
        this.f6723b.add(intent);
        return this;
    }

    /* renamed from: b */
    public C0969t0 m5817b(Intent intent) {
        ComponentName component = intent.getComponent();
        ComponentName componentName = component;
        if (component == null) {
            componentName = intent.resolveActivity(this.f6724c.getPackageManager());
        }
        if (componentName != null) {
            m5819e(componentName);
        }
        m5816a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public C0969t0 m5818d(Activity activity) {
        Intent mo876m = activity instanceof a ? ((a) activity).mo876m() : null;
        Intent intent = mo876m;
        if (mo876m == null) {
            intent = C0960p.m5728a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            ComponentName componentName = component;
            if (component == null) {
                componentName = intent.resolveActivity(this.f6724c.getPackageManager());
            }
            m5819e(componentName);
            m5816a(intent);
        }
        return this;
    }

    /* renamed from: e */
    public C0969t0 m5819e(ComponentName componentName) {
        int size = this.f6723b.size();
        try {
            Context context = this.f6724c;
            while (true) {
                Intent m5729b = C0960p.m5729b(context, componentName);
                if (m5729b == null) {
                    return this;
                }
                this.f6723b.add(size, m5729b);
                context = this.f6724c;
                componentName = m5729b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: g */
    public Intent m5820g(int i10) {
        return this.f6723b.get(i10);
    }

    /* renamed from: i */
    public int m5821i() {
        return this.f6723b.size();
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f6723b.iterator();
    }

    /* renamed from: q */
    public PendingIntent m5822q(int i10, int i11) {
        return m5823t(i10, i11, null);
    }

    /* renamed from: t */
    public PendingIntent m5823t(int i10, int i11, Bundle bundle) {
        if (this.f6723b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        ArrayList<Intent> arrayList = this.f6723b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f6724c, i10, intentArr, i11, bundle);
    }

    /* renamed from: v */
    public void m5824v() {
        m5825w(null);
    }

    /* renamed from: w */
    public void m5825w(Bundle bundle) {
        if (this.f6723b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f6723b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C4290b.m21731j(this.f6724c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f6724c.startActivity(intent);
    }
}
