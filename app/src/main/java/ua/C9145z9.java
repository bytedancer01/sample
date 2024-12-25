package ua;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import p305ra.C8137f2;
import p305ra.C8167h2;
import p305ra.C8182i2;
import p305ra.C8195j0;
import p305ra.C8197j2;
import p305ra.C8225l0;
import p305ra.C8226l1;
import p305ra.C8256n1;
import p305ra.C8286p1;
import p305ra.C8301q1;
import p305ra.C8315r0;
import p305ra.C8345t0;
import p305ra.C8346t1;
import p305ra.C8361u1;
import p305ra.C8391w1;
import p305ra.C8406x1;
import p305ra.C8420y0;
import p305ra.C8421y1;
import p305ra.C8425y5;
import p305ra.InterfaceC8292p7;
import p422y9.C9935o;
import p441z9.C10126b;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/z9.class
 */
/* renamed from: ua.z9 */
/* loaded from: combined.jar:classes2.jar:ua/z9.class */
public final class C9145z9 extends AbstractC9030p9 {
    public C9145z9(C9123x9 c9123x9) {
        super(c9123x9);
    }

    /* renamed from: B */
    public static boolean m38442B(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: C */
    public static boolean m38443C(List<Long> list, int i10) {
        return i10 < list.size() * 64 && ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
    }

    /* renamed from: D */
    public static List<Long> m38444D(BitSet bitSet) {
        int i10;
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            long j10 = 0;
            int i12 = 0;
            while (i12 < 64 && (i10 = (i11 * 64) + i12) < bitSet.length()) {
                long j11 = j10;
                if (bitSet.get(i10)) {
                    j11 = j10 | (1 << i12);
                }
                i12++;
                j10 = j11;
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* renamed from: I */
    public static <Builder extends InterfaceC8292p7> Builder m38445I(Builder builder, byte[] bArr) {
        C8425y5 m36227b = C8425y5.m36227b();
        return m36227b != null ? (Builder) builder.mo35683v(bArr, m36227b) : (Builder) builder.mo35682B(bArr);
    }

    /* renamed from: J */
    public static int m38446J(C8406x1 c8406x1, String str) {
        for (int i10 = 0; i10 < c8406x1.m36058x0(); i10++) {
            if (str.equals(c8406x1.m36059y0(i10).m35500C())) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: K */
    public static List<C8361u1> m38447K(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C8346t1 m35839M = C8361u1.m35839M();
                for (String str : bundle.keySet()) {
                    C8346t1 m35839M2 = C8361u1.m35839M();
                    m35839M2.m35806s(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        m35839M2.m35809z(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        m35839M2.m35807u((String) obj);
                    } else if (obj instanceof Double) {
                        m35839M2.m35800C(((Double) obj).doubleValue());
                    }
                    m35839M.m35803F(m35839M2);
                }
                if (m35839M.m35802E() > 0) {
                    arrayList.add(m35839M.m35445l());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    public static final void m38448L(C8286p1 c8286p1, String str, Object obj) {
        List<C8361u1> m35677s = c8286p1.m35677s();
        int i10 = 0;
        while (true) {
            if (i10 >= m35677s.size()) {
                i10 = -1;
                break;
            } else if (str.equals(m35677s.get(i10).m35851A())) {
                break;
            } else {
                i10++;
            }
        }
        C8346t1 m35839M = C8361u1.m35839M();
        m35839M.m35806s(str);
        if (obj instanceof Long) {
            m35839M.m35809z(((Long) obj).longValue());
        } else if (obj instanceof String) {
            m35839M.m35807u((String) obj);
        } else if (obj instanceof Double) {
            m35839M.m35800C(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            m35839M.m35804G(m38447K((Bundle[]) obj));
        }
        if (i10 >= 0) {
            c8286p1.m35664A(i10, m35839M);
        } else {
            c8286p1.m35666D(m35839M);
        }
    }

    /* renamed from: M */
    public static final boolean m38449M(C9068t c9068t, C8959ja c8959ja) {
        C9935o.m41850j(c9068t);
        C9935o.m41850j(c8959ja);
        return (TextUtils.isEmpty(c8959ja.f41229e) && TextUtils.isEmpty(c8959ja.f41244t)) ? false : true;
    }

    /* renamed from: N */
    public static final C8361u1 m38450N(C8301q1 c8301q1, String str) {
        for (C8361u1 c8361u1 : c8301q1.m35711z()) {
            if (c8361u1.m35851A().equals(str)) {
                return c8361u1;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static final Object m38451m(C8301q1 c8301q1, String str) {
        C8361u1 m38450N = m38450N(c8301q1, str);
        if (m38450N == null) {
            return null;
        }
        if (m38450N.m35852C()) {
            return m38450N.m35853D();
        }
        if (m38450N.m35854E()) {
            return Long.valueOf(m38450N.m35855F());
        }
        if (m38450N.m35858I()) {
            return Double.valueOf(m38450N.m35859J());
        }
        if (m38450N.m35861L() <= 0) {
            return null;
        }
        List<C8361u1> m35860K = m38450N.m35860K();
        ArrayList arrayList = new ArrayList();
        for (C8361u1 c8361u1 : m35860K) {
            if (c8361u1 != null) {
                Bundle bundle = new Bundle();
                for (C8361u1 c8361u12 : c8361u1.m35860K()) {
                    if (c8361u12.m35852C()) {
                        bundle.putString(c8361u12.m35851A(), c8361u12.m35853D());
                    } else if (c8361u12.m35854E()) {
                        bundle.putLong(c8361u12.m35851A(), c8361u12.m35855F());
                    } else if (c8361u12.m35858I()) {
                        bundle.putDouble(c8361u12.m35851A(), c8361u12.m35859J());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: p */
    public static final void m38452p(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    /* renamed from: q */
    public static final String m38453q(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* renamed from: r */
    public static final void m38454r(StringBuilder sb2, int i10, String str, C8137f2 c8137f2, String str2) {
        if (c8137f2 == null) {
            return;
        }
        m38452p(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c8137f2.m35349D() != 0) {
            m38452p(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : c8137f2.m35348C()) {
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11++;
            }
            sb2.append('\n');
        }
        if (c8137f2.m35347A() != 0) {
            m38452p(sb2, 4);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l11 : c8137f2.m35358z()) {
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i12++;
            }
            sb2.append('\n');
        }
        if (c8137f2.m35351F() != 0) {
            m38452p(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (C8256n1 c8256n1 : c8137f2.m35350E()) {
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c8256n1.m35644z() ? Integer.valueOf(c8256n1.m35641A()) : null);
                sb2.append(":");
                sb2.append(c8256n1.m35642C() ? Long.valueOf(c8256n1.m35643D()) : null);
                i13++;
            }
            sb2.append("}\n");
        }
        if (c8137f2.m35354I() != 0) {
            m38452p(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i14 = 0;
            for (C8167h2 c8167h2 : c8137f2.m35353H()) {
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c8167h2.m35413z() ? Integer.valueOf(c8167h2.m35409A()) : null);
                sb2.append(": [");
                Iterator<Long> it = c8167h2.m35410C().iterator();
                int i15 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    if (i15 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i15++;
                }
                sb2.append("]");
                i14++;
            }
            sb2.append("}\n");
        }
        m38452p(sb2, 3);
        sb2.append("}\n");
    }

    /* renamed from: s */
    public static final void m38455s(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m38452p(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    /* renamed from: t */
    public static final void m38456t(StringBuilder sb2, int i10, String str, C8315r0 c8315r0) {
        if (c8315r0 == null) {
            return;
        }
        m38452p(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (c8315r0.m35756z()) {
            m38455s(sb2, i10, "comparison_type", c8315r0.m35747A().name());
        }
        if (c8315r0.m35748C()) {
            m38455s(sb2, i10, "match_as_float", Boolean.valueOf(c8315r0.m35749D()));
        }
        if (c8315r0.m35750E()) {
            m38455s(sb2, i10, "comparison_value", c8315r0.m35751F());
        }
        if (c8315r0.m35752G()) {
            m38455s(sb2, i10, "min_comparison_value", c8315r0.m35753H());
        }
        if (c8315r0.m35754I()) {
            m38455s(sb2, i10, "max_comparison_value", c8315r0.m35755J());
        }
        m38452p(sb2, i10);
        sb2.append("}\n");
    }

    /* renamed from: A */
    public final <T extends Parcelable> T m38457A(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                return creator.createFromParcel(obtain);
            } catch (C10126b.a e10) {
                this.f41723a.mo37780c().m38408o().m38326a("Failed to load parcelable from buffer");
                obtain.recycle();
                return null;
            }
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: E */
    public final List<Long> m38458E(List<Long> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                this.f41723a.mo37780c().m38411r().m38327b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f41723a.mo37780c().m38411r().m38328c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            if (i10 < 0 || ((Long) arrayList.get(i10)).longValue() != 0) {
                break;
            }
            size = i10;
            size2 = i10 - 1;
        }
        return arrayList.subList(0, size);
    }

    /* renamed from: F */
    public final boolean m38459F(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f41723a.mo37778a().mo22432a() - j10) > j11;
    }

    /* renamed from: G */
    public final long m38460G(byte[] bArr) {
        C9935o.m41850j(bArr);
        this.f41723a.m37765G().mo37811h();
        MessageDigest m37816B = C8899ea.m37816B();
        if (m37816B != null) {
            return C8899ea.m37817C(m37816B.digest(bArr));
        }
        this.f41723a.mo37780c().m38408o().m38326a("Failed to get MD5");
        return 0L;
    }

    /* renamed from: H */
    public final byte[] m38461H(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f41723a.mo37780c().m38408o().m38327b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // ua.AbstractC9030p9
    /* renamed from: l */
    public final boolean mo37812l() {
        return false;
    }

    /* renamed from: n */
    public final void m38462n(StringBuilder sb2, int i10, List<C8361u1> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (C8361u1 c8361u1 : list) {
            if (c8361u1 != null) {
                m38452p(sb2, i11);
                sb2.append("param {\n");
                m38455s(sb2, i11, "name", c8361u1.m35863z() ? this.f41723a.m37766H().m38232q(c8361u1.m35851A()) : null);
                m38455s(sb2, i11, "string_value", c8361u1.m35852C() ? c8361u1.m35853D() : null);
                m38455s(sb2, i11, "int_value", c8361u1.m35854E() ? Long.valueOf(c8361u1.m35855F()) : null);
                m38455s(sb2, i11, "double_value", c8361u1.m35858I() ? Double.valueOf(c8361u1.m35859J()) : null);
                if (c8361u1.m35861L() > 0) {
                    m38462n(sb2, i11, c8361u1.m35860K());
                }
                m38452p(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    /* renamed from: o */
    public final void m38463o(StringBuilder sb2, int i10, C8225l0 c8225l0) {
        if (c8225l0 == null) {
            return;
        }
        m38452p(sb2, i10);
        sb2.append("filter {\n");
        if (c8225l0.m35549E()) {
            m38455s(sb2, i10, "complement", Boolean.valueOf(c8225l0.m35550F()));
        }
        if (c8225l0.m35551G()) {
            m38455s(sb2, i10, "param_name", this.f41723a.m37766H().m38232q(c8225l0.m35552H()));
        }
        if (c8225l0.m35553z()) {
            int i11 = i10 + 1;
            C8420y0 m35546A = c8225l0.m35546A();
            if (m35546A != null) {
                m38452p(sb2, i11);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (m35546A.m36098z()) {
                    m38455s(sb2, i11, "match_type", m35546A.m36091A().name());
                }
                if (m35546A.m36092C()) {
                    m38455s(sb2, i11, "expression", m35546A.m36093D());
                }
                if (m35546A.m36094E()) {
                    m38455s(sb2, i11, "case_sensitive", Boolean.valueOf(m35546A.m36095F()));
                }
                if (m35546A.m36097H() > 0) {
                    m38452p(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str : m35546A.m36096G()) {
                        m38452p(sb2, i11 + 2);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m38452p(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (c8225l0.m35547C()) {
            m38456t(sb2, i10 + 1, "number_filter", c8225l0.m35548D());
        }
        m38452p(sb2, i10);
        sb2.append("}\n");
    }

    /* renamed from: u */
    public final void m38464u(C8182i2 c8182i2, Object obj) {
        C9935o.m41850j(obj);
        c8182i2.m35439z();
        c8182i2.m35433C();
        c8182i2.m35435E();
        if (obj instanceof String) {
            c8182i2.m35438x((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c8182i2.m35432A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c8182i2.m35434D(((Double) obj).doubleValue());
        } else {
            this.f41723a.mo37780c().m38408o().m38327b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: v */
    public final void m38465v(C8346t1 c8346t1, Object obj) {
        C9935o.m41850j(obj);
        c8346t1.m35808x();
        c8346t1.m35799A();
        c8346t1.m35801D();
        c8346t1.m35805H();
        if (obj instanceof String) {
            c8346t1.m35807u((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c8346t1.m35809z(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            c8346t1.m35800C(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            c8346t1.m35804G(m38447K((Bundle[]) obj));
        } else {
            this.f41723a.mo37780c().m38408o().m38327b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: w */
    public final C8301q1 m38466w(C9008o c9008o) {
        C8286p1 m35691K = C8301q1.m35691K();
        m35691K.m35676N(c9008o.f41472e);
        C9032q c9032q = new C9032q(c9008o.f41473f);
        while (c9032q.hasNext()) {
            String next = c9032q.next();
            C8346t1 m35839M = C8361u1.m35839M();
            m35839M.m35806s(next);
            Object m38212b = c9008o.f41473f.m38212b(next);
            C9935o.m41850j(m38212b);
            m38465v(m35839M, m38212b);
            m35691K.m35666D(m35839M);
        }
        return m35691K.m35445l();
    }

    /* renamed from: x */
    public final String m38467x(C8391w1 c8391w1) {
        if (c8391w1 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (C8421y1 c8421y1 : c8391w1.m35984z()) {
            if (c8421y1 != null) {
                m38452p(sb2, 1);
                sb2.append("bundle {\n");
                if (c8421y1.m36205a0()) {
                    m38455s(sb2, 1, "protocol_version", Integer.valueOf(c8421y1.m36206b1()));
                }
                m38455s(sb2, 1, "platform", c8421y1.m36180I1());
                if (c8421y1.m36160C()) {
                    m38455s(sb2, 1, "gmp_version", Long.valueOf(c8421y1.m36163D()));
                }
                if (c8421y1.m36166E()) {
                    m38455s(sb2, 1, "uploading_gmp_version", Long.valueOf(c8421y1.m36169F()));
                }
                if (c8421y1.m36170F0()) {
                    m38455s(sb2, 1, "dynamite_version", Long.valueOf(c8421y1.m36173G0()));
                }
                if (c8421y1.m36201W()) {
                    m38455s(sb2, 1, "config_version", Long.valueOf(c8421y1.m36202X()));
                }
                m38455s(sb2, 1, "gmp_app_id", c8421y1.m36194P());
                m38455s(sb2, 1, "admob_app_id", c8421y1.m36167E0());
                m38455s(sb2, 1, "app_id", c8421y1.m36216z());
                m38455s(sb2, 1, "app_version", c8421y1.m36156A());
                if (c8421y1.m36199U()) {
                    m38455s(sb2, 1, "app_version_major", Integer.valueOf(c8421y1.m36200V()));
                }
                m38455s(sb2, 1, "firebase_instance_id", c8421y1.m36198T());
                if (c8421y1.m36184K()) {
                    m38455s(sb2, 1, "dev_cert_hash", Long.valueOf(c8421y1.m36186L()));
                }
                m38455s(sb2, 1, "app_store", c8421y1.m36193O1());
                if (c8421y1.m36215y1()) {
                    m38455s(sb2, 1, "upload_timestamp_millis", Long.valueOf(c8421y1.m36217z1()));
                }
                if (c8421y1.m36157A1()) {
                    m38455s(sb2, 1, "start_timestamp_millis", Long.valueOf(c8421y1.m36159B1()));
                }
                if (c8421y1.m36162C1()) {
                    m38455s(sb2, 1, "end_timestamp_millis", Long.valueOf(c8421y1.m36165D1()));
                }
                if (c8421y1.m36168E1()) {
                    m38455s(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c8421y1.m36171F1()));
                }
                if (c8421y1.m36174G1()) {
                    m38455s(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c8421y1.m36177H1()));
                }
                m38455s(sb2, 1, "app_instance_id", c8421y1.m36181J());
                m38455s(sb2, 1, "resettable_device_id", c8421y1.m36172G());
                m38455s(sb2, 1, "ds_id", c8421y1.m36158B0());
                if (c8421y1.m36175H()) {
                    m38455s(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c8421y1.m36178I()));
                }
                m38455s(sb2, 1, "os_version", c8421y1.m36183J1());
                m38455s(sb2, 1, "device_model", c8421y1.m36185K1());
                m38455s(sb2, 1, "user_default_language", c8421y1.m36187L1());
                if (c8421y1.m36189M1()) {
                    m38455s(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c8421y1.m36191N1()));
                }
                if (c8421y1.m36188M()) {
                    m38455s(sb2, 1, "bundle_sequential_index", Integer.valueOf(c8421y1.m36190N()));
                }
                if (c8421y1.m36195Q()) {
                    m38455s(sb2, 1, "service_upload", Boolean.valueOf(c8421y1.m36196R()));
                }
                m38455s(sb2, 1, "health_monitor", c8421y1.m36192O());
                if (!this.f41723a.m37797z().m37900w(null, C8988m3.f41402z0) && c8421y1.m36203Y() && c8421y1.m36204Z() != 0) {
                    m38455s(sb2, 1, "android_id", Long.valueOf(c8421y1.m36204Z()));
                }
                if (c8421y1.m36161C0()) {
                    m38455s(sb2, 1, IjkMediaPlayer.OnNativeInvokeListener.ARG_RETRY_COUNTER, Integer.valueOf(c8421y1.m36164D0()));
                }
                if (c8421y1.m36179I0()) {
                    m38455s(sb2, 1, "consent_signals", c8421y1.m36182J0());
                }
                List<C8197j2> m36212v1 = c8421y1.m36212v1();
                if (m36212v1 != null) {
                    for (C8197j2 c8197j2 : m36212v1) {
                        if (c8197j2 != null) {
                            m38452p(sb2, 2);
                            sb2.append("user_property {\n");
                            m38455s(sb2, 2, "set_timestamp_millis", c8197j2.m35507z() ? Long.valueOf(c8197j2.m35499A()) : null);
                            m38455s(sb2, 2, "name", this.f41723a.m37766H().m38233r(c8197j2.m35500C()));
                            m38455s(sb2, 2, "string_value", c8197j2.m35502E());
                            m38455s(sb2, 2, "int_value", c8197j2.m35503F() ? Long.valueOf(c8197j2.m35504G()) : null);
                            m38455s(sb2, 2, "double_value", c8197j2.m35505H() ? Double.valueOf(c8197j2.m35506I()) : null);
                            m38452p(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C8226l1> m36197S = c8421y1.m36197S();
                String m36216z = c8421y1.m36216z();
                if (m36197S != null) {
                    for (C8226l1 c8226l1 : m36197S) {
                        if (c8226l1 != null) {
                            m38452p(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c8226l1.m35566z()) {
                                m38455s(sb2, 2, "audience_id", Integer.valueOf(c8226l1.m35560A()));
                            }
                            if (c8226l1.m35564F()) {
                                m38455s(sb2, 2, "new_audience", Boolean.valueOf(c8226l1.m35565G()));
                            }
                            m38454r(sb2, 2, "current_data", c8226l1.m35561C(), m36216z);
                            if (c8226l1.m35562D()) {
                                m38454r(sb2, 2, "previous_data", c8226l1.m35563E(), m36216z);
                            }
                            m38452p(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C8301q1> m36209s1 = c8421y1.m36209s1();
                if (m36209s1 != null) {
                    for (C8301q1 c8301q1 : m36209s1) {
                        if (c8301q1 != null) {
                            m38452p(sb2, 2);
                            sb2.append("event {\n");
                            m38455s(sb2, 2, "name", this.f41723a.m37766H().m38231p(c8301q1.m35703D()));
                            if (c8301q1.m35704E()) {
                                m38455s(sb2, 2, "timestamp_millis", Long.valueOf(c8301q1.m35705F()));
                            }
                            if (c8301q1.m35706G()) {
                                m38455s(sb2, 2, "previous_timestamp_millis", Long.valueOf(c8301q1.m35707H()));
                            }
                            if (c8301q1.m35708I()) {
                                m38455s(sb2, 2, "count", Integer.valueOf(c8301q1.m35709J()));
                            }
                            if (c8301q1.m35701A() != 0) {
                                m38462n(sb2, 2, c8301q1.m35711z());
                            }
                            m38452p(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                m38452p(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* renamed from: y */
    public final String m38468y(C8195j0 c8195j0) {
        if (c8195j0 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (c8195j0.m35488z()) {
            m38455s(sb2, 0, "filter_id", Integer.valueOf(c8195j0.m35477A()));
        }
        m38455s(sb2, 0, "event_name", this.f41723a.m37766H().m38231p(c8195j0.m35478C()));
        String m38453q = m38453q(c8195j0.m35484I(), c8195j0.m35485J(), c8195j0.m35487L());
        if (!m38453q.isEmpty()) {
            m38455s(sb2, 0, "filter_type", m38453q);
        }
        if (c8195j0.m35482G()) {
            m38456t(sb2, 1, "event_count_filter", c8195j0.m35483H());
        }
        if (c8195j0.m35480E() > 0) {
            sb2.append("  filters {\n");
            Iterator<C8225l0> it = c8195j0.m35479D().iterator();
            while (it.hasNext()) {
                m38463o(sb2, 2, it.next());
            }
        }
        m38452p(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* renamed from: z */
    public final String m38469z(C8345t0 c8345t0) {
        if (c8345t0 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (c8345t0.m35798z()) {
            m38455s(sb2, 0, "filter_id", Integer.valueOf(c8345t0.m35791A()));
        }
        m38455s(sb2, 0, "property_name", this.f41723a.m37766H().m38233r(c8345t0.m35792C()));
        String m38453q = m38453q(c8345t0.m35794E(), c8345t0.m35795F(), c8345t0.m35797H());
        if (!m38453q.isEmpty()) {
            m38455s(sb2, 0, "filter_type", m38453q);
        }
        m38463o(sb2, 1, c8345t0.m35793D());
        sb2.append("}\n");
        return sb2.toString();
    }
}
