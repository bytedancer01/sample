package org.joda.time.base;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import org.joda.convert.ToString;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.format.FormatUtils;

/* loaded from: combined.jar:classes3.jar:org/joda/time/base/AbstractDuration.class */
public abstract class AbstractDuration implements ReadableDuration {
    @Override // java.lang.Comparable
    public int compareTo(ReadableDuration readableDuration) {
        long millis = getMillis();
        long millis2 = readableDuration.getMillis();
        if (millis < millis2) {
            return -1;
        }
        return millis > millis2 ? 1 : 0;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadableDuration)) {
            return false;
        }
        if (getMillis() != ((ReadableDuration) obj).getMillis()) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.joda.time.ReadableDuration
    public int hashCode() {
        long millis = getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isEqual(ReadableDuration readableDuration) {
        ReadableDuration readableDuration2 = readableDuration;
        if (readableDuration == null) {
            readableDuration2 = Duration.ZERO;
        }
        return compareTo(readableDuration2) == 0;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isLongerThan(ReadableDuration readableDuration) {
        ReadableDuration readableDuration2 = readableDuration;
        if (readableDuration == null) {
            readableDuration2 = Duration.ZERO;
        }
        return compareTo(readableDuration2) > 0;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isShorterThan(ReadableDuration readableDuration) {
        ReadableDuration readableDuration2 = readableDuration;
        if (readableDuration == null) {
            readableDuration2 = Duration.ZERO;
        }
        return compareTo(readableDuration2) < 0;
    }

    @Override // org.joda.time.ReadableDuration
    public Duration toDuration() {
        return new Duration(getMillis());
    }

    @Override // org.joda.time.ReadableDuration
    public Period toPeriod() {
        return new Period(getMillis());
    }

    @Override // org.joda.time.ReadableDuration
    @ToString
    public String toString() {
        long millis = getMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        boolean z10 = millis < 0;
        FormatUtils.appendUnpaddedInteger(stringBuffer, millis);
        while (true) {
            if (stringBuffer.length() >= (z10 ? 7 : 6)) {
                break;
            }
            stringBuffer.insert(z10 ? 3 : 2, "0");
        }
        long j10 = millis / 1000;
        int length = stringBuffer.length() - 3;
        if (j10 * 1000 == millis) {
            stringBuffer.setLength(length);
        } else {
            stringBuffer.insert(length, InstructionFileId.DOT);
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
