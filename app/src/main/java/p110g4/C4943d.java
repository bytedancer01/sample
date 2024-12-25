package p110g4;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p073e4.C4608c;
import p073e4.C4619n;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g4/d.class
 */
/* renamed from: g4.d */
/* loaded from: combined.jar:classes1.jar:g4/d.class */
public class C4943d extends C4619n<InputStream> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g4/d$a.class
     */
    /* renamed from: g4.d$a */
    /* loaded from: combined.jar:classes1.jar:g4/d$a.class */
    public static class a implements InterfaceC4618m<Integer, InputStream> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<Integer, InputStream> mo23257b(Context context, C4608c c4608c) {
            return new C4943d(context, c4608c.m23229a(Uri.class, InputStream.class));
        }
    }

    public C4943d(Context context, InterfaceC4617l<Uri, InputStream> interfaceC4617l) {
        super(context, interfaceC4617l);
    }
}
