package org.apache.commons.net.ftp.parser;

import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/MLSxEntryParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/MLSxEntryParser.class */
public class MLSxEntryParser extends FTPFileEntryParserImpl {
    private static final MLSxEntryParser PARSER = new MLSxEntryParser();
    private static final HashMap<String, Integer> TYPE_TO_INT;
    private static int[] UNIX_GROUPS;
    private static int[][] UNIX_PERMS;

    /* JADX WARN: Type inference failed for: r0v28, types: [int[], int[][]] */
    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        TYPE_TO_INT = hashMap;
        hashMap.put(TransferTable.COLUMN_FILE, 0);
        hashMap.put("cdir", 1);
        hashMap.put("pdir", 1);
        hashMap.put("dir", 1);
        UNIX_GROUPS = new int[]{0, 1, 2};
        UNIX_PERMS = new int[]{new int[0], new int[]{2}, new int[]{1}, new int[]{2, 1}, new int[]{0}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1, 2}};
    }

    private void doUnixPerms(FTPFile fTPFile, String str) {
        for (char c10 : str.toCharArray()) {
            if (c10 != 'a' && c10 != 'p') {
                if (c10 != 'r') {
                    if (c10 != 'w') {
                        if (c10 == 'l') {
                            fTPFile.setPermission(0, 2, true);
                        } else if (c10 != 'm') {
                            switch (c10) {
                            }
                        }
                    }
                }
                fTPFile.setPermission(0, 0, true);
            }
            fTPFile.setPermission(0, 1, true);
        }
    }

    public static MLSxEntryParser getInstance() {
        return PARSER;
    }

    public static FTPFile parseEntry(String str) {
        return PARSER.parseFTPEntry(str);
    }

    public static Calendar parseGMTdateTime(String str) {
        SimpleDateFormat simpleDateFormat;
        boolean z10;
        if (str.contains(InstructionFileId.DOT)) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            z10 = true;
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            z10 = false;
        }
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        simpleDateFormat.setTimeZone(timeZone);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        ParsePosition parsePosition = new ParsePosition(0);
        simpleDateFormat.setLenient(false);
        Date parse = simpleDateFormat.parse(str, parsePosition);
        if (parsePosition.getIndex() != str.length()) {
            return null;
        }
        gregorianCalendar.setTime(parse);
        if (!z10) {
            gregorianCalendar.clear(14);
        }
        return gregorianCalendar;
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        if (str.startsWith(" ")) {
            if (str.length() <= 1) {
                return null;
            }
            FTPFile fTPFile = new FTPFile();
            fTPFile.setRawListing(str);
            fTPFile.setName(str.substring(1));
            return fTPFile;
        }
        String[] split = str.split(" ", 2);
        if (split.length != 2 || split[1].length() == 0) {
            return null;
        }
        String str2 = split[0];
        if (!str2.endsWith(";")) {
            return null;
        }
        FTPFile fTPFile2 = new FTPFile();
        fTPFile2.setRawListing(str);
        fTPFile2.setName(split[1]);
        String[] split2 = str2.split(";");
        boolean contains = split[0].toLowerCase(Locale.ENGLISH).contains("unix.mode=");
        for (String str3 : split2) {
            String[] split3 = str3.split("=", -1);
            if (split3.length != 2) {
                return null;
            }
            String str4 = split3[0];
            Locale locale = Locale.ENGLISH;
            String lowerCase = str4.toLowerCase(locale);
            String str5 = split3[1];
            if (str5.length() != 0) {
                String lowerCase2 = str5.toLowerCase(locale);
                if ("size".equals(lowerCase) || "sizd".equals(lowerCase)) {
                    fTPFile2.setSize(Long.parseLong(str5));
                } else if ("modify".equals(lowerCase)) {
                    Calendar parseGMTdateTime = parseGMTdateTime(str5);
                    if (parseGMTdateTime == null) {
                        return null;
                    }
                    fTPFile2.setTimestamp(parseGMTdateTime);
                } else if ("type".equals(lowerCase)) {
                    Integer num = TYPE_TO_INT.get(lowerCase2);
                    if (num == null) {
                        fTPFile2.setType(3);
                    } else {
                        fTPFile2.setType(num.intValue());
                    }
                } else if (lowerCase.startsWith("unix.")) {
                    String lowerCase3 = lowerCase.substring(5).toLowerCase(locale);
                    if ("group".equals(lowerCase3)) {
                        fTPFile2.setGroup(str5);
                    } else if ("owner".equals(lowerCase3)) {
                        fTPFile2.setUser(str5);
                    } else if ("mode".equals(lowerCase3)) {
                        int length = str5.length();
                        for (int i10 = 0; i10 < 3; i10++) {
                            int charAt = str5.charAt((length - 3) + i10) - '0';
                            if (charAt >= 0 && charAt <= 7) {
                                for (int i11 : UNIX_PERMS[charAt]) {
                                    fTPFile2.setPermission(UNIX_GROUPS[i10], i11, true);
                                }
                            }
                        }
                    }
                } else if (!contains && "perm".equals(lowerCase)) {
                    doUnixPerms(fTPFile2, lowerCase2);
                }
            }
        }
        return fTPFile2;
    }
}
