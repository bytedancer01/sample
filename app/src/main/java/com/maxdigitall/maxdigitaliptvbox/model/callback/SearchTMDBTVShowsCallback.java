package com.maxdigitall.maxdigitaliptvbox.model.callback;

import com.maxdigitall.maxdigitaliptvbox.model.pojo.SearchTMDBTVShowsResultPojo;
import java.util.List;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/SearchTMDBTVShowsCallback.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/SearchTMDBTVShowsCallback.class */
public class SearchTMDBTVShowsCallback {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("total_results")
    public Integer f16525a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("results")
    public List<SearchTMDBTVShowsResultPojo> f16526b = null;

    /* renamed from: a */
    public List<SearchTMDBTVShowsResultPojo> m15012a() {
        return this.f16526b;
    }

    /* renamed from: b */
    public Integer m15013b() {
        return this.f16525a;
    }
}
