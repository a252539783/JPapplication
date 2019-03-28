package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.cr */
final class C1050cr implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5296a;
    /* renamed from: b */
    private final /* synthetic */ int f5297b;

    C1050cr(C1036cd c1036cd, int i) {
        this.f5296a = c1036cd;
        this.f5297b = i;
    }

    public final void onClick(View view) {
        ((OLPlayHallRoom) this.f5296a.f5255e).mo2840a(this.f5297b);
    }
}
