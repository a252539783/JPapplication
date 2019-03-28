package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.jd */
final class C1225jd implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ PianoPlay f5700a;

    C1225jd(PianoPlay pianoPlay) {
        this.f5700a = pianoPlay;
    }

    public final void onClick(View view) {
        this.f5700a.f4596O.setVisibility(View.GONE);
        this.f5700a.f4597P.setVisibility(View.GONE);
        this.f5700a.f4623n.setVisibility(View.GONE);
        this.f5700a.mo2906a(false);
    }
}
