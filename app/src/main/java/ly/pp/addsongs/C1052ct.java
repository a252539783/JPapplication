package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.ct */
final class C1052ct implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLMainMode f5300a;

    C1052ct(OLMainMode oLMainMode) {
        this.f5300a = oLMainMode;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5300a.f4292r.f4074h = "";
        this.f5300a.f4292r.f4073g = "";
        dialogInterface.dismiss();
    }
}
