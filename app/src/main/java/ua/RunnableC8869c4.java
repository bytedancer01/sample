package ua;

import java.util.List;
import java.util.Map;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/c4.class
 */
/* renamed from: ua.c4 */
/* loaded from: combined.jar:classes2.jar:ua/c4.class */
public final class RunnableC8869c4 implements Runnable {

    /* renamed from: b */
    public final InterfaceC8857b4 f40949b;

    /* renamed from: c */
    public final int f40950c;

    /* renamed from: d */
    public final Throwable f40951d;

    /* renamed from: e */
    public final byte[] f40952e;

    /* renamed from: f */
    public final String f40953f;

    /* renamed from: g */
    public final Map<String, List<String>> f40954g;

    public /* synthetic */ RunnableC8869c4(String str, InterfaceC8857b4 interfaceC8857b4, int i10, Throwable th2, byte[] bArr, Map map, C8845a4 c8845a4) {
        C9935o.m41850j(interfaceC8857b4);
        this.f40949b = interfaceC8857b4;
        this.f40950c = i10;
        this.f40951d = th2;
        this.f40952e = bArr;
        this.f40953f = str;
        this.f40954g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40949b.mo37751a(this.f40953f, this.f40950c, this.f40951d, this.f40952e, this.f40954g);
    }
}
