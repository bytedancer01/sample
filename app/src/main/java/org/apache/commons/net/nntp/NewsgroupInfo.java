package org.apache.commons.net.nntp;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/NewsgroupInfo.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/NewsgroupInfo.class */
public final class NewsgroupInfo {
    public static final int MODERATED_POSTING_PERMISSION = 1;
    public static final int PERMITTED_POSTING_PERMISSION = 2;
    public static final int PROHIBITED_POSTING_PERMISSION = 3;
    public static final int UNKNOWN_POSTING_PERMISSION = 0;
    private long __estimatedArticleCount;
    private long __firstArticle;
    private long __lastArticle;
    private String __newsgroup;
    private int __postingPermission;

    public void _setArticleCount(long j10) {
        this.__estimatedArticleCount = j10;
    }

    public void _setFirstArticle(long j10) {
        this.__firstArticle = j10;
    }

    public void _setLastArticle(long j10) {
        this.__lastArticle = j10;
    }

    public void _setNewsgroup(String str) {
        this.__newsgroup = str;
    }

    public void _setPostingPermission(int i10) {
        this.__postingPermission = i10;
    }

    @Deprecated
    public int getArticleCount() {
        return (int) this.__estimatedArticleCount;
    }

    public long getArticleCountLong() {
        return this.__estimatedArticleCount;
    }

    @Deprecated
    public int getFirstArticle() {
        return (int) this.__firstArticle;
    }

    public long getFirstArticleLong() {
        return this.__firstArticle;
    }

    @Deprecated
    public int getLastArticle() {
        return (int) this.__lastArticle;
    }

    public long getLastArticleLong() {
        return this.__lastArticle;
    }

    public String getNewsgroup() {
        return this.__newsgroup;
    }

    public int getPostingPermission() {
        return this.__postingPermission;
    }
}
