package p312ri;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import kh.C5612f;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p411xi.C9764h;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/k.class
 */
/* renamed from: ri.k */
/* loaded from: combined.jar:classes2.jar:ri/k.class */
public final class C8485k {

    /* renamed from: a */
    public static final int[] f39780a;

    /* renamed from: b */
    public static final byte[] f39781b;

    /* renamed from: c */
    public static final a f39782c;

    /* renamed from: d */
    public static final C8485k f39783d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/k$a.class
     */
    /* renamed from: ri.k$a */
    /* loaded from: combined.jar:classes2.jar:ri/k$a.class */
    public static final class a {

        /* renamed from: a */
        @Nullable
        public final a[] f39784a;

        /* renamed from: b */
        public final int f39785b;

        /* renamed from: c */
        public final int f39786c;

        public a() {
            this.f39784a = new a[256];
            this.f39785b = 0;
            this.f39786c = 0;
        }

        public a(int i10, int i11) {
            this.f39784a = null;
            this.f39785b = i10;
            int i12 = i11 & 7;
            this.f39786c = i12 == 0 ? 8 : i12;
        }

        @Nullable
        /* renamed from: a */
        public final a[] m36599a() {
            return this.f39784a;
        }

        /* renamed from: b */
        public final int m36600b() {
            return this.f39785b;
        }

        /* renamed from: c */
        public final int m36601c() {
            return this.f39786c;
        }
    }

    static {
        C8485k c8485k = new C8485k();
        f39783d = c8485k;
        f39780a = $d2j$hex$330c80e8$decode_I("f81f0000d8ff7f00e2ffff0fe3ffff0fe4ffff0fe5ffff0fe6ffff0fe7ffff0fe8ffff0feaffff00fcffff3fe9ffff0feaffff0ffdffff3febffff0fecffff0fedffff0feeffff0fefffff0ff0ffff0ff1ffff0ff2ffff0ffeffff3ff3ffff0ff4ffff0ff5ffff0ff6ffff0ff7ffff0ff8ffff0ff9ffff0ffaffff0ffbffff0f14000000f8030000f9030000fa0f0000f91f000015000000f8000000fa070000fa030000fb030000f9000000fb070000fa000000160000001700000018000000000000000100000002000000190000001a0000001b0000001c0000001d0000001e0000001f0000005c000000fb000000fc7f000020000000fb0f0000fc030000fa1f0000210000005d0000005e0000005f000000600000006100000062000000630000006400000065000000660000006700000068000000690000006a0000006b0000006c0000006d0000006e0000006f000000700000007100000072000000fc00000073000000fd000000fb1f0000f0ff0700fc1f0000fc3f000022000000fd7f0000030000002300000004000000240000000500000025000000260000002700000006000000740000007500000028000000290000002a000000070000002b000000760000002c00000008000000090000002d0000007700000078000000790000007a0000007b000000fe7f0000fc070000fd3f0000fd1f0000fcffff0fe6ff0f00d2ff3f00e7ff0f00e8ff0f00d3ff3f00d4ff3f00d5ff3f00d9ff7f00d6ff3f00daff7f00dbff7f00dcff7f00ddff7f00deff7f00ebffff00dfff7f00ecffff00edffff00d7ff3f00e0ff7f00eeffff00e1ff7f00e2ff7f00e3ff7f00e4ff7f00dcff1f00d8ff3f00e5ff7f00d9ff3f00e6ff7f00e7ff7f00efffff00daff3f00ddff1f00e9ff0f00dbff3f00dcff3f00e8ff7f00e9ff7f00deff1f00eaff7f00ddff3f00deff3f00f0ffff00dfff1f00dfff3f00ebff7f00ecff7f00e0ff1f00e1ff1f00e0ff3f00e2ff1f00edff7f00e1ff3f00eeff7f00efff7f00eaff0f00e2ff3f00e3ff3f00e4ff3f00f0ff7f00e5ff3f00e6ff3f00f1ff7f00e0ffff03e1ffff03ebff0f00f1ff0700e7ff3f00f2ff7f00e8ff3f00ecffff01e2ffff03e3ffff03e4ffff03deffff07dfffff07e5ffff03f1ffff00edffff01f2ff0700e3ff1f00e6ffff03e0ffff07e1ffff07e7ffff03e2ffff07f2ffff00e4ff1f00e5ff1f00e8ffff03e9ffff03fdffff0fe3ffff07e4ffff07e5ffff07ecff0f00f3ffff00edff0f00e6ff1f00e9ff3f00e7ff1f00e8ff1f00f3ff7f00eaff3f00ebff3f00eeffff01efffff01f4ffff00f5ffff00eaffff03f4ff7f00ebffff03e6ffff07ecffff03edffff03e7ffff07e8ffff07e9ffff07eaffff07ebffff07feffff0fecffff07edffff07eeffff07efffff07f0ffff07eeffff03");
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f39781b = bArr;
        f39782c = new a();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c8485k.m36595a(i10, f39780a[i10], f39781b[i10]);
        }
    }

    /* renamed from: a */
    public final void m36595a(int i10, int i11, int i12) {
        a aVar = new a(i10, i12);
        a aVar2 = f39782c;
        while (i12 > 8) {
            i12 -= 8;
            int i13 = (i11 >>> i12) & 255;
            a[] m36599a = aVar2.m36599a();
            C9367f.m39524c(m36599a);
            a aVar3 = m36599a[i13];
            aVar2 = aVar3;
            if (aVar3 == null) {
                aVar2 = new a();
                m36599a[i13] = aVar2;
            }
        }
        int i14 = 8 - i12;
        int i15 = (i11 << i14) & 255;
        a[] m36599a2 = aVar2.m36599a();
        C9367f.m39524c(m36599a2);
        C5612f.m27682h(m36599a2, aVar, i15, (1 << i14) + i15);
    }

    /* renamed from: b */
    public final void m36596b(@NotNull InterfaceC9763g interfaceC9763g, long j10, @NotNull InterfaceC9762f interfaceC9762f) {
        a aVar;
        int i10;
        C9367f.m39526e(interfaceC9763g, "source");
        C9367f.m39526e(interfaceC9762f, "sink");
        a aVar2 = f39782c;
        int i11 = 0;
        long j11 = 0;
        int i12 = 0;
        while (true) {
            aVar = aVar2;
            i10 = i12;
            if (j11 >= j10) {
                break;
            }
            i11 = (i11 << 8) | C5634b.m27782b(interfaceC9763g.readByte(), 255);
            i12 += 8;
            while (i12 >= 8) {
                int i13 = i12 - 8;
                a[] m36599a = aVar2.m36599a();
                C9367f.m39524c(m36599a);
                aVar2 = m36599a[(i11 >>> i13) & 255];
                C9367f.m39524c(aVar2);
                if (aVar2.m36599a() == null) {
                    interfaceC9762f.writeByte(aVar2.m36600b());
                    i12 -= aVar2.m36601c();
                    aVar2 = f39782c;
                } else {
                    i12 = i13;
                }
            }
            j11++;
        }
        while (i10 > 0) {
            a[] m36599a2 = aVar.m36599a();
            C9367f.m39524c(m36599a2);
            a aVar3 = m36599a2[(i11 << (8 - i10)) & 255];
            C9367f.m39524c(aVar3);
            if (aVar3.m36599a() != null || aVar3.m36601c() > i10) {
                return;
            }
            interfaceC9762f.writeByte(aVar3.m36600b());
            i10 -= aVar3.m36601c();
            aVar = f39782c;
        }
    }

    /* renamed from: c */
    public final void m36597c(@NotNull C9764h c9764h, @NotNull InterfaceC9762f interfaceC9762f) {
        C9367f.m39526e(c9764h, "source");
        C9367f.m39526e(interfaceC9762f, "sink");
        int size = c9764h.size();
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int m27782b = C5634b.m27782b(c9764h.m41193i(i11), 255);
            int i12 = f39780a[m27782b];
            byte b10 = f39781b[m27782b];
            j10 = (j10 << b10) | i12;
            i10 += b10;
            while (i10 >= 8) {
                i10 -= 8;
                interfaceC9762f.writeByte((int) (j10 >> i10));
            }
        }
        if (i10 > 0) {
            interfaceC9762f.writeByte((int) ((j10 << (8 - i10)) | (255 >>> i10)));
        }
    }

    /* renamed from: d */
    public final int m36598d(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "bytes");
        long j10 = 0;
        for (int i10 = 0; i10 < c9764h.size(); i10++) {
            j10 += f39781b[C5634b.m27782b(c9764h.m41193i(i10), 255)];
        }
        return (int) ((j10 + 7) >> 3);
    }

    private static long[] $d2j$hex$330c80e8$decode_J(String src) {
        byte[] d10 = $d2j$hex$330c80e8$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s10 = b10.asLongBuffer();
        long[] data = new long[d10.length / 8];
        s10.get(data);
        return data;
    }

    private static int[] $d2j$hex$330c80e8$decode_I(String src) {
        byte[] d10 = $d2j$hex$330c80e8$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s10 = b10.asIntBuffer();
        int[] data = new int[d10.length / 4];
        s10.get(data);
        return data;
    }

    private static short[] $d2j$hex$330c80e8$decode_S(String src) {
        byte[] d10 = $d2j$hex$330c80e8$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s10 = b10.asShortBuffer();
        short[] data = new short[d10.length / 2];
        s10.get(data);
        return data;
    }

    private static byte[] $d2j$hex$330c80e8$decode_B(String src) {
        int hh2;
        int i10;
        char[] d10 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i11 = 0; i11 < ret.length; i11++) {
            char h10 = d10[2 * i11];
            char l10 = d10[(2 * i11) + 1];
            if (h10 >= '0' && h10 <= '9') {
                hh2 = h10 - '0';
            } else if (h10 >= 'a' && h10 <= 'f') {
                hh2 = (h10 - 'a') + 10;
            } else if (h10 >= 'A' && h10 <= 'F') {
                hh2 = (h10 - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            if (l10 >= '0' && l10 <= '9') {
                i10 = l10 - '0';
            } else if (l10 >= 'a' && l10 <= 'f') {
                i10 = (l10 - 'a') + 10;
            } else if (l10 >= 'A' && l10 <= 'F') {
                i10 = (l10 - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            int ll = i10;
            ret[i11] = (byte) ((hh2 << 4) | ll);
        }
        return ret;
    }
}
