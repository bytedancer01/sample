package org.apache.http.conn.util;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.language.p254bm.ResourceConstants;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/util/PublicSuffixListParser.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/util/PublicSuffixListParser.class */
public final class PublicSuffixListParser {
    public PublicSuffixList parse(Reader reader) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return new PublicSuffixList(DomainType.UNKNOWN, arrayList, arrayList2);
            }
            if (!readLine.isEmpty() && !readLine.startsWith(ResourceConstants.CMT)) {
                String str = readLine;
                if (readLine.startsWith(InstructionFileId.DOT)) {
                    str = readLine.substring(1);
                }
                boolean startsWith = str.startsWith("!");
                String str2 = str;
                if (startsWith) {
                    str2 = str.substring(1);
                }
                if (startsWith) {
                    arrayList2.add(str2);
                } else {
                    arrayList.add(str2);
                }
            }
        }
    }

    public List<PublicSuffixList> parseByType(Reader reader) {
        ArrayList arrayList = new ArrayList(2);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            DomainType domainType = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return arrayList;
                }
                if (!readLine.isEmpty()) {
                    if (readLine.startsWith(ResourceConstants.CMT)) {
                        if (domainType == null) {
                            if (readLine.contains("===BEGIN ICANN DOMAINS===")) {
                                domainType = DomainType.ICANN;
                            } else if (readLine.contains("===BEGIN PRIVATE DOMAINS===")) {
                                domainType = DomainType.PRIVATE;
                            }
                        } else if (readLine.contains("===END ICANN DOMAINS===") || readLine.contains("===END PRIVATE DOMAINS===")) {
                            break;
                        }
                    } else if (domainType != null) {
                        String str = readLine;
                        if (readLine.startsWith(InstructionFileId.DOT)) {
                            str = readLine.substring(1);
                        }
                        boolean startsWith = str.startsWith("!");
                        String str2 = str;
                        if (startsWith) {
                            str2 = str.substring(1);
                        }
                        if (startsWith) {
                            ArrayList arrayList4 = arrayList3;
                            if (arrayList3 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(str2);
                            arrayList3 = arrayList4;
                        } else {
                            ArrayList arrayList5 = arrayList2;
                            if (arrayList2 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(str2);
                            arrayList2 = arrayList5;
                        }
                    }
                }
            }
            if (arrayList2 != null) {
                arrayList.add(new PublicSuffixList(domainType, arrayList2, arrayList3));
            }
        }
    }
}
