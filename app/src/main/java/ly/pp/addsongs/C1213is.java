package ly.pp.addsongs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: ly.pp.addsongs.is */
public final class C1213is extends SQLiteOpenHelper {
    /* renamed from: a */
    JustPiano f5680a;

    public C1213is(Context context, String str, JustPiano justPiano) {
        super(context, str, null, 37);
        this.f5680a = justPiano;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE  IF NOT EXISTS jp_data (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL,item TEXT NOT NULL,path TEXT NOT NULL,isnew INTEGER,ishot INTEGER,isfavo INTEGER,player TEXT,score INTEGER,date LONG,count INTEGER,diff FLOAT,online INTEGER DEFAULT 0);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int version = sQLiteDatabase.getVersion();
        if (version <= 21) {
            sQLiteDatabase.execSQL("alter table jp_data add online INTEGER DEFAULT 0;");
        }
        if (version == 29) {
            this.f5680a.f4091a = 2;
        } else {
            this.f5680a.f4091a = 1;
        }
        sQLiteDatabase.setVersion(37);
    }
}
