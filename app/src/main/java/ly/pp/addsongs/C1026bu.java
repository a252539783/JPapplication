package ly.pp.addsongs;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Map;



/* renamed from: ly.pp.addsongs.bu */
public final class C1026bu extends BaseAdapter {
    /* renamed from: a */
    int f5189a = 0;
    /* renamed from: b */
    List f5190b = null;
    /* renamed from: c */
    final /* synthetic */ MoreAppActivity f5191c;

    public C1026bu(MoreAppActivity moreAppActivity, int i, List list) {
        this.f5191c = moreAppActivity;
        this.f5189a = i;
        this.f5190b = list;
        moreAppActivity.f4275e = new Handler(moreAppActivity);
        moreAppActivity.f4274d = new C0978a(moreAppActivity.f4275e, 2);
    }

    public final int getCount() {
        return this.f5189a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5191c.f4276f.inflate(R.layout.app_cell, null);
        }
        view.setKeepScreenOn(true);
        TextView textView = view.findViewById(R.id.app_name);
        TextView textView2 = view.findViewById(R.id.app_size);
        TextView textView3 = view.findViewById(R.id.app_content);
        ImageView imageView = view.findViewById(R.id.app_icon);
        imageView.setTag(((Map) this.f5190b.get(i)).get("icon").toString());
        textView.setText(((Map) this.f5190b.get(i)).get("name").toString());
        textView2.setText(((Map) this.f5190b.get(i)).get("size").toString());
        textView3.setText(((Map) this.f5190b.get(i)).get("content").toString());
        view.setOnClickListener(new C1027bv(this, ((Map) this.f5190b.get(i)).get("apk").toString()));
        this.f5191c.f4274d.mo3027a(imageView, null);
        return view;
    }
}
