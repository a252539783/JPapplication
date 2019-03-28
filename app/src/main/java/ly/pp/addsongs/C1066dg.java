package ly.pp.addsongs;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: ly.pp.addsongs.dg */
final class C1066dg extends Handler {
    /* renamed from: a */
    WeakReference f5325a;

    C1066dg(OLMainMode oLMainMode) {
        this.f5325a = new WeakReference(oLMainMode);
    }

    public final void handleMessage(Message message) {
        OLMainMode oLMainMode = (OLMainMode) this.f5325a.get();
        Intent intent = new Intent(oLMainMode, OLPlayHallRoom.class);
        //"handleMessage" + message.what;
        switch (message.what) {
            case 1:
                oLMainMode.f3997c.cancel();
                intent.putExtra("HEAD", 1);
                oLMainMode.startActivity(intent);
                oLMainMode.finish();
                return;
            case 2:
                oLMainMode.f3997c.cancel();
                Looper.prepare();
                oLMainMode.mo2671a("提示", "确定", "连接服务器失败");
                Looper.loop();
                return;
            case 3:
                if (oLMainMode.f3997c != null && oLMainMode.f3997c.isShowing()) {
                    oLMainMode.f3997c.cancel();
                }
                Looper.prepare();
                oLMainMode.mo2671a("提示", "确定", "服务器未响应！");
                Looper.loop();
                return;
            case 4:
                oLMainMode.f3997c.cancel();
                Looper.prepare();
                oLMainMode.mo2671a("提示", "确定", "请重新登录游戏，再进入大厅！");
                Looper.loop();
                return;
            case 5:
                oLMainMode.f3997c.cancel();
                intent.putExtra("HEAD", 5);
                oLMainMode.startActivity(intent);
                oLMainMode.finish();
                return;
            case 6:
                oLMainMode.f3997c.cancel();
                Looper.prepare();
                oLMainMode.mo2671a("提示", "确定", "您的版本过低，请下载最新版本进行游戏.");
                Looper.loop();
                return;
            default:
                return;
        }
    }
}
