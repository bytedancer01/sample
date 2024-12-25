package org.jsoup.examples;

import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/* loaded from: combined.jar:classes3.jar:org/jsoup/examples/HtmlToPlainText.class */
public class HtmlToPlainText {
    private static final int timeout = 5000;
    private static final String userAgent = "Mozilla/5.0 (jsoup)";

    /* loaded from: combined.jar:classes3.jar:org/jsoup/examples/HtmlToPlainText$FormattingVisitor.class */
    public class FormattingVisitor implements NodeVisitor {
        private static final int maxWidth = 80;
        private StringBuilder accum;
        public final HtmlToPlainText this$0;
        private int width;

        private FormattingVisitor(HtmlToPlainText htmlToPlainText) {
            this.this$0 = htmlToPlainText;
            this.width = 0;
            this.accum = new StringBuilder();
        }

        private void append(String str) {
            if (str.startsWith("\n")) {
                this.width = 0;
            }
            if (str.equals(" ")) {
                if (this.accum.length() == 0) {
                    return;
                }
                StringBuilder sb2 = this.accum;
                if (StringUtil.m32152in(sb2.substring(sb2.length() - 1), " ", "\n")) {
                    return;
                }
            }
            if (str.length() + this.width <= 80) {
                this.accum.append(str);
                this.width += str.length();
                return;
            }
            String[] split = str.split("\\s+");
            int i10 = 0;
            while (i10 < split.length) {
                String str2 = split[i10];
                String str3 = str2;
                if (!(i10 == split.length - 1)) {
                    str3 = str2 + " ";
                }
                if (str3.length() + this.width > 80) {
                    StringBuilder sb3 = this.accum;
                    sb3.append("\n");
                    sb3.append(str3);
                    this.width = str3.length();
                } else {
                    this.accum.append(str3);
                    this.width += str3.length();
                }
                i10++;
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i10) {
            String str;
            String nodeName = node.nodeName();
            if (node instanceof TextNode) {
                str = ((TextNode) node).text();
            } else if (nodeName.equals("li")) {
                str = "\n * ";
            } else if (nodeName.equals("dt")) {
                str = "  ";
            } else if (!StringUtil.m32152in(nodeName, "p", "h1", "h2", "h3", "h4", "h5", "tr")) {
                return;
            } else {
                str = "\n";
            }
            append(str);
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i10) {
            String format;
            String nodeName = node.nodeName();
            if (StringUtil.m32152in(nodeName, "br", "dd", "dt", "p", "h1", "h2", "h3", "h4", "h5")) {
                format = "\n";
            } else if (!nodeName.equals("a")) {
                return;
            } else {
                format = String.format(" <%s>", node.absUrl("href"));
            }
            append(format);
        }

        public String toString() {
            return this.accum.toString();
        }
    }

    public static void main(String... strArr) {
        Validate.isTrue(strArr.length == 1 || strArr.length == 2, "usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]");
        String str = strArr[0];
        String str2 = strArr.length == 2 ? strArr[1] : null;
        Document document = Jsoup.connect(str).userAgent(userAgent).timeout(5000).get();
        HtmlToPlainText htmlToPlainText = new HtmlToPlainText();
        if (str2 == null) {
            System.out.println(htmlToPlainText.getPlainText(document));
            return;
        }
        Iterator<Element> it = document.select(str2).iterator();
        while (it.hasNext()) {
            System.out.println(htmlToPlainText.getPlainText(it.next()));
        }
    }

    public String getPlainText(Element element) {
        FormattingVisitor formattingVisitor = new FormattingVisitor();
        new NodeTraversor(formattingVisitor).traverse(element);
        return formattingVisitor.toString();
    }
}
