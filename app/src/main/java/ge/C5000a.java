package ge;

import org.apache.commons.net.bsd.RCommandClient;
import org.apache.commons.net.bsd.RLoginClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.smtp.SMTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;
import org.joda.time.DateTimeConstants;
import p444zd.C10194b;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ge/a.class
 */
/* renamed from: ge.a */
/* loaded from: combined.jar:classes2.jar:ge/a.class */
public final class C5000a {

    /* renamed from: b */
    public static final int[][] f29008b = {new int[]{121, 120, 127, 126, 133, 132, 139, 138, 145, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 151, FTPReply.FILE_STATUS_OK, 157, 156, 163, 162, 169, DateTimeConstants.HOURS_PER_WEEK, 175, 174, 181, 180, 187, 186, 193, 192, NNTPReply.DEBUG_OUTPUT, 198, -2, -2}, new int[]{123, 122, 129, 128, 135, 134, 141, 140, 147, 146, 153, 152, 159, 158, 165, 164, 171, 170, 177, 176, 183, 182, 189, 188, 195, 194, 201, 200, 816, -3}, new int[]{125, 124, 131, 130, 137, 136, IMAP.DEFAULT_PORT, 142, 149, 148, 155, 154, 161, 160, 167, 166, 173, 172, 179, 178, 185, 184, 191, 190, 197, 196, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 202, 818, 817}, new int[]{283, 282, 277, 276, 271, 270, 265, 264, 259, 258, TelnetCommand.f36137DO, TelnetCommand.WONT, TelnetCommand.f36138EC, TelnetCommand.AYT, TelnetCommand.NOP, 240, 235, FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE, FTPReply.ENTERING_EPSV_MODE, 228, NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, 217, 216, 211, 210, 205, HttpStatus.SC_NO_CONTENT, 819, -3}, new int[]{285, 284, 279, 278, 273, 272, 267, 266, 261, 260, 255, TelnetCommand.DONT, TelnetCommand.f36140GA, TelnetCommand.f36139EL, TelnetCommand.BREAK, 242, TelnetCommand.SUSP, TelnetCommand.EOF, NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS, 230, FTPReply.DATA_CONNECTION_OPEN, 224, 219, 218, FTPReply.FILE_STATUS, FTPReply.DIRECTORY_STATUS, HttpStatus.SC_MULTI_STATUS, HttpStatus.SC_PARTIAL_CONTENT, 821, 820}, new int[]{287, 286, NNTPReply.AUTHENTICATION_ACCEPTED, 280, 275, 274, 269, 268, 263, 262, FTPReply.PATHNAME_CREATED, 256, 251, 250, TelnetCommand.f36135AO, 244, TelnetCommand.EOR, TelnetCommand.ABORT, 233, 232, FTPReply.ENTERING_PASSIVE_MODE, FTPReply.CLOSING_DATA_CONNECTION, 221, 220, FTPReply.NAME_SYSTEM_TYPE, 214, 209, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, HttpStatus.SC_TEMPORARY_REDIRECT, 306, 313, 312, 319, 318, 325, 324, FTPReply.NEED_PASSWORD, 330, 337, 336, 343, 342, 349, 348, 355, SMTPReply.START_MAIL_INPUT, 361, 360, 367, 366, 824, 823}, new int[]{291, 290, 297, 296, HttpStatus.SC_SEE_OTHER, HttpStatus.SC_MOVED_TEMPORARILY, 309, 308, 315, 314, 321, 320, 327, 326, 333, FTPReply.NEED_ACCOUNT, 339, 338, 345, 344, 351, FTPReply.FILE_ACTION_PENDING, 357, 356, 363, 362, 369, 368, 825, -3}, new int[]{293, 292, 299, 298, HttpStatus.SC_USE_PROXY, HttpStatus.SC_NOT_MODIFIED, 311, 310, 317, 316, 323, 322, 329, 328, 335, FTPReply.SECURITY_MECHANISM_IS_OK, 341, NNTPReply.SEND_ARTICLE_TO_POST, 347, 346, 353, 352, 359, 358, 365, 364, 371, 370, 827, 826}, new int[]{HttpStatus.SC_CONFLICT, HttpStatus.SC_REQUEST_TIMEOUT, 403, HttpStatus.SC_PAYMENT_REQUIRED, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, 384, 379, 378, 373, 372, 828, -3}, new int[]{411, HttpStatus.SC_GONE, HttpStatus.SC_METHOD_NOT_ALLOWED, 404, 399, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, NNTPReply.MORE_AUTH_INFO_REQUIRED, 380, 375, 374, 830, 829}, new int[]{HttpStatus.SC_REQUEST_TOO_LONG, 412, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, HttpStatus.SC_NOT_ACCEPTABLE, HttpStatus.SC_UNAUTHORIZED, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, 388, 383, 382, 377, 376, 831, -3}, new int[]{HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, HttpStatus.SC_REQUEST_URI_TOO_LONG, 421, 420, 427, FTPReply.TRANSFER_ABORTED, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, 833, 832}, new int[]{HttpStatus.SC_EXPECTATION_FAILED, HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, 423, 422, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, NNTPReply.ARTICLE_NOT_WANTED, 434, NNTPReply.POSTING_FAILED, NNTPReply.POSTING_NOT_ALLOWED, 447, 446, 834, -3}, new int[]{HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 418, FTPReply.CANNOT_OPEN_DATA_CONNECTION, HttpStatus.SC_FAILED_DEPENDENCY, FTPReply.UNAVAILABLE_RESOURCE, NNTPReply.NO_SUCH_ARTICLE_FOUND, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, NNTPReply.ARTICLE_REJECTED, NNTPReply.TRANSFER_FAILED, 443, 442, 449, 448, 836, 835}, new int[]{481, NNTPReply.AUTHENTICATION_REQUIRED, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, 451, 450, 837, -3}, new int[]{483, NNTPReply.AUTHENTICATION_REJECTED, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, 458, 453, 452, 839, 838}, new int[]{485, 484, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, 454, 840, -3}, new int[]{487, 486, 493, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, 504, 511, 510, 517, TFTP.PACKET_SIZE, 842, 841}, new int[]{489, 488, 495, 494, 501, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, HttpStatus.SC_INSUFFICIENT_STORAGE, 506, RLoginClient.DEFAULT_PORT, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, 496, 503, 502, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, 508, 515, RCommandClient.DEFAULT_PORT, 521, 520, 845, 844}, new int[]{559, 558, 553, 552, 547, 546, 541, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, FTPReply.FAILED_SECURITY_CHECK, FTPReply.REQUEST_DENIED, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, 555, SMTPReply.TRANSACTION_FAILED, 549, 548, 543, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, FTPReply.REQUESTED_PROT_LEVEL_NOT_SUPPORTED, 531, FTPReply.NOT_LOGGED_IN, 525, 524, 848, 847}, new int[]{563, 562, 557, 556, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, FTPReply.DENIED_FOR_POLICY_REASONS, FTPReply.NEED_ACCOUNT_FOR_STORING_FILES, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, 577, 576, 583, 582, 589, 588, 595, 594, 601, 600, 607, 606, 613, 612, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, 851, 850}, new int[]{567, 566, 573, 572, 579, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, 585, 584, 591, 590, 597, 596, 603, 602, 609, 608, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, 586, 593, 592, 599, 598, 605, 604, 611, 610, 617, 616, 623, 622, 629, 628, 635, 634, 641, 640, 647, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH, IMediaPlayer.MEDIA_INFO_BUFFERING_END, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, 666, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, 705, 704, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, 650, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, 707, 706, IMediaPlayer.MEDIA_INFO_BUFFERING_START, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, 756, 763, 762, 769, 768, 775, 774, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, 811, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, 771, 770, 777, 776, 783, 782, 789, 788, 795, 794, IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE, 800, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, 785, 784, 791, 790, 797, 796, 803, IMediaPlayer.MEDIA_INFO_METADATA_UPDATE, 809, 808, 815, 814, 863, 862}};

    /* renamed from: a */
    public final C10194b f29009a;

    public C5000a(C10194b c10194b) {
        this.f29009a = c10194b;
    }

    /* renamed from: a */
    public byte[] m25165a() {
        byte[] bArr = new byte[IjkMediaMeta.FF_PROFILE_H264_HIGH_444];
        int m42675h = this.f29009a.m42675h();
        int m42678k = this.f29009a.m42678k();
        for (int i10 = 0; i10 < m42675h; i10++) {
            int[] iArr = f29008b[i10];
            for (int i11 = 0; i11 < m42678k; i11++) {
                int i12 = iArr[i11];
                if (i12 >= 0 && this.f29009a.m42672d(i11, i10)) {
                    int i13 = i12 / 6;
                    bArr[i13] = (byte) (((byte) (1 << (5 - (i12 % 6)))) | bArr[i13]);
                }
            }
        }
        return bArr;
    }
}
