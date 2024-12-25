package p389wg;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p389wg.C9579f;
import p389wg.InterfaceC9575b;
import p411xi.C9758c0;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import ug.AbstractC9177b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/g.class
 */
/* renamed from: wg.g */
/* loaded from: combined.jar:classes2.jar:wg/g.class */
public final class C9580g implements InterfaceC9590q {

    /* renamed from: a */
    public static final C9764h f43622a = C9764h.m41183h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/g$a.class
     */
    /* renamed from: wg.g$a */
    /* loaded from: combined.jar:classes2.jar:wg/g$a.class */
    public static final class a implements InterfaceC9756b0 {

        /* renamed from: b */
        public final InterfaceC9763g f43623b;

        /* renamed from: c */
        public int f43624c;

        /* renamed from: d */
        public byte f43625d;

        /* renamed from: e */
        public int f43626e;

        /* renamed from: f */
        public int f43627f;

        /* renamed from: g */
        public short f43628g;

        public a(InterfaceC9763g interfaceC9763g) {
            this.f43623b = interfaceC9763g;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: f */
        public final void m40242f() {
            int i10 = this.f43626e;
            int m40238l = C9580g.m40238l(this.f43623b);
            this.f43627f = m40238l;
            this.f43624c = m40238l;
            byte readByte = (byte) (this.f43623b.readByte() & 255);
            this.f43625d = (byte) (this.f43623b.readByte() & 255);
            Logger logger = AbstractC9177b.f41992a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.m40244b(true, this.f43626e, this.f43624c, readByte, this.f43625d));
            }
            int readInt = this.f43623b.readInt() & Integer.MAX_VALUE;
            this.f43626e = readInt;
            if (readByte != 9) {
                throw C9580g.m40236j("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i10) {
                throw C9580g.m40236j("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // p411xi.InterfaceC9756b0
        public C9758c0 timeout() {
            return this.f43623b.timeout();
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(C9761e c9761e, long j10) {
            while (true) {
                int i10 = this.f43627f;
                if (i10 != 0) {
                    long mo22901x = this.f43623b.mo22901x(c9761e, Math.min(j10, i10));
                    if (mo22901x == -1) {
                        return -1L;
                    }
                    this.f43627f = (int) (this.f43627f - mo22901x);
                    return mo22901x;
                }
                this.f43623b.skip(this.f43628g);
                this.f43628g = (short) 0;
                if ((this.f43625d & 4) != 0) {
                    return -1L;
                }
                m40242f();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/g$b.class
     */
    /* renamed from: wg.g$b */
    /* loaded from: combined.jar:classes2.jar:wg/g$b.class */
    public static final class b {

        /* renamed from: a */
        public static final String[] f43629a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        public static final String[] f43630b = new String[64];

        /* renamed from: c */
        public static final String[] f43631c = new String[256];

        static {
            int i10;
            int i11 = 0;
            while (true) {
                String[] strArr = f43631c;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
                i11++;
            }
            String[] strArr2 = f43630b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i12 = 0; i12 < 1; i12++) {
                int i13 = iArr[i12];
                String[] strArr3 = f43630b;
                strArr3[i13 | 8] = strArr3[i13] + "|PADDED";
            }
            String[] strArr4 = f43630b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int i14 = 0;
            while (true) {
                i10 = 0;
                if (i14 >= 3) {
                    break;
                }
                int i15 = new int[]{4, 32, 36}[i14];
                for (int i16 = 0; i16 < 1; i16++) {
                    int i17 = iArr[i16];
                    String[] strArr5 = f43630b;
                    int i18 = i17 | i15;
                    strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                    strArr5[i18 | 8] = strArr5[i17] + '|' + strArr5[i15] + "|PADDED";
                }
                i14++;
            }
            while (true) {
                String[] strArr6 = f43630b;
                if (i10 >= strArr6.length) {
                    return;
                }
                if (strArr6[i10] == null) {
                    strArr6[i10] = f43631c[i10];
                }
                i10++;
            }
        }

        /* renamed from: a */
        public static String m40243a(byte b10, byte b11) {
            if (b11 == 0) {
                return "";
            }
            if (b10 != 2 && b10 != 3) {
                if (b10 == 4 || b10 == 6) {
                    return b11 == 1 ? "ACK" : f43631c[b11];
                }
                if (b10 != 7 && b10 != 8) {
                    String[] strArr = f43630b;
                    String str = b11 < strArr.length ? strArr[b11] : f43631c[b11];
                    return (b10 != 5 || (b11 & 4) == 0) ? (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f43631c[b11];
        }

        /* renamed from: b */
        public static String m40244b(boolean z10, int i10, int i11, byte b10, byte b11) {
            String[] strArr = f43629a;
            return String.format("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b10 < strArr.length ? strArr[b10] : String.format("0x%02x", Byte.valueOf(b10)), m40243a(b10, b11));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/g$c.class
     */
    /* renamed from: wg.g$c */
    /* loaded from: combined.jar:classes2.jar:wg/g$c.class */
    public static final class c implements InterfaceC9575b {

        /* renamed from: b */
        public final InterfaceC9763g f43632b;

        /* renamed from: c */
        public final a f43633c;

        /* renamed from: d */
        public final boolean f43634d;

        /* renamed from: e */
        public final C9579f.a f43635e;

        public c(InterfaceC9763g interfaceC9763g, int i10, boolean z10) {
            this.f43632b = interfaceC9763g;
            this.f43634d = z10;
            a aVar = new a(interfaceC9763g);
            this.f43633c = aVar;
            this.f43635e = new C9579f.a(i10, aVar);
        }

        /* renamed from: B */
        public final void m40245B(InterfaceC9575b.a aVar, int i10, byte b10, int i11) {
            if (i11 != 0) {
                throw C9580g.m40236j("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b10 & 1) != 0) {
                if (i10 != 0) {
                    throw C9580g.m40236j("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.mo40186e();
                return;
            }
            if (i10 % 6 != 0) {
                throw C9580g.m40236j("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            }
            C9586m c9586m = new C9586m();
            for (int i12 = 0; i12 < i10; i12 += 6) {
                short readShort = this.f43632b.readShort();
                int readInt = this.f43632b.readInt();
                short s10 = readShort;
                switch (readShort) {
                    case 1:
                    case 6:
                        break;
                    case 2:
                        s10 = readShort;
                        if (readInt != 0) {
                            if (readInt != 1) {
                                throw C9580g.m40236j("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                            s10 = readShort;
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        s10 = 4;
                        break;
                    case 4:
                        s10 = 7;
                        if (readInt < 0) {
                            throw C9580g.m40236j("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        break;
                    case 5:
                        if (readInt < 16384 || readInt > 16777215) {
                            throw C9580g.m40236j("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        }
                        s10 = readShort;
                        break;
                    default:
                        throw C9580g.m40236j("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(readShort));
                }
                c9586m.m40291k(s10, 0, readInt);
            }
            aVar.mo40189h(false, c9586m);
            if (c9586m.m40284d() >= 0) {
                this.f43635e.m40216i(c9586m.m40284d());
            }
        }

        @Override // p389wg.InterfaceC9575b
        /* renamed from: U */
        public void mo40180U() {
            if (this.f43634d) {
                return;
            }
            C9764h mo41159g0 = this.f43632b.mo41159g0(C9580g.f43622a.size());
            Logger logger = AbstractC9177b.f41992a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("<< CONNECTION %s", mo41159g0.mo41198p()));
            }
            if (!C9580g.f43622a.equals(mo41159g0)) {
                throw C9580g.m40236j("Expected a connection header but was %s", mo41159g0.m41188D());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f43632b.close();
        }

        /* renamed from: f */
        public final void m40246f(InterfaceC9575b.a aVar, int i10, byte b10, int i11) {
            boolean z10 = true;
            short s10 = 0;
            boolean z11 = (b10 & 1) != 0;
            if ((b10 & 32) == 0) {
                z10 = false;
            }
            if (z10) {
                throw C9580g.m40236j("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            if ((b10 & 8) != 0) {
                s10 = (short) (this.f43632b.readByte() & 255);
            }
            aVar.mo40188g(z11, i11, this.f43632b, C9580g.m40237k(i10, b10, s10));
            this.f43632b.skip(s10);
        }

        /* renamed from: l */
        public final void m40247l(InterfaceC9575b.a aVar, int i10, byte b10, int i11) {
            if (i10 < 8) {
                throw C9580g.m40236j("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw C9580g.m40236j("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int readInt = this.f43632b.readInt();
            int readInt2 = this.f43632b.readInt();
            int i12 = i10 - 8;
            EnumC9574a fromHttp2 = EnumC9574a.fromHttp2(readInt2);
            if (fromHttp2 == null) {
                throw C9580g.m40236j("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            C9764h c9764h = C9764h.f44530e;
            if (i12 > 0) {
                c9764h = this.f43632b.mo41159g0(i12);
            }
            aVar.mo40190i(readInt, fromHttp2, c9764h);
        }

        @Override // p389wg.InterfaceC9575b
        /* renamed from: n */
        public boolean mo40181n(InterfaceC9575b.a aVar) {
            try {
                this.f43632b.mo41151b0(9L);
                int m40238l = C9580g.m40238l(this.f43632b);
                if (m40238l < 0 || m40238l > 16384) {
                    throw C9580g.m40236j("FRAME_SIZE_ERROR: %s", Integer.valueOf(m40238l));
                }
                byte readByte = (byte) (this.f43632b.readByte() & 255);
                byte readByte2 = (byte) (this.f43632b.readByte() & 255);
                int readInt = this.f43632b.readInt() & Integer.MAX_VALUE;
                Logger logger = AbstractC9177b.f41992a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(b.m40244b(true, readInt, m40238l, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m40246f(aVar, m40238l, readByte2, readInt);
                        return true;
                    case 1:
                        m40250p(aVar, m40238l, readByte2, readInt);
                        return true;
                    case 2:
                        m40253v(aVar, m40238l, readByte2, readInt);
                        return true;
                    case 3:
                        m40255y(aVar, m40238l, readByte2, readInt);
                        return true;
                    case 4:
                        m40245B(aVar, m40238l, readByte2, readInt);
                        return true;
                    case 5:
                        m40254w(aVar, m40238l, readByte2, readInt);
                        return true;
                    case 6:
                        m40251q(aVar, m40238l, readByte2, readInt);
                        return true;
                    case 7:
                        m40247l(aVar, m40238l, readByte2, readInt);
                        return true;
                    case 8:
                        m40249o0(aVar, m40238l, readByte2, readInt);
                        return true;
                    default:
                        this.f43632b.skip(m40238l);
                        return true;
                }
            } catch (IOException e10) {
                return false;
            }
        }

        /* renamed from: o */
        public final List<C9577d> m40248o(int i10, short s10, byte b10, int i11) {
            a aVar = this.f43633c;
            aVar.f43627f = i10;
            aVar.f43624c = i10;
            aVar.f43628g = s10;
            aVar.f43625d = b10;
            aVar.f43626e = i11;
            this.f43635e.m40219l();
            return this.f43635e.m40211d();
        }

        /* renamed from: o0 */
        public final void m40249o0(InterfaceC9575b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 4) {
                throw C9580g.m40236j("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
            }
            long readInt = this.f43632b.readInt() & 2147483647L;
            if (readInt == 0) {
                throw C9580g.m40236j("windowSizeIncrement was 0", Long.valueOf(readInt));
            }
            aVar.mo40182a(i11, readInt);
        }

        /* renamed from: p */
        public final void m40250p(InterfaceC9575b.a aVar, int i10, byte b10, int i11) {
            short s10 = 0;
            if (i11 == 0) {
                throw C9580g.m40236j("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z10 = (b10 & 1) != 0;
            if ((b10 & 8) != 0) {
                s10 = (short) (this.f43632b.readByte() & 255);
            }
            int i12 = i10;
            if ((b10 & 32) != 0) {
                m40252t(aVar, i11);
                i12 = i10 - 5;
            }
            aVar.mo40191j(false, z10, i11, -1, m40248o(C9580g.m40237k(i12, b10, s10), s10, b10, i11), EnumC9578e.HTTP_20_HEADERS);
        }

        /* renamed from: q */
        public final void m40251q(InterfaceC9575b.a aVar, int i10, byte b10, int i11) {
            boolean z10 = false;
            if (i10 != 8) {
                throw C9580g.m40236j("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw C9580g.m40236j("TYPE_PING streamId != 0", new Object[0]);
            }
            int readInt = this.f43632b.readInt();
            int readInt2 = this.f43632b.readInt();
            if ((b10 & 1) != 0) {
                z10 = true;
            }
            aVar.mo40184c(z10, readInt, readInt2);
        }

        /* renamed from: t */
        public final void m40252t(InterfaceC9575b.a aVar, int i10) {
            int readInt = this.f43632b.readInt();
            aVar.mo40187f(i10, readInt & Integer.MAX_VALUE, (this.f43632b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: v */
        public final void m40253v(InterfaceC9575b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 5) {
                throw C9580g.m40236j("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw C9580g.m40236j("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            m40252t(aVar, i11);
        }

        /* renamed from: w */
        public final void m40254w(InterfaceC9575b.a aVar, int i10, byte b10, int i11) {
            short s10 = 0;
            if (i11 == 0) {
                throw C9580g.m40236j("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            if ((b10 & 8) != 0) {
                s10 = (short) (this.f43632b.readByte() & 255);
            }
            aVar.mo40183b(i11, this.f43632b.readInt() & Integer.MAX_VALUE, m40248o(C9580g.m40237k(i10 - 4, b10, s10), s10, b10, i11));
        }

        /* renamed from: y */
        public final void m40255y(InterfaceC9575b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 4) {
                throw C9580g.m40236j("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw C9580g.m40236j("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int readInt = this.f43632b.readInt();
            EnumC9574a fromHttp2 = EnumC9574a.fromHttp2(readInt);
            if (fromHttp2 == null) {
                throw C9580g.m40236j("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            aVar.mo40185d(i11, fromHttp2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/g$d.class
     */
    /* renamed from: wg.g$d */
    /* loaded from: combined.jar:classes2.jar:wg/g$d.class */
    public static final class d implements InterfaceC9576c {

        /* renamed from: b */
        public final InterfaceC9762f f43636b;

        /* renamed from: c */
        public final boolean f43637c;

        /* renamed from: d */
        public final C9761e f43638d;

        /* renamed from: e */
        public final C9579f.b f43639e;

        /* renamed from: f */
        public int f43640f;

        /* renamed from: g */
        public boolean f43641g;

        public d(InterfaceC9762f interfaceC9762f, boolean z10) {
            this.f43636b = interfaceC9762f;
            this.f43637c = z10;
            C9761e c9761e = new C9761e();
            this.f43638d = c9761e;
            this.f43639e = new C9579f.b(c9761e);
            this.f43640f = 16384;
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: J */
        public void mo40192J() {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                if (this.f43637c) {
                    Logger logger = AbstractC9177b.f41992a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(String.format(">> CONNECTION %s", C9580g.f43622a.mo41198p()));
                    }
                    this.f43636b.write(C9580g.f43622a.mo41187C());
                    this.f43636b.flush();
                }
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: a */
        public void mo40193a(int i10, long j10) {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                if (j10 == 0 || j10 > 2147483647L) {
                    throw C9580g.m40235i("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
                }
                m40257l(i10, 4, (byte) 8, (byte) 0);
                this.f43636b.writeInt((int) j10);
                this.f43636b.flush();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: a0 */
        public int mo40194a0() {
            return this.f43640f;
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: b */
        public void mo40195b(int i10, int i11, List<C9577d> list) {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                if (this.f43638d.size() != 0) {
                    throw new IllegalStateException();
                }
                this.f43639e.m40227b(list);
                long size = this.f43638d.size();
                int min = (int) Math.min(this.f43640f - 4, size);
                long j10 = min;
                m40257l(i10, min + 4, (byte) 5, size == j10 ? (byte) 4 : (byte) 0);
                this.f43636b.writeInt(i11 & Integer.MAX_VALUE);
                this.f43636b.mo32031h(this.f43638d, j10);
                if (size > j10) {
                    m40259p(i10, size - j10);
                }
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: c */
        public void mo40196c(boolean z10, int i10, int i11) {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                m40257l(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
                this.f43636b.writeInt(i10);
                this.f43636b.writeInt(i11);
                this.f43636b.flush();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this) {
                this.f43641g = true;
                this.f43636b.close();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: d */
        public void mo40197d(int i10, EnumC9574a enumC9574a) {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                if (enumC9574a.spdyRstCode == -1) {
                    throw new IllegalArgumentException();
                }
                m40257l(i10, 4, (byte) 3, (byte) 0);
                this.f43636b.writeInt(enumC9574a.httpCode);
                this.f43636b.flush();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: e */
        public void mo40198e(C9586m c9586m) {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                this.f43640f = c9586m.m40286f(this.f43640f);
                m40257l(0, 0, (byte) 4, (byte) 1);
                this.f43636b.flush();
            }
        }

        /* renamed from: f */
        public void m40256f(int i10, byte b10, C9761e c9761e, int i11) {
            m40257l(i10, i11, (byte) 0, b10);
            if (i11 > 0) {
                this.f43636b.mo32031h(c9761e, i11);
            }
        }

        @Override // p389wg.InterfaceC9576c
        public void flush() {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                this.f43636b.flush();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: g */
        public void mo40199g(C9586m c9586m) {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                int i10 = 0;
                m40257l(0, c9586m.m40292l() * 6, (byte) 4, (byte) 0);
                while (i10 < 10) {
                    if (c9586m.m40288h(i10)) {
                        this.f43636b.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                        this.f43636b.writeInt(c9586m.m40283c(i10));
                    }
                    i10++;
                }
                this.f43636b.flush();
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: j */
        public void mo40200j(boolean z10, int i10, C9761e c9761e, int i11) {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                byte b10 = 0;
                if (z10) {
                    b10 = (byte) 1;
                }
                m40256f(i10, b10, c9761e, i11);
            }
        }

        /* renamed from: l */
        public void m40257l(int i10, int i11, byte b10, byte b11) {
            Logger logger = AbstractC9177b.f41992a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.m40244b(false, i10, i11, b10, b11));
            }
            int i12 = this.f43640f;
            if (i11 > i12) {
                throw C9580g.m40235i("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            if ((Integer.MIN_VALUE & i10) != 0) {
                throw C9580g.m40235i("reserved bit set: %s", Integer.valueOf(i10));
            }
            C9580g.m40239m(this.f43636b, i11);
            this.f43636b.writeByte(b10 & 255);
            this.f43636b.writeByte(b11 & 255);
            this.f43636b.writeInt(i10 & Integer.MAX_VALUE);
        }

        /* renamed from: o */
        public void m40258o(boolean z10, int i10, List<C9577d> list) {
            if (this.f43641g) {
                throw new IOException("closed");
            }
            if (this.f43638d.size() != 0) {
                throw new IllegalStateException();
            }
            this.f43639e.m40227b(list);
            long size = this.f43638d.size();
            int min = (int) Math.min(this.f43640f, size);
            long j10 = min;
            byte b10 = size == j10 ? (byte) 4 : (byte) 0;
            byte b11 = b10;
            if (z10) {
                b11 = (byte) (b10 | 1);
            }
            m40257l(i10, min, (byte) 1, b11);
            this.f43636b.mo32031h(this.f43638d, j10);
            if (size > j10) {
                m40259p(i10, size - j10);
            }
        }

        /* renamed from: p */
        public final void m40259p(int i10, long j10) {
            while (j10 > 0) {
                int min = (int) Math.min(this.f43640f, j10);
                long j11 = min;
                j10 -= j11;
                m40257l(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
                this.f43636b.mo32031h(this.f43638d, j11);
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: x0 */
        public void mo40201x0(boolean z10, boolean z11, int i10, int i11, List<C9577d> list) {
            synchronized (this) {
                if (z11) {
                    throw new UnsupportedOperationException();
                }
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                m40258o(z10, i10, list);
            }
        }

        @Override // p389wg.InterfaceC9576c
        /* renamed from: y0 */
        public void mo40202y0(int i10, EnumC9574a enumC9574a, byte[] bArr) {
            synchronized (this) {
                if (this.f43641g) {
                    throw new IOException("closed");
                }
                if (enumC9574a.httpCode == -1) {
                    throw C9580g.m40235i("errorCode.httpCode == -1", new Object[0]);
                }
                m40257l(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f43636b.writeInt(i10);
                this.f43636b.writeInt(enumC9574a.httpCode);
                if (bArr.length > 0) {
                    this.f43636b.write(bArr);
                }
                this.f43636b.flush();
            }
        }
    }

    /* renamed from: i */
    public static IllegalArgumentException m40235i(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: j */
    public static IOException m40236j(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* renamed from: k */
    public static int m40237k(int i10, byte b10, short s10) {
        int i11 = i10;
        if ((b10 & 8) != 0) {
            i11 = i10 - 1;
        }
        if (s10 <= i11) {
            return (short) (i11 - s10);
        }
        throw m40236j("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i11));
    }

    /* renamed from: l */
    public static int m40238l(InterfaceC9763g interfaceC9763g) {
        return (interfaceC9763g.readByte() & 255) | ((interfaceC9763g.readByte() & 255) << 16) | ((interfaceC9763g.readByte() & 255) << 8);
    }

    /* renamed from: m */
    public static void m40239m(InterfaceC9762f interfaceC9762f, int i10) {
        interfaceC9762f.writeByte((i10 >>> 16) & 255);
        interfaceC9762f.writeByte((i10 >>> 8) & 255);
        interfaceC9762f.writeByte(i10 & 255);
    }

    @Override // p389wg.InterfaceC9590q
    /* renamed from: a */
    public InterfaceC9575b mo40240a(InterfaceC9763g interfaceC9763g, boolean z10) {
        return new c(interfaceC9763g, 4096, z10);
    }

    @Override // p389wg.InterfaceC9590q
    /* renamed from: b */
    public InterfaceC9576c mo40241b(InterfaceC9762f interfaceC9762f, boolean z10) {
        return new d(interfaceC9762f, z10);
    }
}
