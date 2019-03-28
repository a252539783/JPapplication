package ly.pp.addsongs;

import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.hz */
final class C1193hz implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1191hx f5595a;
    /* renamed from: b */
    private final /* synthetic */ String f5596b;

    C1193hz(C1191hx c1191hx, String str) {
        this.f5595a = c1191hx;
        this.f5596b = str;
    }

    public final void onClick(View view) {
        this.f5595a.f5590a.mo2857a((byte) 15, this.f5595a.f5590a.f4529m, this.f5595a.f5590a.f4477B, this.f5596b);
        Message obtainMessage = this.f5595a.f5590a.f4482G.obtainMessage();
        obtainMessage.what = 12;
        this.f5595a.f5590a.f4482G.handleMessage(obtainMessage);
    }
}
