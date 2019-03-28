package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ly.pp.addsongs.cx */
final class C1056cx implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLMainMode f5304a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5305b;
    /* renamed from: c */
    private final /* synthetic */ TextView f5306c;
    /* renamed from: d */
    private final /* synthetic */ TextView f5307d;

    C1056cx(OLMainMode oLMainMode, TextView textView, TextView textView2, TextView textView3) {
        this.f5304a = oLMainMode;
        this.f5305b = textView;
        this.f5306c = textView2;
        this.f5307d = textView3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f5305b.getText());
        CharSequence valueOf2 = String.valueOf(this.f5306c.getText());
        String valueOf3 = String.valueOf(this.f5307d.getText());
        Matcher matcher = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$").matcher(valueOf2);
        if (valueOf.length() == 0) {
            Toast.makeText(this.f5304a, "请输入密码！", Toast.LENGTH_SHORT).show();
        } else if (!valueOf3.equals(valueOf2)) {
            Toast.makeText(this.f5304a, "两次输入的邮箱地址不一致！", Toast.LENGTH_SHORT).show();
        } else if (matcher.matches()) {
            new C1062dc(this.f5304a).execute(valueOf, (String)valueOf2, "0");
            dialogInterface.dismiss();
        } else {
            Toast.makeText(this.f5304a, "请输入正确的邮箱格式！", Toast.LENGTH_SHORT).show();
        }
    }
}
