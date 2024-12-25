package p327t1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import p360v1.C9223a;
import p360v1.C9225c;
import p360v1.C9226d;
import p375w1.InterfaceC9397b;
import p375w1.InterfaceC9398c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t1/i.class
 */
/* renamed from: t1.i */
/* loaded from: combined.jar:classes1.jar:t1/i.class */
public class C8601i implements InterfaceC9398c {

    /* renamed from: b */
    public final Context f40122b;

    /* renamed from: c */
    public final String f40123c;

    /* renamed from: d */
    public final File f40124d;

    /* renamed from: e */
    public final int f40125e;

    /* renamed from: f */
    public final InterfaceC9398c f40126f;

    /* renamed from: g */
    public C8593a f40127g;

    /* renamed from: h */
    public boolean f40128h;

    public C8601i(Context context, String str, File file, int i10, InterfaceC9398c interfaceC9398c) {
        this.f40122b = context;
        this.f40123c = str;
        this.f40124d = file;
        this.f40125e = i10;
        this.f40126f = interfaceC9398c;
    }

    @Override // p375w1.InterfaceC9398c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f40126f.close();
            this.f40128h = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.nio.channels.ReadableByteChannel] */
    /* renamed from: f */
    public final void m36946f(File file) {
        FileChannel channel;
        if (this.f40123c != null) {
            channel = Channels.newChannel(this.f40122b.getAssets().open(this.f40123c));
        } else {
            if (this.f40124d == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f40124d).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f40122b.getCacheDir());
        createTempFile.deleteOnExit();
        C9226d.m38895a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    @Override // p375w1.InterfaceC9398c
    public String getDatabaseName() {
        return this.f40126f.getDatabaseName();
    }

    @Override // p375w1.InterfaceC9398c
    public InterfaceC9397b getWritableDatabase() {
        InterfaceC9397b writableDatabase;
        synchronized (this) {
            if (!this.f40128h) {
                m36948o();
                this.f40128h = true;
            }
            writableDatabase = this.f40126f.getWritableDatabase();
        }
        return writableDatabase;
    }

    /* renamed from: l */
    public void m36947l(C8593a c8593a) {
        this.f40127g = c8593a;
    }

    /* renamed from: o */
    public final void m36948o() {
        String databaseName = getDatabaseName();
        File databasePath = this.f40122b.getDatabasePath(databaseName);
        C8593a c8593a = this.f40127g;
        C9223a c9223a = new C9223a(databaseName, this.f40122b.getFilesDir(), c8593a == null || c8593a.f40069j);
        try {
            c9223a.m38888b();
            if (!databasePath.exists()) {
                try {
                    m36946f(databasePath);
                    c9223a.m38889c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            if (this.f40127g == null) {
                c9223a.m38889c();
                return;
            }
            try {
                int m38894c = C9225c.m38894c(databasePath);
                int i10 = this.f40125e;
                if (m38894c == i10) {
                    c9223a.m38889c();
                    return;
                }
                if (this.f40127g.m36890a(m38894c, i10)) {
                    c9223a.m38889c();
                    return;
                }
                if (this.f40122b.deleteDatabase(databaseName)) {
                    try {
                        m36946f(databasePath);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c9223a.m38889c();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                c9223a.m38889c();
                return;
            }
        } catch (Throwable th2) {
            c9223a.m38889c();
            throw th2;
        }
        c9223a.m38889c();
        throw th2;
    }

    @Override // p375w1.InterfaceC9398c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f40126f.setWriteAheadLoggingEnabled(z10);
    }
}
