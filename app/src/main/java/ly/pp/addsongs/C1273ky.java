package ly.pp.addsongs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Map;


/* renamed from: ly.pp.addsongs.ky */
public final class C1273ky extends BaseAdapter {
    /* renamed from: a */
    int f5855a = 0;
    /* renamed from: b */
    List f5856b = null;
    /* renamed from: c */
    final /* synthetic */ SearchSongs f5857c;

    public C1273ky(SearchSongs searchSongs, int i, List list) {
        this.f5857c = searchSongs;
        this.f5855a = i;
        this.f5856b = list;
    }

    public final int getCount() {
        return this.f5855a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f5857c.f4946a.inflate(R.layout.ol_c_view, null);
        inflate.setKeepScreenOn(true);
        Object trim = ((Map) this.f5856b.get(i)).get("songName").toString().trim();
        Long valueOf = Long.valueOf((String) ((Map) this.f5856b.get(i)).get("songID"));
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.ol_favor_b);
        imageButton.setImageResource(R.drawable.favor_1);
        imageButton.setOnClickListener(new C1274kz(this, trim.toString(), imageButton, valueOf));
        ((TextView) inflate.findViewById(R.id.ol_s_n)).setText(trim.toString());
        ((TextView) inflate.findViewById(R.id.ol_nandu)).setText("难度:" + ((Map) this.f5856b.get(i)).get("degree"));
        Double d = (Double) ((Map) this.f5856b.get(i)).get("degree");
        ((TextView) inflate.findViewById(R.id.ol_artist)).setText(((Map) this.f5856b.get(i)).get("artist").toString());
        TextView textView = (TextView) inflate.findViewById(R.id.ol_topuser);
        CharSequence obj = ((Map) this.f5856b.get(i)).get("topUser").toString();
        textView.setOnClickListener(new C1276la(this, obj.toString()));
        textView.setText(obj);
        ((TextView) inflate.findViewById(R.id.ol_topscore)).setText("高分:" + ((Map) this.f5856b.get(i)).get("topScore"));
        ((TextView) inflate.findViewById(R.id.ol_playcount)).setText("播放:" + ((Map) this.f5856b.get(i)).get("playCount"));
        ((TextView) inflate.findViewById(R.id.ol_update)).setText(((Map) this.f5856b.get(i)).get("update").toString());
        ((ImageView) inflate.findViewById(R.id.ol_play_button)).setOnClickListener(new C1277lb(this, trim.toString(), valueOf, Integer.valueOf((String) ((Map) this.f5856b.get(i)).get("topScore")).intValue(), d));
        return inflate;
    }
}
