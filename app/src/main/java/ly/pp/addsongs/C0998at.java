package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.at */
final class C0998at implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ Login f5130a;

    C0998at(Login login) {
        this.f5130a = login;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setClass(this.f5130a, OLMainMode.class);
        Toast.makeText(this.f5130a, "登陆成功,欢迎您回来!" + this.f5130a.f4182h + "!", Toast.LENGTH_SHORT).show();
        this.f5130a.startActivity(intent);
        dialogInterface.dismiss();
        this.f5130a.finish();
    }
}
