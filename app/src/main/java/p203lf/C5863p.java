package p203lf;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.AbstractC0437w;
import androidx.fragment.app.Fragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlCategoriesFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlM3UFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlRadioCategoriesFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSeriesCatFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSettingFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlVODCatFragment;
import java.util.ArrayList;
import org.apache.commons.codec.language.p254bm.Rule;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/p.class
 */
/* renamed from: lf.p */
/* loaded from: combined.jar:classes2.jar:lf/p.class */
public class C5863p extends AbstractC0437w {

    /* renamed from: j */
    public String[] f32703j;

    /* renamed from: k */
    public int f32704k;

    /* renamed from: l */
    public String f32705l;

    /* renamed from: m */
    public Context f32706m;

    /* renamed from: n */
    public ArrayList<Integer> f32707n;

    /* renamed from: o */
    public boolean f32708o;

    public C5863p(AbstractC0428n abstractC0428n, int i10, Context context, ArrayList<Integer> arrayList, String str) {
        super(abstractC0428n);
        this.f32703j = new String[5];
        this.f32704k = 4;
        new ArrayList();
        this.f32708o = false;
        this.f32704k = i10;
        this.f32706m = context;
        this.f32705l = str;
        this.f32707n = arrayList;
        if (str.equals("m3u")) {
            String[] strArr = this.f32703j;
            strArr[0] = Rule.ALL;
            strArr[1] = this.f32706m.getResources().getString(2132018750);
        } else {
            this.f32703j[0] = this.f32706m.getResources().getString(2132017450);
            this.f32703j[1] = this.f32706m.getResources().getString(2132018785);
            this.f32703j[2] = this.f32706m.getResources().getString(2132018547);
            this.f32703j[3] = this.f32706m.getResources().getString(2132018431);
            this.f32703j[4] = this.f32706m.getResources().getString(2132018750);
        }
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: c */
    public int mo21760c() {
        return this.f32704k;
    }

    @Override // androidx.fragment.app.AbstractC0437w
    /* renamed from: p */
    public Fragment mo2336p(int i10) {
        if (this.f32705l.equals("m3u")) {
            if (i10 == 0) {
                return new ParentalControlM3UFragment();
            }
            if (i10 != 1) {
                return null;
            }
            return new ParentalControlSettingFragment();
        }
        if (i10 == 0) {
            return new ParentalControlCategoriesFragment();
        }
        if (i10 == 1) {
            return new ParentalControlVODCatFragment();
        }
        if (i10 == 2) {
            return new ParentalControlSeriesCatFragment();
        }
        if (i10 == 3) {
            return new ParentalControlRadioCategoriesFragment();
        }
        if (i10 != 4) {
            return null;
        }
        return new ParentalControlSettingFragment();
    }

    /* renamed from: q */
    public View m28571q(int i10) {
        View inflate = LayoutInflater.from(this.f32706m).inflate(2131624526, (ViewGroup) null);
        ((TextView) inflate.findViewById(2131429626)).setText(this.f32703j[i10]);
        return inflate;
    }

    /* renamed from: r */
    public void m28572r(View view, Typeface typeface, int i10) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(2131429626);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    /* renamed from: s */
    public void m28573s(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(2131429626);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    /* renamed from: t */
    public void m28574t(View view, Typeface typeface, int i10) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(2131429626);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    /* renamed from: u */
    public void m28575u(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(2131429626);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    /* renamed from: v */
    public void m28576v(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(2131429626);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }

    /* renamed from: w */
    public void m28577w(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(2131429626);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }

    /* renamed from: x */
    public void m28578x(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(2131429626);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }

    /* renamed from: y */
    public void m28579y(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(2131429626);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }
}
