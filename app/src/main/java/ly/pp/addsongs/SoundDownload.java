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


/* renamed from: ly.pp.addsongs.SoundDownload */
public class SoundDownload extends Activity implements Callback, OnClickListener {
    /* renamed from: a */
    public JPApplication f5030a;
    /* renamed from: b */
    public C0978a f5031b;
    /* renamed from: c */
    private Handler f5032c;
    /* renamed from: d */
    public C1253ke f5033d;
    /* renamed from: e */
    public LayoutInflater f5034e;
    /* renamed from: f */
    public GridView f5035f;
    /* renamed from: g */
    private ProgressBar f5036g;
    /* renamed from: h */
    private TextView f5037h;
    /* renamed from: i */
    private int f5038i;
    /* renamed from: j */
    public int f5039j = 0;
    /* renamed from: k */
    private InputStream f5040k;
    /* renamed from: l */
    private URLConnection f5041l;
    /* renamed from: m */
    private OutputStream f5042m;
    /* renamed from: n */
    private LinearLayout f5043n;
    /* renamed from: o */
    private int f5044o = 0;
    /* renamed from: p */
    public ArrayList f5045p = new ArrayList();

    /* renamed from: a */
    static /* synthetic */ void m3911a(SoundDownload soundDownload, String str, String str2) {
        Message message = new Message();
        try {
            soundDownload.f5041l = new URL(str).openConnection();
            if (soundDownload.f5041l.getReadTimeout() == 5) {
                Log.i("---------->", "当前网络有问题");
            }
            soundDownload.f5040k = soundDownload.f5041l.getInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Sounds");
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Sounds/" + str2 + ".ss");
        if (file.exists()) {
            Bundle bundle = new Bundle();
            bundle.putString("name", str2);
            message.setData(bundle);
            message.what = 4;
            soundDownload.f5032c.sendMessage(message);
            return;
        }
        Message message2;
        try {
            soundDownload.f5042m = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            soundDownload.f5038i = soundDownload.f5041l.getContentLength();
            message.what = 0;
            if (soundDownload.f5032c != null) {
                soundDownload.f5032c.sendMessage(message);
            }
            while (true) {
                int read = soundDownload.f5040k.read(bArr);
                if (read <= 0) {
                        break;
                } else {
                    soundDownload.f5042m.write(bArr, 0, read);
                    soundDownload.f5039j = read + soundDownload.f5039j;
                    Log.i("-------->", new StringBuilder(String.valueOf(soundDownload.f5039j)).toString());
                    message = new Message();
                    message.what = 1;
                    if (soundDownload.f5032c != null) {
                        soundDownload.f5032c.sendMessage(message);
                    }
                }
            }
            soundDownload.f5042m.close();
            soundDownload.f5040k.close();
            message2 = new Message();
            message2.what = 2;
            if (soundDownload.f5032c != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("name", str2);
                message2.setData(bundle2);
                soundDownload.f5032c.sendMessage(message2);
            }
            soundDownload.f5045p.add(str2);
        } catch (Exception e3) {
            e3.printStackTrace();
            message2 = new Message();
            message2.what = 3;
            soundDownload.f5032c.sendMessage(message2);
            try {
                soundDownload.f5042m.close();
                soundDownload.f5040k.close();
            } catch (IOException e22) {
                e22.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                soundDownload.f5042m.close();
                soundDownload.f5040k.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo3004a() {
        LinkedList b = C1342p.m4158b(Environment.getExternalStorageDirectory() + "/JustPiano/Sounds");
        if (b != null) {
            int size = b.size();
            for (int i = 0; i < size; i++) {
                String name = ((File) b.get(i)).getName();
                this.f5045p.add(name.substring(0, name.lastIndexOf(".")));
            }
        }
    }

    /* renamed from: a */
    public final void mo3005a(int i, String str, String str2, int i2, String str3) {
        C1302m c1302m = new C1302m(this);
        String str4 = "使用";
        c1302m.mo3539b("提示");
        if (i == 0) {
            c1302m.mo3535a("名称:" + str + "\n作者:" + str3 + "\n大小:" + i2 + "KB\n您要下载并使用吗?");
            str4 = "下载";
        } else if (i == 1) {
            c1302m.mo3535a("[" + str + "]音源已下载，是否使用?");
            str4 = "使用";
        } else if (i == 2) {
            c1302m.mo3535a("您要还原极品钢琴的默认音源吗?");
            str4 = "确定";
        }
        c1302m.mo3536a(str4, new C1313mk(this, i, str2, str));
        c1302m.mo3540b("取消", new C1317mo(this));
        c1302m.mo3541c();
    }

    /* renamed from: a */
    public final void mo3006a(String str) {
        Message message = new Message();
        message.what = 5;
        this.f5032c.sendMessage(message);
        Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        edit.putString("sound_list", Environment.getExternalStorageDirectory() + "/JustPiano/Sounds/" + str);
        try {
            int i;
            File file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Sounds/Sound");
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            }
            C1340nk.m4155a(new File(Environment.getExternalStorageDirectory() + "/JustPiano/Sounds/" + str), file.toString());
            JPApplication.m3523f();
            edit.commit();
            for (i = 32; i <= 108; i++) {
                JPApplication.m3521b(i);
            }
            JPApplication.m3525h();
        } catch (Exception e) {
            e.printStackTrace();
        }
        message = new Message();
        message.what = 6;
        this.f5032c.sendMessage(message);
    }

    public boolean handleMessage(Message message) {
        if (!Thread.currentThread().isInterrupted()) {
            switch (message.what) {
                case 0:
                    this.f5043n.setVisibility(View.VISIBLE);
                    this.f5036g.setMax(this.f5038i);
                    Log.i("文件长度------->", new StringBuilder(String.valueOf(this.f5036g.getMax())).toString());
                    break;
                case 1:
                    this.f5036g.setProgress(this.f5039j);
                    this.f5037h.setText(new StringBuilder(String.valueOf((this.f5039j * 100) / this.f5038i)).append("%").toString());
                    break;
                case 2:
                    this.f5043n.setVisibility(View.GONE);
                    this.f5037h.setVisibility(View.GONE);
                    mo3005a(1, message.getData().getString("name"), "", 0, "");
                    break;
                case 3:
                    this.f5043n.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(), "很抱歉,连接出错!", Toast.LENGTH_LONG).show();
                    break;
                case 4:
                    this.f5043n.setVisibility(View.GONE);
                    this.f5036g.setProgress(100);
                    this.f5037h.setText("100%");
                    Toast.makeText(getApplicationContext(), "已存在该音源!", Toast.LENGTH_LONG).show();
                    mo3005a(1, message.getData().getString("name"), "", 0, "");
                    break;
                case 5:
                    this.f5043n.setVisibility(View.GONE);
                    this.f5033d.show();
                    Toast.makeText(getApplicationContext(), "正在载入音源,请稍后。。。", Toast.LENGTH_SHORT).show();
                    break;
                case 6:
                    this.f5043n.setVisibility(View.GONE);
                    this.f5033d.dismiss();
                    Toast.makeText(getApplicationContext(), "音源载入成功!", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
        return false;
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.f5033d.isShowing()) {
            this.f5033d.dismiss();
        }
        if (this.f5044o == 1) {
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
        this.f5030a = (JPApplication) getApplication();
        setContentView(R.layout.skin_list);
        this.f5030a.mo2707a((Context) this, "ground", (RelativeLayout) findViewById(R.id.layout));
        this.f5044o = getIntent().getFlags();
        this.f5034e = getLayoutInflater();
        this.f5033d = new C1253ke(this);
        this.f5032c = new Handler(this);
        this.f5031b = new C0978a(this.f5032c, 2);
        this.f5031b.mo3028a("");
        this.f5035f = (GridView) findViewById(R.id.skin_grid_list);
        this.f5036g = (ProgressBar) findViewById(R.id.downloadProgress);
        this.f5037h = (TextView) findViewById(R.id.downloadText);
        this.f5043n = (LinearLayout) findViewById(R.id.window);
        new C1318mp(this).execute("", "", "");
    }

    protected void onDestroy() {
        if (this.f5031b != null) {
            //this.f5031b.mo3026a();
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
