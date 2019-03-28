package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

/* renamed from: ly.pp.addsongs.cl */
final class C1044cl implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5276a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5277b;

    C1044cl(C1036cd c1036cd, RelativeLayout relativeLayout) {
        this.f5276a = c1036cd;
        this.f5277b = relativeLayout;
    }

    public final void onClick(View view) {
        int visibility = this.f5277b.getVisibility();
        if (visibility == 8) {
            this.f5277b.setVisibility(View.VISIBLE);
        } else if (visibility == 0) {
            this.f5277b.setVisibility(View.GONE);
        }
    }
}
