package org.apache.commons.codec.language.p254bm;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.commons.codec.language.p254bm.Languages;
import org.apache.commons.codec.language.p254bm.Rule;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/bm/PhoneticEngine.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/PhoneticEngine.class */
public class PhoneticEngine {
    private static final int DEFAULT_MAX_PHONEMES = 20;
    private static final Map<NameType, Set<String>> NAME_PREFIXES;
    private final boolean concat;
    private final Lang lang;
    private final int maxPhonemes;
    private final NameType nameType;
    private final RuleType ruleType;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/bm/PhoneticEngine$1.class
     */
    /* renamed from: org.apache.commons.codec.language.bm.PhoneticEngine$1 */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/PhoneticEngine$1.class */
    public static /* synthetic */ class C69971 {
        public static final int[] $SwitchMap$org$apache$commons$codec$language$bm$NameType;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.apache.commons.codec.language.bm.NameType[] r0 = org.apache.commons.codec.language.p254bm.NameType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.apache.commons.codec.language.p254bm.PhoneticEngine.C69971.$SwitchMap$org$apache$commons$codec$language$bm$NameType = r0
                r0 = r4
                org.apache.commons.codec.language.bm.NameType r1 = org.apache.commons.codec.language.p254bm.NameType.SEPHARDIC     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = org.apache.commons.codec.language.p254bm.PhoneticEngine.C69971.$SwitchMap$org$apache$commons$codec$language$bm$NameType     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                org.apache.commons.codec.language.bm.NameType r1 = org.apache.commons.codec.language.p254bm.NameType.ASHKENAZI     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = org.apache.commons.codec.language.p254bm.PhoneticEngine.C69971.$SwitchMap$org$apache$commons$codec$language$bm$NameType     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                org.apache.commons.codec.language.bm.NameType r1 = org.apache.commons.codec.language.p254bm.NameType.GENERIC     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.p254bm.PhoneticEngine.C69971.m45212clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder.class */
    public static final class PhonemeBuilder {
        private final Set<Rule.Phoneme> phonemes;

        private PhonemeBuilder(Set<Rule.Phoneme> set) {
            this.phonemes = set;
        }

        public /* synthetic */ PhonemeBuilder(Set set, C69971 c69971) {
            this((Set<Rule.Phoneme>) set);
        }

        private PhonemeBuilder(Rule.Phoneme phoneme) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.phonemes = linkedHashSet;
            linkedHashSet.add(phoneme);
        }

        public static PhonemeBuilder empty(Languages.LanguageSet languageSet) {
            return new PhonemeBuilder(new Rule.Phoneme("", languageSet));
        }

        public void append(CharSequence charSequence) {
            Iterator<Rule.Phoneme> it = this.phonemes.iterator();
            while (it.hasNext()) {
                it.next().append(charSequence);
            }
        }

        public void apply(Rule.PhonemeExpr phonemeExpr, int i10) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(i10);
            loop0: for (Rule.Phoneme phoneme : this.phonemes) {
                for (Rule.Phoneme phoneme2 : phonemeExpr.getPhonemes()) {
                    Languages.LanguageSet restrictTo = phoneme.getLanguages().restrictTo(phoneme2.getLanguages());
                    if (!restrictTo.isEmpty()) {
                        Rule.Phoneme phoneme3 = new Rule.Phoneme(phoneme, phoneme2, restrictTo);
                        if (linkedHashSet.size() < i10) {
                            linkedHashSet.add(phoneme3);
                            if (linkedHashSet.size() >= i10) {
                                break loop0;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            this.phonemes.clear();
            this.phonemes.addAll(linkedHashSet);
        }

        public Set<Rule.Phoneme> getPhonemes() {
            return this.phonemes;
        }

        public String makeString() {
            StringBuilder sb2 = new StringBuilder();
            for (Rule.Phoneme phoneme : this.phonemes) {
                if (sb2.length() > 0) {
                    sb2.append("|");
                }
                sb2.append(phoneme.getPhonemeText());
            }
            return sb2.toString();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication.class */
    public static final class RulesApplication {
        private final Map<String, List<Rule>> finalRules;
        private boolean found;

        /* renamed from: i */
        private int f36118i;
        private final CharSequence input;
        private final int maxPhonemes;
        private PhonemeBuilder phonemeBuilder;

        public RulesApplication(Map<String, List<Rule>> map, CharSequence charSequence, PhonemeBuilder phonemeBuilder, int i10, int i11) {
            if (map == null) {
                throw new NullPointerException("The finalRules argument must not be null");
            }
            this.finalRules = map;
            this.phonemeBuilder = phonemeBuilder;
            this.input = charSequence;
            this.f36118i = i10;
            this.maxPhonemes = i11;
        }

        public int getI() {
            return this.f36118i;
        }

        public PhonemeBuilder getPhonemeBuilder() {
            return this.phonemeBuilder;
        }

        public RulesApplication invoke() {
            int i10;
            this.found = false;
            Map<String, List<Rule>> map = this.finalRules;
            CharSequence charSequence = this.input;
            int i11 = this.f36118i;
            List<Rule> list = map.get(charSequence.subSequence(i11, i11 + 1));
            if (list != null) {
                Iterator<Rule> it = list.iterator();
                i10 = 1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Rule next = it.next();
                    i10 = next.getPattern().length();
                    if (next.patternAndContextMatches(this.input, this.f36118i)) {
                        this.phonemeBuilder.apply(next.getPhoneme(), this.maxPhonemes);
                        this.found = true;
                        break;
                    }
                }
            } else {
                i10 = 1;
            }
            if (!this.found) {
                i10 = 1;
            }
            this.f36118i += i10;
            return this;
        }

        public boolean isFound() {
            return this.found;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(NameType.class);
        NAME_PREFIXES = enumMap;
        enumMap.put((EnumMap) NameType.ASHKENAZI, (NameType) Collections.unmodifiableSet(new HashSet(Arrays.asList("bar", "ben", "da", "de", "van", "von"))));
        enumMap.put((EnumMap) NameType.SEPHARDIC, (NameType) Collections.unmodifiableSet(new HashSet(Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        enumMap.put((EnumMap) NameType.GENERIC, (NameType) Collections.unmodifiableSet(new HashSet(Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }

    public PhoneticEngine(NameType nameType, RuleType ruleType, boolean z10) {
        this(nameType, ruleType, z10, 20);
    }

    public PhoneticEngine(NameType nameType, RuleType ruleType, boolean z10, int i10) {
        RuleType ruleType2 = RuleType.RULES;
        if (ruleType == ruleType2) {
            throw new IllegalArgumentException("ruleType must not be " + ruleType2);
        }
        this.nameType = nameType;
        this.ruleType = ruleType;
        this.concat = z10;
        this.lang = Lang.instance(nameType);
        this.maxPhonemes = i10;
    }

    private PhonemeBuilder applyFinalRules(PhonemeBuilder phonemeBuilder, Map<String, List<Rule>> map) {
        if (map == null) {
            throw new NullPointerException("finalRules can not be null");
        }
        if (map.isEmpty()) {
            return phonemeBuilder;
        }
        TreeMap treeMap = new TreeMap(Rule.Phoneme.COMPARATOR);
        for (Rule.Phoneme phoneme : phonemeBuilder.getPhonemes()) {
            PhonemeBuilder empty = PhonemeBuilder.empty(phoneme.getLanguages());
            String charSequence = phoneme.getPhonemeText().toString();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 >= charSequence.length()) {
                    break;
                }
                RulesApplication invoke = new RulesApplication(map, charSequence, empty, i11, this.maxPhonemes).invoke();
                boolean isFound = invoke.isFound();
                empty = invoke.getPhonemeBuilder();
                if (!isFound) {
                    empty.append(charSequence.subSequence(i11, i11 + 1));
                }
                i10 = invoke.getI();
            }
            for (Rule.Phoneme phoneme2 : empty.getPhonemes()) {
                Rule.Phoneme phoneme3 = phoneme2;
                if (treeMap.containsKey(phoneme2)) {
                    phoneme3 = ((Rule.Phoneme) treeMap.remove(phoneme2)).mergeWithLanguage(phoneme2.getLanguages());
                }
                treeMap.put(phoneme3, phoneme3);
            }
        }
        return new PhonemeBuilder(treeMap.keySet(), null);
    }

    private static String join(Iterable<String> iterable, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append(it.next());
        }
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    public String encode(String str) {
        return encode(str, this.lang.guessLanguages(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x026d A[LOOP:1: B:31:0x0265->B:33:0x026d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String encode(java.lang.String r9, org.apache.commons.codec.language.bm.Languages.LanguageSet r10) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.p254bm.PhoneticEngine.encode(java.lang.String, org.apache.commons.codec.language.bm.Languages$LanguageSet):java.lang.String");
    }

    public Lang getLang() {
        return this.lang;
    }

    public int getMaxPhonemes() {
        return this.maxPhonemes;
    }

    public NameType getNameType() {
        return this.nameType;
    }

    public RuleType getRuleType() {
        return this.ruleType;
    }

    public boolean isConcat() {
        return this.concat;
    }
}
