package p042cj;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: cj.i */
/* loaded from: combined.jar:classes3.jar:cj/i.class */
public class C1140i implements Closeable {

    /* renamed from: b */
    public final int f7500b = 1179403647;

    /* renamed from: c */
    public final FileChannel f7501c;

    public C1140i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f7501c = new FileInputStream(file).getChannel();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7501c.close();
    }

    /* renamed from: f */
    public final long m6789f(AbstractC1135d abstractC1135d, long j10, long j11) {
        long j12 = 0;
        while (true) {
            long j13 = j12;
            if (j13 >= j10) {
                throw new IllegalStateException("Could not map vma to file offset!");
            }
            AbstractC1136e mo6787b = abstractC1135d.mo6787b(j13);
            if (mo6787b.f7493a == 1) {
                long j14 = mo6787b.f7495c;
                if (j14 <= j11 && j11 <= mo6787b.f7496d + j14) {
                    return (j11 - j14) + mo6787b.f7494b;
                }
            }
            j12 = j13 + 1;
        }
    }

    /* renamed from: l */
    public AbstractC1135d m6790l() {
        this.f7501c.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m6797y(allocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short m6793q = m6793q(allocate, 4L);
        boolean z10 = m6793q(allocate, 5L) == 2;
        if (m6793q == 1) {
            return new C1138g(z10, this);
        }
        if (m6793q == 2) {
            return new C1139h(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    /* renamed from: o */
    public List<String> m6791o() {
        long j10;
        AbstractC1134c mo6786a;
        this.f7501c.position(0L);
        ArrayList arrayList = new ArrayList();
        AbstractC1135d m6790l = m6790l();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(m6790l.f7484a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = m6790l.f7489f;
        int i10 = 0;
        long j12 = j11;
        if (j11 == 65535) {
            j12 = m6790l.mo6788c(0).f7497a;
        }
        long j13 = 0;
        while (true) {
            long j14 = j13;
            if (j14 >= j12) {
                j10 = 0;
                break;
            }
            AbstractC1136e mo6787b = m6790l.mo6787b(j14);
            if (mo6787b.f7493a == 2) {
                j10 = mo6787b.f7494b;
                break;
            }
            j13 = j14 + 1;
        }
        if (j10 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j15 = 0;
        do {
            mo6786a = m6790l.mo6786a(j10, i10);
            long j16 = mo6786a.f7482a;
            if (j16 == 1) {
                arrayList2.add(Long.valueOf(mo6786a.f7483b));
            } else if (j16 == 5) {
                j15 = mo6786a.f7483b;
            }
            i10++;
        } while (mo6786a.f7482a != 0);
        if (j15 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long m6789f = m6789f(m6790l, j12, j15);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(m6796w(allocate, ((Long) it.next()).longValue() + m6789f));
        }
        return arrayList;
    }

    /* renamed from: p */
    public void m6792p(ByteBuffer byteBuffer, long j10, int i10) {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (true) {
            long j12 = j11;
            if (j12 >= i10) {
                byteBuffer.position(0);
                return;
            }
            int read = this.f7501c.read(byteBuffer, j10 + j12);
            if (read == -1) {
                throw new EOFException();
            }
            j11 = j12 + read;
        }
    }

    /* renamed from: q */
    public short m6793q(ByteBuffer byteBuffer, long j10) {
        m6792p(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* renamed from: t */
    public int m6794t(ByteBuffer byteBuffer, long j10) {
        m6792p(byteBuffer, j10, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: v */
    public long m6795v(ByteBuffer byteBuffer, long j10) {
        m6792p(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    /* renamed from: w */
    public String m6796w(ByteBuffer byteBuffer, long j10) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            short m6793q = m6793q(byteBuffer, j10);
            if (m6793q == 0) {
                return sb2.toString();
            }
            sb2.append((char) m6793q);
            j10 = 1 + j10;
        }
    }

    /* renamed from: y */
    public long m6797y(ByteBuffer byteBuffer, long j10) {
        m6792p(byteBuffer, j10, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
