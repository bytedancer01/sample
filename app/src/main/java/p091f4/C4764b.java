package p091f4;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import p073e4.C4608c;
import p073e4.C4619n;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f4/b.class
 */
/* renamed from: f4.b */
/* loaded from: combined.jar:classes1.jar:f4/b.class */
public class C4764b extends C4619n<ParcelFileDescriptor> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f4/b$a.class
     */
    /* renamed from: f4.b$a */
    /* loaded from: combined.jar:classes1.jar:f4/b$a.class */
    public static class a implements InterfaceC4618m<Integer, ParcelFileDescriptor> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<Integer, ParcelFileDescriptor> mo23257b(Context context, C4608c c4608c) {
            return new C4764b(context, c4608c.m23229a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C4764b(Context context, InterfaceC4617l<Uri, ParcelFileDescriptor> interfaceC4617l) {
        super(context, interfaceC4617l);
    }
}
