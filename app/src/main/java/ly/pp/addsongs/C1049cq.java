package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.cq */
final class C1049cq implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5292a;
    /* renamed from: b */
    private final /* synthetic */ String f5293b;
    /* renamed from: c */
    private final /* synthetic */ String f5294c;
    /* renamed from: d */
    private final /* synthetic */ int f5295d;

    C1049cq(C1036cd c1036cd, String str, String str2, int i) {
        this.f5292a = c1036cd;
        this.f5293b = str;
        this.f5294c = str2;
        this.f5295d = i;
    }

    public final void onClick(View view) {
        if (!(this.f5292a.f5255e instanceof OLPlayHallRoom)) {
            return;
        }
        if (this.f5293b.equals("")) {
            ((OLPlayHallRoom) this.f5292a.f5255e).mo2850c(this.f5294c);
            return;
        }
        OLPlayHallRoom oLPlayHallRoom = (OLPlayHallRoom) this.f5292a.f5255e;
        String str = this.f5294c;
        int i = this.f5295d;
        oLPlayHallRoom.mo2845a(str, 0);
    }
}
