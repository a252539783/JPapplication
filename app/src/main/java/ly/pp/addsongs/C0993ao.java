package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ly.pp.addsongs.ao */
final class C0993ao implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ Login f5120a;
    /* renamed from: b */
    private final /* synthetic */ EditText f5121b;
    /* renamed from: c */
    private final /* synthetic */ EditText f5122c;

    C0993ao(Login login, EditText editText, EditText editText2) {
        this.f5120a = login;
        this.f5121b = editText;
        this.f5122c = editText2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f5121b.getText());
        Matcher matcher = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$").matcher(String.valueOf(this.f5122c.getText()));
        if (valueOf.length() == 0) {
            Toast.makeText(this.f5120a, "请输入找回密码的账号！", Toast.LENGTH_SHORT).show();
        } else if (matcher.matches()) {
            new C1001aw(this.f5120a).execute(valueOf, String.valueOf(this.f5122c.getText()), "1");
            dialogInterface.dismiss();
        } else {
            Toast.makeText(this.f5120a, "请输入正确的邮箱格式！", Toast.LENGTH_SHORT).show();
        }
    }
}
