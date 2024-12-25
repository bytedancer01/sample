package org.joda.time.convert;

import org.joda.time.JodaTimePermission;

/* loaded from: combined.jar:classes3.jar:org/joda/time/convert/ConverterManager.class */
public final class ConverterManager {
    private static ConverterManager INSTANCE;
    private ConverterSet iDurationConverters;
    private ConverterSet iInstantConverters;
    private ConverterSet iIntervalConverters;
    private ConverterSet iPartialConverters;
    private ConverterSet iPeriodConverters;

    public ConverterManager() {
        ReadableInstantConverter readableInstantConverter = ReadableInstantConverter.INSTANCE;
        StringConverter stringConverter = StringConverter.INSTANCE;
        CalendarConverter calendarConverter = CalendarConverter.INSTANCE;
        DateConverter dateConverter = DateConverter.INSTANCE;
        LongConverter longConverter = LongConverter.INSTANCE;
        NullConverter nullConverter = NullConverter.INSTANCE;
        this.iInstantConverters = new ConverterSet(new Converter[]{readableInstantConverter, stringConverter, calendarConverter, dateConverter, longConverter, nullConverter});
        this.iPartialConverters = new ConverterSet(new Converter[]{ReadablePartialConverter.INSTANCE, readableInstantConverter, stringConverter, calendarConverter, dateConverter, longConverter, nullConverter});
        ReadableDurationConverter readableDurationConverter = ReadableDurationConverter.INSTANCE;
        ReadableIntervalConverter readableIntervalConverter = ReadableIntervalConverter.INSTANCE;
        this.iDurationConverters = new ConverterSet(new Converter[]{readableDurationConverter, readableIntervalConverter, stringConverter, longConverter, nullConverter});
        this.iPeriodConverters = new ConverterSet(new Converter[]{readableDurationConverter, ReadablePeriodConverter.INSTANCE, readableIntervalConverter, stringConverter, nullConverter});
        this.iIntervalConverters = new ConverterSet(new Converter[]{readableIntervalConverter, stringConverter, nullConverter});
    }

    private void checkAlterDurationConverters() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterDurationConverters"));
        }
    }

    private void checkAlterInstantConverters() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterInstantConverters"));
        }
    }

    private void checkAlterIntervalConverters() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterIntervalConverters"));
        }
    }

    private void checkAlterPartialConverters() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterPartialConverters"));
        }
    }

    private void checkAlterPeriodConverters() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("ConverterManager.alterPeriodConverters"));
        }
    }

    public static ConverterManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConverterManager();
        }
        return INSTANCE;
    }

    public DurationConverter addDurationConverter(DurationConverter durationConverter) {
        checkAlterDurationConverters();
        if (durationConverter == null) {
            return null;
        }
        DurationConverter[] durationConverterArr = new DurationConverter[1];
        this.iDurationConverters = this.iDurationConverters.add(durationConverter, durationConverterArr);
        return durationConverterArr[0];
    }

    public InstantConverter addInstantConverter(InstantConverter instantConverter) {
        checkAlterInstantConverters();
        if (instantConverter == null) {
            return null;
        }
        InstantConverter[] instantConverterArr = new InstantConverter[1];
        this.iInstantConverters = this.iInstantConverters.add(instantConverter, instantConverterArr);
        return instantConverterArr[0];
    }

    public IntervalConverter addIntervalConverter(IntervalConverter intervalConverter) {
        checkAlterIntervalConverters();
        if (intervalConverter == null) {
            return null;
        }
        IntervalConverter[] intervalConverterArr = new IntervalConverter[1];
        this.iIntervalConverters = this.iIntervalConverters.add(intervalConverter, intervalConverterArr);
        return intervalConverterArr[0];
    }

    public PartialConverter addPartialConverter(PartialConverter partialConverter) {
        checkAlterPartialConverters();
        if (partialConverter == null) {
            return null;
        }
        PartialConverter[] partialConverterArr = new PartialConverter[1];
        this.iPartialConverters = this.iPartialConverters.add(partialConverter, partialConverterArr);
        return partialConverterArr[0];
    }

    public PeriodConverter addPeriodConverter(PeriodConverter periodConverter) {
        checkAlterPeriodConverters();
        if (periodConverter == null) {
            return null;
        }
        PeriodConverter[] periodConverterArr = new PeriodConverter[1];
        this.iPeriodConverters = this.iPeriodConverters.add(periodConverter, periodConverterArr);
        return periodConverterArr[0];
    }

    public DurationConverter getDurationConverter(Object obj) {
        DurationConverter durationConverter = (DurationConverter) this.iDurationConverters.select(obj == null ? null : obj.getClass());
        if (durationConverter != null) {
            return durationConverter;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No duration converter found for type: ");
        sb2.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb2.toString());
    }

    public DurationConverter[] getDurationConverters() {
        ConverterSet converterSet = this.iDurationConverters;
        DurationConverter[] durationConverterArr = new DurationConverter[converterSet.size()];
        converterSet.copyInto(durationConverterArr);
        return durationConverterArr;
    }

    public InstantConverter getInstantConverter(Object obj) {
        InstantConverter instantConverter = (InstantConverter) this.iInstantConverters.select(obj == null ? null : obj.getClass());
        if (instantConverter != null) {
            return instantConverter;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No instant converter found for type: ");
        sb2.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb2.toString());
    }

    public InstantConverter[] getInstantConverters() {
        ConverterSet converterSet = this.iInstantConverters;
        InstantConverter[] instantConverterArr = new InstantConverter[converterSet.size()];
        converterSet.copyInto(instantConverterArr);
        return instantConverterArr;
    }

    public IntervalConverter getIntervalConverter(Object obj) {
        IntervalConverter intervalConverter = (IntervalConverter) this.iIntervalConverters.select(obj == null ? null : obj.getClass());
        if (intervalConverter != null) {
            return intervalConverter;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No interval converter found for type: ");
        sb2.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb2.toString());
    }

    public IntervalConverter[] getIntervalConverters() {
        ConverterSet converterSet = this.iIntervalConverters;
        IntervalConverter[] intervalConverterArr = new IntervalConverter[converterSet.size()];
        converterSet.copyInto(intervalConverterArr);
        return intervalConverterArr;
    }

    public PartialConverter getPartialConverter(Object obj) {
        PartialConverter partialConverter = (PartialConverter) this.iPartialConverters.select(obj == null ? null : obj.getClass());
        if (partialConverter != null) {
            return partialConverter;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No partial converter found for type: ");
        sb2.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb2.toString());
    }

    public PartialConverter[] getPartialConverters() {
        ConverterSet converterSet = this.iPartialConverters;
        PartialConverter[] partialConverterArr = new PartialConverter[converterSet.size()];
        converterSet.copyInto(partialConverterArr);
        return partialConverterArr;
    }

    public PeriodConverter getPeriodConverter(Object obj) {
        PeriodConverter periodConverter = (PeriodConverter) this.iPeriodConverters.select(obj == null ? null : obj.getClass());
        if (periodConverter != null) {
            return periodConverter;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No period converter found for type: ");
        sb2.append(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(sb2.toString());
    }

    public PeriodConverter[] getPeriodConverters() {
        ConverterSet converterSet = this.iPeriodConverters;
        PeriodConverter[] periodConverterArr = new PeriodConverter[converterSet.size()];
        converterSet.copyInto(periodConverterArr);
        return periodConverterArr;
    }

    public DurationConverter removeDurationConverter(DurationConverter durationConverter) {
        checkAlterDurationConverters();
        if (durationConverter == null) {
            return null;
        }
        DurationConverter[] durationConverterArr = new DurationConverter[1];
        this.iDurationConverters = this.iDurationConverters.remove(durationConverter, durationConverterArr);
        return durationConverterArr[0];
    }

    public InstantConverter removeInstantConverter(InstantConverter instantConverter) {
        checkAlterInstantConverters();
        if (instantConverter == null) {
            return null;
        }
        InstantConverter[] instantConverterArr = new InstantConverter[1];
        this.iInstantConverters = this.iInstantConverters.remove(instantConverter, instantConverterArr);
        return instantConverterArr[0];
    }

    public IntervalConverter removeIntervalConverter(IntervalConverter intervalConverter) {
        checkAlterIntervalConverters();
        if (intervalConverter == null) {
            return null;
        }
        IntervalConverter[] intervalConverterArr = new IntervalConverter[1];
        this.iIntervalConverters = this.iIntervalConverters.remove(intervalConverter, intervalConverterArr);
        return intervalConverterArr[0];
    }

    public PartialConverter removePartialConverter(PartialConverter partialConverter) {
        checkAlterPartialConverters();
        if (partialConverter == null) {
            return null;
        }
        PartialConverter[] partialConverterArr = new PartialConverter[1];
        this.iPartialConverters = this.iPartialConverters.remove(partialConverter, partialConverterArr);
        return partialConverterArr[0];
    }

    public PeriodConverter removePeriodConverter(PeriodConverter periodConverter) {
        checkAlterPeriodConverters();
        if (periodConverter == null) {
            return null;
        }
        PeriodConverter[] periodConverterArr = new PeriodConverter[1];
        this.iPeriodConverters = this.iPeriodConverters.remove(periodConverter, periodConverterArr);
        return periodConverterArr[0];
    }

    public String toString() {
        return "ConverterManager[" + this.iInstantConverters.size() + " instant," + this.iPartialConverters.size() + " partial," + this.iDurationConverters.size() + " duration," + this.iPeriodConverters.size() + " period," + this.iIntervalConverters.size() + " interval]";
    }
}
