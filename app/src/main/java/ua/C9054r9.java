package ua;

import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/r9.class
 */
/* renamed from: ua.r9 */
/* loaded from: combined.jar:classes2.jar:ua/r9.class */
public final class C9054r9 implements InterfaceC8857b4 {

    /* renamed from: a */
    public final String f41602a;

    /* renamed from: b */
    public final C9123x9 f41603b;

    public C9054r9(C9123x9 c9123x9, String str) {
        this.f41603b = c9123x9;
        this.f41602a = str;
    }

    @Override // ua.InterfaceC8857b4
    /* renamed from: a */
    public final void mo37751a(String str, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        this.f41603b.m38381l(i10, th2, bArr, this.f41602a);
    }
}
