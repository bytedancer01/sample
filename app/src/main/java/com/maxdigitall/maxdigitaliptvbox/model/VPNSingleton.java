package com.maxdigitall.maxdigitaliptvbox.model;

import bg.C0900a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/VPNSingleton.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/VPNSingleton.class */
public class VPNSingleton {

    /* renamed from: b */
    public static VPNSingleton f16443b;

    /* renamed from: a */
    public C0900a f16444a;

    private VPNSingleton() {
    }

    /* renamed from: a */
    public static VPNSingleton m14906a() {
        if (f16443b == null) {
            f16443b = new VPNSingleton();
        }
        return f16443b;
    }

    /* renamed from: b */
    public C0900a m14907b() {
        return this.f16444a;
    }

    /* renamed from: c */
    public void m14908c(C0900a c0900a) {
        this.f16444a = c0900a;
    }
}
