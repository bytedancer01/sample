package p073e4;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/f.class
 */
/* renamed from: e4.f */
/* loaded from: combined.jar:classes1.jar:e4/f.class */
public class C4611f<A> implements InterfaceC4617l<A, C4612g> {

    /* renamed from: a */
    public final InterfaceC4617l<A, InputStream> f27293a;

    /* renamed from: b */
    public final InterfaceC4617l<A, ParcelFileDescriptor> f27294b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e4/f$a.class
     */
    /* renamed from: e4.f$a */
    /* loaded from: combined.jar:classes1.jar:e4/f$a.class */
    public static class a implements InterfaceC9817c<C4612g> {

        /* renamed from: a */
        public final InterfaceC9817c<InputStream> f27295a;

        /* renamed from: b */
        public final InterfaceC9817c<ParcelFileDescriptor> f27296b;

        public a(InterfaceC9817c<InputStream> interfaceC9817c, InterfaceC9817c<ParcelFileDescriptor> interfaceC9817c2) {
            this.f27295a = interfaceC9817c;
            this.f27296b = interfaceC9817c2;
        }

        @Override // p416y3.InterfaceC9817c
        /* renamed from: a */
        public void mo23240a() {
            InterfaceC9817c<InputStream> interfaceC9817c = this.f27295a;
            if (interfaceC9817c != null) {
                interfaceC9817c.mo23240a();
            }
            InterfaceC9817c<ParcelFileDescriptor> interfaceC9817c2 = this.f27296b;
            if (interfaceC9817c2 != null) {
                interfaceC9817c2.mo23240a();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p416y3.InterfaceC9817c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p073e4.C4612g mo23241b(p329t3.EnumC8619i r6) {
            /*
                r5 = this;
                r0 = r5
                y3.c<java.io.InputStream> r0 = r0.f27295a
                r7 = r0
                r0 = 0
                r9 = r0
                r0 = r7
                if (r0 == 0) goto L39
                r0 = r7
                r1 = r6
                java.lang.Object r0 = r0.mo23241b(r1)     // Catch: java.lang.Exception -> L1a
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.Exception -> L1a
                r7 = r0
                goto L3b
            L1a:
                r7 = move-exception
                java.lang.String r0 = "IVML"
                r1 = 2
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                if (r0 == 0) goto L2d
                java.lang.String r0 = "IVML"
                java.lang.String r1 = "Exception fetching input stream, trying ParcelFileDescriptor"
                r2 = r7
                int r0 = android.util.Log.v(r0, r1, r2)
            L2d:
                r0 = r5
                y3.c<android.os.ParcelFileDescriptor> r0 = r0.f27296b
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = r7
                throw r0
            L39:
                r0 = 0
                r7 = r0
            L3b:
                r0 = r5
                y3.c<android.os.ParcelFileDescriptor> r0 = r0.f27296b
                r10 = r0
                r0 = r9
                r8 = r0
                r0 = r10
                if (r0 == 0) goto L77
                r0 = r10
                r1 = r6
                java.lang.Object r0 = r0.mo23241b(r1)     // Catch: java.lang.Exception -> L58
                android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch: java.lang.Exception -> L58
                r8 = r0
                goto L77
            L58:
                r6 = move-exception
                java.lang.String r0 = "IVML"
                r1 = 2
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                if (r0 == 0) goto L6b
                java.lang.String r0 = "IVML"
                java.lang.String r1 = "Exception fetching ParcelFileDescriptor"
                r2 = r6
                int r0 = android.util.Log.v(r0, r1, r2)
            L6b:
                r0 = r7
                if (r0 == 0) goto L75
                r0 = r9
                r8 = r0
                goto L77
            L75:
                r0 = r6
                throw r0
            L77:
                e4.g r0 = new e4.g
                r1 = r0
                r2 = r7
                r3 = r8
                r1.<init>(r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p073e4.C4611f.a.mo23241b(t3.i):e4.g");
        }

        @Override // p416y3.InterfaceC9817c
        public void cancel() {
            InterfaceC9817c<InputStream> interfaceC9817c = this.f27295a;
            if (interfaceC9817c != null) {
                interfaceC9817c.cancel();
            }
            InterfaceC9817c<ParcelFileDescriptor> interfaceC9817c2 = this.f27296b;
            if (interfaceC9817c2 != null) {
                interfaceC9817c2.cancel();
            }
        }

        @Override // p416y3.InterfaceC9817c
        public String getId() {
            InterfaceC9817c<InputStream> interfaceC9817c = this.f27295a;
            return interfaceC9817c != null ? interfaceC9817c.getId() : this.f27296b.getId();
        }
    }

    public C4611f(InterfaceC4617l<A, InputStream> interfaceC4617l, InterfaceC4617l<A, ParcelFileDescriptor> interfaceC4617l2) {
        if (interfaceC4617l == null && interfaceC4617l2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.f27293a = interfaceC4617l;
        this.f27294b = interfaceC4617l2;
    }

    @Override // p073e4.InterfaceC4617l
    /* renamed from: a */
    public InterfaceC9817c<C4612g> mo23227a(A a10, int i10, int i11) {
        InterfaceC4617l<A, InputStream> interfaceC4617l = this.f27293a;
        InterfaceC9817c<InputStream> mo23227a = interfaceC4617l != null ? interfaceC4617l.mo23227a(a10, i10, i11) : null;
        InterfaceC4617l<A, ParcelFileDescriptor> interfaceC4617l2 = this.f27294b;
        InterfaceC9817c<ParcelFileDescriptor> mo23227a2 = interfaceC4617l2 != null ? interfaceC4617l2.mo23227a(a10, i10, i11) : null;
        if (mo23227a == null && mo23227a2 == null) {
            return null;
        }
        return new a(mo23227a, mo23227a2);
    }
}
