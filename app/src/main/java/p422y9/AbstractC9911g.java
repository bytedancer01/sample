package p422y9;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p350u9.C8808d;
import p350u9.C8812f;
import p383w9.InterfaceC9452e;
import p383w9.InterfaceC9487l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/g.class
 */
/* renamed from: y9.g */
/* loaded from: combined.jar:classes2.jar:y9/g.class */
public abstract class AbstractC9911g<T extends IInterface> extends AbstractC9899c<T> implements C2414a.f, InterfaceC9912g0 {
    private static volatile Executor zaa;
    private final C9902d zab;
    private final Set<Scope> zac;
    private final Account zad;

    public AbstractC9911g(Context context, Handler handler, int i10, C9902d c9902d) {
        super(context, handler, AbstractC9914h.m41790b(context), C8812f.m37675q(), i10, null, null);
        this.zab = (C9902d) C9935o.m41850j(c9902d);
        this.zad = c9902d.m41765a();
        this.zac = zaa(c9902d.m41767c());
    }

    public AbstractC9911g(Context context, Looper looper, int i10, C9902d c9902d) {
        this(context, looper, AbstractC9914h.m41790b(context), C8812f.m37675q(), i10, c9902d, null, null);
    }

    @Deprecated
    public AbstractC9911g(Context context, Looper looper, int i10, C9902d c9902d, GoogleApiClient.InterfaceC2412b interfaceC2412b, GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        this(context, looper, i10, c9902d, (InterfaceC9452e) interfaceC2412b, (InterfaceC9487l) interfaceC2413c);
    }

    public AbstractC9911g(Context context, Looper looper, int i10, C9902d c9902d, InterfaceC9452e interfaceC9452e, InterfaceC9487l interfaceC9487l) {
        this(context, looper, AbstractC9914h.m41790b(context), C8812f.m37675q(), i10, c9902d, (InterfaceC9452e) C9935o.m41850j(interfaceC9452e), (InterfaceC9487l) C9935o.m41850j(interfaceC9487l));
    }

    public AbstractC9911g(Context context, Looper looper, AbstractC9914h abstractC9914h, C8812f c8812f, int i10, C9902d c9902d, InterfaceC9452e interfaceC9452e, InterfaceC9487l interfaceC9487l) {
        super(context, looper, abstractC9914h, c8812f, i10, interfaceC9452e == null ? null : new C9906e0(interfaceC9452e), interfaceC9487l == null ? null : new C9909f0(interfaceC9487l), c9902d.m41772h());
        this.zab = c9902d;
        this.zad = c9902d.m41765a();
        this.zac = zaa(c9902d.m41767c());
    }

    private final Set<Scope> zaa(Set<Scope> set) {
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // p422y9.AbstractC9899c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // p422y9.AbstractC9899c
    public final Executor getBindServiceExecutor() {
        return null;
    }

    public final C9902d getClientSettings() {
        return this.zab;
    }

    public C8808d[] getRequiredFeatures() {
        return new C8808d[0];
    }

    @Override // p422y9.AbstractC9899c
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
