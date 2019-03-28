package ly.pp.addsongs;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: ly.pp.addsongs.dv */
public final class C1081dv extends BaseAdapter {
    /* renamed from: a */
    int f5355a = 0;
    /* renamed from: b */
    List f5356b = null;
    /* renamed from: c */
    LayoutInflater f5357c;
    /* renamed from: d */
    Activity f5358d;

    public C1081dv(List list, LayoutInflater layoutInflater) {
        this.f5355a = list.size();
        this.f5356b = list;
        this.f5357c = layoutInflater;
        C1268kt.m4107a();
        if (C1268kt.m4109b() instanceof OLPlayRoom) {
            C1268kt.m4107a();
            this.f5358d = (OLPlayRoom) C1268kt.m4109b();
            return;
        }
        C1268kt.m4107a();
        if (C1268kt.m4109b() instanceof OLPlayHall) {
            C1268kt.m4107a();
            this.f5358d = (OLPlayHall) C1268kt.m4109b();
        }
    }

    public final int getCount() {
        return this.f5355a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        View inflate = this.f5357c.inflate(R.layout.ol_msg_view, null);
        inflate.setKeepScreenOn(true);
        Bundle bundle = (Bundle) this.f5356b.get(i);
        String string = bundle.getString("U");
        CharSequence string2 = bundle.getString("M");
        int i2 = bundle.getInt("T");
        TextView textView2;
        if (i2 == 0) {
            String string3 = bundle.getString("I");
            if (!string3.equals("")) {
                String str = "songs/" + string3 + ".pm";
                textView = (TextView) inflate.findViewById(R.id.ol_user_text);
                textView.setText("[荐]" + string);
                textView2 = (TextView) inflate.findViewById(R.id.ol_msg_text);
                String[] a = ((OLPlayRoom) this.f5358d).mo2864a(str);
                textView2.setText(new StringBuilder(String.valueOf(string2)).append(a[0]).append("[难度:").append(a[1]).append("]").toString());
                textView2.setTextColor(-65536);
                if (((OLPlayRoom) this.f5358d).mo2869e().equals("H")) {
                    textView2.append("(点击选取)");
                    textView2.setOnClickListener(new C1082dw(this, string3));
                }
            }
            textView = null;
        } else if (i2 == 1) {
            int i3 = bundle.getInt("V");
            if (!string2.toString().startsWith("//")) {
                textView = (TextView) inflate.findViewById(R.id.ol_user_text);
                textView.setText("[公]" + string);
                textView2 = (TextView) inflate.findViewById(R.id.ol_user_mao);
                TextView textView3 = (TextView) inflate.findViewById(R.id.ol_msg_text);
                textView3.setText(string2);
                switch (i3) {
                    case 1:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v1));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v1));
                        textView3.setTextColor(this.f5358d.getResources().getColor(R.color.v1));
                        break;
                    case 2:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v2));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v2));
                        textView3.setTextColor(this.f5358d.getResources().getColor(R.color.v2));
                        break;
                    case 3:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v3));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v3));
                        textView3.setTextColor(this.f5358d.getResources().getColor(R.color.v3));
                        break;
                    case 4:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v4));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v4));
                        textView3.setTextColor(this.f5358d.getResources().getColor(R.color.v4));
                        break;
                    case 5:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v5));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v5));
                        textView3.setTextColor(this.f5358d.getResources().getColor(R.color.v5));
                        break;
                }
            }
            try {
                textView = (TextView) inflate.findViewById(R.id.ol_user_text);
                textView.setText("[公]" + string);
                textView2 = (TextView) inflate.findViewById(R.id.ol_user_mao);
                ((ImageView) inflate.findViewById(R.id.ol_express_image)).setImageResource(C1194i.f5605i[Integer.valueOf(string2.toString().substring(2)).intValue()].intValue());
                switch (i3) {
                    case 1:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v1));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v1));
                        break;
                    case 2:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v2));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v2));
                        break;
                    case 3:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v3));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v3));
                        break;
                    case 4:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v4));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v4));
                        break;
                    case 5:
                        textView.setTextColor(this.f5358d.getResources().getColor(R.color.v5));
                        textView2.setTextColor(this.f5358d.getResources().getColor(R.color.v5));
                        break;
                }
            } catch (Exception e) {
                textView = (TextView) inflate.findViewById(R.id.ol_user_text);
                textView.setText("[公]" + string);
                ((TextView) inflate.findViewById(R.id.ol_msg_text)).setText(string2);
            }
        } else if (i2 == 2) {
            textView = (TextView) inflate.findViewById(R.id.ol_user_text);
            textView.setText("[私]" + string);
            textView.setTextColor(-16711936);
            textView2 = (TextView) inflate.findViewById(R.id.ol_msg_text);
            ((TextView) inflate.findViewById(R.id.ol_user_mao)).setTextColor(-16711936);
            textView2.setText(string2);
            textView2.setTextColor(-16711936);
        } else if (i2 == 3) {
            textView = (TextView) inflate.findViewById(R.id.ol_user_text);
            textView.setText("[系统消息]" + string);
            textView.setTextColor(-16711681);
            textView2 = (TextView) inflate.findViewById(R.id.ol_msg_text);
            ((TextView) inflate.findViewById(R.id.ol_user_mao)).setTextColor(-16711681);
            textView2.setText(string2);
            textView2.setTextColor(-16711681);
        } else {
            if (i2 == 18) {
                textView = (TextView) inflate.findViewById(R.id.ol_user_text);
                textView.setText("[全服消息]" + string);
                textView.setTextColor(-16711681);
                textView2 = (TextView) inflate.findViewById(R.id.ol_msg_text);
                ((TextView) inflate.findViewById(R.id.ol_user_mao)).setTextColor(-16711681);
                textView2.setText(string2);
                textView2.setTextColor(-16711681);
            }
            textView = null;
        }
        if (!(i2 == 3 || textView == null)) {
            textView.setOnClickListener(new C1083dx(this, string));
        }
        return inflate;
    }
}
