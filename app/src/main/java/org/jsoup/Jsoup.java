package org.jsoup;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;

/* loaded from: combined.jar:classes3.jar:org/jsoup/Jsoup.class */
public class Jsoup {
    private Jsoup() {
    }

    public static String clean(String str, String str2, Whitelist whitelist) {
        return new Cleaner(whitelist).clean(parseBodyFragment(str, str2)).body().html();
    }

    public static String clean(String str, String str2, Whitelist whitelist, Document.OutputSettings outputSettings) {
        Document clean = new Cleaner(whitelist).clean(parseBodyFragment(str, str2));
        clean.outputSettings(outputSettings);
        return clean.body().html();
    }

    public static String clean(String str, Whitelist whitelist) {
        return clean(str, "", whitelist);
    }

    public static Connection connect(String str) {
        return HttpConnection.connect(str);
    }

    public static boolean isValid(String str, Whitelist whitelist) {
        return new Cleaner(whitelist).isValid(parseBodyFragment(str, ""));
    }

    public static Document parse(File file, String str) {
        return DataUtil.load(file, str, file.getAbsolutePath());
    }

    public static Document parse(File file, String str, String str2) {
        return DataUtil.load(file, str, str2);
    }

    public static Document parse(InputStream inputStream, String str, String str2) {
        return DataUtil.load(inputStream, str, str2);
    }

    public static Document parse(InputStream inputStream, String str, String str2, Parser parser) {
        return DataUtil.load(inputStream, str, str2, parser);
    }

    public static Document parse(String str) {
        return Parser.parse(str, "");
    }

    public static Document parse(String str, String str2) {
        return Parser.parse(str, str2);
    }

    public static Document parse(String str, String str2, Parser parser) {
        return parser.parseInput(str, str2);
    }

    public static Document parse(URL url, int i10) {
        Connection connect = HttpConnection.connect(url);
        connect.timeout(i10);
        return connect.get();
    }

    public static Document parseBodyFragment(String str) {
        return Parser.parseBodyFragment(str, "");
    }

    public static Document parseBodyFragment(String str, String str2) {
        return Parser.parseBodyFragment(str, str2);
    }
}
