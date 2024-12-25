package com.maxdigitall.maxdigitaliptvbox.model.callback;

import com.maxdigitall.maxdigitaliptvbox.model.pojo.SearchTMDBMoviesResultPojo;
import java.util.List;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/SearchTMDBMoviesCallback.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/SearchTMDBMoviesCallback.class */
public class SearchTMDBMoviesCallback {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("total_results")
    public Integer f16523a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("results")
    public List<SearchTMDBMoviesResultPojo> f16524b = null;

    /* renamed from: a */
    public List<SearchTMDBMoviesResultPojo> m15010a() {
        return this.f16524b;
    }

    /* renamed from: b */
    public Integer m15011b() {
        return this.f16523a;
    }
}
