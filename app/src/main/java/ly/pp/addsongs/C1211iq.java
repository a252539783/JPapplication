package ly.pp.addsongs;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: ly.pp.addsongs.iq */
public final class C1211iq extends BaseAdapter {
    /* renamed from: a */
    private ArrayList f5675a = new ArrayList();
    /* renamed from: b */
    private Activity f5676b = null;
    /* renamed from: c */
    public Handler f5677c;

    public C1211iq(Activity activity, Handler handler, ArrayList arrayList) {
        this.f5676b = activity;
        this.f5677c = handler;
        this.f5675a = arrayList;
    }

    public final int getCount() {
        return this.f5675a.size();
    }

    public final Object getItem(int i) {
        return this.f5675a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1339nj c1339nj;
        if (view == null) {
            c1339nj = new C1339nj();
            view = LayoutInflater.from(this.f5676b).inflate(R.layout.page_list, null);
            c1339nj.f6012a = (TextView) view.findViewById(R.id.page_item);
            view.setTag(c1339nj);
        } else {
            c1339nj = (C1339nj) view.getTag();
        }
        c1339nj.f6012a.setText((CharSequence) this.f5675a.get(i));
        c1339nj.f6012a.setOnClickListener(new C1212ir(this, i));
        return view;
    }
}
