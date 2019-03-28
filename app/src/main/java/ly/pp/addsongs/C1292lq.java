package ly.pp.addsongs;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

/* renamed from: ly.pp.addsongs.lq */
public final class C1292lq extends BaseAdapter {
    /* renamed from: a */
    int f5900a = 0;
    /* renamed from: b */
    List f5901b = null;
    /* renamed from: c */
    final /* synthetic */ ShowTopInfo f5902c;

    public C1292lq(ShowTopInfo showTopInfo, int i, List list) {
        this.f5902c = showTopInfo;
        this.f5900a = i;
        this.f5901b = list;
        showTopInfo.f5002r = new Handler(showTopInfo);
        showTopInfo.f5001q = new C0978a(showTopInfo.f5002r, 0);
    }

    public final int getCount() {
        return this.f5900a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object obj;
        if (view == null) {
            view = this.f5902c.f4986b.inflate(R.layout.ol_top_view, null);
        }
        view.setKeepScreenOn(true);
        TextView textView = (TextView) view.findViewById(R.id.ol_position_top);
        TextView textView2 = (TextView) view.findViewById(R.id.ol_user_top);
        TextView textView3 = (TextView) view.findViewById(R.id.ol_score_top);
        TextView textView4 = (TextView) view.findViewById(R.id.ol_nuns_top);
        ImageView imageView = (ImageView) view.findViewById(R.id.user_face);
        imageView.setTag(((Map) this.f5901b.get(i)).get("faceID").toString());
        this.f5902c.f5001q.mo3027a(imageView, this.f5902c.m3874a(this.f5902c));
        textView.setText(String.valueOf(this.f5902c.f4997m + i));
        Object obj2 = ((Map) this.f5901b.get(i)).get("userName").toString();
        textView2.setText(obj2.toString());
        ImageView imageView2 = (ImageView) view.findViewById(R.id.ol_user_sex);
        if (((Map) this.f5901b.get(i)).get("userSex").toString().equals("f")) {
            imageView2.setImageResource(R.drawable.f);
        } else {
            imageView2.setImageResource(R.drawable.m);
        }
        int intValue = ((Integer) ((Map) this.f5901b.get(i)).get("userScore")).intValue();
        if (this.f5902c.f4991g == 4) {
            obj = "等级:";
            textView3.setText("经验:" + intValue);
        } else if (this.f5902c.f4991g == 10) {
            obj = "等级:";
            int i2 = intValue / 10;
            textView3.setText("" + i2 + "级" + ((intValue % 10) + 1) + "阶");
            textView3.setTextColor(-65536);
        } else {
            obj = "冠军:";
            textView3.setText("总分:" + intValue);
        }
        textView4.setText(new StringBuilder(String.valueOf(obj)).append(((Map) this.f5901b.get(i)).get("userNuns")).toString());
        view.setOnClickListener(new C1293lr(this, obj2.toString()));
        return view;
    }
}
