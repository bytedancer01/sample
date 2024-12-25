package org.pcap4j.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.core.PcapAddress;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;
import p354ue.AbstractC9172q;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/NifSelector.class */
public class NifSelector {
    private static String LINE_SEPARATOR = System.getProperty("line.separator");

    public PcapNetworkInterface doSelect(List<PcapNetworkInterface> list) {
        while (true) {
            write("Select a device number to capture packets, or enter 'q' to quit > ");
            String read = read();
            if (read != null) {
                if (read.equals(AbstractC9172q.f41940a)) {
                    return null;
                }
                try {
                    int parseInt = Integer.parseInt(read);
                    if (parseInt >= 0 && parseInt < list.size()) {
                        return list.get(parseInt);
                    }
                    write("Invalid input." + LINE_SEPARATOR);
                } catch (NumberFormatException e10) {
                    write("Invalid input." + LINE_SEPARATOR);
                }
            }
        }
    }

    public String read() {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public final PcapNetworkInterface selectNetworkInterface() {
        try {
            List<PcapNetworkInterface> findAllDevs = Pcaps.findAllDevs();
            if (findAllDevs == null || findAllDevs.isEmpty()) {
                throw new IOException("No NIF to capture.");
            }
            showNifList(findAllDevs);
            return doSelect(findAllDevs);
        } catch (PcapNativeException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public void showNifList(List<PcapNetworkInterface> list) {
        StringBuilder sb2 = new StringBuilder(200);
        int i10 = 0;
        for (PcapNetworkInterface pcapNetworkInterface : list) {
            sb2.append("NIF[");
            sb2.append(i10);
            sb2.append("]: ");
            sb2.append(pcapNetworkInterface.getName());
            sb2.append(LINE_SEPARATOR);
            if (pcapNetworkInterface.getDescription() != null) {
                sb2.append("      : description: ");
                sb2.append(pcapNetworkInterface.getDescription());
                sb2.append(LINE_SEPARATOR);
            }
            Iterator<LinkLayerAddress> it = pcapNetworkInterface.getLinkLayerAddresses().iterator();
            while (it.hasNext()) {
                LinkLayerAddress next = it.next();
                sb2.append("      : link layer address: ");
                sb2.append(next);
                sb2.append(LINE_SEPARATOR);
            }
            for (PcapAddress pcapAddress : pcapNetworkInterface.getAddresses()) {
                sb2.append("      : address: ");
                sb2.append(pcapAddress.getAddress());
                sb2.append(LINE_SEPARATOR);
            }
            i10++;
        }
        sb2.append(LINE_SEPARATOR);
        write(sb2.toString());
    }

    public void write(String str) {
        System.out.print(str);
    }
}
