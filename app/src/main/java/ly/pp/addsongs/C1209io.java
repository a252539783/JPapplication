package ly.pp.addsongs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

/* renamed from: ly.pp.addsongs.io */
public final class C1209io extends BaseAdapter {
    /* renamed from: a */
    int f5668a = 0;
    /* renamed from: b */
    List f5669b = null;
    /* renamed from: c */
    LayoutInflater f5670c;
    /* renamed from: d */
    int f5671d = 0;
    /* renamed from: e */
    private int[] f5672e = new int[]{R.drawable.back_puased, R.drawable.v1_name, R.drawable.v6_name};
    /* renamed from: f */
    private int[] f5673f = new int[]{R.drawable.back_puased, R.drawable.back_puased, R.drawable.v1_name, R.drawable.v1_name, R.drawable.v6_name, R.drawable.v6_name};

    public C1209io(List list, LayoutInflater layoutInflater, int i) {
        this.f5668a = list.size();
        this.f5669b = list;
        this.f5670c = layoutInflater;
        this.f5671d = i;
    }

    /* renamed from: a */
    public final void mo3332a(List list) {
        this.f5669b = list;
        this.f5668a = list.size();
    }

    public final int getCount() {
        return this.f5668a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        Exception exception;
        Exception e;
        int i2;
        CharSequence obj32;
        CharSequence obj4;
        CharSequence charSequence;
        View inflate = this.f5670c.inflate(R.layout.ol_score_v, null);
        inflate.setKeepScreenOn(true);
        try {
            String str2 = (String) ((Map) this.f5669b.get(i)).get("U");
            try {
                str = (String) ((Map) this.f5669b.get(i)).get("M");
            } catch (Exception e2) {
                e2.printStackTrace();
                inflate.setVisibility(View.GONE);
                return inflate;
            }
            try {
                obj4 = (String) ((Map) this.f5669b.get(i)).get("S");
            } catch (Exception e3) {
                e3.printStackTrace();
                inflate.setVisibility(View.GONE);
                return inflate;
            }
            try {
                obj32 = str2;
                String str3 = str;
                i2 = Integer.valueOf((String) ((Map) this.f5669b.get(i)).get("G")).intValue();
                charSequence = str3;
            } catch (Exception e4) {
                exception = e4;
                e = exception;
                e.printStackTrace();
                inflate.setVisibility(View.GONE);
                return inflate;
            }
        } catch (Exception e5) {
            e = e5;
            e.printStackTrace();
            inflate.setVisibility(View.GONE);
            return inflate;
        }
        if (obj32 != null || obj32.equals("")) {
            inflate.setVisibility(View.GONE);
        } else {
            TextView textView = (TextView) inflate.findViewById(R.id.ol_user_text);
            if (this.f5671d == 1 && i2 > 0) {
                textView.setBackgroundResource(this.f5672e[i2 - 1]);
            } else if (this.f5671d == 2 && i2 > 0) {
                textView.setBackgroundResource(this.f5673f[i2 - 1]);
            } else if (this.f5671d == 0) {
                textView.setBackgroundResource(this.f5672e[0]);
            }
            textView.setText(obj32);
            ((TextView) inflate.findViewById(R.id.ol_msg_text)).setText(charSequence);
            ((TextView) inflate.findViewById(R.id.ol_state_text)).setText(obj4);
        }
        return inflate;
    }
}
