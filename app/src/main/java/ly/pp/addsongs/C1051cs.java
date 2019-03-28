package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

/* renamed from: ly.pp.addsongs.cs */
final class C1051cs implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5298a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5299b;

    C1051cs(C1036cd c1036cd, RelativeLayout relativeLayout) {
        this.f5298a = c1036cd;
        this.f5299b = relativeLayout;
    }

    public final void onClick(View view) {
        int visibility = this.f5299b.getVisibility();
        if (visibility == 8) {
            this.f5299b.setVisibility(View.VISIBLE);
        } else if (visibility == 0) {
            this.f5299b.setVisibility(View.GONE);
        }
    }
}
