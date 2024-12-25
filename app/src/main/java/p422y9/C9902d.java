package p422y9;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p294r.C7929b;
import p384wa.C9551a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/d.class
 */
/* renamed from: y9.d */
/* loaded from: combined.jar:classes2.jar:y9/d.class */
public final class C9902d {

    /* renamed from: a */
    public final Account f45526a;

    /* renamed from: b */
    public final Set<Scope> f45527b;

    /* renamed from: c */
    public final Set<Scope> f45528c;

    /* renamed from: d */
    public final Map<C2414a<?>, C9964z> f45529d;

    /* renamed from: e */
    public final int f45530e;

    /* renamed from: f */
    public final View f45531f;

    /* renamed from: g */
    public final String f45532g;

    /* renamed from: h */
    public final String f45533h;

    /* renamed from: i */
    public final C9551a f45534i;

    /* renamed from: j */
    public Integer f45535j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y9/d$a.class
     */
    /* renamed from: y9.d$a */
    /* loaded from: combined.jar:classes2.jar:y9/d$a.class */
    public static final class a {

        /* renamed from: a */
        public Account f45536a;

        /* renamed from: b */
        public C7929b<Scope> f45537b;

        /* renamed from: c */
        public String f45538c;

        /* renamed from: d */
        public String f45539d;

        /* renamed from: e */
        public C9551a f45540e = C9551a.f43514k;

        /* renamed from: a */
        public C9902d m41775a() {
            return new C9902d(this.f45536a, this.f45537b, null, 0, null, this.f45538c, this.f45539d, this.f45540e, false);
        }

        /* renamed from: b */
        public a m41776b(String str) {
            this.f45538c = str;
            return this;
        }

        /* renamed from: c */
        public final a m41777c(Collection<Scope> collection) {
            if (this.f45537b == null) {
                this.f45537b = new C7929b<>();
            }
            this.f45537b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final a m41778d(Account account) {
            this.f45536a = account;
            return this;
        }

        /* renamed from: e */
        public final a m41779e(String str) {
            this.f45539d = str;
            return this;
        }
    }

    public C9902d(Account account, Set<Scope> set, Map<C2414a<?>, C9964z> map, int i10, View view, String str, String str2, C9551a c9551a, boolean z10) {
        this.f45526a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f45527b = emptySet;
        Map<C2414a<?>, C9964z> emptyMap = map == null ? Collections.emptyMap() : map;
        this.f45529d = emptyMap;
        this.f45531f = view;
        this.f45530e = i10;
        this.f45532g = str;
        this.f45533h = str2;
        this.f45534i = c9551a == null ? C9551a.f43514k : c9551a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator<C9964z> it = emptyMap.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f45657a);
        }
        this.f45528c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m41765a() {
        return this.f45526a;
    }

    /* renamed from: b */
    public Account m41766b() {
        Account account = this.f45526a;
        return account != null ? account : new Account(AbstractC9899c.DEFAULT_ACCOUNT, "com.google");
    }

    /* renamed from: c */
    public Set<Scope> m41767c() {
        return this.f45528c;
    }

    /* renamed from: d */
    public String m41768d() {
        return this.f45532g;
    }

    /* renamed from: e */
    public Set<Scope> m41769e() {
        return this.f45527b;
    }

    /* renamed from: f */
    public final C9551a m41770f() {
        return this.f45534i;
    }

    /* renamed from: g */
    public final Integer m41771g() {
        return this.f45535j;
    }

    /* renamed from: h */
    public final String m41772h() {
        return this.f45533h;
    }

    /* renamed from: i */
    public final Map<C2414a<?>, C9964z> m41773i() {
        return this.f45529d;
    }

    /* renamed from: j */
    public final void m41774j(Integer num) {
        this.f45535j = num;
    }
}
