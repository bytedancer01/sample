package org.apache.commons.net.ftp.parser;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/RegexFTPFileEntryParserImpl.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/RegexFTPFileEntryParserImpl.class */
public abstract class RegexFTPFileEntryParserImpl extends FTPFileEntryParserImpl {
    private Pattern pattern = null;
    private MatchResult result = null;
    public Matcher _matcher_ = null;

    public RegexFTPFileEntryParserImpl(String str) {
        compileRegex(str, 0);
    }

    public RegexFTPFileEntryParserImpl(String str, int i10) {
        compileRegex(str, i10);
    }

    private void compileRegex(String str, int i10) {
        try {
            this.pattern = Pattern.compile(str, i10);
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Unparseable regex supplied: " + str);
        }
    }

    public int getGroupCnt() {
        MatchResult matchResult = this.result;
        if (matchResult == null) {
            return 0;
        }
        return matchResult.groupCount();
    }

    public String getGroupsAsString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 1; i10 <= this.result.groupCount(); i10++) {
            sb2.append(i10);
            sb2.append(") ");
            sb2.append(this.result.group(i10));
            sb2.append(System.getProperty("line.separator"));
        }
        return sb2.toString();
    }

    public String group(int i10) {
        MatchResult matchResult = this.result;
        if (matchResult == null) {
            return null;
        }
        return matchResult.group(i10);
    }

    public boolean matches(String str) {
        this.result = null;
        Matcher matcher = this.pattern.matcher(str);
        this._matcher_ = matcher;
        if (matcher.matches()) {
            this.result = this._matcher_.toMatchResult();
        }
        return this.result != null;
    }

    public boolean setRegex(String str) {
        compileRegex(str, 0);
        return true;
    }

    public boolean setRegex(String str, int i10) {
        compileRegex(str, i10);
        return true;
    }
}
