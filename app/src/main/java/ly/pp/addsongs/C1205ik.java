package ly.pp.addsongs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import java.util.List;

/* renamed from: ly.pp.addsongs.ik */
public final class C1205ik extends BaseAdapter {
    /* renamed from: a */
    int f5654a = 0;
    /* renamed from: b */
    List f5655b = null;
    /* renamed from: c */
    LayoutInflater f5656c;
    /* renamed from: d */
    OLPlayHall f5657d;
    /* renamed from: e */
    private int[] f5658e = new int[]{R.drawable.title_bar, R.drawable.v1_name, R.drawable.v2_name, R.drawable.v3_name, R.drawable.v4_name, R.drawable.v5_name, R.drawable.v6_name, R.drawable.v7_name, R.drawable.v8_name, R.drawable.v9_name, R.drawable.v10_name, R.drawable.v11_name, R.drawable.v12_name, R.drawable.v13_name};
    /* renamed from: f */
    private int[] f5659f = new int[]{R.drawable.back_puased, R.drawable.v1_name, R.drawable.v6_name};

    public C1205ik(List list, LayoutInflater layoutInflater, OLPlayHall oLPlayHall) {
        this.f5654a = list.size();
        this.f5655b = list;
        this.f5656c = layoutInflater;
        this.f5657d = oLPlayHall;
    }

    /* renamed from: a */
    public final void mo3324a(List list) {
        this.f5655b = list;
        this.f5654a = list.size();
    }

    public final int getCount() {
        return this.f5654a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5656c.inflate(R.layout.ol_room_view, null);
        }
        view.setKeepScreenOn(true);
        CharSequence string = ((Bundle) this.f5655b.get(i)).getString("N");
        int i2 = ((Bundle) this.f5655b.get(i)).getInt("V");
        byte b = ((Bundle) this.f5655b.get(i)).getByte("I");
        ((TextView) view.findViewById(R.id.ol_room_id)).setText(String.valueOf(b));
        Boolean valueOf = Boolean.valueOf(((Bundle) this.f5655b.get(i)).getBoolean("IF"));
        int i3 = ((Bundle) this.f5655b.get(i)).getInt("IP");
        int i4 = ((Bundle) this.f5655b.get(i)).getInt("D");
        int i5 = ((Bundle) this.f5655b.get(i)).getInt("PA");
        ((GridView) view.findViewById(R.id.ol_player_grid)).setAdapter(new C1263ko(this.f5657d, ((Bundle) this.f5655b.get(i)).getIntArray("UA")));
        TextView textView = (TextView) view.findViewById(R.id.ol_room_name);
        textView.setText(string);
        textView.setBackgroundResource(this.f5658e[i2]);
        textView.setOnClickListener(new C1206il(this, b));
        Button button = (Button) view.findViewById(R.id.ol_getin_button);
        if (i3 == 1) {
            button.setText("弹奏中");
        } else if (valueOf.booleanValue()) {
            button.setText("已满");
        } else if (i5 == 1) {
            button.setText("加密");
            button.setOnClickListener(new C1207im(this, i5, b));
        } else if (i5 == 0) {
            button.setText("进入");
            button.setOnClickListener(new C1208in(this, i5, b));
        }
        textView = (TextView) view.findViewById(R.id.ol_room_mode);
        string = "普通";
        switch (i4) {
            case 0:
                string = "普通";
                break;
            case 1:
                string = "组队";
                break;
            case 2:
                string = "双人";
                break;
        }
        if (i4 >= 0 && i4 < 3) {
            textView.setBackgroundResource(this.f5659f[i4]);
        }
        textView.setText(string);
        return view;
    }
}
