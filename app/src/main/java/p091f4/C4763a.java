package p091f4;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import p073e4.C4607b;
import p073e4.C4608c;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f4/a.class
 */
/* renamed from: f4.a */
/* loaded from: combined.jar:classes1.jar:f4/a.class */
public class C4763a extends C4607b<ParcelFileDescriptor> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f4/a$a.class
     */
    /* renamed from: f4.a$a */
    /* loaded from: combined.jar:classes1.jar:f4/a$a.class */
    public static class a implements InterfaceC4618m<File, ParcelFileDescriptor> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<File, ParcelFileDescriptor> mo23257b(Context context, C4608c c4608c) {
            return new C4763a(c4608c.m23229a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C4763a(InterfaceC4617l<Uri, ParcelFileDescriptor> interfaceC4617l) {
        super(interfaceC4617l);
    }
}
