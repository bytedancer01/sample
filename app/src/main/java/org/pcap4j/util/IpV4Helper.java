package org.pcap4j.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.SimpleBuilder;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/IpV4Helper.class */
public final class IpV4Helper {
    private static Comparator<IpV4Packet> comparator = new ComparatorImpl();

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/util/IpV4Helper$ComparatorImpl.class */
    public static final class ComparatorImpl implements Comparator<IpV4Packet> {
        private ComparatorImpl() {
        }

        @Override // java.util.Comparator
        public int compare(IpV4Packet ipV4Packet, IpV4Packet ipV4Packet2) {
            return ipV4Packet.getHeader().getFragmentOffset() - ipV4Packet2.getHeader().getFragmentOffset();
        }
    }

    private IpV4Helper() {
        throw new AssertionError();
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [org.pcap4j.packet.IpV4Packet$Builder] */
    public static IpV4Packet defragment(List<IpV4Packet> list) {
        Collections.sort(list, comparator);
        IpV4Packet.IpV4Header header = list.get(list.size() - 1).getHeader();
        int fragmentOffset = ((header.getFragmentOffset() * 8) + header.getTotalLengthAsInt()) - (header.getIhl() * 4);
        if (fragmentOffset <= 0) {
            throw new IllegalArgumentException("Can't defragment: " + list);
        }
        byte[] bArr = new byte[fragmentOffset];
        try {
            Iterator<IpV4Packet> it = list.iterator();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    IpV4Packet.Builder builder = list.get(0).getBuilder();
                    builder.moreFragmentFlag(false).fragmentOffset((short) 0).payloadBuilder((Packet.Builder) new SimpleBuilder((Packet) PacketFactories.getFactory(Packet.class, IpNumber.class).newInstance(bArr, 0, fragmentOffset, list.get(0).getHeader().getProtocol()))).correctChecksumAtBuild(true).correctLengthAtBuild2(true);
                    return builder.build();
                }
                byte[] rawData = it.next().getPayload().getRawData();
                System.arraycopy(rawData, 0, bArr, i11, rawData.length);
                i10 = i11 + rawData.length;
            }
        } catch (ArrayStoreException e10) {
            throw new IllegalArgumentException("Can't defragment: " + list);
        } catch (IndexOutOfBoundsException e11) {
            throw new IllegalArgumentException("Can't defragment: " + list);
        } catch (NullPointerException e12) {
            throw new IllegalArgumentException("Can't defragment: " + list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [org.pcap4j.packet.IpV4Packet$Builder] */
    /* JADX WARN: Type inference failed for: r0v44, types: [org.pcap4j.packet.IpV4Packet$Builder] */
    public static List<IpV4Packet> fragment(IpV4Packet ipV4Packet, int i10) {
        ArrayList arrayList = new ArrayList();
        if (ipV4Packet.length() <= i10) {
            arrayList.add(ipV4Packet);
            return arrayList;
        }
        IpV4Packet.IpV4Header header = ipV4Packet.getHeader();
        byte[] rawData = ipV4Packet.getPayload().getRawData();
        int length = i10 - header.length();
        int i11 = length % 8;
        int i12 = i11 == 0 ? length : length - i11;
        int length2 = rawData.length;
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (length2 > 0) {
                if (length2 <= length) {
                    byte[] bArr = new byte[length2];
                    System.arraycopy(rawData, i14, bArr, 0, length2);
                    IpV4Packet.Builder builder = ipV4Packet.getBuilder();
                    builder.moreFragmentFlag(false).fragmentOffset((short) (i14 / 8)).payloadBuilder((Packet.Builder) new UnknownPacket.Builder().rawData(bArr)).correctChecksumAtBuild(true).correctLengthAtBuild2(true);
                    arrayList.add(builder.build());
                    break;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(rawData, i14, bArr2, 0, i12);
                IpV4Packet.Builder builder2 = ipV4Packet.getBuilder();
                builder2.moreFragmentFlag(true).fragmentOffset((short) (i14 / 8)).payloadBuilder((Packet.Builder) new UnknownPacket.Builder().rawData(bArr2)).correctChecksumAtBuild(true).correctLengthAtBuild2(true);
                arrayList.add(builder2.build());
                length2 -= i12;
                i13 = i14 + i12;
            } else {
                break;
            }
        }
        return arrayList;
    }
}
