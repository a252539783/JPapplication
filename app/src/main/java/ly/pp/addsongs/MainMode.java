package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;




/* renamed from: ly.pp.addsongs.MainMode */
public class MainMode extends Activity implements OnClickListener {
    /* renamed from: a */
    Context f4201a;
    /* renamed from: b */
    TextView f4202b;
    /* renamed from: c */
    TextView f4203c;
    /* renamed from: d */
    TextView f4204d;
    /* renamed from: e */
    TextView f4205e;
    /* renamed from: f */
    TextView f4206f;
    /* renamed from: g */
    TextView f4207g;
    /* renamed from: h */
    TextView f4208h;
    /* renamed from: i */
    TextView f4209i;
    /* renamed from: j */
    TextView f4210j;
    /* renamed from: k */
    TextView f4211k;
    /* renamed from: l */
    TextView f4212l;
    /* renamed from: m */
    final int f4213m = 0;
    /* renamed from: n */
    final int f4214n = 1;
    /* renamed from: o */
    final int f4215o = 2;
    /* renamed from: p */
    final int f4216p = 3;
    /* renamed from: q */
    final int f4217q = 5;
    /* renamed from: r */
    Intent f4218r = new Intent();
    /* renamed from: s */
    boolean f4219s;
    /* renamed from: t */
    JPApplication f4220t;
    /* renamed from: u */
    protected String f4221u = "";
    /* renamed from: v */
    /* renamed from: w */
    private C1253ke f4223w;

    public void onBackPressed() {
        this.f4223w.dismiss();
        if (this.f4219s) {
            JPApplication.m3522e();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
            System.exit(0);
        } else {
            Toast.makeText(this, "再按一次返回键将退出极品钢琴.", Toast.LENGTH_SHORT).show();
        }
        this.f4219s = true;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.local_game:
                intent.setClass(this.f4201a, PlayModeSelect.class);
                this.f4201a.startActivity(intent);
                finish();
                return;
            case R.id.online_game:
                intent.setClass(this.f4201a, Login.class);
                intent.putExtra("result", "");
                this.f4201a.startActivity(intent);
                finish();
                return;
            case R.id.sounds:
                intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                intent.setClass(this, SoundDownload.class);
                startActivity(intent);
                finish();
                return;
            case R.id.skins:
                intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                intent.setClass(this, SkinDownload.class);
                startActivity(intent);
                finish();
                return;
            case R.id.about_game:
                intent.setClass(this.f4201a, About.class);
                startActivityForResult(intent, 0);
                return;
            case R.id.listen:
                intent = new Intent();
                intent.setClass(this.f4201a, RecordFiles.class);
                startActivity(intent);
                finish();
                return;
            case R.id.piano_help:
                intent.setClass(this.f4201a, PianoHelper.class);
                this.f4201a.startActivity(intent);
                finish();
                return;
            case R.id.more_game:
                String str;
                try {
                    str = "android.intent.action.VIEW";
                    Intent intent2 = new Intent(str, Uri.parse(new StringBuilder("market://details?id=") + getPackageName()));
                    intent2.setPackage("com.android.vending");
                    startActivity(intent2);
                    return;
                } catch (Exception e) {
                    try {
                        str = "android.intent.action.VIEW";
                        startActivity(new Intent(str, Uri.parse(new StringBuilder("market://details?id=") + getPackageName())));
                        return;
                    } catch (Exception e2) {
                        Toast.makeText(this.f4201a, "您的设备未安装市场类应用，谢谢您的支持！", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
            case R.id.settings:
                intent.setClass(this.f4201a, SettingsMode.class);
                this.f4201a.startActivity(intent);
                finish();
                return;
            default:
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4220t = (JPApplication) getApplication();
        if (this.f4220t.f4082q) {
            this.f4220t.f4082q = false;
        }
        this.f4220t.mo2728f(0);
        this.f4219s = false;
        setContentView(R.layout.main_mode);
        this.f4220t.mo2706a(this, "ground", (LinearLayout) findViewById(R.id.layout));
        this.f4202b = findViewById(R.id.local_game);
        this.f4202b.setOnClickListener(this);
        this.f4203c = findViewById(R.id.online_game);
        this.f4203c.setOnClickListener(this);
        this.f4204d = findViewById(R.id.settings);
        this.f4204d.setOnClickListener(this);
        this.f4210j = findViewById(R.id.skins);
        this.f4210j.setOnClickListener(this);
        this.f4212l = findViewById(R.id.sounds);
        this.f4212l.setOnClickListener(this);
        this.f4205e = findViewById(R.id.about_game);
        this.f4205e.setOnClickListener(this);
        this.f4206f = findViewById(R.id.more_game);
        this.f4206f.setOnClickListener(this);
        this.f4208h = findViewById(R.id.piano_help);
        this.f4208h.setOnClickListener(this);
        this.f4211k = (Button) findViewById(R.id.listen);
        this.f4211k.setOnClickListener(this);
        this.f4201a = this;
        this.f4223w = new C1253ke(this);
        if (this.f4220t.f4071e != null && this.f4220t.f4072f != null && !this.f4220t.f4071e.equals("") && !this.f4220t.f4072f.equals("")) {
            C1302m c1302m = new C1302m(this);
            c1302m.mo3539b(this.f4220t.f4071e);
            c1302m.mo3535a(this.f4220t.f4072f);
            c1302m.mo3536a("确定", new C1006ba(this));
            c1302m.mo3541c();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();

    }

    public void onResume() {
        super.onResume();

    }
}
