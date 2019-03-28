package ly.pp.addsongs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


/* renamed from: ly.pp.addsongs.br */
final class C1023br implements OnClickListener {
    /* renamed from: a */
    String f5175a;
    /* renamed from: b */
    final /* synthetic */ C1020bo f5176b;
    /* renamed from: c */
    private final /* synthetic */ Cursor f5177c;
    /* renamed from: d */
    private final /* synthetic */ Context f5178d;

    C1023br(C1020bo c1020bo, Cursor cursor, Context context) {
        this.f5176b = c1020bo;
        this.f5177c = cursor;
        this.f5178d = context;
        this.f5175a = cursor.getString(cursor.getColumnIndexOrThrow("name"));
    }

    public final void onClick(View view) {
        ContentValues contentValues = new ContentValues();
        try {
            int i = this.f5177c.getInt(this.f5177c.getColumnIndexOrThrow("ishot"));
            if (i == 0) {
                i = 1;
            } else if (i == 1) {
                i = 0;
            }
            contentValues.put("ishot", Integer.valueOf(i));
            this.f5176b.f5164a.f4252h.update("jp_data", contentValues, "name = '" + this.f5175a + "'", null);
            Object obj = "";
            switch (i) {
                case 0:
                    obj = "恢复曲谱：";
                    break;
                case 1:
                    obj = "删除曲谱：";
                    break;
            }
            Toast.makeText(this.f5178d, new StringBuilder(String.valueOf(obj)).append(this.f5175a).toString(), Toast.LENGTH_SHORT).show();
            C1020bo.m3966a(this.f5176b, this.f5176b.f5164a.f4264t);
            contentValues.clear();
        } catch (Exception e) {
            Toast.makeText(this.f5178d, "请放松，慢慢删...", Toast.LENGTH_SHORT).show();
        }
    }
}
