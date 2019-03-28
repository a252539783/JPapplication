package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

/* renamed from: ly.pp.addsongs.ig */
final class C1201ig implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1196ib f5639a;
    /* renamed from: b */
    private final /* synthetic */ PopupWindow f5640b;
    /* renamed from: c */
    private final /* synthetic */ C1245jx f5641c;
    /* renamed from: d */
    private final /* synthetic */ OLPlayRoom f5642d;

    C1201ig(C1196ib c1196ib, PopupWindow popupWindow, C1245jx c1245jx, OLPlayRoom oLPlayRoom) {
        this.f5639a = c1196ib;
        this.f5640b = popupWindow;
        this.f5641c = c1245jx;
        this.f5642d = oLPlayRoom;
    }

    public final void onClick(View view) {
        if (this.f5640b != null && this.f5640b.isShowing()) {
            this.f5640b.dismiss();
            byte[] bArr = new byte[]{this.f5641c.mo3394e(), (byte) 2};
            if (this.f5642d.f4533q.equals("H") && this.f5639a.f5614f != null) {
                this.f5639a.f5614f.mo2676a((byte) 42, this.f5639a.f5611c, this.f5642d.f4477B, String.valueOf(this.f5641c.mo3394e()), bArr);
            }
        }
    }
}
