package p197l6;

import android.content.Context;
import p093f6.C4772d;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l6/h.class
 */
/* renamed from: l6.h */
/* loaded from: combined.jar:classes1.jar:l6/h.class */
public final class C5697h implements InterfaceC4770b<String> {

    /* renamed from: a */
    public final InterfaceC5261a<Context> f32039a;

    public C5697h(InterfaceC5261a<Context> interfaceC5261a) {
        this.f32039a = interfaceC5261a;
    }

    /* renamed from: a */
    public static C5697h m27978a(InterfaceC5261a<Context> interfaceC5261a) {
        return new C5697h(interfaceC5261a);
    }

    /* renamed from: c */
    public static String m27979c(Context context) {
        return (String) C4772d.m24165c(AbstractC5693f.m27970b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m27979c(this.f32039a.get());
    }
}
