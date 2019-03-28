package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: ly.pp.addsongs.ec */
final class C1089ec implements OnItemClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayDressRoom f5368a;

    C1089ec(OLPlayDressRoom oLPlayDressRoom) {
        this.f5368a = oLPlayDressRoom;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i == this.f5368a.f4356o) {
            this.f5368a.f4342E.setImageBitmap(this.f5368a.f4347J);
            this.f5368a.f4356o = -1;
            return;
        }
        this.f5368a.f4342E.setImageBitmap((Bitmap) this.f5368a.f4351k.get(i));
        this.f5368a.f4356o = i;
    }
}
