package pf;

import java.io.File;
import java.io.RandomAccessFile;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pf/a.class
 */
/* renamed from: pf.a */
/* loaded from: combined.jar:classes2.jar:pf/a.class */
public class C7705a implements IMediaDataSource {

    /* renamed from: a */
    public RandomAccessFile f37453a;

    /* renamed from: b */
    public long f37454b;

    public C7705a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.f37453a = randomAccessFile;
        this.f37454b = randomAccessFile.length();
    }

    /* renamed from: a */
    public static String m33651a() {
        return "QU1UIFBsYXllcg==";
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public void close() {
        this.f37454b = 0L;
        this.f37453a.close();
        this.f37453a = null;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public long getSize() {
        return this.f37454b;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (this.f37453a.getFilePointer() != j10) {
            this.f37453a.seek(j10);
        }
        if (i11 == 0) {
            return 0;
        }
        return this.f37453a.read(bArr, 0, i11);
    }
}
