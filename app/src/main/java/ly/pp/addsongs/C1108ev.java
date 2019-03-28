package ly.pp.addsongs;

import android.content.Intent;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.ev */
final class C1108ev implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5407a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHall f5408b;

    C1108ev(C1101eo c1101eo, OLPlayHall oLPlayHall) {
        this.f5407a = c1101eo;
        this.f5408b = oLPlayHall;
    }

    /* renamed from: run */
    public final void run() {
        Toast.makeText(this.f5408b, "您已掉线,请检查您的网络再重新登录！", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setClass(this.f5408b, OLMainMode.class);
        this.f5408b.startActivity(intent);
        this.f5408b.finish();
    }
}
