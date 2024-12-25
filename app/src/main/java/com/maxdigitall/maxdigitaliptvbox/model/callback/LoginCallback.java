package com.maxdigitall.maxdigitaliptvbox.model.callback;

import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/LoginCallback.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/LoginCallback.class */
public class LoginCallback {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("user_info")
    public UserLoginInfoCallback f16521a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("server_info")
    public ServerInfoCallback f16522b;

    /* renamed from: a */
    public ServerInfoCallback m15008a() {
        return this.f16522b;
    }

    /* renamed from: b */
    public UserLoginInfoCallback m15009b() {
        return this.f16521a;
    }
}
