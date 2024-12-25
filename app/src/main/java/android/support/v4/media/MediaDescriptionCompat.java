package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/v4/media/MediaDescriptionCompat.class
 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaDescriptionCompat.class */
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    };
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaDescriptionCompat";
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaDescriptionCompat$Api21Impl.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaDescriptionCompat$Api21Impl.class */
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static MediaDescription build(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder createBuilder() {
            return new MediaDescription.Builder();
        }

        public static CharSequence getDescription(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle getExtras(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap getIconBitmap(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri getIconUri(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String getMediaId(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence getSubtitle(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence getTitle(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void setDescription(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void setExtras(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void setIconBitmap(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void setIconUri(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void setMediaId(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void setSubtitle(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void setTitle(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaDescriptionCompat$Api23Impl.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaDescriptionCompat$Api23Impl.class */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Uri getMediaUri(MediaDescription mediaDescription) {
            Uri mediaUri;
            mediaUri = mediaDescription.getMediaUri();
            return mediaUri;
        }

        public static void setMediaUri(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaDescriptionCompat$Builder.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaDescriptionCompat$Builder.class */
    public static final class Builder {
        private CharSequence mDescription;
        private Bundle mExtras;
        private Bitmap mIcon;
        private Uri mIconUri;
        private String mMediaId;
        private Uri mMediaUri;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);
        }

        public Builder setDescription(CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setIconBitmap(Bitmap bitmap) {
            this.mIcon = bitmap;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.mIconUri = uri;
            return this;
        }

        public Builder setMediaId(String str) {
            this.mMediaId = str;
            return this;
        }

        public Builder setMediaUri(Uri uri) {
            this.mMediaUri = uri;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.mSubtitle = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.mMediaId = parcel.readString();
        this.mTitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSubtitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mDescription = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.mIcon = (Bitmap) parcel.readParcelable(classLoader);
        this.mIconUri = (Uri) parcel.readParcelable(classLoader);
        this.mExtras = parcel.readBundle(classLoader);
        this.mMediaUri = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    public static MediaDescriptionCompat fromMediaDescription(Object obj) {
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (obj != null) {
            int i10 = Build.VERSION.SDK_INT;
            Builder builder = new Builder();
            MediaDescription mediaDescription = (MediaDescription) obj;
            builder.setMediaId(Api21Impl.getMediaId(mediaDescription));
            builder.setTitle(Api21Impl.getTitle(mediaDescription));
            builder.setSubtitle(Api21Impl.getSubtitle(mediaDescription));
            builder.setDescription(Api21Impl.getDescription(mediaDescription));
            builder.setIconBitmap(Api21Impl.getIconBitmap(mediaDescription));
            builder.setIconUri(Api21Impl.getIconUri(mediaDescription));
            Bundle extras = Api21Impl.getExtras(mediaDescription);
            Bundle bundle = extras;
            if (extras != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(extras);
            }
            Uri uri = bundle != null ? (Uri) bundle.getParcelable(DESCRIPTION_KEY_MEDIA_URI) : null;
            if (uri != null) {
                if (bundle.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && bundle.size() == 2) {
                    bundle = null;
                } else {
                    bundle.remove(DESCRIPTION_KEY_MEDIA_URI);
                    bundle.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
                }
            }
            builder.setExtras(bundle);
            if (uri != null) {
                builder.setMediaUri(uri);
            } else if (i10 >= 23) {
                builder.setMediaUri(Api23Impl.getMediaUri(mediaDescription));
            }
            mediaDescriptionCompat = builder.build();
            mediaDescriptionCompat.mDescriptionFwk = mediaDescription;
        }
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CharSequence getDescription() {
        return this.mDescription;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public Bitmap getIconBitmap() {
        return this.mIcon;
    }

    public Uri getIconUri() {
        return this.mIconUri;
    }

    public Object getMediaDescription() {
        Bundle bundle;
        MediaDescription mediaDescription = this.mDescriptionFwk;
        MediaDescription mediaDescription2 = mediaDescription;
        if (mediaDescription == null) {
            int i10 = Build.VERSION.SDK_INT;
            MediaDescription.Builder createBuilder = Api21Impl.createBuilder();
            Api21Impl.setMediaId(createBuilder, this.mMediaId);
            Api21Impl.setTitle(createBuilder, this.mTitle);
            Api21Impl.setSubtitle(createBuilder, this.mSubtitle);
            Api21Impl.setDescription(createBuilder, this.mDescription);
            Api21Impl.setIconBitmap(createBuilder, this.mIcon);
            Api21Impl.setIconUri(createBuilder, this.mIconUri);
            if (i10 >= 23 || this.mMediaUri == null) {
                bundle = this.mExtras;
            } else {
                if (this.mExtras == null) {
                    bundle = new Bundle();
                    bundle.putBoolean(DESCRIPTION_KEY_NULL_BUNDLE_FLAG, true);
                } else {
                    bundle = new Bundle(this.mExtras);
                }
                bundle.putParcelable(DESCRIPTION_KEY_MEDIA_URI, this.mMediaUri);
            }
            Api21Impl.setExtras(createBuilder, bundle);
            if (i10 >= 23) {
                Api23Impl.setMediaUri(createBuilder, this.mMediaUri);
            }
            mediaDescription2 = Api21Impl.build(createBuilder);
            this.mDescriptionFwk = mediaDescription2;
        }
        return mediaDescription2;
    }

    public String getMediaId() {
        return this.mMediaId;
    }

    public Uri getMediaUri() {
        return this.mMediaUri;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public String toString() {
        return ((Object) this.mTitle) + ", " + ((Object) this.mSubtitle) + ", " + ((Object) this.mDescription);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) getMediaDescription()).writeToParcel(parcel, i10);
    }
}
