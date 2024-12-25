package p279q3;

import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionResponse;
import java.util.List;
import java.util.Map;
import p004a3.InterfaceC0063q;
import p178k3.AbstractC5469h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q3/b.class
 */
/* renamed from: q3.b */
/* loaded from: combined.jar:classes1.jar:q3/b.class */
public interface InterfaceC7751b {
    void addListener(InterfaceC0063q interfaceC0063q, AppSyncSubscriptionCall.Callback callback);

    void removeListener(InterfaceC0063q interfaceC0063q, AppSyncSubscriptionCall.Callback callback);

    <T> void subscribe(InterfaceC0063q<?, T, ?> interfaceC0063q, List<String> list, SubscriptionResponse subscriptionResponse, AbstractC5469h<Map<String, Object>> abstractC5469h);

    void unsubscribe(InterfaceC0063q<?, ?, ?> interfaceC0063q);
}
