package pl.droidsonroids.gif;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;
import p449zi.C10245e;
import p449zi.EnumC10242b;

/* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/GifInfoHandle.class */
final class GifInfoHandle {

    /* renamed from: a */
    public volatile long f37519a;

    static {
        C10245e.m42846b();
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.f37519a = m33768n(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException e10) {
            }
        }
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z10);

    private static native void free(long j10);

    private static native int getCurrentFrameIndex(long j10);

    private static native int getCurrentLoop(long j10);

    private static native int getCurrentPosition(long j10);

    private static native int getDuration(long j10);

    private static native int getHeight(long j10);

    private static native int getLoopCount(long j10);

    private static native int getNativeErrorCode(long j10);

    private static native int getNumberOfFrames(long j10);

    private static native long[] getSavedState(long j10);

    private static native int getWidth(long j10);

    /* renamed from: h */
    public static int m33767h(FileDescriptor fileDescriptor, boolean z10) {
        try {
            int createTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
            if (z10) {
                Os.close(fileDescriptor);
            }
            return createTempNativeFileDescriptor;
        } catch (Throwable th2) {
            if (z10) {
                Os.close(fileDescriptor);
            }
            throw th2;
        }
    }

    private static native boolean isOpaque(long j10);

    /* renamed from: n */
    public static long m33768n(FileDescriptor fileDescriptor, long j10, boolean z10) {
        int m33767h;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                m33767h = m33767h(fileDescriptor, z10);
            } catch (Exception e10) {
                throw new GifIOException(EnumC10242b.OPEN_FAILED.errorCode, e10.getMessage());
            }
        } else {
            m33767h = extractNativeFileDescriptor(fileDescriptor, z10);
        }
        return openNativeFileDescriptor(m33767h, j10);
    }

    public static native long openNativeFileDescriptor(int i10, long j10);

    private static native long renderFrame(long j10, Bitmap bitmap);

    private static native boolean reset(long j10);

    private static native long restoreRemainder(long j10);

    private static native int restoreSavedState(long j10, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j10);

    private static native void seekToTime(long j10, int i10, Bitmap bitmap);

    private static native void setLoopCount(long j10, char c10);

    /* renamed from: a */
    public int m33769a() {
        int currentFrameIndex;
        synchronized (this) {
            currentFrameIndex = getCurrentFrameIndex(this.f37519a);
        }
        return currentFrameIndex;
    }

    /* renamed from: b */
    public int m33770b() {
        int currentLoop;
        synchronized (this) {
            currentLoop = getCurrentLoop(this.f37519a);
        }
        return currentLoop;
    }

    /* renamed from: c */
    public int m33771c() {
        int currentPosition;
        synchronized (this) {
            currentPosition = getCurrentPosition(this.f37519a);
        }
        return currentPosition;
    }

    /* renamed from: d */
    public int m33772d() {
        int duration;
        synchronized (this) {
            duration = getDuration(this.f37519a);
        }
        return duration;
    }

    /* renamed from: e */
    public int m33773e() {
        int height;
        synchronized (this) {
            height = getHeight(this.f37519a);
        }
        return height;
    }

    /* renamed from: f */
    public int m33774f() {
        int loopCount;
        synchronized (this) {
            loopCount = getLoopCount(this.f37519a);
        }
        return loopCount;
    }

    public void finalize() {
        try {
            m33781o();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public int m33775g() {
        int nativeErrorCode;
        synchronized (this) {
            nativeErrorCode = getNativeErrorCode(this.f37519a);
        }
        return nativeErrorCode;
    }

    /* renamed from: i */
    public int m33776i() {
        int numberOfFrames;
        synchronized (this) {
            numberOfFrames = getNumberOfFrames(this.f37519a);
        }
        return numberOfFrames;
    }

    /* renamed from: j */
    public long[] m33777j() {
        long[] savedState;
        synchronized (this) {
            savedState = getSavedState(this.f37519a);
        }
        return savedState;
    }

    /* renamed from: k */
    public int m33778k() {
        int width;
        synchronized (this) {
            width = getWidth(this.f37519a);
        }
        return width;
    }

    /* renamed from: l */
    public boolean m33779l() {
        boolean isOpaque;
        synchronized (this) {
            isOpaque = isOpaque(this.f37519a);
        }
        return isOpaque;
    }

    /* renamed from: m */
    public boolean m33780m() {
        boolean z10;
        synchronized (this) {
            z10 = this.f37519a == 0;
        }
        return z10;
    }

    /* renamed from: o */
    public void m33781o() {
        synchronized (this) {
            free(this.f37519a);
            this.f37519a = 0L;
        }
    }

    /* renamed from: p */
    public long m33782p(Bitmap bitmap) {
        long renderFrame;
        synchronized (this) {
            renderFrame = renderFrame(this.f37519a, bitmap);
        }
        return renderFrame;
    }

    /* renamed from: q */
    public boolean m33783q() {
        boolean reset;
        synchronized (this) {
            reset = reset(this.f37519a);
        }
        return reset;
    }

    /* renamed from: r */
    public long m33784r() {
        long restoreRemainder;
        synchronized (this) {
            restoreRemainder = restoreRemainder(this.f37519a);
        }
        return restoreRemainder;
    }

    /* renamed from: s */
    public int m33785s(long[] jArr, Bitmap bitmap) {
        int restoreSavedState;
        synchronized (this) {
            restoreSavedState = restoreSavedState(this.f37519a, jArr, bitmap);
        }
        return restoreSavedState;
    }

    /* renamed from: t */
    public void m33786t() {
        synchronized (this) {
            saveRemainder(this.f37519a);
        }
    }

    /* renamed from: u */
    public void m33787u(int i10, Bitmap bitmap) {
        synchronized (this) {
            seekToTime(this.f37519a, i10, bitmap);
        }
    }

    /* renamed from: v */
    public void m33788v(int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f37519a, (char) i10);
        }
    }
}
