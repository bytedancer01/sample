package p332t6;

import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t6/a.class
 */
/* renamed from: t6.a */
/* loaded from: combined.jar:classes2.jar:t6/a.class */
public abstract class AbstractC8633a {
    private int flags;

    public final void addFlag(int i10) {
        this.flags = i10 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i10) {
        this.flags = (i10 ^ (-1)) & this.flags;
    }

    public final boolean getFlag(int i10) {
        return (this.flags & i10) == i10;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isDecodeOnly() {
        return getFlag(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void setFlags(int i10) {
        this.flags = i10;
    }
}
