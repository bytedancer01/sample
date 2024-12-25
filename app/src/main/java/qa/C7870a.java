package qa;

import android.os.IBinder;
import android.os.IInterface;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qa/a.class
 */
/* renamed from: qa.a */
/* loaded from: combined.jar:classes2.jar:qa/a.class */
public class C7870a implements IInterface {

    /* renamed from: b */
    public final IBinder f37940b;

    /* renamed from: c */
    public final String f37941c = "com.google.android.gms.flags.IFlagProvider";

    public C7870a(IBinder iBinder, String str) {
        this.f37940b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37940b;
    }
}
