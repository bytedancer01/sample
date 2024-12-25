package org.joda.time.convert;

/* loaded from: combined.jar:classes3.jar:org/joda/time/convert/ConverterSet.class */
class ConverterSet {
    private final Converter[] iConverters;
    private Entry[] iSelectEntries = new Entry[16];

    /* loaded from: combined.jar:classes3.jar:org/joda/time/convert/ConverterSet$Entry.class */
    public static class Entry {
        public final Converter iConverter;
        public final Class<?> iType;

        public Entry(Class<?> cls, Converter converter) {
            this.iType = cls;
            this.iConverter = converter;
        }
    }

    public ConverterSet(Converter[] converterArr) {
        this.iConverters = converterArr;
    }

    private static Converter selectSlow(ConverterSet converterSet, Class<?> cls) {
        Converter[] converterArr = converterSet.iConverters;
        int length = converterArr.length;
        int i10 = length;
        ConverterSet converterSet2 = converterSet;
        Converter[] converterArr2 = converterArr;
        while (true) {
            int i11 = length - 1;
            if (i11 < 0) {
                if (cls == null || i10 == 0) {
                    return null;
                }
                if (i10 == 1) {
                    return converterArr2[0];
                }
                int i12 = i10;
                int i13 = i10;
                while (true) {
                    int i14 = i13 - 1;
                    if (i14 < 0) {
                        break;
                    }
                    Class<?> supportedType = converterArr2[i14].getSupportedType();
                    int i15 = i12;
                    int i16 = i12;
                    int i17 = i14;
                    while (true) {
                        int i18 = i16 - 1;
                        if (i18 >= 0) {
                            i16 = i18;
                            if (i18 != i17) {
                                i16 = i18;
                                if (converterArr2[i18].getSupportedType().isAssignableFrom(supportedType)) {
                                    converterSet2 = converterSet2.remove(i18, (Converter[]) null);
                                    converterArr2 = converterSet2.iConverters;
                                    i15 = converterArr2.length;
                                    i17 = i15 - 1;
                                    i16 = i18;
                                }
                            }
                        }
                    }
                    i13 = i17;
                    i12 = i15;
                }
                if (i12 == 1) {
                    return converterArr2[0];
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to find best converter for type \"");
                sb2.append(cls.getName());
                sb2.append("\" from remaining set: ");
                for (int i19 = 0; i19 < i12; i19++) {
                    Converter converter = converterArr2[i19];
                    Class<?> supportedType2 = converter.getSupportedType();
                    sb2.append(converter.getClass().getName());
                    sb2.append('[');
                    sb2.append(supportedType2 == null ? null : supportedType2.getName());
                    sb2.append("], ");
                }
                throw new IllegalStateException(sb2.toString());
            }
            Converter converter2 = converterArr2[i11];
            Class<?> supportedType3 = converter2.getSupportedType();
            if (supportedType3 == cls) {
                return converter2;
            }
            if (supportedType3 != null) {
                length = i11;
                if (cls != null) {
                    length = i11;
                    if (!supportedType3.isAssignableFrom(cls)) {
                    }
                }
            }
            converterSet2 = converterSet2.remove(i11, (Converter[]) null);
            converterArr2 = converterSet2.iConverters;
            i10 = converterArr2.length;
            length = i11;
        }
    }

    public ConverterSet add(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Converter converter2 = converterArr2[i10];
            if (converter.equals(converter2)) {
                if (converterArr != null) {
                    converterArr[0] = null;
                }
                return this;
            }
            if (converter.getSupportedType() == converter2.getSupportedType()) {
                Converter[] converterArr3 = new Converter[length];
                for (int i11 = 0; i11 < length; i11++) {
                    if (i11 != i10) {
                        converterArr3[i11] = converterArr2[i11];
                    } else {
                        converterArr3[i11] = converter;
                    }
                }
                if (converterArr != null) {
                    converterArr[0] = converter2;
                }
                return new ConverterSet(converterArr3);
            }
        }
        Converter[] converterArr4 = new Converter[length + 1];
        System.arraycopy(converterArr2, 0, converterArr4, 0, length);
        converterArr4[length] = converter;
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return new ConverterSet(converterArr4);
    }

    public void copyInto(Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        System.arraycopy(converterArr2, 0, converterArr, 0, converterArr2.length);
    }

    public ConverterSet remove(int i10, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        if (i10 >= length) {
            throw new IndexOutOfBoundsException();
        }
        int i11 = 0;
        if (converterArr != null) {
            converterArr[0] = converterArr2[i10];
        }
        Converter[] converterArr3 = new Converter[length - 1];
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= length) {
                return new ConverterSet(converterArr3);
            }
            int i14 = i13;
            if (i11 != i10) {
                converterArr3[i13] = converterArr2[i11];
                i14 = i13 + 1;
            }
            i11++;
            i12 = i14;
        }
    }

    public ConverterSet remove(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (converter.equals(converterArr2[i10])) {
                return remove(i10, converterArr);
            }
        }
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x001c, code lost:
    
        r7 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.joda.time.convert.Converter select(java.lang.Class<?> r6) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.convert.ConverterSet.select(java.lang.Class):org.joda.time.convert.Converter");
    }

    public int size() {
        return this.iConverters.length;
    }
}
