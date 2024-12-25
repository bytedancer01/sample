package com.maxdigitall.maxdigitaliptvbox.model.callback;

import java.io.Serializable;
import java.util.Comparator;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.strategy.Name;
import p151if.C5251a;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/GetEpisdoeDetailsCallback.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/GetEpisdoeDetailsCallback.class */
public class GetEpisdoeDetailsCallback implements Serializable {

    /* renamed from: y */
    public static Comparator<GetEpisdoeDetailsCallback> f16461y = new Comparator<GetEpisdoeDetailsCallback>() { // from class: com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback.1
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(GetEpisdoeDetailsCallback getEpisdoeDetailsCallback, GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2) {
            if (C5251a.f30003B == C5251a.f30004C) {
                return getEpisdoeDetailsCallback.m14969u().toUpperCase().compareTo(getEpisdoeDetailsCallback2.m14969u().toUpperCase());
            }
            if (C5251a.f30003B == C5251a.f30005D) {
                return getEpisdoeDetailsCallback2.m14969u().toUpperCase().compareTo(getEpisdoeDetailsCallback.m14969u().toUpperCase());
            }
            if (C5251a.f30003B != C5251a.f30006E) {
                return 0;
            }
            return getEpisdoeDetailsCallback2.m14949a().toUpperCase().compareTo(getEpisdoeDetailsCallback.m14949a().toUpperCase());
        }
    };

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c(Name.MARK)
    public String f16462b;

    /* renamed from: c */
    @InterfaceC5839a
    @InterfaceC5841c(ChartFactory.TITLE)
    public String f16463c;

    /* renamed from: d */
    @InterfaceC5839a
    @InterfaceC5841c("container_extension")
    public String f16464d;

    /* renamed from: e */
    @InterfaceC5839a
    @InterfaceC5841c("custom_sid")
    public String f16465e;

    /* renamed from: f */
    @InterfaceC5839a
    @InterfaceC5841c("added")
    public String f16466f;

    /* renamed from: g */
    @InterfaceC5839a
    @InterfaceC5841c("direct_source")
    public String f16467g;

    /* renamed from: h */
    public String f16468h;

    /* renamed from: i */
    public String f16469i;

    /* renamed from: j */
    public String f16470j;

    /* renamed from: k */
    public String f16471k = "";

    /* renamed from: l */
    public String f16472l;

    /* renamed from: m */
    public String f16473m;

    /* renamed from: n */
    public String f16474n;

    /* renamed from: o */
    public String f16475o;

    /* renamed from: p */
    public String f16476p;

    /* renamed from: q */
    public String f16477q;

    /* renamed from: r */
    public int f16478r;

    /* renamed from: s */
    public String f16479s;

    /* renamed from: t */
    public String f16480t;

    /* renamed from: u */
    public String f16481u;

    /* renamed from: v */
    public String f16482v;

    /* renamed from: w */
    @InterfaceC5839a
    @InterfaceC5841c("season")
    public Integer f16483w;

    /* renamed from: x */
    public Integer f16484x;

    /* renamed from: A */
    public void m14931A(String str) {
        this.f16467g = str;
    }

    /* renamed from: B */
    public void m14932B(String str) {
        this.f16476p = str;
    }

    /* renamed from: C */
    public void m14933C(String str) {
        this.f16477q = str;
    }

    /* renamed from: D */
    public void m14934D(String str) {
        this.f16472l = str;
    }

    /* renamed from: E */
    public void m14935E(Integer num) {
        this.f16484x = num;
    }

    /* renamed from: F */
    public void m14936F(int i10) {
        this.f16478r = i10;
    }

    /* renamed from: G */
    public void m14937G(String str) {
        this.f16462b = str;
    }

    /* renamed from: H */
    public void m14938H(String str) {
        this.f16469i = str;
    }

    /* renamed from: I */
    public void m14939I(String str) {
        this.f16479s = str;
    }

    /* renamed from: J */
    public void m14940J(String str) {
        this.f16480t = str;
    }

    /* renamed from: K */
    public void m14941K(String str) {
        this.f16468h = str;
    }

    /* renamed from: L */
    public void m14942L(String str) {
        this.f16474n = str;
    }

    /* renamed from: M */
    public void m14943M(Integer num) {
        this.f16483w = num;
    }

    /* renamed from: N */
    public void m14944N(String str) {
        this.f16471k = str;
    }

    /* renamed from: O */
    public void m14945O(String str) {
        this.f16473m = str;
    }

    /* renamed from: P */
    public void m14946P(String str) {
        this.f16482v = str;
    }

    /* renamed from: Q */
    public void m14947Q(String str) {
        this.f16481u = str;
    }

    /* renamed from: R */
    public void m14948R(String str) {
        this.f16463c = str;
    }

    /* renamed from: a */
    public String m14949a() {
        return this.f16466f;
    }

    /* renamed from: b */
    public String m14950b() {
        return this.f16470j;
    }

    /* renamed from: c */
    public String m14951c() {
        return this.f16464d;
    }

    /* renamed from: d */
    public String m14952d() {
        return this.f16475o;
    }

    /* renamed from: e */
    public String m14953e() {
        return this.f16476p;
    }

    /* renamed from: f */
    public String m14954f() {
        return this.f16477q;
    }

    /* renamed from: g */
    public String m14955g() {
        return this.f16472l;
    }

    /* renamed from: h */
    public Integer m14956h() {
        return this.f16484x;
    }

    /* renamed from: i */
    public int m14957i() {
        return this.f16478r;
    }

    /* renamed from: j */
    public String m14958j() {
        return this.f16462b;
    }

    /* renamed from: k */
    public String m14959k() {
        return this.f16469i;
    }

    /* renamed from: l */
    public String m14960l() {
        return this.f16479s;
    }

    /* renamed from: m */
    public String m14961m() {
        return this.f16480t;
    }

    /* renamed from: n */
    public String m14962n() {
        return this.f16468h;
    }

    /* renamed from: o */
    public String m14963o() {
        return this.f16474n;
    }

    /* renamed from: p */
    public Integer m14964p() {
        return this.f16483w;
    }

    /* renamed from: q */
    public String m14965q() {
        return this.f16471k;
    }

    /* renamed from: r */
    public String m14966r() {
        return this.f16473m;
    }

    /* renamed from: s */
    public String m14967s() {
        return this.f16482v;
    }

    /* renamed from: t */
    public String m14968t() {
        return this.f16481u;
    }

    /* renamed from: u */
    public String m14969u() {
        return this.f16463c;
    }

    /* renamed from: v */
    public void m14970v(String str) {
        this.f16466f = str;
    }

    /* renamed from: w */
    public void m14971w(String str) {
        this.f16470j = str;
    }

    /* renamed from: x */
    public void m14972x(String str) {
        this.f16464d = str;
    }

    /* renamed from: y */
    public void m14973y(String str) {
        this.f16465e = str;
    }

    /* renamed from: z */
    public void m14974z(String str) {
        this.f16475o = str;
    }
}
