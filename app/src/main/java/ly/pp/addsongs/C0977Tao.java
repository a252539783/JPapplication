package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: ly.pp.addsongs.Tao */
final class C0977Tao implements OnItemClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayDressRoom f5054a;

    C0977Tao(OLPlayDressRoom oLPlayDressRoom) {
        this.f5054a = oLPlayDressRoom;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f5054a.f4353lv < 20) {
            OLPlayDressRoom oLPlayDressRoom = this.f5054a;
            C1302m c1302m = new C1302m(oLPlayDressRoom.context);
            c1302m.mo3539b("提示");
            c1302m.mo3535a("您的等级不足20级，无法更换此服装!");
            c1302m.mo3536a("确定", new dialog(oLPlayDressRoom));
            c1302m.mo3541c();
            return;
        }
        OLPlayDressRoom oLPlayDressRoom2 = this.f5054a;
        if (i == oLPlayDressRoom2.f4354m - oLPlayDressRoom2.f4358q) {
            this.f5054a.f4340C.setImageBitmap(this.f5054a.f4347J);
            this.f5054a.f4339B.setImageBitmap(this.f5054a.f4347J);
            oLPlayDressRoom2 = this.f5054a;
            oLPlayDressRoom2.f4355n = -1;
            oLPlayDressRoom2.f4354m = -1;
            return;
        }
        this.f5054a.f4340C.setImageBitmap((Bitmap) this.f5054a.TaoArray.get(i));
        this.f5054a.f4339B.setImageBitmap(this.f5054a.f4347J);
        oLPlayDressRoom2 = this.f5054a;
        oLPlayDressRoom2.f4354m = i + oLPlayDressRoom2.f4358q;
        oLPlayDressRoom2.f4355n = -1;
    }
}
