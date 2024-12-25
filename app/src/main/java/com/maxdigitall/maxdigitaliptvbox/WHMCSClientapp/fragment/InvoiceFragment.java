package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import java.lang.reflect.Field;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/fragment/InvoiceFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/fragment/InvoiceFragment.class */
public class InvoiceFragment extends Fragment {

    /* renamed from: b */
    public String f16258b;

    /* renamed from: c */
    public String f16259c;

    /* renamed from: d */
    public String f16260d = "";

    /* renamed from: e */
    public String f16261e = "";

    /* renamed from: f */
    public String f16262f = "";

    /* renamed from: g */
    public OnFragmentInteractionListener f16263g;

    /* renamed from: h */
    public Unbinder f16264h;

    @BindView
    public WebView webView;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/fragment/InvoiceFragment$OnFragmentInteractionListener.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/fragment/InvoiceFragment$OnFragmentInteractionListener.class */
    public interface OnFragmentInteractionListener {
    }

    /* renamed from: m */
    public final void m14632m() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f16260d = arguments.getString("invoice_id");
        }
        this.webView.setWebChromeClient(new WebChromeClient());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            this.f16263g = (OnFragmentInteractionListener) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f16258b = getArguments().getString("param1");
            this.f16259c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131624209, viewGroup, false);
        this.f16264h = ButterKnife.m5627b(this, inflate);
        m14632m();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }
}
