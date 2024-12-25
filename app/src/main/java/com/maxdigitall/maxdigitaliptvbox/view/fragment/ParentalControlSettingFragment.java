package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSettingFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSettingFragment.class */
public class ParentalControlSettingFragment extends Fragment {

    /* renamed from: b */
    public Unbinder f22237b;

    @BindView
    public Button btSavePassword;

    /* renamed from: c */
    public String f22238c = "";

    /* renamed from: d */
    public String f22239d = "";

    /* renamed from: e */
    public String f22240e = "";

    /* renamed from: f */
    public Context f22241f;

    /* renamed from: g */
    public LiveStreamDBHandler f22242g;

    /* renamed from: h */
    public String f22243h;

    /* renamed from: i */
    public String f22244i;

    /* renamed from: j */
    public InterfaceC3702a f22245j;

    @BindView
    public EditText tvConfirmPassword;

    @BindView
    public EditText tvNewPassword;

    @BindView
    public EditText tvOldPassword;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSettingFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSettingFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSettingFragment$a.class */
    public interface InterfaceC3702a {
    }

    /* renamed from: m */
    public final void m18109m() {
        EditText editText = this.tvOldPassword;
        if (editText == null || this.tvConfirmPassword == null || this.tvNewPassword == null) {
            return;
        }
        editText.getText().clear();
        this.tvConfirmPassword.getText().clear();
        this.tvNewPassword.getText().clear();
    }

    /* renamed from: n */
    public final boolean m18110n(String str, String str2) {
        if (str == null || str.equals("") || str.isEmpty()) {
            Context context = this.f22241f;
            if (context == null) {
                return false;
            }
            Toast.makeText(context, getResources().getString(2132017647), 0).show();
            return false;
        }
        if ((str.isEmpty() || str.equals("") || str2 != null || !str2.isEmpty()) && !str2.equals("")) {
            return ((str.isEmpty() || str.equals("") || str2.isEmpty()) && str2.equals("")) ? false : true;
        }
        Context context2 = this.f22241f;
        if (context2 == null) {
            return false;
        }
        Toast.makeText(context2, getResources().getString(2132017640), 0).show();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC3702a) {
            this.f22245j = (InterfaceC3702a) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f22243h = getArguments().getString("param1");
            this.f22244i = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131624215, viewGroup, false);
        this.f22237b = ButterKnife.m5627b(this, inflate);
        m18111p();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f22237b.mo5629a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f22245j = null;
    }

    @OnClick
    public void onViewClicked() {
        Context context;
        Resources resources;
        int i10;
        if (this.f22241f != null) {
            this.f22238c = String.valueOf(this.tvOldPassword.getText());
            this.f22239d = String.valueOf(this.tvNewPassword.getText());
            this.f22240e = String.valueOf(this.tvConfirmPassword.getText());
            String string = this.f22241f.getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            if (!m18112q(string, this.f22238c, SharepreferenceDBHandler.m15337A(this.f22241f))) {
                context = this.f22241f;
                if (context != null) {
                    resources = getResources();
                    i10 = 2132017874;
                    Toast.makeText(context, resources.getString(i10), 0).show();
                }
                m18109m();
            }
            if (m18110n(this.f22239d, this.f22240e)) {
                if (this.f22239d.equals(this.f22240e)) {
                    m18113s(this.f22242g.m15152B2(string, this.f22239d, SharepreferenceDBHandler.m15337A(this.f22241f)));
                    getActivity().finish();
                    return;
                }
                context = this.f22241f;
                if (context != null) {
                    resources = getResources();
                    i10 = 2132018281;
                    Toast.makeText(context, resources.getString(i10), 0).show();
                }
                m18109m();
            }
        }
    }

    /* renamed from: p */
    public final void m18111p() {
        this.f22241f = getContext();
        this.f22242g = new LiveStreamDBHandler(this.f22241f);
        this.f22238c = String.valueOf(this.tvOldPassword.getText());
        this.f22239d = String.valueOf(this.tvNewPassword.getText());
        this.f22240e = String.valueOf(this.tvConfirmPassword.getText());
        this.tvOldPassword.requestFocus();
        ((InputMethodManager) this.f22241f.getSystemService("input_method")).showSoftInput(this.tvOldPassword, 1);
    }

    /* renamed from: q */
    public final boolean m18112q(String str, String str2, int i10) {
        String str3;
        boolean z10;
        ArrayList<PasswordDBModel> m15230l1 = new LiveStreamDBHandler(this.f22241f).m15230l1(SharepreferenceDBHandler.m15337A(this.f22241f));
        if (m15230l1 != null) {
            Iterator<PasswordDBModel> it = m15230l1.iterator();
            String str4 = "";
            boolean z11 = false;
            while (true) {
                z10 = z11;
                str3 = str4;
                if (!it.hasNext()) {
                    break;
                }
                PasswordDBModel next = it.next();
                if (next.m15283a().equals(str) && !next.m15285c().isEmpty()) {
                    str4 = next.m15285c();
                    z11 = true;
                }
            }
        } else {
            str3 = "";
            z10 = false;
        }
        return (!z10 || str2 == null || str2.isEmpty() || str2.equals("") || str3.equals("") || !str3.equals(str2)) ? false : true;
    }

    /* renamed from: s */
    public final void m18113s(boolean z10) {
        Context context;
        Resources resources;
        int i10;
        if (z10) {
            context = this.f22241f;
            if (context != null) {
                resources = getResources();
                i10 = 2132018290;
                Toast.makeText(context, resources.getString(i10), 0).show();
            }
        } else {
            context = this.f22241f;
            if (context != null) {
                resources = getResources();
                i10 = 2132018606;
                Toast.makeText(context, resources.getString(i10), 0).show();
            }
        }
        m18109m();
    }
}
