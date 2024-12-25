package p091f4;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import p073e4.C4608c;
import p073e4.C4621p;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f4/c.class
 */
/* renamed from: f4.c */
/* loaded from: combined.jar:classes1.jar:f4/c.class */
public class C4765c extends C4621p<ParcelFileDescriptor> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f4/c$a.class
     */
    /* renamed from: f4.c$a */
    /* loaded from: combined.jar:classes1.jar:f4/c$a.class */
    public static class a implements InterfaceC4618m<String, ParcelFileDescriptor> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<String, ParcelFileDescriptor> mo23257b(Context context, C4608c c4608c) {
            return new C4765c(c4608c.m23229a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C4765c(InterfaceC4617l<Uri, ParcelFileDescriptor> interfaceC4617l) {
        super(interfaceC4617l);
    }
}
