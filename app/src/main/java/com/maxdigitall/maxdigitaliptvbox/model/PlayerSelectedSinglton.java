package com.maxdigitall.maxdigitaliptvbox.model;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/PlayerSelectedSinglton.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/PlayerSelectedSinglton.class */
public class PlayerSelectedSinglton {

    /* renamed from: b */
    public static PlayerSelectedSinglton f16437b;

    /* renamed from: a */
    public String f16438a;

    private PlayerSelectedSinglton() {
    }

    /* renamed from: a */
    public static PlayerSelectedSinglton m14897a() {
        if (f16437b == null) {
            f16437b = new PlayerSelectedSinglton();
        }
        return f16437b;
    }

    /* renamed from: b */
    public void m14898b(String str) {
        this.f16438a = str;
    }
}
