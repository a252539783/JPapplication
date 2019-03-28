package ly.pp.addsongs;

import android.os.Message;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.ex */
final class C1110ex implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5412a;
    /* renamed from: b */
    private final /* synthetic */ Message f5413b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHall f5414c;

    C1110ex(C1101eo c1101eo, Message message, OLPlayHall oLPlayHall) {
        this.f5412a = c1101eo;
        this.f5413b = message;
        this.f5414c = oLPlayHall;
    }

    /* renamed from: run */
    public final void run() {
        Toast.makeText(this.f5414c, this.f5413b.getData().getString("result"), Toast.LENGTH_SHORT).show();
    }
}
