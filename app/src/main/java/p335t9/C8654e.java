package p335t9;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/e.class
 */
/* renamed from: t9.e */
/* loaded from: combined.jar:classes2.jar:t9/e.class */
public class C8654e implements Parcelable {
    public static final Parcelable.Creator<C8654e> CREATOR = new C8656g();

    /* renamed from: b */
    public Messenger f40410b;

    /* renamed from: c */
    public InterfaceC8650c f40411c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:t9/e$a.class
     */
    /* renamed from: t9.e$a */
    /* loaded from: combined.jar:classes2.jar:t9/e$a.class */
    public static final class a extends ClassLoader {
        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str, boolean z10) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z10);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return C8654e.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return C8654e.class;
        }
    }

    public C8654e(IBinder iBinder) {
        this.f40410b = new Messenger(iBinder);
    }

    /* renamed from: b */
    public final IBinder m37144b() {
        Messenger messenger = this.f40410b;
        return messenger != null ? messenger.getBinder() : this.f40411c.asBinder();
    }

    /* renamed from: c */
    public final void m37145c(Message message) {
        Messenger messenger = this.f40410b;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f40411c.m37130F0(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m37144b().equals(((C8654e) obj).m37144b());
        } catch (ClassCastException e10) {
            return false;
        }
    }

    public int hashCode() {
        return m37144b().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f40410b;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f40411c.asBinder());
    }
}
