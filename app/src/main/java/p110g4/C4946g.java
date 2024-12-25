package p110g4;

import android.content.Context;
import java.io.InputStream;
import java.net.URL;
import p073e4.C4608c;
import p073e4.C4609d;
import p073e4.C4623r;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g4/g.class
 */
/* renamed from: g4.g */
/* loaded from: combined.jar:classes1.jar:g4/g.class */
public class C4946g extends C4623r<InputStream> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g4/g$a.class
     */
    /* renamed from: g4.g$a */
    /* loaded from: combined.jar:classes1.jar:g4/g$a.class */
    public static class a implements InterfaceC4618m<URL, InputStream> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<URL, InputStream> mo23257b(Context context, C4608c c4608c) {
            return new C4946g(c4608c.m23229a(C4609d.class, InputStream.class));
        }
    }

    public C4946g(InterfaceC4617l<C4609d, InputStream> interfaceC4617l) {
        super(interfaceC4617l);
    }
}
