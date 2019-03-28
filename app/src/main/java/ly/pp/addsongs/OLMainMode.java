package ly.pp.addsongs;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/* renamed from: ly.pp.addsongs.OLMainMode */
public class OLMainMode extends BaseActivity implements OnClickListener {
    /* renamed from: h */
    boolean f4282h = false;
    /* renamed from: i */
    protected Context f4283i;
    /* renamed from: j */
    C1066dg f4284j = new C1066dg(this);
    /* renamed from: k */
    private Button f4285k;
    /* renamed from: l */
    private Button f4286l;
    /* renamed from: m */
    private Button f4287m;
    /* renamed from: n */
    private Button f4288n;
    /* renamed from: o */
    private Button f4289o;
    /* renamed from: p */
    private Button f4290p;
    /* renamed from: q */
    private Button f4291q;
    /* renamed from: r */
    public JPApplication f4292r;
    /* renamed from: s */
    public String f4293s;

    /* renamed from: a */
    final void mo2803a(String str, String str2, int i) {
        if (str != null && str2 != null && !str.equals("") && !str2.equals("")) {
            C1302m c1302m = new C1302m(this);
            c1302m.mo3539b(str);
            c1302m.mo3535a(str2);
            if (i <= 0) {
                c1302m.mo3540b("确定", new C1058cz(this));
            } else {
                c1302m.mo3536a(i == 1 ? "获取" : "升级", new C1060da(this));
                c1302m.mo3540b("取消", new C1061db(this));
            }
            c1302m.mo3541c();
        }
    }

    public void onBackPressed() {
        if (this.f3997c != null) {
            this.f3997c.dismiss();
        }
        Intent intent = new Intent();
        intent.setClass(this, MainMode.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        TextView textView;
        switch (view.getId()) {
            case R.id.ol_ance_b:
                this.f4293s = "score";
                new C1064de(this).execute(this.f4292r.mo2695K(), "score", this.f4292r.mo2701P());
                return;
            case R.id.ol_songs_b:
                intent.setClass(this, OLSongsPage.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_playhall_b:
                if (this.f4292r.mo2701P().equals("")) {
                    Toast.makeText(this.f4283i, "您已经掉线请返回重新登陆！", Toast.LENGTH_SHORT).show();
                    return;
                }
                int i;
                C1213is c1213is = new C1213is(this, "data", null);
                SQLiteDatabase writableDatabase = c1213is.getWritableDatabase();
                Cursor query = writableDatabase.query("jp_data", new String[]{"online"}, "online=1", null, null, null, null);
                int count = query.getCount();
                if (query != null) {
                    query.close();
                    c1213is.close();
                    writableDatabase.close();
                }
                String str = "";
                if (count < 4927) {
                    str = "您载入的曲谱数量为:" + count + "。本版本曲谱数量为:4927。曲库不完整。无法进行在线对战。请在设置中的应用程序选项找到极品钢琴，清除程序数据，再重新打开游戏。或者您也可以卸载后重新安装本程序。载入时请勿中断或后台本软件！";
                    i = 1;
                } else {
                    if (this.f4292r.mo2698N()) {
                        this.f3997c.show();
                        try {
                            this.f4292r.unbindService(this.f4292r.mo2696L());
                        } catch (Exception e) {
                            e.toString();
                        }
                        this.f4292r.mo2711a(this.f4292r.bindService(new Intent(this, ConnectionService.class), this.f4292r.mo2696L(), Context.BIND_AUTO_CREATE));
                    } else {
                        this.f3997c.show();
                        this.f4292r.mo2711a(this.f4292r.bindService(new Intent(this, ConnectionService.class), this.f4292r.mo2696L(), Context.BIND_AUTO_CREATE));
                    }
                    i = 0;
                }
                C1302m c1302m = new C1302m(this.f4283i);
                c1302m.mo3539b("检查曲库");
                c1302m.mo3535a(str);
                c1302m.mo3536a("确定", new C1053cu(this));
                if (i != 0) {
                    c1302m.mo3541c();
                    return;
                }
                return;
            case R.id.ol_top_b:
                intent.setClass(this, OLTopUser.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_users_b:
                intent.setClass(this, OLUsersPage.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_bindmail_b:
                View inflate = getLayoutInflater().inflate(R.layout.ol_findpass_dialog, (ViewGroup) findViewById(R.id.dialog));
                textView = (TextView) inflate.findViewById(R.id.text_1);
                ((TextView) inflate.findViewById(R.id.title_1)).setText("邮箱地址:");
                TextView textView2 = (TextView) inflate.findViewById(R.id.text_2);
                ((TextView) inflate.findViewById(R.id.title_2)).setText("确认邮箱:");
                TextView textView3 = (TextView) inflate.findViewById(R.id.text_3);
                ((TextView) inflate.findViewById(R.id.title_3)).setText("游戏密码:");
                TextView textView4 = (TextView) inflate.findViewById(R.id.dialog_msg);
                textView4.setTextColor(-1);
                textView4.setText("提示:\n1.绑定邮箱可以在您忘记密码的情况下找回密码。\n2.请输入正确的邮箱和当前游戏账号的密码!\n3.邮箱绑定后将无法更改!");
                new C1302m(this).mo3539b("绑定邮箱").mo3534a(inflate).mo3536a("确定", new C1056cx(this, textView3, textView, textView2)).mo3540b("取消", new C1057cy(this)).mo3541c();
                return;
            case R.id.ol_zhuanyi_b:
                View inflate2 = getLayoutInflater().inflate(R.layout.ol_findpass_dialog, (ViewGroup) findViewById(R.id.dialog));
                ((TextView) inflate2.findViewById(R.id.text_1)).setVisibility(View.GONE);
                textView = (TextView) inflate2.findViewById(R.id.title_1);
                textView.setText("邮箱地址:");
                textView.setVisibility(View.GONE);
                ((TextView) inflate2.findViewById(R.id.text_2)).setVisibility(View.GONE);
                textView = (TextView) inflate2.findViewById(R.id.title_2);
                textView.setText("确认邮箱:");
                textView.setVisibility(View.GONE);
                ((TextView) inflate2.findViewById(R.id.text_3)).setVisibility(View.GONE);
                textView = (TextView) inflate2.findViewById(R.id.title_3);
                textView.setText("游戏密码:");
                textView.setVisibility(View.GONE);
                textView = (TextView) inflate2.findViewById(R.id.dialog_msg);
                textView.setTextColor(-1);
                textView.setText("提示:\n1.将账号转移到极品钢琴2的服务器上。\n2.请确定您已绑定邮箱!\n3.转移只会保存您的邮箱和昵称,其他信息暂时不会转移!\n4.昵称长度超过6个字暂时无法转移,后期可能开放.\n5.该功能可能会在极品钢琴2对战版发布后失效.");
                new C1302m(this).mo3539b("账号转移").mo3534a(inflate2).mo3536a("转移账号", new C1054cv(this)).mo3540b("取消", new C1055cw(this)).mo3541c();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3996b = 0;
        this.f4292r = (JPApplication) getApplication();
        this.f3997c = new C1253ke(this, this.f4292r);
        this.f4292r.mo2728f(1);
        this.f4283i = this;
        setContentView(R.layout.olmainmode);
        this.f4292r.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        JPApplication jPApplication = this.f4292r;
        JPApplication jPApplication2 = this.f4292r;
        jPApplication.mo2718c(0);
        this.f4285k = (Button) findViewById(R.id.ol_top_b);
        this.f4285k.setOnClickListener(this);
        this.f4286l = (Button) findViewById(R.id.ol_users_b);
        this.f4286l.setOnClickListener(this);
        this.f4288n = (Button) findViewById(R.id.ol_playhall_b);
        this.f4288n.setOnClickListener(this);
        this.f4287m = (Button) findViewById(R.id.ol_songs_b);
        this.f4287m.setOnClickListener(this);
        this.f4289o = (Button) findViewById(R.id.ol_ance_b);
        this.f4289o.setOnClickListener(this);
        this.f4289o.setVisibility(View.VISIBLE);
        this.f4290p = (Button) findViewById(R.id.ol_bindmail_b);
        this.f4290p.setOnClickListener(this);
        this.f4291q = (Button) findViewById(R.id.ol_zhuanyi_b);
        this.f4291q.setOnClickListener(this);
        try {
            if (this.f4292r.mo2697M() != null) {
                this.f4292r.mo2697M().mo2675a();
            }
            if (this.f4292r.mo2698N()) {
                this.f4292r.unbindService(this.f4292r.mo2696L());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C1268kt.m4107a();
        C1268kt.m4110b(this);
        if (this.f4292r.f4073g != null && this.f4292r.f4074h != null && !this.f4292r.f4073g.equals("") && !this.f4292r.f4074h.equals("")) {
            C1302m c1302m = new C1302m(this);
            c1302m.mo3539b(this.f4292r.f4073g);
            c1302m.mo3535a(this.f4292r.f4074h);
            c1302m.mo3536a("确定", new C1052ct(this));
            c1302m.mo3541c();
        }
    }

    protected void onDestroy() {
        C1268kt.m4107a();
        C1268kt.m4108a(this);
        super.onDestroy();
    }

    public void onPause() {

        super.onPause();
    }

    protected void onResume() {

        super.onResume();
    }
}
