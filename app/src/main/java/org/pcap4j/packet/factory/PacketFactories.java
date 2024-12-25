package org.pcap4j.packet.factory;

import java.security.ProtectionDomain;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import org.pcap4j.packet.namednumber.NamedNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/PacketFactories.class */
public final class PacketFactories {
    private static final PacketFactoryBinder FACTORY_BINDER;
    private static final Logger logger;

    static {
        Logger logger2 = LoggerFactory.getLogger((Class<?>) PacketFactories.class);
        logger = logger2;
        PacketFactoryBinder packetFactoryBinder = null;
        try {
            Iterator it = ServiceLoader.load(PacketFactoryBinderProvider.class).iterator();
            if (it.hasNext()) {
                PacketFactoryBinderProvider packetFactoryBinderProvider = (PacketFactoryBinderProvider) it.next();
                ProtectionDomain protectionDomain = packetFactoryBinderProvider.getClass().getProtectionDomain();
                logger2.info("A PacketFactoryBinderProvider implementation is found. ClassLoader: {}, URL: {}", packetFactoryBinderProvider.getClass().getClassLoader().toString(), protectionDomain != null ? protectionDomain.getCodeSource().getLocation() : null);
                PacketFactoryBinder binder = packetFactoryBinderProvider.getBinder();
                logger2.info("Succeeded in PacketFactoryBinderProvider.getBinder()");
                packetFactoryBinder = binder;
            } else {
                logger2.warn("No PacketFactoryBinder is available. All packets will be captured as UnknownPacket.");
                packetFactoryBinder = null;
            }
        } catch (ServiceConfigurationError e10) {
            logger.warn(e10.getClass().getName() + ": " + e10.getMessage());
        }
        FACTORY_BINDER = packetFactoryBinder;
    }

    private PacketFactories() {
        throw new AssertionError();
    }

    public static <T, N extends NamedNumber<?, ?>> PacketFactory<T, N> getFactory(Class<T> cls, Class<N> cls2) {
        if (cls2 != null && cls != null) {
            PacketFactoryBinder packetFactoryBinder = FACTORY_BINDER;
            return packetFactoryBinder != null ? packetFactoryBinder.getPacketFactory(cls, cls2) : SimplePacketFactoryBinder.getInstance().getPacketFactory(cls, cls2);
        }
        throw new NullPointerException("numberClass: " + cls2 + " targetClass: " + cls);
    }
}
