package p449zi;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: zi.c */
/* loaded from: combined.jar:classes3.jar:zi/c.class */
public final class C10243c extends ScheduledThreadPoolExecutor {

    /* renamed from: zi.c$b */
    /* loaded from: combined.jar:classes3.jar:zi/c$b.class */
    public static final class b {

        /* renamed from: a */
        public static final C10243c f46842a = new C10243c();
    }

    public C10243c() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    /* renamed from: a */
    public static C10243c m42843a() {
        return b.f46842a;
    }
}
