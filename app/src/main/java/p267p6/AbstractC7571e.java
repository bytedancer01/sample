package p267p6;

import java.util.Collections;
import p267p6.AbstractC7574e2;
import p267p6.InterfaceC7606o1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/e.class
 */
/* renamed from: p6.e */
/* loaded from: combined.jar:classes2.jar:p6/e.class */
public abstract class AbstractC7571e implements InterfaceC7606o1 {

    /* renamed from: a */
    public final AbstractC7574e2.c f36695a = new AbstractC7574e2.c();

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: M */
    public final void mo32637M() {
        m32655f0(mo32416G());
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: N */
    public final void mo32638N() {
        m32655f0(-mo32426P());
    }

    /* renamed from: Q */
    public final void m32639Q(int i10, C7561b1 c7561b1) {
        mo32418I(i10, Collections.singletonList(c7561b1));
    }

    /* renamed from: R */
    public InterfaceC7606o1.b m32640R(InterfaceC7606o1.b bVar) {
        return new InterfaceC7606o1.b.a().m32868b(bVar).m32870d(3, !mo32436a()).m32870d(4, mo32654f() && !mo32436a()).m32870d(5, m32646X() && !mo32436a()).m32870d(6, !mo32467r().m32667q() && (m32646X() || !m32648Z() || mo32654f()) && !mo32436a()).m32870d(7, m32645W() && !mo32436a()).m32870d(8, !mo32467r().m32667q() && (m32645W() || (m32648Z() && m32647Y())) && !mo32436a()).m32870d(9, !mo32436a()).m32870d(10, mo32654f() && !mo32436a()).m32870d(11, mo32654f() && !mo32436a()).m32871e();
    }

    /* renamed from: S */
    public final long m32641S() {
        AbstractC7574e2 mo32467r = mo32467r();
        return mo32467r.m32667q() ? -9223372036854775807L : mo32467r.m32666n(mo32451i(), this.f36695a).m32692d();
    }

    /* renamed from: T */
    public final int m32642T() {
        AbstractC7574e2 mo32467r = mo32467r();
        return mo32467r.m32667q() ? -1 : mo32467r.mo508e(mo32451i(), m32644V(), mo32420K());
    }

    /* renamed from: U */
    public final int m32643U() {
        AbstractC7574e2 mo32467r = mo32467r();
        return mo32467r.m32667q() ? -1 : mo32467r.mo510l(mo32451i(), m32644V(), mo32420K());
    }

    /* renamed from: V */
    public final int m32644V() {
        int repeatMode = getRepeatMode();
        int i10 = repeatMode;
        if (repeatMode == 1) {
            i10 = 0;
        }
        return i10;
    }

    /* renamed from: W */
    public final boolean m32645W() {
        return m32642T() != -1;
    }

    /* renamed from: X */
    public final boolean m32646X() {
        return m32643U() != -1;
    }

    /* renamed from: Y */
    public final boolean m32647Y() {
        AbstractC7574e2 mo32467r = mo32467r();
        return !mo32467r.m32667q() && mo32467r.m32666n(mo32451i(), this.f36695a).f36728i;
    }

    /* renamed from: Z */
    public final boolean m32648Z() {
        AbstractC7574e2 mo32467r = mo32467r();
        return !mo32467r.m32667q() && mo32467r.m32666n(mo32451i(), this.f36695a).m32694f();
    }

    /* renamed from: a0 */
    public final void m32649a0() {
        mo32456l(false);
    }

    /* renamed from: b0 */
    public final void m32650b0() {
        mo32456l(true);
    }

    /* renamed from: c0 */
    public final void m32651c0() {
        m32652d0(mo32451i());
    }

    /* renamed from: d0 */
    public final void m32652d0(int i10) {
        mo32476w(i10, -9223372036854775807L);
    }

    /* renamed from: e0 */
    public final void m32653e0() {
        int m32642T = m32642T();
        if (m32642T != -1) {
            m32652d0(m32642T);
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: f */
    public final boolean mo32654f() {
        AbstractC7574e2 mo32467r = mo32467r();
        return !mo32467r.m32667q() && mo32467r.m32666n(mo32451i(), this.f36695a).f36727h;
    }

    /* renamed from: f0 */
    public final void m32655f0(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        long j11 = currentPosition;
        if (duration != -9223372036854775807L) {
            j11 = Math.min(currentPosition, duration);
        }
        seekTo(Math.max(j11, 0L));
    }

    /* renamed from: g0 */
    public final void m32656g0() {
        int m32643U = m32643U();
        if (m32643U != -1) {
            m32652d0(m32643U);
        }
    }

    @Override // p267p6.InterfaceC7606o1
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && mo32480y() && mo32463p() == 0;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: j */
    public final void mo32657j() {
        if (mo32467r().m32667q() || mo32436a()) {
            return;
        }
        boolean m32646X = m32646X();
        if (!m32648Z() || mo32654f()) {
            if (!m32646X || getCurrentPosition() > mo32411B()) {
                seekTo(0L);
                return;
            }
        } else if (!m32646X) {
            return;
        }
        m32656g0();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: o */
    public final boolean mo32658o(int i10) {
        return mo32478x().m32866b(i10);
    }

    @Override // p267p6.InterfaceC7606o1
    public final void seekTo(long j10) {
        mo32476w(mo32451i(), j10);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: t */
    public final void mo32659t() {
        if (mo32467r().m32667q() || mo32436a()) {
            return;
        }
        if (m32645W()) {
            m32653e0();
        } else if (m32648Z() && m32647Y()) {
            m32651c0();
        }
    }
}
