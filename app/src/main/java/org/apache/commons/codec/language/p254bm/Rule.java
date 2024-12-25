package org.apache.commons.codec.language.p254bm;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.apache.commons.codec.language.p254bm.Languages;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/bm/Rule.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/Rule.class */
public class Rule {
    public static final String ALL = "ALL";
    private static final String DOUBLE_QUOTE = "\"";
    private static final String HASH_INCLUDE = "#include";
    private final RPattern lContext;
    private final String pattern;
    private final PhonemeExpr phoneme;
    private final RPattern rContext;
    public static final RPattern ALL_STRINGS_RMATCHER = new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.1
        @Override // org.apache.commons.codec.language.bm.Rule.RPattern
        public boolean isMatch(CharSequence charSequence) {
            return true;
        }
    };
    private static final Map<NameType, Map<RuleType, Map<String, Map<String, List<Rule>>>>> RULES = new EnumMap(NameType.class);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/bm/Rule$Phoneme.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/Rule$Phoneme.class */
    public static final class Phoneme implements PhonemeExpr {
        public static final Comparator<Phoneme> COMPARATOR = new Comparator<Phoneme>() { // from class: org.apache.commons.codec.language.bm.Rule.Phoneme.1
            @Override // java.util.Comparator
            public int compare(Phoneme phoneme, Phoneme phoneme2) {
                for (int i10 = 0; i10 < phoneme.phonemeText.length(); i10++) {
                    if (i10 >= phoneme2.phonemeText.length()) {
                        return 1;
                    }
                    int charAt = phoneme.phonemeText.charAt(i10) - phoneme2.phonemeText.charAt(i10);
                    if (charAt != 0) {
                        return charAt;
                    }
                }
                return phoneme.phonemeText.length() < phoneme2.phonemeText.length() ? -1 : 0;
            }
        };
        private final Languages.LanguageSet languages;
        private final StringBuilder phonemeText;

        public Phoneme(CharSequence charSequence, Languages.LanguageSet languageSet) {
            this.phonemeText = new StringBuilder(charSequence);
            this.languages = languageSet;
        }

        public Phoneme(Phoneme phoneme, Phoneme phoneme2) {
            this(phoneme.phonemeText, phoneme.languages);
            this.phonemeText.append((CharSequence) phoneme2.phonemeText);
        }

        public Phoneme(Phoneme phoneme, Phoneme phoneme2, Languages.LanguageSet languageSet) {
            this(phoneme.phonemeText, languageSet);
            this.phonemeText.append((CharSequence) phoneme2.phonemeText);
        }

        public Phoneme append(CharSequence charSequence) {
            this.phonemeText.append(charSequence);
            return this;
        }

        public Languages.LanguageSet getLanguages() {
            return this.languages;
        }

        public CharSequence getPhonemeText() {
            return this.phonemeText;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public Iterable<Phoneme> getPhonemes() {
            return Collections.singleton(this);
        }

        @Deprecated
        public Phoneme join(Phoneme phoneme) {
            return new Phoneme(this.phonemeText.toString() + phoneme.phonemeText.toString(), this.languages.restrictTo(phoneme.languages));
        }

        public Phoneme mergeWithLanguage(Languages.LanguageSet languageSet) {
            return new Phoneme(this.phonemeText.toString(), this.languages.merge(languageSet));
        }

        public String toString() {
            return this.phonemeText.toString() + "[" + this.languages + "]";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/bm/Rule$PhonemeExpr.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/Rule$PhonemeExpr.class */
    public interface PhonemeExpr {
        Iterable<Phoneme> getPhonemes();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/bm/Rule$PhonemeList.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/Rule$PhonemeList.class */
    public static final class PhonemeList implements PhonemeExpr {
        private final List<Phoneme> phonemes;

        public PhonemeList(List<Phoneme> list) {
            this.phonemes = list;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public List<Phoneme> getPhonemes() {
            return this.phonemes;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/bm/Rule$RPattern.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/Rule$RPattern.class */
    public interface RPattern {
        boolean isMatch(CharSequence charSequence);
    }

    static {
        for (NameType nameType : NameType.values()) {
            EnumMap enumMap = new EnumMap(RuleType.class);
            for (RuleType ruleType : RuleType.values()) {
                HashMap hashMap = new HashMap();
                for (String str : Languages.getInstance(nameType).getLanguages()) {
                    try {
                        hashMap.put(str, parseRules(createScanner(nameType, ruleType, str), createResourceName(nameType, ruleType, str)));
                    } catch (IllegalStateException e10) {
                        throw new IllegalStateException("Problem processing " + createResourceName(nameType, ruleType, str), e10);
                    }
                }
                if (!ruleType.equals(RuleType.RULES)) {
                    hashMap.put("common", parseRules(createScanner(nameType, ruleType, "common"), createResourceName(nameType, ruleType, "common")));
                }
                enumMap.put((EnumMap) ruleType, (RuleType) Collections.unmodifiableMap(hashMap));
            }
            RULES.put(nameType, Collections.unmodifiableMap(enumMap));
        }
    }

    public Rule(String str, String str2, String str3, PhonemeExpr phonemeExpr) {
        this.pattern = str;
        this.lContext = pattern(str2 + "$");
        this.rContext = pattern("^" + str3);
        this.phoneme = phonemeExpr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean contains(CharSequence charSequence, char c10) {
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (charSequence.charAt(i10) == c10) {
                return true;
            }
        }
        return false;
    }

    private static String createResourceName(NameType nameType, RuleType ruleType, String str) {
        return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", nameType.getName(), ruleType.getName(), str);
    }

    private static Scanner createScanner(String str) {
        String format = String.format("org/apache/commons/codec/language/bm/%s.txt", str);
        InputStream resourceAsStream = Languages.class.getClassLoader().getResourceAsStream(format);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException("Unable to load resource: " + format);
    }

    private static Scanner createScanner(NameType nameType, RuleType ruleType, String str) {
        String createResourceName = createResourceName(nameType, ruleType, str);
        InputStream resourceAsStream = Languages.class.getClassLoader().getResourceAsStream(createResourceName);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException("Unable to load resource: " + createResourceName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        int length = charSequence.length() - 1;
        for (int length2 = charSequence2.length() - 1; length2 >= 0; length2--) {
            if (charSequence.charAt(length) != charSequence2.charAt(length2)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, String str) {
        return getInstance(nameType, ruleType, Languages.LanguageSet.from(new HashSet(Arrays.asList(str))));
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        Map<String, List<Rule>> instanceMap = getInstanceMap(nameType, ruleType, languageSet);
        ArrayList arrayList = new ArrayList();
        Iterator<List<Rule>> it = instanceMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        return arrayList;
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, String str) {
        Map<String, List<Rule>> map = RULES.get(nameType).get(ruleType).get(str);
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", nameType.getName(), ruleType.getName(), str));
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        return getInstanceMap(nameType, ruleType, languageSet.isSingleton() ? languageSet.getAny() : Languages.ANY);
    }

    private static Phoneme parsePhoneme(String str) {
        int indexOf = str.indexOf("[");
        if (indexOf < 0) {
            return new Phoneme(str, Languages.ANY_LANGUAGE);
        }
        if (str.endsWith("]")) {
            return new Phoneme(str.substring(0, indexOf), Languages.LanguageSet.from(new HashSet(Arrays.asList(str.substring(indexOf + 1, str.length() - 1).split("[+]")))));
        }
        throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
    }

    private static PhonemeExpr parsePhonemeExpr(String str) {
        if (!str.startsWith("(")) {
            return parsePhoneme(str);
        }
        if (!str.endsWith(")")) {
            throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
        }
        ArrayList arrayList = new ArrayList();
        String substring = str.substring(1, str.length() - 1);
        for (String str2 : substring.split("[|]")) {
            arrayList.add(parsePhoneme(str2));
        }
        if (substring.startsWith("|") || substring.endsWith("|")) {
            arrayList.add(new Phoneme("", Languages.ANY_LANGUAGE));
        }
        return new PhonemeList(arrayList);
    }

    private static Map<String, List<Rule>> parseRules(Scanner scanner, String str) {
        HashMap hashMap = new HashMap();
        int i10 = 0;
        boolean z10 = false;
        while (scanner.hasNextLine()) {
            i10++;
            String nextLine = scanner.nextLine();
            if (z10) {
                if (nextLine.endsWith(ResourceConstants.EXT_CMT_END)) {
                    z10 = false;
                }
            } else if (nextLine.startsWith(ResourceConstants.EXT_CMT_START)) {
                z10 = true;
            } else {
                int indexOf = nextLine.indexOf(ResourceConstants.CMT);
                String trim = (indexOf >= 0 ? nextLine.substring(0, indexOf) : nextLine).trim();
                if (trim.length() == 0) {
                    continue;
                } else if (trim.startsWith(HASH_INCLUDE)) {
                    String trim2 = trim.substring(8).trim();
                    if (trim2.contains(" ")) {
                        throw new IllegalArgumentException("Malformed import statement '" + nextLine + "' in " + str);
                    }
                    hashMap.putAll(parseRules(createScanner(trim2), str + "->" + trim2));
                } else {
                    String[] split = trim.split("\\s+");
                    if (split.length != 4) {
                        throw new IllegalArgumentException("Malformed rule statement split into " + split.length + " parts: " + nextLine + " in " + str);
                    }
                    try {
                        String stripQuotes = stripQuotes(split[0]);
                        String stripQuotes2 = stripQuotes(split[1]);
                        String stripQuotes3 = stripQuotes(split[2]);
                        try {
                            Rule rule = new Rule(stripQuotes, stripQuotes2, stripQuotes3, parsePhonemeExpr(stripQuotes(split[3])), i10, str, stripQuotes, stripQuotes2, stripQuotes3) { // from class: org.apache.commons.codec.language.bm.Rule.2
                                private final String loc;
                                private final int myLine;
                                public final int val$cLine;
                                public final String val$lCon;
                                public final String val$location;
                                public final String val$pat;
                                public final String val$rCon;

                                {
                                    this.val$cLine = i10;
                                    this.val$location = str;
                                    this.val$pat = stripQuotes;
                                    this.val$lCon = stripQuotes2;
                                    this.val$rCon = stripQuotes3;
                                    this.myLine = i10;
                                    this.loc = str;
                                }

                                public String toString() {
                                    return "Rule{line=" + this.myLine + ", loc='" + this.loc + "', pat='" + this.val$pat + "', lcon='" + this.val$lCon + "', rcon='" + this.val$rCon + "'}";
                                }
                            };
                            String substring = rule.pattern.substring(0, 1);
                            List list = (List) hashMap.get(substring);
                            List list2 = list;
                            if (list == null) {
                                list2 = new ArrayList();
                                hashMap.put(substring, list2);
                            }
                            list2.add(rule);
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            throw new IllegalStateException("Problem parsing line '" + i10 + "' in " + str, e);
                        }
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                    }
                }
            }
        }
        return hashMap;
    }

    private static RPattern pattern(String str) {
        boolean startsWith = str.startsWith("^");
        boolean endsWith = str.endsWith("$");
        int length = str.length();
        int i10 = length;
        if (endsWith) {
            i10 = length - 1;
        }
        String substring = str.substring(startsWith ? 1 : 0, i10);
        if (substring.contains("[")) {
            boolean startsWith2 = substring.startsWith("[");
            boolean endsWith2 = substring.endsWith("]");
            if (startsWith2 && endsWith2) {
                String substring2 = substring.substring(1, substring.length() - 1);
                if (!substring2.contains("[")) {
                    boolean startsWith3 = substring2.startsWith("^");
                    String str2 = substring2;
                    if (startsWith3) {
                        str2 = substring2.substring(1);
                    }
                    boolean z10 = !startsWith3;
                    if (startsWith && endsWith) {
                        return new RPattern(str2, z10) { // from class: org.apache.commons.codec.language.bm.Rule.7
                            public final String val$bContent;
                            public final boolean val$shouldMatch;

                            {
                                this.val$bContent = str2;
                                this.val$shouldMatch = z10;
                            }

                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public boolean isMatch(CharSequence charSequence) {
                                boolean z11 = false;
                                if (charSequence.length() == 1) {
                                    z11 = false;
                                    if (Rule.contains(this.val$bContent, charSequence.charAt(0)) == this.val$shouldMatch) {
                                        z11 = true;
                                    }
                                }
                                return z11;
                            }
                        };
                    }
                    if (startsWith) {
                        return new RPattern(str2, z10) { // from class: org.apache.commons.codec.language.bm.Rule.8
                            public final String val$bContent;
                            public final boolean val$shouldMatch;

                            {
                                this.val$bContent = str2;
                                this.val$shouldMatch = z10;
                            }

                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public boolean isMatch(CharSequence charSequence) {
                                boolean z11 = false;
                                if (charSequence.length() > 0) {
                                    z11 = false;
                                    if (Rule.contains(this.val$bContent, charSequence.charAt(0)) == this.val$shouldMatch) {
                                        z11 = true;
                                    }
                                }
                                return z11;
                            }
                        };
                    }
                    if (endsWith) {
                        return new RPattern(str2, z10) { // from class: org.apache.commons.codec.language.bm.Rule.9
                            public final String val$bContent;
                            public final boolean val$shouldMatch;

                            {
                                this.val$bContent = str2;
                                this.val$shouldMatch = z10;
                            }

                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public boolean isMatch(CharSequence charSequence) {
                                boolean z11 = true;
                                if (charSequence.length() <= 0 || Rule.contains(this.val$bContent, charSequence.charAt(charSequence.length() - 1)) != this.val$shouldMatch) {
                                    z11 = false;
                                }
                                return z11;
                            }
                        };
                    }
                }
            }
        } else {
            if (startsWith && endsWith) {
                return substring.length() == 0 ? new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule.3
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public boolean isMatch(CharSequence charSequence) {
                        return charSequence.length() == 0;
                    }
                } : new RPattern(substring) { // from class: org.apache.commons.codec.language.bm.Rule.4
                    public final String val$content;

                    {
                        this.val$content = substring;
                    }

                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public boolean isMatch(CharSequence charSequence) {
                        return charSequence.equals(this.val$content);
                    }
                };
            }
            if ((startsWith || endsWith) && substring.length() == 0) {
                return ALL_STRINGS_RMATCHER;
            }
            if (startsWith) {
                return new RPattern(substring) { // from class: org.apache.commons.codec.language.bm.Rule.5
                    public final String val$content;

                    {
                        this.val$content = substring;
                    }

                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public boolean isMatch(CharSequence charSequence) {
                        return Rule.startsWith(charSequence, this.val$content);
                    }
                };
            }
            if (endsWith) {
                return new RPattern(substring) { // from class: org.apache.commons.codec.language.bm.Rule.6
                    public final String val$content;

                    {
                        this.val$content = substring;
                    }

                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public boolean isMatch(CharSequence charSequence) {
                        return Rule.endsWith(charSequence, this.val$content);
                    }
                };
            }
        }
        return new RPattern(str) { // from class: org.apache.commons.codec.language.bm.Rule.10
            public Pattern pattern;
            public final String val$regex;

            {
                this.val$regex = str;
                this.pattern = Pattern.compile(str);
            }

            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
            public boolean isMatch(CharSequence charSequence) {
                return this.pattern.matcher(charSequence).find();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i10 = 0; i10 < charSequence2.length(); i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
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

    public RPattern getLContext() {
        return this.lContext;
    }

    public String getPattern() {
        return this.pattern;
    }

    public PhonemeExpr getPhoneme() {
        return this.phoneme;
    }

    public RPattern getRContext() {
        return this.rContext;
    }

    public boolean patternAndContextMatches(CharSequence charSequence, int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
        }
        int length = this.pattern.length() + i10;
        if (length <= charSequence.length() && charSequence.subSequence(i10, length).equals(this.pattern) && this.rContext.isMatch(charSequence.subSequence(length, charSequence.length()))) {
            return this.lContext.isMatch(charSequence.subSequence(0, i10));
        }
        return false;
    }
}
