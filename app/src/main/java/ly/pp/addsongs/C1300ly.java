package ly.pp.addsongs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ly */
public final class C1300ly extends BaseAdapter {
    /* renamed from: a */
    int f5917a = 0;
    /* renamed from: b */
    JSONArray f5918b = null;
    /* renamed from: c */
    final /* synthetic */ SkinDownload f5919c;

    public C1300ly(SkinDownload skinDownload, JSONArray jSONArray) {
        this.f5919c = skinDownload;
        this.f5917a = jSONArray.length() + 1;
        this.f5918b = jSONArray;
    }

    public final int getCount() {
        return this.f5917a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5919c.f5009e.inflate(R.layout.skin_view, null);
        }
        view.setKeepScreenOn(true);
        ScrollText scrollText = (ScrollText) view.findViewById(R.id.skin_name);
        TextView textView = (TextView) view.findViewById(R.id.skin_author);
        TextView textView2 = (TextView) view.findViewById(R.id.download_count);
        TextView textView3 = (TextView) view.findViewById(R.id.skin_size);
        ImageView imageView = (ImageView) view.findViewById(R.id.skin_image);
        if (i == 0) {
            imageView.setImageResource(R.drawable.icon);
            scrollText.setText("还原默认皮肤");
            textView.setText("");
            textView3.setText("");
            textView2.setText("极品钢琴的默认皮肤");
            view.setOnClickListener(new C1301lz(this));
        } else {
            try {
            JSONObject jSONObject = this.f5918b.getJSONObject(i - 1);
            imageView.setTag(jSONObject.getString("I"));
            String string = jSONObject.getString("U");
            Object string2 = jSONObject.getString("N");
            String string3 = jSONObject.getString("A");
            int i2 = jSONObject.getInt("S");
            this.f5919c.f5006b.mo3027a(imageView, null);
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

            view.setOnClickListener(new C1303ma(this, string2.toString(), string, i2, string3));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return view;
    }
}
