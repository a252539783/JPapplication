package ly.pp.addsongs;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

/* renamed from: ly.pp.addsongs.BaseActivity */
public class BaseActivity extends Activity {
    /* renamed from: a */
    boolean f3995a = false;
    /* renamed from: b */
    int f3996b = 0;
    /* renamed from: c */
    protected C1253ke f3997c;
    /* renamed from: d */
    String f3998d;
    /* renamed from: e */
    String f3999e;
    /* renamed from: f */
    int f4000f;
    /* renamed from: g */
    public C1113f f4001g = new C1113f(this);

    /* renamed from: a */
    static /* synthetic */ void m3496a(BaseActivity baseActivity) {
        Intent intent = new Intent();
        intent.setClass(baseActivity, OLMainMode.class);
        baseActivity.startActivity(intent);
        baseActivity.finish();
    }

    /* renamed from: a */
    public final void mo2670a() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            this.f3998d = "4.3";
            this.f4000f = 41;
            this.f3999e = "ly.pp.justpiano";
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo2671a(String str, String str2, String str3) {
        C1302m c1302m = new C1302m(this);
        c1302m.mo3539b(str);
        c1302m.mo3535a(str3);
        c1302m.mo3536a(str2, new C1059d(this));
        c1302m.mo3541c();
    }

    /* renamed from: b */
    protected final void mo2672b() {
        String str;
        String str2;
        if (this.f3996b == 0) {
            str = "提示";
            str2 = "非常抱歉,可能由于网络质量不稳定,服务器未能响应.请再试一次.";
        } else {
            str = "离线提示";
            str2 = "非常抱歉,可能由于网络质量不稳定,您目前已经掉线,点击确定回到到联网主界面重新登录.";
        }
        if (this.f3997c != null && this.f3997c.isShowing()) {
            this.f3997c.dismiss();
        }
        C1302m c1302m = new C1302m(this);
        c1302m.mo3539b(str);
        c1302m.mo3535a(str2);
        c1302m.mo3537a();
        c1302m.mo3536a("确定", new C1086e(this));
        try {
            c1302m.mo3541c();
        } catch (Exception e) {
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
    }
}
