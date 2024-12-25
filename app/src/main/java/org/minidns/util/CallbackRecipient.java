package org.minidns.util;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/CallbackRecipient.class */
public interface CallbackRecipient<V, E> {
    CallbackRecipient<V, E> onError(ExceptionCallback<E> exceptionCallback);

    CallbackRecipient<V, E> onSuccess(SuccessCallback<V> successCallback);
}
