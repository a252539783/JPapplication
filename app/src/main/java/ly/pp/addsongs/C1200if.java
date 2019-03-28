package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

/* renamed from: ly.pp.addsongs.if */
final class C1200if implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1196ib f5635a;
    /* renamed from: b */
    private final /* synthetic */ PopupWindow f5636b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayRoom f5637c;
    /* renamed from: d */
    private final /* synthetic */ C1245jx f5638d;

    C1200if(C1196ib c1196ib, PopupWindow popupWindow, OLPlayRoom oLPlayRoom, C1245jx c1245jx) {
        this.f5635a = c1196ib;
        this.f5636b = popupWindow;
        this.f5637c = oLPlayRoom;
        this.f5638d = c1245jx;
    }

    public final void onClick(View view) {
        if (this.f5636b != null && this.f5636b.isShowing()) {
            this.f5636b.dismiss();
            Bundle bundle = new Bundle();
            Message obtainMessage = this.f5637c.f4482G.obtainMessage();
            obtainMessage.what = 12;
            obtainMessage.setData(bundle);
            bundle.putString("U", this.f5638d.mo3385a());
            this.f5637c.f4482G.handleMessage(obtainMessage);
        }
    }
}
