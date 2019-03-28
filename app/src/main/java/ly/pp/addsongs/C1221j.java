package ly.pp.addsongs;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ly.pp.addsongs.j */
public final class C1221j implements UncaughtExceptionHandler {
    /* renamed from: b */
    private static C1221j f5689b = new C1221j();
    /* renamed from: a */
    private UncaughtExceptionHandler f5690a;
    /* renamed from: c */
    public Context f5691c;
    /* renamed from: d */
    private Map f5692d = new HashMap();
    /* renamed from: e */
    private DateFormat f5693e = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

    private C1221j() {
    }

    /* renamed from: a */
    private String m4040a(Throwable th) {
        String str;
        Throwable cause;
        StringBuffer stringBuffer = new StringBuffer();
        /*for (Entry entry : this.f5692d.entrySet()) {
            str = (String) entry.getKey();
            stringBuffer.append(new StringBuilder(String.valueOf(str)).append("=").append((String) entry.getValue()).append("\n").toString());
        }*/
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        stringBuffer.append(stringWriter.toString());
        try {
            String str2 = "crash-" + this.f5693e.format(new Date()) + "-" + System.currentTimeMillis() + ".log";
            if (!Environment.getExternalStorageState().equals("mounted")) {
                return str2;
            }
            str = Environment.getExternalStorageDirectory() + "/JustPiano/Crash/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new StringBuilder(String.valueOf(str)).append(str2).toString());
            fileOutputStream.write(stringBuffer.toString().getBytes());
            fileOutputStream.close();
            return str2;
        } catch (Throwable cause2) {
            Log.e("CrashHandler", "an error occured while writing file...", cause2);
            return null;
        }
    }

    /* renamed from: a */
    public static C1221j m4041a() {
        return f5689b;
    }

    /* renamed from: a */
    public final void mo3352a(Context context) {
        this.f5691c = context;
        this.f5690a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        int i;
        int i2 = 0;
        if (th == null) {
            i = 0;
        } else {
            new C1248k(this).start();
            Context context = this.f5691c;
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
                if ("ly.pp.justpiano" != null) {
                    Object obj = "4.3" == null ? "null" : "4.3";
                    String stringBuilder = new StringBuilder(String.valueOf(41)).toString();
                    this.f5692d.put("versionName", obj);
                    this.f5692d.put("versionCode", stringBuilder);
                }
            } catch (Throwable e) {
                Log.e("CrashHandler", "an error occured when collect package info", e);
            }
            Field[] declaredFields = Build.class.getDeclaredFields();
            int length = declaredFields.length;
            while (i2 < length) {
                Field field = declaredFields[i2];
                try {
                    field.setAccessible(true);
                    this.f5692d.put(field.getName(), field.get(null).toString());
                    Log.d("CrashHandler", field.getName() + " : " + field.get(null));
                } catch (Throwable e2) {
                    Log.e("CrashHandler", "an error occured when collect crash info", e2);
                }
                i2++;
            }
            m4040a(th);
            i = 1;
        }
        if (i != 0 || this.f5690a == null) {
            try {
                Thread.sleep(3000);
            } catch (Throwable e22) {
                Log.e("CrashHandler", "error : ", e22);
            }
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        this.f5690a.uncaughtException(thread, th);
    }
}
