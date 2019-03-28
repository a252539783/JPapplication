package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* renamed from: ly.pp.addsongs.ij */
final class C1204ij implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1196ib f5651a;
    /* renamed from: b */
    private final /* synthetic */ byte f5652b;
    /* renamed from: c */
    private final /* synthetic */ ImageView f5653c;

    C1204ij(C1196ib c1196ib, byte b, ImageView imageView) {
        this.f5651a = c1196ib;
        this.f5652b = b;
        this.f5653c = imageView;
    }

    public final void onClick(View view) {
        PopupWindow a = C1196ib.m4034a(this.f5651a, this.f5651a.f5612d, (C1245jx) this.f5651a.f5612d.f4531o.mo2700O().get(Byte.valueOf(this.f5652b)));
        if (a != null) {
            int[] iArr = new int[2];
            this.f5653c.getLocationOnScreen(iArr);
            a.showAtLocation(this.f5653c, 51, iArr[0] + this.f5653c.getWidth(), iArr[1]);
        }
    }
}
