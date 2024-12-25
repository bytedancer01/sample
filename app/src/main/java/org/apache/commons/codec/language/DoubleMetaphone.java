package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/DoubleMetaphone.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/DoubleMetaphone.class */
public class DoubleMetaphone implements StringEncoder {
    private static final String VOWELS = "AEIOUY";
    private int maxCodeLen = 4;
    private static final String[] SILENT_START = {"GN", "KN", "PN", "WR", "PS"};
    private static final String[] L_R_N_M_B_H_F_V_W_SPACE = {"L", "R", "N", "M", "B", "H", "F", "V", "W", " "};
    private static final String[] ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};
    private static final String[] L_T_K_S_N_M_B_Z = {"L", "T", "K", "S", "N", "M", "B", "Z"};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult.class */
    public class DoubleMetaphoneResult {
        private final StringBuilder alternate;
        private final int maxLength;
        private final StringBuilder primary;
        public final DoubleMetaphone this$0;

        public DoubleMetaphoneResult(DoubleMetaphone doubleMetaphone, int i10) {
            this.this$0 = doubleMetaphone;
            this.primary = new StringBuilder(doubleMetaphone.getMaxCodeLen());
            this.alternate = new StringBuilder(doubleMetaphone.getMaxCodeLen());
            this.maxLength = i10;
        }

        public void append(char c10) {
            appendPrimary(c10);
            appendAlternate(c10);
        }

        public void append(char c10, char c11) {
            appendPrimary(c10);
            appendAlternate(c11);
        }

        public void append(String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(String str, String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }

        public void appendAlternate(char c10) {
            if (this.alternate.length() < this.maxLength) {
                this.alternate.append(c10);
            }
        }

        public void appendAlternate(String str) {
            int length = this.maxLength - this.alternate.length();
            if (str.length() <= length) {
                this.alternate.append(str);
            } else {
                this.alternate.append(str.substring(0, length));
            }
        }

        public void appendPrimary(char c10) {
            if (this.primary.length() < this.maxLength) {
                this.primary.append(c10);
            }
        }

        public void appendPrimary(String str) {
            int length = this.maxLength - this.primary.length();
            if (str.length() <= length) {
                this.primary.append(str);
            } else {
                this.primary.append(str.substring(0, length));
            }
        }

        public String getAlternate() {
            return this.alternate.toString();
        }

        public String getPrimary() {
            return this.primary.toString();
        }

        public boolean isComplete() {
            return this.primary.length() >= this.maxLength && this.alternate.length() >= this.maxLength;
        }
    }

    private String cleanInput(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim.toUpperCase(Locale.ENGLISH);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r0 == 'E') goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean conditionC0(java.lang.String r9, int r10) {
        /*
            r8 = this;
            r0 = r9
            r1 = r10
            r2 = 4
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "CHIA"
            r4[r5] = r6
            boolean r0 = contains(r0, r1, r2, r3)
            r12 = r0
            r0 = 1
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L1b
            r0 = 1
            return r0
        L1b:
            r0 = r10
            r1 = 1
            if (r0 > r1) goto L22
            r0 = 0
            return r0
        L22:
            r0 = r10
            r1 = 2
            int r0 = r0 - r1
            r11 = r0
            r0 = r8
            r1 = r8
            r2 = r9
            r3 = r11
            char r1 = r1.charAt(r2, r3)
            boolean r0 = r0.isVowel(r1)
            if (r0 == 0) goto L35
            r0 = 0
            return r0
        L35:
            r0 = r9
            r1 = r10
            r2 = 1
            int r1 = r1 - r2
            r2 = 3
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "ACH"
            r4[r5] = r6
            boolean r0 = contains(r0, r1, r2, r3)
            if (r0 != 0) goto L4b
            r0 = 0
            return r0
        L4b:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = 2
            int r2 = r2 + r3
            char r0 = r0.charAt(r1, r2)
            r10 = r0
            r0 = r10
            r1 = 73
            if (r0 == r1) goto L64
            r0 = r13
            r12 = r0
            r0 = r10
            r1 = 69
            if (r0 != r1) goto L86
        L64:
            r0 = r9
            r1 = r11
            r2 = 6
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "BACHER"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "MACHER"
            r4[r5] = r6
            boolean r0 = contains(r0, r1, r2, r3)
            if (r0 == 0) goto L83
            r0 = r13
            r12 = r0
            goto L86
        L83:
            r0 = 0
            r12 = r0
        L86:
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.conditionC0(java.lang.String, int):boolean");
    }

    private boolean conditionCH0(String str, int i10) {
        if (i10 != 0) {
            return false;
        }
        int i11 = i10 + 1;
        return (contains(str, i11, 5, "HARAC", "HARIS") || contains(str, i11, 3, "HOR", "HYM", "HIA", "HEM")) && !contains(str, 0, 5, "CHORE");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008e, code lost:
    
        if (r10 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        if ((r10 + 1) == (r9.length() - 1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean conditionCH1(java.lang.String r9, int r10) {
        /*
            Method dump skipped, instructions count: 179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(java.lang.String, int):boolean");
    }

    private boolean conditionL0(String str, int i10) {
        if (i10 == str.length() - 3 && contains(str, i10 - 1, 4, "ILLO", "ILLA", "ALLE")) {
            return true;
        }
        return (contains(str, str.length() - 2, 2, "AS", "OS") || contains(str, str.length() - 1, 1, "A", "O")) && contains(str, i10 - 1, 4, "ALLE");
    }

    private boolean conditionM0(String str, int i10) {
        boolean z10;
        int i11 = i10 + 1;
        if (charAt(str, i11) == 'M') {
            return true;
        }
        if (contains(str, i10 - 1, 3, "UMB")) {
            z10 = true;
            if (i11 != str.length() - 1) {
                if (contains(str, i10 + 2, 2, "ER")) {
                    z10 = true;
                }
            }
            return z10;
        }
        z10 = false;
        return z10;
    }

    public static boolean contains(String str, int i10, int i11, String... strArr) {
        boolean z10 = false;
        if (i10 >= 0) {
            int i12 = i11 + i10;
            z10 = false;
            if (i12 <= str.length()) {
                String substring = str.substring(i10, i12);
                int length = strArr.length;
                int i13 = 0;
                while (true) {
                    z10 = false;
                    if (i13 >= length) {
                        break;
                    }
                    if (substring.equals(strArr[i13])) {
                        z10 = true;
                        break;
                    }
                    i13++;
                }
            }
        }
        return z10;
    }

    private int handleAEIOUY(DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        if (i10 == 0) {
            doubleMetaphoneResult.append('A');
        }
        return i10 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
    
        if (contains(r9, r11, 3, "CIO", "CIE", "CIA") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int handleC(java.lang.String r9, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r10, int r11) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int):int");
    }

    private int handleCC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        int i11;
        int i12 = i10 + 2;
        if (!contains(str, i12, 1, "I", "E", "H") || contains(str, i12, 2, "HU")) {
            doubleMetaphoneResult.append('K');
            i11 = i12;
        } else {
            if ((i10 == 1 && charAt(str, i10 - 1) == 'A') || contains(str, i10 - 1, 5, "UCCEE", "UCCES")) {
                doubleMetaphoneResult.append("KS");
            } else {
                doubleMetaphoneResult.append('X');
            }
            i11 = i10 + 3;
        }
        return i11;
    }

    private int handleCH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        if (i10 > 0 && contains(str, i10, 4, "CHAE")) {
            doubleMetaphoneResult.append('K', 'X');
        } else {
            if (!conditionCH0(str, i10) && !conditionCH1(str, i10)) {
                if (i10 <= 0) {
                    doubleMetaphoneResult.append('X');
                } else if (contains(str, 0, 2, "MC")) {
                    doubleMetaphoneResult.append('K');
                } else {
                    doubleMetaphoneResult.append('X', 'K');
                }
                return i10 + 2;
            }
            doubleMetaphoneResult.append('K');
        }
        return i10 + 2;
    }

    private int handleD(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        int i11;
        if (contains(str, i10, 2, "DG")) {
            int i12 = i10 + 2;
            if (contains(str, i12, 1, "I", "E", "Y")) {
                doubleMetaphoneResult.append('J');
                i11 = i10 + 3;
            } else {
                doubleMetaphoneResult.append("TK");
                i11 = i12;
            }
        } else {
            boolean contains = contains(str, i10, 2, "DT", "DD");
            doubleMetaphoneResult.append('T');
            i11 = contains ? i10 + 2 : i10 + 1;
        }
        return i11;
    }

    private int handleG(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10, boolean z10) {
        int i11;
        int i12 = i10 + 1;
        if (charAt(str, i12) == 'H') {
            i11 = handleGH(str, doubleMetaphoneResult, i10);
        } else {
            if (charAt(str, i12) == 'N') {
                if (i10 == 1 && isVowel(charAt(str, 0)) && !z10) {
                    doubleMetaphoneResult.append("KN", "N");
                } else if (contains(str, i10 + 2, 2, "EY") || charAt(str, i12) == 'Y' || z10) {
                    doubleMetaphoneResult.append("KN");
                } else {
                    doubleMetaphoneResult.append("N", "KN");
                }
            } else if (contains(str, i12, 2, "LI") && !z10) {
                doubleMetaphoneResult.append("KL", "L");
            } else if (i10 == 0 && (charAt(str, i12) == 'Y' || contains(str, i12, 2, ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER))) {
                doubleMetaphoneResult.append('K', 'J');
            } else {
                if ((contains(str, i12, 2, "ER") || charAt(str, i12) == 'Y') && !contains(str, 0, 6, "DANGER", "RANGER", "MANGER")) {
                    int i13 = i10 - 1;
                    if (!contains(str, i13, 1, "E", "I") && !contains(str, i13, 3, "RGY", "OGY")) {
                        doubleMetaphoneResult.append('K', 'J');
                        i11 = i10 + 2;
                    }
                }
                if (contains(str, i12, 1, "E", "I", "Y") || contains(str, i10 - 1, 4, "AGGI", "OGGI")) {
                    if (contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH") || contains(str, i12, 2, "ET")) {
                        doubleMetaphoneResult.append('K');
                    } else if (contains(str, i12, 3, "IER")) {
                        doubleMetaphoneResult.append('J');
                    } else {
                        doubleMetaphoneResult.append('J', 'K');
                    }
                    i11 = i10 + 2;
                } else {
                    int i14 = i12;
                    if (charAt(str, i12) == 'G') {
                        i14 = i10 + 2;
                    }
                    doubleMetaphoneResult.append('K');
                    i11 = i14;
                }
            }
            i11 = i10 + 2;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fe, code lost:
    
        if (charAt(r9, r11 - 1) != 'I') goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int handleGH(java.lang.String r9, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r10, int r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int):int");
    }

    private int handleH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        int i11;
        if ((i10 == 0 || isVowel(charAt(str, i10 - 1))) && isVowel(charAt(str, i10 + 1))) {
            doubleMetaphoneResult.append('H');
            i11 = i10 + 2;
        } else {
            i11 = i10 + 1;
        }
        return i11;
    }

    private int handleJ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10, boolean z10) {
        int i11;
        if (contains(str, i10, 4, "JOSE") || contains(str, 0, 4, "SAN ")) {
            if ((i10 == 0 && charAt(str, i10 + 4) == ' ') || str.length() == 4 || contains(str, 0, 4, "SAN ")) {
                doubleMetaphoneResult.append('H');
            } else {
                doubleMetaphoneResult.append('J', 'H');
            }
            i11 = i10 + 1;
        } else {
            if (i10 != 0 || contains(str, i10, 4, "JOSE")) {
                int i12 = i10 - 1;
                if (isVowel(charAt(str, i12)) && !z10) {
                    int i13 = i10 + 1;
                    if (charAt(str, i13) == 'A' || charAt(str, i13) == 'O') {
                        doubleMetaphoneResult.append('J', 'H');
                    }
                }
                if (i10 == str.length() - 1) {
                    doubleMetaphoneResult.append('J', ' ');
                } else if (!contains(str, i10 + 1, 1, L_T_K_S_N_M_B_Z) && !contains(str, i12, 1, "S", "K", "L")) {
                    doubleMetaphoneResult.append('J');
                }
            } else {
                doubleMetaphoneResult.append('J', 'A');
            }
            int i14 = i10 + 1;
            i11 = i14;
            if (charAt(str, i14) == 'J') {
                i11 = i10 + 2;
            }
        }
        return i11;
    }

    private int handleL(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        int i11;
        int i12 = i10 + 1;
        if (charAt(str, i12) == 'L') {
            if (conditionL0(str, i10)) {
                doubleMetaphoneResult.appendPrimary('L');
            } else {
                doubleMetaphoneResult.append('L');
            }
            i11 = i10 + 2;
        } else {
            doubleMetaphoneResult.append('L');
            i11 = i12;
        }
        return i11;
    }

    private int handleP(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        int i11;
        int i12 = i10 + 1;
        if (charAt(str, i12) == 'H') {
            doubleMetaphoneResult.append('F');
            i11 = i10 + 2;
        } else {
            doubleMetaphoneResult.append('P');
            int i13 = i12;
            if (contains(str, i12, 1, "P", "B")) {
                i13 = i10 + 2;
            }
            i11 = i13;
        }
        return i11;
    }

    private int handleR(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10, boolean z10) {
        if (i10 != str.length() - 1 || z10 || !contains(str, i10 - 2, 2, "IE") || contains(str, i10 - 4, 2, "ME", "MA")) {
            doubleMetaphoneResult.append('R');
        } else {
            doubleMetaphoneResult.appendAlternate('R');
        }
        int i11 = i10 + 1;
        int i12 = i11;
        if (charAt(str, i11) == 'R') {
            i12 = i10 + 2;
        }
        return i12;
    }

    private int handleS(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10, boolean z10) {
        int i11;
        if (!contains(str, i10 - 1, 3, "ISL", "YSL")) {
            if (i10 != 0 || !contains(str, i10, 5, "SUGAR")) {
                if (!contains(str, i10, 2, "SH")) {
                    if (contains(str, i10, 3, "SIO", "SIA") || contains(str, i10, 4, "SIAN")) {
                        if (z10) {
                            doubleMetaphoneResult.append('S');
                        } else {
                            doubleMetaphoneResult.append('S', 'X');
                        }
                        i11 = i10 + 3;
                    } else {
                        if (i10 != 0 || !contains(str, i10 + 1, 1, "M", "N", "L", "W")) {
                            int i12 = i10 + 1;
                            if (!contains(str, i12, 1, "Z")) {
                                if (contains(str, i10, 2, "SC")) {
                                    i11 = handleSC(str, doubleMetaphoneResult, i10);
                                } else {
                                    if (i10 == str.length() - 1 && contains(str, i10 - 2, 2, "AI", "OI")) {
                                        doubleMetaphoneResult.appendAlternate('S');
                                    } else {
                                        doubleMetaphoneResult.append('S');
                                    }
                                    if (!contains(str, i12, 1, "S", "Z")) {
                                        i11 = i12;
                                    }
                                }
                            }
                        }
                        doubleMetaphoneResult.append('S', 'X');
                        int i13 = i10 + 1;
                        if (!contains(str, i13, 1, "Z")) {
                            i11 = i13;
                        }
                    }
                    return i11;
                }
                if (contains(str, i10 + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                    doubleMetaphoneResult.append('S');
                } else {
                    doubleMetaphoneResult.append('X');
                }
                i11 = i10 + 2;
                return i11;
            }
            doubleMetaphoneResult.append('X', 'S');
        }
        i11 = i10 + 1;
        return i11;
    }

    private int handleSC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        int i11 = i10 + 2;
        if (charAt(str, i11) == 'H') {
            int i12 = i10 + 3;
            if (contains(str, i12, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (contains(str, i12, 2, "ER", "EN")) {
                    doubleMetaphoneResult.append("X", "SK");
                }
                doubleMetaphoneResult.append("SK");
            } else if (i10 != 0 || isVowel(charAt(str, 3)) || charAt(str, 3) == 'W') {
                doubleMetaphoneResult.append('X');
            } else {
                doubleMetaphoneResult.append('X', 'S');
            }
        } else {
            if (contains(str, i11, 1, "I", "E", "Y")) {
                doubleMetaphoneResult.append('S');
            }
            doubleMetaphoneResult.append("SK");
        }
        return i10 + 3;
    }

    private int handleT(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        int i11;
        if (contains(str, i10, 4, "TION") || contains(str, i10, 3, "TIA", "TCH")) {
            doubleMetaphoneResult.append('X');
            i11 = i10 + 3;
        } else if (contains(str, i10, 2, "TH") || contains(str, i10, 3, "TTH")) {
            i11 = i10 + 2;
            if (contains(str, i11, 2, "OM", "AM") || contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH")) {
                doubleMetaphoneResult.append('T');
            } else {
                doubleMetaphoneResult.append('0', 'T');
            }
        } else {
            doubleMetaphoneResult.append('T');
            int i12 = i10 + 1;
            i11 = contains(str, i12, 1, "T", "D") ? i10 + 2 : i12;
        }
        return i11;
    }

    private int handleW(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        int i11;
        int i12 = 2;
        if (!contains(str, i10, 2, "WR")) {
            if (i10 == 0) {
                int i13 = i10 + 1;
                if (isVowel(charAt(str, i13)) || contains(str, i10, 2, "WH")) {
                    if (isVowel(charAt(str, i13))) {
                        doubleMetaphoneResult.append('A', 'F');
                    } else {
                        doubleMetaphoneResult.append('A');
                    }
                    i11 = i13;
                    return i11;
                }
            }
            if ((i10 == str.length() - 1 && isVowel(charAt(str, i10 - 1))) || contains(str, i10 - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || contains(str, 0, 3, "SCH")) {
                doubleMetaphoneResult.appendAlternate('F');
            } else {
                i12 = 4;
                if (contains(str, i10, 4, "WICZ", "WITZ")) {
                    doubleMetaphoneResult.append("TS", "FX");
                }
            }
            i11 = i10 + 1;
            return i11;
        }
        doubleMetaphoneResult.append('R');
        i11 = i10 + i12;
        return i11;
    }

    private int handleX(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10) {
        int i11;
        if (i10 == 0) {
            doubleMetaphoneResult.append('S');
            i11 = i10 + 1;
        } else {
            if (i10 != str.length() - 1 || (!contains(str, i10 - 3, 3, "IAU", "EAU") && !contains(str, i10 - 2, 2, "AU", "OU"))) {
                doubleMetaphoneResult.append("KS");
            }
            int i12 = i10 + 1;
            i11 = contains(str, i12, 1, "C", "X") ? i10 + 2 : i12;
        }
        return i11;
    }

    private int handleZ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i10, boolean z10) {
        int i11;
        int i12 = i10 + 1;
        if (charAt(str, i12) == 'H') {
            doubleMetaphoneResult.append('J');
            i11 = i10 + 2;
        } else {
            if (contains(str, i12, 2, "ZO", "ZI", "ZA") || (z10 && i10 > 0 && charAt(str, i10 - 1) != 'T')) {
                doubleMetaphoneResult.append("S", "TS");
            } else {
                doubleMetaphoneResult.append('S');
            }
            int i13 = i12;
            if (charAt(str, i12) == 'Z') {
                i13 = i10 + 2;
            }
            i11 = i13;
        }
        return i11;
    }

    private boolean isSilentStart(String str) {
        boolean z10;
        String[] strArr = SILENT_START;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            z10 = false;
            if (i10 >= length) {
                break;
            }
            if (str.startsWith(strArr[i10])) {
                z10 = true;
                break;
            }
            i10++;
        }
        return z10;
    }

    private boolean isSlavoGermanic(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.indexOf("CZ") > -1 || str.indexOf("WITZ") > -1;
    }

    private boolean isVowel(char c10) {
        return VOWELS.indexOf(c10) != -1;
    }

    public char charAt(String str, int i10) {
        if (i10 < 0 || i10 >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i10);
    }

    public String doubleMetaphone(String str) {
        return doubleMetaphone(str, false);
    }

    public String doubleMetaphone(String str, boolean z10) {
        int i10;
        String cleanInput = cleanInput(str);
        if (cleanInput == null) {
            return null;
        }
        boolean isSlavoGermanic = isSlavoGermanic(cleanInput);
        int isSilentStart = isSilentStart(cleanInput);
        DoubleMetaphoneResult doubleMetaphoneResult = new DoubleMetaphoneResult(this, getMaxCodeLen());
        while (!doubleMetaphoneResult.isComplete() && isSilentStart <= cleanInput.length() - 1) {
            char charAt = cleanInput.charAt(isSilentStart);
            if (charAt == 199) {
                doubleMetaphoneResult.append('S');
            } else if (charAt != 209) {
                switch (charAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'Y':
                        isSilentStart = handleAEIOUY(doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'B':
                        doubleMetaphoneResult.append('P');
                        int i11 = isSilentStart + 1;
                        i10 = i11;
                        if (charAt(cleanInput, i11) != 'B') {
                            isSilentStart = i10;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'C':
                        isSilentStart = handleC(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'D':
                        isSilentStart = handleD(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'F':
                        doubleMetaphoneResult.append('F');
                        int i12 = isSilentStart + 1;
                        i10 = i12;
                        if (charAt(cleanInput, i12) != 'F') {
                            isSilentStart = i10;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'G':
                        isSilentStart = handleG(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'H':
                        isSilentStart = handleH(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'J':
                        isSilentStart = handleJ(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'K':
                        doubleMetaphoneResult.append('K');
                        int i13 = isSilentStart + 1;
                        i10 = i13;
                        if (charAt(cleanInput, i13) != 'K') {
                            isSilentStart = i10;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'L':
                        isSilentStart = handleL(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'M':
                        doubleMetaphoneResult.append('M');
                        if (!conditionM0(cleanInput, isSilentStart)) {
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'N':
                        doubleMetaphoneResult.append('N');
                        int i14 = isSilentStart + 1;
                        i10 = i14;
                        if (charAt(cleanInput, i14) != 'N') {
                            isSilentStart = i10;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'P':
                        isSilentStart = handleP(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'Q':
                        doubleMetaphoneResult.append('K');
                        int i15 = isSilentStart + 1;
                        i10 = i15;
                        if (charAt(cleanInput, i15) != 'Q') {
                            isSilentStart = i10;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'R':
                        isSilentStart = handleR(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'S':
                        isSilentStart = handleS(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'T':
                        isSilentStart = handleT(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'V':
                        doubleMetaphoneResult.append('F');
                        int i16 = isSilentStart + 1;
                        i10 = i16;
                        if (charAt(cleanInput, i16) != 'V') {
                            isSilentStart = i10;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'W':
                        isSilentStart = handleW(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'X':
                        isSilentStart = handleX(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'Z':
                        isSilentStart = handleZ(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                }
            } else {
                doubleMetaphoneResult.append('N');
            }
            isSilentStart++;
        }
        return z10 ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof String) {
            return doubleMetaphone((String) obj);
        }
        throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return doubleMetaphone(str);
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2, boolean z10) {
        return StringUtils.equals(doubleMetaphone(str, z10), doubleMetaphone(str2, z10));
    }

    public void setMaxCodeLen(int i10) {
        this.maxCodeLen = i10;
    }
}
