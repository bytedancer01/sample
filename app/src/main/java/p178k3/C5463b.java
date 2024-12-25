package p178k3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0058l;
import p072e3.C4603i;
import p264p3.C7550d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k3/b.class
 */
/* renamed from: k3.b */
/* loaded from: combined.jar:classes1.jar:k3/b.class */
public final class C5463b implements InterfaceC0058l {

    /* renamed from: a */
    public final C7550d f31209a;

    /* renamed from: b */
    public final Map<String, b> f31210b = new LinkedHashMap();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/b$a.class
     */
    /* renamed from: k3.b$a */
    /* loaded from: combined.jar:classes1.jar:k3/b$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f31211a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                a3.h$a[] r0 = p004a3.C0054h.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p178k3.C5463b.a.f31211a = r0
                r0 = r4
                a3.h$a r1 = p004a3.C0054h.a.OBJECT     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = p178k3.C5463b.a.f31211a     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                a3.h$a r1 = p004a3.C0054h.a.LIST     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: p178k3.C5463b.a.m44713clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/b$b.class
     */
    /* renamed from: k3.b$b */
    /* loaded from: combined.jar:classes1.jar:k3/b$b.class */
    public static class b {

        /* renamed from: a */
        public final Object f31212a;
    }

    public C5463b(InterfaceC0050d.b bVar, C7550d c7550d) {
        this.f31209a = c7550d;
    }

    /* renamed from: a */
    public Collection<C4603i> m27225a(AbstractC5469h<Map<String, Object>> abstractC5469h) {
        m27226b(null, abstractC5469h, this.f31210b);
        return abstractC5469h.mo27271c();
    }

    /* renamed from: b */
    public final void m27226b(InterfaceC0050d.b bVar, AbstractC5469h<Map<String, Object>> abstractC5469h, Map<String, b> map) {
        Map<String, Object> m27227c = m27227c(map);
        Iterator<String> it = map.keySet().iterator();
        if (it.hasNext()) {
            String next = it.next();
            b bVar2 = map.get(next);
            m27227c.get(next);
            bVar2.getClass();
            abstractC5469h.mo27272d(null, bVar);
            int[] iArr = a.f31211a;
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final Map<String, Object> m27227c(Map<String, b> map) {
        Map<String, Object> map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, b> entry : map.entrySet()) {
            String key = entry.getKey();
            Object obj = entry.getValue().f31212a;
            if (obj == 0) {
                map2 = null;
            } else if (obj instanceof Map) {
                map2 = m27227c((Map) obj);
            } else {
                map2 = obj;
                if (obj instanceof List) {
                    map2 = m27228d((List) obj);
                }
            }
            linkedHashMap.put(key, map2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final List m27228d(List list) {
        Map<String, Object> map;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Map) {
                map = m27227c((Map) obj);
            } else {
                map = obj;
                if (obj instanceof List) {
                    map = m27228d((List) obj);
                }
            }
            arrayList.add(map);
        }
        return arrayList;
    }
}
