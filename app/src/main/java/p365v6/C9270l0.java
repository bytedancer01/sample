package p365v6;

import android.annotation.SuppressLint;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import ec.C4701d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p182k7.C5521l;
import p267p6.C7583h;
import p365v6.C9273n;
import p365v6.InterfaceC9260g0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/l0.class
 */
/* renamed from: v6.l0 */
/* loaded from: combined.jar:classes2.jar:v6/l0.class */
public final class C9270l0 implements InterfaceC9260g0 {

    /* renamed from: d */
    public static final InterfaceC9260g0.c f42343d = new InterfaceC9260g0.c() { // from class: v6.j0
        @Override // p365v6.InterfaceC9260g0.c
        /* renamed from: a */
        public final InterfaceC9260g0 mo39033a(UUID uuid) {
            InterfaceC9260g0 m39125y;
            m39125y = C9270l0.m39125y(uuid);
            return m39125y;
        }
    };

    /* renamed from: a */
    public final UUID f42344a;

    /* renamed from: b */
    public final MediaDrm f42345b;

    /* renamed from: c */
    public int f42346c;

    public C9270l0(UUID uuid) {
        C4349a.m21882e(uuid);
        C4349a.m21879b(!C7583h.f36777b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f42344a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m39120r(uuid));
        this.f42345b = mediaDrm;
        this.f42346c = 1;
        if (C7583h.f36779d.equals(uuid) && m39126z()) {
            m39121t(mediaDrm);
        }
    }

    /* renamed from: A */
    public static C9270l0 m39113A(UUID uuid) {
        try {
            return new C9270l0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new C9282r0(1, e10);
        } catch (Exception e11) {
            throw new C9282r0(2, e11);
        }
    }

    /* renamed from: n */
    public static byte[] m39116n(byte[] bArr) {
        C4361f0 c4361f0 = new C4361f0(bArr);
        int m22001q = c4361f0.m22001q();
        short m22003s = c4361f0.m22003s();
        short m22003s2 = c4361f0.m22003s();
        if (m22003s != 1 || m22003s2 != 1) {
            C4392v.m22273g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short m22003s3 = c4361f0.m22003s();
        Charset charset = C4701d.f27719e;
        String m21969B = c4361f0.m21969B(m22003s3, charset);
        if (m21969B.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = m21969B.indexOf("</DATA>");
        if (indexOf == -1) {
            C4392v.m22275i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = m21969B.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + m21969B.substring(indexOf);
        int i10 = m22001q + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i10);
        allocate.putShort(m22003s);
        allocate.putShort(m22003s2);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    /* renamed from: o */
    public static byte[] m39117o(UUID uuid, byte[] bArr) {
        return C7583h.f36778c.equals(uuid) ? C9247a.m39001a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if ("AFTT".equals(r0) == false) goto L29;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m39118p(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = p267p6.C7583h.f36780e
            r6 = r0
            r0 = r4
            r5 = r0
            r0 = r6
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            r0 = r4
            r1 = r3
            byte[] r0 = p182k7.C5521l.m27474e(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1b
            goto L1d
        L1b:
            r0 = r5
            r4 = r0
        L1d:
            r0 = r6
            r1 = r4
            byte[] r1 = m39116n(r1)
            byte[] r0 = p182k7.C5521l.m27470a(r0, r1)
            r5 = r0
        L26:
            int r0 = p059d9.C4401z0.f26679a
            r1 = 23
            if (r0 >= r1) goto L38
            java.util.UUID r0 = p267p6.C7583h.f36779d
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L73
        L38:
            r0 = r6
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = p059d9.C4401z0.f26681c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7f
            java.lang.String r0 = p059d9.C4401z0.f26682d
            r4 = r0
            java.lang.String r0 = "AFTB"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L73
            java.lang.String r0 = "AFTS"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L73
            java.lang.String r0 = "AFTM"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L73
            java.lang.String r0 = "AFTT"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7f
        L73:
            r0 = r5
            r1 = r3
            byte[] r0 = p182k7.C5521l.m27474e(r0, r1)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L7f
            r0 = r3
            return r0
        L7f:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p365v6.C9270l0.m39118p(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: q */
    public static String m39119q(UUID uuid, String str) {
        return (C4401z0.f26679a < 26 && C7583h.f36778c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    /* renamed from: r */
    public static UUID m39120r(UUID uuid) {
        UUID uuid2 = uuid;
        if (C4401z0.f26679a < 27) {
            uuid2 = uuid;
            if (C7583h.f36778c.equals(uuid)) {
                uuid2 = C7583h.f36777b;
            }
        }
        return uuid2;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: t */
    public static void m39121t(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: v */
    public static C9273n.b m39122v(UUID uuid, List<C9273n.b> list) {
        boolean z10;
        if (C7583h.f36779d.equals(uuid)) {
            if (C4401z0.f26679a >= 28 && list.size() > 1) {
                C9273n.b bVar = list.get(0);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C9273n.b bVar2 = list.get(i11);
                    byte[] bArr = (byte[]) C4349a.m21882e(bVar2.f42364f);
                    if (!C4401z0.m22371c(bVar2.f42363e, bVar.f42363e) || !C4401z0.m22371c(bVar2.f42362d, bVar.f42362d) || !C5521l.m27472c(bArr)) {
                        z10 = false;
                        break;
                    }
                    i10 += bArr.length;
                }
                z10 = true;
                if (z10) {
                    byte[] bArr2 = new byte[i10];
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        byte[] bArr3 = (byte[]) C4349a.m21882e(list.get(i13).f42364f);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i12, length);
                        i12 += length;
                    }
                    return bVar.m39144c(bArr2);
                }
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                C9273n.b bVar3 = list.get(i14);
                int m27476g = C5521l.m27476g((byte[]) C4349a.m21882e(bVar3.f42364f));
                int i15 = C4401z0.f26679a;
                if (i15 < 23 && m27476g == 0) {
                    return bVar3;
                }
                if (i15 >= 23 && m27476g == 1) {
                    return bVar3;
                }
            }
        }
        return list.get(0);
    }

    /* renamed from: w */
    public static boolean m39123w(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(m39120r(uuid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m39124x(InterfaceC9260g0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.mo39032a(this, bArr, i10, i11, bArr2);
    }

    /* renamed from: y */
    public static /* synthetic */ InterfaceC9260g0 m39125y(UUID uuid) {
        try {
            return m39113A(uuid);
        } catch (C9282r0 e10) {
            C4392v.m22270d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + InstructionFileId.DOT);
            return new C9256e0();
        }
    }

    /* renamed from: z */
    public static boolean m39126z() {
        return "ASUS_Z00AD".equals(C4401z0.f26682d);
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: a */
    public Class<C9262h0> mo39012a() {
        return C9262h0.class;
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: b */
    public Map<String, String> mo39013b(byte[] bArr) {
        return this.f42345b.queryKeyStatus(bArr);
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: d */
    public InterfaceC9260g0.d mo39015d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f42345b.getProvisionRequest();
        return new InterfaceC9260g0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: e */
    public byte[] mo39016e() {
        return this.f42345b.openSession();
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: f */
    public void mo39017f(byte[] bArr, byte[] bArr2) {
        this.f42345b.restoreKeys(bArr, bArr2);
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: g */
    public void mo39018g(final InterfaceC9260g0.b bVar) {
        this.f42345b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener(this, bVar) { // from class: v6.k0

            /* renamed from: a */
            public final C9270l0 f42340a;

            /* renamed from: b */
            public final InterfaceC9260g0.b f42341b;

            {
                this.f42340a = this;
                this.f42341b = bVar;
            }

            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                this.f42340a.m39124x(this.f42341b, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: h */
    public void mo39019h(byte[] bArr) {
        this.f42345b.provideProvisionResponse(bArr);
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: i */
    public void mo39020i(byte[] bArr) {
        this.f42345b.closeSession(bArr);
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: j */
    public byte[] mo39021j(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2;
        if (C7583h.f36778c.equals(this.f42344a)) {
            bArr3 = C9247a.m39002b(bArr2);
        }
        return this.f42345b.provideKeyResponse(bArr, bArr3);
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: k */
    public InterfaceC9260g0.a mo39022k(byte[] bArr, List<C9273n.b> list, int i10, HashMap<String, String> hashMap) {
        byte[] bArr2;
        String str;
        C9273n.b bVar;
        int i11;
        int requestType;
        if (list != null) {
            bVar = m39122v(this.f42344a, list);
            bArr2 = m39118p(this.f42344a, (byte[]) C4349a.m21882e(bVar.f42364f));
            str = m39119q(this.f42344a, bVar.f42363e);
        } else {
            bArr2 = null;
            str = null;
            bVar = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f42345b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] m39117o = m39117o(this.f42344a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        String str2 = defaultUrl;
        if ("https://x".equals(defaultUrl)) {
            str2 = "";
        }
        String str3 = str2;
        if (TextUtils.isEmpty(str2)) {
            str3 = str2;
            if (bVar != null) {
                str3 = str2;
                if (!TextUtils.isEmpty(bVar.f42362d)) {
                    str3 = bVar.f42362d;
                }
            }
        }
        if (C4401z0.f26679a >= 23) {
            requestType = keyRequest.getRequestType();
            i11 = requestType;
        } else {
            i11 = Integer.MIN_VALUE;
        }
        return new InterfaceC9260g0.a(m39117o, str3, i11);
    }

    @Override // p365v6.InterfaceC9260g0
    public void release() {
        synchronized (this) {
            int i10 = this.f42346c - 1;
            this.f42346c = i10;
            if (i10 == 0) {
                this.f42345b.release();
            }
        }
    }

    @Override // p365v6.InterfaceC9260g0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C9262h0 mo39014c(byte[] bArr) {
        return new C9262h0(m39120r(this.f42344a), bArr, C4401z0.f26679a < 21 && C7583h.f36779d.equals(this.f42344a) && "L3".equals(m39128u("securityLevel")));
    }

    /* renamed from: u */
    public String m39128u(String str) {
        return this.f42345b.getPropertyString(str);
    }
}
