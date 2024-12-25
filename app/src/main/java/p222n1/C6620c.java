package p222n1;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n1/c.class
 */
/* renamed from: n1.c */
/* loaded from: combined.jar:classes1.jar:n1/c.class */
public final class C6620c {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n1/c$a.class
     */
    /* renamed from: n1.c$a */
    /* loaded from: combined.jar:classes1.jar:n1/c$a.class */
    public static class a {

        /* renamed from: a */
        public long f34538a;

        /* renamed from: b */
        public long f34539b;
    }

    /* renamed from: a */
    public static long m30563a(RandomAccessFile randomAccessFile, a aVar) {
        CRC32 crc32 = new CRC32();
        long j10 = aVar.f34539b;
        randomAccessFile.seek(aVar.f34538a);
        int min = (int) Math.min(16384L, j10);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = randomAccessFile.read(bArr, 0, min);
            if (read == -1) {
                break;
            }
            crc32.update(bArr, 0, read);
            j10 -= read;
            if (j10 == 0) {
                break;
            }
            min = (int) Math.min(16384L, j10);
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    public static a m30564b(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j10 = 0;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j11 = length - 65536;
        if (j11 >= 0) {
            j10 = j11;
        }
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f34539b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.f34538a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            length--;
        } while (length >= j10);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* renamed from: c */
    public static long m30565c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m30563a(randomAccessFile, m30564b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
