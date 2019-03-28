package ly.pp.addsongs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* renamed from: ly.pp.addsongs.s */
public final class C1344s extends BaseAdapter {
    /* renamed from: a */
    Context f6032a;
    /* renamed from: b */
    Integer[] f6033b;
    /* renamed from: c */
    PopupWindow f6034c;
    /* renamed from: d */
    ConnectionService f6035d;
    /* renamed from: e */
    byte f6036e;
    /* renamed from: f */
    byte f6037f;
    /* renamed from: g */
    byte f6038g;

    public C1344s(Context context, ConnectionService connectionService, Integer[] numArr, PopupWindow popupWindow, byte b, byte b2, byte b3) {
        this.f6032a = context;
        this.f6033b = numArr;
        this.f6034c = popupWindow;
        this.f6035d = connectionService;
        this.f6036e = b2;
        this.f6037f = b3;
        this.f6038g = b;
    }

    public final int getCount() {
        return this.f6033b.length;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View imageView = new ImageView(this.f6032a);
        imageView.setPadding(0, 0, 0, 0);
        ((ImageView) imageView).setImageResource(this.f6033b[i].intValue());
        imageView.setOnClickListener(new C1345t(this, i));
        return imageView;
    }
}
