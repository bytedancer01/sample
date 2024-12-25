package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK_ViewBinding.class */
public class SearchFragmentLowerSDK_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SearchFragmentLowerSDK f22311b;

    public SearchFragmentLowerSDK_ViewBinding(SearchFragmentLowerSDK searchFragmentLowerSDK, View view) {
        this.f22311b = searchFragmentLowerSDK;
        searchFragmentLowerSDK.et_search = (EditText) C8522c.m36739c(view, 2131427918, "field 'et_search'", EditText.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SearchFragmentLowerSDK searchFragmentLowerSDK = this.f22311b;
        if (searchFragmentLowerSDK == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22311b = null;
        searchFragmentLowerSDK.et_search = null;
    }
}
