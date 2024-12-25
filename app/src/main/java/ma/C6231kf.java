package ma;

import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/kf.class
 */
/* renamed from: ma.kf */
/* loaded from: combined.jar:classes2.jar:ma/kf.class */
public final class C6231kf implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int compareTo;
        AbstractC6399sf abstractC6399sf = (AbstractC6399sf) obj;
        AbstractC6399sf abstractC6399sf2 = (AbstractC6399sf) obj2;
        C6210jf c6210jf = new C6210jf(abstractC6399sf);
        C6210jf c6210jf2 = new C6210jf(abstractC6399sf2);
        while (c6210jf.hasNext() && c6210jf2.hasNext()) {
            compareTo = Integer.valueOf(c6210jf.zza() & 255).compareTo(Integer.valueOf(c6210jf2.zza() & 255));
            if (compareTo != 0) {
                break;
            }
        }
        compareTo = Integer.valueOf(abstractC6399sf.mo29850d()).compareTo(Integer.valueOf(abstractC6399sf2.mo29850d()));
        return compareTo;
    }
}
