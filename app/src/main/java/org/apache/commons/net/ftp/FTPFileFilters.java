package org.apache.commons.net.ftp;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPFileFilters.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPFileFilters.class */
public class FTPFileFilters {
    public static final FTPFileFilter ALL = new FTPFileFilter() { // from class: org.apache.commons.net.ftp.FTPFileFilters.1
        @Override // org.apache.commons.net.ftp.FTPFileFilter
        public boolean accept(FTPFile fTPFile) {
            return true;
        }
    };
    public static final FTPFileFilter NON_NULL = new FTPFileFilter() { // from class: org.apache.commons.net.ftp.FTPFileFilters.2
        @Override // org.apache.commons.net.ftp.FTPFileFilter
        public boolean accept(FTPFile fTPFile) {
            return fTPFile != null;
        }
    };
    public static final FTPFileFilter DIRECTORIES = new FTPFileFilter() { // from class: org.apache.commons.net.ftp.FTPFileFilters.3
        @Override // org.apache.commons.net.ftp.FTPFileFilter
        public boolean accept(FTPFile fTPFile) {
            return fTPFile != null && fTPFile.isDirectory();
        }
    };
}
