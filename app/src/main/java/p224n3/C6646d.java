package p224n3;

import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p004a3.C0053g;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0063q;
import p109g3.C4936b;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p178k3.AbstractC5469h;
import p238o3.C6884a;
import p238o3.C6885b;
import p279q3.InterfaceC7751b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n3/d.class
 */
/* renamed from: n3.d */
/* loaded from: combined.jar:classes1.jar:n3/d.class */
public class C6646d implements InterfaceC5168a {

    /* renamed from: a */
    public final InterfaceC7751b f34668a;

    /* renamed from: b */
    public final AbstractC5469h<Map<String, Object>> f34669b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n3/d$a.class
     */
    /* renamed from: n3.d$a */
    /* loaded from: combined.jar:classes1.jar:n3/d$a.class */
    public class a implements InterfaceC5168a.a {

        /* renamed from: a */
        public final Executor f34670a;

        /* renamed from: b */
        public final InterfaceC5168a.c f34671b;

        /* renamed from: c */
        public final InterfaceC5168a.a f34672c;

        /* renamed from: d */
        public final C6646d f34673d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:n3/d$a$a.class
         */
        /* renamed from: n3.d$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:n3/d$a$a.class */
        public class RunnableC10325a implements Runnable {

            /* renamed from: b */
            public final InterfaceC5168a.d f34674b;

            /* renamed from: c */
            public final a f34675c;

            public RunnableC10325a(a aVar, InterfaceC5168a.d dVar) {
                this.f34675c = aVar;
                this.f34674b = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                Map<String, Object> map;
                try {
                    try {
                        map = C6884a.m31726c(new C6885b(this.f34674b.f29544a.mo5881e().m26920f().mo22899v())).m31794u();
                        try {
                            Map map2 = (Map) ((Map) map.get("extensions")).get("subscription");
                            List<Map> list = (List) map2.get("mqttConnections");
                            ArrayList arrayList = new ArrayList();
                            for (Map map3 : ((Map) map2.get("newSubscriptions")).values()) {
                                if (map3.containsKey("topic")) {
                                    arrayList.add((String) map3.get("topic"));
                                }
                            }
                            SubscriptionResponse subscriptionResponse = new SubscriptionResponse();
                            for (Map map4 : list) {
                                subscriptionResponse.add(new SubscriptionResponse.MqttInfo((String) map4.get("client"), (String) map4.get("url"), (String[]) ((List) map4.get("topics")).toArray(new String[0])));
                            }
                            InterfaceC7751b interfaceC7751b = this.f34675c.f34673d.f34668a;
                            a aVar = this.f34675c;
                            interfaceC7751b.subscribe((InterfaceC0063q) aVar.f34671b.f29536b, arrayList, subscriptionResponse, aVar.f34673d.f34669b);
                            a aVar2 = this.f34675c;
                            this.f34675c.f34672c.onResponse(new InterfaceC5168a.d(this.f34674b.f29544a.mo5881e(), aVar2.f34673d.m30650d(aVar2.f34671b.f29536b, this.f34674b), null));
                        } catch (Exception e10) {
                            e = e10;
                            try {
                                this.f34675c.f34672c.onFailure(new C4936b("Failed to parse subscription response: " + map, e));
                            } catch (Exception e11) {
                                this.f34675c.f34672c.onFailure(new C4936b("Failed to parse subscription response, failed to get body string", e));
                            }
                        }
                    } finally {
                        this.f34675c.f34672c.onCompleted();
                    }
                } catch (Exception e12) {
                    e = e12;
                    map = null;
                }
            }
        }

        public a(C6646d c6646d, Executor executor, InterfaceC5168a.c cVar, InterfaceC5168a.a aVar) {
            this.f34673d = c6646d;
            this.f34670a = executor;
            this.f34671b = cVar;
            this.f34672c = aVar;
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onCompleted() {
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onFailure(C4936b c4936b) {
            this.f34672c.onFailure(c4936b);
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onFetch(InterfaceC5168a.b bVar) {
            this.f34672c.onFetch(bVar);
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onResponse(InterfaceC5168a.d dVar) {
            this.f34670a.execute(new RunnableC10325a(this, dVar));
        }
    }

    public C6646d(InterfaceC7751b interfaceC7751b, AbstractC5469h<Map<String, Object>> abstractC5469h) {
        this.f34668a = interfaceC7751b;
        this.f34669b = abstractC5469h;
    }

    /* renamed from: d */
    public final <W> C0053g<W> m30650d(InterfaceC0050d<?, W, ?> interfaceC0050d, InterfaceC5168a.d dVar) {
        return C0053g.m210a(interfaceC0050d).m222g(null).m221f();
    }

    @Override // p141i3.InterfaceC5168a
    public void dispose() {
    }

    @Override // p141i3.InterfaceC5168a
    public void interceptAsync(InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor, InterfaceC5168a.a aVar) {
        if (cVar.f29536b instanceof InterfaceC0063q) {
            interfaceC5169b.mo25821a(cVar, executor, new a(this, executor, cVar, aVar));
        } else {
            interfaceC5169b.mo25821a(cVar, executor, aVar);
        }
    }
}
