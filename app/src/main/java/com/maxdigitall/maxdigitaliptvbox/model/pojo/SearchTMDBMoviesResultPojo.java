package com.maxdigitall.maxdigitaliptvbox.model.pojo;

import java.util.List;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.strategy.Name;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/pojo/SearchTMDBMoviesResultPojo.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/pojo/SearchTMDBMoviesResultPojo.class */
public class SearchTMDBMoviesResultPojo {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c(Name.MARK)
    public Integer f16753a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("vote_average")
    public Double f16754b;

    /* renamed from: c */
    @InterfaceC5839a
    @InterfaceC5841c(ChartFactory.TITLE)
    public String f16755c;

    /* renamed from: d */
    @InterfaceC5839a
    @InterfaceC5841c("original_title")
    public String f16756d;

    /* renamed from: e */
    @InterfaceC5839a
    @InterfaceC5841c("genre_ids")
    public List<Integer> f16757e = null;

    /* renamed from: f */
    @InterfaceC5839a
    @InterfaceC5841c("backdrop_path")
    public String f16758f;

    /* renamed from: g */
    @InterfaceC5839a
    @InterfaceC5841c("overview")
    public String f16759g;

    /* renamed from: h */
    @InterfaceC5839a
    @InterfaceC5841c("release_date")
    public String f16760h;

    /* renamed from: a */
    public String m15465a() {
        return this.f16758f;
    }

    /* renamed from: b */
    public Integer m15466b() {
        return this.f16753a;
    }

    /* renamed from: c */
    public String m15467c() {
        return this.f16756d;
    }

    /* renamed from: d */
    public String m15468d() {
        return this.f16759g;
    }

    /* renamed from: e */
    public String m15469e() {
        return this.f16760h;
    }

    /* renamed from: f */
    public String m15470f() {
        return this.f16755c;
    }

    /* renamed from: g */
    public Double m15471g() {
        return this.f16754b;
    }
}
