package ly.pp.addsongs;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


/* renamed from: ly.pp.addsongs.nk */
public final class C1340nk {
    /* renamed from: a */
    public static String m4154a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        try {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes("UTF-8"));
        gZIPOutputStream.close();
        str = "ISO-8859-1";

            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: a */
    public static void m4155a(File file, String str) {
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                InputStream inputStream = zipFile.getInputStream(zipEntry);
                file2 = new File(new String(new StringBuilder(String.valueOf(str)).append(File.separator).append(zipEntry.getName()).toString().getBytes("8859_1"), "GB2312"));
                if (!file2.exists()) {
                    File parentFile = file2.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file2.createNewFile();
                }
                OutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                inputStream.close();
                fileOutputStream.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static String m4156b(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            byte[] bArr = new byte[256];
            while (true) {
                int read = gZIPInputStream.read(bArr);
                if (read < 0) {
                    str = byteArrayOutputStream.toString();
                    byteArrayOutputStream.close();
                    byteArrayInputStream.close();
                    gZIPInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
