package p179k4;

import java.io.File;
import java.io.InputStream;
import p073e4.C4620o;
import p122h4.C5024b;
import p280q4.InterfaceC7753b;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9649f;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k4/d.class
 */
/* renamed from: k4.d */
/* loaded from: combined.jar:classes1.jar:k4/d.class */
public class C5475d implements InterfaceC7753b<InputStream, File> {

    /* renamed from: d */
    public static final b f31286d = new b();

    /* renamed from: b */
    public final InterfaceC9648e<File, File> f31287b = new C5472a();

    /* renamed from: c */
    public final InterfaceC9645b<InputStream> f31288c = new C4620o();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k4/d$b.class
     */
    /* renamed from: k4.d$b */
    /* loaded from: combined.jar:classes1.jar:k4/d$b.class */
    public static class b implements InterfaceC9648e<InputStream, File> {
        public b() {
        }

        @Override // p396x3.InterfaceC9648e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10048l<File> mo25843a(InputStream inputStream, int i10, int i11) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        @Override // p396x3.InterfaceC9648e
        public String getId() {
            return "";
        }
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: a */
    public InterfaceC9645b<InputStream> mo25839a() {
        return this.f31288c;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: c */
    public InterfaceC9649f<File> mo25840c() {
        return C5024b.m25230c();
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: d */
    public InterfaceC9648e<InputStream, File> mo25841d() {
        return f31286d;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: e */
    public InterfaceC9648e<File, File> mo25842e() {
        return this.f31287b;
    }
}
