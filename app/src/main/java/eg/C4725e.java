package eg;

import com.onesignal.C4162k3;
import com.onesignal.C4235w3;
import com.onesignal.InterfaceC4108b3;
import com.onesignal.InterfaceC4216t2;
import com.onesignal.InterfaceC4239x1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kh.C5617k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p065dg.C4456a;
import p103fg.C4857a;
import p103fg.EnumC4858b;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:eg/e.class
 */
/* renamed from: eg.e */
/* loaded from: combined.jar:classes2.jar:eg/e.class */
public final class C4725e {

    /* renamed from: a */
    @NotNull
    public final ConcurrentHashMap<String, AbstractC4721a> f27792a;

    /* renamed from: b */
    @NotNull
    public final C4723c f27793b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:eg/e$a.class
     */
    /* renamed from: eg.e$a */
    /* loaded from: combined.jar:classes2.jar:eg/e$a.class */
    public final /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f27794a;

        static {
            int[] iArr = new int[EnumC4858b.values().length];
            iArr[EnumC4858b.NOTIFICATION.ordinal()] = 1;
            iArr[EnumC4858b.IAM.ordinal()] = 2;
            f27794a = iArr;
        }
    }

    public C4725e(@NotNull InterfaceC4216t2 interfaceC4216t2, @NotNull InterfaceC4239x1 interfaceC4239x1, @NotNull InterfaceC4108b3 interfaceC4108b3) {
        C9367f.m39526e(interfaceC4216t2, "preferences");
        C9367f.m39526e(interfaceC4239x1, "logger");
        C9367f.m39526e(interfaceC4108b3, "timeProvider");
        ConcurrentHashMap<String, AbstractC4721a> concurrentHashMap = new ConcurrentHashMap<>();
        this.f27792a = concurrentHashMap;
        C4723c c4723c = new C4723c(interfaceC4216t2);
        this.f27793b = c4723c;
        C4456a c4456a = C4456a.f26865a;
        concurrentHashMap.put(c4456a.m22613a(), new C4722b(c4723c, interfaceC4239x1, interfaceC4108b3));
        concurrentHashMap.put(c4456a.m22614b(), new C4724d(c4723c, interfaceC4239x1, interfaceC4108b3));
    }

    /* renamed from: a */
    public final void m23835a(@NotNull JSONObject jSONObject, @NotNull List<C4857a> list) {
        C9367f.m39526e(jSONObject, "jsonObject");
        C9367f.m39526e(list, "influences");
        for (C4857a c4857a : list) {
            if (a.f27794a[c4857a.m24723c().ordinal()] == 1) {
                m23841g().mo23792a(jSONObject, c4857a);
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public final AbstractC4721a m23836b(@NotNull C4162k3.s sVar) {
        C9367f.m39526e(sVar, "entryAction");
        return sVar.isNotificationClick() ? m23841g() : null;
    }

    @NotNull
    /* renamed from: c */
    public final List<AbstractC4721a> m23837c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m23841g());
        arrayList.add(m23839e());
        return arrayList;
    }

    @NotNull
    /* renamed from: d */
    public final List<AbstractC4721a> m23838d(@NotNull C4162k3.s sVar) {
        C9367f.m39526e(sVar, "entryAction");
        ArrayList arrayList = new ArrayList();
        if (sVar.isAppClose()) {
            return arrayList;
        }
        AbstractC4721a m23841g = sVar.isAppOpen() ? m23841g() : null;
        if (m23841g != null) {
            arrayList.add(m23841g);
        }
        arrayList.add(m23839e());
        return arrayList;
    }

    @NotNull
    /* renamed from: e */
    public final AbstractC4721a m23839e() {
        AbstractC4721a abstractC4721a = this.f27792a.get(C4456a.f26865a.m22613a());
        C9367f.m39524c(abstractC4721a);
        C9367f.m39525d(abstractC4721a, "trackers[OSInfluenceConstants.IAM_TAG]!!");
        return abstractC4721a;
    }

    @NotNull
    /* renamed from: f */
    public final List<C4857a> m23840f() {
        Collection<AbstractC4721a> values = this.f27792a.values();
        C9367f.m39525d(values, "trackers.values");
        ArrayList arrayList = new ArrayList(C5617k.m27708n(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC4721a) it.next()).m23796e());
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: g */
    public final AbstractC4721a m23841g() {
        AbstractC4721a abstractC4721a = this.f27792a.get(C4456a.f26865a.m22614b());
        C9367f.m39524c(abstractC4721a);
        C9367f.m39525d(abstractC4721a, "trackers[OSInfluenceConstants.NOTIFICATION_TAG]!!");
        return abstractC4721a;
    }

    @NotNull
    /* renamed from: h */
    public final List<C4857a> m23842h() {
        Collection<AbstractC4721a> values = this.f27792a.values();
        C9367f.m39525d(values, "trackers.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!C9367f.m39522a(((AbstractC4721a) obj).mo23799h(), C4456a.f26865a.m22613a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C5617k.m27708n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC4721a) it.next()).m23796e());
        }
        return arrayList2;
    }

    /* renamed from: i */
    public final void m23843i() {
        Collection<AbstractC4721a> values = this.f27792a.values();
        C9367f.m39525d(values, "trackers.values");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((AbstractC4721a) it.next()).mo23807p();
        }
    }

    /* renamed from: j */
    public final void m23844j(@NotNull C4235w3.e eVar) {
        C9367f.m39526e(eVar, "influenceParams");
        this.f27793b.m23833q(eVar);
    }
}
