package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: ly.pp.addsongs.ea */
final class C1087ea implements OnItemClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayDressRoom f5366a;

    C1087ea(OLPlayDressRoom oLPlayDressRoom) {
        this.f5366a = oLPlayDressRoom;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i == this.f5366a.f4354m) {
            this.f5366a.f4340C.setImageBitmap(this.f5366a.f4347J);
            this.f5366a.f4354m = -1;
            return;
        }
        this.f5366a.f4340C.setImageBitmap((Bitmap) this.f5366a.f4349i.get(i));
        this.f5366a.f4354m = i;
    }
}
