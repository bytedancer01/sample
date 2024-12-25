package org.apache.commons.net.ftp;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPFile.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPFile.class */
public class FTPFile implements Serializable {
    public static final int DIRECTORY_TYPE = 1;
    public static final int EXECUTE_PERMISSION = 2;
    public static final int FILE_TYPE = 0;
    public static final int GROUP_ACCESS = 1;
    public static final int READ_PERMISSION = 0;
    public static final int SYMBOLIC_LINK_TYPE = 2;
    public static final int UNKNOWN_TYPE = 3;
    public static final int USER_ACCESS = 0;
    public static final int WORLD_ACCESS = 2;
    public static final int WRITE_PERMISSION = 1;
    private static final long serialVersionUID = 9010790363003271996L;
    private Calendar _date;
    private String _group;
    private int _hardLinkCount;
    private String _link;
    private String _name;
    private final boolean[][] _permissions;
    private String _rawListing;
    private long _size;
    private int _type;
    private String _user;

    public FTPFile() {
        this._permissions = new boolean[3][3];
        this._type = 3;
        this._hardLinkCount = 0;
        this._size = -1L;
        this._user = "";
        this._group = "";
        this._date = null;
        this._name = null;
    }

    public FTPFile(String str) {
        this._permissions = null;
        this._rawListing = str;
        this._type = 3;
        this._hardLinkCount = 0;
        this._size = -1L;
        this._user = "";
        this._group = "";
        this._date = null;
        this._name = null;
    }

    private char formatType() {
        int i10 = this._type;
        if (i10 == 0) {
            return '-';
        }
        if (i10 != 1) {
            return i10 != 2 ? '?' : 'l';
        }
        return 'd';
    }

    private String permissionToString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (hasPermission(i10, 0)) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if (hasPermission(i10, 1)) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        if (hasPermission(i10, 2)) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        return sb2.toString();
    }

    public String getGroup() {
        return this._group;
    }

    public int getHardLinkCount() {
        return this._hardLinkCount;
    }

    public String getLink() {
        return this._link;
    }

    public String getName() {
        return this._name;
    }

    public String getRawListing() {
        return this._rawListing;
    }

    public long getSize() {
        return this._size;
    }

    public Calendar getTimestamp() {
        return this._date;
    }

    public int getType() {
        return this._type;
    }

    public String getUser() {
        return this._user;
    }

    public boolean hasPermission(int i10, int i11) {
        boolean[][] zArr = this._permissions;
        if (zArr == null) {
            return false;
        }
        return zArr[i10][i11];
    }

    public boolean isDirectory() {
        boolean z10 = true;
        if (this._type != 1) {
            z10 = false;
        }
        return z10;
    }

    public boolean isFile() {
        return this._type == 0;
    }

    public boolean isSymbolicLink() {
        return this._type == 2;
    }

    public boolean isUnknown() {
        return this._type == 3;
    }

    public boolean isValid() {
        return this._permissions != null;
    }

    public void setGroup(String str) {
        this._group = str;
    }

    public void setHardLinkCount(int i10) {
        this._hardLinkCount = i10;
    }

    public void setLink(String str) {
        this._link = str;
    }

    public void setName(String str) {
        this._name = str;
    }

    public void setPermission(int i10, int i11, boolean z10) {
        this._permissions[i10][i11] = z10;
    }

    public void setRawListing(String str) {
        this._rawListing = str;
    }

    public void setSize(long j10) {
        this._size = j10;
    }

    public void setTimestamp(Calendar calendar) {
        this._date = calendar;
    }

    public void setType(int i10) {
        this._type = i10;
    }

    public void setUser(String str) {
        this._user = str;
    }

    public String toFormattedString() {
        return toFormattedString(null);
    }

    public String toFormattedString(String str) {
        if (!isValid()) {
            return "[Invalid: could not parse file entry]";
        }
        StringBuilder sb2 = new StringBuilder();
        Formatter formatter = new Formatter(sb2);
        sb2.append(formatType());
        sb2.append(permissionToString(0));
        sb2.append(permissionToString(1));
        sb2.append(permissionToString(2));
        formatter.format(" %4d", Integer.valueOf(getHardLinkCount()));
        formatter.format(" %-8s %-8s", getUser(), getGroup());
        formatter.format(" %8d", Long.valueOf(getSize()));
        Calendar timestamp = getTimestamp();
        if (timestamp != null) {
            Calendar calendar = timestamp;
            if (str != null) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                calendar = timestamp;
                if (!timeZone.equals(timestamp.getTimeZone())) {
                    Date time = timestamp.getTime();
                    calendar = Calendar.getInstance(timeZone);
                    calendar.setTime(time);
                }
            }
            formatter.format(" %1$tY-%1$tm-%1$td", calendar);
            if (calendar.isSet(11)) {
                formatter.format(" %1$tH", calendar);
                if (calendar.isSet(12)) {
                    formatter.format(":%1$tM", calendar);
                    if (calendar.isSet(13)) {
                        formatter.format(":%1$tS", calendar);
                        if (calendar.isSet(14)) {
                            formatter.format(".%1$tL", calendar);
                        }
                    }
                }
                formatter.format(" %1$tZ", calendar);
            }
        }
        sb2.append(' ');
        sb2.append(getName());
        formatter.close();
        return sb2.toString();
    }

    public String toString() {
        return getRawListing();
    }
}
