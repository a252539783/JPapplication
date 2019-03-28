package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* renamed from: ly.pp.addsongs.mz */
final class C1328mz implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ UsersInfo f5993a;

    C1328mz(UsersInfo usersInfo) {
        this.f5993a = usersInfo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", this.f5993a.m3926a());
        intent.putExtra("android.intent.extra.videoQuality", 0);
        this.f5993a.startActivityForResult(intent, 1);
    }
}
