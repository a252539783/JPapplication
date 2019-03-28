package ly.pp.addsongs;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


/* renamed from: ly.pp.addsongs.bq */
final class C1022bq implements OnClickListener {
    /* renamed from: a */
    String f5170a;
    /* renamed from: b */
    String f5171b;
    /* renamed from: c */
    final /* synthetic */ C1020bo f5172c;
    /* renamed from: d */
    private final /* synthetic */ View f5173d;
    /* renamed from: e */
    private final /* synthetic */ Context f5174e;

    C1022bq(C1020bo c1020bo, Cursor cursor, View view, Context context) {
        this.f5172c = c1020bo;
        this.f5173d = view;
        this.f5174e = context;
        this.f5170a = cursor.getString(cursor.getColumnIndexOrThrow("path"));
        this.f5171b = cursor.getString(cursor.getColumnIndexOrThrow("name"));
    }

    public final void onClick(View view) {
        if (this.f5172c.f5164a.f4262r != null) {
            this.f5172c.f5164a.f4262r.f5738b = false;
            this.f5172c.f5164a.f4262r = null;
        }
        if (this.f5170a.equals(this.f5172c.f5164a.f4240Q)) {
            this.f5172c.f5164a.f4240Q = "";
            return;
        }
        this.f5172c.f5164a.f4240Q = this.f5170a;
        this.f5172c.f5164a.f4262r = new C1243jv(this.f5172c.f5164a.f4267w, this.f5170a, this.f5172c.f5164a, ((Integer) this.f5173d.getTag()).intValue());
        this.f5172c.f5164a.f4262r.f5738b = true;
        this.f5172c.f5164a.f4262r.start();
        Toast.makeText(this.f5174e, "正在播放:《" + this.f5171b + "》", Toast.LENGTH_SHORT).show();
    }
}
