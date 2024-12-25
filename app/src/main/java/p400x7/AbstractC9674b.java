package p400x7;

import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x7/b.class
 */
/* renamed from: x7.b */
/* loaded from: combined.jar:classes2.jar:x7/b.class */
public abstract class AbstractC9674b implements C7839a.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return C7840b.m34090a(this);
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ C7629w0 getWrappedMetadataFormat() {
        return C7840b.m34091b(this);
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ void populateMediaMetadata(C7565c1.b bVar) {
        C7840b.m34092c(this, bVar);
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
