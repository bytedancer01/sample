package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import p296r1.C7944c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/DropDownPreference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/DropDownPreference.class */
public class DropDownPreference extends ListPreference {

    /* renamed from: S */
    public final Context f4345S;

    /* renamed from: T */
    public final ArrayAdapter f4346T;

    /* renamed from: U */
    public Spinner f4347U;

    /* renamed from: V */
    public final AdapterView.OnItemSelectedListener f4348V;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/DropDownPreference$a.class
     */
    /* renamed from: androidx.preference.DropDownPreference$a */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/DropDownPreference$a.class */
    public class C0644a implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final DropDownPreference f4349b;

        public C0644a(DropDownPreference dropDownPreference) {
            this.f4349b = dropDownPreference;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String charSequence = this.f4349b.m3687L()[i10].toString();
                if (charSequence.equals(this.f4349b.m3688M()) || !this.f4349b.m3700a(charSequence)) {
                    return;
                }
                this.f4349b.m3690O(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7944c.f38213c);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4348V = new C0644a(this);
        this.f4345S = context;
        this.f4346T = m3675P();
        m3676Q();
    }

    /* renamed from: P */
    public ArrayAdapter m3675P() {
        return new ArrayAdapter(this.f4345S, R.layout.simple_spinner_dropdown_item);
    }

    /* renamed from: Q */
    public final void m3676Q() {
        this.f4346T.clear();
        if (m3685J() != null) {
            for (CharSequence charSequence : m3685J()) {
                this.f4346T.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: u */
    public void mo3677u() {
        super.mo3677u();
        ArrayAdapter arrayAdapter = this.f4346T;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* renamed from: w */
    public void mo3674w() {
        this.f4347U.performClick();
    }
}
