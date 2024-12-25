package org.joda.time.p258tz;

import org.apache.http.impl.auth.NTLMEngineImpl;
import org.joda.time.DateTimeZone;

/* loaded from: combined.jar:classes3.jar:org/joda/time/tz/CachedDateTimeZone.class */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient Info[] iInfoCache;
    private final DateTimeZone iZone;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/CachedDateTimeZone$Info.class */
    public static final class Info {
        private String iNameKey;
        public Info iNextInfo;
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;
        private int iOffset = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        private int iStandardOffset = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

        public Info(DateTimeZone dateTimeZone, long j10) {
            this.iPeriodStart = j10;
            this.iZoneRef = dateTimeZone;
        }

        public String getNameKey(long j10) {
            Info info = this.iNextInfo;
            if (info != null && j10 >= info.iPeriodStart) {
                return info.getNameKey(j10);
            }
            if (this.iNameKey == null) {
                this.iNameKey = this.iZoneRef.getNameKey(this.iPeriodStart);
            }
            return this.iNameKey;
        }

        public int getOffset(long j10) {
            Info info = this.iNextInfo;
            if (info != null && j10 >= info.iPeriodStart) {
                return info.getOffset(j10);
            }
            if (this.iOffset == Integer.MIN_VALUE) {
                this.iOffset = this.iZoneRef.getOffset(this.iPeriodStart);
            }
            return this.iOffset;
        }

        public int getStandardOffset(long j10) {
            Info info = this.iNextInfo;
            if (info != null && j10 >= info.iPeriodStart) {
                return info.getStandardOffset(j10);
            }
            if (this.iStandardOffset == Integer.MIN_VALUE) {
                this.iStandardOffset = this.iZoneRef.getStandardOffset(this.iPeriodStart);
            }
            return this.iStandardOffset;
        }
    }

    static {
        Integer num;
        int i10;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException e10) {
            num = null;
        }
        if (num == null) {
            i10 = 512;
        } else {
            int i11 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i11++;
            }
            i10 = 1 << i11;
        }
        cInfoCacheMask = i10 - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iInfoCache = new Info[cInfoCacheMask + 1];
        this.iZone = dateTimeZone;
    }

    private Info createInfo(long j10) {
        long j11 = j10 & (-4294967296L);
        Info info = new Info(this.iZone, j11);
        Info info2 = info;
        long j12 = j11;
        while (true) {
            long j13 = j12;
            j12 = this.iZone.nextTransition(j13);
            if (j12 == j13 || j12 > (4294967295L | j11)) {
                break;
            }
            Info info3 = new Info(this.iZone, j12);
            info2.iNextInfo = info3;
            info2 = info3;
        }
        return info;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (((int) (r0.iPeriodStart >> 32)) != r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.joda.time.tz.CachedDateTimeZone.Info getInfo(long r5) {
        /*
            r4 = this;
            r0 = r5
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r8 = r0
            r0 = r4
            org.joda.time.tz.CachedDateTimeZone$Info[] r0 = r0.iInfoCache
            r11 = r0
            int r0 = org.joda.time.p258tz.CachedDateTimeZone.cInfoCacheMask
            r1 = r8
            r0 = r0 & r1
            r7 = r0
            r0 = r11
            r1 = r7
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L31
            r0 = r10
            r9 = r0
            r0 = r10
            long r0 = r0.iPeriodStart
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r1 = r8
            if (r0 == r1) goto L3e
        L31:
            r0 = r4
            r1 = r5
            org.joda.time.tz.CachedDateTimeZone$Info r0 = r0.createInfo(r1)
            r9 = r0
            r0 = r11
            r1 = r7
            r2 = r9
            r0[r1] = r2
        L3e:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p258tz.CachedDateTimeZone.getInfo(long):org.joda.time.tz.CachedDateTimeZone$Info");
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j10) {
        return getInfo(j10).getNameKey(j10);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j10) {
        return getInfo(j10).getOffset(j10);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j10) {
        return getInfo(j10).getStandardOffset(j10);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j10) {
        return this.iZone.nextTransition(j10);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j10) {
        return this.iZone.previousTransition(j10);
    }
}
