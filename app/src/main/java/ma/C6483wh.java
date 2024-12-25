package ma;

import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/wh.class
 */
/* renamed from: ma.wh */
/* loaded from: combined.jar:classes2.jar:ma/wh.class */
public final class C6483wh {

    /* renamed from: a */
    public static final char[] f34136a;

    static {
        char[] cArr = new char[80];
        f34136a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m30098a(InterfaceC6443uh interfaceC6443uh, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m30101d(interfaceC6443uh, sb2, 0);
        return sb2.toString();
    }

    /* renamed from: b */
    public static void m30099b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m30099b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m30099b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m30100c(i10, sb2);
        String str2 = str;
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append(AWSAppSyncClient.DATABASE_NAME_DELIMITER);
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str2 = sb3.toString();
        }
        sb2.append(str2);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(C6464vi.m30082a(new C6336pf(((String) obj).getBytes(C6482wg.f34131b))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC6399sf) {
            sb2.append(": \"");
            sb2.append(C6464vi.m30082a((AbstractC6399sf) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC6295ng) {
            sb2.append(" {");
            m30101d((AbstractC6295ng) obj, sb2, i10 + 2);
            sb2.append("\n");
            m30100c(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        m30099b(sb2, i12, "key", entry.getKey());
        m30099b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        m30100c(i10, sb2);
        sb2.append("}");
    }

    /* renamed from: c */
    public static void m30100c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f34136a, 0, i11);
            i10 -= i11;
        }
    }

    /* renamed from: d */
    public static void m30101d(InterfaceC6443uh interfaceC6443uh, StringBuilder sb2, int i10) {
        Object obj;
        Method method;
        String substring;
        Object m29900c;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (Method method3 : interfaceC6443uh.getClass().getDeclaredMethods()) {
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(3);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                m29900c = AbstractC6295ng.m29900c(method2, interfaceC6443uh, new Object[0]);
            } else if (substring2.endsWith("Map") && !substring2.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                substring = substring2.substring(0, substring2.length() - 3);
                m29900c = AbstractC6295ng.m29900c(method, interfaceC6443uh, new Object[0]);
            } else if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring2));
                if (method4 != null) {
                    Object m29900c2 = AbstractC6295ng.m29900c(method4, interfaceC6443uh, new Object[0]);
                    if (method5 == null) {
                        if (m29900c2 instanceof Boolean) {
                            if (((Boolean) m29900c2).booleanValue()) {
                                m30099b(sb2, i10, substring2, m29900c2);
                            }
                        } else if (m29900c2 instanceof Integer) {
                            if (((Integer) m29900c2).intValue() != 0) {
                                m30099b(sb2, i10, substring2, m29900c2);
                            }
                        } else if (m29900c2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m29900c2).floatValue()) != 0) {
                                m30099b(sb2, i10, substring2, m29900c2);
                            }
                        } else if (!(m29900c2 instanceof Double)) {
                            if (m29900c2 instanceof String) {
                                obj = "";
                            } else if (m29900c2 instanceof AbstractC6399sf) {
                                obj = AbstractC6399sf.f34033c;
                            } else if (!(m29900c2 instanceof InterfaceC6443uh)) {
                                if ((m29900c2 instanceof Enum) && ((Enum) m29900c2).ordinal() == 0) {
                                }
                                m30099b(sb2, i10, substring2, m29900c2);
                            } else if (m29900c2 != ((InterfaceC6443uh) m29900c2).mo29913m()) {
                                m30099b(sb2, i10, substring2, m29900c2);
                            }
                            if (!m29900c2.equals(obj)) {
                                m30099b(sb2, i10, substring2, m29900c2);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) m29900c2).doubleValue()) != 0) {
                            m30099b(sb2, i10, substring2, m29900c2);
                        }
                    } else if (((Boolean) AbstractC6295ng.m29900c(method5, interfaceC6443uh, new Object[0])).booleanValue()) {
                        m30099b(sb2, i10, substring2, m29900c2);
                    }
                }
            }
            m30099b(sb2, i10, substring, m29900c);
        }
        if (interfaceC6443uh instanceof AbstractC6274mg) {
            throw null;
        }
        C6524yi c6524yi = ((AbstractC6295ng) interfaceC6443uh).zzc;
        if (c6524yi != null) {
            c6524yi.m30181g(sb2, i10);
        }
    }
}
