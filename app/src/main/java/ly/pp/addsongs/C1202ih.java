package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

/* renamed from: ly.pp.addsongs.ih */
final class C1202ih implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1196ib f5643a;
    /* renamed from: b */
    private final /* synthetic */ PopupWindow f5644b;
    /* renamed from: c */
    private final /* synthetic */ C1245jx f5645c;
    /* renamed from: d */
    private final /* synthetic */ OLPlayRoom f5646d;

    C1202ih(C1196ib c1196ib, PopupWindow popupWindow, C1245jx c1245jx, OLPlayRoom oLPlayRoom) {
        this.f5643a = c1196ib;
        this.f5644b = popupWindow;
        this.f5645c = c1245jx;
        this.f5646d = oLPlayRoom;
    }

    public final void onClick(View view) {
        if (this.f5644b != null && this.f5644b.isShowing()) {
            this.f5644b.dismiss();
            byte[] bArr = new byte[]{this.f5645c.mo3394e(), (byte) 1};
            if (this.f5646d.f4533q.equals("H") && this.f5643a.f5614f != null) {
                this.f5643a.f5614f.mo2676a((byte) 42, this.f5643a.f5611c, this.f5646d.f4477B, this.f5645c.mo3385a(), bArr);
            }
        }
    }
}
