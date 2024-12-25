package org.apache.commons.codec.language.p254bm;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.codec.language.p254bm.Languages;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/bm/Lang.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/Lang.class */
public class Lang {
    private static final String LANGUAGE_RULES_RN = "org/apache/commons/codec/language/bm/%s_lang.txt";
    private static final Map<NameType, Lang> Langs = new EnumMap(NameType.class);
    private final Languages languages;
    private final List<LangRule> rules;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/bm/Lang$LangRule.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/Lang$LangRule.class */
    public static final class LangRule {
        private final boolean acceptOnMatch;
        private final Set<String> languages;
        private final Pattern pattern;

        private LangRule(Pattern pattern, Set<String> set, boolean z10) {
            this.pattern = pattern;
            this.languages = set;
            this.acceptOnMatch = z10;
        }

        public boolean matches(String str) {
            return this.pattern.matcher(str).find();
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            Langs.put(nameType, loadFromResource(String.format(LANGUAGE_RULES_RN, nameType.getName()), Languages.getInstance(nameType)));
        }
    }

    private Lang(List<LangRule> list, Languages languages) {
        this.rules = Collections.unmodifiableList(list);
        this.languages = languages;
    }

    public static Lang instance(NameType nameType) {
        return Langs.get(nameType);
    }

    public static Lang loadFromResource(String str, Languages languages) {
        ArrayList arrayList = new ArrayList();
        InputStream resourceAsStream = Lang.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IllegalStateException("Unable to resolve required resource:org/apache/commons/codec/language/bm/%s_lang.txt");
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        while (true) {
            boolean z10 = false;
            while (scanner.hasNextLine()) {
                try {
                    String nextLine = scanner.nextLine();
                    if (z10) {
                        if (nextLine.endsWith(ResourceConstants.EXT_CMT_END)) {
                            break;
                        }
                    } else if (nextLine.startsWith(ResourceConstants.EXT_CMT_START)) {
                        z10 = true;
                    } else {
                        int indexOf = nextLine.indexOf(ResourceConstants.CMT);
                        String trim = (indexOf >= 0 ? nextLine.substring(0, indexOf) : nextLine).trim();
                        if (trim.length() != 0) {
                            String[] split = trim.split("\\s+");
                            if (split.length != 3) {
                                throw new IllegalArgumentException("Malformed line '" + nextLine + "' in language resource '" + str + "'");
                            }
                            arrayList.add(new LangRule(Pattern.compile(split[0]), new HashSet(Arrays.asList(split[1].split("\\+"))), split[2].equals("true")));
                        }
                    }
                } catch (Throwable th2) {
                    scanner.close();
                    throw th2;
                }
            }
            scanner.close();
            return new Lang(arrayList, languages);
        }
    }

    public String guessLanguage(String str) {
        Languages.LanguageSet guessLanguages = guessLanguages(str);
        return guessLanguages.isSingleton() ? guessLanguages.getAny() : Languages.ANY;
    }

    public Languages.LanguageSet guessLanguages(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.languages.getLanguages());
        for (LangRule langRule : this.rules) {
            if (langRule.matches(lowerCase)) {
                boolean z10 = langRule.acceptOnMatch;
                Set set = langRule.languages;
                if (z10) {
                    hashSet.retainAll(set);
                } else {
                    hashSet.removeAll(set);
                }
            }
        }
        Languages.LanguageSet from = Languages.LanguageSet.from(hashSet);
        Languages.LanguageSet languageSet = from;
        if (from.equals(Languages.NO_LANGUAGES)) {
            languageSet = Languages.ANY_LANGUAGE;
        }
        return languageSet;
    }
}
