package com.maxdigitall.maxdigitaliptvbox.model;

import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeasonsDetailCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/EpisodesUsingSinglton.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/EpisodesUsingSinglton.class */
public class EpisodesUsingSinglton {

    /* renamed from: e */
    public static EpisodesUsingSinglton f16353e;

    /* renamed from: a */
    public List<GetEpisdoeDetailsCallback> f16354a;

    /* renamed from: b */
    public List<GetEpisdoeDetailsCallback> f16355b;

    /* renamed from: c */
    public boolean f16356c = true;

    /* renamed from: d */
    public ArrayList<SeasonsDetailCallback> f16357d;

    private EpisodesUsingSinglton() {
    }

    /* renamed from: c */
    public static EpisodesUsingSinglton m14753c() {
        if (f16353e == null) {
            f16353e = new EpisodesUsingSinglton();
        }
        return f16353e;
    }

    /* renamed from: a */
    public List<GetEpisdoeDetailsCallback> m14754a() {
        return this.f16355b;
    }

    /* renamed from: b */
    public List<GetEpisdoeDetailsCallback> m14755b() {
        return this.f16354a;
    }

    /* renamed from: d */
    public ArrayList<SeasonsDetailCallback> m14756d() {
        return this.f16357d;
    }

    /* renamed from: e */
    public void m14757e(List<GetEpisdoeDetailsCallback> list) {
        this.f16355b = list;
    }

    /* renamed from: f */
    public void m14758f(List<GetEpisdoeDetailsCallback> list) {
        this.f16354a = list;
    }

    /* renamed from: g */
    public void m14759g(ArrayList<SeasonsDetailCallback> arrayList) {
        this.f16357d = arrayList;
    }
}
