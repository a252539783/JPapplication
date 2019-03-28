package ly.pp.addsongs;

import android.os.Message;
import android.view.View;

/* renamed from: ly.pp.addsongs.jp */
final class C1237jp implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1227jf f5726a;
    /* renamed from: b */
    private final /* synthetic */ Message f5727b;
    /* renamed from: c */
    private final /* synthetic */ PianoPlay f5728c;

    C1237jp(C1227jf c1227jf, Message message, PianoPlay pianoPlay) {
        this.f5726a = c1227jf;
        this.f5727b = message;
        this.f5728c = pianoPlay;
    }

    /* renamed from: run */
    public final void run() {
        if (this.f5727b.arg1 == 0) {
            if (this.f5728c.f4591J != null) {
                this.f5728c.f4591J.setVisibility(View.GONE);
            }
            this.f5728c.f4596O.setVisibility(View.VISIBLE);
            this.f5728c.f4597P.setVisibility(View.VISIBLE);
            this.f5728c.f4623n.setVisibility(View.VISIBLE);
            this.f5728c.f4595N.setText(this.f5728c.f4594M);
            this.f5728c.f4605X = false;
            this.f5728c.f4626q.f4710S = true;
            return;
        }
        this.f5728c.f4595N.setText(String.valueOf(this.f5727b.arg1));
    }
}
