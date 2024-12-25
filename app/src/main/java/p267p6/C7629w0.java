package p267p6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import ec.C4704g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import p059d9.C4349a;
import p059d9.C4401z0;
import p078e9.C4665b;
import p283q7.C7839a;
import p365v6.C9273n;
import p365v6.C9284s0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/w0.class
 */
/* renamed from: p6.w0 */
/* loaded from: combined.jar:classes2.jar:p6/w0.class */
public final class C7629w0 implements Parcelable {
    public static final Parcelable.Creator<C7629w0> CREATOR = new a();

    /* renamed from: A */
    public final int f37068A;

    /* renamed from: B */
    public final int f37069B;

    /* renamed from: C */
    public final int f37070C;

    /* renamed from: D */
    public final int f37071D;

    /* renamed from: E */
    public final int f37072E;

    /* renamed from: F */
    public final Class<? extends ExoMediaCrypto> f37073F;

    /* renamed from: G */
    public int f37074G;

    /* renamed from: b */
    public final String f37075b;

    /* renamed from: c */
    public final String f37076c;

    /* renamed from: d */
    public final String f37077d;

    /* renamed from: e */
    public final int f37078e;

    /* renamed from: f */
    public final int f37079f;

    /* renamed from: g */
    public final int f37080g;

    /* renamed from: h */
    public final int f37081h;

    /* renamed from: i */
    public final int f37082i;

    /* renamed from: j */
    public final String f37083j;

    /* renamed from: k */
    public final C7839a f37084k;

    /* renamed from: l */
    public final String f37085l;

    /* renamed from: m */
    public final String f37086m;

    /* renamed from: n */
    public final int f37087n;

    /* renamed from: o */
    public final List<byte[]> f37088o;

    /* renamed from: p */
    public final C9273n f37089p;

    /* renamed from: q */
    public final long f37090q;

    /* renamed from: r */
    public final int f37091r;

    /* renamed from: s */
    public final int f37092s;

    /* renamed from: t */
    public final float f37093t;

    /* renamed from: u */
    public final int f37094u;

    /* renamed from: v */
    public final float f37095v;

    /* renamed from: w */
    public final byte[] f37096w;

    /* renamed from: x */
    public final int f37097x;

    /* renamed from: y */
    public final C4665b f37098y;

    /* renamed from: z */
    public final int f37099z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/w0$a.class
     */
    /* renamed from: p6.w0$a */
    /* loaded from: combined.jar:classes2.jar:p6/w0$a.class */
    public class a implements Parcelable.Creator<C7629w0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7629w0 createFromParcel(Parcel parcel) {
            return new C7629w0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7629w0[] newArray(int i10) {
            return new C7629w0[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/w0$b.class
     */
    /* renamed from: p6.w0$b */
    /* loaded from: combined.jar:classes2.jar:p6/w0$b.class */
    public static final class b {

        /* renamed from: A */
        public int f37100A;

        /* renamed from: B */
        public int f37101B;

        /* renamed from: C */
        public int f37102C;

        /* renamed from: D */
        public Class<? extends ExoMediaCrypto> f37103D;

        /* renamed from: a */
        public String f37104a;

        /* renamed from: b */
        public String f37105b;

        /* renamed from: c */
        public String f37106c;

        /* renamed from: d */
        public int f37107d;

        /* renamed from: e */
        public int f37108e;

        /* renamed from: f */
        public int f37109f;

        /* renamed from: g */
        public int f37110g;

        /* renamed from: h */
        public String f37111h;

        /* renamed from: i */
        public C7839a f37112i;

        /* renamed from: j */
        public String f37113j;

        /* renamed from: k */
        public String f37114k;

        /* renamed from: l */
        public int f37115l;

        /* renamed from: m */
        public List<byte[]> f37116m;

        /* renamed from: n */
        public C9273n f37117n;

        /* renamed from: o */
        public long f37118o;

        /* renamed from: p */
        public int f37119p;

        /* renamed from: q */
        public int f37120q;

        /* renamed from: r */
        public float f37121r;

        /* renamed from: s */
        public int f37122s;

        /* renamed from: t */
        public float f37123t;

        /* renamed from: u */
        public byte[] f37124u;

        /* renamed from: v */
        public int f37125v;

        /* renamed from: w */
        public C4665b f37126w;

        /* renamed from: x */
        public int f37127x;

        /* renamed from: y */
        public int f37128y;

        /* renamed from: z */
        public int f37129z;

        public b() {
            this.f37109f = -1;
            this.f37110g = -1;
            this.f37115l = -1;
            this.f37118o = Long.MAX_VALUE;
            this.f37119p = -1;
            this.f37120q = -1;
            this.f37121r = -1.0f;
            this.f37123t = 1.0f;
            this.f37125v = -1;
            this.f37127x = -1;
            this.f37128y = -1;
            this.f37129z = -1;
            this.f37102C = -1;
        }

        public b(C7629w0 c7629w0) {
            this.f37104a = c7629w0.f37075b;
            this.f37105b = c7629w0.f37076c;
            this.f37106c = c7629w0.f37077d;
            this.f37107d = c7629w0.f37078e;
            this.f37108e = c7629w0.f37079f;
            this.f37109f = c7629w0.f37080g;
            this.f37110g = c7629w0.f37081h;
            this.f37111h = c7629w0.f37083j;
            this.f37112i = c7629w0.f37084k;
            this.f37113j = c7629w0.f37085l;
            this.f37114k = c7629w0.f37086m;
            this.f37115l = c7629w0.f37087n;
            this.f37116m = c7629w0.f37088o;
            this.f37117n = c7629w0.f37089p;
            this.f37118o = c7629w0.f37090q;
            this.f37119p = c7629w0.f37091r;
            this.f37120q = c7629w0.f37092s;
            this.f37121r = c7629w0.f37093t;
            this.f37122s = c7629w0.f37094u;
            this.f37123t = c7629w0.f37095v;
            this.f37124u = c7629w0.f37096w;
            this.f37125v = c7629w0.f37097x;
            this.f37126w = c7629w0.f37098y;
            this.f37127x = c7629w0.f37099z;
            this.f37128y = c7629w0.f37068A;
            this.f37129z = c7629w0.f37069B;
            this.f37100A = c7629w0.f37070C;
            this.f37101B = c7629w0.f37071D;
            this.f37102C = c7629w0.f37072E;
            this.f37103D = c7629w0.f37073F;
        }

        public /* synthetic */ b(C7629w0 c7629w0, a aVar) {
            this(c7629w0);
        }

        /* renamed from: E */
        public C7629w0 m33194E() {
            return new C7629w0(this, null);
        }

        /* renamed from: F */
        public b m33195F(int i10) {
            this.f37102C = i10;
            return this;
        }

        /* renamed from: G */
        public b m33196G(int i10) {
            this.f37109f = i10;
            return this;
        }

        /* renamed from: H */
        public b m33197H(int i10) {
            this.f37127x = i10;
            return this;
        }

        /* renamed from: I */
        public b m33198I(String str) {
            this.f37111h = str;
            return this;
        }

        /* renamed from: J */
        public b m33199J(C4665b c4665b) {
            this.f37126w = c4665b;
            return this;
        }

        /* renamed from: K */
        public b m33200K(String str) {
            this.f37113j = str;
            return this;
        }

        /* renamed from: L */
        public b m33201L(C9273n c9273n) {
            this.f37117n = c9273n;
            return this;
        }

        /* renamed from: M */
        public b m33202M(int i10) {
            this.f37100A = i10;
            return this;
        }

        /* renamed from: N */
        public b m33203N(int i10) {
            this.f37101B = i10;
            return this;
        }

        /* renamed from: O */
        public b m33204O(Class<? extends ExoMediaCrypto> cls) {
            this.f37103D = cls;
            return this;
        }

        /* renamed from: P */
        public b m33205P(float f10) {
            this.f37121r = f10;
            return this;
        }

        /* renamed from: Q */
        public b m33206Q(int i10) {
            this.f37120q = i10;
            return this;
        }

        /* renamed from: R */
        public b m33207R(int i10) {
            this.f37104a = Integer.toString(i10);
            return this;
        }

        /* renamed from: S */
        public b m33208S(String str) {
            this.f37104a = str;
            return this;
        }

        /* renamed from: T */
        public b m33209T(List<byte[]> list) {
            this.f37116m = list;
            return this;
        }

        /* renamed from: U */
        public b m33210U(String str) {
            this.f37105b = str;
            return this;
        }

        /* renamed from: V */
        public b m33211V(String str) {
            this.f37106c = str;
            return this;
        }

        /* renamed from: W */
        public b m33212W(int i10) {
            this.f37115l = i10;
            return this;
        }

        /* renamed from: X */
        public b m33213X(C7839a c7839a) {
            this.f37112i = c7839a;
            return this;
        }

        /* renamed from: Y */
        public b m33214Y(int i10) {
            this.f37129z = i10;
            return this;
        }

        /* renamed from: Z */
        public b m33215Z(int i10) {
            this.f37110g = i10;
            return this;
        }

        /* renamed from: a0 */
        public b m33216a0(float f10) {
            this.f37123t = f10;
            return this;
        }

        /* renamed from: b0 */
        public b m33217b0(byte[] bArr) {
            this.f37124u = bArr;
            return this;
        }

        /* renamed from: c0 */
        public b m33218c0(int i10) {
            this.f37108e = i10;
            return this;
        }

        /* renamed from: d0 */
        public b m33219d0(int i10) {
            this.f37122s = i10;
            return this;
        }

        /* renamed from: e0 */
        public b m33220e0(String str) {
            this.f37114k = str;
            return this;
        }

        /* renamed from: f0 */
        public b m33221f0(int i10) {
            this.f37128y = i10;
            return this;
        }

        /* renamed from: g0 */
        public b m33222g0(int i10) {
            this.f37107d = i10;
            return this;
        }

        /* renamed from: h0 */
        public b m33223h0(int i10) {
            this.f37125v = i10;
            return this;
        }

        /* renamed from: i0 */
        public b m33224i0(long j10) {
            this.f37118o = j10;
            return this;
        }

        /* renamed from: j0 */
        public b m33225j0(int i10) {
            this.f37119p = i10;
            return this;
        }
    }

    public C7629w0(Parcel parcel) {
        this.f37075b = parcel.readString();
        this.f37076c = parcel.readString();
        this.f37077d = parcel.readString();
        this.f37078e = parcel.readInt();
        this.f37079f = parcel.readInt();
        int readInt = parcel.readInt();
        this.f37080g = readInt;
        int readInt2 = parcel.readInt();
        this.f37081h = readInt2;
        this.f37082i = readInt2 != -1 ? readInt2 : readInt;
        this.f37083j = parcel.readString();
        this.f37084k = (C7839a) parcel.readParcelable(C7839a.class.getClassLoader());
        this.f37085l = parcel.readString();
        this.f37086m = parcel.readString();
        this.f37087n = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f37088o = new ArrayList(readInt3);
        for (int i10 = 0; i10 < readInt3; i10++) {
            this.f37088o.add((byte[]) C4349a.m21882e(parcel.createByteArray()));
        }
        C9273n c9273n = (C9273n) parcel.readParcelable(C9273n.class.getClassLoader());
        this.f37089p = c9273n;
        this.f37090q = parcel.readLong();
        this.f37091r = parcel.readInt();
        this.f37092s = parcel.readInt();
        this.f37093t = parcel.readFloat();
        this.f37094u = parcel.readInt();
        this.f37095v = parcel.readFloat();
        this.f37096w = C4401z0.m22338M0(parcel) ? parcel.createByteArray() : null;
        this.f37097x = parcel.readInt();
        this.f37098y = (C4665b) parcel.readParcelable(C4665b.class.getClassLoader());
        this.f37099z = parcel.readInt();
        this.f37068A = parcel.readInt();
        this.f37069B = parcel.readInt();
        this.f37070C = parcel.readInt();
        this.f37071D = parcel.readInt();
        this.f37072E = parcel.readInt();
        this.f37073F = c9273n != null ? C9284s0.class : null;
    }

    public C7629w0(b bVar) {
        this.f37075b = bVar.f37104a;
        this.f37076c = bVar.f37105b;
        this.f37077d = C4401z0.m22322E0(bVar.f37106c);
        this.f37078e = bVar.f37107d;
        this.f37079f = bVar.f37108e;
        int i10 = bVar.f37109f;
        this.f37080g = i10;
        int i11 = bVar.f37110g;
        this.f37081h = i11;
        this.f37082i = i11 != -1 ? i11 : i10;
        this.f37083j = bVar.f37111h;
        this.f37084k = bVar.f37112i;
        this.f37085l = bVar.f37113j;
        this.f37086m = bVar.f37114k;
        this.f37087n = bVar.f37115l;
        this.f37088o = bVar.f37116m == null ? Collections.emptyList() : bVar.f37116m;
        C9273n c9273n = bVar.f37117n;
        this.f37089p = c9273n;
        this.f37090q = bVar.f37118o;
        this.f37091r = bVar.f37119p;
        this.f37092s = bVar.f37120q;
        this.f37093t = bVar.f37121r;
        this.f37094u = bVar.f37122s == -1 ? 0 : bVar.f37122s;
        this.f37095v = bVar.f37123t == -1.0f ? 1.0f : bVar.f37123t;
        this.f37096w = bVar.f37124u;
        this.f37097x = bVar.f37125v;
        this.f37098y = bVar.f37126w;
        this.f37099z = bVar.f37127x;
        this.f37068A = bVar.f37128y;
        this.f37069B = bVar.f37129z;
        this.f37070C = bVar.f37100A == -1 ? 0 : bVar.f37100A;
        this.f37071D = bVar.f37101B == -1 ? 0 : bVar.f37101B;
        this.f37072E = bVar.f37102C;
        this.f37073F = (bVar.f37103D != null || c9273n == null) ? bVar.f37103D : C9284s0.class;
    }

    public /* synthetic */ C7629w0(b bVar, a aVar) {
        this(bVar);
    }

    /* renamed from: l */
    public static String m33156l(C7629w0 c7629w0) {
        String str;
        if (c7629w0 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(c7629w0.f37075b);
        sb2.append(", mimeType=");
        sb2.append(c7629w0.f37086m);
        if (c7629w0.f37082i != -1) {
            sb2.append(", bitrate=");
            sb2.append(c7629w0.f37082i);
        }
        if (c7629w0.f37083j != null) {
            sb2.append(", codecs=");
            sb2.append(c7629w0.f37083j);
        }
        if (c7629w0.f37089p != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                C9273n c9273n = c7629w0.f37089p;
                if (i10 >= c9273n.f42359e) {
                    break;
                }
                UUID uuid = c9273n.m39139l(i10).f42361c;
                if (uuid.equals(C7583h.f36777b)) {
                    str = "cenc";
                } else if (uuid.equals(C7583h.f36778c)) {
                    str = "clearkey";
                } else if (uuid.equals(C7583h.f36780e)) {
                    str = "playready";
                } else if (uuid.equals(C7583h.f36779d)) {
                    str = "widevine";
                } else if (uuid.equals(C7583h.f36776a)) {
                    str = "universal";
                } else {
                    str = "unknown (" + uuid + ")";
                }
                linkedHashSet.add(str);
                i10++;
            }
            sb2.append(", drm=[");
            sb2.append(C4704g.m23647e(',').m23651c(linkedHashSet));
            sb2.append(']');
        }
        if (c7629w0.f37091r != -1 && c7629w0.f37092s != -1) {
            sb2.append(", res=");
            sb2.append(c7629w0.f37091r);
            sb2.append("x");
            sb2.append(c7629w0.f37092s);
        }
        if (c7629w0.f37093t != -1.0f) {
            sb2.append(", fps=");
            sb2.append(c7629w0.f37093t);
        }
        if (c7629w0.f37099z != -1) {
            sb2.append(", channels=");
            sb2.append(c7629w0.f37099z);
        }
        if (c7629w0.f37068A != -1) {
            sb2.append(", sample_rate=");
            sb2.append(c7629w0.f37068A);
        }
        if (c7629w0.f37077d != null) {
            sb2.append(", language=");
            sb2.append(c7629w0.f37077d);
        }
        if (c7629w0.f37076c != null) {
            sb2.append(", label=");
            sb2.append(c7629w0.f37076c);
        }
        if ((c7629w0.f37079f & 16384) != 0) {
            sb2.append(", trick-play-track");
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public b m33157b() {
        return new b(this, null);
    }

    /* renamed from: c */
    public C7629w0 m33158c(Class<? extends ExoMediaCrypto> cls) {
        return m33157b().m33204O(cls).m33194E();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i10;
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7629w0.class != obj.getClass()) {
            return false;
        }
        C7629w0 c7629w0 = (C7629w0) obj;
        int i11 = this.f37074G;
        if (i11 != 0 && (i10 = c7629w0.f37074G) != 0 && i11 != i10) {
            return false;
        }
        if (this.f37078e != c7629w0.f37078e || this.f37079f != c7629w0.f37079f || this.f37080g != c7629w0.f37080g || this.f37081h != c7629w0.f37081h || this.f37087n != c7629w0.f37087n || this.f37090q != c7629w0.f37090q || this.f37091r != c7629w0.f37091r || this.f37092s != c7629w0.f37092s || this.f37094u != c7629w0.f37094u || this.f37097x != c7629w0.f37097x || this.f37099z != c7629w0.f37099z || this.f37068A != c7629w0.f37068A || this.f37069B != c7629w0.f37069B || this.f37070C != c7629w0.f37070C || this.f37071D != c7629w0.f37071D || this.f37072E != c7629w0.f37072E || Float.compare(this.f37093t, c7629w0.f37093t) != 0 || Float.compare(this.f37095v, c7629w0.f37095v) != 0 || !C4401z0.m22371c(this.f37073F, c7629w0.f37073F) || !C4401z0.m22371c(this.f37075b, c7629w0.f37075b) || !C4401z0.m22371c(this.f37076c, c7629w0.f37076c) || !C4401z0.m22371c(this.f37083j, c7629w0.f37083j) || !C4401z0.m22371c(this.f37085l, c7629w0.f37085l) || !C4401z0.m22371c(this.f37086m, c7629w0.f37086m) || !C4401z0.m22371c(this.f37077d, c7629w0.f37077d) || !Arrays.equals(this.f37096w, c7629w0.f37096w) || !C4401z0.m22371c(this.f37084k, c7629w0.f37084k) || !C4401z0.m22371c(this.f37098y, c7629w0.f37098y) || !C4401z0.m22371c(this.f37089p, c7629w0.f37089p) || !m33160k(c7629w0)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        if (this.f37074G == 0) {
            String str = this.f37075b;
            int i10 = 0;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.f37076c;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.f37077d;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            int i11 = this.f37078e;
            int i12 = this.f37079f;
            int i13 = this.f37080g;
            int i14 = this.f37081h;
            String str4 = this.f37083j;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            C7839a c7839a = this.f37084k;
            int hashCode5 = c7839a == null ? 0 : c7839a.hashCode();
            String str5 = this.f37085l;
            int hashCode6 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.f37086m;
            int hashCode7 = str6 == null ? 0 : str6.hashCode();
            int i15 = this.f37087n;
            int i16 = (int) this.f37090q;
            int i17 = this.f37091r;
            int i18 = this.f37092s;
            int floatToIntBits = Float.floatToIntBits(this.f37093t);
            int i19 = this.f37094u;
            int floatToIntBits2 = Float.floatToIntBits(this.f37095v);
            int i20 = this.f37097x;
            int i21 = this.f37099z;
            int i22 = this.f37068A;
            int i23 = this.f37069B;
            int i24 = this.f37070C;
            int i25 = this.f37071D;
            int i26 = this.f37072E;
            Class<? extends ExoMediaCrypto> cls = this.f37073F;
            if (cls != null) {
                i10 = cls.hashCode();
            }
            this.f37074G = ((((((((((((((((((((((((((((((((((((((((((((((((((527 + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + floatToIntBits) * 31) + i19) * 31) + floatToIntBits2) * 31) + i20) * 31) + i21) * 31) + i22) * 31) + i23) * 31) + i24) * 31) + i25) * 31) + i26) * 31) + i10;
        }
        return this.f37074G;
    }

    /* renamed from: j */
    public int m33159j() {
        int i10 = this.f37091r;
        int i11 = -1;
        if (i10 != -1) {
            int i12 = this.f37092s;
            i11 = i12 == -1 ? -1 : i10 * i12;
        }
        return i11;
    }

    /* renamed from: k */
    public boolean m33160k(C7629w0 c7629w0) {
        if (this.f37088o.size() != c7629w0.f37088o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f37088o.size(); i10++) {
            if (!Arrays.equals(this.f37088o.get(i10), c7629w0.f37088o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == 1) goto L14;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p267p6.C7629w0 m33161m(p267p6.C7629w0 r5) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7629w0.m33161m(p6.w0):p6.w0");
    }

    public String toString() {
        return "Format(" + this.f37075b + ", " + this.f37076c + ", " + this.f37085l + ", " + this.f37086m + ", " + this.f37083j + ", " + this.f37082i + ", " + this.f37077d + ", [" + this.f37091r + ", " + this.f37092s + ", " + this.f37093t + "], [" + this.f37099z + ", " + this.f37068A + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f37075b);
        parcel.writeString(this.f37076c);
        parcel.writeString(this.f37077d);
        parcel.writeInt(this.f37078e);
        parcel.writeInt(this.f37079f);
        parcel.writeInt(this.f37080g);
        parcel.writeInt(this.f37081h);
        parcel.writeString(this.f37083j);
        parcel.writeParcelable(this.f37084k, 0);
        parcel.writeString(this.f37085l);
        parcel.writeString(this.f37086m);
        parcel.writeInt(this.f37087n);
        int size = this.f37088o.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.f37088o.get(i11));
        }
        parcel.writeParcelable(this.f37089p, 0);
        parcel.writeLong(this.f37090q);
        parcel.writeInt(this.f37091r);
        parcel.writeInt(this.f37092s);
        parcel.writeFloat(this.f37093t);
        parcel.writeInt(this.f37094u);
        parcel.writeFloat(this.f37095v);
        C4401z0.m22388h1(parcel, this.f37096w != null);
        byte[] bArr = this.f37096w;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f37097x);
        parcel.writeParcelable(this.f37098y, i10);
        parcel.writeInt(this.f37099z);
        parcel.writeInt(this.f37068A);
        parcel.writeInt(this.f37069B);
        parcel.writeInt(this.f37070C);
        parcel.writeInt(this.f37071D);
        parcel.writeInt(this.f37072E);
    }
}
