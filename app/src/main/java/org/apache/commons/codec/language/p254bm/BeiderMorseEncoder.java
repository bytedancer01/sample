package org.apache.commons.codec.language.p254bm;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/bm/BeiderMorseEncoder.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/BeiderMorseEncoder.class */
public class BeiderMorseEncoder implements StringEncoder {
    private PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("BeiderMorseEncoder encode parameter is not of type String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null) {
            return null;
        }
        return this.engine.encode(str);
    }

    public NameType getNameType() {
        return this.engine.getNameType();
    }

    public RuleType getRuleType() {
        return this.engine.getRuleType();
    }

    public boolean isConcat() {
        return this.engine.isConcat();
    }

    public void setConcat(boolean z10) {
        this.engine = new PhoneticEngine(this.engine.getNameType(), this.engine.getRuleType(), z10, this.engine.getMaxPhonemes());
    }

    public void setMaxPhonemes(int i10) {
        this.engine = new PhoneticEngine(this.engine.getNameType(), this.engine.getRuleType(), this.engine.isConcat(), i10);
    }

    public void setNameType(NameType nameType) {
        this.engine = new PhoneticEngine(nameType, this.engine.getRuleType(), this.engine.isConcat(), this.engine.getMaxPhonemes());
    }

    public void setRuleType(RuleType ruleType) {
        this.engine = new PhoneticEngine(this.engine.getNameType(), ruleType, this.engine.isConcat(), this.engine.getMaxPhonemes());
    }
}
