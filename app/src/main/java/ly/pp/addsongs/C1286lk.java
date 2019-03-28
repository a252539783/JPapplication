package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.lk */
final class C1286lk implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1285lj f5884a;
    /* renamed from: b */
    private final /* synthetic */ String f5885b;
    /* renamed from: c */
    private final /* synthetic */ ImageButton f5886c;
    /* renamed from: d */
    private final /* synthetic */ Long f5887d;
    /* renamed from: e */
    private final /* synthetic */ int f5888e;

    C1286lk(C1285lj c1285lj, String str, ImageButton imageButton, Long l, int i) {
        this.f5884a = c1285lj;
        this.f5885b = str;
        this.f5886c = imageButton;
        this.f5887d = l;
        this.f5888e = i;
    }

    public final void onClick(View view) {
        if (this.f5884a.f5883c.f4967c.equals("F")) {
            Toast.makeText(this.f5884a.f5883c.getBaseContext(), "《" + this.f5885b + "》已移出网络收藏夹", Toast.LENGTH_SHORT).show();
            this.f5884a.f5883c.mo2976a(this.f5888e);
            new C1346u(this.f5884a.f5883c, this.f5887d, "U", this.f5884a.f5883c.f4981q.mo2701P()).start();
            return;
        }
        Toast.makeText(this.f5884a.f5883c.getBaseContext(), "《" + this.f5885b + "》已加入网络收藏夹", Toast.LENGTH_SHORT).show();
        this.f5886c.setImageResource(R.drawable.favor);
        new C1346u(this.f5884a.f5883c, this.f5887d, "F", this.f5884a.f5883c.f4981q.mo2701P()).start();
    }
}
