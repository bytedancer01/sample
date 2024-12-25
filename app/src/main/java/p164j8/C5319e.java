package p164j8;

import org.jsoup.parser.CharacterReader;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j8/e.class
 */
/* renamed from: j8.e */
/* loaded from: combined.jar:classes2.jar:j8/e.class */
public final class C5319e {

    /* renamed from: l */
    public static final byte[] f30553l = new byte[0];

    /* renamed from: a */
    public final byte f30554a;

    /* renamed from: b */
    public final boolean f30555b;

    /* renamed from: c */
    public final boolean f30556c;

    /* renamed from: d */
    public final byte f30557d;

    /* renamed from: e */
    public final boolean f30558e;

    /* renamed from: f */
    public final byte f30559f;

    /* renamed from: g */
    public final int f30560g;

    /* renamed from: h */
    public final long f30561h;

    /* renamed from: i */
    public final int f30562i;

    /* renamed from: j */
    public final byte[] f30563j;

    /* renamed from: k */
    public final byte[] f30564k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:j8/e$b.class
     */
    /* renamed from: j8.e$b */
    /* loaded from: combined.jar:classes2.jar:j8/e$b.class */
    public static final class b {

        /* renamed from: a */
        public boolean f30565a;

        /* renamed from: b */
        public boolean f30566b;

        /* renamed from: c */
        public byte f30567c;

        /* renamed from: d */
        public int f30568d;

        /* renamed from: e */
        public long f30569e;

        /* renamed from: f */
        public int f30570f;

        /* renamed from: g */
        public byte[] f30571g = C5319e.f30553l;

        /* renamed from: h */
        public byte[] f30572h = C5319e.f30553l;

        /* renamed from: i */
        public C5319e m26559i() {
            return new C5319e(this);
        }

        /* renamed from: j */
        public b m26560j(byte[] bArr) {
            C4349a.m21882e(bArr);
            this.f30571g = bArr;
            return this;
        }

        /* renamed from: k */
        public b m26561k(boolean z10) {
            this.f30566b = z10;
            return this;
        }

        /* renamed from: l */
        public b m26562l(boolean z10) {
            this.f30565a = z10;
            return this;
        }

        /* renamed from: m */
        public b m26563m(byte[] bArr) {
            C4349a.m21882e(bArr);
            this.f30572h = bArr;
            return this;
        }

        /* renamed from: n */
        public b m26564n(byte b10) {
            this.f30567c = b10;
            return this;
        }

        /* renamed from: o */
        public b m26565o(int i10) {
            C4349a.m21878a(i10 >= 0 && i10 <= 65535);
            this.f30568d = i10 & CharacterReader.EOF;
            return this;
        }

        /* renamed from: p */
        public b m26566p(int i10) {
            this.f30570f = i10;
            return this;
        }

        /* renamed from: q */
        public b m26567q(long j10) {
            this.f30569e = j10;
            return this;
        }
    }

    public C5319e(b bVar) {
        this.f30554a = (byte) 2;
        this.f30555b = bVar.f30565a;
        this.f30556c = false;
        this.f30558e = bVar.f30566b;
        this.f30559f = bVar.f30567c;
        this.f30560g = bVar.f30568d;
        this.f30561h = bVar.f30569e;
        this.f30562i = bVar.f30570f;
        byte[] bArr = bVar.f30571g;
        this.f30563j = bArr;
        this.f30557d = (byte) (bArr.length / 4);
        this.f30564k = bVar.f30572h;
    }

    /* renamed from: b */
    public static C5319e m26550b(C4361f0 c4361f0) {
        byte[] bArr;
        if (c4361f0.m21985a() < 12) {
            return null;
        }
        int m21971D = c4361f0.m21971D();
        byte b10 = (byte) (m21971D >> 6);
        boolean z10 = true;
        boolean z11 = ((m21971D >> 5) & 1) == 1;
        byte b11 = (byte) (m21971D & 15);
        if (b10 != 2) {
            return null;
        }
        int m21971D2 = c4361f0.m21971D();
        if (((m21971D2 >> 7) & 1) != 1) {
            z10 = false;
        }
        byte b12 = (byte) (m21971D2 & 127);
        int m21977J = c4361f0.m21977J();
        long m21973F = c4361f0.m21973F();
        int m21998n = c4361f0.m21998n();
        if (b11 > 0) {
            byte[] bArr2 = new byte[b11 * 4];
            int i10 = 0;
            while (true) {
                bArr = bArr2;
                if (i10 >= b11) {
                    break;
                }
                c4361f0.m21994j(bArr2, i10 * 4, 4);
                i10++;
            }
        } else {
            bArr = f30553l;
        }
        byte[] bArr3 = new byte[c4361f0.m21985a()];
        c4361f0.m21994j(bArr3, 0, c4361f0.m21985a());
        return new b().m26562l(z11).m26561k(z10).m26564n(b12).m26565o(m21977J).m26567q(m21973F).m26566p(m21998n).m26560j(bArr).m26563m(bArr3).m26559i();
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C5319e.class != obj.getClass()) {
            return false;
        }
        C5319e c5319e = (C5319e) obj;
        if (this.f30559f != c5319e.f30559f || this.f30560g != c5319e.f30560g || this.f30558e != c5319e.f30558e || this.f30561h != c5319e.f30561h || this.f30562i != c5319e.f30562i) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        byte b10 = this.f30559f;
        int i10 = this.f30560g;
        boolean z10 = this.f30558e;
        long j10 = this.f30561h;
        return ((((((((527 + b10) * 31) + i10) * 31) + (z10 ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f30562i;
    }

    public String toString() {
        return C4401z0.m22321E("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f30559f), Integer.valueOf(this.f30560g), Long.valueOf(this.f30561h), Integer.valueOf(this.f30562i), Boolean.valueOf(this.f30558e));
    }
}
