package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: ly.pp.addsongs.dz */
final class C1085dz implements OnItemClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayDressRoom f5364a;

    C1085dz(OLPlayDressRoom oLPlayDressRoom) {
        this.f5364a = oLPlayDressRoom;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i == this.f5364a.f4352l) {
            this.f5364a.f4341D.setImageBitmap(this.f5364a.f4347J);
            this.f5364a.f4352l = -1;
            return;
        }
        this.f5364a.f4341D.setImageBitmap((Bitmap) this.f5364a.f4348h.get(i));
        this.f5364a.f4352l = i;
    }
}
