package org.jsoup.helper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: combined.jar:classes3.jar:org/jsoup/helper/DataUtil.class */
public final class DataUtil {
    private static final int UNICODE_BOM = 65279;
    public static final int boundaryLength = 32;
    private static final int bufferSize = 131072;
    public static final String defaultCharset = "UTF-8";
    private static final Pattern charsetPattern = Pattern.compile("(?i)\\bcharset=\\s*(?:\"|')?([^\\s,;\"']*)");
    private static final char[] mimeBoundaryChars = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private DataUtil() {
    }

    public static void crossStreams(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[bufferSize];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static ByteBuffer emptyByteBuffer() {
        return ByteBuffer.allocate(0);
    }

    public static String getCharsetFromContentType(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = charsetPattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String replace = matcher.group(1).trim().replace("charset=", "");
        if (replace.length() == 0) {
            return null;
        }
        try {
            if (Charset.isSupported(replace)) {
                return replace;
            }
            String upperCase = replace.toUpperCase(Locale.ENGLISH);
            if (Charset.isSupported(upperCase)) {
                return upperCase;
            }
            return null;
        } catch (IllegalCharsetNameException e10) {
            return null;
        }
    }

    public static Document load(File file, String str, String str2) {
        return parseByteData(readFileToByteBuffer(file), str, str2, Parser.htmlParser());
    }

    public static Document load(InputStream inputStream, String str, String str2) {
        return parseByteData(readToByteBuffer(inputStream), str, str2, Parser.htmlParser());
    }

    public static Document load(InputStream inputStream, String str, String str2, Parser parser) {
        return parseByteData(readToByteBuffer(inputStream), str, str2, parser);
    }

    public static String mimeBoundary() {
        StringBuilder sb2 = new StringBuilder(32);
        Random random = new Random();
        for (int i10 = 0; i10 < 32; i10++) {
            char[] cArr = mimeBoundaryChars;
            sb2.append(cArr[random.nextInt(cArr.length)]);
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.jsoup.nodes.Document parseByteData(java.nio.ByteBuffer r4, java.lang.String r5, java.lang.String r6, org.jsoup.parser.Parser r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.DataUtil.parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser):org.jsoup.nodes.Document");
    }

    public static ByteBuffer readFileToByteBuffer(File file) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            randomAccessFile.close();
            return wrap;
        } catch (Throwable th3) {
            th = th3;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream) {
        return readToByteBuffer(inputStream, 0);
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int i10) {
        boolean z10 = true;
        Validate.isTrue(i10 >= 0, "maxSize must be 0 (unlimited) or larger");
        if (i10 <= 0) {
            z10 = false;
        }
        byte[] bArr = new byte[bufferSize];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bufferSize);
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            int i11 = i10;
            if (z10) {
                if (read > i10) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                    break;
                }
                i11 = i10 - read;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            i10 = i11;
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }
}
