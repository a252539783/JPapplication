package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.ii */
final class C1203ii implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1196ib f5647a;
    /* renamed from: b */
    private final /* synthetic */ PopupWindow f5648b;
    /* renamed from: c */
    private final /* synthetic */ C1245jx f5649c;
    /* renamed from: d */
    private final /* synthetic */ OLPlayRoom f5650d;

    C1203ii(C1196ib c1196ib, PopupWindow popupWindow, C1245jx c1245jx, OLPlayRoom oLPlayRoom) {
        this.f5647a = c1196ib;
        this.f5648b = popupWindow;
        this.f5649c = c1245jx;
        this.f5650d = oLPlayRoom;
    }

    public final void onClick(View view) {
        if (this.f5648b != null && this.f5648b.isShowing()) {
            this.f5648b.dismiss();
            byte[] bArr = new byte[]{this.f5649c.mo3394e()};
            if (this.f5650d.f4533q.equals("H") && this.f5647a.f5614f != null) {
                if (this.f5649c == null || !(this.f5649c.mo3391c().equals("N") || this.f5649c.mo3391c().equals("F"))) {
                    Toast.makeText(this.f5650d, "玩家当前状态不能被移出！", Toast.LENGTH_SHORT).show();
                } else {
                    this.f5647a.f5614f.mo2676a((byte) 9, this.f5647a.f5611c, this.f5650d.f4477B, this.f5649c.mo3385a(), bArr);
                }
            }
        }
    }
}
