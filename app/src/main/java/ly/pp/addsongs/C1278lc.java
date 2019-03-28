package ly.pp.addsongs;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

/* renamed from: ly.pp.addsongs.lc */
public final class C1278lc extends BaseAdapter {
    /* renamed from: a */
    int f5869a = 0;
    /* renamed from: b */
    List f5870b = null;
    /* renamed from: c */
    final /* synthetic */ SearchSongs f5871c;

    public C1278lc(SearchSongs searchSongs, int i, List list) {
        this.f5871c = searchSongs;
        this.f5869a = i;
        this.f5870b = list;
        searchSongs.f4961p = new Handler(searchSongs);
        searchSongs.f4960o = new C0978a(searchSongs.f4961p, 0);
    }

    public final int getCount() {
        return this.f5869a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f5871c).inflate(R.layout.ol_top_view, null);
        }
        view.setKeepScreenOn(true);
        TextView textView = (TextView) view.findViewById(R.id.ol_user_top);
        TextView textView2 = (TextView) view.findViewById(R.id.ol_score_top);
        TextView textView3 = (TextView) view.findViewById(R.id.ol_nuns_top);
        ImageView imageView = (ImageView) view.findViewById(R.id.user_face);
        ((TextView) view.findViewById(R.id.ol_position_top)).setText(String.valueOf(i));
        imageView.setTag(((Map) this.f5870b.get(i)).get("faceID").toString());
        this.f5871c.f4960o.mo3027a(imageView, this.f5871c.m3831a(this.f5871c));
        Object obj = ((Map) this.f5870b.get(i)).get("userName").toString();
        textView.setText(obj.toString());
        ImageView imageView2 = (ImageView) view.findViewById(R.id.ol_user_sex);
        if (((Map) this.f5870b.get(i)).get("userSex").toString().equals("f")) {
            imageView2.setImageResource(R.drawable.f);
        } else {
            imageView2.setImageResource(R.drawable.m);
        }
        textView2.setText("总分:" + ((Integer) ((Map) this.f5870b.get(i)).get("userScore")).intValue());
        textView3.setText("冠军:" + ((Map) this.f5870b.get(i)).get("userNuns"));
        view.setOnClickListener(new C1279ld(this, obj.toString()));
        return view;
    }
}
