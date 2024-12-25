package ug;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ug/e.class
 */
/* renamed from: ug.e */
/* loaded from: combined.jar:classes2.jar:ug/e.class */
public interface InterfaceC9180e {

    /* renamed from: a */
    public static final InterfaceC9180e f41995a = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/e$a.class
     */
    /* renamed from: ug.e$a */
    /* loaded from: combined.jar:classes2.jar:ug/e$a.class */
    public static final class a implements InterfaceC9180e {
        @Override // ug.InterfaceC9180e
        /* renamed from: a */
        public InetAddress[] mo38664a(String str) {
            if (str != null) {
                return InetAddress.getAllByName(str);
            }
            throw new UnknownHostException("host == null");
        }
    }

    /* renamed from: a */
    InetAddress[] mo38664a(String str);
}
