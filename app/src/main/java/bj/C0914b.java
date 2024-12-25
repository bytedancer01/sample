package bj;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.util.Arrays;

/* renamed from: bj.b */
/* loaded from: combined.jar:classes3.jar:bj/b.class */
public class C0914b extends RuntimeException {
    public C0914b(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + InstructionFileId.DOT);
    }
}
