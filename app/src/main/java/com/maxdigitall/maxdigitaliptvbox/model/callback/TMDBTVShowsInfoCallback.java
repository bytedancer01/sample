package com.maxdigitall.maxdigitaliptvbox.model.callback;

import com.maxdigitall.maxdigitaliptvbox.model.pojo.TMDBTVShowsCreatedByPojo;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.TMDBTVShowsGenrePojo;
import java.util.List;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/TMDBTVShowsInfoCallback.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/TMDBTVShowsInfoCallback.class */
public class TMDBTVShowsInfoCallback {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("created_by")
    public List<TMDBTVShowsCreatedByPojo> f16574a = null;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("genres")
    public List<TMDBTVShowsGenrePojo> f16575b = null;

    /* renamed from: a */
    public List<TMDBTVShowsCreatedByPojo> m15079a() {
        return this.f16574a;
    }

    /* renamed from: b */
    public List<TMDBTVShowsGenrePojo> m15080b() {
        return this.f16575b;
    }
}
