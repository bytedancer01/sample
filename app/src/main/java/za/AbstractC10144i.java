package za;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/i.class
 */
/* renamed from: za.i */
/* loaded from: combined.jar:classes2.jar:za/i.class */
public abstract class AbstractC10144i<TResult> {
    /* renamed from: a */
    public AbstractC10144i<TResult> mo42552a(Executor executor, InterfaceC10132c interfaceC10132c) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public AbstractC10144i<TResult> mo42553b(Executor executor, InterfaceC10134d<TResult> interfaceC10134d) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public AbstractC10144i<TResult> mo42554c(InterfaceC10134d<TResult> interfaceC10134d) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract AbstractC10144i<TResult> mo42555d(Executor executor, InterfaceC10136e interfaceC10136e);

    /* renamed from: e */
    public abstract AbstractC10144i<TResult> mo42556e(InterfaceC10136e interfaceC10136e);

    /* renamed from: f */
    public abstract AbstractC10144i<TResult> mo42557f(Executor executor, InterfaceC10138f<? super TResult> interfaceC10138f);

    /* renamed from: g */
    public abstract AbstractC10144i<TResult> mo42558g(InterfaceC10138f<? super TResult> interfaceC10138f);

    /* renamed from: h */
    public <TContinuationResult> AbstractC10144i<TContinuationResult> mo42559h(Executor executor, InterfaceC10128a<TResult, TContinuationResult> interfaceC10128a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: i */
    public <TContinuationResult> AbstractC10144i<TContinuationResult> mo42560i(InterfaceC10128a<TResult, TContinuationResult> interfaceC10128a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: j */
    public <TContinuationResult> AbstractC10144i<TContinuationResult> mo42561j(Executor executor, InterfaceC10128a<TResult, AbstractC10144i<TContinuationResult>> interfaceC10128a) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: k */
    public abstract Exception mo42562k();

    /* renamed from: l */
    public abstract TResult mo42563l();

    /* renamed from: m */
    public abstract <X extends Throwable> TResult mo42564m(Class<X> cls);

    /* renamed from: n */
    public abstract boolean mo42565n();

    /* renamed from: o */
    public abstract boolean mo42566o();

    /* renamed from: p */
    public abstract boolean mo42567p();

    /* renamed from: q */
    public <TContinuationResult> AbstractC10144i<TContinuationResult> mo42568q(Executor executor, InterfaceC10142h<TResult, TContinuationResult> interfaceC10142h) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
