package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.kz */
final class C1274kz implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1273ky f5858a;
    /* renamed from: b */
    private final /* synthetic */ String f5859b;
    /* renamed from: c */
    private final /* synthetic */ ImageButton f5860c;
    /* renamed from: d */
    private final /* synthetic */ Long f5861d;

    C1274kz(C1273ky c1273ky, String str, ImageButton imageButton, Long l) {
        this.f5858a = c1273ky;
        this.f5859b = str;
        this.f5860c = imageButton;
        this.f5861d = l;
    }

    public final void onClick(View view) {
        Toast.makeText(this.f5858a.f5857c.getBaseContext(), "《" + this.f5859b + "》已加入网络收藏夹", Toast.LENGTH_SHORT).show();
        this.f5860c.setImageResource(R.drawable.favor);
        new C1346u(this.f5858a.f5857c, this.f5861d, "F", this.f5858a.f5857c.f4959n.mo2701P()).start();
    }
}
