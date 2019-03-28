package ly.pp.addsongs;

import android.widget.Toast;

/* renamed from: ly.pp.addsongs.jh */
final class C1229jh implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1227jf f5706a;
    /* renamed from: b */
    private final /* synthetic */ PianoPlay f5707b;

    C1229jh(C1227jf c1227jf, PianoPlay pianoPlay) {
        this.f5706a = c1227jf;
        this.f5707b = pianoPlay;
    }

    /* renamed from: run */
    public final void run() {
        Toast.makeText(this.f5707b, "您已掉线,请检查您的网络再重新登录！", Toast.LENGTH_SHORT).show();
        this.f5707b.f3995a = true;
        this.f5707b.finish();
    }
}
