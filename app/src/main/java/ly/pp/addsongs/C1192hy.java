package ly.pp.addsongs;

import android.content.ContentValues;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

/* renamed from: ly.pp.addsongs.hy */
final class C1192hy implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1191hx f5591a;
    /* renamed from: b */
    private final /* synthetic */ int f5592b;
    /* renamed from: c */
    private final /* synthetic */ ImageView f5593c;
    /* renamed from: d */
    private final /* synthetic */ String f5594d;

    C1192hy(C1191hx c1191hx, int i, ImageView imageView, String str) {
        this.f5591a = c1191hx;
        this.f5592b = i;
        this.f5593c = imageView;
        this.f5594d = str;
    }

    public final void onClick(View view) {
        ContentValues contentValues = new ContentValues();
        if (this.f5592b == 0) {
            contentValues.put("isfavo", Integer.valueOf(1));
            this.f5593c.setImageResource(R.drawable.favor);
        } else {
            contentValues.put("isfavo", Integer.valueOf(0));
            this.f5593c.setImageResource(R.drawable.favor_1);
        }
        this.f5591a.f5590a.f4505ad.update("jp_data", contentValues, "path = '" + this.f5594d + "'", null);
        contentValues.clear();
        this.f5591a.f5590a.m3756h();
    }
}
