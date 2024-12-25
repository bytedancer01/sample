package p237o2;

import androidx.work.WorkerParameters;
import p089f2.C4759i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/j.class
 */
/* renamed from: o2.j */
/* loaded from: combined.jar:classes1.jar:o2/j.class */
public class RunnableC6877j implements Runnable {

    /* renamed from: b */
    public C4759i f35641b;

    /* renamed from: c */
    public String f35642c;

    /* renamed from: d */
    public WorkerParameters.C0755a f35643d;

    public RunnableC6877j(C4759i c4759i, String str, WorkerParameters.C0755a c0755a) {
        this.f35641b = c4759i;
        this.f35642c = str;
        this.f35643d = c0755a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f35641b.m24117o().m24080k(this.f35642c, this.f35643d);
    }
}
