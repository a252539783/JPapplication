package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: ly.pp.addsongs.eb */
final class C1088eb implements OnItemClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayDressRoom f5367a;

    C1088eb(OLPlayDressRoom oLPlayDressRoom) {
        this.f5367a = oLPlayDressRoom;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        OLPlayDressRoom oLPlayDressRoom = this.f5367a;
        if (oLPlayDressRoom.f4354m >= oLPlayDressRoom.f4358q) {
            oLPlayDressRoom.f4354m = -1;
            this.f5367a.f4340C.setImageBitmap(this.f5367a.f4347J);
        }
        if (i == this.f5367a.f4355n) {
            this.f5367a.f4339B.setImageBitmap(this.f5367a.f4347J);
            this.f5367a.f4355n = -1;
            return;
        }
        this.f5367a.f4339B.setImageBitmap((Bitmap) this.f5367a.f4350j.get(i));
        this.f5367a.f4355n = i;
    }
}
