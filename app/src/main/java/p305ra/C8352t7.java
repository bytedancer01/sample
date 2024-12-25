package p305ra;

import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/t7.class
 */
/* renamed from: ra.t7 */
/* loaded from: combined.jar:classes2.jar:ra/t7.class */
public final class C8352t7 {
    /* renamed from: a */
    public static String m35828a(InterfaceC8307q7 interfaceC8307q7, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m35830c(interfaceC8307q7, sb2, 0);
        return sb2.toString();
    }

    /* renamed from: b */
    public static final void m35829b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m35829b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m35829b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(C8278o8.m35655a(AbstractC8230l5.m35570v((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC8230l5) {
            sb2.append(": \"");
            sb2.append(C8278o8.m35655a((AbstractC8230l5) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC8231l6) {
            sb2.append(" {");
            m35830c((AbstractC8231l6) obj, sb2, i10 + 2);
            sb2.append("\n");
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        m35829b(sb2, i13, "key", entry.getKey());
        m35829b(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        for (int i14 = 0; i14 < i10; i14++) {
            sb2.append(' ');
        }
        sb2.append("}");
    }

    /* renamed from: c */
    public static void m35830c(InterfaceC8307q7 interfaceC8307q7, StringBuilder sb2, int i10) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC8307q7.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m35829b(sb2, i10, m35831d(concat), AbstractC8231l6.m35574k(method2, interfaceC8307q7, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m35829b(sb2, i10, m35831d(concat2), AbstractC8231l6.m35574k(method3, interfaceC8307q7, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object m35574k = AbstractC8231l6.m35574k(method4, interfaceC8307q7, new Object[0]);
                    if (method5 == null) {
                        if (m35574k instanceof Boolean) {
                            if (((Boolean) m35574k).booleanValue()) {
                                m35829b(sb2, i10, m35831d(concat3), m35574k);
                            }
                        } else if (m35574k instanceof Integer) {
                            if (((Integer) m35574k).intValue() != 0) {
                                m35829b(sb2, i10, m35831d(concat3), m35574k);
                            }
                        } else if (m35574k instanceof Float) {
                            if (((Float) m35574k).floatValue() != 0.0f) {
                                m35829b(sb2, i10, m35831d(concat3), m35574k);
                            }
                        } else if (!(m35574k instanceof Double)) {
                            if (m35574k instanceof String) {
                                obj = "";
                            } else if (m35574k instanceof AbstractC8230l5) {
                                obj = AbstractC8230l5.f39165c;
                            } else if (!(m35574k instanceof InterfaceC8307q7)) {
                                if ((m35574k instanceof Enum) && ((Enum) m35574k).ordinal() == 0) {
                                }
                                m35829b(sb2, i10, m35831d(concat3), m35574k);
                            } else if (m35574k != ((InterfaceC8307q7) m35574k).mo35441d()) {
                                m35829b(sb2, i10, m35831d(concat3), m35574k);
                            }
                            if (!m35574k.equals(obj)) {
                                m35829b(sb2, i10, m35831d(concat3), m35574k);
                            }
                        } else if (((Double) m35574k).doubleValue() != 0.0d) {
                            m35829b(sb2, i10, m35831d(concat3), m35574k);
                        }
                    } else if (((Boolean) AbstractC8231l6.m35574k(method5, interfaceC8307q7, new Object[0])).booleanValue()) {
                        m35829b(sb2, i10, m35831d(concat3), m35574k);
                    }
                }
            }
        }
        if (interfaceC8307q7 instanceof AbstractC8201j6) {
            throw null;
        }
        C8323r8 c8323r8 = ((AbstractC8231l6) interfaceC8307q7).zzc;
        if (c8323r8 != null) {
            c8323r8.m35768g(sb2, i10);
        }
    }

    /* renamed from: d */
    public static final String m35831d(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append(AWSAppSyncClient.DATABASE_NAME_DELIMITER);
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }
}
