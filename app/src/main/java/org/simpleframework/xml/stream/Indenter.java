package org.simpleframework.xml.stream;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/Indenter.class */
class Indenter {
    private Cache cache;
    private int count;
    private int indent;
    private int index;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/Indenter$Cache.class */
    public static class Cache {
        private int count;
        private String[] list;

        public Cache(int i10) {
            this.list = new String[i10];
        }

        private void resize(int i10) {
            String[] strArr = new String[i10];
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.list;
                if (i11 >= strArr2.length) {
                    this.list = strArr;
                    return;
                } else {
                    strArr[i11] = strArr2[i11];
                    i11++;
                }
            }
        }

        public String get(int i10) {
            String[] strArr = this.list;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
            return null;
        }

        public void set(int i10, String str) {
            if (i10 >= this.list.length) {
                resize(i10 * 2);
            }
            if (i10 > this.count) {
                this.count = i10;
            }
            this.list[i10] = str;
        }

        public int size() {
            return this.count;
        }
    }

    public Indenter() {
        this(new Format());
    }

    public Indenter(Format format) {
        this(format, 16);
    }

    private Indenter(Format format, int i10) {
        this.indent = format.getIndent();
        this.cache = new Cache(i10);
    }

    private String create() {
        int i10 = this.count;
        char[] cArr = new char[i10 + 1];
        if (i10 <= 0) {
            return "\n";
        }
        cArr[0] = '\n';
        for (int i11 = 1; i11 <= this.count; i11++) {
            cArr[i11] = ' ';
        }
        return new String(cArr);
    }

    private String indent(int i10) {
        if (this.indent <= 0) {
            return "";
        }
        String str = this.cache.get(i10);
        String str2 = str;
        if (str == null) {
            str2 = create();
            this.cache.set(i10, str2);
        }
        return this.cache.size() > 0 ? str2 : "";
    }

    public String pop() {
        int i10 = this.index - 1;
        this.index = i10;
        String indent = indent(i10);
        int i11 = this.indent;
        if (i11 > 0) {
            this.count -= i11;
        }
        return indent;
    }

    public String push() {
        int i10 = this.index;
        this.index = i10 + 1;
        String indent = indent(i10);
        int i11 = this.indent;
        if (i11 > 0) {
            this.count += i11;
        }
        return indent;
    }

    public String top() {
        return indent(this.index);
    }
}
