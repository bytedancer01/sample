package p305ra;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/c3.class
 */
/* renamed from: ra.c3 */
/* loaded from: combined.jar:classes2.jar:ra/c3.class */
public final class C8093c3 extends ContentObserver {

    /* renamed from: a */
    public final C8108d3 f38967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8093c3(C8108d3 c8108d3, Handler handler) {
        super(null);
        this.f38967a = c8108d3;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f38967a.m35197c();
    }
}
