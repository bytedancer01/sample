package org.minidns;

import java.io.IOException;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.minidns.util.CallbackRecipient;
import org.minidns.util.ExceptionCallback;
import org.minidns.util.MultipleIoException;
import org.minidns.util.SuccessCallback;

/* loaded from: combined.jar:classes3.jar:org/minidns/MiniDnsFuture.class */
public abstract class MiniDnsFuture<V, E extends Exception> implements Future<V>, CallbackRecipient<V, E> {
    public static final boolean $assertionsDisabled = false;
    private static final ExecutorService EXECUTOR_SERVICE;
    private boolean cancelled;
    public E exception;
    private ExceptionCallback<E> exceptionCallback;
    public V result;
    private SuccessCallback<V> successCallback;

    /* loaded from: combined.jar:classes3.jar:org/minidns/MiniDnsFuture$ExceptionsWrapper.class */
    public interface ExceptionsWrapper<EI extends Exception, EO extends Exception> {
        EO wrap(List<EI> list);
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/MiniDnsFuture$InternalMiniDnsFuture.class */
    public static class InternalMiniDnsFuture<V, E extends Exception> extends MiniDnsFuture<V, E> {
        public final void setException(E e10) {
            synchronized (this) {
                if (isDone()) {
                    return;
                }
                this.exception = e10;
                notifyAll();
                maybeInvokeCallbacks();
            }
        }

        public final void setResult(V v10) {
            synchronized (this) {
                if (isDone()) {
                    return;
                }
                this.result = v10;
                notifyAll();
                maybeInvokeCallbacks();
            }
        }
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: org.minidns.MiniDnsFuture.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setDaemon(true);
                thread.setName("MiniDnsFuture Thread");
                return thread;
            }
        };
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(128);
        RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandler() { // from class: org.minidns.MiniDnsFuture.2
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                runnable.run();
            }
        };
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors <= 4) {
            availableProcessors = 2;
        }
        EXECUTOR_SERVICE = new ThreadPoolExecutor(0, availableProcessors, 60L, TimeUnit.SECONDS, arrayBlockingQueue, threadFactory, rejectedExecutionHandler);
    }

    public static <V> MiniDnsFuture<V, IOException> anySuccessfulOf(Collection<MiniDnsFuture<V, IOException>> collection) {
        return anySuccessfulOf(collection, new ExceptionsWrapper() { // from class: org.minidns.a
            @Override // org.minidns.MiniDnsFuture.ExceptionsWrapper
            public final Exception wrap(List list) {
                IOException iOException;
                iOException = MultipleIoException.toIOException(list);
                return iOException;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V, EI extends Exception, EO extends Exception> MiniDnsFuture<V, EO> anySuccessfulOf(Collection<MiniDnsFuture<V, EI>> collection, ExceptionsWrapper<EI, EO> exceptionsWrapper) {
        InternalMiniDnsFuture internalMiniDnsFuture = new InternalMiniDnsFuture();
        List synchronizedList = Collections.synchronizedList(new ArrayList(collection.size()));
        for (MiniDnsFuture<V, EI> miniDnsFuture : collection) {
            miniDnsFuture.onSuccess(new SuccessCallback<V>(collection, internalMiniDnsFuture) { // from class: org.minidns.MiniDnsFuture.5
                public final Collection val$futures;
                public final InternalMiniDnsFuture val$returnedFuture;

                {
                    this.val$futures = collection;
                    this.val$returnedFuture = internalMiniDnsFuture;
                }

                @Override // org.minidns.util.SuccessCallback
                public void onSuccess(V v10) {
                    Iterator it = this.val$futures.iterator();
                    while (it.hasNext()) {
                        ((MiniDnsFuture) it.next()).cancel(true);
                    }
                    this.val$returnedFuture.setResult(v10);
                }
            });
            miniDnsFuture.onError(new ExceptionCallback<EI>(synchronizedList, collection, exceptionsWrapper, internalMiniDnsFuture) { // from class: org.minidns.MiniDnsFuture.6
                public final List val$exceptions;
                public final ExceptionsWrapper val$exceptionsWrapper;
                public final Collection val$futures;
                public final InternalMiniDnsFuture val$returnedFuture;

                {
                    this.val$exceptions = synchronizedList;
                    this.val$futures = collection;
                    this.val$exceptionsWrapper = exceptionsWrapper;
                    this.val$returnedFuture = internalMiniDnsFuture;
                }

                /* JADX WARN: Incorrect types in method signature: (TEI;)V */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // org.minidns.util.ExceptionCallback
                public void processException(Exception exc) {
                    this.val$exceptions.add(exc);
                    if (this.val$exceptions.size() == this.val$futures.size()) {
                        this.val$returnedFuture.setException(this.val$exceptionsWrapper.wrap(this.val$exceptions));
                    }
                }
            });
        }
        return internalMiniDnsFuture;
    }

    public static <V, E extends Exception> MiniDnsFuture<V, E> from(V v10) {
        InternalMiniDnsFuture internalMiniDnsFuture = new InternalMiniDnsFuture();
        internalMiniDnsFuture.setResult(v10);
        return internalMiniDnsFuture;
    }

    private V getOrThrowExecutionException() {
        V v10 = this.result;
        if (v10 != null) {
            return v10;
        }
        if (this.exception == null) {
            throw new CancellationException();
        }
        throw new ExecutionException(this.exception);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.cancelled = true;
            if (z10) {
                notifyAll();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        V orThrowExecutionException;
        synchronized (this) {
            while (this.result == null && this.exception == null && !this.cancelled) {
                wait();
            }
            orThrowExecutionException = getOrThrowExecutionException();
        }
        return orThrowExecutionException;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        V v10;
        V orThrowExecutionException;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            long millis = timeUnit.toMillis(j10);
            while (true) {
                v10 = this.result;
                if (v10 == null || this.exception == null || this.cancelled) {
                    break;
                }
                long currentTimeMillis2 = (currentTimeMillis + millis) - System.currentTimeMillis();
                if (currentTimeMillis2 > 0) {
                    wait(currentTimeMillis2);
                }
            }
            if (this.cancelled) {
                throw new CancellationException();
            }
            if (v10 == null || this.exception == null) {
                throw new TimeoutException();
            }
            orThrowExecutionException = getOrThrowExecutionException();
        }
        return orThrowExecutionException;
    }

    public final V getOrThrow() {
        V v10;
        synchronized (this) {
            while (true) {
                v10 = this.result;
                if (v10 != null || this.exception != null || this.cancelled) {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
            E e11 = this.exception;
            if (e11 != null) {
                throw e11;
            }
            if (this.cancelled) {
                throw new CancellationException();
            }
        }
        return v10;
    }

    public final boolean hasException() {
        boolean z10;
        synchronized (this) {
            z10 = this.exception != null;
        }
        return z10;
    }

    public final boolean hasResult() {
        boolean z10;
        synchronized (this) {
            z10 = this.result != null;
        }
        return z10;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        boolean z10;
        synchronized (this) {
            z10 = this.cancelled;
        }
        return z10;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        synchronized (this) {
            if (!hasResult()) {
                if (!hasException()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final void maybeInvokeCallbacks() {
        ExecutorService executorService;
        Runnable runnable;
        synchronized (this) {
            if (this.cancelled) {
                return;
            }
            if (this.result == null || this.successCallback == null) {
                if (this.exception != null && this.exceptionCallback != null) {
                    executorService = EXECUTOR_SERVICE;
                    runnable = new Runnable(this) { // from class: org.minidns.MiniDnsFuture.4
                        public final MiniDnsFuture this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.this$0.exceptionCallback.processException(this.this$0.exception);
                        }
                    };
                }
            }
            executorService = EXECUTOR_SERVICE;
            runnable = new Runnable(this) { // from class: org.minidns.MiniDnsFuture.3
                public final MiniDnsFuture this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$0.successCallback.onSuccess(this.this$0.result);
                }
            };
            executorService.submit(runnable);
        }
    }

    @Override // org.minidns.util.CallbackRecipient
    public CallbackRecipient<V, E> onError(ExceptionCallback<E> exceptionCallback) {
        this.exceptionCallback = exceptionCallback;
        maybeInvokeCallbacks();
        return this;
    }

    @Override // org.minidns.util.CallbackRecipient
    public CallbackRecipient<V, E> onSuccess(SuccessCallback<V> successCallback) {
        this.successCallback = successCallback;
        maybeInvokeCallbacks();
        return this;
    }
}
