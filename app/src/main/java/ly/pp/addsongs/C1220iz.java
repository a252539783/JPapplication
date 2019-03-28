package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.iz */
final class C1220iz implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ PianoPlay f5688a;

    C1220iz(PianoPlay pianoPlay) {
        this.f5688a = pianoPlay;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5688a.f4605X = false;
        this.f5688a.f4626q.f4710S = false;
        this.f5688a.f4617h = false;
        this.f5688a.f4619j = true;
        dialogInterface.dismiss();
        this.f5688a.finish();
    }
}
