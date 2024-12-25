package org.apache.commons.codec.language;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/DaitchMokotoffSoundex.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/DaitchMokotoffSoundex.class */
public class DaitchMokotoffSoundex implements StringEncoder {
    private static final String COMMENT = "//";
    private static final String DOUBLE_QUOTE = "\"";
    private static final Map<Character, Character> FOLDINGS;
    private static final int MAX_LENGTH = 6;
    private static final String MULTILINE_COMMENT_END = "*/";
    private static final String MULTILINE_COMMENT_START = "/*";
    private static final String RESOURCE_FILE = "org/apache/commons/codec/language/dmrules.txt";
    private static final Map<Character, List<Rule>> RULES;
    private final boolean folding;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/DaitchMokotoffSoundex$Branch.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/DaitchMokotoffSoundex$Branch.class */
    public static final class Branch {
        private final StringBuilder builder;
        private String cachedString;
        private String lastReplacement;

        private Branch() {
            this.builder = new StringBuilder();
            this.lastReplacement = null;
            this.cachedString = null;
        }

        public Branch createBranch() {
            Branch branch = new Branch();
            branch.builder.append(toString());
            branch.lastReplacement = this.lastReplacement;
            return branch;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Branch) {
                return toString().equals(((Branch) obj).toString());
            }
            return false;
        }

        public void finish() {
            while (this.builder.length() < 6) {
                this.builder.append('0');
                this.cachedString = null;
            }
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public void processNextReplacement(String str, boolean z10) {
            String str2 = this.lastReplacement;
            if ((str2 == null || !str2.endsWith(str) || z10) && this.builder.length() < 6) {
                this.builder.append(str);
                if (this.builder.length() > 6) {
                    StringBuilder sb2 = this.builder;
                    sb2.delete(6, sb2.length());
                }
                this.cachedString = null;
            }
            this.lastReplacement = str;
        }

        public String toString() {
            if (this.cachedString == null) {
                this.cachedString = this.builder.toString();
            }
            return this.cachedString;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/DaitchMokotoffSoundex$Rule.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/DaitchMokotoffSoundex$Rule.class */
    public static final class Rule {
        private final String pattern;
        private final String[] replacementAtStart;
        private final String[] replacementBeforeVowel;
        private final String[] replacementDefault;

        public Rule(String str, String str2, String str3, String str4) {
            this.pattern = str;
            this.replacementAtStart = str2.split("\\|");
            this.replacementBeforeVowel = str3.split("\\|");
            this.replacementDefault = str4.split("\\|");
        }

        private boolean isVowel(char c10) {
            return c10 == 'a' || c10 == 'e' || c10 == 'i' || c10 == 'o' || c10 == 'u';
        }

        public int getPatternLength() {
            return this.pattern.length();
        }

        public String[] getReplacements(String str, boolean z10) {
            if (z10) {
                return this.replacementAtStart;
            }
            int patternLength = getPatternLength();
            return patternLength < str.length() ? isVowel(str.charAt(patternLength)) : false ? this.replacementBeforeVowel : this.replacementDefault;
        }

        public boolean matches(String str) {
            return str.startsWith(this.pattern);
        }

        public String toString() {
            return String.format("%s=(%s,%s,%s)", this.pattern, Arrays.asList(this.replacementAtStart), Arrays.asList(this.replacementBeforeVowel), Arrays.asList(this.replacementDefault));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        RULES = hashMap;
        HashMap hashMap2 = new HashMap();
        FOLDINGS = hashMap2;
        InputStream resourceAsStream = DaitchMokotoffSoundex.class.getClassLoader().getResourceAsStream(RESOURCE_FILE);
        if (resourceAsStream == null) {
            throw new IllegalArgumentException("Unable to load resource: org/apache/commons/codec/language/dmrules.txt");
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        parseRules(scanner, RESOURCE_FILE, hashMap, hashMap2);
        scanner.close();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Collections.sort((List) ((Map.Entry) it.next()).getValue(), new Comparator<Rule>() { // from class: org.apache.commons.codec.language.DaitchMokotoffSoundex.1
                @Override // java.util.Comparator
                public int compare(Rule rule, Rule rule2) {
                    return rule2.getPatternLength() - rule.getPatternLength();
                }
            });
        }
    }

    public DaitchMokotoffSoundex() {
        this(true);
    }

    public DaitchMokotoffSoundex(boolean z10) {
        this.folding = z10;
    }

    private String cleanup(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            if (!Character.isWhitespace(c10)) {
                char lowerCase = Character.toLowerCase(c10);
                char c11 = lowerCase;
                if (this.folding) {
                    Map<Character, Character> map = FOLDINGS;
                    c11 = lowerCase;
                    if (map.containsKey(Character.valueOf(lowerCase))) {
                        c11 = map.get(Character.valueOf(lowerCase)).charValue();
                    }
                }
                sb2.append(c11);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        throw new java.lang.IllegalArgumentException("Malformed folding statement - patterns are not single characters: " + r0 + " in " + r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseRules(java.util.Scanner r6, java.lang.String r7, java.util.Map<java.lang.Character, java.util.List<org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule>> r8, java.util.Map<java.lang.Character, java.lang.Character> r9) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DaitchMokotoffSoundex.parseRules(java.util.Scanner, java.lang.String, java.util.Map, java.util.Map):void");
    }

    private String[] soundex(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        String cleanup = cleanup(str);
        LinkedHashSet<Branch> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Branch());
        int i10 = 0;
        char c10 = 0;
        while (i10 < cleanup.length()) {
            char charAt = cleanup.charAt(i10);
            if (!Character.isWhitespace(charAt)) {
                String substring = cleanup.substring(i10);
                List<Rule> list = RULES.get(Character.valueOf(charAt));
                if (list != null) {
                    List arrayList = z10 ? new ArrayList() : Collections.EMPTY_LIST;
                    Iterator<Rule> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Rule next = it.next();
                        if (next.matches(substring)) {
                            if (z10) {
                                arrayList.clear();
                            }
                            String[] replacements = next.getReplacements(substring, c10 == 0);
                            boolean z11 = replacements.length > 1 && z10;
                            for (Branch branch : linkedHashSet) {
                                for (String str2 : replacements) {
                                    Branch createBranch = z11 ? branch.createBranch() : branch;
                                    createBranch.processNextReplacement(str2, (c10 == 'm' && charAt == 'n') || (c10 == 'n' && charAt == 'm'));
                                    if (z10) {
                                        arrayList.add(createBranch);
                                    }
                                }
                            }
                            if (z10) {
                                linkedHashSet.clear();
                                linkedHashSet.addAll(arrayList);
                            }
                            i10 += next.getPatternLength() - 1;
                        }
                    }
                    c10 = charAt;
                }
            }
            i10++;
        }
        String[] strArr = new String[linkedHashSet.size()];
        int i11 = 0;
        for (Branch branch2 : linkedHashSet) {
            branch2.finish();
            strArr[i11] = branch2.toString();
            i11++;
        }
        return strArr;
    }

    private static String stripQuotes(String str) {
        String str2 = str;
        if (str.startsWith("\"")) {
            str2 = str.substring(1);
        }
        String str3 = str2;
        if (str2.endsWith("\"")) {
            str3 = str2.substring(0, str2.length() - 1);
        }
        return str3;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null) {
            return null;
        }
        return soundex(str, false)[0];
    }

    public String soundex(String str) {
        String[] soundex = soundex(str, true);
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (String str2 : soundex) {
            sb2.append(str2);
            i10++;
            if (i10 < soundex.length) {
                sb2.append('|');
            }
        }
        return sb2.toString();
    }
}
