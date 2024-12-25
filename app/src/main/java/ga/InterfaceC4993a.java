package ga;

import android.os.IBinder;
import android.os.IInterface;
import p245oa.BinderC6955b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ga/a.class
 */
/* renamed from: ga.a */
/* loaded from: combined.jar:classes2.jar:ga/a.class */
public interface InterfaceC4993a extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ga/a$a.class
     */
    /* renamed from: ga.a$a */
    /* loaded from: combined.jar:classes2.jar:ga/a$a.class */
    public static abstract class a extends BinderC6955b implements InterfaceC4993a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: y0 */
        public static InterfaceC4993a m25159y0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC4993a ? (InterfaceC4993a) queryLocalInterface : new C4995c(iBinder);
        }
    }
}
