package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/v4/media/RatingCompat.class
 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: combined.jar:classes1.jar:android/support/v4/media/RatingCompat.class */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/RatingCompat$Api19Impl.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/RatingCompat$Api19Impl.class */
    public static class Api19Impl {
        private Api19Impl() {
        }

        public static float getPercentRating(Rating rating) {
            return rating.getPercentRating();
        }

        public static int getRatingStyle(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float getStarRating(Rating rating) {
            return rating.getStarRating();
        }

        public static boolean hasHeart(Rating rating) {
            return rating.hasHeart();
        }

        public static boolean isRated(Rating rating) {
            return rating.isRated();
        }

        public static boolean isThumbUp(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating newHeartRating(boolean z10) {
            return Rating.newHeartRating(z10);
        }

        public static Rating newPercentageRating(float f10) {
            return Rating.newPercentageRating(f10);
        }

        public static Rating newStarRating(int i10, float f10) {
            return Rating.newStarRating(i10, f10);
        }

        public static Rating newThumbRating(boolean z10) {
            return Rating.newThumbRating(z10);
        }

        public static Rating newUnratedRating(int i10) {
            return Rating.newUnratedRating(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/RatingCompat$StarStyle.class
     */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/RatingCompat$StarStyle.class */
    public @interface StarStyle {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/RatingCompat$Style.class
     */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/RatingCompat$Style.class */
    public @interface Style {
    }

    public RatingCompat(int i10, float f10) {
        this.mRatingStyle = i10;
        this.mRatingValue = f10;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = Api19Impl.getRatingStyle(rating);
            if (Api19Impl.isRated(rating)) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = newHeartRating(Api19Impl.hasHeart(rating));
                        break;
                    case 2:
                        ratingCompat = newThumbRating(Api19Impl.isThumbUp(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = newStarRating(ratingStyle, Api19Impl.getStarRating(rating));
                        break;
                    case 6:
                        ratingCompat = newPercentageRating(Api19Impl.getPercentRating(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = newUnratedRating(ratingStyle);
            }
            ratingCompat.mRatingObj = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat newHeartRating(boolean z10) {
        return new RatingCompat(1, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new RatingCompat(6, f10);
        }
        Log.e(TAG, "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat newStarRating(int i10, float f10) {
        float f11;
        String str;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else {
            if (i10 != 5) {
                str = "Invalid rating style (" + i10 + ") for a star rating";
                Log.e(TAG, str);
                return null;
            }
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new RatingCompat(i10, f10);
        }
        str = "Trying to set out of range star-based rating";
        Log.e(TAG, str);
        return null;
    }

    public static RatingCompat newThumbRating(boolean z10) {
        return new RatingCompat(2, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i10, RATING_NOT_RATED);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.mRatingStyle;
    }

    public float getPercentRating() {
        return (this.mRatingStyle == 6 && isRated()) ? this.mRatingValue : RATING_NOT_RATED;
    }

    public Object getRating() {
        Rating newUnratedRating;
        if (this.mRatingObj == null) {
            if (isRated()) {
                int i10 = this.mRatingStyle;
                switch (i10) {
                    case 1:
                        newUnratedRating = Api19Impl.newHeartRating(hasHeart());
                        break;
                    case 2:
                        newUnratedRating = Api19Impl.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        newUnratedRating = Api19Impl.newStarRating(i10, getStarRating());
                        break;
                    case 6:
                        newUnratedRating = Api19Impl.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                newUnratedRating = Api19Impl.newUnratedRating(this.mRatingStyle);
            }
            this.mRatingObj = newUnratedRating;
        }
        return this.mRatingObj;
    }

    public int getRatingStyle() {
        return this.mRatingStyle;
    }

    public float getStarRating() {
        int i10 = this.mRatingStyle;
        return ((i10 == 3 || i10 == 4 || i10 == 5) && isRated()) ? this.mRatingValue : RATING_NOT_RATED;
    }

    public boolean hasHeart() {
        boolean z10 = false;
        if (this.mRatingStyle != 1) {
            return false;
        }
        if (this.mRatingValue == 1.0f) {
            z10 = true;
        }
        return z10;
    }

    public boolean isRated() {
        return this.mRatingValue >= 0.0f;
    }

    public boolean isThumbUp() {
        boolean z10 = false;
        if (this.mRatingStyle != 2) {
            return false;
        }
        if (this.mRatingValue == 1.0f) {
            z10 = true;
        }
        return z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.mRatingStyle);
        sb2.append(" rating=");
        float f10 = this.mRatingValue;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }
}
