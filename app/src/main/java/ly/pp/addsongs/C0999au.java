package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.au */
final class C0999au implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ Login f5131a;

    C0999au(Login login) {
        this.f5131a = login;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Intent intent = new Intent();
        intent.setClass(this.f5131a, OLMainMode.class);
        Toast.makeText(this.f5131a, "登陆成功,欢迎您回来!" + this.f5131a.f4182h + "!", Toast.LENGTH_SHORT).show();
        this.f5131a.startActivity(intent);
        this.f5131a.finish();
    }
}
