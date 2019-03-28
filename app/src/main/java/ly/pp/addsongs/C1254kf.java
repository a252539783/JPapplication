package ly.pp.addsongs;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

/* renamed from: ly.pp.addsongs.kf */
final class C1254kf implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1253ke f5784a;
    /* renamed from: b */
    private final /* synthetic */ ImageView f5785b;

    C1254kf(C1253ke c1253ke, ImageView imageView) {
        this.f5784a = c1253ke;
        this.f5785b = imageView;
    }

    /* renamed from: run */
    public final void run() {
        AnimationDrawable animationDrawable = (AnimationDrawable) this.f5785b.getDrawable();
        animationDrawable.setOneShot(false);
        animationDrawable.start();
    }
}
