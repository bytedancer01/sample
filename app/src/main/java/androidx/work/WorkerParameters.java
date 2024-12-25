package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p071e2.AbstractC4594w;
import p071e2.InterfaceC4577f;
import p071e2.InterfaceC4587p;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/WorkerParameters.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/WorkerParameters.class */
public final class WorkerParameters {

    /* renamed from: a */
    public UUID f5146a;

    /* renamed from: b */
    public C0757b f5147b;

    /* renamed from: c */
    public Set<String> f5148c;

    /* renamed from: d */
    public C0755a f5149d;

    /* renamed from: e */
    public int f5150e;

    /* renamed from: f */
    public Executor f5151f;

    /* renamed from: g */
    public InterfaceC7748a f5152g;

    /* renamed from: h */
    public AbstractC4594w f5153h;

    /* renamed from: i */
    public InterfaceC4587p f5154i;

    /* renamed from: j */
    public InterfaceC4577f f5155j;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/WorkerParameters$a.class
     */
    /* renamed from: androidx.work.WorkerParameters$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/WorkerParameters$a.class */
    public static class C0755a {

        /* renamed from: a */
        public List<String> f5156a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f5157b = Collections.emptyList();

        /* renamed from: c */
        public Network f5158c;
    }

    public WorkerParameters(UUID uuid, C0757b c0757b, Collection<String> collection, C0755a c0755a, int i10, Executor executor, InterfaceC7748a interfaceC7748a, AbstractC4594w abstractC4594w, InterfaceC4587p interfaceC4587p, InterfaceC4577f interfaceC4577f) {
        this.f5146a = uuid;
        this.f5147b = c0757b;
        this.f5148c = new HashSet(collection);
        this.f5149d = c0755a;
        this.f5150e = i10;
        this.f5151f = executor;
        this.f5152g = interfaceC7748a;
        this.f5153h = abstractC4594w;
        this.f5154i = interfaceC4587p;
        this.f5155j = interfaceC4577f;
    }

    /* renamed from: a */
    public Executor m4843a() {
        return this.f5151f;
    }

    /* renamed from: b */
    public InterfaceC4577f m4844b() {
        return this.f5155j;
    }

    /* renamed from: c */
    public UUID m4845c() {
        return this.f5146a;
    }

    /* renamed from: d */
    public C0757b m4846d() {
        return this.f5147b;
    }

    /* renamed from: e */
    public InterfaceC7748a m4847e() {
        return this.f5152g;
    }

    /* renamed from: f */
    public AbstractC4594w m4848f() {
        return this.f5153h;
    }
}
