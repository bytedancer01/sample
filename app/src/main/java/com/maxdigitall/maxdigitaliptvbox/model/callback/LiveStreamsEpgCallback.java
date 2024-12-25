package com.maxdigitall.maxdigitaliptvbox.model.callback;

import com.maxdigitall.maxdigitaliptvbox.model.pojo.EpgListingPojo;
import java.io.Serializable;
import java.util.List;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/LiveStreamsEpgCallback.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/LiveStreamsEpgCallback.class */
public class LiveStreamsEpgCallback implements Serializable {

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("epg_listings")
    public List<EpgListingPojo> f16520b = null;

    /* renamed from: a */
    public List<EpgListingPojo> m15007a() {
        return this.f16520b;
    }
}
