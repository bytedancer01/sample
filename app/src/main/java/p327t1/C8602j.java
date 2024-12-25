package p327t1;

import java.io.File;
import p375w1.InterfaceC9398c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t1/j.class
 */
/* renamed from: t1.j */
/* loaded from: combined.jar:classes1.jar:t1/j.class */
public class C8602j implements InterfaceC9398c.c {

    /* renamed from: a */
    public final String f40129a;

    /* renamed from: b */
    public final File f40130b;

    /* renamed from: c */
    public final InterfaceC9398c.c f40131c;

    public C8602j(String str, File file, InterfaceC9398c.c cVar) {
        this.f40129a = str;
        this.f40130b = file;
        this.f40131c = cVar;
    }

    @Override // p375w1.InterfaceC9398c.c
    /* renamed from: a */
    public InterfaceC9398c mo4897a(InterfaceC9398c.b bVar) {
        return new C8601i(bVar.f43093a, this.f40129a, this.f40130b, bVar.f43095c.f43092a, this.f40131c.mo4897a(bVar));
    }
}
