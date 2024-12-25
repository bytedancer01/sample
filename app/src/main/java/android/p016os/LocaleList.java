package android.p016os;

import android.annotation.NonNull;
import android.annotation.Nullable;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/os/LocaleList.class
 */
/* loaded from: combined.jar:classes1.jar:android/os/LocaleList.class */
public final /* synthetic */ class LocaleList implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ LocaleList(@NonNull Locale... localeArr) {
    }

    @NonNull
    public static native /* synthetic */ LocaleList forLanguageTags(@Nullable String str);

    public native /* synthetic */ boolean equals(@Nullable Object obj);

    public native /* synthetic */ Locale get(int i10);

    public native /* synthetic */ int hashCode();

    @NonNull
    public native /* synthetic */ String toLanguageTags();

    public native /* synthetic */ String toString();
}
