package cf;

import android.util.Log;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cf/k.class
 */
/* renamed from: cf.k */
/* loaded from: combined.jar:classes2.jar:cf/k.class */
public class C1087k {

    /* renamed from: a */
    public final Lock f7260a;

    /* renamed from: b */
    public Condition f7261b;

    /* renamed from: c */
    public boolean f7262c;

    /* renamed from: d */
    public boolean f7263d;

    public C1087k() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f7260a = reentrantLock;
        this.f7261b = reentrantLock.newCondition();
        this.f7262c = false;
        this.f7263d = false;
    }

    /* renamed from: a */
    public void m6476a() {
        this.f7260a.lock();
        try {
            Log.v("ThreadControl", "Cancelling");
            if (this.f7263d) {
                return;
            }
            this.f7263d = true;
            this.f7261b.signalAll();
        } finally {
            this.f7260a.unlock();
        }
    }

    /* renamed from: b */
    public boolean m6477b() {
        return this.f7263d;
    }

    /* renamed from: c */
    public void m6478c() {
        this.f7260a.lock();
        Log.v("ThreadControl", "Pausing");
        this.f7262c = true;
        this.f7260a.unlock();
    }

    /* renamed from: d */
    public void m6479d() {
        this.f7260a.lock();
        try {
            Log.v("ThreadControl", "Resuming");
            if (this.f7262c) {
                this.f7262c = false;
                this.f7261b.signalAll();
            }
        } finally {
            this.f7260a.unlock();
        }
    }

    /* renamed from: e */
    public void m6480e() {
        this.f7260a.lock();
        while (this.f7262c && !this.f7263d) {
            try {
                Log.v("ThreadControl", "Going to wait");
                this.f7261b.await();
                Log.v("ThreadControl", "Done waiting");
            } finally {
                this.f7260a.unlock();
            }
        }
    }
}
