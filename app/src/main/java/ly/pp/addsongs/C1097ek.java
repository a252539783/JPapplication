package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ek */
final class C1097ek implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayHall f5381a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5382b;
    /* renamed from: c */
    private final /* synthetic */ TextView f5383c;
    /* renamed from: d */
    private final /* synthetic */ RadioGroup f5384d;

    C1097ek(OLPlayHall oLPlayHall, TextView textView, TextView textView2, RadioGroup radioGroup) {
        this.f5381a = oLPlayHall;
        this.f5382b = textView;
        this.f5383c = textView2;
        this.f5384d = radioGroup;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        String valueOf = String.valueOf(this.f5382b.getText());
        String valueOf2 = String.valueOf(this.f5383c.getText());
        if (valueOf.equals("")) {
            Toast.makeText(this.f5381a, "请输入房间名称！", Toast.LENGTH_SHORT).show();
        } else if (valueOf.length() > 8) {
            Toast.makeText(this.f5381a, "确定字数在8个字之内！", Toast.LENGTH_SHORT).show();
        } else {
            OLPlayHall oLPlayHall = this.f5381a;
            if (valueOf2.equals("") || valueOf2.length() <= 8) {
                switch (this.f5384d.getCheckedRadioButtonId()) {
                    case R.id.group:
                        i2 = 1;
                        break;
                    case R.id.couple:
                        i2 = 2;
                        break;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("N", valueOf);
                    jSONObject.put("P", valueOf2);
                    jSONObject.put("M", i2);
                    this.f5381a.mo2824a((byte) 6, (byte) 0, this.f5381a.f4398n, jSONObject.toString());
                    jSONObject.toString();
                    dialogInterface.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Toast.makeText(this.f5381a, "确定密码在8个字之内！", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
