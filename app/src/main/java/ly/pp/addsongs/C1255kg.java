package ly.pp.addsongs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

/* renamed from: ly.pp.addsongs.kg */
public final class C1255kg extends BaseAdapter {
    /* renamed from: a */
    int f5786a = 0;
    /* renamed from: b */
    List f5787b = null;
    /* renamed from: c */
    JPApplication f5788c;
    /* renamed from: d */
    RecordFiles f5789d;

    public C1255kg(List list, JPApplication jPApplication, RecordFiles recordFiles) {
        this.f5786a = list.size();
        this.f5787b = list;
        this.f5788c = jPApplication;
        this.f5789d = recordFiles;
    }

    /* renamed from: a */
    public final void mo3422a(List list) {
        this.f5787b = list;
        this.f5786a = this.f5787b.size();
    }

    public final int getCount() {
        return this.f5786a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f5789d).inflate(R.layout.fileimageandtext, null);
        }
        view.setKeepScreenOn(true);
        String str = (String) ((Map) this.f5787b.get(i)).get("filenames");
        String str2 = (String) ((Map) this.f5787b.get(i)).get("time");
        String str3 = (String) ((Map) this.f5787b.get(i)).get("path");
        ImageView imageView = (ImageView) view.findViewById(R.id.deleteview);
        ((TextView) view.findViewById(R.id.txtview)).setText(str);
        ((TextView) view.findViewById(R.id.timeview)).setText(str2);
        ((ImageView) view.findViewById(R.id.playview)).setOnClickListener(new C1256kh(this, str3));
        imageView.setOnClickListener(new C1257ki(this, i, str, str3));
        return view;
    }
}
