package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.dx */
final class C1083dx implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1081dv f5361a;
    /* renamed from: b */
    private final /* synthetic */ String f5362b;

    C1083dx(C1081dv c1081dv, String str) {
        this.f5361a = c1081dv;
        this.f5362b = str;
    }

    public final void onClick(View view) {
        if (this.f5361a.f5358d instanceof OLPlayRoom) {
            ((OLPlayRoom) this.f5361a.f5358d).mo2867c(this.f5362b);
        } else if (this.f5361a.f5358d instanceof OLPlayHall) {
            ((OLPlayHall) this.f5361a.f5358d).mo2832b(this.f5362b);
        }
    }
}
