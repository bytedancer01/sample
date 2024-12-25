package org.apache.commons.net.nntp;

import java.io.PrintStream;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/Article.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/Article.class */
public class Article implements Threadable {
    private String articleId;
    private String date;
    private String from;
    public Article kid;
    public Article next;
    private ArrayList<String> references;
    private String simplifiedSubject;
    private String subject;
    private boolean isReply = false;
    private long articleNumber = -1;

    private void flushSubjectCache() {
        this.simplifiedSubject = null;
    }

    public static void printThread(Article article) {
        printThread(article, 0, System.out);
    }

    public static void printThread(Article article, int i10) {
        printThread(article, i10, System.out);
    }

    public static void printThread(Article article, int i10, PrintStream printStream) {
        for (int i11 = 0; i11 < i10; i11++) {
            printStream.print("==>");
        }
        printStream.println(article.getSubject() + "\t" + article.getFrom() + "\t" + article.getArticleId());
        Article article2 = article.kid;
        if (article2 != null) {
            printThread(article2, i10 + 1);
        }
        Article article3 = article.next;
        if (article3 != null) {
            printThread(article3, i10);
        }
    }

    public static void printThread(Article article, PrintStream printStream) {
        printThread(article, 0, printStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void simplifySubject() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.nntp.Article.simplifySubject():void");
    }

    @Deprecated
    public void addHeaderField(String str, String str2) {
    }

    public void addReference(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.isReply = true;
        for (String str2 : str.split(" ")) {
            this.references.add(str2);
        }
    }

    public String getArticleId() {
        return this.articleId;
    }

    @Deprecated
    public int getArticleNumber() {
        return (int) this.articleNumber;
    }

    public long getArticleNumberLong() {
        return this.articleNumber;
    }

    public String getDate() {
        return this.date;
    }

    public String getFrom() {
        return this.from;
    }

    public String[] getReferences() {
        ArrayList<String> arrayList = this.references;
        return arrayList == null ? new String[0] : (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String getSubject() {
        return this.subject;
    }

    @Override // org.apache.commons.net.nntp.Threadable
    public boolean isDummy() {
        return this.articleNumber == -1;
    }

    @Override // org.apache.commons.net.nntp.Threadable
    public Threadable makeDummy() {
        return new Article();
    }

    @Override // org.apache.commons.net.nntp.Threadable
    public String messageThreadId() {
        return this.articleId;
    }

    @Override // org.apache.commons.net.nntp.Threadable
    public String[] messageThreadReferences() {
        return getReferences();
    }

    public void setArticleId(String str) {
        this.articleId = str;
    }

    @Deprecated
    public void setArticleNumber(int i10) {
        this.articleNumber = i10;
    }

    public void setArticleNumber(long j10) {
        this.articleNumber = j10;
    }

    @Override // org.apache.commons.net.nntp.Threadable
    public void setChild(Threadable threadable) {
        this.kid = (Article) threadable;
        flushSubjectCache();
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    @Override // org.apache.commons.net.nntp.Threadable
    public void setNext(Threadable threadable) {
        this.next = (Article) threadable;
        flushSubjectCache();
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    @Override // org.apache.commons.net.nntp.Threadable
    public String simplifiedSubject() {
        if (this.simplifiedSubject == null) {
            simplifySubject();
        }
        return this.simplifiedSubject;
    }

    @Override // org.apache.commons.net.nntp.Threadable
    public boolean subjectIsReply() {
        return this.isReply;
    }

    public String toString() {
        return this.articleNumber + " " + this.articleId + " " + this.subject;
    }
}
