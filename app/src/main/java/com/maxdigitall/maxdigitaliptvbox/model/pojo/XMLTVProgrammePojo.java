package com.maxdigitall.maxdigitaliptvbox.model.pojo;

import java.io.Serializable;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/pojo/XMLTVProgrammePojo.class
 */
@Root(name = "programme", strict = false)
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/pojo/XMLTVProgrammePojo.class */
public class XMLTVProgrammePojo implements Serializable {

    /* renamed from: b */
    @Attribute(name = "start", required = false)
    public String f16793b;

    /* renamed from: c */
    @Attribute(name = "channel", required = false)
    public String f16794c;

    /* renamed from: d */
    @Attribute(name = "stop", required = false)
    public String f16795d;

    /* renamed from: e */
    @Text(required = false)
    @Path(ChartFactory.TITLE)
    public String f16796e;

    /* renamed from: f */
    @Text(required = false)
    @Path("desc")
    public String f16797f;

    /* renamed from: g */
    @Text(required = false)
    @Path("category")
    public String f16798g;

    /* renamed from: h */
    @Text(required = false)
    @Path("episode-num")
    public String f16799h;

    /* renamed from: i */
    @Text(required = false)
    @Path("date")
    public String f16800i;

    /* renamed from: j */
    @Text(required = false)
    @Path("sub-title")
    public String f16801j;

    /* renamed from: k */
    @Text(required = false)
    @Path("icon")
    public String f16802k;

    /* renamed from: l */
    @Text(required = false)
    @Path("country")
    public String f16803l;

    /* renamed from: m */
    public String f16804m = "";

    /* renamed from: n */
    public String f16805n = "";

    /* renamed from: o */
    public String f16806o = "";

    /* renamed from: p */
    public String f16807p = "";

    /* renamed from: q */
    public String f16808q = "";

    /* renamed from: r */
    public String f16809r = "";

    /* renamed from: s */
    public String f16810s = "";

    /* renamed from: t */
    public String f16811t;

    /* renamed from: u */
    public String f16812u;

    /* renamed from: A */
    public void m15501A(String str) {
        this.f16796e = str;
    }

    /* renamed from: B */
    public void m15502B(String str) {
        this.f16809r = str;
    }

    /* renamed from: a */
    public String m15503a() {
        return this.f16794c;
    }

    /* renamed from: b */
    public String m15504b() {
        return this.f16797f;
    }

    /* renamed from: c */
    public String m15505c() {
        return this.f16812u;
    }

    /* renamed from: d */
    public String m15506d() {
        return this.f16808q;
    }

    /* renamed from: e */
    public String m15507e() {
        return this.f16805n;
    }

    /* renamed from: f */
    public String m15508f() {
        return this.f16804m;
    }

    /* renamed from: g */
    public String m15509g() {
        return this.f16807p;
    }

    /* renamed from: h */
    public String m15510h() {
        return this.f16806o;
    }

    /* renamed from: i */
    public String m15511i() {
        return this.f16810s;
    }

    /* renamed from: j */
    public String m15512j() {
        return this.f16793b;
    }

    /* renamed from: k */
    public String m15513k() {
        return this.f16811t;
    }

    /* renamed from: l */
    public String m15514l() {
        return this.f16795d;
    }

    /* renamed from: m */
    public String m15515m() {
        return this.f16796e;
    }

    /* renamed from: n */
    public String m15516n() {
        return this.f16809r;
    }

    /* renamed from: o */
    public void m15517o(String str) {
        this.f16794c = str;
    }

    /* renamed from: p */
    public void m15518p(String str) {
        this.f16797f = str;
    }

    /* renamed from: q */
    public void m15519q(String str) {
        this.f16812u = str;
    }

    /* renamed from: r */
    public void m15520r(String str) {
        this.f16808q = str;
    }

    /* renamed from: s */
    public void m15521s(String str) {
        this.f16805n = str;
    }

    /* renamed from: t */
    public void m15522t(String str) {
        this.f16804m = str;
    }

    public String toString() {
        return "ClassPojo [stop = " + this.f16795d + ",  title = " + this.f16796e + ", category = " + this.f16798g + ", episode-num = " + this.f16799h + ", date = " + this.f16800i + ", country = " + this.f16803l + ", icon = " + this.f16802k + ", sub-title = " + this.f16801j + ",desc = " + this.f16797f + ", start = " + this.f16793b + ", channel = " + this.f16794c + "]";
    }

    /* renamed from: u */
    public void m15523u(String str) {
        this.f16807p = str;
    }

    /* renamed from: v */
    public void m15524v(String str) {
        this.f16806o = str;
    }

    /* renamed from: w */
    public void m15525w(String str) {
        this.f16810s = str;
    }

    /* renamed from: x */
    public void m15526x(String str) {
        this.f16793b = str;
    }

    /* renamed from: y */
    public void m15527y(String str) {
        this.f16811t = str;
    }

    /* renamed from: z */
    public void m15528z(String str) {
        this.f16795d = str;
    }
}
