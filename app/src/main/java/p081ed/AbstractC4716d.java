package p081ed;

import com.google.auto.value.AutoValue;
import p081ed.C4713a;
import p081ed.C4715c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ed/d.class
 */
@AutoValue
/* renamed from: ed.d */
/* loaded from: combined.jar:classes2.jar:ed/d.class */
public abstract class AbstractC4716d {

    /* renamed from: a */
    public static AbstractC4716d f27756a = m23719a().mo23699a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ed/d$a.class
     */
    @AutoValue.Builder
    /* renamed from: ed.d$a */
    /* loaded from: combined.jar:classes2.jar:ed/d$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC4716d mo23699a();

        /* renamed from: b */
        public abstract a mo23700b(String str);

        /* renamed from: c */
        public abstract a mo23701c(long j10);

        /* renamed from: d */
        public abstract a mo23702d(String str);

        /* renamed from: e */
        public abstract a mo23703e(String str);

        /* renamed from: f */
        public abstract a mo23704f(String str);

        /* renamed from: g */
        public abstract a mo23705g(C4715c.a aVar);

        /* renamed from: h */
        public abstract a mo23706h(long j10);
    }

    /* renamed from: a */
    public static a m23719a() {
        return new C4713a.b().mo23706h(0L).mo23705g(C4715c.a.ATTEMPT_MIGRATION).mo23701c(0L);
    }

    /* renamed from: b */
    public abstract String mo23691b();

    /* renamed from: c */
    public abstract long mo23692c();

    /* renamed from: d */
    public abstract String mo23693d();

    /* renamed from: e */
    public abstract String mo23694e();

    /* renamed from: f */
    public abstract String mo23695f();

    /* renamed from: g */
    public abstract C4715c.a mo23696g();

    /* renamed from: h */
    public abstract long mo23697h();

    /* renamed from: i */
    public boolean m23720i() {
        return mo23696g() == C4715c.a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m23721j() {
        return mo23696g() == C4715c.a.NOT_GENERATED || mo23696g() == C4715c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean m23722k() {
        return mo23696g() == C4715c.a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m23723l() {
        return mo23696g() == C4715c.a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m23724m() {
        return mo23696g() == C4715c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract a mo23698n();

    /* renamed from: o */
    public AbstractC4716d m23725o(String str, long j10, long j11) {
        return mo23698n().mo23700b(str).mo23701c(j10).mo23706h(j11).mo23699a();
    }

    /* renamed from: p */
    public AbstractC4716d m23726p() {
        return mo23698n().mo23700b(null).mo23699a();
    }

    /* renamed from: q */
    public AbstractC4716d m23727q(String str) {
        return mo23698n().mo23703e(str).mo23705g(C4715c.a.REGISTER_ERROR).mo23699a();
    }

    /* renamed from: r */
    public AbstractC4716d m23728r() {
        return mo23698n().mo23705g(C4715c.a.NOT_GENERATED).mo23699a();
    }

    /* renamed from: s */
    public AbstractC4716d m23729s(String str, String str2, long j10, String str3, long j11) {
        return mo23698n().mo23702d(str).mo23705g(C4715c.a.REGISTERED).mo23700b(str3).mo23704f(str2).mo23701c(j11).mo23706h(j10).mo23699a();
    }

    /* renamed from: t */
    public AbstractC4716d m23730t(String str) {
        return mo23698n().mo23702d(str).mo23705g(C4715c.a.UNREGISTERED).mo23699a();
    }
}
