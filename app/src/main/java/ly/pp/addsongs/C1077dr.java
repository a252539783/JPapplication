package ly.pp.addsongs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Map;


/* renamed from: ly.pp.addsongs.dr */
public final class C1077dr extends BaseAdapter {
    /* renamed from: a */
    int f5341a = 0;
    /* renamed from: b */
    List f5342b = null;
    /* renamed from: c */
    final /* synthetic */ OLMelodySelect f5343c;

    public C1077dr(OLMelodySelect oLMelodySelect, int i, List list) {
        this.f5343c = oLMelodySelect;
        this.f5341a = i;
        this.f5342b = list;
    }

    public final int getCount() {
        return this.f5341a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5343c.f4324m.inflate(R.layout.ol_c_view, null);
        }
        view.setKeepScreenOn(true);
        Object trim = ((Map) this.f5342b.get(i)).get("songName").toString().trim();
        Long l = (Long) ((Map) this.f5342b.get(i)).get("songID");
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.ol_favor_b);
        imageButton.setImageResource(R.drawable.favor_1);
        imageButton.setOnClickListener(new C1078ds(this, trim.toString(), imageButton, l));
        ((TextView) view.findViewById(R.id.ol_s_n)).setText(trim.toString());
        ((TextView) view.findViewById(R.id.ol_nandu)).setText("难度:" + ((Map) this.f5342b.get(i)).get("degree"));
        Double d = (Double) ((Map) this.f5342b.get(i)).get("degree");
        ((TextView) view.findViewById(R.id.ol_artist)).setText(((Map) this.f5342b.get(i)).get("artist").toString());
        TextView textView = (TextView) view.findViewById(R.id.ol_topuser);
        CharSequence obj = ((Map) this.f5342b.get(i)).get("topUser").toString();
        textView.setOnClickListener(new C1079dt(this, obj.toString()));
        textView.setText(obj);
        ((TextView) view.findViewById(R.id.ol_topscore)).setText("得分:" + ((Map) this.f5342b.get(i)).get("topScore"));
        ((TextView) view.findViewById(R.id.ol_update)).setText(((Map) this.f5342b.get(i)).get("update").toString());
        ((TextView) view.findViewById(R.id.ol_playcount)).setText("播放:" + ((Map) this.f5342b.get(i)).get("playCount"));
        ((ImageView) view.findViewById(R.id.ol_play_button)).setOnClickListener(new C1080du(this, trim.toString(), l, ((Integer) ((Map) this.f5342b.get(i)).get("topScore")).intValue(), d));
        return view;
    }
}
