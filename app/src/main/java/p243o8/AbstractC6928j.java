package p243o8;

import com.google.android.exoplayer2.decoder.AbstractC2328a;
import java.util.List;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o8/j.class
 */
/* renamed from: o8.j */
/* loaded from: combined.jar:classes2.jar:o8/j.class */
public abstract class AbstractC6928j extends AbstractC2328a implements InterfaceC6923e {

    /* renamed from: b */
    public InterfaceC6923e f35835b;

    /* renamed from: c */
    public long f35836c;

    @Override // p243o8.InterfaceC6923e
    /* renamed from: a */
    public int mo31883a(long j10) {
        return ((InterfaceC6923e) C4349a.m21882e(this.f35835b)).mo31883a(j10 - this.f35836c);
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: b */
    public List<C6919a> mo31884b(long j10) {
        return ((InterfaceC6923e) C4349a.m21882e(this.f35835b)).mo31884b(j10 - this.f35836c);
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: c */
    public long mo31885c(int i10) {
        return ((InterfaceC6923e) C4349a.m21882e(this.f35835b)).mo31885c(i10) + this.f35836c;
    }

    @Override // p332t6.AbstractC8633a
    public void clear() {
        super.clear();
        this.f35835b = null;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: d */
    public int mo31886d() {
        return ((InterfaceC6923e) C4349a.m21882e(this.f35835b)).mo31886d();
    }

    /* renamed from: e */
    public void m31889e(long j10, InterfaceC6923e interfaceC6923e, long j11) {
        this.timeUs = j10;
        this.f35835b = interfaceC6923e;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f35836c = j10;
    }
}
