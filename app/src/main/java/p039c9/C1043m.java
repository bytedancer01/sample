package p039c9;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.amazonaws.services.p045s3.internal.crypto.CryptoRuntime;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.simpleframework.xml.strategy.Name;
import p059d9.C4349a;
import p059d9.C4352b;
import p059d9.C4369j0;
import p059d9.C4401z0;
import p099fc.AbstractC4841w0;
import p099fc.AbstractC4842x;
import p320s6.C8538a;
import p320s6.C8541d;
import p320s6.InterfaceC8539b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/m.class
 */
/* renamed from: c9.m */
/* loaded from: combined.jar:classes2.jar:c9/m.class */
public class C1043m {

    /* renamed from: a */
    public final HashMap<String, C1042l> f6998a;

    /* renamed from: b */
    public final SparseArray<String> f6999b;

    /* renamed from: c */
    public final SparseBooleanArray f7000c;

    /* renamed from: d */
    public final SparseBooleanArray f7001d;

    /* renamed from: e */
    public c f7002e;

    /* renamed from: f */
    public c f7003f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/m$a.class
     */
    /* renamed from: c9.m$a */
    /* loaded from: combined.jar:classes2.jar:c9/m$a.class */
    public static final class a implements c {

        /* renamed from: e */
        public static final String[] f7004e = {Name.MARK, "key", "metadata"};

        /* renamed from: a */
        public final InterfaceC8539b f7005a;

        /* renamed from: b */
        public final SparseArray<C1042l> f7006b = new SparseArray<>();

        /* renamed from: c */
        public String f7007c;

        /* renamed from: d */
        public String f7008d;

        public a(InterfaceC8539b interfaceC8539b) {
            this.f7005a = interfaceC8539b;
        }

        /* renamed from: j */
        public static void m6157j(InterfaceC8539b interfaceC8539b, String str) {
            try {
                String m6159n = m6159n(str);
                SQLiteDatabase writableDatabase = interfaceC8539b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C8541d.m36767c(writableDatabase, 1, str);
                    m6158l(writableDatabase, m6159n);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new C8538a(e10);
            }
        }

        /* renamed from: l */
        public static void m6158l(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        /* renamed from: n */
        public static String m6159n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // p039c9.C1043m.c
        /* renamed from: a */
        public void mo6160a() {
            m6157j(this.f7005a, (String) C4349a.m21882e(this.f7007c));
        }

        @Override // p039c9.C1043m.c
        /* renamed from: b */
        public boolean mo6161b() {
            boolean z10 = true;
            if (C8541d.m36766b(this.f7005a.getReadableDatabase(), 1, (String) C4349a.m21882e(this.f7007c)) == -1) {
                z10 = false;
            }
            return z10;
        }

        @Override // p039c9.C1043m.c
        /* renamed from: c */
        public void mo6162c(HashMap<String, C1042l> hashMap) {
            if (this.f7006b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f7005a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f7006b.size(); i10++) {
                    try {
                        C1042l valueAt = this.f7006b.valueAt(i10);
                        if (valueAt == null) {
                            m6169k(writableDatabase, this.f7006b.keyAt(i10));
                        } else {
                            m6168i(writableDatabase, valueAt);
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f7006b.clear();
            } catch (SQLException e10) {
                throw new C8538a(e10);
            }
        }

        @Override // p039c9.C1043m.c
        /* renamed from: d */
        public void mo6163d(long j10) {
            String hexString = Long.toHexString(j10);
            this.f7007c = hexString;
            this.f7008d = m6159n(hexString);
        }

        @Override // p039c9.C1043m.c
        /* renamed from: e */
        public void mo6164e(C1042l c1042l) {
            this.f7006b.put(c1042l.f6991a, c1042l);
        }

        @Override // p039c9.C1043m.c
        /* renamed from: f */
        public void mo6165f(C1042l c1042l, boolean z10) {
            if (z10) {
                this.f7006b.delete(c1042l.f6991a);
            } else {
                this.f7006b.put(c1042l.f6991a, null);
            }
        }

        @Override // p039c9.C1043m.c
        /* renamed from: g */
        public void mo6166g(HashMap<String, C1042l> hashMap) {
            try {
                SQLiteDatabase writableDatabase = this.f7005a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    m6171o(writableDatabase);
                    Iterator<C1042l> it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        m6168i(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f7006b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new C8538a(e10);
            }
        }

        @Override // p039c9.C1043m.c
        /* renamed from: h */
        public void mo6167h(HashMap<String, C1042l> hashMap, SparseArray<String> sparseArray) {
            C4349a.m21884g(this.f7006b.size() == 0);
            try {
                if (C8541d.m36766b(this.f7005a.getReadableDatabase(), 1, (String) C4349a.m21882e(this.f7007c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f7005a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        m6171o(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor m6170m = m6170m();
                while (m6170m.moveToNext()) {
                    try {
                        C1042l c1042l = new C1042l(m6170m.getInt(0), (String) C4349a.m21882e(m6170m.getString(1)), C1043m.m6143q(new DataInputStream(new ByteArrayInputStream(m6170m.getBlob(2)))));
                        hashMap.put(c1042l.f6992b, c1042l);
                        sparseArray.put(c1042l.f6991a, c1042l.f6992b);
                    } finally {
                    }
                }
                m6170m.close();
            } catch (SQLiteException e10) {
                hashMap.clear();
                sparseArray.clear();
                throw new C8538a(e10);
            }
        }

        /* renamed from: i */
        public final void m6168i(SQLiteDatabase sQLiteDatabase, C1042l c1042l) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C1043m.m6144t(c1042l.m6125d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Name.MARK, Integer.valueOf(c1042l.f6991a));
            contentValues.put("key", c1042l.f6992b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) C4349a.m21882e(this.f7008d), null, contentValues);
        }

        /* renamed from: k */
        public final void m6169k(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete((String) C4349a.m21882e(this.f7008d), "id = ?", new String[]{Integer.toString(i10)});
        }

        /* renamed from: m */
        public final Cursor m6170m() {
            return this.f7005a.getReadableDatabase().query((String) C4349a.m21882e(this.f7008d), f7004e, null, null, null, null, null);
        }

        /* renamed from: o */
        public final void m6171o(SQLiteDatabase sQLiteDatabase) {
            C8541d.m36768d(sQLiteDatabase, 1, (String) C4349a.m21882e(this.f7007c), 1);
            m6158l(sQLiteDatabase, (String) C4349a.m21882e(this.f7008d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f7008d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/m$b.class
     */
    /* renamed from: c9.m$b */
    /* loaded from: combined.jar:classes2.jar:c9/m$b.class */
    public static class b implements c {

        /* renamed from: a */
        public final boolean f7009a;

        /* renamed from: b */
        public final Cipher f7010b;

        /* renamed from: c */
        public final SecretKeySpec f7011c;

        /* renamed from: d */
        public final SecureRandom f7012d;

        /* renamed from: e */
        public final C4352b f7013e;

        /* renamed from: f */
        public boolean f7014f;

        /* renamed from: g */
        public C4369j0 f7015g;

        public b(File file, byte[] bArr, boolean z10) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            C4349a.m21884g((bArr == null && z10) ? false : true);
            if (bArr != null) {
                C4349a.m21878a(bArr.length == 16);
                try {
                    cipher = C1043m.m6140i();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                C4349a.m21878a(!z10);
                cipher = null;
                secretKeySpec = null;
            }
            this.f7009a = z10;
            this.f7010b = cipher;
            this.f7011c = secretKeySpec;
            this.f7012d = z10 ? new SecureRandom() : null;
            this.f7013e = new C4352b(file);
        }

        @Override // p039c9.C1043m.c
        /* renamed from: a */
        public void mo6160a() {
            this.f7013e.m21907a();
        }

        @Override // p039c9.C1043m.c
        /* renamed from: b */
        public boolean mo6161b() {
            return this.f7013e.m21909c();
        }

        @Override // p039c9.C1043m.c
        /* renamed from: c */
        public void mo6162c(HashMap<String, C1042l> hashMap) {
            if (this.f7014f) {
                mo6166g(hashMap);
            }
        }

        @Override // p039c9.C1043m.c
        /* renamed from: d */
        public void mo6163d(long j10) {
        }

        @Override // p039c9.C1043m.c
        /* renamed from: e */
        public void mo6164e(C1042l c1042l) {
            this.f7014f = true;
        }

        @Override // p039c9.C1043m.c
        /* renamed from: f */
        public void mo6165f(C1042l c1042l, boolean z10) {
            this.f7014f = true;
        }

        @Override // p039c9.C1043m.c
        /* renamed from: g */
        public void mo6166g(HashMap<String, C1042l> hashMap) {
            m6176m(hashMap);
            this.f7014f = false;
        }

        @Override // p039c9.C1043m.c
        /* renamed from: h */
        public void mo6167h(HashMap<String, C1042l> hashMap, SparseArray<String> sparseArray) {
            C4349a.m21884g(!this.f7014f);
            if (m6174k(hashMap, sparseArray)) {
                return;
            }
            hashMap.clear();
            sparseArray.clear();
            this.f7013e.m21907a();
        }

        /* renamed from: i */
        public final int m6172i(C1042l c1042l, int i10) {
            int hashCode;
            int hashCode2 = (c1042l.f6991a * 31) + c1042l.f6992b.hashCode();
            if (i10 < 2) {
                long m6177a = C1044n.m6177a(c1042l.m6125d());
                hashCode = (hashCode2 * 31) + ((int) (m6177a ^ (m6177a >>> 32)));
            } else {
                hashCode = (hashCode2 * 31) + c1042l.m6125d().hashCode();
            }
            return hashCode;
        }

        /* renamed from: j */
        public final C1042l m6173j(int i10, DataInputStream dataInputStream) {
            C1047q m6143q;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i10 < 2) {
                long readLong = dataInputStream.readLong();
                C1046p c1046p = new C1046p();
                C1046p.m6181g(c1046p, readLong);
                m6143q = C1047q.f7018c.m6194e(c1046p);
            } else {
                m6143q = C1043m.m6143q(dataInputStream);
            }
            return new C1042l(readInt, readUTF, m6143q);
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        /* renamed from: k */
        public final boolean m6174k(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        /* renamed from: l */
        public final void m6175l(C1042l c1042l, DataOutputStream dataOutputStream) {
            dataOutputStream.writeInt(c1042l.f6991a);
            dataOutputStream.writeUTF(c1042l.f6992b);
            C1043m.m6144t(c1042l.m6125d(), dataOutputStream);
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        /* renamed from: m */
        public final void m6176m(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/m$c.class
     */
    /* renamed from: c9.m$c */
    /* loaded from: combined.jar:classes2.jar:c9/m$c.class */
    public interface c {
        /* renamed from: a */
        void mo6160a();

        /* renamed from: b */
        boolean mo6161b();

        /* renamed from: c */
        void mo6162c(HashMap<String, C1042l> hashMap);

        /* renamed from: d */
        void mo6163d(long j10);

        /* renamed from: e */
        void mo6164e(C1042l c1042l);

        /* renamed from: f */
        void mo6165f(C1042l c1042l, boolean z10);

        /* renamed from: g */
        void mo6166g(HashMap<String, C1042l> hashMap);

        /* renamed from: h */
        void mo6167h(HashMap<String, C1042l> hashMap, SparseArray<String> sparseArray);
    }

    public C1043m(InterfaceC8539b interfaceC8539b, File file, byte[] bArr, boolean z10, boolean z11) {
        C4349a.m21884g((interfaceC8539b == null && file == null) ? false : true);
        this.f6998a = new HashMap<>();
        this.f6999b = new SparseArray<>();
        this.f7000c = new SparseBooleanArray();
        this.f7001d = new SparseBooleanArray();
        b bVar = null;
        a aVar = interfaceC8539b != null ? new a(interfaceC8539b) : null;
        bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z10) : bVar;
        if (aVar == null || (bVar != null && z11)) {
            this.f7002e = (c) C4401z0.m22391j(bVar);
            this.f7003f = aVar;
        } else {
            this.f7002e = aVar;
            this.f7003f = bVar;
        }
    }

    @SuppressLint({"GetInstance"})
    /* renamed from: i */
    public static Cipher m6140i() {
        if (C4401z0.f26679a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", CryptoRuntime.BOUNCY_CASTLE_PROVIDER);
            } catch (Throwable th2) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    /* renamed from: l */
    public static int m6141l(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        int i10 = keyAt;
        if (keyAt < 0) {
            int i11 = 0;
            while (i11 < size && i11 == sparseArray.keyAt(i11)) {
                i11++;
            }
            i10 = i11;
        }
        return i10;
    }

    /* renamed from: o */
    public static boolean m6142o(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* renamed from: q */
    public static C1047q m6143q(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < readInt; i10++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException("Invalid value size: " + readInt2);
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = C4401z0.f26684f;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 != readInt2) {
                    int i13 = i12 + min;
                    bArr = Arrays.copyOf(bArr, i13);
                    dataInputStream.readFully(bArr, i12, min);
                    min = Math.min(readInt2 - i13, 10485760);
                    i11 = i13;
                }
            }
            hashMap.put(readUTF, bArr);
        }
        return new C1047q(hashMap);
    }

    /* renamed from: t */
    public static void m6144t(C1047q c1047q, DataOutputStream dataOutputStream) {
        Set<Map.Entry<String, byte[]>> m6195f = c1047q.m6195f();
        dataOutputStream.writeInt(m6195f.size());
        for (Map.Entry<String, byte[]> entry : m6195f) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    /* renamed from: d */
    public final C1042l m6145d(String str) {
        int m6141l = m6141l(this.f6999b);
        C1042l c1042l = new C1042l(m6141l, str);
        this.f6998a.put(str, c1042l);
        this.f6999b.put(m6141l, str);
        this.f7001d.put(m6141l, true);
        this.f7002e.mo6164e(c1042l);
        return c1042l;
    }

    /* renamed from: e */
    public void m6146e(String str, C1046p c1046p) {
        C1042l m6152m = m6152m(str);
        if (m6152m.m6123b(c1046p)) {
            this.f7002e.mo6164e(m6152m);
        }
    }

    /* renamed from: f */
    public int m6147f(String str) {
        return m6152m(str).f6991a;
    }

    /* renamed from: g */
    public C1042l m6148g(String str) {
        return this.f6998a.get(str);
    }

    /* renamed from: h */
    public Collection<C1042l> m6149h() {
        return Collections.unmodifiableCollection(this.f6998a.values());
    }

    /* renamed from: j */
    public InterfaceC1045o m6150j(String str) {
        C1042l m6148g = m6148g(str);
        return m6148g != null ? m6148g.m6125d() : C1047q.f7018c;
    }

    /* renamed from: k */
    public String m6151k(int i10) {
        return this.f6999b.get(i10);
    }

    /* renamed from: m */
    public C1042l m6152m(String str) {
        C1042l c1042l = this.f6998a.get(str);
        C1042l c1042l2 = c1042l;
        if (c1042l == null) {
            c1042l2 = m6145d(str);
        }
        return c1042l2;
    }

    /* renamed from: n */
    public void m6153n(long j10) {
        c cVar;
        this.f7002e.mo6163d(j10);
        c cVar2 = this.f7003f;
        if (cVar2 != null) {
            cVar2.mo6163d(j10);
        }
        if (this.f7002e.mo6161b() || (cVar = this.f7003f) == null || !cVar.mo6161b()) {
            this.f7002e.mo6167h(this.f6998a, this.f6999b);
        } else {
            this.f7003f.mo6167h(this.f6998a, this.f6999b);
            this.f7002e.mo6166g(this.f6998a);
        }
        c cVar3 = this.f7003f;
        if (cVar3 != null) {
            cVar3.mo6160a();
            this.f7003f = null;
        }
    }

    /* renamed from: p */
    public void m6154p(String str) {
        C1042l c1042l = this.f6998a.get(str);
        if (c1042l != null && c1042l.m6128g() && c1042l.m6130i()) {
            this.f6998a.remove(str);
            int i10 = c1042l.f6991a;
            boolean z10 = this.f7001d.get(i10);
            this.f7002e.mo6165f(c1042l, z10);
            SparseArray<String> sparseArray = this.f6999b;
            if (z10) {
                sparseArray.remove(i10);
                this.f7001d.delete(i10);
            } else {
                sparseArray.put(i10, null);
                this.f7000c.put(i10, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public void m6155r() {
        AbstractC4841w0 it = AbstractC4842x.m24599x(this.f6998a.keySet()).iterator();
        while (it.hasNext()) {
            m6154p((String) it.next());
        }
    }

    /* renamed from: s */
    public void m6156s() {
        this.f7002e.mo6162c(this.f6998a);
        int size = this.f7000c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6999b.remove(this.f7000c.keyAt(i10));
        }
        this.f7000c.clear();
        this.f7001d.clear();
    }
}
