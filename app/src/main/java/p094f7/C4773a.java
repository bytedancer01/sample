package p094f7;

import com.google.android.exoplayer2.ext.flac.C2332a;
import com.google.android.exoplayer2.extractor.AbstractC2342a;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.util.Objects;
import p057d7.C4318a;
import p057d7.C4330m;
import p057d7.InterfaceC4324g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f7/a.class
 */
/* renamed from: f7.a */
/* loaded from: combined.jar:classes2.jar:f7/a.class */
public final class C4773a extends AbstractC2342a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:f7/a$b.class
     */
    /* renamed from: f7.a$b */
    /* loaded from: combined.jar:classes2.jar:f7/a$b.class */
    public static final class b implements AbstractC2342a.f {

        /* renamed from: a */
        public final FlacStreamMetadata f28120a;

        /* renamed from: b */
        public final int f28121b;

        /* renamed from: c */
        public final C4330m.a f28122c;

        public b(FlacStreamMetadata flacStreamMetadata, int i10) {
            this.f28120a = flacStreamMetadata;
            this.f28121b = i10;
            this.f28122c = new C4330m.a();
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC2342a.f
        /* renamed from: a */
        public AbstractC2342a.e mo12013a(InterfaceC4324g interfaceC4324g, long j10) {
            long position = interfaceC4324g.getPosition();
            long m24166c = m24166c(interfaceC4324g);
            long mo21804i = interfaceC4324g.mo21804i();
            interfaceC4324g.mo21805k(Math.max(6, this.f28120a.minFrameSize));
            long m24166c2 = m24166c(interfaceC4324g);
            return (m24166c > j10 || m24166c2 <= j10) ? m24166c2 <= j10 ? AbstractC2342a.e.m12093f(m24166c2, interfaceC4324g.mo21804i()) : AbstractC2342a.e.m12091d(m24166c, position) : AbstractC2342a.e.m12092e(mo21804i);
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC2342a.f
        /* renamed from: b */
        public /* synthetic */ void mo12014b() {
            C4318a.m21796a(this);
        }

        /* renamed from: c */
        public final long m24166c(InterfaceC4324g interfaceC4324g) {
            while (interfaceC4324g.mo21804i() < interfaceC4324g.getLength() - 6 && !C4330m.m21833h(interfaceC4324g, this.f28120a, this.f28121b, this.f28122c)) {
                interfaceC4324g.mo21805k(1);
            }
            if (interfaceC4324g.mo21804i() < interfaceC4324g.getLength() - 6) {
                return this.f28122c.f26485a;
            }
            interfaceC4324g.mo21805k((int) (interfaceC4324g.getLength() - interfaceC4324g.mo21804i()));
            return this.f28120a.totalSamples;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4773a(FlacStreamMetadata flacStreamMetadata, int i10, long j10, long j11) {
        super(new C2332a(flacStreamMetadata), new b(flacStreamMetadata, i10), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j10, j11, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
