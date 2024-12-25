package p110g4;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import p073e4.C4607b;
import p073e4.C4608c;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g4/c.class
 */
/* renamed from: g4.c */
/* loaded from: combined.jar:classes1.jar:g4/c.class */
public class C4942c extends C4607b<InputStream> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g4/c$a.class
     */
    /* renamed from: g4.c$a */
    /* loaded from: combined.jar:classes1.jar:g4/c$a.class */
    public static class a implements InterfaceC4618m<File, InputStream> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<File, InputStream> mo23257b(Context context, C4608c c4608c) {
            return new C4942c(c4608c.m23229a(Uri.class, InputStream.class));
        }
    }

    public C4942c(InterfaceC4617l<Uri, InputStream> interfaceC4617l) {
        super(interfaceC4617l);
    }
}
