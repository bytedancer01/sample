package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/UploadDataProviders.class */
public final class UploadDataProviders {

    /* loaded from: combined.jar:classes3.jar:org/chromium/net/UploadDataProviders$ByteBufferUploadProvider.class */
    public static final class ByteBufferUploadProvider extends UploadDataProvider {
        private final ByteBuffer mUploadBuffer;

        private ByteBufferUploadProvider(ByteBuffer byteBuffer) {
            this.mUploadBuffer = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.mUploadBuffer.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.mUploadBuffer.remaining()) {
                byteBuffer.put(this.mUploadBuffer);
            } else {
                int limit = this.mUploadBuffer.limit();
                ByteBuffer byteBuffer2 = this.mUploadBuffer;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.mUploadBuffer);
                this.mUploadBuffer.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.mUploadBuffer.position(0);
            uploadDataSink.onRewindSucceeded();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/chromium/net/UploadDataProviders$FileChannelProvider.class */
    public interface FileChannelProvider {
        FileChannel getChannel();
    }

    /* loaded from: combined.jar:classes3.jar:org/chromium/net/UploadDataProviders$FileUploadProvider.class */
    public static final class FileUploadProvider extends UploadDataProvider {
        private volatile FileChannel mChannel;
        private final Object mLock;
        private final FileChannelProvider mProvider;

        private FileUploadProvider(FileChannelProvider fileChannelProvider) {
            this.mLock = new Object();
            this.mProvider = fileChannelProvider;
        }

        private FileChannel getChannel() {
            if (this.mChannel == null) {
                synchronized (this.mLock) {
                    if (this.mChannel == null) {
                        this.mChannel = this.mProvider.getChannel();
                    }
                }
            }
            return this.mChannel;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            FileChannel fileChannel = this.mChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return getChannel().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            int read;
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel channel = getChannel();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 != 0 || (read = channel.read(byteBuffer)) == -1) {
                    break;
                } else {
                    i10 = i11 + read;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            getChannel().position(0L);
            uploadDataSink.onRewindSucceeded();
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new FileUploadProvider(new FileChannelProvider(parcelFileDescriptor) { // from class: org.chromium.net.UploadDataProviders.2
            public final ParcelFileDescriptor val$fd;

            {
                this.val$fd = parcelFileDescriptor;
            }

            @Override // org.chromium.net.UploadDataProviders.FileChannelProvider
            public FileChannel getChannel() {
                if (this.val$fd.getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(this.val$fd).getChannel();
                }
                this.val$fd.close();
                throw new IllegalArgumentException("Not a file: " + this.val$fd);
            }
        });
    }

    public static UploadDataProvider create(File file) {
        return new FileUploadProvider(new FileChannelProvider(file) { // from class: org.chromium.net.UploadDataProviders.1
            public final File val$file;

            {
                this.val$file = file;
            }

            @Override // org.chromium.net.UploadDataProviders.FileChannelProvider
            public FileChannel getChannel() {
                return new FileInputStream(this.val$file).getChannel();
            }
        });
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new ByteBufferUploadProvider(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new ByteBufferUploadProvider(ByteBuffer.wrap(bArr, i10, i11).slice());
    }
}
