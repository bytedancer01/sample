package com.maxdigitall.maxdigitaliptvbox.model;

import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/VodAllCategoriesSingleton.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/VodAllCategoriesSingleton.class */
public class VodAllCategoriesSingleton {

    /* renamed from: g */
    public static VodAllCategoriesSingleton f16445g;

    /* renamed from: a */
    public ArrayList<LiveStreamCategoryIdDBModel> f16446a;

    /* renamed from: b */
    public ArrayList<LiveStreamsDBModel> f16447b;

    /* renamed from: c */
    public ArrayList<LiveStreamsDBModel> f16448c;

    /* renamed from: d */
    public ArrayList<LiveStreamCategoryIdDBModel> f16449d;

    /* renamed from: e */
    public ArrayList<LiveStreamsDBModel> f16450e;

    /* renamed from: f */
    public String f16451f = "";

    private VodAllCategoriesSingleton() {
    }

    /* renamed from: b */
    public static VodAllCategoriesSingleton m14909b() {
        if (f16445g == null) {
            f16445g = new VodAllCategoriesSingleton();
        }
        return f16445g;
    }

    /* renamed from: a */
    public ArrayList<LiveStreamsDBModel> m14910a() {
        return this.f16448c;
    }

    /* renamed from: c */
    public ArrayList<LiveStreamCategoryIdDBModel> m14911c() {
        return this.f16449d;
    }

    /* renamed from: d */
    public ArrayList<LiveStreamsDBModel> m14912d() {
        return this.f16450e;
    }

    /* renamed from: e */
    public String m14913e() {
        return this.f16451f;
    }

    /* renamed from: f */
    public ArrayList<LiveStreamCategoryIdDBModel> m14914f() {
        return this.f16446a;
    }

    /* renamed from: g */
    public ArrayList<LiveStreamsDBModel> m14915g() {
        return this.f16447b;
    }

    /* renamed from: h */
    public void m14916h(ArrayList<LiveStreamsDBModel> arrayList) {
        this.f16448c = arrayList;
    }

    /* renamed from: i */
    public void m14917i(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        this.f16449d = arrayList;
    }

    /* renamed from: j */
    public void m14918j(ArrayList<LiveStreamsDBModel> arrayList) {
        this.f16450e = arrayList;
    }

    /* renamed from: k */
    public void m14919k(String str) {
        this.f16451f = str;
    }

    /* renamed from: l */
    public void m14920l(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        this.f16446a = arrayList;
    }

    /* renamed from: m */
    public void m14921m(ArrayList<LiveStreamsDBModel> arrayList) {
        this.f16447b = arrayList;
    }
}
