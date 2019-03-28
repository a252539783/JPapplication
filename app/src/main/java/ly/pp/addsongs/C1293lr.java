package ly.pp.addsongs;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.lr */
final class C1293lr implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1292lq f5903a;
    /* renamed from: b */
    private final /* synthetic */ String f5904b;

    C1293lr(C1292lq c1292lq, String str) {
        this.f5903a = c1292lq;
        this.f5904b = str;
    }

    public final void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("head", 1);
        intent.putExtra("userKitiName", this.f5904b);
        intent.setClass(this.f5903a.f5902c, PopUserInfo.class);
        this.f5903a.f5902c.startActivity(intent);
    }
}
