package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.cv */
final class C1054cv implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLMainMode f5302a;

    C1054cv(OLMainMode oLMainMode) {
        this.f5302a = oLMainMode;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new C1062dc(this.f5302a).execute(this.f5302a.f4292r.mo2701P(), "1", "2");
        dialogInterface.dismiss();
    }
}
