package android.text;

import android.annotation.NonNull;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/text/PrecomputedText.class
 */
/* loaded from: combined.jar:classes1.jar:android/text/PrecomputedText.class */
public /* synthetic */ class PrecomputedText implements Spannable {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/text/PrecomputedText$Params.class
     */
    /* loaded from: combined.jar:classes1.jar:android/text/PrecomputedText$Params.class */
    public final /* synthetic */ class Params {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ int getBreakStrategy();

        public native /* synthetic */ int getHyphenationFrequency();

        @NonNull
        public native /* synthetic */ TextDirectionHeuristic getTextDirection();

        @NonNull
        public native /* synthetic */ TextPaint getTextPaint();
    }

    static {
        throw new NoClassDefFoundError();
    }

    @Override // android.text.Spanned
    public native /* synthetic */ <T> T[] getSpans(int i10, int i11, Class<T> cls);

    @Override // android.text.Spannable
    public native /* synthetic */ void removeSpan(Object obj);

    @Override // android.text.Spannable
    public native /* synthetic */ void setSpan(Object obj, int i10, int i11, int i12);
}
