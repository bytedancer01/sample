package org.jsoup.nodes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Properties;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Entities.class */
public class Entities {
    private static final Map<String, Character> base;
    private static final Map<Character, String> baseByVal;
    private static final Map<String, Character> full;
    private static final Map<Character, String> fullByVal;
    private static final Object[][] xhtmlArray;
    private static final Map<Character, String> xhtmlByVal = new HashMap();

    /* renamed from: org.jsoup.nodes.Entities$1 */
    /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Entities$1.class */
    public static /* synthetic */ class C70811 {
        public static final int[] $SwitchMap$org$jsoup$nodes$Entities$CoreCharset;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.jsoup.nodes.Entities$CoreCharset[] r0 = org.jsoup.nodes.Entities.CoreCharset.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.jsoup.nodes.Entities.C70811.$SwitchMap$org$jsoup$nodes$Entities$CoreCharset = r0
                r0 = r4
                org.jsoup.nodes.Entities$CoreCharset r1 = org.jsoup.nodes.Entities.CoreCharset.ascii     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = org.jsoup.nodes.Entities.C70811.$SwitchMap$org$jsoup$nodes$Entities$CoreCharset     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                org.jsoup.nodes.Entities$CoreCharset r1 = org.jsoup.nodes.Entities.CoreCharset.utf     // Catch: java.lang.NoSuchFieldError -> L24
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
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Entities.C70811.m45460clinit():void");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Entities$CoreCharset.class */
    public enum CoreCharset {
        ascii,
        utf,
        fallback;

        /* JADX INFO: Access modifiers changed from: private */
        public static CoreCharset byName(String str) {
            return str.equals("US-ASCII") ? ascii : str.startsWith("UTF-") ? utf : fallback;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Entities$EscapeMode.class */
    public enum EscapeMode {
        xhtml(Entities.xhtmlByVal),
        base(Entities.baseByVal),
        extended(Entities.fullByVal);

        private Map<Character, String> map;

        EscapeMode(Map map) {
            this.map = map;
        }

        public Map<Character, String> getMap() {
            return this.map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[], java.lang.Object[][]] */
    static {
        ?? r02 = {new Object[]{"quot", 34}, new Object[]{"amp", 38}, new Object[]{"lt", 60}, new Object[]{"gt", 62}};
        xhtmlArray = r02;
        Map<String, Character> loadEntities = loadEntities("entities-base.properties");
        base = loadEntities;
        baseByVal = toCharacterKey(loadEntities);
        Map<String, Character> loadEntities2 = loadEntities("entities-full.properties");
        full = loadEntities2;
        fullByVal = toCharacterKey(loadEntities2);
        for (Object[] objArr : r02) {
            xhtmlByVal.put(Character.valueOf((char) ((Integer) objArr[1]).intValue()), (String) objArr[0]);
        }
    }

    private Entities() {
    }

    private static boolean canEncode(CoreCharset coreCharset, char c10, CharsetEncoder charsetEncoder) {
        int i10 = C70811.$SwitchMap$org$jsoup$nodes$Entities$CoreCharset[coreCharset.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                return charsetEncoder.canEncode(c10);
            }
            return true;
        }
        if (c10 >= 128) {
            z10 = false;
        }
        return z10;
    }

    public static String escape(String str, Document.OutputSettings outputSettings) {
        StringBuilder sb2 = new StringBuilder(str.length() * 2);
        escape(sb2, str, outputSettings, false, false, false);
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0174, code lost:
    
        if (r0.canEncode(r6) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void escape(java.lang.StringBuilder r4, java.lang.String r5, org.jsoup.nodes.Document.OutputSettings r6, boolean r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Entities.escape(java.lang.StringBuilder, java.lang.String, org.jsoup.nodes.Document$OutputSettings, boolean, boolean, boolean):void");
    }

    public static Character getCharacterByName(String str) {
        return full.get(str);
    }

    public static boolean isBaseNamedEntity(String str) {
        return base.containsKey(str);
    }

    public static boolean isNamedEntity(String str) {
        return full.containsKey(str);
    }

    private static Map<String, Character> loadEntities(String str) {
        Properties properties = new Properties();
        HashMap hashMap = new HashMap();
        try {
            InputStream resourceAsStream = Entities.class.getResourceAsStream(str);
            properties.load(resourceAsStream);
            resourceAsStream.close();
            for (Map.Entry entry : properties.entrySet()) {
                hashMap.put((String) entry.getKey(), Character.valueOf((char) Integer.parseInt((String) entry.getValue(), 16)));
            }
            return hashMap;
        } catch (IOException e10) {
            throw new MissingResourceException("Error loading entities resource: " + e10.getMessage(), "Entities", str);
        }
    }

    private static Map<Character, String> toCharacterKey(Map<String, Character> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Character> entry : map.entrySet()) {
            Character value = entry.getValue();
            String key = entry.getKey();
            if (!hashMap.containsKey(value) || key.toLowerCase().equals(key)) {
                hashMap.put(value, key);
            }
        }
        return hashMap;
    }

    public static String unescape(String str) {
        return unescape(str, false);
    }

    public static String unescape(String str, boolean z10) {
        return Parser.unescapeEntities(str, z10);
    }
}
