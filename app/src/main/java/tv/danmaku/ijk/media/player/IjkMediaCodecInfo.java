package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/IjkMediaCodecInfo.class */
public class IjkMediaCodecInfo {
    public static final int RANK_ACCEPTABLE = 700;
    public static final int RANK_LAST_CHANCE = 600;
    public static final int RANK_MAX = 1000;
    public static final int RANK_NON_STANDARD = 100;
    public static final int RANK_NO_SENSE = 0;
    public static final int RANK_SECURE = 300;
    public static final int RANK_SOFTWARE = 200;
    public static final int RANK_TESTED = 800;
    private static final String TAG = "IjkMediaCodecInfo";
    private static Map<String, Integer> sKnownCodecList;
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank = 0;

    private static Map<String, Integer> getKnownCodecList() {
        synchronized (IjkMediaCodecInfo.class) {
            try {
                Map<String, Integer> map = sKnownCodecList;
                if (map != null) {
                    return map;
                }
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                sKnownCodecList = treeMap;
                treeMap.put("OMX.Nvidia.h264.decode", 800);
                sKnownCodecList.put("OMX.Nvidia.h264.decode.secure", 300);
                sKnownCodecList.put("OMX.Intel.hw_vd.h264", Integer.valueOf(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE));
                sKnownCodecList.put("OMX.Intel.VideoDecoder.AVC", 800);
                sKnownCodecList.put("OMX.qcom.video.decoder.avc", 800);
                sKnownCodecList.put("OMX.ittiam.video.decoder.avc", 0);
                sKnownCodecList.put("OMX.SEC.avc.dec", 800);
                sKnownCodecList.put("OMX.SEC.AVC.Decoder", 799);
                sKnownCodecList.put("OMX.SEC.avcdec", 798);
                sKnownCodecList.put("OMX.SEC.avc.sw.dec", 200);
                sKnownCodecList.put("OMX.Exynos.avc.dec", 800);
                sKnownCodecList.put("OMX.Exynos.AVC.Decoder", 799);
                sKnownCodecList.put("OMX.k3.video.decoder.avc", 800);
                sKnownCodecList.put("OMX.IMG.MSVDX.Decoder.AVC", 800);
                sKnownCodecList.put("OMX.TI.DUCATI1.VIDEO.DECODER", 800);
                sKnownCodecList.put("OMX.rk.video_decoder.avc", 800);
                sKnownCodecList.put("OMX.amlogic.avc.decoder.awesome", 800);
                sKnownCodecList.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 800);
                sKnownCodecList.put("OMX.MARVELL.VIDEO.H264DECODER", 200);
                sKnownCodecList.remove("OMX.Action.Video.Decoder");
                sKnownCodecList.remove("OMX.allwinner.video.decoder.avc");
                sKnownCodecList.remove("OMX.BRCM.vc4.decoder.avc");
                sKnownCodecList.remove("OMX.brcm.video.h264.hw.decoder");
                sKnownCodecList.remove("OMX.brcm.video.h264.decoder");
                sKnownCodecList.remove("OMX.cosmo.video.decoder.avc");
                sKnownCodecList.remove("OMX.duos.h264.decoder");
                sKnownCodecList.remove("OMX.hantro.81x0.video.decoder");
                sKnownCodecList.remove("OMX.hantro.G1.video.decoder");
                sKnownCodecList.remove("OMX.hisi.video.decoder");
                sKnownCodecList.remove("OMX.LG.decoder.video.avc");
                sKnownCodecList.remove("OMX.MS.AVC.Decoder");
                sKnownCodecList.remove("OMX.RENESAS.VIDEO.DECODER.H264");
                sKnownCodecList.remove("OMX.RTK.video.decoder");
                sKnownCodecList.remove("OMX.sprd.h264.decoder");
                sKnownCodecList.remove("OMX.ST.VFM.H264Dec");
                sKnownCodecList.remove("OMX.vpu.video_decoder.avc");
                sKnownCodecList.remove("OMX.WMT.decoder.avc");
                sKnownCodecList.remove("OMX.bluestacks.hw.decoder");
                sKnownCodecList.put("OMX.google.h264.decoder", 200);
                sKnownCodecList.put("OMX.google.h264.lc.decoder", 200);
                sKnownCodecList.put("OMX.k3.ffmpeg.decoder", 200);
                sKnownCodecList.put("OMX.ffmpeg.video.decoder", 200);
                sKnownCodecList.put("OMX.sprd.soft.h264.decoder", 200);
                return sKnownCodecList;
            } finally {
            }
        }
    }

    public static String getLevelName(int i10) {
        if (i10 == 1) {
            return "1";
        }
        if (i10 == 2) {
            return "1b";
        }
        switch (i10) {
            case 4:
                return "11";
            case 8:
                return "12";
            case 16:
                return "13";
            case 32:
                return "2";
            case 64:
                return "21";
            case 128:
                return "22";
            case 256:
                return "3";
            case 512:
                return "31";
            case 1024:
                return "32";
            case 2048:
                return "4";
            case 4096:
                return "41";
            case NTLMEngineImpl.FLAG_WORKSTATION_PRESENT /* 8192 */:
                return "42";
            case 16384:
                return "5";
            case 32768:
                return "51";
            case 65536:
                return "52";
            default:
                return "0";
        }
    }

    public static String getProfileLevelName(int i10, int i11) {
        return String.format(Locale.US, " %s Profile Level %s (%d,%d)", getProfileName(i10), getLevelName(i11), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String getProfileName(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? i10 != 16 ? i10 != 32 ? i10 != 64 ? "Unknown" : "High444" : "High422" : "High10" : "High" : "Extends" : "Main" : "Baseline";
    }

    @TargetApi(16)
    public static IjkMediaCodecInfo setupCandidate(MediaCodecInfo mediaCodecInfo, String str) {
        IjkMediaCodecInfo ijkMediaCodecInfo = null;
        if (mediaCodecInfo != null) {
            String name = mediaCodecInfo.getName();
            if (TextUtils.isEmpty(name)) {
                return null;
            }
            String lowerCase = name.toLowerCase(Locale.US);
            int i10 = 600;
            if (!lowerCase.startsWith("omx.")) {
                i10 = 100;
            } else if (lowerCase.startsWith("omx.pv") || lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || lowerCase.startsWith("omx.k3.ffmpeg.") || lowerCase.startsWith("omx.avcodec.")) {
                i10 = 200;
            } else if (lowerCase.startsWith("omx.ittiam.")) {
                i10 = 0;
            } else if (lowerCase.startsWith("omx.mtk.")) {
                i10 = 800;
            } else {
                Integer num = getKnownCodecList().get(lowerCase);
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    try {
                        if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                            i10 = 700;
                        }
                    } catch (Throwable th2) {
                    }
                }
            }
            ijkMediaCodecInfo = new IjkMediaCodecInfo();
            ijkMediaCodecInfo.mCodecInfo = mediaCodecInfo;
            ijkMediaCodecInfo.mRank = i10;
            ijkMediaCodecInfo.mMimeType = str;
        }
        return ijkMediaCodecInfo;
    }

    @TargetApi(16)
    public void dumpProfileLevels(String str) {
        int i10;
        int i11;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = this.mCodecInfo.getCapabilitiesForType(str);
            if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                int length = codecProfileLevelArr.length;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i10 = i13;
                    i11 = i14;
                    if (i12 >= length) {
                        break;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i12];
                    if (codecProfileLevel != null) {
                        i13 = Math.max(i13, codecProfileLevel.profile);
                        i14 = Math.max(i14, codecProfileLevel.level);
                    }
                    i12++;
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            Log.i(TAG, String.format(Locale.US, "%s", getProfileLevelName(i10, i11)));
        } catch (Throwable th2) {
            Log.i(TAG, "profile-level: exception");
        }
    }
}
