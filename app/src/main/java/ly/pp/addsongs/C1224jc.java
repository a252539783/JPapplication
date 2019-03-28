package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.jc */
final class C1224jc implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ PianoPlay f5699a;

    C1224jc(PianoPlay pianoPlay) {
        this.f5699a = pianoPlay;
    }

    public final void onClick(View view) {
        this.f5699a.f4596O.setVisibility(View.GONE);
        this.f5699a.f4597P.setVisibility(View.GONE);
        this.f5699a.f4623n.setVisibility(View.GONE);
        this.f5699a.mo2906a(false);
    }
}
