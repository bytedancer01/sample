package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import p296r1.C7944c;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/SeekBarPreference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/SeekBarPreference.class */
public class SeekBarPreference extends Preference {

    /* renamed from: H */
    public int f4405H;

    /* renamed from: I */
    public int f4406I;

    /* renamed from: J */
    public int f4407J;

    /* renamed from: K */
    public int f4408K;

    /* renamed from: L */
    public boolean f4409L;

    /* renamed from: M */
    public SeekBar f4410M;

    /* renamed from: N */
    public TextView f4411N;

    /* renamed from: O */
    public boolean f4412O;

    /* renamed from: P */
    public boolean f4413P;

    /* renamed from: Q */
    public boolean f4414Q;

    /* renamed from: R */
    public SeekBar.OnSeekBarChangeListener f4415R;

    /* renamed from: S */
    public View.OnKeyListener f4416S;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/SeekBarPreference$a.class
     */
    /* renamed from: androidx.preference.SeekBarPreference$a */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/SeekBarPreference$a.class */
    public class C0654a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final SeekBarPreference f4417b;

        public C0654a(SeekBarPreference seekBarPreference) {
            this.f4417b = seekBarPreference;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = this.f4417b;
                if (seekBarPreference.f4414Q || !seekBarPreference.f4409L) {
                    seekBarPreference.m3728L(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = this.f4417b;
            seekBarPreference2.m3729M(i10 + seekBarPreference2.f4406I);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f4417b.f4409L = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f4417b.f4409L = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = this.f4417b;
            if (progress + seekBarPreference.f4406I != seekBarPreference.f4405H) {
                seekBarPreference.m3728L(seekBar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/SeekBarPreference$b.class
     */
    /* renamed from: androidx.preference.SeekBarPreference$b */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/SeekBarPreference$b.class */
    public class ViewOnKeyListenerC0655b implements View.OnKeyListener {

        /* renamed from: b */
        public final SeekBarPreference f4418b;

        public ViewOnKeyListenerC0655b(SeekBarPreference seekBarPreference) {
            this.f4418b = seekBarPreference;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = this.f4418b;
            if ((!seekBarPreference.f4412O && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f4410M;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7944c.f38218h);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4415R = new C0654a(this);
        this.f4416S = new ViewOnKeyListenerC0655b(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38346o1, i10, i11);
        this.f4406I = obtainStyledAttributes.getInt(C7948g.f38355r1, 0);
        m3725I(obtainStyledAttributes.getInt(C7948g.f38349p1, 100));
        m3726J(obtainStyledAttributes.getInt(C7948g.f38358s1, 0));
        this.f4412O = obtainStyledAttributes.getBoolean(C7948g.f38352q1, true);
        this.f4413P = obtainStyledAttributes.getBoolean(C7948g.f38361t1, false);
        this.f4414Q = obtainStyledAttributes.getBoolean(C7948g.f38364u1, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: I */
    public final void m3725I(int i10) {
        int i11 = this.f4406I;
        int i12 = i10;
        if (i10 < i11) {
            i12 = i11;
        }
        if (i12 != this.f4407J) {
            this.f4407J = i12;
            mo3677u();
        }
    }

    /* renamed from: J */
    public final void m3726J(int i10) {
        if (i10 != this.f4408K) {
            this.f4408K = Math.min(this.f4407J - this.f4406I, Math.abs(i10));
            mo3677u();
        }
    }

    /* renamed from: K */
    public final void m3727K(int i10, boolean z10) {
        int i11 = this.f4406I;
        int i12 = i10;
        if (i10 < i11) {
            i12 = i11;
        }
        int i13 = this.f4407J;
        int i14 = i12;
        if (i12 > i13) {
            i14 = i13;
        }
        if (i14 != this.f4405H) {
            this.f4405H = i14;
            m3729M(i14);
            m3696D(i14);
            if (z10) {
                mo3677u();
            }
        }
    }

    /* renamed from: L */
    public void m3728L(SeekBar seekBar) {
        int progress = this.f4406I + seekBar.getProgress();
        if (progress != this.f4405H) {
            if (m3700a(Integer.valueOf(progress))) {
                m3727K(progress, false);
            } else {
                seekBar.setProgress(this.f4405H - this.f4406I);
                m3729M(this.f4405H);
            }
        }
    }

    /* renamed from: M */
    public void m3729M(int i10) {
        TextView textView = this.f4411N;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: y */
    public Object mo3680y(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }
}
