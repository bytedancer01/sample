package p335t9;

import android.os.Bundle;
import android.util.Log;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/u.class
 */
/* renamed from: t9.u */
/* loaded from: combined.jar:classes2.jar:t9/u.class */
public abstract class AbstractC8670u<T> {

    /* renamed from: a */
    public final int f40439a;

    /* renamed from: b */
    public final C10146j<T> f40440b = new C10146j<>();

    /* renamed from: c */
    public final int f40441c;

    /* renamed from: d */
    public final Bundle f40442d;

    public AbstractC8670u(int i10, int i11, Bundle bundle) {
        this.f40439a = i10;
        this.f40441c = i11;
        this.f40442d = bundle;
    }

    /* renamed from: a */
    public abstract void mo37160a(Bundle bundle);

    /* renamed from: b */
    public final void m37163b(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f40440b.m42580c(t10);
    }

    /* renamed from: c */
    public final void m37164c(C8669t c8669t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c8669t);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f40440b.m42579b(c8669t);
    }

    /* renamed from: d */
    public abstract boolean mo37161d();

    public String toString() {
        int i10 = this.f40441c;
        int i11 = this.f40439a;
        boolean mo37161d = mo37161d();
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(mo37161d);
        sb2.append("}");
        return sb2.toString();
    }
}
