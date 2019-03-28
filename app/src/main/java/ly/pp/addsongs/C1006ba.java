package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.ba */
final class C1006ba implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ MainMode f5148a;

    C1006ba(MainMode mainMode) {
        this.f5148a = mainMode;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5148a.f4220t.f4072f = "";
        this.f5148a.f4220t.f4071e = "";
        dialogInterface.dismiss();
    }
}
