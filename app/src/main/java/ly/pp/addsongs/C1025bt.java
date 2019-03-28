package ly.pp.addsongs;

import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;


/* renamed from: ly.pp.addsongs.bt */
final class C1025bt implements OnClickListener {
    /* renamed from: a */
    String f5184a;
    /* renamed from: b */
    String f5185b;
    /* renamed from: c */
    float f5186c;
    /* renamed from: d */
    int f5187d;
    /* renamed from: e */
    final /* synthetic */ C1020bo f5188e;

    C1025bt(C1020bo c1020bo, Cursor cursor) {
        this.f5188e = c1020bo;
        this.f5184a = cursor.getString(cursor.getColumnIndexOrThrow("path"));
        this.f5185b = cursor.getString(cursor.getColumnIndexOrThrow("name"));
        this.f5186c = cursor.getFloat(cursor.getColumnIndexOrThrow("diff"));
        this.f5187d = cursor.getInt(cursor.getColumnIndexOrThrow("score"));
    }

    public final void onClick(View view) {
        if (this.f5188e.f5164a.f4262r != null) {
            this.f5188e.f5164a.f4262r.f5738b = false;
            this.f5188e.f5164a.f4262r = null;
        }
        Intent intent = new Intent();
        intent.putExtra("head", 0);
        intent.putExtra("path", this.f5184a);
        intent.putExtra("name", this.f5185b);
        intent.putExtra("nandu", this.f5186c);
        intent.putExtra("score", this.f5187d);
        intent.putExtra("isrecord", this.f5188e.f5164a.f4241R.isChecked());
        intent.setClass(this.f5188e.f5164a, PianoPlay.class);
        this.f5188e.f5164a.startActivity(intent);
    }
}
