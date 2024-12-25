package android.text;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.text.Layout;
import android.text.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/text/StaticLayout$Builder.class
 */
/* loaded from: combined.jar:classes1.jar:android/text/StaticLayout$Builder.class */
public final /* synthetic */ class StaticLayout$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ StaticLayout$Builder obtain(@NonNull CharSequence charSequence, int i10, int i11, @NonNull TextPaint textPaint, int i12);

    @NonNull
    public native /* synthetic */ StaticLayout build();

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setAlignment(@NonNull Layout.Alignment alignment);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setBreakStrategy(int i10);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setEllipsize(@Nullable TextUtils.TruncateAt truncateAt);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setHyphenationFrequency(int i10);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setIncludePad(boolean z10);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setLineSpacing(float f10, float f11);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setMaxLines(int i10);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic);
}
