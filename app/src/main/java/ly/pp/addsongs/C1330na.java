package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* renamed from: ly.pp.addsongs.na */
final class C1330na implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ UsersInfo f5996a;

    C1330na(UsersInfo usersInfo) {
        this.f5996a = usersInfo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        this.f5996a.startActivityForResult(intent, 0);
    }
}
