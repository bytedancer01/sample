package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/v4/media/MediaMetadataCompat.class
 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaMetadataCompat.class */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final C7928a<String, Integer> METADATA_KEYS_TYPE;
    public static final String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
    public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
    public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
    public static final int METADATA_TYPE_BITMAP = 2;
    public static final int METADATA_TYPE_LONG = 0;
    public static final int METADATA_TYPE_RATING = 3;
    public static final int METADATA_TYPE_TEXT = 1;
    private static final String[] PREFERRED_BITMAP_ORDER;
    private static final String[] PREFERRED_DESCRIPTION_ORDER;
    private static final String[] PREFERRED_URI_ORDER;
    private static final String TAG = "MediaMetadata";
    public final Bundle mBundle;
    private MediaDescriptionCompat mDescription;
    private MediaMetadata mMetadataFwk;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaMetadataCompat$Builder.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaMetadataCompat$Builder.class */
    public static final class Builder {
        private final Bundle mBundle;

        public Builder() {
            this.mBundle = new Bundle();
        }

        public Builder(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.mBundle);
            this.mBundle = bundle;
            MediaSessionCompat.ensureClassLoader(bundle);
        }

        public Builder(MediaMetadataCompat mediaMetadataCompat, int i10) {
            this(mediaMetadataCompat);
            for (String str : this.mBundle.keySet()) {
                Object obj = this.mBundle.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i10 || bitmap.getWidth() > i10) {
                        putBitmap(str, scaleBitmap(bitmap, i10));
                    }
                }
            }
        }

        private Bitmap scaleBitmap(Bitmap bitmap, int i10) {
            float f10 = i10;
            float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
            return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
        }

        public MediaMetadataCompat build() {
            return new MediaMetadataCompat(this.mBundle);
        }

        public Builder putBitmap(String str, Bitmap bitmap) {
            C7928a<String, Integer> c7928a = MediaMetadataCompat.METADATA_KEYS_TYPE;
            if (!c7928a.containsKey(str) || c7928a.get(str).intValue() == 2) {
                this.mBundle.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public Builder putLong(String str, long j10) {
            C7928a<String, Integer> c7928a = MediaMetadataCompat.METADATA_KEYS_TYPE;
            if (!c7928a.containsKey(str) || c7928a.get(str).intValue() == 0) {
                this.mBundle.putLong(str, j10);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public Builder putRating(String str, RatingCompat ratingCompat) {
            C7928a<String, Integer> c7928a = MediaMetadataCompat.METADATA_KEYS_TYPE;
            if (!c7928a.containsKey(str) || c7928a.get(str).intValue() == 3) {
                this.mBundle.putParcelable(str, (Parcelable) ratingCompat.getRating());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        public Builder putString(String str, String str2) {
            C7928a<String, Integer> c7928a = MediaMetadataCompat.METADATA_KEYS_TYPE;
            if (!c7928a.containsKey(str) || c7928a.get(str).intValue() == 1) {
                this.mBundle.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public Builder putText(String str, CharSequence charSequence) {
            C7928a<String, Integer> c7928a = MediaMetadataCompat.METADATA_KEYS_TYPE;
            if (!c7928a.containsKey(str) || c7928a.get(str).intValue() == 1) {
                this.mBundle.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }
    }

    static {
        C7928a<String, Integer> c7928a = new C7928a<>();
        METADATA_KEYS_TYPE = c7928a;
        c7928a.put(METADATA_KEY_TITLE, 1);
        c7928a.put(METADATA_KEY_ARTIST, 1);
        c7928a.put(METADATA_KEY_DURATION, 0);
        c7928a.put(METADATA_KEY_ALBUM, 1);
        c7928a.put(METADATA_KEY_AUTHOR, 1);
        c7928a.put(METADATA_KEY_WRITER, 1);
        c7928a.put(METADATA_KEY_COMPOSER, 1);
        c7928a.put(METADATA_KEY_COMPILATION, 1);
        c7928a.put(METADATA_KEY_DATE, 1);
        c7928a.put(METADATA_KEY_YEAR, 0);
        c7928a.put(METADATA_KEY_GENRE, 1);
        c7928a.put(METADATA_KEY_TRACK_NUMBER, 0);
        c7928a.put(METADATA_KEY_NUM_TRACKS, 0);
        c7928a.put(METADATA_KEY_DISC_NUMBER, 0);
        c7928a.put(METADATA_KEY_ALBUM_ARTIST, 1);
        c7928a.put(METADATA_KEY_ART, 2);
        c7928a.put(METADATA_KEY_ART_URI, 1);
        c7928a.put(METADATA_KEY_ALBUM_ART, 2);
        c7928a.put(METADATA_KEY_ALBUM_ART_URI, 1);
        c7928a.put(METADATA_KEY_USER_RATING, 3);
        c7928a.put(METADATA_KEY_RATING, 3);
        c7928a.put(METADATA_KEY_DISPLAY_TITLE, 1);
        c7928a.put(METADATA_KEY_DISPLAY_SUBTITLE, 1);
        c7928a.put(METADATA_KEY_DISPLAY_DESCRIPTION, 1);
        c7928a.put(METADATA_KEY_DISPLAY_ICON, 2);
        c7928a.put(METADATA_KEY_DISPLAY_ICON_URI, 1);
        c7928a.put(METADATA_KEY_MEDIA_ID, 1);
        c7928a.put(METADATA_KEY_BT_FOLDER_TYPE, 0);
        c7928a.put(METADATA_KEY_MEDIA_URI, 1);
        c7928a.put(METADATA_KEY_ADVERTISEMENT, 0);
        c7928a.put(METADATA_KEY_DOWNLOAD_STATUS, 0);
        PREFERRED_DESCRIPTION_ORDER = new String[]{METADATA_KEY_TITLE, METADATA_KEY_ARTIST, METADATA_KEY_ALBUM, METADATA_KEY_ALBUM_ARTIST, METADATA_KEY_WRITER, METADATA_KEY_AUTHOR, METADATA_KEY_COMPOSER};
        PREFERRED_BITMAP_ORDER = new String[]{METADATA_KEY_DISPLAY_ICON, METADATA_KEY_ART, METADATA_KEY_ALBUM_ART};
        PREFERRED_URI_ORDER = new String[]{METADATA_KEY_DISPLAY_ICON_URI, METADATA_KEY_ART_URI, METADATA_KEY_ALBUM_ART_URI};
        CREATOR = new Parcelable.Creator<MediaMetadataCompat>() { // from class: android.support.v4.media.MediaMetadataCompat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaMetadataCompat createFromParcel(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaMetadataCompat[] newArray(int i10) {
                return new MediaMetadataCompat[i10];
            }
        };
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.mBundle = bundle2;
        MediaSessionCompat.ensureClassLoader(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.mBundle = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat fromMediaMetadata(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.mMetadataFwk = mediaMetadata;
        return createFromParcel;
    }

    public boolean containsKey(String str) {
        return this.mBundle.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bitmap getBitmap(String str) {
        Bitmap bitmap;
        try {
            bitmap = (Bitmap) this.mBundle.getParcelable(str);
        } catch (Exception e10) {
            Log.w(TAG, "Failed to retrieve a key as Bitmap.", e10);
            bitmap = null;
        }
        return bitmap;
    }

    public Bundle getBundle() {
        return new Bundle(this.mBundle);
    }

    public MediaDescriptionCompat getDescription() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String string = getString(METADATA_KEY_MEDIA_ID);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence text = getText(METADATA_KEY_DISPLAY_TITLE);
        if (TextUtils.isEmpty(text)) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                String[] strArr = PREFERRED_DESCRIPTION_ORDER;
                if (i11 >= strArr.length) {
                    break;
                }
                CharSequence text2 = getText(strArr[i11]);
                int i12 = i10;
                if (!TextUtils.isEmpty(text2)) {
                    charSequenceArr[i10] = text2;
                    i12 = i10 + 1;
                }
                i11++;
                i10 = i12;
            }
        } else {
            charSequenceArr[0] = text;
            charSequenceArr[1] = getText(METADATA_KEY_DISPLAY_SUBTITLE);
            charSequenceArr[2] = getText(METADATA_KEY_DISPLAY_DESCRIPTION);
        }
        int i13 = 0;
        while (true) {
            String[] strArr2 = PREFERRED_BITMAP_ORDER;
            uri = null;
            if (i13 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = getBitmap(strArr2[i13]);
            if (bitmap != null) {
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            String[] strArr3 = PREFERRED_URI_ORDER;
            if (i14 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String string2 = getString(strArr3[i14]);
            if (!TextUtils.isEmpty(string2)) {
                uri2 = Uri.parse(string2);
                break;
            }
            i14++;
        }
        String string3 = getString(METADATA_KEY_MEDIA_URI);
        if (!TextUtils.isEmpty(string3)) {
            uri = Uri.parse(string3);
        }
        MediaDescriptionCompat.Builder builder = new MediaDescriptionCompat.Builder();
        builder.setMediaId(string);
        builder.setTitle(charSequenceArr[0]);
        builder.setSubtitle(charSequenceArr[1]);
        builder.setDescription(charSequenceArr[2]);
        builder.setIconBitmap(bitmap);
        builder.setIconUri(uri2);
        builder.setMediaUri(uri);
        Bundle bundle = new Bundle();
        if (this.mBundle.containsKey(METADATA_KEY_BT_FOLDER_TYPE)) {
            bundle.putLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE, getLong(METADATA_KEY_BT_FOLDER_TYPE));
        }
        if (this.mBundle.containsKey(METADATA_KEY_DOWNLOAD_STATUS)) {
            bundle.putLong(MediaDescriptionCompat.EXTRA_DOWNLOAD_STATUS, getLong(METADATA_KEY_DOWNLOAD_STATUS));
        }
        if (!bundle.isEmpty()) {
            builder.setExtras(bundle);
        }
        MediaDescriptionCompat build = builder.build();
        this.mDescription = build;
        return build;
    }

    public long getLong(String str) {
        return this.mBundle.getLong(str, 0L);
    }

    public Object getMediaMetadata() {
        if (this.mMetadataFwk == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.mMetadataFwk = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.mMetadataFwk;
    }

    public RatingCompat getRating(String str) {
        RatingCompat ratingCompat;
        try {
            ratingCompat = RatingCompat.fromRating(this.mBundle.getParcelable(str));
        } catch (Exception e10) {
            Log.w(TAG, "Failed to retrieve a key as Rating.", e10);
            ratingCompat = null;
        }
        return ratingCompat;
    }

    public String getString(String str) {
        CharSequence charSequence = this.mBundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence getText(String str) {
        return this.mBundle.getCharSequence(str);
    }

    public Set<String> keySet() {
        return this.mBundle.keySet();
    }

    public int size() {
        return this.mBundle.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.mBundle);
    }
}
