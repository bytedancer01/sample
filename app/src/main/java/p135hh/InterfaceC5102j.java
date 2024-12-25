package p135hh;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/j.class
 */
/* renamed from: hh.j */
/* loaded from: combined.jar:classes2.jar:hh/j.class */
public interface InterfaceC5102j extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/j$a.class
     */
    /* renamed from: hh.j$a */
    /* loaded from: combined.jar:classes2.jar:hh/j$a.class */
    public static abstract class a extends Binder implements InterfaceC5102j {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:hh/j$a$a.class
         */
        /* renamed from: hh.j$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:hh/j$a$a.class */
        public static class C10298a implements InterfaceC5102j {

            /* renamed from: c */
            public static InterfaceC5102j f29288c;

            /* renamed from: b */
            public IBinder f29289b;

            public C10298a(IBinder iBinder) {
                this.f29289b = iBinder;
            }

            @Override // p135hh.InterfaceC5102j
            /* renamed from: A */
            public void mo25519A(C5103k c5103k) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    if (c5103k != null) {
                        obtain.writeInt(1);
                        c5103k.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f29289b.transact(1, obtain, null, 1) || a.m25524y0() == null) {
                        return;
                    }
                    a.m25524y0().mo25519A(c5103k);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p135hh.InterfaceC5102j
            /* renamed from: I0 */
            public void mo25520I0(long j10, long j11) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    obtain.writeLong(j10);
                    obtain.writeLong(j11);
                    if (this.f29289b.transact(3, obtain, null, 1) || a.m25524y0() == null) {
                        return;
                    }
                    a.m25524y0().mo25520I0(j10, j11);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p135hh.InterfaceC5102j
            /* renamed from: W0 */
            public void mo25521W0(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    obtain.writeString(str);
                    if (this.f29289b.transact(4, obtain, null, 1) || a.m25524y0() == null) {
                        return;
                    }
                    a.m25524y0().mo25521W0(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29289b;
            }

            @Override // p135hh.InterfaceC5102j
            /* renamed from: n0 */
            public void mo25522n0(String str, String str2, int i10, EnumC5096e enumC5096e, Intent intent) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i10);
                    if (enumC5096e != null) {
                        obtain.writeInt(1);
                        enumC5096e.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f29289b.transact(2, obtain, null, 1) || a.m25524y0() == null) {
                        return;
                    }
                    a.m25524y0().mo25522n0(str, str2, i10, enumC5096e, intent);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: Z */
        public static InterfaceC5102j m25523Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IStatusCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5102j)) ? new C10298a(iBinder) : (InterfaceC5102j) queryLocalInterface;
        }

        /* renamed from: y0 */
        public static InterfaceC5102j m25524y0() {
            return C10298a.f29288c;
        }
    }

    /* renamed from: A */
    void mo25519A(C5103k c5103k);

    /* renamed from: I0 */
    void mo25520I0(long j10, long j11);

    /* renamed from: W0 */
    void mo25521W0(String str);

    /* renamed from: n0 */
    void mo25522n0(String str, String str2, int i10, EnumC5096e enumC5096e, Intent intent);
}
