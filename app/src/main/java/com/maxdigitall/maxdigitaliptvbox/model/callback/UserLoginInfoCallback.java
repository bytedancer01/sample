package com.maxdigitall.maxdigitaliptvbox.model.callback;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import java.util.List;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/UserLoginInfoCallback.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/UserLoginInfoCallback.class */
public class UserLoginInfoCallback {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME)
    public String f16577a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD)
    public String f16578b;

    /* renamed from: c */
    @InterfaceC5839a
    @InterfaceC5841c("auth")
    public Integer f16579c;

    /* renamed from: d */
    @InterfaceC5839a
    @InterfaceC5841c("status")
    public String f16580d;

    /* renamed from: e */
    @InterfaceC5839a
    @InterfaceC5841c("exp_date")
    public String f16581e;

    /* renamed from: f */
    @InterfaceC5839a
    @InterfaceC5841c("is_trial")
    public String f16582f;

    /* renamed from: g */
    @InterfaceC5839a
    @InterfaceC5841c("active_cons")
    public String f16583g;

    /* renamed from: h */
    @InterfaceC5839a
    @InterfaceC5841c("created_at")
    public String f16584h;

    /* renamed from: i */
    @InterfaceC5839a
    @InterfaceC5841c("max_connections")
    public String f16585i;

    /* renamed from: j */
    @InterfaceC5839a
    @InterfaceC5841c("allowed_output_formats")
    public List<String> f16586j = null;

    /* renamed from: a */
    public String m15082a() {
        return this.f16583g;
    }

    /* renamed from: b */
    public List<String> m15083b() {
        return this.f16586j;
    }

    /* renamed from: c */
    public Integer m15084c() {
        return this.f16579c;
    }

    /* renamed from: d */
    public String m15085d() {
        return this.f16584h;
    }

    /* renamed from: e */
    public String m15086e() {
        return this.f16581e;
    }

    /* renamed from: f */
    public String m15087f() {
        return this.f16582f;
    }

    /* renamed from: g */
    public String m15088g() {
        return this.f16585i;
    }

    /* renamed from: h */
    public String m15089h() {
        return this.f16578b;
    }

    /* renamed from: i */
    public String m15090i() {
        return this.f16580d;
    }

    /* renamed from: j */
    public String m15091j() {
        return this.f16577a;
    }
}
