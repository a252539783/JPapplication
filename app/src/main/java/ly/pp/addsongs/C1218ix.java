package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.ix */
final class C1218ix implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ PianoPlay f5686a;

    C1218ix(PianoPlay pianoPlay) {
        this.f5686a = pianoPlay;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5686a.f4605X = false;
        this.f5686a.f4626q.f4710S = false;
        this.f5686a.f4617h = false;
        this.f5686a.f4619j = true;
        dialogInterface.dismiss();
        this.f5686a.finish();
    }
}
