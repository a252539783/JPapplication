package ly.pp.addsongs;

import android.content.Intent;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.hi */
final class C1176hi implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5552a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5553b;

    C1176hi(C1164gx c1164gx, OLPlayRoom oLPlayRoom) {
        this.f5552a = c1164gx;
        this.f5553b = oLPlayRoom;
    }

    /* renamed from: run */
    public final void run() {
        Toast.makeText(this.f5553b, "您已掉线,请检查您的网络再重新登录！", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setClass(this.f5553b, OLMainMode.class);
        this.f5553b.startActivity(intent);
        this.f5553b.finish();
    }
}
