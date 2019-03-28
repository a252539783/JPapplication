package ly.pp.addsongs;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


/* renamed from: ly.pp.addsongs.hx */
public final class C1191hx extends CursorAdapter {
    /* renamed from: a */
    final /* synthetic */ OLPlayRoom f5590a;

    public C1191hx(OLPlayRoom oLPlayRoom, Context context, Cursor cursor) {
        super(context, cursor, false);
        this.f5590a = oLPlayRoom;

    }

    public final void bindView(View view, Context context, Cursor cursor) {
        ((TextView) view.findViewById(R.id.song_name)).setText(cursor.getString(cursor.getColumnIndex("name")));
        ImageView imageView = (ImageView) view.findViewById(R.id.song_favor);
        String string = cursor.getString(cursor.getColumnIndex("path"));
        String substring = string.substring(6, string.length() - 3);
        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.song_degree);
        TextView textView = (TextView) view.findViewById(R.id.nandu_1);
        float f = cursor.getFloat(cursor.getColumnIndex("diff"));
        int i = cursor.getInt(cursor.getColumnIndex("isfavo"));
        if (i == 0) {
            imageView.setImageResource(R.drawable.favor_1);
        } else {
            imageView.setImageResource(R.drawable.favor);
        }
        imageView.setOnClickListener(new C1192hy(this, i, imageView, string));
        textView.setText("难度：" + f);
        ratingBar.setNumStars(5);
        ratingBar.setClickable(false);
        ratingBar.setRating(f);
        view.setOnClickListener(new C1193hz(this, substring));
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.song_view, null);
        inflate.setBackgroundResource(R.drawable.selector_list_c);
        return inflate;
    }
}
