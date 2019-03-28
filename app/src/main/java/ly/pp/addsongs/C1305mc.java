package ly.pp.addsongs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: ly.pp.addsongs.mc */
final class C1305mc extends BaseAdapter {
    /* renamed from: a */
    Context f5937a = null;
    /* renamed from: b */
    CharSequence[] f5938b;
    /* renamed from: c */
    CharSequence[] f5939c;
    /* renamed from: d */
    int f5940d = 0;
    /* renamed from: e */
    final /* synthetic */ SkinListPreference f5941e;

    public C1305mc(SkinListPreference skinListPreference, Context context, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.f5941e = skinListPreference;
        this.f5937a = context;
        this.f5938b = charSequenceArr;
        this.f5939c = charSequenceArr2;
        this.f5940d = charSequenceArr.length;
    }

    /* renamed from: a */
    public final void mo3544a(CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.f5938b = charSequenceArr;
        this.f5939c = charSequenceArr2;
        this.f5940d = charSequenceArr.length;
    }

    public final int getCount() {
        return this.f5940d;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f5937a).inflate(R.layout.ol_skin_view, null);
        }
        String valueOf = String.valueOf(this.f5939c[i]);
        ((TextView) view.findViewById(R.id.skin_name)).setText(this.f5938b[i]);
        Button button = (Button) view.findViewById(R.id.skin_dele);
        if (valueOf.equals("original") || valueOf.equals("more")) {
            button.setVisibility(View.GONE);
        } else {
            button.setVisibility(View.VISIBLE);
            button.setOnClickListener(new C1306md(this, valueOf));
        }
        button = (Button) view.findViewById(R.id.set_skin);
        if (valueOf.equals("more")) {
            button.setText("点击获取更多皮肤");
        } else {
            button.setText("设置皮肤");
        }
        button.setOnClickListener(new C1307me(this, valueOf));
        return view;
    }
}
