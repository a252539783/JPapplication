package ly.pp.addsongs;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.ll */
final class C1287ll implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1285lj f5889a;
    /* renamed from: b */
    private final /* synthetic */ String f5890b;

    C1287ll(C1285lj c1285lj, String str) {
        this.f5889a = c1285lj;
        this.f5890b = str;
    }

    public final void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("head", 1);
        intent.putExtra("userKitiName", this.f5890b);
        intent.setClass(this.f5889a.f5883c, PopUserInfo.class);
        this.f5889a.f5883c.startActivity(intent);
    }
}
