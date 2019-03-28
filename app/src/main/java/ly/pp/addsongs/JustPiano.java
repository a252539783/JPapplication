package ly.pp.addsongs;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Timer;

import static android.content.ContentValues.TAG;


/* renamed from: ly.pp.addsongs.JustPiano */
public class JustPiano extends Activity implements Callback, Runnable {
    /* renamed from: a */
    int f4091a = 0;
    /* renamed from: b */
    public Handler f4092b;
    /* renamed from: c */
    boolean f4093c = true;
    /* renamed from: d */
    boolean f4094d = false;
    /* renamed from: e */
    boolean f4095e = false;
    /* renamed from: f */
    boolean f4096f = false;
    /* renamed from: g */
    /* renamed from: h */
    int f4098h = 0;
    /* renamed from: j */
    private C1213is f4100j;
    /* renamed from: k */
    private SQLiteDatabase f4101k;
    /* renamed from: n */
    private ContentValues f4104n;
    /* renamed from: o */
    private JustPianoView f4105o;
    /* renamed from: p */
    private String f4106p = "";
    /* renamed from: q */
    private int f4107q = 0;
    /* renamed from: r */
    private String f4108r = "";

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m3587a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Cursor query;
        String string;
        Exception e;
        Throwable th;
        String[] list;
        if (sQLiteDatabase == null) {
            Log.e("JustPiano", "sdb==null");
        }
        if (z) {
            Log.e("JustPiano", "delete");
            sQLiteDatabase.delete("jp_data", "path = ?", new String[]{"songs/e/b/huanyinglaidao.pm"});
        }
        HashMap hashMap = new HashMap();
        C1266kr c1266kr = new C1266kr(null);
        try {
            query = sQLiteDatabase.query("jp_data", new String[]{"path"}, null, null, null, null, "_id DESC");
            while (query.moveToNext()) {
                try {
                    string = query.getString(query.getColumnIndex("path"));
                    if (string.length() <= 9 || string.charAt(9) != '/') {
                        hashMap.put(string, string);
                    } else {
                        hashMap.put(string.substring(0, 8) + string.substring(10, string.length()), string);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e3) {
            e = e3;
            query = null;
        } catch (Throwable th2) {
            query = null;
        }
        try {
            list = getResources().getAssets().list("songs");
        } catch (IOException e4) {
            e4.printStackTrace();
            list = null;
        }
        if (list != null) {
            int length = list.length;
            sQLiteDatabase.beginTransaction();
            for (int i = 0; i < length; i++) {
                String str = list[i];
                System.gc();
                String[] list2;
                try {
                    list2 = getResources().getAssets().list("songs/" + str);
                } catch (IOException e5) {
                    e5.printStackTrace();
                    list2 = null;
                }
                for (String str2 : list2) {
                    String[] list3;
                    /* renamed from: l */
                    int f4102l = 1;
                    System.gc();
                    try {
                        list3 = getResources().getAssets().list("songs/" + str + "/" + str2);
                    } catch (IOException e42) {
                        e42.printStackTrace();
                        list3 = null;
                    }
                    if (list3 != null) {
                        int length2 = list3.length;
                        //"slen.length:" + length2;
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= length2) {
                                break;
                            }
                            string = "songs/" + str + "/" + str2 + "/" + list3[i3];
                            String str3 = "songs/" + str + "/" + list3[i3];
                            c1266kr.mo3452a(this, string);
                            /* renamed from: m */
                            int f4103m = 300;
                            if (i3 > f4103m * f4102l) {
                                //"超过文件夹数目，中断曲目为：" + string;
                                f4102l++;
                            }
                            String h = c1266kr.mo3460h();
                            if (h == null) {
                                Log.d(TAG, "读取文件出错："+ string);
                            } else {
                                float g = c1266kr.mo3459g();
                                this.f4098h++;
                                if (hashMap.containsKey(str3)) {
                                    this.f4106p = "存在曲目：" + h + "..." + this.f4098h + "";
                                    this.f4104n.put("isnew", 0);
                                    this.f4104n.put("online", 1);
                                    this.f4104n.put("path", string);
                                    sQLiteDatabase.update("jp_data", this.f4104n, "path = '" + (String) hashMap.get(str3) + "'", null);
                                    this.f4104n.clear();
                                } else if (hashMap.containsKey(string)) {
                                    this.f4106p = "存在曲目：" + h + "..." + this.f4098h + "";
                                    this.f4104n.put("isnew", 0);
                                    this.f4104n.put("online", 1);
                                    sQLiteDatabase.update("jp_data", this.f4104n, "path = '" + ((String) hashMap.get(string)) + "'", null);
                                    this.f4104n.clear();
                                } else {
                                    this.f4106p = "" + h + "" + this.f4098h + "";
                                    this.f4104n.put("name", h);
                                    this.f4104n.put("item", C1194i.f5600d[i]);
                                    this.f4104n.put("path", string);
                                    this.f4104n.put("isnew", 1);
                                    this.f4104n.put("ishot", 0);
                                    this.f4104n.put("isfavo", 0);
                                    this.f4104n.put("player", "");
                                    this.f4104n.put("score", 0);
                                    this.f4104n.put("date", 0);
                                    this.f4104n.put("count", 0);
                                    this.f4104n.put("diff", g);
                                    this.f4104n.put("online", 1);
                                    sQLiteDatabase.insertOrThrow("jp_data", null, this.f4104n);
                                    this.f4104n.clear();
                                }
                                Message obtainMessage = this.f4092b.obtainMessage();
                                obtainMessage.what = 0;
                                this.f4092b.sendMessage(obtainMessage);
                            }
                            i2 = i3 + 1;
                        }
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            this.f4106p = "";
            return;
        }
        try {
            if (query != null) {
                query.close();
            }
            list = getResources().getAssets().list("songs");
            int length3 = list.length;
        } catch (Throwable th3) {
            if (query != null) {
                query.close();
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f4105o.mo2761a(this.f4107q, this.f4106p, this.f4108r);
                break;
            case 1:
                this.f4096f = true;
                if (!this.f4094d) {
                    Intent intent = new Intent();
                    intent.setClass(this, MainMode.class);
                    startActivity(intent);
                    finish();
                    break;
                }
                break;
        }
        return false;
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        /* renamed from: i */
        JPApplication f4099i = (JPApplication) getApplication();
        this.f4092b = new Handler(this);
        new Options().inPreferredConfig = Config.RGB_565;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        f4099i.mo2722d(displayMetrics.heightPixels);
        f4099i.mo2725e(displayMetrics.widthPixels);
        this.f4105o = new JustPianoView(this, f4099i);
        setContentView(this.f4105o);
        this.f4104n = new ContentValues();
        Timer timer = new Timer();
        timer.schedule(new C0990al(this, timer), 0, 1000);
    }

    protected void onDestroy() {
        if (this.f4101k != null) {
            try {
                if (this.f4101k.isOpen()) {
                    this.f4101k.close();
                }
                this.f4101k = null;
                if (this.f4100j != null) {
                    this.f4100j.close();
                }
                this.f4100j = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f4105o.mo2760a();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        if (!this.f4096f && this.f4095e) {
            this.f4094d = true;
        }

    }

    public void onResume() {
        super.onResume();
        if (this.f4094d && this.f4095e && this.f4096f) {
            Intent intent = new Intent();
            intent.setClass(this, MainMode.class);
            startActivity(intent);
            finish();
        } else {
            this.f4094d = false;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void run() {
        Cursor query;
        int i;
        Message obtainMessage;
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2;
        try {
            File file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Skins");
            if (file.mkdirs()) {
                fileOutputStream2 = new FileOutputStream(new File(file, "ReadMe.txt"));
                try {
                    fileOutputStream2.write("主题文件请放入此文件夹中".getBytes());
                } catch (Exception e) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    this.f4100j = new C1213is(this, "data", this);
                    this.f4101k = this.f4100j.getWritableDatabase();
                    query = this.f4101k.query("jp_data", null, null, null, null, null, null);
                    this.f4108r = "";
                    m3587a(this.f4101k, false);
                    JPApplication.m3523f();
                    JPApplication.m3525h();
                    this.f4108r = "载入界面资源...";
                    this.f4107q = 99;
                    obtainMessage = this.f4092b.obtainMessage();
                    obtainMessage.what = 1;
                    this.f4092b.sendMessage(obtainMessage);
                    this.f4106p = "载入完成.";
                    this.f4107q = 100;
                } catch (Throwable th2) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
            }
        } catch (Exception e4) {
            this.f4100j = new C1213is(this, "data", this);
            this.f4101k = this.f4100j.getWritableDatabase();
            query = this.f4101k.query("jp_data", null, null, null, null, null, null);
            this.f4108r = "";
            m3587a(this.f4101k, false);
            JPApplication.m3523f();
            JPApplication.m3525h();
            this.f4108r = "载入界面资源...";
            this.f4107q = 99;
            obtainMessage = this.f4092b.obtainMessage();
            obtainMessage.what = 1;
            this.f4092b.sendMessage(obtainMessage);
            this.f4106p = "载入完成.";
            this.f4107q = 100;
        }
        this.f4100j = new C1213is(this, "data", this);
        this.f4101k = this.f4100j.getWritableDatabase();
        try {
            query = this.f4101k.query("jp_data", null, null, null, null, null, null);
            if (query != null && query.getCount() == 0) {
                this.f4108r = "";
                m3587a(this.f4101k, false);
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            System.exit(0);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Throwable th4) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.f4091a == 1) {
            this.f4108r = "";
            if (this.f4101k == null) {
                Log.e("ERR", "sdb==null+isUpdate");
            }
            m3587a(this.f4101k, false);
        } else if (this.f4091a == 2) {
            m3587a(this.f4101k, true);
        }
        JPApplication.m3523f();
        for (i = 25; i <= 115; i++) {
            JPApplication.m3521b(i);
            this.f4108r = "载入声音资源..." + (i - 25) + "/90";
            this.f4107q = ((i - 25) * 100) / 90;
            Message obtainMessage2 = this.f4092b.obtainMessage();
            obtainMessage2.what = 0;
            this.f4092b.sendMessage(obtainMessage2);
        }
        JPApplication.m3525h();
        this.f4108r = "载入界面资源...";
        this.f4107q = 99;
        obtainMessage = this.f4092b.obtainMessage();
        obtainMessage.what = 1;
        this.f4092b.sendMessage(obtainMessage);
        this.f4106p = "载入完成.";
        this.f4107q = 100;
    }
}
