package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Style;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/PathParser.class */
class PathParser implements Expression {
    public boolean attribute;
    public String cache;
    public int count;
    public char[] data;
    public String location;
    public int off;
    public String path;
    public int start;
    public Style style;
    public Type type;
    public Cache<String> attributes = new ConcurrentCache();
    public Cache<String> elements = new ConcurrentCache();
    public List<Integer> indexes = new ArrayList();
    public List<String> prefixes = new ArrayList();
    public List<String> names = new ArrayList();
    public StringBuilder builder = new StringBuilder();

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/PathParser$PathSection.class */
    public class PathSection implements Expression {
        private int begin;
        private List<String> cache = new ArrayList();
        private int end;
        private String path;
        private String section;
        public final PathParser this$0;

        public PathSection(PathParser pathParser, int i10, int i11) {
            this.this$0 = pathParser;
            this.begin = i10;
            this.end = i11;
        }

        private String getCanonicalPath() {
            int i10 = 0;
            int i11 = 0;
            while (i10 < this.begin) {
                i11 = this.this$0.location.indexOf(47, i11 + 1);
                i10++;
            }
            int i12 = i11;
            int i13 = i10;
            while (i13 <= this.end) {
                int indexOf = this.this$0.location.indexOf(47, i12 + 1);
                int i14 = indexOf;
                if (indexOf == -1) {
                    i14 = this.this$0.location.length();
                }
                i13++;
                i12 = i14;
            }
            return this.this$0.location.substring(i11 + 1, i12);
        }

        private String getFragment() {
            int i10;
            int i11 = this.this$0.start;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = i11;
                if (i12 > this.end) {
                    break;
                }
                PathParser pathParser = this.this$0;
                if (i11 >= pathParser.count) {
                    i10 = i11 + 1;
                    break;
                }
                char[] cArr = pathParser.data;
                int i14 = i11 + 1;
                int i15 = i12;
                if (cArr[i11] == '/') {
                    i12++;
                    i15 = i12;
                    if (i12 == this.begin) {
                        i11 = i14;
                        i13 = i11;
                    }
                }
                i11 = i14;
                i12 = i15;
            }
            return new String(this.this$0.data, i13, (i10 - 1) - i13);
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getAttribute(String str) {
            String path = getPath();
            String str2 = str;
            if (path != null) {
                str2 = this.this$0.getAttributePath(path, str);
            }
            return str2;
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getElement(String str) {
            String path = getPath();
            String str2 = str;
            if (path != null) {
                str2 = this.this$0.getElementPath(path, str);
            }
            return str2;
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getFirst() {
            return this.this$0.names.get(this.begin);
        }

        @Override // org.simpleframework.xml.core.Expression
        public int getIndex() {
            return this.this$0.indexes.get(this.begin).intValue();
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getLast() {
            return this.this$0.names.get(this.end);
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getPath() {
            if (this.section == null) {
                this.section = getCanonicalPath();
            }
            return this.section;
        }

        @Override // org.simpleframework.xml.core.Expression
        public Expression getPath(int i10) {
            return getPath(i10, 0);
        }

        @Override // org.simpleframework.xml.core.Expression
        public Expression getPath(int i10, int i11) {
            return new PathSection(this.this$0, this.begin + i10, this.end - i11);
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getPrefix() {
            return this.this$0.prefixes.get(this.begin);
        }

        @Override // org.simpleframework.xml.core.Expression
        public boolean isAttribute() {
            PathParser pathParser = this.this$0;
            boolean z10 = false;
            if (pathParser.attribute) {
                z10 = false;
                if (this.end >= pathParser.names.size() - 1) {
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // org.simpleframework.xml.core.Expression
        public boolean isEmpty() {
            return this.begin == this.end;
        }

        @Override // org.simpleframework.xml.core.Expression
        public boolean isPath() {
            boolean z10 = true;
            if (this.end - this.begin < 1) {
                z10 = false;
            }
            return z10;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            if (this.cache.isEmpty()) {
                for (int i10 = this.begin; i10 <= this.end; i10++) {
                    String str = this.this$0.names.get(i10);
                    if (str != null) {
                        this.cache.add(str);
                    }
                }
            }
            return this.cache.iterator();
        }

        @Override // org.simpleframework.xml.core.Expression
        public String toString() {
            if (this.path == null) {
                this.path = getFragment();
            }
            return this.path;
        }
    }

    public PathParser(String str, Type type, Format format) {
        this.style = format.getStyle();
        this.type = type;
        this.path = str;
        parse(str);
    }

    private void align() {
        if (this.names.size() > this.indexes.size()) {
            this.indexes.add(1);
        }
    }

    private void attribute() {
        char c10;
        int i10 = this.off + 1;
        this.off = i10;
        do {
            int i11 = this.off;
            if (i11 >= this.count) {
                if (i11 <= i10) {
                    throw new PathException("Attribute reference in '%s' for %s is empty", this.path, this.type);
                }
                this.attribute = true;
                attribute(i10, i11 - i10);
                return;
            }
            char[] cArr = this.data;
            this.off = i11 + 1;
            c10 = cArr[i11];
        } while (isValid(c10));
        throw new PathException("Illegal character '%s' in attribute for '%s' in %s", Character.valueOf(c10), this.path, this.type);
    }

    private void attribute(int i10, int i11) {
        String str = new String(this.data, i10, i11);
        if (i11 > 0) {
            attribute(str);
        }
    }

    private void attribute(String str) {
        String attribute = this.style.getAttribute(str);
        this.prefixes.add(null);
        this.names.add(attribute);
    }

    private void build() {
        int size = this.names.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = this.prefixes.get(i10);
            String str2 = this.names.get(i10);
            int intValue = this.indexes.get(i10).intValue();
            if (i10 > 0) {
                this.builder.append('/');
            }
            if (this.attribute && i10 == size - 1) {
                this.builder.append('@');
                this.builder.append(str2);
            } else {
                if (str != null) {
                    this.builder.append(str);
                    this.builder.append(':');
                }
                this.builder.append(str2);
                this.builder.append('[');
                this.builder.append(intValue);
                this.builder.append(']');
            }
        }
        this.location = this.builder.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
    
        element(r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void element() {
        /*
            r8 = this;
            r0 = r8
            int r0 = r0.off
            r11 = r0
            r0 = 0
            r10 = r0
        L7:
            r0 = r8
            int r0 = r0.off
            r12 = r0
            r0 = r12
            r1 = r8
            int r1 = r1.count
            if (r0 >= r1) goto L84
            r0 = r8
            char[] r0 = r0.data
            r13 = r0
            r0 = r8
            r1 = r12
            r2 = 1
            int r1 = r1 + r2
            r0.off = r1
            r0 = r13
            r1 = r12
            char r0 = r0[r1]
            r9 = r0
            r0 = r8
            r1 = r9
            boolean r0 = r0.isValid(r1)
            if (r0 != 0) goto L7e
            r0 = r9
            r1 = 64
            if (r0 != r1) goto L45
            r0 = r8
            r1 = r8
            int r1 = r1.off
            r2 = 1
            int r1 = r1 - r2
            r0.off = r1
            goto L84
        L45:
            r0 = r9
            r1 = 91
            if (r0 != r1) goto L52
            r0 = r8
            r0.index()
            goto L84
        L52:
            r0 = r9
            r1 = 47
            if (r0 != r1) goto L5b
            goto L84
        L5b:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            r1 = r0
            java.lang.String r2 = "Illegal character '%s' in element for '%s' in %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r8
            java.lang.String r6 = r6.path
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r8
            org.simpleframework.xml.strategy.Type r6 = r6.type
            r4[r5] = r6
            r1.<init>(r2, r3)
            throw r0
        L7e:
            int r10 = r10 + 1
            goto L7
        L84:
            r0 = r8
            r1 = r11
            r2 = r10
            r0.element(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.PathParser.element():void");
    }

    private void element(int i10, int i11) {
        String str = new String(this.data, i10, i11);
        if (i11 > 0) {
            element(str);
        }
    }

    private void element(String str) {
        String str2;
        String str3;
        int indexOf = str.indexOf(58);
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            str3 = substring;
            str2 = substring2;
        } else {
            str2 = str;
            str3 = null;
        }
        String element = this.style.getElement(str2);
        this.prefixes.add(str3);
        this.names.add(element);
    }

    private void index() {
        int i10;
        if (this.data[this.off - 1] == '[') {
            int i11 = 0;
            while (true) {
                int i12 = i11;
                int i13 = this.off;
                i10 = i12;
                if (i13 >= this.count) {
                    break;
                }
                char[] cArr = this.data;
                this.off = i13 + 1;
                char c10 = cArr[i13];
                if (!isDigit(c10)) {
                    i10 = i12;
                    break;
                }
                i11 = ((i12 * 10) + c10) - 48;
            }
        } else {
            i10 = 0;
        }
        char[] cArr2 = this.data;
        int i14 = this.off;
        this.off = i14 + 1;
        if (cArr2[i14 - 1] != ']') {
            throw new PathException("Invalid index for path '%s' in %s", this.path, this.type);
        }
        this.indexes.add(Integer.valueOf(i10));
    }

    private boolean isDigit(char c10) {
        return Character.isDigit(c10);
    }

    private boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private boolean isLetter(char c10) {
        return Character.isLetterOrDigit(c10);
    }

    private boolean isSpecial(char c10) {
        return c10 == '_' || c10 == '-' || c10 == ':';
    }

    private boolean isValid(char c10) {
        return isLetter(c10) || isSpecial(c10);
    }

    private void parse(String str) {
        if (str != null) {
            int length = str.length();
            this.count = length;
            char[] cArr = new char[length];
            this.data = cArr;
            str.getChars(0, length, cArr, 0);
        }
        path();
    }

    private void path() {
        char c10 = this.data[this.off];
        if (c10 == '/') {
            throw new PathException("Path '%s' in %s references document root", this.path, this.type);
        }
        if (c10 == '.') {
            skip();
        }
        while (this.off < this.count) {
            if (this.attribute) {
                throw new PathException("Path '%s' in %s references an invalid attribute", this.path, this.type);
            }
            segment();
        }
        truncate();
        build();
    }

    private void segment() {
        char c10 = this.data[this.off];
        if (c10 == '/') {
            throw new PathException("Invalid path expression '%s' in %s", this.path, this.type);
        }
        if (c10 == '@') {
            attribute();
        } else {
            element();
        }
        align();
    }

    private void skip() {
        char[] cArr = this.data;
        if (cArr.length > 1) {
            int i10 = this.off;
            if (cArr[i10 + 1] != '/') {
                throw new PathException("Path '%s' in %s has an illegal syntax", this.path, this.type);
            }
            this.off = i10 + 1;
        }
        int i11 = this.off + 1;
        this.off = i11;
        this.start = i11;
    }

    private void truncate() {
        int i10 = this.off;
        char[] cArr = this.data;
        if (i10 - 1 < cArr.length && cArr[i10 - 1] != '/') {
            return;
        }
        this.off = i10 - 1;
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getAttribute(String str) {
        if (isEmpty(this.location)) {
            return this.style.getAttribute(str);
        }
        String fetch = this.attributes.fetch(str);
        String str2 = fetch;
        if (fetch == null) {
            String attributePath = getAttributePath(this.location, str);
            str2 = attributePath;
            if (attributePath != null) {
                this.attributes.cache(str, attributePath);
                str2 = attributePath;
            }
        }
        return str2;
    }

    public String getAttributePath(String str, String str2) {
        String attribute = this.style.getAttribute(str2);
        if (isEmpty(str)) {
            return attribute;
        }
        return str + "/@" + attribute;
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getElement(String str) {
        if (isEmpty(this.location)) {
            return this.style.getElement(str);
        }
        String fetch = this.elements.fetch(str);
        String str2 = fetch;
        if (fetch == null) {
            String elementPath = getElementPath(this.location, str);
            str2 = elementPath;
            if (elementPath != null) {
                this.elements.cache(str, elementPath);
                str2 = elementPath;
            }
        }
        return str2;
    }

    public String getElementPath(String str, String str2) {
        String element = this.style.getElement(str2);
        if (isEmpty(element)) {
            return str;
        }
        if (isEmpty(str)) {
            return element;
        }
        return str + "/" + element + "[1]";
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getFirst() {
        return this.names.get(0);
    }

    @Override // org.simpleframework.xml.core.Expression
    public int getIndex() {
        return this.indexes.get(0).intValue();
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getLast() {
        return this.names.get(this.names.size() - 1);
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getPath() {
        return this.location;
    }

    @Override // org.simpleframework.xml.core.Expression
    public Expression getPath(int i10) {
        return getPath(i10, 0);
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // org.simpleframework.xml.core.Expression
    public org.simpleframework.xml.core.Expression getPath(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */

    @Override // org.simpleframework.xml.core.Expression
    public String getPrefix() {
        return this.prefixes.get(0);
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isAttribute() {
        return this.attribute;
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isEmpty() {
        return isEmpty(this.location);
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isPath() {
        boolean z10 = true;
        if (this.names.size() <= 1) {
            z10 = false;
        }
        return z10;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.names.iterator();
    }

    @Override // org.simpleframework.xml.core.Expression
    public String toString() {
        int i10 = this.off;
        int i11 = this.start;
        if (this.cache == null) {
            this.cache = new String(this.data, i11, i10 - i11);
        }
        return this.cache;
    }
}
