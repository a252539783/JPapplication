package ly.pp.addsongs;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.la */
final class C1276la implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1273ky f5862a;
    /* renamed from: b */
    private final /* synthetic */ String f5863b;

    C1276la(C1273ky c1273ky, String str) {
        this.f5862a = c1273ky;
        this.f5863b = str;
    }

    public final void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("head", 1);
        intent.putExtra("userKitiName", this.f5863b);
        intent.setClass(this.f5862a.f5857c, PopUserInfo.class);
        this.f5862a.f5857c.startActivity(intent);
    }
}
