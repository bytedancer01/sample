package p279q3;

import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionResponse;
import java.util.List;
import java.util.Map;
import p004a3.InterfaceC0063q;
import p178k3.AbstractC5469h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q3/a.class
 */
/* renamed from: q3.a */
/* loaded from: combined.jar:classes1.jar:q3/a.class */
public final class C7750a implements InterfaceC7751b {
    @Override // p279q3.InterfaceC7751b
    public void addListener(InterfaceC0063q interfaceC0063q, AppSyncSubscriptionCall.Callback callback) {
    }

    @Override // p279q3.InterfaceC7751b
    public void removeListener(InterfaceC0063q interfaceC0063q, AppSyncSubscriptionCall.Callback callback) {
    }

    @Override // p279q3.InterfaceC7751b
    public <T> void subscribe(InterfaceC0063q<?, T, ?> interfaceC0063q, List<String> list, SubscriptionResponse subscriptionResponse, AbstractC5469h<Map<String, Object>> abstractC5469h) {
    }

    @Override // p279q3.InterfaceC7751b
    public void unsubscribe(InterfaceC0063q<?, ?, ?> interfaceC0063q) {
        throw new IllegalStateException("Subscription manager is not configured");
    }
}
