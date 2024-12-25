package p207m0;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.os.Build;
import android.p016os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p221n0.C6611c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m0/d.class
 */
/* renamed from: m0.d */
/* loaded from: combined.jar:classes1.jar:m0/d.class */
public class C5888d implements Spannable {

    /* renamed from: e */
    public static final Object f32979e = new Object();

    /* renamed from: b */
    public final Spannable f32980b;

    /* renamed from: c */
    public final a f32981c;

    /* renamed from: d */
    public final PrecomputedText f32982d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m0/d$a.class
     */
    /* renamed from: m0.d$a */
    /* loaded from: combined.jar:classes1.jar:m0/d$a.class */
    public static final class a {

        /* renamed from: a */
        public final TextPaint f32983a;

        /* renamed from: b */
        public final TextDirectionHeuristic f32984b;

        /* renamed from: c */
        public final int f32985c;

        /* renamed from: d */
        public final int f32986d;

        /* renamed from: e */
        public final PrecomputedText.Params f32987e;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m0/d$a$a.class
         */
        /* renamed from: m0.d$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:m0/d$a$a.class */
        public static class C10315a {

            /* renamed from: a */
            public final TextPaint f32988a;

            /* renamed from: b */
            public TextDirectionHeuristic f32989b;

            /* renamed from: c */
            public int f32990c;

            /* renamed from: d */
            public int f32991d;

            public C10315a(TextPaint textPaint) {
                this.f32988a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f32990c = 1;
                    this.f32991d = 1;
                } else {
                    this.f32991d = 0;
                    this.f32990c = 0;
                }
                this.f32989b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            /* renamed from: a */
            public a m28725a() {
                return new a(this.f32988a, this.f32989b, this.f32990c, this.f32991d);
            }

            /* renamed from: b */
            public C10315a m28726b(int i10) {
                this.f32990c = i10;
                return this;
            }

            /* renamed from: c */
            public C10315a m28727c(int i10) {
                this.f32991d = i10;
                return this;
            }

            /* renamed from: d */
            public C10315a m28728d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f32989b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f32983a = params.getTextPaint();
            this.f32984b = params.getTextDirection();
            this.f32985c = params.getBreakStrategy();
            this.f32986d = params.getHyphenationFrequency();
            this.f32987e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @SuppressLint({"NewApi"})
        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f32987e = Build.VERSION.SDK_INT >= 29 ? new Object(textPaint) { // from class: android.text.PrecomputedText.Params.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                public /* synthetic */ Builder(@NonNull TextPaint textPaint2) {
                }

                @NonNull
                public native /* synthetic */ Params build();

                public native /* synthetic */ Builder setBreakStrategy(int i12);

                public native /* synthetic */ Builder setHyphenationFrequency(int i12);

                public native /* synthetic */ Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic2);
            }.setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f32983a = textPaint2;
            this.f32984b = textDirectionHeuristic;
            this.f32985c = i10;
            this.f32986d = i11;
        }

        /* renamed from: a */
        public boolean m28720a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f32985c != aVar.m28721b() || this.f32986d != aVar.m28722c())) || this.f32983a.getTextSize() != aVar.m28724e().getTextSize() || this.f32983a.getTextScaleX() != aVar.m28724e().getTextScaleX() || this.f32983a.getTextSkewX() != aVar.m28724e().getTextSkewX() || this.f32983a.getLetterSpacing() != aVar.m28724e().getLetterSpacing() || !TextUtils.equals(this.f32983a.getFontFeatureSettings(), aVar.m28724e().getFontFeatureSettings()) || this.f32983a.getFlags() != aVar.m28724e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                textLocales = this.f32983a.getTextLocales();
                textLocales2 = aVar.m28724e().getTextLocales();
                if (!textLocales.equals(textLocales2)) {
                    return false;
                }
            } else if (!this.f32983a.getTextLocale().equals(aVar.m28724e().getTextLocale())) {
                return false;
            }
            return this.f32983a.getTypeface() == null ? aVar.m28724e().getTypeface() == null : this.f32983a.getTypeface().equals(aVar.m28724e().getTypeface());
        }

        /* renamed from: b */
        public int m28721b() {
            return this.f32985c;
        }

        /* renamed from: c */
        public int m28722c() {
            return this.f32986d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m28723d() {
            return this.f32984b;
        }

        /* renamed from: e */
        public TextPaint m28724e() {
            return this.f32983a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m28720a(aVar) && this.f32984b == aVar.m28723d();
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT < 24) {
                return C6611c.m30517b(Float.valueOf(this.f32983a.getTextSize()), Float.valueOf(this.f32983a.getTextScaleX()), Float.valueOf(this.f32983a.getTextSkewX()), Float.valueOf(this.f32983a.getLetterSpacing()), Integer.valueOf(this.f32983a.getFlags()), this.f32983a.getTextLocale(), this.f32983a.getTypeface(), Boolean.valueOf(this.f32983a.isElegantTextHeight()), this.f32984b, Integer.valueOf(this.f32985c), Integer.valueOf(this.f32986d));
            }
            textLocales = this.f32983a.getTextLocales();
            return C6611c.m30517b(Float.valueOf(this.f32983a.getTextSize()), Float.valueOf(this.f32983a.getTextScaleX()), Float.valueOf(this.f32983a.getTextSkewX()), Float.valueOf(this.f32983a.getLetterSpacing()), Integer.valueOf(this.f32983a.getFlags()), textLocales, this.f32983a.getTypeface(), Boolean.valueOf(this.f32983a.isElegantTextHeight()), this.f32984b, Integer.valueOf(this.f32985c), Integer.valueOf(this.f32986d));
        }

        public String toString() {
            StringBuilder sb2;
            Object textLocale;
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb3 = new StringBuilder("{");
            sb3.append("textSize=" + this.f32983a.getTextSize());
            sb3.append(", textScaleX=" + this.f32983a.getTextScaleX());
            sb3.append(", textSkewX=" + this.f32983a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb3.append(", letterSpacing=" + this.f32983a.getLetterSpacing());
            sb3.append(", elegantTextHeight=" + this.f32983a.isElegantTextHeight());
            if (i10 >= 24) {
                sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocales = this.f32983a.getTextLocales();
                textLocale = textLocales;
            } else {
                sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocale = this.f32983a.getTextLocale();
            }
            sb2.append(textLocale);
            sb3.append(sb2.toString());
            sb3.append(", typeface=" + this.f32983a.getTypeface());
            if (i10 >= 26) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(", variationSettings=");
                fontVariationSettings = this.f32983a.getFontVariationSettings();
                sb4.append(fontVariationSettings);
                sb3.append(sb4.toString());
            }
            sb3.append(", textDir=" + this.f32984b);
            sb3.append(", breakStrategy=" + this.f32985c);
            sb3.append(", hyphenationFrequency=" + this.f32986d);
            sb3.append("}");
            return sb3.toString();
        }
    }

    /* renamed from: a */
    public a m28718a() {
        return this.f32981c;
    }

    /* renamed from: b */
    public PrecomputedText m28719b() {
        Spannable spannable = this.f32980b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f32980b.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f32980b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f32980b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f32980b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f32982d.getSpans(i10, i11, cls) : (T[]) this.f32980b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f32980b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f32980b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f32982d.removeSpan(obj);
        } else {
            this.f32980b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f32982d.setSpan(obj, i10, i11, i12);
        } else {
            this.f32980b.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f32980b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f32980b.toString();
    }
}
