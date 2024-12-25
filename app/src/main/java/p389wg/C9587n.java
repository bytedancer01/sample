package p389wg;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import org.jsoup.parser.CharacterReader;
import p389wg.InterfaceC9575b;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.C9765i;
import p411xi.C9772p;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import p411xi.InterfaceC9782z;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/n.class
 */
/* renamed from: wg.n */
/* loaded from: combined.jar:classes2.jar:wg/n.class */
public final class C9587n implements InterfaceC9590q {

    /* renamed from: a */
    public static final byte[] f43663a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/n$a.class
     */
    /* renamed from: wg.n$a */
    /* loaded from: combined.jar:classes2.jar:wg/n$a.class */
    public static final class a implements InterfaceC9575b {

        /* renamed from: b */
        public final InterfaceC9763g f43664b;

        /* renamed from: c */
        public final boolean f43665c;

        /* renamed from: d */
        public final C9583j f43666d;

        public a(InterfaceC9763g interfaceC9763g, boolean z10) {
            this.f43664b = interfaceC9763g;
            this.f43666d = new C9583j(interfaceC9763g);
            this.f43665c = z10;
        }

        /* renamed from: f */
        public static IOException m40293f(String str, Object... objArr) {
            throw new IOException(String.format(str, objArr));
        }

        @Override // p389wg.InterfaceC9575b
        /* renamed from: U */
        public void mo40180U() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f43666d.m40270c();
        }

        /* renamed from: l */
        public final void m40294l(InterfaceC9575b.a aVar, int i10, int i11) {
            if (i11 != 8) {
                throw m40293f("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i11));
            }
            int readInt = this.f43664b.readInt();
            int readInt2 = this.f43664b.readInt();
            EnumC9574a fromSpdyGoAway = EnumC9574a.fromSpdyGoAway(readInt2);
            if (fromSpdyGoAway == null) {
                throw m40293f("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            aVar.mo40190i(readInt & Integer.MAX_VALUE, fromSpdyGoAway, C9764h.f44530e);
        }

        @Override // p389wg.InterfaceC9575b
        /* renamed from: n */
        public boolean mo40181n(InterfaceC9575b.a aVar) {
            boolean z10 = false;
            try {
                int readInt = this.f43664b.readInt();
                int readInt2 = this.f43664b.readInt();
                boolean z11 = (Integer.MIN_VALUE & readInt) != 0;
                int i10 = ((-16777216) & readInt2) >>> 24;
                int i11 = readInt2 & 16777215;
                if (!z11) {
                    if ((i10 & 1) != 0) {
                        z10 = true;
                    }
                    aVar.mo40188g(z10, readInt & Integer.MAX_VALUE, this.f43664b, i11);
                    return true;
                }
                int i12 = (2147418112 & readInt) >>> 16;
                if (i12 != 3) {
                    throw new ProtocolException("version != 3: " + i12);
                }
                switch (readInt & CharacterReader.EOF) {
                    case 1:
                        m40300w(aVar, i10, i11);
                        return true;
                    case 2:
                        m40299v(aVar, i10, i11);
                        return true;
                    case 3:
                        m40297q(aVar, i10, i11);
                        return true;
                    case 4:
                        m40298t(aVar, i10, i11);
                        return true;
                    case 5:
                    default:
                        this.f43664b.skip(i11);
                        return true;
                    case 6:
                        m40296p(aVar, i10, i11);
                        return true;
                    case 7:
                        m40294l(aVar, i10, i11);
                        return true;
                    case 8:
                        m40295o(aVar, i10, i11);
                        return true;
                    case 9:
                        m40301y(aVar, i10, i11);
                        return true;
                }
            } catch (IOException e10) {
                return false;
            }
        }

        /* renamed from: o */
        public final void m40295o(InterfaceC9575b.a aVar, int i10, int i11) {
            aVar.mo40191j(false, false, this.f43664b.readInt() & Integer.MAX_VALUE, -1, this.f43666d.m40273f(i11 - 4), EnumC9578e.SPDY_HEADERS);
        }

        /* renamed from: p */
        public final void m40296p(InterfaceC9575b.a aVar, int i10, int i11) {
            if (i11 != 4) {
                throw m40293f("TYPE_PING length: %d != 4", Integer.valueOf(i11));
            }
            int readInt = this.f43664b.readInt();
            aVar.mo40184c(this.f43665c == ((readInt & 1) == 1), readInt, 0);
        }

        /* renamed from: q */
        public final void m40297q(InterfaceC9575b.a aVar, int i10, int i11) {
            if (i11 != 8) {
                throw m40293f("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i11));
            }
            int readInt = this.f43664b.readInt();
            int readInt2 = this.f43664b.readInt();
            EnumC9574a fromSpdy3Rst = EnumC9574a.fromSpdy3Rst(readInt2);
            if (fromSpdy3Rst == null) {
                throw m40293f("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
            }
            aVar.mo40185d(readInt & Integer.MAX_VALUE, fromSpdy3Rst);
        }

        /* renamed from: t */
        public final void m40298t(InterfaceC9575b.a aVar, int i10, int i11) {
            int readInt = this.f43664b.readInt();
            if (i11 != (readInt * 8) + 4) {
                throw m40293f("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i11), Integer.valueOf(readInt));
            }
            C9586m c9586m = new C9586m();
            for (int i12 = 0; i12 < readInt; i12++) {
                int readInt2 = this.f43664b.readInt();
                c9586m.m40291k(readInt2 & 16777215, ((-16777216) & readInt2) >>> 24, this.f43664b.readInt());
            }
            aVar.mo40189h((i10 & 1) != 0, c9586m);
        }

        /* renamed from: v */
        public final void m40299v(InterfaceC9575b.a aVar, int i10, int i11) {
            int readInt = this.f43664b.readInt();
            aVar.mo40191j(false, (i10 & 1) != 0, readInt & Integer.MAX_VALUE, -1, this.f43666d.m40273f(i11 - 4), EnumC9578e.SPDY_REPLY);
        }

        /* renamed from: w */
        public final void m40300w(InterfaceC9575b.a aVar, int i10, int i11) {
            int readInt = this.f43664b.readInt();
            int readInt2 = this.f43664b.readInt();
            this.f43664b.readShort();
            List<C9577d> m40273f = this.f43666d.m40273f(i11 - 10);
            aVar.mo40191j((i10 & 2) != 0, (i10 & 1) != 0, readInt & Integer.MAX_VALUE, readInt2 & Integer.MAX_VALUE, m40273f, EnumC9578e.SPDY_SYN_STREAM);
        }

        /* renamed from: y */
        public final void m40301y(InterfaceC9575b.a aVar, int i10, int i11) {
            if (i11 != 8) {
                throw m40293f("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i11));
            }
            int readInt = this.f43664b.readInt();
            long readInt2 = this.f43664b.readInt() & Integer.MAX_VALUE;
            if (readInt2 == 0) {
                throw m40293f("windowSizeIncrement was 0", Long.valueOf(readInt2));
            }
            aVar.mo40182a(readInt & Integer.MAX_VALUE, readInt2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/n$b.class
     */
    /* renamed from: wg.n$b */
    /* loaded from: combined.jar:classes2.jar:wg/n$b.class */
    public static final class b implements InterfaceC9576c {

        /* renamed from: b */
        public final InterfaceC9762f f43667b;

        /* renamed from: c */
        public final C9761e f43668c;

        /* renamed from: d */
        public final InterfaceC9762f f43669d;

        /* renamed from: e */
        public final boolean f43670e;

        /* renamed from: f */
        public boolean f43671f;

        public b(InterfaceC9762f interfaceC9762f, boolean z10) {
            this.f43667b = interfaceC9762f;
            this.f43670e = z10;
            Deflater deflater = new Deflater();
            deflater.setDictionary(C9587n.f43663a);
            C9761e c9761e = new C9761e();
            this.f43668c = c9761e;
            this.f43669d = C9772p.m41228b(new C9765i((InterfaceC9782z) c9761e, deflater));
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: J */
        public void mo40192J() {
            synchronized (this) {
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: a */
        public void mo40193a(int i10, long j10) {
            synchronized (this) {
                if (this.f43671f) {
                    throw new IOException("closed");
                }
                if (j10 == 0 || j10 > 2147483647L) {
                    throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j10);
                }
                this.f43667b.writeInt(-2147287031);
                this.f43667b.writeInt(8);
                this.f43667b.writeInt(i10);
                this.f43667b.writeInt((int) j10);
                this.f43667b.flush();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: a0 */
        public int mo40194a0() {
            return 16383;
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: b */
        public void mo40195b(int i10, int i11, List<C9577d> list) {
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: c */
        public void mo40196c(boolean z10, int i10, int i11) {
            synchronized (this) {
                if (this.f43671f) {
                    throw new IOException("closed");
                }
                boolean z11 = false;
                if (this.f43670e != ((i10 & 1) == 1)) {
                    z11 = true;
                }
                if (z10 != z11) {
                    throw new IllegalArgumentException("payload != reply");
                }
                this.f43667b.writeInt(-2147287034);
                this.f43667b.writeInt(4);
                this.f43667b.writeInt(i10);
                this.f43667b.flush();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this) {
                this.f43671f = true;
                C9183h.m38682b(this.f43667b, this.f43669d);
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: d */
        public void mo40197d(int i10, EnumC9574a enumC9574a) {
            synchronized (this) {
                if (this.f43671f) {
                    throw new IOException("closed");
                }
                if (enumC9574a.spdyRstCode == -1) {
                    throw new IllegalArgumentException();
                }
                this.f43667b.writeInt(-2147287037);
                this.f43667b.writeInt(8);
                this.f43667b.writeInt(i10 & Integer.MAX_VALUE);
                this.f43667b.writeInt(enumC9574a.spdyRstCode);
                this.f43667b.flush();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: e */
        public void mo40198e(C9586m c9586m) {
        }

        /* renamed from: f */
        public void m40302f(int i10, int i11, C9761e c9761e, int i12) {
            if (this.f43671f) {
                throw new IOException("closed");
            }
            long j10 = i12;
            if (j10 > 16777215) {
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i12);
            }
            this.f43667b.writeInt(i10 & Integer.MAX_VALUE);
            this.f43667b.writeInt(((i11 & 255) << 24) | (16777215 & i12));
            if (i12 > 0) {
                this.f43667b.mo32031h(c9761e, j10);
            }
        }

        @Override // p389wg.InterfaceC9576c
        public void flush() {
            synchronized (this) {
                if (this.f43671f) {
                    throw new IOException("closed");
                }
                this.f43667b.flush();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: g */
        public void mo40199g(C9586m c9586m) {
            synchronized (this) {
                if (this.f43671f) {
                    throw new IOException("closed");
                }
                int m40292l = c9586m.m40292l();
                this.f43667b.writeInt(-2147287036);
                this.f43667b.writeInt((((m40292l * 8) + 4) & 16777215) | 0);
                this.f43667b.writeInt(m40292l);
                for (int i10 = 0; i10 <= 10; i10++) {
                    if (c9586m.m40288h(i10)) {
                        this.f43667b.writeInt(((c9586m.m40282b(i10) & 255) << 24) | (i10 & 16777215));
                        this.f43667b.writeInt(c9586m.m40283c(i10));
                    }
                }
                this.f43667b.flush();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: j */
        public void mo40200j(boolean z10, int i10, C9761e c9761e, int i11) {
            synchronized (this) {
                m40302f(i10, z10 ? 1 : 0, c9761e, i11);
            }
        }

        /* renamed from: l */
        public final void m40303l(List<C9577d> list) {
            if (this.f43668c.size() != 0) {
                throw new IllegalStateException();
            }
            this.f43669d.writeInt(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C9764h c9764h = list.get(i10).f43608a;
                this.f43669d.writeInt(c9764h.size());
                this.f43669d.mo41162i0(c9764h);
                C9764h c9764h2 = list.get(i10).f43609b;
                this.f43669d.writeInt(c9764h2.size());
                this.f43669d.mo41162i0(c9764h2);
            }
            this.f43669d.flush();
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: x0 */
        public void mo40201x0(boolean z10, boolean z11, int i10, int i11, List<C9577d> list) {
            synchronized (this) {
                if (this.f43671f) {
                    throw new IOException("closed");
                }
                m40303l(list);
                int size = (int) (this.f43668c.size() + 10);
                int i12 = z11 ? 2 : 0;
                this.f43667b.writeInt(-2147287039);
                this.f43667b.writeInt(((((z10 ? 1 : 0) | i12) & 255) << 24) | (size & 16777215));
                this.f43667b.writeInt(i10 & Integer.MAX_VALUE);
                this.f43667b.writeInt(Integer.MAX_VALUE & i11);
                this.f43667b.writeShort(0);
                this.f43667b.mo41127I(this.f43668c);
                this.f43667b.flush();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: y0 */
        public void mo40202y0(int i10, EnumC9574a enumC9574a, byte[] bArr) {
            synchronized (this) {
                if (this.f43671f) {
                    throw new IOException("closed");
                }
                if (enumC9574a.spdyGoAwayCode == -1) {
                    throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
                }
                this.f43667b.writeInt(-2147287033);
                this.f43667b.writeInt(8);
                this.f43667b.writeInt(i10);
                this.f43667b.writeInt(enumC9574a.spdyGoAwayCode);
                this.f43667b.flush();
            }
        }
    }

    static {
        try {
            f43663a = "������\u0007options������\u0004head������\u0004post������\u0003put������\u0006delete������\u0005trace������\u0006accept������\u000eaccept-charset������\u000faccept-encoding������\u000faccept-language������\raccept-ranges������\u0003age������\u0005allow������\rauthorization������\rcache-control������\nconnection������\fcontent-base������\u0010content-encoding������\u0010content-language������\u000econtent-length������\u0010content-location������\u000bcontent-md5������\rcontent-range������\fcontent-type������\u0004date������\u0004etag������\u0006expect������\u0007expires������\u0004from������\u0004host������\bif-match������\u0011if-modified-since������\rif-none-match������\bif-range������\u0013if-unmodified-since������\rlast-modified������\blocation������\fmax-forwards������\u0006pragma������\u0012proxy-authenticate������\u0013proxy-authorization������\u0005range������\u0007referer������\u000bretry-after������\u0006server������\u0002te������\u0007trailer������\u0011transfer-encoding������\u0007upgrade������\nuser-agent������\u0004vary������\u0003via������\u0007warning������\u0010www-authenticate������\u0006method������\u0003get������\u0006status������\u0006200 OK������\u0007version������\bHTTP/1.1������\u0003url������\u0006public������\nset-cookie������\nkeep-alive������\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(C9183h.f42015d.name());
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError();
        }
    }

    @Override // p389wg.InterfaceC9590q
    /* renamed from: a */
    public InterfaceC9575b mo40240a(InterfaceC9763g interfaceC9763g, boolean z10) {
        return new a(interfaceC9763g, z10);
    }

    @Override // p389wg.InterfaceC9590q
    /* renamed from: b */
    public InterfaceC9576c mo40241b(InterfaceC9762f interfaceC9762f, boolean z10) {
        return new b(interfaceC9762f, z10);
    }
}
