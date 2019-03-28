package ly.pp.addsongs;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.mr */
public final class C1320mr extends BaseAdapter {
    /* renamed from: a */
    int f5971a = 0;
    /* renamed from: b */
    JSONArray f5972b = null;
    /* renamed from: c */
    final /* synthetic */ SoundDownload f5973c;

    public C1320mr(SoundDownload soundDownload, JSONArray jSONArray) {
        this.f5973c = soundDownload;
        this.f5971a = jSONArray.length() + 1;
        this.f5972b = jSONArray;
    }

    public final int getCount() {
        return this.f5971a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5973c.f5034e.inflate(R.layout.skin_view, null);
        }
        view.setKeepScreenOn(true);
        view.setBackgroundResource(R.drawable.selector_ol_orange);
        ScrollText scrollText = (ScrollText) view.findViewById(R.id.skin_name);
        TextView textView = (TextView) view.findViewById(R.id.skin_author);
        TextView textView2 = (TextView) view.findViewById(R.id.download_count);
        TextView textView3 = (TextView) view.findViewById(R.id.skin_size);
        ImageView imageView = (ImageView) view.findViewById(R.id.skin_image);
        if (i == 0) {
                imageView.setImageResource(R.drawable.icon);
                scrollText.setText("还原默认音源");
                textView.setText("");
                textView3.setText("");
                textView2.setText("还原极品钢琴的默认音源");
                view.setOnClickListener(new C1321ms(this));
        } else {
            try {
                JSONObject jSONObject = this.f5972b.getJSONObject(i - 1);
                imageView.setTag(jSONObject.getString("I"));
                String string = jSONObject.getString("U");
                Object string2 = jSONObject.getString("N");
                String string3 = jSONObject.getString("A");
                int i2 = jSONObject.getInt("S");
                this.f5973c.f5031b.mo3027a(imageView, null);
                Log.e("JustPiano", "position:" + i);
                scrollText.setText(string2.toString());
                textView.setText("by:" + string3);
                textView3.setText(new StringBuilder(String.valueOf(i2)).append("KB").toString());
                int i3 = jSONObject.getInt("D");
                if (i3 / 10000 > 0) {
                    i3 /= 10000;
                }
                if (i3 == jSONObject.getInt("D")) {
                    textView2.setText("下载:" + i3);
                } else {
                    textView2.setText("下载:" + i3 + "万次");
                }
                view.setOnClickListener(new C1322mt(this, string2.toString(), string, i2, string3));
            }catch(JSONException e){
                e.printStackTrace();
            }
        }
        return view;
    }
}
