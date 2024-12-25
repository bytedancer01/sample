package p072e3;

import java.util.Map;
import p004a3.C0054h;
import p004a3.InterfaceC0049c;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0052f;
import p004a3.InterfaceC0063q;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e3/c.class
 */
/* renamed from: e3.c */
/* loaded from: combined.jar:classes1.jar:e3/c.class */
public abstract class AbstractC4597c {
    public static final AbstractC4597c DEFAULT = new a();
    public static final C4596b QUERY_ROOT_KEY = C4596b.m23180a("QUERY_ROOT");
    public static final C4596b MUTATION_ROOT_KEY = C4596b.m23180a("MUTATION_ROOT");
    public static final C4596b SUBSCRIPTION_ROOT_KEY = C4596b.m23180a("SUBSCRIPTION_ROOT");

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/c$a.class
     */
    /* renamed from: e3.c$a */
    /* loaded from: combined.jar:classes1.jar:e3/c$a.class */
    public static final class a extends AbstractC4597c {
        @Override // p072e3.AbstractC4597c
        public C4596b fromFieldArguments(C0054h c0054h, InterfaceC0050d.b bVar) {
            return C4596b.f27245b;
        }

        @Override // p072e3.AbstractC4597c
        public C4596b fromFieldRecordSet(C0054h c0054h, Map<String, Object> map) {
            return C4596b.f27245b;
        }
    }

    public static C4596b rootKeyForOperation(InterfaceC0050d interfaceC0050d) {
        if (interfaceC0050d instanceof InterfaceC0052f) {
            return QUERY_ROOT_KEY;
        }
        if (interfaceC0050d instanceof InterfaceC0049c) {
            return MUTATION_ROOT_KEY;
        }
        if (interfaceC0050d instanceof InterfaceC0063q) {
            return SUBSCRIPTION_ROOT_KEY;
        }
        throw new IllegalArgumentException("Unknown operation type.");
    }

    public abstract C4596b fromFieldArguments(C0054h c0054h, InterfaceC0050d.b bVar);

    public abstract C4596b fromFieldRecordSet(C0054h c0054h, Map<String, Object> map);
}
