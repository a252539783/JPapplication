package ly.pp.addsongs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: ly.pp.addsongs.mv */
final class C1324mv extends BaseAdapter {
    /* renamed from: a */
    Context f5982a = null;
    /* renamed from: b */
    CharSequence[] f5983b;
    /* renamed from: c */
    CharSequence[] f5984c;
    /* renamed from: d */
    int f5985d = 0;
    /* renamed from: e */
    final /* synthetic */ SoundListPreference f5986e;

    public C1324mv(SoundListPreference soundListPreference, Context context, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.f5986e = soundListPreference;
        this.f5982a = context;
        this.f5983b = charSequenceArr;
        this.f5984c = charSequenceArr2;
        this.f5985d = charSequenceArr.length;
    }

    /* renamed from: a */
    public final void mo3583a(CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.f5983b = charSequenceArr;
        this.f5984c = charSequenceArr2;
        this.f5985d = charSequenceArr.length;
    }

    public final int getCount() {
        return this.f5985d;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f5982a).inflate(R.layout.ol_skin_view, null);
        }
        String valueOf = String.valueOf(this.f5984c[i]);
        ((TextView) view.findViewById(R.id.skin_name)).setText(this.f5983b[i]);
        Button button = (Button) view.findViewById(R.id.skin_dele);
        if (valueOf.equals("original") || valueOf.equals("more")) {
            button.setVisibility(View.GONE);
        } else {
            button.setVisibility(View.VISIBLE);
            button.setOnClickListener(new C1325mw(this, valueOf));
        }
        button = (Button) view.findViewById(R.id.set_skin);
        if (valueOf.equals("more")) {
            button.setText("点击获取更多音源");
        } else {
            button.setText("设置音源");
        }
        button.setOnClickListener(new C1326mx(this, valueOf, i));
        return view;
    }
}
