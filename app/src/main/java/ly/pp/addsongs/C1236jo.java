package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.jo */
final class C1236jo implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1235jn f5724a;
    /* renamed from: b */
    private final /* synthetic */ PianoPlay f5725b;

    C1236jo(C1235jn c1235jn, PianoPlay pianoPlay) {
        this.f5724a = c1235jn;
        this.f5725b = pianoPlay;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f5725b.finish();
    }
}
