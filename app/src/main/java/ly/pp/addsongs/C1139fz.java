package ly.pp.addsongs;

import android.content.Intent;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.fz */
final class C1139fz implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5470a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHallRoom f5471b;

    C1139fz(C1137fx c1137fx, OLPlayHallRoom oLPlayHallRoom) {
        this.f5470a = c1137fx;
        this.f5471b = oLPlayHallRoom;
    }

    /* renamed from: run */
    public final void run() {
        Toast.makeText(this.f5471b, "您已掉线,请检查您的网络再重新登录！", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setClass(this.f5471b, OLMainMode.class);
        this.f5471b.startActivity(intent);
        this.f5471b.finish();
    }
}
