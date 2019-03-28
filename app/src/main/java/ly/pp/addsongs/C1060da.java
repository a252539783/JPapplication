package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.da */
final class C1060da implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLMainMode f5311a;

    C1060da(OLMainMode oLMainMode) {
        this.f5311a = oLMainMode;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        new C1064de(this.f5311a).execute(this.f5311a.f4292r.mo2695K(), "kuang", this.f5311a.f4292r.mo2701P());
    }
}
