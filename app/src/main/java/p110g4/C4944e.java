package p110g4;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p073e4.C4608c;
import p073e4.C4621p;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g4/e.class
 */
/* renamed from: g4.e */
/* loaded from: combined.jar:classes1.jar:g4/e.class */
public class C4944e extends C4621p<InputStream> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g4/e$a.class
     */
    /* renamed from: g4.e$a */
    /* loaded from: combined.jar:classes1.jar:g4/e$a.class */
    public static class a implements InterfaceC4618m<String, InputStream> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<String, InputStream> mo23257b(Context context, C4608c c4608c) {
            return new C4944e(c4608c.m23229a(Uri.class, InputStream.class));
        }
    }

    public C4944e(InterfaceC4617l<Uri, InputStream> interfaceC4617l) {
        super(interfaceC4617l);
    }
}
