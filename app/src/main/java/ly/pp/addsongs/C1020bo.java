package ly.pp.addsongs;

import android.content.Context;
import android.database.Cursor;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/* renamed from: ly.pp.addsongs.bo */
public final class C1020bo extends CursorAdapter {
    /* renamed from: a */
    final /* synthetic */ MelodySelect f5164a;

    public C1020bo(MelodySelect melodySelect, Context context, Cursor cursor) {
        super(context, cursor, true);
        this.f5164a = melodySelect;

    }

    /* renamed from: a */
    static /* synthetic */ void m3966a(C1020bo c1020bo, int i) {
        switch (i) {
            case 0:
                c1020bo.f5164a.mo2784a(c1020bo.f5164a.f4252h.query("jp_data", null, "isfavo = 1 AND " + c1020bo.f5164a.f4238O + " AND ishot=0 AND " + c1020bo.f5164a.f4238O, null, null, null, c1020bo.f5164a.f4260p));
                return;
            case 1:
                c1020bo.f5164a.mo2784a(c1020bo.f5164a.f4252h.query("jp_data", null, "ishot = 0 AND " + c1020bo.f5164a.f4238O + " AND item=?", new String[]{c1020bo.f5164a.f4263s}, null, null, c1020bo.f5164a.f4260p));
                return;
            case 2:
                c1020bo.f5164a.mo2784a(c1020bo.f5164a.f4252h.query("jp_data", null, "ishot = 0 AND " + c1020bo.f5164a.f4238O + " AND item=?", new String[]{c1020bo.f5164a.f4263s}, null, null, c1020bo.f5164a.f4260p));
                return;
            case 3:
                c1020bo.f5164a.mo2784a(c1020bo.f5164a.f4252h.query("jp_data", null, "ishot = 0 AND " + c1020bo.f5164a.f4238O + " AND item=?", new String[]{c1020bo.f5164a.f4263s}, null, null, c1020bo.f5164a.f4260p));
                return;
            case 4:
                c1020bo.f5164a.mo2784a(c1020bo.f5164a.f4252h.query("jp_data", null, "ishot = 0 AND " + c1020bo.f5164a.f4238O + " AND item=?", new String[]{c1020bo.f5164a.f4263s}, null, null, c1020bo.f5164a.f4260p));
                return;
            case 5:
                c1020bo.f5164a.mo2784a(c1020bo.f5164a.f4252h.query("jp_data", null, "ishot = 0 AND " + c1020bo.f5164a.f4238O + " AND item=?", new String[]{c1020bo.f5164a.f4263s}, null, null, c1020bo.f5164a.f4260p));
                return;
            case 6:
                c1020bo.f5164a.mo2784a(c1020bo.f5164a.f4252h.query("jp_data", null, "ishot = 0 AND " + c1020bo.f5164a.f4238O + " AND item=?", new String[]{c1020bo.f5164a.f4263s}, null, null, c1020bo.f5164a.f4260p));
                return;
            case 7:
                c1020bo.f5164a.mo2784a(c1020bo.f5164a.f4252h.query("jp_data", null, "ishot = 1 AND " + c1020bo.f5164a.f4238O + " AND isfavo=0", new String[]{c1020bo.f5164a.f4263s}, null, null, c1020bo.f5164a.f4260p));
                return;
            default:
                return;
        }
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        view.setTag(Integer.valueOf(cursor.getPosition()));
        ImageView imageView = (ImageView) view.findViewById(R.id.play_image);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.dele);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.favor);
        ((ImageView) view.findViewById(R.id.play)).setOnClickListener(new C1021bp(this, cursor));
        imageView.setOnClickListener(new C1022bq(this, cursor, view, context));
        imageView2.setOnClickListener(new C1023br(this, cursor, context));
        imageView3.setOnClickListener(new C1024bs(this, cursor, context));
        ScrollText scrollText = (ScrollText) view.findViewById(R.id.s_n);
        scrollText.setText(cursor.getString(1));
        scrollText.setMovementMethod(ScrollingMovementMethod.getInstance());
        TextView textView = (TextView) view.findViewById(R.id.highscore);
        scrollText.setOnClickListener(new C1025bt(this, cursor));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("score"));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("isnew"));
        textView.setText("最高得分：" + (i <= 0 ? "未完成" : String.valueOf(i)));
        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.nandu);
        textView = (TextView) view.findViewById(R.id.nandu_1);
        float f = cursor.getFloat(11);
        textView.setText("难度：" + f);
        ratingBar.setNumStars(5);
        ratingBar.setClickable(false);
        ratingBar.setRating(f);
        this.f5164a.f4228E = (ImageView) view.findViewById(R.id.is_new);
        if (i2 == 1) {
            this.f5164a.f4228E.setImageResource(R.drawable.s_new);
        } else {
            this.f5164a.f4228E.setImageResource(R.drawable.null_pic);
        }
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f5164a.f4227D.inflate(R.layout.c_view, null);
        inflate.setBackgroundResource(R.drawable.selector_list_c);
        return inflate;
    }
}
