package android.graphics.fonts;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.res.Resources;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/graphics/fonts/Font.class
 */
/* loaded from: combined.jar:classes1.jar:android/graphics/fonts/Font.class */
public final /* synthetic */ class Font {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/graphics/fonts/Font$Builder.class
     */
    /* loaded from: combined.jar:classes1.jar:android/graphics/fonts/Font$Builder.class */
    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(@NonNull Resources resources, int i10) {
        }

        public /* synthetic */ Builder(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        }

        @NonNull
        public native /* synthetic */ Font build() throws IOException;

        @NonNull
        public native /* synthetic */ Builder setFontVariationSettings(@Nullable String str);

        @NonNull
        public native /* synthetic */ Builder setSlant(int i10);

        @NonNull
        public native /* synthetic */ Builder setTtcIndex(int i10);

        @NonNull
        public native /* synthetic */ Builder setWeight(int i10);
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ FontStyle getStyle();
}
