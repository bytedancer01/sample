package p073e4;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import p396x3.InterfaceC9645b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/h.class
 */
/* renamed from: e4.h */
/* loaded from: combined.jar:classes1.jar:e4/h.class */
public class C4613h implements InterfaceC9645b<C4612g> {

    /* renamed from: a */
    public final InterfaceC9645b<InputStream> f27299a;

    /* renamed from: b */
    public final InterfaceC9645b<ParcelFileDescriptor> f27300b;

    /* renamed from: c */
    public String f27301c;

    public C4613h(InterfaceC9645b<InputStream> interfaceC9645b, InterfaceC9645b<ParcelFileDescriptor> interfaceC9645b2) {
        this.f27299a = interfaceC9645b;
        this.f27300b = interfaceC9645b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p396x3.InterfaceC9645b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean mo23245a(C4612g c4612g, OutputStream outputStream) {
        InterfaceC9645b interfaceC9645b;
        InputStream m23243a;
        if (c4612g.m23244b() != null) {
            interfaceC9645b = this.f27299a;
            m23243a = c4612g.m23244b();
        } else {
            interfaceC9645b = this.f27300b;
            m23243a = c4612g.m23243a();
        }
        return interfaceC9645b.mo23245a(m23243a, outputStream);
    }

    @Override // p396x3.InterfaceC9645b
    public String getId() {
        if (this.f27301c == null) {
            this.f27301c = this.f27299a.getId() + this.f27300b.getId();
        }
        return this.f27301c;
    }
}
