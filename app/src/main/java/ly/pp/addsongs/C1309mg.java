package ly.pp.addsongs;

import android.database.Cursor;
import android.database.CursorWrapper;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: ly.pp.addsongs.mg */
public final class C1309mg extends CursorWrapper {
    /* renamed from: a */
    Cursor f5947a;
    /* renamed from: b */
    ArrayList f5948b = new ArrayList();
    /* renamed from: c */
    int f5949c = 0;
    /* renamed from: d */
    public Comparator f5950d = new C1310mh(this);
    /* renamed from: e */
    public Comparator f5951e = new C1311mi(this);
    /* renamed from: f */
    public Comparator f5952f = Collator.getInstance(Locale.CHINA);

    public C1309mg(Cursor cursor, String str, boolean z) {
        super(cursor);
        int i = 0;
        this.f5947a = cursor;
        if (this.f5947a != null && this.f5947a.getCount() > 0) {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
            this.f5947a.moveToFirst();
            while (!this.f5947a.isAfterLast()) {
                C1312mj c1312mj = new C1312mj(this);
                c1312mj.f5955a = cursor.getString(columnIndexOrThrow);
                c1312mj.f5956b = i;
                this.f5948b.add(c1312mj);
                this.f5947a.moveToNext();
                i++;
            }
        }
        if (z) {
            Collections.sort(this.f5948b, this.f5950d);
        } else {
            Collections.sort(this.f5948b, this.f5951e);
        }
    }

    public final int getPosition() {
        return this.f5949c;
    }

    public final boolean move(int i) {
        return moveToPosition(this.f5949c + i);
    }

    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    public final boolean moveToNext() {
        return moveToPosition(this.f5949c + 1);
    }

    public final boolean moveToPosition(int i) {
        if (i < 0 || i >= this.f5948b.size()) {
            if (i < 0) {
                this.f5949c = -1;
            }
            if (i >= this.f5948b.size()) {
                this.f5949c = this.f5948b.size();
            }
            return this.f5947a.moveToPosition(i);
        }
        this.f5949c = i;
        return this.f5947a.moveToPosition(((C1312mj) this.f5948b.get(i)).f5956b);
    }

    public final boolean moveToPrevious() {
        return moveToPosition(this.f5949c - 1);
    }
}
