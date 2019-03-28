package ly.pp.addsongs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/* renamed from: ly.pp.addsongs.dq */
public final class C1076dq extends BaseAdapter {
    /* renamed from: a */
    final /* synthetic */ OLMelodySelect f5340a;

    public C1076dq(OLMelodySelect oLMelodySelect) {
        this.f5340a = oLMelodySelect;
    }

    public final int getCount() {
        return C1194i.f5598b.length;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f5340a.f4323l.inflate(R.layout.ol_f_view, null);
        inflate.setKeepScreenOn(true);
        TextView textView = (TextView) inflate.findViewById(R.id.ol_s_p);
        textView.setScrollBarStyle(33554432);
        textView.setText(C1194i.f5598b[i]);
        return inflate;
    }
}
