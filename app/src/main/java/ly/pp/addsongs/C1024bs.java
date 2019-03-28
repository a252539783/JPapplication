package ly.pp.addsongs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


/* renamed from: ly.pp.addsongs.bs */
final class C1024bs implements OnClickListener {
    /* renamed from: a */
    String f5179a;
    /* renamed from: b */
    String f5180b;
    /* renamed from: c */
    final /* synthetic */ C1020bo f5181c;
    /* renamed from: d */
    private final /* synthetic */ Cursor f5182d;
    /* renamed from: e */
    private final /* synthetic */ Context f5183e;

    C1024bs(C1020bo c1020bo, Cursor cursor, Context context) {
        this.f5181c = c1020bo;
        this.f5182d = cursor;
        this.f5183e = context;
        this.f5179a = cursor.getString(cursor.getColumnIndexOrThrow("path"));
        this.f5180b = cursor.getString(cursor.getColumnIndexOrThrow("name"));
    }

    public final void onClick(View view) {
        int i = 0;
        ContentValues contentValues = new ContentValues();
        try {
            int i2 = this.f5182d.getInt(this.f5182d.getColumnIndexOrThrow("isfavo"));
            if (i2 == 0) {
                i = 1;
            } else if (i2 != 1) {
                i = i2;
            }
            contentValues.put("isfavo", Integer.valueOf(i));
            this.f5181c.f5164a.f4252h.update("jp_data", contentValues, "path = '" + this.f5179a + "'", null);
            String str = "";
            switch (i) {
                case 0:
                    str = "：已移出收藏夹";
                    break;
                case 1:
                    str = "：已加入收藏夹";
                    break;
            }
            Toast.makeText(this.f5183e, this.f5180b + str, Toast.LENGTH_SHORT).show();
            C1020bo.m3966a(this.f5181c, this.f5181c.f5164a.f4264t);
            contentValues.clear();
        } catch (Exception e) {
        }
    }
}
