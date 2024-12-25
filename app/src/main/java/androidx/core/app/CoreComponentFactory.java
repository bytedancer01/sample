package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/core/app/CoreComponentFactory.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/core/app/CoreComponentFactory.class */
public class CoreComponentFactory extends AppComponentFactory {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/core/app/CoreComponentFactory$a.class
     */
    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    /* loaded from: combined.jar:classes1.jar:androidx/core/app/CoreComponentFactory$a.class */
    public interface InterfaceC0388a {
        /* renamed from: a */
        Object m1869a();
    }

    /* renamed from: a */
    public static <T> T m1868a(T t10) {
        T t11;
        return (!(t10 instanceof InterfaceC0388a) || (t11 = (T) ((InterfaceC0388a) t10).m1869a()) == null) ? t10 : t11;
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m1868a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m1868a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m1868a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m1868a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m1868a(super.instantiateService(classLoader, str, intent));
    }
}
