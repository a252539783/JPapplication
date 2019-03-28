package ly.pp.addsongs;

import android.os.Looper;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.k */
final class C1248k extends Thread {
    /* renamed from: a */
    final /* synthetic */ C1221j f5772a;

    C1248k(C1221j c1221j) {
        this.f5772a = c1221j;
    }

    /* renamed from: run */
    public final void run() {
        Looper.prepare();
        Toast.makeText(this.f5772a.f5691c, "很抱歉,极品钢琴出现异常,即将退出.", Toast.LENGTH_LONG).show();
        Looper.loop();
    }
}
