package p110g4;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p073e4.AbstractC4622q;
import p073e4.C4608c;
import p073e4.C4609d;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;
import p416y3.C9822h;
import p416y3.C9823i;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g4/f.class
 */
/* renamed from: g4.f */
/* loaded from: combined.jar:classes1.jar:g4/f.class */
public class C4945f extends AbstractC4622q<InputStream> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g4/f$a.class
     */
    /* renamed from: g4.f$a */
    /* loaded from: combined.jar:classes1.jar:g4/f$a.class */
    public static class a implements InterfaceC4618m<Uri, InputStream> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<Uri, InputStream> mo23257b(Context context, C4608c c4608c) {
            return new C4945f(context, c4608c.m23229a(C4609d.class, InputStream.class));
        }
    }

    public C4945f(Context context, InterfaceC4617l<C4609d, InputStream> interfaceC4617l) {
        super(context, interfaceC4617l);
    }

    @Override // p073e4.AbstractC4622q
    /* renamed from: b */
    public InterfaceC9817c<InputStream> mo23263b(Context context, String str) {
        return new C9822h(context.getApplicationContext().getAssets(), str);
    }

    @Override // p073e4.AbstractC4622q
    /* renamed from: c */
    public InterfaceC9817c<InputStream> mo23264c(Context context, Uri uri) {
        return new C9823i(context, uri);
    }
}
