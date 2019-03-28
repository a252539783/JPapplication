package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.nb */
final class C1331nb implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ UsersInfo f5997a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5998b;
    /* renamed from: c */
    private final /* synthetic */ TextView f5999c;
    /* renamed from: d */
    private final /* synthetic */ TextView f6000d;
    /* renamed from: e */
    private final /* synthetic */ CheckBox f6001e;
    /* renamed from: f */
    private final /* synthetic */ CheckBox f6002f;

    C1331nb(UsersInfo usersInfo, TextView textView, TextView textView2, TextView textView3, CheckBox checkBox, CheckBox checkBox2) {
        this.f5997a = usersInfo;
        this.f5998b = textView;
        this.f5999c = textView2;
        this.f6000d = textView3;
        this.f6001e = checkBox;
        this.f6002f = checkBox2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f5998b.getText());
        String valueOf2 = String.valueOf(this.f5999c.getText());
        String valueOf3 = String.valueOf(this.f6000d.getText());
        if (valueOf.equals("") || valueOf2.equals("") || valueOf3.equals("")) {
            Toast.makeText(this.f5997a, "请填写完全部的密码框！", Toast.LENGTH_SHORT).show();
        } else if (valueOf2.length() <= 5 || valueOf3.length() <= 5 || valueOf2.length() > 20 || valueOf3.length() > 20) {
            Toast.makeText(this.f5997a, "新密码长度应在5-20个字符", Toast.LENGTH_SHORT).show();
        } else if (valueOf2.equals(valueOf3)) {
            this.f5997a.f5058b = this.f6001e.isChecked();
            this.f5997a.f5059c = this.f6002f.isChecked();
            new C1337nh(this.f5997a).execute("P", valueOf, valueOf3);
            dialogInterface.dismiss();
        } else {
            Toast.makeText(this.f5997a, "两次输入密码不一致", Toast.LENGTH_SHORT).show();
        }
    }
}
