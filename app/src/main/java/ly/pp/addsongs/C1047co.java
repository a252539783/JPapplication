package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

/* renamed from: ly.pp.addsongs.co */
final class C1047co implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5285a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5286b;
    /* renamed from: c */
    private final /* synthetic */ String f5287c;

    C1047co(C1036cd c1036cd, RelativeLayout relativeLayout, String str) {
        this.f5285a = c1036cd;
        this.f5286b = relativeLayout;
        this.f5287c = str;
    }

    public final void onClick(View view) {
        this.f5286b.setVisibility(View.GONE);
        if (this.f5285a.f5255e instanceof OLPlayHall) {
            ((OLPlayHall) this.f5285a.f5255e).mo2830a(this.f5287c);
        } else if (this.f5285a.f5255e instanceof OLPlayHallRoom) {
            ((OLPlayHallRoom) this.f5285a.f5255e).mo2845a(this.f5287c, 0);
        } else if (this.f5285a.f5255e instanceof OLPlayRoom) {
            ((OLPlayRoom) this.f5285a.f5255e).mo2865b(this.f5287c);
        }
    }
}
