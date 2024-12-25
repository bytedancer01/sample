package p299r4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Queue;
import p225n4.InterfaceC6650c;
import p280q4.InterfaceC7757f;
import p318s4.InterfaceC8528d;
import p329t3.EnumC8619i;
import p330t4.InterfaceC8628h;
import p330t4.InterfaceC8630j;
import p363v4.C9238d;
import p363v4.C9242h;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9646c;
import p396x3.InterfaceC9650g;
import p416y3.InterfaceC9817c;
import p435z3.C10039c;
import p435z3.EnumC10038b;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r4/a.class
 */
/* renamed from: r4.a */
/* loaded from: combined.jar:classes1.jar:r4/a.class */
public final class C7953a<A, T, Z, R> implements InterfaceC7954b, InterfaceC8628h, InterfaceC7957e {

    /* renamed from: D */
    public static final Queue<C7953a<?, ?, ?, ?>> f38381D = C9242h.m38965c(0);

    /* renamed from: A */
    public C10039c.c f38382A;

    /* renamed from: B */
    public long f38383B;

    /* renamed from: C */
    public a f38384C;

    /* renamed from: a */
    public final String f38385a = String.valueOf(hashCode());

    /* renamed from: b */
    public InterfaceC9646c f38386b;

    /* renamed from: c */
    public Drawable f38387c;

    /* renamed from: d */
    public int f38388d;

    /* renamed from: e */
    public int f38389e;

    /* renamed from: f */
    public int f38390f;

    /* renamed from: g */
    public Context f38391g;

    /* renamed from: h */
    public InterfaceC9650g<Z> f38392h;

    /* renamed from: i */
    public InterfaceC7757f<A, T, Z, R> f38393i;

    /* renamed from: j */
    public InterfaceC7955c f38394j;

    /* renamed from: k */
    public A f38395k;

    /* renamed from: l */
    public Class<R> f38396l;

    /* renamed from: m */
    public boolean f38397m;

    /* renamed from: n */
    public EnumC8619i f38398n;

    /* renamed from: o */
    public InterfaceC8630j<R> f38399o;

    /* renamed from: p */
    public InterfaceC7956d<? super A, R> f38400p;

    /* renamed from: q */
    public float f38401q;

    /* renamed from: r */
    public C10039c f38402r;

    /* renamed from: s */
    public InterfaceC8528d<R> f38403s;

    /* renamed from: t */
    public int f38404t;

    /* renamed from: u */
    public int f38405u;

    /* renamed from: v */
    public EnumC10038b f38406v;

    /* renamed from: w */
    public Drawable f38407w;

    /* renamed from: x */
    public Drawable f38408x;

    /* renamed from: y */
    public boolean f38409y;

    /* renamed from: z */
    public InterfaceC10048l<?> f38410z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r4/a$a.class
     */
    /* renamed from: r4.a$a */
    /* loaded from: combined.jar:classes1.jar:r4/a$a.class */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    /* renamed from: k */
    public static void m34482k(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(" must not be null");
            if (str2 != null) {
                sb2.append(", ");
                sb2.append(str2);
            }
            throw new NullPointerException(sb2.toString());
        }
    }

    /* renamed from: t */
    public static <A, T, Z, R> C7953a<A, T, Z, R> m34483t(InterfaceC7757f<A, T, Z, R> interfaceC7757f, A a10, InterfaceC9646c interfaceC9646c, Context context, EnumC8619i enumC8619i, InterfaceC8630j<R> interfaceC8630j, float f10, Drawable drawable, int i10, Drawable drawable2, int i11, Drawable drawable3, int i12, InterfaceC7956d<? super A, R> interfaceC7956d, InterfaceC7955c interfaceC7955c, C10039c c10039c, InterfaceC9650g<Z> interfaceC9650g, Class<R> cls, boolean z10, InterfaceC8528d<R> interfaceC8528d, int i13, int i14, EnumC10038b enumC10038b) {
        C7953a<?, ?, ?, ?> poll = f38381D.poll();
        C7953a<?, ?, ?, ?> c7953a = poll;
        if (poll == null) {
            c7953a = new C7953a<>();
        }
        c7953a.m34496o(interfaceC7757f, a10, interfaceC9646c, context, enumC8619i, interfaceC8630j, f10, drawable, i10, drawable2, i11, drawable3, i12, interfaceC7956d, interfaceC7955c, c10039c, interfaceC9650g, cls, z10, interfaceC8528d, i13, i14, enumC10038b);
        return (C7953a<A, T, Z, R>) c7953a;
    }

    @Override // p299r4.InterfaceC7957e
    /* renamed from: a */
    public void mo34484a(Exception exc) {
        if (Log.isLoggable("GenericRequest", 3)) {
            Log.d("GenericRequest", "load failed", exc);
        }
        this.f38384C = a.FAILED;
        InterfaceC7956d<? super A, R> interfaceC7956d = this.f38400p;
        if (interfaceC7956d == null || !interfaceC7956d.m34508a(exc, this.f38395k, this.f38399o, m34498q())) {
            m34503w(exc);
        }
    }

    @Override // p299r4.InterfaceC7954b
    /* renamed from: b */
    public void mo34485b() {
        this.f38393i = null;
        this.f38395k = null;
        this.f38391g = null;
        this.f38399o = null;
        this.f38407w = null;
        this.f38408x = null;
        this.f38387c = null;
        this.f38400p = null;
        this.f38394j = null;
        this.f38392h = null;
        this.f38403s = null;
        this.f38409y = false;
        this.f38382A = null;
        f38381D.offer(this);
    }

    @Override // p299r4.InterfaceC7954b
    /* renamed from: c */
    public boolean mo34486c() {
        return isComplete();
    }

    @Override // p299r4.InterfaceC7954b
    public void clear() {
        C9242h.m38963a();
        a aVar = this.f38384C;
        a aVar2 = a.CLEARED;
        if (aVar == aVar2) {
            return;
        }
        m34492j();
        InterfaceC10048l<?> interfaceC10048l = this.f38410z;
        if (interfaceC10048l != null) {
            m34502v(interfaceC10048l);
        }
        if (m34490h()) {
            this.f38399o.mo37044g(m34495n());
        }
        this.f38384C = aVar2;
    }

    @Override // p330t4.InterfaceC8628h
    /* renamed from: d */
    public void mo34487d(int i10, int i11) {
        if (Log.isLoggable("GenericRequest", 2)) {
            m34499r("Got onSizeReady in " + C9238d.m38951a(this.f38383B));
        }
        if (this.f38384C != a.WAITING_FOR_SIZE) {
            return;
        }
        this.f38384C = a.RUNNING;
        int round = Math.round(this.f38401q * i10);
        int round2 = Math.round(this.f38401q * i11);
        InterfaceC9817c<T> mo23227a = this.f38393i.mo33906g().mo23227a(this.f38395k, round, round2);
        if (mo23227a == null) {
            mo34484a(new Exception("Failed to load model: '" + this.f38395k + "'"));
            return;
        }
        InterfaceC6650c<Z, R> mo33905b = this.f38393i.mo33905b();
        if (Log.isLoggable("GenericRequest", 2)) {
            m34499r("finished setup for calling load in " + C9238d.m38951a(this.f38383B));
        }
        boolean z10 = true;
        this.f38409y = true;
        this.f38382A = this.f38402r.m42229g(this.f38386b, round, round2, mo23227a, this.f38393i, this.f38392h, mo33905b, this.f38398n, this.f38397m, this.f38406v, this);
        if (this.f38410z == null) {
            z10 = false;
        }
        this.f38409y = z10;
        if (Log.isLoggable("GenericRequest", 2)) {
            m34499r("finished onSizeReady in " + C9238d.m38951a(this.f38383B));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p299r4.InterfaceC7957e
    /* renamed from: e */
    public void mo34488e(InterfaceC10048l<?> interfaceC10048l) {
        if (interfaceC10048l == null) {
            mo34484a(new Exception("Expected to receive a Resource<R> with an object of " + this.f38396l + " inside, but instead got null."));
            return;
        }
        Object obj = interfaceC10048l.get();
        if (obj != null && this.f38396l.isAssignableFrom(obj.getClass())) {
            if (m34491i()) {
                m34501u(interfaceC10048l, obj);
                return;
            } else {
                m34502v(interfaceC10048l);
                this.f38384C = a.COMPLETE;
                return;
            }
        }
        m34502v(interfaceC10048l);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected to receive an object of ");
        sb2.append(this.f38396l);
        sb2.append(" but instead got ");
        sb2.append(obj != null ? obj.getClass() : "");
        sb2.append("{");
        sb2.append(obj);
        sb2.append("}");
        sb2.append(" inside Resource{");
        sb2.append(interfaceC10048l);
        sb2.append("}.");
        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        mo34484a(new Exception(sb2.toString()));
    }

    @Override // p299r4.InterfaceC7954b
    /* renamed from: f */
    public void mo34489f() {
        this.f38383B = C9238d.m38952b();
        if (this.f38395k == null) {
            mo34484a(null);
            return;
        }
        this.f38384C = a.WAITING_FOR_SIZE;
        if (C9242h.m38973k(this.f38404t, this.f38405u)) {
            mo34487d(this.f38404t, this.f38405u);
        } else {
            this.f38399o.mo37053a(this);
        }
        if (!isComplete() && !m34497p() && m34490h()) {
            this.f38399o.mo37042e(m34495n());
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            m34499r("finished run method in " + C9238d.m38951a(this.f38383B));
        }
    }

    /* renamed from: h */
    public final boolean m34490h() {
        InterfaceC7955c interfaceC7955c = this.f38394j;
        return interfaceC7955c == null || interfaceC7955c.mo34507g(this);
    }

    /* renamed from: i */
    public final boolean m34491i() {
        InterfaceC7955c interfaceC7955c = this.f38394j;
        return interfaceC7955c == null || interfaceC7955c.mo34506e(this);
    }

    @Override // p299r4.InterfaceC7954b
    public boolean isCancelled() {
        a aVar = this.f38384C;
        return aVar == a.CANCELLED || aVar == a.CLEARED;
    }

    @Override // p299r4.InterfaceC7954b
    public boolean isComplete() {
        return this.f38384C == a.COMPLETE;
    }

    @Override // p299r4.InterfaceC7954b
    public boolean isRunning() {
        a aVar = this.f38384C;
        return aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
    }

    /* renamed from: j */
    public void m34492j() {
        this.f38384C = a.CANCELLED;
        C10039c.c cVar = this.f38382A;
        if (cVar != null) {
            cVar.m42234a();
            this.f38382A = null;
        }
    }

    /* renamed from: l */
    public final Drawable m34493l() {
        if (this.f38408x == null && this.f38390f > 0) {
            this.f38408x = this.f38391g.getResources().getDrawable(this.f38390f);
        }
        return this.f38408x;
    }

    /* renamed from: m */
    public final Drawable m34494m() {
        if (this.f38387c == null && this.f38388d > 0) {
            this.f38387c = this.f38391g.getResources().getDrawable(this.f38388d);
        }
        return this.f38387c;
    }

    /* renamed from: n */
    public final Drawable m34495n() {
        if (this.f38407w == null && this.f38389e > 0) {
            this.f38407w = this.f38391g.getResources().getDrawable(this.f38389e);
        }
        return this.f38407w;
    }

    /* renamed from: o */
    public final void m34496o(InterfaceC7757f<A, T, Z, R> interfaceC7757f, A a10, InterfaceC9646c interfaceC9646c, Context context, EnumC8619i enumC8619i, InterfaceC8630j<R> interfaceC8630j, float f10, Drawable drawable, int i10, Drawable drawable2, int i11, Drawable drawable3, int i12, InterfaceC7956d<? super A, R> interfaceC7956d, InterfaceC7955c interfaceC7955c, C10039c c10039c, InterfaceC9650g<Z> interfaceC9650g, Class<R> cls, boolean z10, InterfaceC8528d<R> interfaceC8528d, int i13, int i14, EnumC10038b enumC10038b) {
        InterfaceC9645b<T> mo25841d;
        String str;
        String str2;
        this.f38393i = interfaceC7757f;
        this.f38395k = a10;
        this.f38386b = interfaceC9646c;
        this.f38387c = drawable3;
        this.f38388d = i12;
        this.f38391g = context.getApplicationContext();
        this.f38398n = enumC8619i;
        this.f38399o = interfaceC8630j;
        this.f38401q = f10;
        this.f38407w = drawable;
        this.f38389e = i10;
        this.f38408x = drawable2;
        this.f38390f = i11;
        this.f38400p = interfaceC7956d;
        this.f38394j = interfaceC7955c;
        this.f38402r = c10039c;
        this.f38392h = interfaceC9650g;
        this.f38396l = cls;
        this.f38397m = z10;
        this.f38403s = interfaceC8528d;
        this.f38404t = i13;
        this.f38405u = i14;
        this.f38406v = enumC10038b;
        this.f38384C = a.PENDING;
        if (a10 != null) {
            m34482k("ModelLoader", interfaceC7757f.mo33906g(), "try .using(ModelLoader)");
            m34482k("Transcoder", interfaceC7757f.mo33905b(), "try .as*(Class).transcode(ResourceTranscoder)");
            m34482k("Transformation", interfaceC9650g, "try .transform(UnitTransformation.get())");
            if (enumC10038b.cacheSource()) {
                mo25841d = interfaceC7757f.mo25839a();
                str = "SourceEncoder";
                str2 = "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)";
            } else {
                mo25841d = interfaceC7757f.mo25841d();
                str = "SourceDecoder";
                str2 = "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)";
            }
            m34482k(str, mo25841d, str2);
            if (enumC10038b.cacheSource() || enumC10038b.cacheResult()) {
                m34482k("CacheDecoder", interfaceC7757f.mo25842e(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (enumC10038b.cacheResult()) {
                m34482k("Encoder", interfaceC7757f.mo25840c(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    /* renamed from: p */
    public boolean m34497p() {
        return this.f38384C == a.FAILED;
    }

    @Override // p299r4.InterfaceC7954b
    public void pause() {
        clear();
        this.f38384C = a.PAUSED;
    }

    /* renamed from: q */
    public final boolean m34498q() {
        InterfaceC7955c interfaceC7955c = this.f38394j;
        return interfaceC7955c == null || !interfaceC7955c.mo34504a();
    }

    /* renamed from: r */
    public final void m34499r(String str) {
        Log.v("GenericRequest", str + " this: " + this.f38385a);
    }

    /* renamed from: s */
    public final void m34500s() {
        InterfaceC7955c interfaceC7955c = this.f38394j;
        if (interfaceC7955c != null) {
            interfaceC7955c.mo34505d(this);
        }
    }

    /* renamed from: u */
    public final void m34501u(InterfaceC10048l<?> interfaceC10048l, R r10) {
        boolean m34498q = m34498q();
        this.f38384C = a.COMPLETE;
        this.f38410z = interfaceC10048l;
        InterfaceC7956d<? super A, R> interfaceC7956d = this.f38400p;
        if (interfaceC7956d == null || !interfaceC7956d.m34509b(r10, this.f38395k, this.f38399o, this.f38409y, m34498q)) {
            this.f38399o.mo16635c(r10, this.f38403s.mo36741a(this.f38409y, m34498q));
        }
        m34500s();
        if (Log.isLoggable("GenericRequest", 2)) {
            m34499r("Resource ready in " + C9238d.m38951a(this.f38383B) + " size: " + (interfaceC10048l.getSize() * 9.5367431640625E-7d) + " fromCache: " + this.f38409y);
        }
    }

    /* renamed from: v */
    public final void m34502v(InterfaceC10048l interfaceC10048l) {
        this.f38402r.m42232k(interfaceC10048l);
        this.f38410z = null;
    }

    /* renamed from: w */
    public final void m34503w(Exception exc) {
        if (m34490h()) {
            Drawable m34494m = this.f38395k == null ? m34494m() : null;
            Drawable drawable = m34494m;
            if (m34494m == null) {
                drawable = m34493l();
            }
            Drawable drawable2 = drawable;
            if (drawable == null) {
                drawable2 = m34495n();
            }
            this.f38399o.mo37046i(exc, drawable2);
        }
    }
}
