package org.simpleframework.xml.stream;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/HyphenBuilder.class */
class HyphenBuilder implements Style {

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/HyphenBuilder$Parser.class */
    public class Parser extends Splitter {
        public final HyphenBuilder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Parser(HyphenBuilder hyphenBuilder, String str) {
            super(str);
            this.this$0 = hyphenBuilder;
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] cArr, int i10, int i11) {
            this.builder.append(cArr, i10, i11);
            if (i10 + i11 < this.count) {
                this.builder.append('-');
            }
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i10, int i11) {
            cArr[i10] = toLower(cArr[i10]);
        }
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }
}
