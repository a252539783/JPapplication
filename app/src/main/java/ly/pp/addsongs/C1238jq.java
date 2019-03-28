package ly.pp.addsongs;

import android.view.View;

/* renamed from: ly.pp.addsongs.jq */
final class C1238jq implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1227jf f5729a;
    /* renamed from: b */
    private final /* synthetic */ PianoPlay f5730b;

    C1238jq(C1227jf c1227jf, PianoPlay pianoPlay) {
        this.f5729a = c1227jf;
        this.f5730b = pianoPlay;
    }

    /* renamed from: run */
    public final void run() {
        this.f5730b.f4634y.setVisibility(View.VISIBLE);
    }
}
