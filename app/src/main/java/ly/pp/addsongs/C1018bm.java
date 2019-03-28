package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.bm */
final class C1018bm implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ MelodySelect f5161a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5162b;

    C1018bm(MelodySelect melodySelect, TextView textView) {
        this.f5161a = melodySelect;
        this.f5162b = textView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f5162b.getText());
        if (valueOf.equals("")) {
            Toast.makeText(this.f5161a, "请输入曲谱的关键字！", Toast.LENGTH_SHORT).show();
        } else if (valueOf.contains("'")) {
            Toast.makeText(this.f5161a, "关键词中请勿输入单引号！", Toast.LENGTH_SHORT).show();
        } else {
            dialogInterface.dismiss();
            this.f5161a.f4270z = this.f5161a.f4252h.query("jp_data", null, "name like '%" + valueOf + "%' AND " + this.f5161a.f4238O, null, null, null, this.f5161a.f4260p);
            int count = this.f5161a.f4270z.getCount();
            if (this.f5161a.f4270z.getCount() == 0) {
                Toast.makeText(this.f5161a, "未搜索到与 " + valueOf + " 有关的曲目！", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this.f5161a, "搜索到" + count + "首与 " + valueOf + " 有关的曲目！", Toast.LENGTH_SHORT).show();
            this.f5161a.mo2784a(this.f5161a.f4270z);
        }
    }
}
