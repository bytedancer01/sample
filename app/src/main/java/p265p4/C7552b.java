package p265p4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p4/b.class
 */
/* renamed from: p4.b */
/* loaded from: combined.jar:classes1.jar:p4/b.class */
public final class C7552b {

    /* renamed from: a */
    public final Context f36427a;

    public C7552b(Context context) {
        this.f36427a = context;
    }

    /* renamed from: b */
    public static InterfaceC7551a m32317b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.newInstance();
                if (newInstance instanceof InterfaceC7551a) {
                    return (InterfaceC7551a) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e12);
        }
    }

    /* renamed from: a */
    public List<InterfaceC7551a> m32318a() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f36427a.getPackageManager().getApplicationInfo(this.f36427a.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(m32317b(str));
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
        }
    }
}
