package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Vector;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.p255io.DotTerminatedMessageReader;
import org.apache.commons.net.p255io.DotTerminatedMessageWriter;
import org.apache.commons.net.p255io.Util;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/NNTPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/NNTPClient.class */
public class NNTPClient extends NNTP {
    private void __ai2ap(ArticleInfo articleInfo, ArticlePointer articlePointer) {
        if (articlePointer != null) {
            articlePointer.articleId = articleInfo.articleId;
            articlePointer.articleNumber = (int) articleInfo.articleNumber;
        }
    }

    private ArticleInfo __ap2ai(ArticlePointer articlePointer) {
        if (articlePointer == null) {
            return null;
        }
        return new ArticleInfo();
    }

    public static Article __parseArticleEntry(String str) {
        Article article = new Article();
        article.setSubject(str);
        String[] split = str.split("\t");
        if (split.length > 6) {
            try {
                article.setArticleNumber(Long.parseLong(split[0]));
                article.setSubject(split[1]);
                article.setFrom(split[2]);
                article.setDate(split[3]);
                article.setArticleId(split[4]);
                article.addReference(split[5]);
            } catch (NumberFormatException e10) {
            }
        }
        return article;
    }

    private void __parseArticlePointer(String str, ArticleInfo articleInfo) {
        String[] split = str.split(" ");
        if (split.length >= 3) {
            try {
                articleInfo.articleNumber = Long.parseLong(split[1]);
                articleInfo.articleId = split[2];
                return;
            } catch (NumberFormatException e10) {
            }
        }
        throw new MalformedServerReplyException("Could not parse article pointer.\nServer reply: " + str);
    }

    private static void __parseGroupReply(String str, NewsgroupInfo newsgroupInfo) {
        String[] split = str.split(" ");
        if (split.length >= 5) {
            try {
                newsgroupInfo._setArticleCount(Long.parseLong(split[1]));
                newsgroupInfo._setFirstArticle(Long.parseLong(split[2]));
                newsgroupInfo._setLastArticle(Long.parseLong(split[3]));
                newsgroupInfo._setNewsgroup(split[4]);
                newsgroupInfo._setPostingPermission(0);
                return;
            } catch (NumberFormatException e10) {
            }
        }
        throw new MalformedServerReplyException("Could not parse newsgroup info.\nServer reply: " + str);
    }

    public static NewsgroupInfo __parseNewsgroupListEntry(String str) {
        String[] split = str.split(" ");
        if (split.length < 4) {
            return null;
        }
        NewsgroupInfo newsgroupInfo = new NewsgroupInfo();
        newsgroupInfo._setNewsgroup(split[0]);
        try {
            long parseLong = Long.parseLong(split[1]);
            long parseLong2 = Long.parseLong(split[2]);
            newsgroupInfo._setFirstArticle(parseLong2);
            newsgroupInfo._setLastArticle(parseLong);
            if (parseLong2 == 0 && parseLong == 0) {
                newsgroupInfo._setArticleCount(0L);
            } else {
                newsgroupInfo._setArticleCount((parseLong - parseLong2) + 1);
            }
            char charAt = split[3].charAt(0);
            if (charAt != 'M') {
                if (charAt != 'N') {
                    if (charAt == 'Y' || charAt == 'y') {
                        newsgroupInfo._setPostingPermission(2);
                    } else if (charAt != 'm') {
                        if (charAt != 'n') {
                            newsgroupInfo._setPostingPermission(0);
                        }
                    }
                    return newsgroupInfo;
                }
                newsgroupInfo._setPostingPermission(3);
                return newsgroupInfo;
            }
            newsgroupInfo._setPostingPermission(1);
            return newsgroupInfo;
        } catch (NumberFormatException e10) {
            return null;
        }
    }

    private NewsgroupInfo[] __readNewsgroupListing() {
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        Vector vector = new Vector(2048);
        while (true) {
            try {
                String readLine = dotTerminatedMessageReader.readLine();
                if (readLine == null) {
                    dotTerminatedMessageReader.close();
                    int size = vector.size();
                    if (size < 1) {
                        return new NewsgroupInfo[0];
                    }
                    NewsgroupInfo[] newsgroupInfoArr = new NewsgroupInfo[size];
                    vector.copyInto(newsgroupInfoArr);
                    return newsgroupInfoArr;
                }
                NewsgroupInfo __parseNewsgroupListEntry = __parseNewsgroupListEntry(readLine);
                if (__parseNewsgroupListEntry == null) {
                    throw new MalformedServerReplyException(readLine);
                }
                vector.addElement(__parseNewsgroupListEntry);
            } catch (Throwable th2) {
                dotTerminatedMessageReader.close();
                throw th2;
            }
        }
    }

    private BufferedReader __retrieve(int i10, long j10, ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(sendCommand(i10, Long.toString(j10)))) {
            return null;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    private BufferedReader __retrieve(int i10, String str, ArticleInfo articleInfo) {
        if (str != null) {
            if (!NNTPReply.isPositiveCompletion(sendCommand(i10, str))) {
                return null;
            }
        } else if (!NNTPReply.isPositiveCompletion(sendCommand(i10))) {
            return null;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    private BufferedReader __retrieveArticleInfo(String str) {
        if (NNTPReply.isPositiveCompletion(xover(str))) {
            return new DotTerminatedMessageReader(this._reader_);
        }
        return null;
    }

    private BufferedReader __retrieveHeader(String str, String str2) {
        if (NNTPReply.isPositiveCompletion(xhdr(str, str2))) {
            return new DotTerminatedMessageReader(this._reader_);
        }
        return null;
    }

    public boolean authenticate(String str, String str2) {
        if (authinfoUser(str) != 381 || authinfoPass(str2) != 281) {
            return false;
        }
        this._isAllowedToPost = true;
        return true;
    }

    public boolean completePendingCommand() {
        return NNTPReply.isPositiveCompletion(getReply());
    }

    public Writer forwardArticle(String str) {
        if (NNTPReply.isPositiveIntermediate(ihave(str))) {
            return new DotTerminatedMessageWriter(this._writer_);
        }
        return null;
    }

    public Iterable<Article> iterateArticleInfo(long j10, long j11) {
        BufferedReader retrieveArticleInfo = retrieveArticleInfo(j10, j11);
        if (retrieveArticleInfo != null) {
            return new ArticleIterator(new ReplyIterator(retrieveArticleInfo, false));
        }
        throw new IOException("XOVER command failed: " + getReplyString());
    }

    public Iterable<String> iterateNewNews(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (NNTPReply.isPositiveCompletion(newnews(newGroupsOrNewsQuery.getNewsgroups(), newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("NEWNEWS command failed: " + getReplyString());
    }

    public Iterable<String> iterateNewNewsgroupListing(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (NNTPReply.isPositiveCompletion(newgroups(newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("NEWGROUPS command failed: " + getReplyString());
    }

    public Iterable<NewsgroupInfo> iterateNewNewsgroups(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        return new NewsgroupIterator(iterateNewNewsgroupListing(newGroupsOrNewsQuery));
    }

    public Iterable<String> iterateNewsgroupListing() {
        if (NNTPReply.isPositiveCompletion(list())) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("LIST command failed: " + getReplyString());
    }

    public Iterable<String> iterateNewsgroupListing(String str) {
        if (NNTPReply.isPositiveCompletion(listActive(str))) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("LIST ACTIVE " + str + " command failed: " + getReplyString());
    }

    public Iterable<NewsgroupInfo> iterateNewsgroups() {
        return new NewsgroupIterator(iterateNewsgroupListing());
    }

    public Iterable<NewsgroupInfo> iterateNewsgroups(String str) {
        return new NewsgroupIterator(iterateNewsgroupListing(str));
    }

    public String listHelp() {
        if (!NNTPReply.isInformational(help())) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        Util.copyReader(dotTerminatedMessageReader, stringWriter);
        dotTerminatedMessageReader.close();
        stringWriter.close();
        return stringWriter.toString();
    }

    public String[] listNewNews(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (!NNTPReply.isPositiveCompletion(newnews(newGroupsOrNewsQuery.getNewsgroups(), newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return null;
        }
        Vector vector = new Vector();
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        while (true) {
            try {
                String readLine = dotTerminatedMessageReader.readLine();
                if (readLine == null) {
                    break;
                }
                vector.addElement(readLine);
            } catch (Throwable th2) {
                dotTerminatedMessageReader.close();
                throw th2;
            }
        }
        dotTerminatedMessageReader.close();
        int size = vector.size();
        if (size < 1) {
            return new String[0];
        }
        String[] strArr = new String[size];
        vector.copyInto(strArr);
        return strArr;
    }

    public NewsgroupInfo[] listNewNewsgroups(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (NNTPReply.isPositiveCompletion(newgroups(newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return __readNewsgroupListing();
        }
        return null;
    }

    public NewsgroupInfo[] listNewsgroups() {
        if (NNTPReply.isPositiveCompletion(list())) {
            return __readNewsgroupListing();
        }
        return null;
    }

    public NewsgroupInfo[] listNewsgroups(String str) {
        if (NNTPReply.isPositiveCompletion(listActive(str))) {
            return __readNewsgroupListing();
        }
        return null;
    }

    public String[] listOverviewFmt() {
        if (!NNTPReply.isPositiveCompletion(sendCommand("LIST", "OVERVIEW.FMT"))) {
            return null;
        }
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = dotTerminatedMessageReader.readLine();
            if (readLine == null) {
                dotTerminatedMessageReader.close();
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            arrayList.add(readLine);
        }
    }

    public boolean logout() {
        return NNTPReply.isPositiveCompletion(quit());
    }

    public Writer postArticle() {
        if (NNTPReply.isPositiveIntermediate(post())) {
            return new DotTerminatedMessageWriter(this._writer_);
        }
        return null;
    }

    public BufferedReader retrieveArticle(long j10) {
        return retrieveArticle(j10, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticle(long j10, ArticleInfo articleInfo) {
        return __retrieve(0, j10, articleInfo);
    }

    public BufferedReader retrieveArticle(String str, ArticleInfo articleInfo) {
        return __retrieve(0, str, articleInfo);
    }

    public Reader retrieveArticle() {
        return retrieveArticle((String) null);
    }

    @Deprecated
    public Reader retrieveArticle(int i10) {
        return retrieveArticle(i10);
    }

    @Deprecated
    public Reader retrieveArticle(int i10, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticle = retrieveArticle(i10, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticle;
    }

    public Reader retrieveArticle(String str) {
        return retrieveArticle(str, (ArticleInfo) null);
    }

    @Deprecated
    public Reader retrieveArticle(String str, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticle = retrieveArticle(str, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticle;
    }

    public BufferedReader retrieveArticleBody(long j10) {
        return retrieveArticleBody(j10, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticleBody(long j10, ArticleInfo articleInfo) {
        return __retrieve(1, j10, articleInfo);
    }

    public BufferedReader retrieveArticleBody(String str, ArticleInfo articleInfo) {
        return __retrieve(1, str, articleInfo);
    }

    public Reader retrieveArticleBody() {
        return retrieveArticleBody((String) null);
    }

    @Deprecated
    public Reader retrieveArticleBody(int i10) {
        return retrieveArticleBody(i10);
    }

    @Deprecated
    public Reader retrieveArticleBody(int i10, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticleBody = retrieveArticleBody(i10, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticleBody;
    }

    public Reader retrieveArticleBody(String str) {
        return retrieveArticleBody(str, (ArticleInfo) null);
    }

    @Deprecated
    public Reader retrieveArticleBody(String str, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticleBody = retrieveArticleBody(str, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticleBody;
    }

    public BufferedReader retrieveArticleHeader(long j10) {
        return retrieveArticleHeader(j10, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticleHeader(long j10, ArticleInfo articleInfo) {
        return __retrieve(3, j10, articleInfo);
    }

    public BufferedReader retrieveArticleHeader(String str, ArticleInfo articleInfo) {
        return __retrieve(3, str, articleInfo);
    }

    public Reader retrieveArticleHeader() {
        return retrieveArticleHeader((String) null);
    }

    @Deprecated
    public Reader retrieveArticleHeader(int i10) {
        return retrieveArticleHeader(i10);
    }

    @Deprecated
    public Reader retrieveArticleHeader(int i10, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticleHeader = retrieveArticleHeader(i10, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticleHeader;
    }

    public Reader retrieveArticleHeader(String str) {
        return retrieveArticleHeader(str, (ArticleInfo) null);
    }

    @Deprecated
    public Reader retrieveArticleHeader(String str, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticleHeader = retrieveArticleHeader(str, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticleHeader;
    }

    public BufferedReader retrieveArticleInfo(long j10) {
        return __retrieveArticleInfo(Long.toString(j10));
    }

    public BufferedReader retrieveArticleInfo(long j10, long j11) {
        return __retrieveArticleInfo(j10 + "-" + j11);
    }

    @Deprecated
    public Reader retrieveArticleInfo(int i10) {
        return retrieveArticleInfo(i10);
    }

    @Deprecated
    public Reader retrieveArticleInfo(int i10, int i11) {
        return retrieveArticleInfo(i10, i11);
    }

    public BufferedReader retrieveHeader(String str, long j10) {
        return __retrieveHeader(str, Long.toString(j10));
    }

    public BufferedReader retrieveHeader(String str, long j10, long j11) {
        return __retrieveHeader(str, j10 + "-" + j11);
    }

    @Deprecated
    public Reader retrieveHeader(String str, int i10) {
        return retrieveHeader(str, i10);
    }

    @Deprecated
    public Reader retrieveHeader(String str, int i10, int i11) {
        return retrieveHeader(str, i10, i11);
    }

    @Deprecated
    public boolean selectArticle(int i10) {
        return selectArticle(i10);
    }

    @Deprecated
    public boolean selectArticle(int i10, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectArticle = selectArticle(i10, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectArticle;
    }

    public boolean selectArticle(long j10) {
        return selectArticle(j10, (ArticleInfo) null);
    }

    public boolean selectArticle(long j10, ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(stat(j10))) {
            return false;
        }
        if (articleInfo == null) {
            return true;
        }
        __parseArticlePointer(getReplyString(), articleInfo);
        return true;
    }

    public boolean selectArticle(String str) {
        return selectArticle(str, (ArticleInfo) null);
    }

    public boolean selectArticle(String str, ArticleInfo articleInfo) {
        if (str != null) {
            if (!NNTPReply.isPositiveCompletion(stat(str))) {
                return false;
            }
        } else if (!NNTPReply.isPositiveCompletion(stat())) {
            return false;
        }
        if (articleInfo == null) {
            return true;
        }
        __parseArticlePointer(getReplyString(), articleInfo);
        return true;
    }

    @Deprecated
    public boolean selectArticle(String str, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectArticle = selectArticle(str, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectArticle;
    }

    public boolean selectArticle(ArticleInfo articleInfo) {
        return selectArticle((String) null, articleInfo);
    }

    @Deprecated
    public boolean selectArticle(ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectArticle = selectArticle(__ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectArticle;
    }

    public boolean selectNewsgroup(String str) {
        return selectNewsgroup(str, null);
    }

    public boolean selectNewsgroup(String str, NewsgroupInfo newsgroupInfo) {
        if (!NNTPReply.isPositiveCompletion(group(str))) {
            return false;
        }
        if (newsgroupInfo == null) {
            return true;
        }
        __parseGroupReply(getReplyString(), newsgroupInfo);
        return true;
    }

    public boolean selectNextArticle() {
        return selectNextArticle((ArticleInfo) null);
    }

    public boolean selectNextArticle(ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(next())) {
            return false;
        }
        if (articleInfo == null) {
            return true;
        }
        __parseArticlePointer(getReplyString(), articleInfo);
        return true;
    }

    @Deprecated
    public boolean selectNextArticle(ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectNextArticle = selectNextArticle(__ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectNextArticle;
    }

    public boolean selectPreviousArticle() {
        return selectPreviousArticle((ArticleInfo) null);
    }

    public boolean selectPreviousArticle(ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(last())) {
            return false;
        }
        if (articleInfo == null) {
            return true;
        }
        __parseArticlePointer(getReplyString(), articleInfo);
        return true;
    }

    @Deprecated
    public boolean selectPreviousArticle(ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectPreviousArticle = selectPreviousArticle(__ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectPreviousArticle;
    }
}
