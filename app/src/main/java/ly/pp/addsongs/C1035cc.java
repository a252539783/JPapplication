package ly.pp.addsongs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

/* renamed from: ly.pp.addsongs.cc */
public final class C1035cc extends BaseAdapter {
    /* renamed from: a */
    int f5245a = 0;
    /* renamed from: b */
    List f5246b = null;
    /* renamed from: c */
    LayoutInflater f5247c;
    /* renamed from: d */
    int f5248d = 0;
    /* renamed from: e */
    private int[] f5249e = new int[]{R.drawable.back_puased, R.drawable.v1_name, R.drawable.v6_name};
    /* renamed from: f */
    private int[] f5250f = new int[]{R.drawable.back_puased, R.drawable.back_puased, R.drawable.v1_name, R.drawable.v1_name, R.drawable.v6_name, R.drawable.v6_name};

    public C1035cc(List list, LayoutInflater layoutInflater, int i) {
        this.f5245a = list.size();
        this.f5246b = list;
        this.f5247c = layoutInflater;
        this.f5248d = i;
    }

    public final int getCount() {
        return this.f5245a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5247c.inflate(R.layout.ol_c_finish_view, null);
        }
        view.setKeepScreenOn(true);
        String str = (String) ((Map) this.f5246b.get(i)).get("N");
        ((Map) this.f5246b.get(i)).get("S");
        String str2 = (String) ((Map) this.f5246b.get(i)).get("I");
        String str3 = (String) ((Map) this.f5246b.get(i)).get("SC");
        String str4 = (String) ((Map) this.f5246b.get(i)).get("P");
        String str5 = (String) ((Map) this.f5246b.get(i)).get("C");
        String str6 = (String) ((Map) this.f5246b.get(i)).get("G");
        String str7 = (String) ((Map) this.f5246b.get(i)).get("B");
        String str8 = (String) ((Map) this.f5246b.get(i)).get("M");
        String str9 = (String) ((Map) this.f5246b.get(i)).get("T");
        String str10 = (String) ((Map) this.f5246b.get(i)).get("E");
        int intValue = Integer.valueOf((String) ((Map) this.f5246b.get(i)).get("GR")).intValue();
        ((TextView) view.findViewById(R.id.ol_name)).setText(str);
        ((TextView) view.findViewById(R.id.ol_perfect)).setText(str4);
        ((TextView) view.findViewById(R.id.ol_cool)).setText(str5);
        ((TextView) view.findViewById(R.id.ol_great)).setText(str6);
        ((TextView) view.findViewById(R.id.ol_bad)).setText(str7);
        ((TextView) view.findViewById(R.id.ol_miss)).setText(str8);
        ((TextView) view.findViewById(R.id.ol_combo)).setText(str9);
        TextView textView = (TextView) view.findViewById(R.id.ol_total);
        if (str2.equals("P")) {
            textView.setText("弹奏中");
        } else {
            textView.setText(str3);
        }
        ((TextView) view.findViewById(R.id.ol_exp)).setText(str10);
        if (this.f5248d == 2 && intValue > 0) {
            view.setBackgroundResource(this.f5250f[intValue - 1]);
        } else if (this.f5248d == 1 && intValue > 0) {
            view.setBackgroundResource(this.f5249e[intValue - 1]);
        }
        return view;
    }
}
