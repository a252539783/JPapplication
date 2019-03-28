package ly.pp.addsongs;

import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;


/* renamed from: ly.pp.addsongs.bp */
final class C1021bp implements OnClickListener {
    /* renamed from: a */
    String f5165a;
    /* renamed from: b */
    String f5166b;
    /* renamed from: c */
    float f5167c;
    /* renamed from: d */
    int f5168d;
    /* renamed from: e */
    final /* synthetic */ C1020bo f5169e;

    C1021bp(C1020bo c1020bo, Cursor cursor) {
        this.f5169e = c1020bo;
        this.f5165a = cursor.getString(cursor.getColumnIndexOrThrow("path"));
        this.f5166b = cursor.getString(cursor.getColumnIndexOrThrow("name"));
        this.f5167c = cursor.getFloat(cursor.getColumnIndexOrThrow("diff"));
        this.f5168d = cursor.getInt(cursor.getColumnIndexOrThrow("score"));
    }

    public final void onClick(View view) {
        int i = 0;
        if (this.f5169e.f5164a.f4262r != null) {
            this.f5169e.f5164a.f4262r.f5738b = false;
            this.f5169e.f5164a.f4262r = null;
        }
        Intent intent = new Intent();
        intent.putExtra("head", 0);
        intent.putExtra("path", this.f5165a);
        intent.putExtra("name", this.f5166b);
        intent.putExtra("nandu", this.f5167c);
        intent.putExtra("score", this.f5168d);
        intent.putExtra("isrecord", this.f5169e.f5164a.f4241R.isChecked());
        String str = "hand";
        if (this.f5169e.f5164a.f4243T.isChecked()) {
            i = 1;
        }
        intent.putExtra(str, i);
        intent.setClass(this.f5169e.f5164a, PianoPlay.class);
        this.f5169e.f5164a.startActivity(intent);
    }
}
