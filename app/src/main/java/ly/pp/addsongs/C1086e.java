package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.e */
final class C1086e implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ BaseActivity f5365a;

    C1086e(BaseActivity baseActivity) {
        this.f5365a = baseActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f5365a.f3996b > 0) {
            BaseActivity.m3496a(this.f5365a);
        }
    }
}
