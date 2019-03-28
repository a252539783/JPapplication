package ly.pp.addsongs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Map;


/* renamed from: ly.pp.addsongs.lj */
public final class C1285lj extends BaseAdapter {
    /* renamed from: a */
    int f5881a = 0;
    /* renamed from: b */
    List f5882b = null;
    /* renamed from: c */
    final /* synthetic */ ShowSongsInfo f5883c;

    public C1285lj(ShowSongsInfo showSongsInfo, int i, List list) {
        this.f5883c = showSongsInfo;
        this.f5881a = i;
        this.f5882b = list;
    }

    /* renamed from: a */
    public final void mo3500a(List list) {
        this.f5882b = list;
        this.f5881a = list.size();
    }

    public final int getCount() {
        return this.f5881a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5883c.f4965a.inflate(R.layout.ol_c_view, null);
        }
        view.setKeepScreenOn(true);
        CharSequence trim = ((Map) this.f5882b.get(i)).get("songName").toString().trim();
        Long valueOf = Long.valueOf((String) ((Map) this.f5882b.get(i)).get("songID"));
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.ol_favor_b);
        if (this.f5883c.f4967c.equals("F")) {
            imageButton.setImageResource(R.drawable.favor);
        } else {
            imageButton.setImageResource(R.drawable.favor_1);
        }
        imageButton.setOnClickListener(new C1286lk(this, trim.toString(), imageButton, valueOf, i));
        ((TextView) view.findViewById(R.id.ol_s_n)).setText(trim);
        ((TextView) view.findViewById(R.id.ol_nandu)).setText("难度:" + ((Map) this.f5882b.get(i)).get("degree"));
        Double d = (Double) ((Map) this.f5882b.get(i)).get("degree");
        ((TextView) view.findViewById(R.id.ol_artist)).setText(((Map) this.f5882b.get(i)).get("artist").toString());
        TextView textView = (TextView) view.findViewById(R.id.ol_topuser);
        CharSequence obj = ((Map) this.f5882b.get(i)).get("topUser").toString();
        textView.setOnClickListener(new C1287ll(this, obj.toString()));
        textView.setText(obj);
        ((TextView) view.findViewById(R.id.ol_topscore)).setText("高分:" + ((Map) this.f5882b.get(i)).get("topScore"));
        ((TextView) view.findViewById(R.id.ol_playcount)).setText("播放:" + ((Map) this.f5882b.get(i)).get("playCount"));
        ((TextView) view.findViewById(R.id.ol_update)).setText(((Map) this.f5882b.get(i)).get("update").toString());
        ((ImageView) view.findViewById(R.id.ol_play_button)).setOnClickListener(new C1288lm(this, trim.toString(), valueOf, Integer.valueOf((String) ((Map) this.f5882b.get(i)).get("topScore")).intValue(), d));
        return view;
    }
}
