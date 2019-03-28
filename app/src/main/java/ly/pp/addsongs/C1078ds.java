package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.ds */
final class C1078ds implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1077dr f5344a;
    /* renamed from: b */
    private final /* synthetic */ String f5345b;
    /* renamed from: c */
    private final /* synthetic */ ImageButton f5346c;
    /* renamed from: d */
    private final /* synthetic */ Long f5347d;

    C1078ds(C1077dr c1077dr, String str, ImageButton imageButton, Long l) {
        this.f5344a = c1077dr;
        this.f5345b = str;
        this.f5346c = imageButton;
        this.f5347d = l;
    }

    public final void onClick(View view) {
        Toast.makeText(this.f5344a.f5343c.getBaseContext(), "《" + this.f5345b + "》已加入网络收藏夹", Toast.LENGTH_SHORT).show();
        this.f5346c.setImageResource(R.drawable.favor);
        new C1346u(this.f5344a.f5343c, this.f5347d, "F", this.f5344a.f5343c.f4304I.mo2701P()).start();
    }
}
