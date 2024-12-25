package p027b9;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.net.tftp.TFTP;
import p027b9.C0839e0;
import p027b9.InterfaceC0831a0;
import p027b9.InterfaceC0837d0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/w.class
 */
/* renamed from: b9.w */
/* loaded from: combined.jar:classes2.jar:b9/w.class */
public class C0865w implements InterfaceC0837d0 {

    /* renamed from: a */
    public final int f5942a;

    public C0865w() {
        this(-1);
    }

    public C0865w(int i10) {
        this.f5942a = i10;
    }

    @Override // p027b9.InterfaceC0837d0
    /* renamed from: a */
    public long mo5310a(InterfaceC0837d0.c cVar) {
        IOException iOException = cVar.f5762c;
        return ((iOException instanceof C7594k1) || (iOException instanceof FileNotFoundException) || (iOException instanceof InterfaceC0831a0.a) || (iOException instanceof C0839e0.h)) ? -9223372036854775807L : Math.min((cVar.f5763d - 1) * 1000, TFTP.DEFAULT_TIMEOUT);
    }

    @Override // p027b9.InterfaceC0837d0
    /* renamed from: b */
    public int mo5311b(int i10) {
        int i11 = this.f5942a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    @Override // p027b9.InterfaceC0837d0
    /* renamed from: c */
    public InterfaceC0837d0.b mo5312c(InterfaceC0837d0.a aVar, InterfaceC0837d0.c cVar) {
        if (!m5429e(cVar.f5762c)) {
            return null;
        }
        if (aVar.m5314a(1)) {
            return new InterfaceC0837d0.b(1, 300000L);
        }
        if (aVar.m5314a(2)) {
            return new InterfaceC0837d0.b(2, 60000L);
        }
        return null;
    }

    @Override // p027b9.InterfaceC0837d0
    /* renamed from: d */
    public /* synthetic */ void mo5313d(long j10) {
        C0835c0.m5308a(this, j10);
    }

    /* renamed from: e */
    public boolean m5429e(IOException iOException) {
        boolean z10 = false;
        if (!(iOException instanceof InterfaceC0831a0.e)) {
            return false;
        }
        int i10 = ((InterfaceC0831a0.e) iOException).f5741e;
        if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
            z10 = true;
        }
        return z10;
    }
}
