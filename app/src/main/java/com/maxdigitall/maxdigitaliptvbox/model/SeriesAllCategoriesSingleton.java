package com.maxdigitall.maxdigitaliptvbox.model;

import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/SeriesAllCategoriesSingleton.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/SeriesAllCategoriesSingleton.class */
public class SeriesAllCategoriesSingleton {

    /* renamed from: d */
    public static SeriesAllCategoriesSingleton f16439d;

    /* renamed from: a */
    public ArrayList<LiveStreamCategoryIdDBModel> f16440a;

    /* renamed from: b */
    public ArrayList<SeriesDBModel> f16441b;

    /* renamed from: c */
    public List<GetEpisdoeDetailsCallback> f16442c;

    private SeriesAllCategoriesSingleton() {
    }

    /* renamed from: b */
    public static SeriesAllCategoriesSingleton m14899b() {
        if (f16439d == null) {
            f16439d = new SeriesAllCategoriesSingleton();
        }
        return f16439d;
    }

    /* renamed from: a */
    public List<GetEpisdoeDetailsCallback> m14900a() {
        return this.f16442c;
    }

    /* renamed from: c */
    public ArrayList<LiveStreamCategoryIdDBModel> m14901c() {
        return this.f16440a;
    }

    /* renamed from: d */
    public ArrayList<SeriesDBModel> m14902d() {
        return this.f16441b;
    }

    /* renamed from: e */
    public void m14903e(List<GetEpisdoeDetailsCallback> list) {
        this.f16442c = list;
    }

    /* renamed from: f */
    public void m14904f(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        this.f16440a = arrayList;
    }

    /* renamed from: g */
    public void m14905g(ArrayList<SeriesDBModel> arrayList) {
        this.f16441b = arrayList;
    }
}
