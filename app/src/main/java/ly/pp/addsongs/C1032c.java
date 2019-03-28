package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: ly.pp.addsongs.c */
final class C1032c implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1005b f5237a;
    /* renamed from: b */
    private final /* synthetic */ ImageView f5238b;
    /* renamed from: c */
    private final /* synthetic */ Bitmap f5239c;

    C1032c(C1005b c1005b, ImageView imageView, Bitmap bitmap) {
        this.f5237a = c1005b;
        this.f5238b = imageView;
        this.f5239c = bitmap;
    }

    /* renamed from: run */
    public final void run() {
        this.f5238b.setImageBitmap(this.f5239c);
    }
}
