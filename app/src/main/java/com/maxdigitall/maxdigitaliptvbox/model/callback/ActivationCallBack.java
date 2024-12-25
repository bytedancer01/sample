package com.maxdigitall.maxdigitaliptvbox.model.callback;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/ActivationCallBack.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/ActivationCallBack.class */
public class ActivationCallBack {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("result")
    public String f16452a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("message")
    public String f16453b;

    /* renamed from: c */
    @InterfaceC5839a
    @InterfaceC5841c("logindetails")
    public Logindetails f16454c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/ActivationCallBack$Logindetails.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/ActivationCallBack$Logindetails.class */
    public class Logindetails {

        /* renamed from: a */
        @InterfaceC5839a
        @InterfaceC5841c(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME)
        public String f16455a;

        /* renamed from: b */
        @InterfaceC5839a
        @InterfaceC5841c(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD)
        public String f16456b;

        /* renamed from: a */
        public String m14925a() {
            return this.f16456b;
        }

        /* renamed from: b */
        public String m14926b() {
            return this.f16455a;
        }
    }

    /* renamed from: a */
    public Logindetails m14922a() {
        return this.f16454c;
    }

    /* renamed from: b */
    public String m14923b() {
        return this.f16453b;
    }

    /* renamed from: c */
    public String m14924c() {
        return this.f16452a;
    }
}
