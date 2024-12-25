package pl.droidsonroids.gif;

import java.io.IOException;
import p449zi.EnumC10242b;

/* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/GifIOException.class */
public class GifIOException extends IOException {

    /* renamed from: b */
    public final EnumC10242b f37517b;

    /* renamed from: c */
    public final String f37518c;

    public GifIOException(int i10, String str) {
        this.f37517b = EnumC10242b.fromCode(i10);
        this.f37518c = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f37518c == null) {
            return this.f37517b.getFormattedDescription();
        }
        return this.f37517b.getFormattedDescription() + ": " + this.f37518c;
    }
}
