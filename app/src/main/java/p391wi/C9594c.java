package p391wi;

import java.io.Closeable;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import org.jsoup.parser.CharacterReader;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.C9770n;
import p411xi.InterfaceC9756b0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wi/c.class
 */
/* renamed from: wi.c */
/* loaded from: combined.jar:classes2.jar:wi/c.class */
public final class C9594c implements Closeable {

    /* renamed from: b */
    public final C9761e f43761b;

    /* renamed from: c */
    public final Inflater f43762c;

    /* renamed from: d */
    public final C9770n f43763d;

    /* renamed from: e */
    public final boolean f43764e;

    public C9594c(boolean z10) {
        this.f43764e = z10;
        C9761e c9761e = new C9761e();
        this.f43761b = c9761e;
        Inflater inflater = new Inflater(true);
        this.f43762c = inflater;
        this.f43763d = new C9770n((InterfaceC9756b0) c9761e, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43763d.close();
    }

    /* renamed from: f */
    public final void m40398f(@NotNull C9761e c9761e) {
        C9367f.m39526e(c9761e, "buffer");
        if (!(this.f43761b.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f43764e) {
            this.f43762c.reset();
        }
        this.f43761b.mo41127I(c9761e);
        this.f43761b.writeInt(CharacterReader.EOF);
        long bytesRead = this.f43762c.getBytesRead();
        long size = this.f43761b.size();
        do {
            this.f43763d.m41224f(c9761e, Long.MAX_VALUE);
        } while (this.f43762c.getBytesRead() < bytesRead + size);
    }
}
