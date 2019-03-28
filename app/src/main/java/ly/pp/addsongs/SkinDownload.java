package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.zip.ZipException;



/* renamed from: ly.pp.addsongs.SkinDownload */
public class SkinDownload extends Activity implements Callback, OnClickListener {
    /* renamed from: a */
    public JPApplication f5005a;
    /* renamed from: b */
    public C0978a f5006b;
    /* renamed from: c */
    private Handler f5007c;
    /* renamed from: d */
    public C1253ke f5008d;
    /* renamed from: e */
    public LayoutInflater f5009e;
    /* renamed from: f */
    public GridView f5010f;
    /* renamed from: g */
    private ProgressBar f5011g;
    /* renamed from: h */
    private TextView f5012h;
    /* renamed from: i */
    private int f5013i;
    /* renamed from: j */
    public int f5014j = 0;
    /* renamed from: k */
    private InputStream f5015k;
    /* renamed from: l */
    private URLConnection f5016l;
    /* renamed from: m */
    private OutputStream f5017m;
    /* renamed from: n */
    private LinearLayout f5018n;
    /* renamed from: o */
    private int f5019o = 0;
    /* renamed from: p */
    public ArrayList f5020p = new ArrayList();

    /* renamed from: a */
    static /* synthetic */ void m3895a(SkinDownload skinDownload, String str, String str2) {
        Message message = new Message();
        try {
            skinDownload.f5016l = new URL(str).openConnection();
            if (skinDownload.f5016l.getReadTimeout() == 5) {
                Log.i("---------->", "当前网络有问题");
            }
            skinDownload.f5015k = skinDownload.f5016l.getInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Skins");
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Skins/" + str2 + ".ps");
        if (file.exists()) {
            Bundle bundle = new Bundle();
            bundle.putString("name", str2);
            message.setData(bundle);
            message.what = 4;
            skinDownload.f5007c.sendMessage(message);
            return;
        }
        Message message2;
        try {
            skinDownload.f5017m = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            skinDownload.f5013i = skinDownload.f5016l.getContentLength();
            message.what = 0;
            if (skinDownload.f5007c != null) {
                skinDownload.f5007c.sendMessage(message);
            }
            while (true) {
                int read = skinDownload.f5015k.read(bArr);
                if (read <= 0) {
                        break;
                } else {
                    skinDownload.f5017m.write(bArr, 0, read);
                    skinDownload.f5014j = read + skinDownload.f5014j;
                    Log.i("-------->", new StringBuilder(String.valueOf(skinDownload.f5014j)).toString());
                    message = new Message();
                    message.what = 1;
                    if (skinDownload.f5007c != null) {
                        skinDownload.f5007c.sendMessage(message);
                    }
                }
            }
            skinDownload.f5017m.close();
            skinDownload.f5015k.close();
            message2 = new Message();
            message2.what = 2;
            if (skinDownload.f5007c != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("name", str2);
                message2.setData(bundle2);
                skinDownload.f5007c.sendMessage(message2);
            }
            skinDownload.f5020p.add(str2);
        } catch (Exception e3) {
            e3.printStackTrace();
            message2 = new Message();
            message2.what = 3;
            skinDownload.f5007c.sendMessage(message2);
            try {
                skinDownload.f5017m.close();
                skinDownload.f5015k.close();
            } catch (IOException e22) {
                e22.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                skinDownload.f5017m.close();
                skinDownload.f5015k.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo2991a() {
        LinkedList a = C1342p.m4157a(Environment.getExternalStorageDirectory() + "/JustPiano/Skins");
        if (a != null) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                String name = ((File) a.get(i)).getName();
                this.f5020p.add(name.substring(0, name.lastIndexOf(".")));
            }
        }
    }

    /* renamed from: a */
    public final void mo2992a(int i, String str, String str2, int i2, String str3) {
        C1302m c1302m = new C1302m(this);
        String str4 = "使用";
        c1302m.mo3539b("提示");
        if (i == 0) {
            c1302m.mo3535a("名称:" + str + "\n作者:" + str3 + "\n大小:" + i2 + "KB\n您要下载并使用吗?");
            str4 = "下载";
        } else if (i == 1) {
            c1302m.mo3535a("[" + str + "]主题已下载，是否使用?");
            str4 = "使用";
        } else if (i == 2) {
            c1302m.mo3535a("您要还原默认的皮肤吗?");
            str4 = "使用";
        }
        c1302m.mo3536a(str4, new C1294ls(this, i, str2, str));
        c1302m.mo3540b("取消", new C1297lv(this));
        c1302m.mo3541c();
    }

    /* renamed from: a */
    public final void mo2993a(String str) {
        Message message = new Message();
        message.what = 5;
        this.f5007c.sendMessage(message);
        Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        edit.putString("skin_list", Environment.getExternalStorageDirectory() + "/JustPiano/Skins/" + str);
            File dir = getDir("Skin", 0);
            if (dir.isDirectory()) {
                File[] listFiles = dir.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            }
            C1340nk.m4155a(new File(Environment.getExternalStorageDirectory() + "/JustPiano/Skins/" + str), dir.toString());
        edit.commit();
        Message message2 = new Message();
        message2.what = 6;
        this.f5007c.sendMessage(message2);
    }

    public boolean handleMessage(Message message) {
        if (!Thread.currentThread().isInterrupted()) {
            switch (message.what) {
                case 0:
                    this.f5018n.setVisibility(View.VISIBLE);
                    this.f5011g.setMax(this.f5013i);
                    Log.i("文件长度----------->", new StringBuilder(String.valueOf(this.f5011g.getMax())).toString());
                    break;
                case 1:
                    this.f5011g.setProgress(this.f5014j);
                    this.f5012h.setText(new StringBuilder(String.valueOf((this.f5014j * 100) / this.f5013i)).append("%").toString());
                    break;
                case 2:
                    this.f5018n.setVisibility(View.GONE);
                    this.f5012h.setVisibility(View.GONE);
                    mo2992a(1, message.getData().getString("name"), "", 0, "");
                    break;
                case 3:
                    this.f5018n.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(), "很抱歉,连接出错!", Toast.LENGTH_LONG).show();
                    break;
                case 4:
                    this.f5018n.setVisibility(View.GONE);
                    this.f5011g.setProgress(100);
                    this.f5012h.setText("100%");
                    Toast.makeText(getApplicationContext(), "已存在该皮肤!", Toast.LENGTH_LONG).show();
                    mo2992a(1, message.getData().getString("name"), "", 0, "");
                    break;
                case 5:
                    this.f5018n.setVisibility(View.GONE);
                    this.f5008d.show();
                    break;
                case 6:
                    this.f5018n.setVisibility(View.GONE);
                    this.f5008d.dismiss();
                    Toast.makeText(getApplicationContext(), "皮肤设置成功!", Toast.LENGTH_SHORT).show();
                    this.f5005a.mo2707a((Context) this, "ground", (RelativeLayout) findViewById(R.id.layout));
                    break;
            }
        }
        return false;
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.f5008d.isShowing()) {
            this.f5008d.dismiss();
        }
        if (this.f5019o == 1) {
            Intent intent = new Intent();
            intent.setClass(this, MainMode.class);
            startActivity(intent);
        }
        finish();
    }

    public void onClick(View view) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5005a = (JPApplication) getApplication();
        setContentView(R.layout.skin_list);
        this.f5005a.mo2707a((Context) this, "ground", (RelativeLayout) findViewById(R.id.layout));
        this.f5019o = getIntent().getFlags();
        this.f5009e = getLayoutInflater();
        this.f5008d = new C1253ke(this);
        this.f5007c = new Handler(this);
        this.f5006b = new C0978a(this.f5007c, 2);
        this.f5006b.mo3028a("");
        this.f5010f = (GridView) findViewById(R.id.skin_grid_list);
        this.f5011g = (ProgressBar) findViewById(R.id.downloadProgress);
        this.f5012h = (TextView) findViewById(R.id.downloadText);
        this.f5018n = (LinearLayout) findViewById(R.id.window);
        new C1298lw(this).execute("", "", "");
    }

    protected void onDestroy() {
        if (this.f5006b != null) {
            //this.f5006b.mo3026a();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();

    }

    public void onResume() {
        super.onResume();

    }
}
