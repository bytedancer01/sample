package org.minidns.source;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.MiniDnsException;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;
import org.minidns.dnsqueryresult.StandardDnsQueryResult;
import org.minidns.source.AbstractDnsDataSource;
import org.minidns.util.MultipleIoException;

/* loaded from: combined.jar:classes3.jar:org/minidns/source/NetworkDataSource.class */
public class NetworkDataSource extends AbstractDnsDataSource {
    public static final boolean $assertionsDisabled = false;
    public static final Logger LOGGER = Logger.getLogger(NetworkDataSource.class.getName());

    /* renamed from: org.minidns.source.NetworkDataSource$1 */
    /* loaded from: combined.jar:classes3.jar:org/minidns/source/NetworkDataSource$1.class */
    public static /* synthetic */ class C72001 {
        public static final int[] $SwitchMap$org$minidns$source$AbstractDnsDataSource$QueryMode;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.minidns.source.AbstractDnsDataSource$QueryMode[] r0 = org.minidns.source.AbstractDnsDataSource.QueryMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.minidns.source.NetworkDataSource.C72001.$SwitchMap$org$minidns$source$AbstractDnsDataSource$QueryMode = r0
                r0 = r4
                org.minidns.source.AbstractDnsDataSource$QueryMode r1 = org.minidns.source.AbstractDnsDataSource.QueryMode.dontCare     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = org.minidns.source.NetworkDataSource.C72001.$SwitchMap$org$minidns$source$AbstractDnsDataSource$QueryMode     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                org.minidns.source.AbstractDnsDataSource$QueryMode r1 = org.minidns.source.AbstractDnsDataSource.QueryMode.udpTcp     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = org.minidns.source.NetworkDataSource.C72001.$SwitchMap$org$minidns$source$AbstractDnsDataSource$QueryMode     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                org.minidns.source.AbstractDnsDataSource$QueryMode r1 = org.minidns.source.AbstractDnsDataSource.QueryMode.tcp     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: org.minidns.source.NetworkDataSource.C72001.m45530clinit():void");
        }
    }

    public DatagramSocket createDatagramSocket() {
        return new DatagramSocket();
    }

    public Socket createSocket() {
        return new Socket();
    }

    @Override // org.minidns.source.AbstractDnsDataSource, org.minidns.source.DnsDataSource
    public StandardDnsQueryResult query(DnsMessage dnsMessage, InetAddress inetAddress, int i10) {
        boolean z10;
        AbstractDnsDataSource.QueryMode queryMode = getQueryMode();
        int i11 = C72001.$SwitchMap$org$minidns$source$AbstractDnsDataSource$QueryMode[queryMode.ordinal()];
        if (i11 == 1 || i11 == 2) {
            z10 = true;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("Unsupported query mode: " + queryMode);
            }
            z10 = false;
        }
        ArrayList arrayList = new ArrayList(2);
        DnsMessage dnsMessage2 = null;
        if (z10) {
            try {
                dnsMessage2 = queryUdp(dnsMessage, inetAddress, i10);
            } catch (IOException e10) {
                arrayList.add(e10);
                dnsMessage2 = null;
            }
            if (dnsMessage2 != null && !dnsMessage2.truncated) {
                return new StandardDnsQueryResult(inetAddress, i10, DnsQueryResult.QueryMethod.udp, dnsMessage, dnsMessage2);
            }
            LOGGER.log(Level.FINE, "Fallback to TCP because {0}", new Object[]{dnsMessage2 != null ? "response is truncated" : arrayList.get(0)});
        }
        try {
            dnsMessage2 = queryTcp(dnsMessage, inetAddress, i10);
        } catch (IOException e11) {
            arrayList.add(e11);
            MultipleIoException.throwIfRequired(arrayList);
        }
        return new StandardDnsQueryResult(inetAddress, i10, DnsQueryResult.QueryMethod.tcp, dnsMessage, dnsMessage2);
    }

    public DnsMessage queryTcp(DnsMessage dnsMessage, InetAddress inetAddress, int i10) {
        Socket socket;
        Socket createSocket;
        try {
            createSocket = createSocket();
        } catch (Throwable th2) {
            th = th2;
            socket = null;
        }
        try {
            createSocket.connect(new InetSocketAddress(inetAddress, i10), this.timeout);
            createSocket.setSoTimeout(this.timeout);
            DataOutputStream dataOutputStream = new DataOutputStream(createSocket.getOutputStream());
            dnsMessage.writeTo(dataOutputStream);
            dataOutputStream.flush();
            DataInputStream dataInputStream = new DataInputStream(createSocket.getInputStream());
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            for (int i11 = 0; i11 < readUnsignedShort; i11 += dataInputStream.read(bArr, i11, readUnsignedShort - i11)) {
            }
            DnsMessage dnsMessage2 = new DnsMessage(bArr);
            if (dnsMessage2.f36211id != dnsMessage.f36211id) {
                throw new MiniDnsException.IdMismatch(dnsMessage, dnsMessage2);
            }
            createSocket.close();
            return dnsMessage2;
        } catch (Throwable th3) {
            th = th3;
            socket = createSocket;
            if (socket != null) {
                socket.close();
            }
            throw th;
        }
    }

    public DnsMessage queryUdp(DnsMessage dnsMessage, InetAddress inetAddress, int i10) {
        DatagramSocket datagramSocket;
        DatagramPacket asDatagram = dnsMessage.asDatagram(inetAddress, i10);
        int i11 = this.udpPayloadSize;
        byte[] bArr = new byte[i11];
        try {
            datagramSocket = createDatagramSocket();
        } catch (Throwable th2) {
            th = th2;
            datagramSocket = null;
        }
        try {
            datagramSocket.setSoTimeout(this.timeout);
            datagramSocket.send(asDatagram);
            DatagramPacket datagramPacket = new DatagramPacket(bArr, i11);
            datagramSocket.receive(datagramPacket);
            DnsMessage dnsMessage2 = new DnsMessage(datagramPacket.getData());
            if (dnsMessage2.f36211id != dnsMessage.f36211id) {
                throw new MiniDnsException.IdMismatch(dnsMessage, dnsMessage2);
            }
            datagramSocket.close();
            return dnsMessage2;
        } catch (Throwable th3) {
            th = th3;
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            throw th;
        }
    }
}
