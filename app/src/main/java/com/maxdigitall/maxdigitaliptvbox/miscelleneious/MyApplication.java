package com.maxdigitall.maxdigitaliptvbox.miscelleneious;

import android.app.Application;
import android.content.Context;
import p222n1.C6618a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/MyApplication.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/MyApplication.class */
public class MyApplication extends Application {

    /* renamed from: b */
    public static Context f16341b;

    /* renamed from: a */
    public static Context m14724a() {
        return f16341b;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C6618a.m30546l(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f16341b = getApplicationContext();
    }
}
