package ua;

import java.net.URL;
import java.util.List;
import java.util.Map;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/j7.class
 */
/* renamed from: ua.j7 */
/* loaded from: combined.jar:classes2.jar:ua/j7.class */
public final class RunnableC8956j7 implements Runnable {

    /* renamed from: b */
    public final URL f41218b;

    /* renamed from: c */
    public final String f41219c;

    /* renamed from: d */
    public final C8968k7 f41220d;

    /* renamed from: e */
    public final C8846a5 f41221e;

    public RunnableC8956j7(C8968k7 c8968k7, String str, URL url, byte[] bArr, Map map, C8846a5 c8846a5, byte[] bArr2) {
        this.f41220d = c8968k7;
        C9935o.m41846f(str);
        C9935o.m41850j(url);
        C9935o.m41850j(c8846a5);
        this.f41218b = url;
        this.f41221e = c8846a5;
        this.f41219c = str;
    }

    /* renamed from: a */
    public final /* synthetic */ void m38092a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f41221e.m37736a(this.f41219c, i10, exc, bArr, map);
    }

    /* renamed from: b */
    public final void m38093b(final int i10, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f41220d.f41723a.mo37782e().m38436r(new Runnable(this, i10, exc, bArr, map) { // from class: ua.i7

            /* renamed from: b */
            public final RunnableC8956j7 f41183b;

            /* renamed from: c */
            public final int f41184c;

            /* renamed from: d */
            public final Exception f41185d;

            /* renamed from: e */
            public final byte[] f41186e;

            /* renamed from: f */
            public final Map f41187f;

            {
                this.f41183b = this;
                this.f41184c = i10;
                this.f41185d = exc;
                this.f41186e = bArr;
                this.f41187f = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f41183b.m38092a(this.f41184c, this.f41185d, this.f41186e, this.f41187f);
            }
        });
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException
        */
    /* JADX WARN: Failed to calculate best type for var: r4v0 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v0 'this'  ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r6v0 'this'  ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0081: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:46:0x007d */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x008d: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:39:0x0089 */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.RunnableC8956j7.run():void");
    }
}
