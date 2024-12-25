package org.pcap4j.packet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Packet;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.LazyValue;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/AbstractPacket.class */
public abstract class AbstractPacket implements Packet {
    private static final long serialVersionUID = -3016622134481071576L;
    private final LazyValue<Integer> lengthCache = new LazyValue<>(new LazyValue.BuildValueCommand<Integer>(this) { // from class: org.pcap4j.packet.AbstractPacket.1
        public final AbstractPacket this$0;

        {
            this.this$0 = this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public Integer buildValue() {
            return Integer.valueOf(this.this$0.calcLength());
        }
    });
    private final LazyValue<byte[]> rawDataCache = new LazyValue<>(new LazyValue.BuildValueCommand<byte[]>(this) { // from class: org.pcap4j.packet.AbstractPacket.2
        public final AbstractPacket this$0;

        {
            this.this$0 = this;
        }

        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public byte[] buildValue() {
            return this.this$0.buildRawData();
        }
    });
    private final LazyValue<String> hexStringCache = new LazyValue<>(new LazyValue.BuildValueCommand<String>(this) { // from class: org.pcap4j.packet.AbstractPacket.3
        public final AbstractPacket this$0;

        {
            this.this$0 = this;
        }

        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public String buildValue() {
            return this.this$0.buildHexString();
        }
    });
    private final LazyValue<String> stringCache = new LazyValue<>(new LazyValue.BuildValueCommand<String>(this) { // from class: org.pcap4j.packet.AbstractPacket.4
        public final AbstractPacket this$0;

        {
            this.this$0 = this;
        }

        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public String buildValue() {
            return this.this$0.buildString();
        }
    });
    private final LazyValue<Integer> hashCodeCache = new LazyValue<>(new LazyValue.BuildValueCommand<Integer>(this) { // from class: org.pcap4j.packet.AbstractPacket.5
        public final AbstractPacket this$0;

        {
            this.this$0 = this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public Integer buildValue() {
            return Integer.valueOf(this.this$0.calcHashCode());
        }
    });

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/AbstractPacket$AbstractBuilder.class */
    public static abstract class AbstractBuilder implements Packet.Builder {
        @Override // org.pcap4j.packet.Packet.Builder
        public abstract Packet build();

        @Override // org.pcap4j.packet.Packet.Builder
        public <T extends Packet.Builder> T get(Class<T> cls) {
            Iterator<Packet.Builder> it = iterator();
            while (it.hasNext()) {
                Packet.Builder next = it.next();
                if (cls.isInstance(next)) {
                    return cls.cast(next);
                }
            }
            return null;
        }

        @Override // org.pcap4j.packet.Packet.Builder
        public Packet.Builder getOuterOf(Class<? extends Packet.Builder> cls) {
            Iterator<Packet.Builder> it = iterator();
            while (it.hasNext()) {
                Packet.Builder next = it.next();
                if (cls.isInstance(next.getPayloadBuilder())) {
                    return next;
                }
            }
            return null;
        }

        @Override // org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return null;
        }

        @Override // java.lang.Iterable
        public Iterator<Packet.Builder> iterator() {
            return new BuilderIterator(this);
        }

        @Override // org.pcap4j.packet.Packet.Builder
        public AbstractBuilder payloadBuilder(Packet.Builder builder) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/AbstractPacket$AbstractHeader.class */
    public static abstract class AbstractHeader implements Packet.Header {
        private static final long serialVersionUID = -8916517326403680608L;
        private final LazyValue<Integer> lengthCache = new LazyValue<>(new LazyValue.BuildValueCommand<Integer>(this) { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.1
            public final AbstractHeader this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public Integer buildValue() {
                return Integer.valueOf(this.this$0.calcLength());
            }
        });
        private final LazyValue<byte[]> rawDataCache = new LazyValue<>(new LazyValue.BuildValueCommand<byte[]>(this) { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.2
            public final AbstractHeader this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public byte[] buildValue() {
                return this.this$0.buildRawData();
            }
        });
        private final LazyValue<String> hexStringCache = new LazyValue<>(new LazyValue.BuildValueCommand<String>(this) { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.3
            public final AbstractHeader this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public String buildValue() {
                return this.this$0.buildHexString();
            }
        });
        private final LazyValue<String> stringCache = new LazyValue<>(new LazyValue.BuildValueCommand<String>(this) { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.4
            public final AbstractHeader this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public String buildValue() {
                return this.this$0.buildString();
            }
        });
        private final LazyValue<Integer> hashCodeCache = new LazyValue<>(new LazyValue.BuildValueCommand<Integer>(this) { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.5
            public final AbstractHeader this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public Integer buildValue() {
                return Integer.valueOf(this.this$0.calcHashCode());
            }
        });

        public String buildHexString() {
            return ByteArrays.toHexString(getRawData(), " ");
        }

        public byte[] buildRawData() {
            return ByteArrays.concatenate(getRawFields());
        }

        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[A header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Hex stream: ");
            sb2.append(ByteArrays.toHexString(getRawData(), " "));
            sb2.append(property);
            return sb2.toString();
        }

        public int calcHashCode() {
            return Arrays.hashCode(getRawData());
        }

        public int calcLength() {
            Iterator<byte[]> it = getRawFields().iterator();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    return i11;
                }
                i10 = i11 + it.next().length;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (getClass().isInstance(obj)) {
                return Arrays.equals(((AbstractHeader) getClass().cast(obj)).getRawData(), getRawData());
            }
            return false;
        }

        @Override // org.pcap4j.packet.Packet.Header
        public byte[] getRawData() {
            byte[] value = this.rawDataCache.getValue();
            int length = value.length;
            byte[] bArr = new byte[length];
            System.arraycopy(value, 0, bArr, 0, length);
            return bArr;
        }

        public abstract List<byte[]> getRawFields();

        public int hashCode() {
            return this.hashCodeCache.getValue().intValue();
        }

        @Override // org.pcap4j.packet.Packet.Header
        public int length() {
            return this.lengthCache.getValue().intValue();
        }

        public String toHexString() {
            return this.hexStringCache.getValue();
        }

        public String toString() {
            return this.stringCache.getValue();
        }
    }

    public String buildHexString() {
        return ByteArrays.toHexString(getRawData(), " ");
    }

    public byte[] buildRawData() {
        int i10;
        byte[] bArr = new byte[length()];
        Packet.Header header = getHeader();
        Packet payload = getPayload();
        if (header != null) {
            System.arraycopy(getHeader().getRawData(), 0, bArr, 0, header.length());
            i10 = header.length() + 0;
        } else {
            i10 = 0;
        }
        if (payload != null) {
            System.arraycopy(getPayload().getRawData(), 0, bArr, i10, payload.length());
            payload.length();
        }
        return bArr;
    }

    public String buildString() {
        StringBuilder sb2 = new StringBuilder();
        if (getHeader() != null) {
            sb2.append(getHeader().toString());
        }
        if (getPayload() != null) {
            sb2.append(getPayload().toString());
        }
        return sb2.toString();
    }

    public int calcHashCode() {
        int hashCode = getHeader() != null ? 527 + getHeader().hashCode() : 17;
        int i10 = hashCode;
        if (getPayload() != null) {
            i10 = (hashCode * 31) + getPayload().hashCode();
        }
        return i10;
    }

    public int calcLength() {
        int i10 = 0;
        if (getHeader() != null) {
            i10 = 0 + getHeader().length();
        }
        int i11 = i10;
        if (getPayload() != null) {
            i11 = i10 + getPayload().length();
        }
        return i11;
    }

    @Override // org.pcap4j.packet.Packet
    public <T extends Packet> boolean contains(Class<T> cls) {
        return get(cls) != null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        Packet packet = (Packet) obj;
        if (getHeader() == null || packet.getHeader() == null) {
            if (getHeader() != null || packet.getHeader() != null) {
                return false;
            }
        } else if (!getHeader().equals(packet.getHeader())) {
            return false;
        }
        return (getPayload() == null || packet.getPayload() == null) ? getPayload() == null && packet.getPayload() == null : getPayload().equals(packet.getPayload());
    }

    @Override // org.pcap4j.packet.Packet
    public <T extends Packet> T get(Class<T> cls) {
        Iterator<Packet> it = iterator();
        while (it.hasNext()) {
            Packet next = it.next();
            if (cls.isInstance(next)) {
                return cls.cast(next);
            }
        }
        return null;
    }

    @Override // org.pcap4j.packet.Packet
    public abstract Packet.Builder getBuilder();

    @Override // org.pcap4j.packet.Packet
    public Packet.Header getHeader() {
        return null;
    }

    @Override // org.pcap4j.packet.Packet
    public Packet getOuterOf(Class<? extends Packet> cls) {
        Iterator<Packet> it = iterator();
        while (it.hasNext()) {
            Packet next = it.next();
            if (cls.isInstance(next.getPayload())) {
                return next;
            }
        }
        return null;
    }

    @Override // org.pcap4j.packet.Packet
    public Packet getPayload() {
        return null;
    }

    @Override // org.pcap4j.packet.Packet
    public byte[] getRawData() {
        byte[] value = this.rawDataCache.getValue();
        int length = value.length;
        byte[] bArr = new byte[length];
        System.arraycopy(value, 0, bArr, 0, length);
        return bArr;
    }

    public int hashCode() {
        return this.hashCodeCache.getValue().intValue();
    }

    @Override // java.lang.Iterable
    public Iterator<Packet> iterator() {
        return new PacketIterator(this);
    }

    @Override // org.pcap4j.packet.Packet
    public int length() {
        return this.lengthCache.getValue().intValue();
    }

    public String toHexString() {
        return this.hexStringCache.getValue();
    }

    public String toString() {
        return this.stringCache.getValue();
    }
}
