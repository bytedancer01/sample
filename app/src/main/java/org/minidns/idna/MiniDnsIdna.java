package org.minidns.idna;

/* loaded from: combined.jar:classes3.jar:org/minidns/idna/MiniDnsIdna.class */
public class MiniDnsIdna {
    private static IdnaTransformator idnaTransformator = new DefaultIdnaTransformator();

    public static void setActiveTransformator(IdnaTransformator idnaTransformator2) {
        if (idnaTransformator2 == null) {
            throw new IllegalArgumentException();
        }
        idnaTransformator = idnaTransformator2;
    }

    public static String toASCII(String str) {
        return idnaTransformator.toASCII(str);
    }

    public static String toUnicode(String str) {
        return idnaTransformator.toUnicode(str);
    }
}
