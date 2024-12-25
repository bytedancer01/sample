package p091f4;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import p073e4.AbstractC4622q;
import p073e4.C4608c;
import p073e4.C4609d;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;
import p416y3.C9818d;
import p416y3.C9819e;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f4/d.class
 */
/* renamed from: f4.d */
/* loaded from: combined.jar:classes1.jar:f4/d.class */
public class C4766d extends AbstractC4622q<ParcelFileDescriptor> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f4/d$a.class
     */
    /* renamed from: f4.d$a */
    /* loaded from: combined.jar:classes1.jar:f4/d$a.class */
    public static class a implements InterfaceC4618m<Uri, ParcelFileDescriptor> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<Uri, ParcelFileDescriptor> mo23257b(Context context, C4608c c4608c) {
            return new C4766d(context, c4608c.m23229a(C4609d.class, ParcelFileDescriptor.class));
        }
    }

    public C4766d(Context context, InterfaceC4617l<C4609d, ParcelFileDescriptor> interfaceC4617l) {
        super(context, interfaceC4617l);
    }

    @Override // p073e4.AbstractC4622q
    /* renamed from: b */
    public InterfaceC9817c<ParcelFileDescriptor> mo23263b(Context context, String str) {
        return new C9818d(context.getApplicationContext().getAssets(), str);
    }

    @Override // p073e4.AbstractC4622q
    /* renamed from: c */
    public InterfaceC9817c<ParcelFileDescriptor> mo23264c(Context context, Uri uri) {
        return new C9819e(context, uri);
    }
}
