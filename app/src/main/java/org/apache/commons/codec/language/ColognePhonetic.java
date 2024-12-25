package org.apache.commons.codec.language;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/ColognePhonetic.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/ColognePhonetic.class */
public class ColognePhonetic implements StringEncoder {
    private static final char[] AEIJOUY = {'A', 'E', 'I', 'J', 'O', 'U', 'Y'};
    private static final char[] SCZ = {'S', 'C', 'Z'};
    private static final char[] WFPV = {'W', 'F', 'P', 'V'};
    private static final char[] GKQ = {'G', 'K', 'Q'};
    private static final char[] CKQ = {'C', 'K', 'Q'};
    private static final char[] AHKLOQRUX = {'A', 'H', 'K', 'L', 'O', 'Q', 'R', 'U', 'X'};

    /* renamed from: SZ */
    private static final char[] f36117SZ = {'S', 'Z'};
    private static final char[] AHOUKQX = {'A', 'H', 'O', 'U', 'K', 'Q', 'X'};
    private static final char[] TDX = {'T', 'D', 'X'};
    private static final char[][] PREPROCESS_MAP = {new char[]{196, 'A'}, new char[]{220, 'U'}, new char[]{214, 'O'}, new char[]{223, 'S'}};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/ColognePhonetic$CologneBuffer.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/ColognePhonetic$CologneBuffer.class */
    public abstract class CologneBuffer {
        public final char[] data;
        public int length;
        public final ColognePhonetic this$0;

        public CologneBuffer(ColognePhonetic colognePhonetic, int i10) {
            this.this$0 = colognePhonetic;
            this.length = 0;
            this.data = new char[i10];
            this.length = 0;
        }

        public CologneBuffer(ColognePhonetic colognePhonetic, char[] cArr) {
            this.this$0 = colognePhonetic;
            this.length = 0;
            this.data = cArr;
            this.length = cArr.length;
        }

        public abstract char[] copyData(int i10, int i11);

        public int length() {
            return this.length;
        }

        public String toString() {
            return new String(copyData(0, this.length));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer.class */
    public class CologneInputBuffer extends CologneBuffer {
        public final ColognePhonetic this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CologneInputBuffer(ColognePhonetic colognePhonetic, char[] cArr) {
            super(colognePhonetic, cArr);
            this.this$0 = colognePhonetic;
        }

        public void addLeft(char c10) {
            this.length++;
            this.data[getNextPos()] = c10;
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i10, int i11) {
            char[] cArr = new char[i11];
            char[] cArr2 = this.data;
            System.arraycopy(cArr2, (cArr2.length - this.length) + i10, cArr, 0, i11);
            return cArr;
        }

        public char getNextChar() {
            return this.data[getNextPos()];
        }

        public int getNextPos() {
            return this.data.length - this.length;
        }

        public char removeNext() {
            char nextChar = getNextChar();
            this.length--;
            return nextChar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer.class */
    public class CologneOutputBuffer extends CologneBuffer {
        public final ColognePhonetic this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CologneOutputBuffer(ColognePhonetic colognePhonetic, int i10) {
            super(colognePhonetic, i10);
            this.this$0 = colognePhonetic;
        }

        public void addRight(char c10) {
            char[] cArr = this.data;
            int i10 = this.length;
            cArr[i10] = c10;
            this.length = i10 + 1;
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i10, int i11) {
            char[] cArr = new char[i11];
            System.arraycopy(this.data, i10, cArr, 0, i11);
            return cArr;
        }
    }

    private static boolean arrayContains(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    private String preprocess(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (charArray[i10] > 'Z') {
                char[][] cArr = PREPROCESS_MAP;
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        char[] cArr2 = cArr[i11];
                        if (charArray[i10] == cArr2[0]) {
                            charArray[i10] = cArr2[1];
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return new String(charArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x015c, code lost:
    
        if (arrayContains(org.apache.commons.codec.language.ColognePhonetic.AHOUKQX, r10) == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String colognePhonetic(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.ColognePhonetic.colognePhonetic(java.lang.String):java.lang.String");
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + obj.getClass().getName() + InstructionFileId.DOT);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return colognePhonetic(str);
    }

    public boolean isEncodeEqual(String str, String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }
}
