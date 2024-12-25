package com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature;

import android.content.Context;
import java.util.List;
import p216m9.AbstractC5995v;
import p216m9.C5941c;
import p216m9.InterfaceC5959i;
import p230n9.C6698a;
import p230n9.C6719h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/CastOptionsProvider.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/CastOptionsProvider.class */
public final class CastOptionsProvider implements InterfaceC5959i {
    @Override // p216m9.InterfaceC5959i
    public List<AbstractC5995v> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // p216m9.InterfaceC5959i
    public C5941c getCastOptions(Context context) {
        return new C5941c.a().m29267c("CC1AD845").m29266b(new C6698a.a().m30863c(new C6719h.a().m30961b(ExpandedControlsActivity.class.getName()).m30960a()).m30862b(ExpandedControlsActivity.class.getName()).m30861a()).m29265a();
    }
}
