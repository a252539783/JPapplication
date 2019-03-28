package ly.pp.addsongs;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.DialogPreference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import java.io.File;
import java.util.LinkedList;


/* renamed from: ly.pp.addsongs.SoundListPreference */
public class SoundListPreference extends DialogPreference {
    /* renamed from: a */
    CharSequence[] f5046a;
    /* renamed from: b */
    CharSequence[] f5047b;
    /* renamed from: c */
    LinkedList f5048c;
    /* renamed from: d */
    C1324mv f5049d;
    /* renamed from: e */
    public Context f5050e;
    /* renamed from: f */
    private ListView f5051f = null;
    /* renamed from: g */
    private LinearLayout f5052g = null;
    /* renamed from: h */
    public C1253ke f5053h;

    public SoundListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5050e = context;
    }

    /* renamed from: a */
    private void m3922a() {
        String str = Environment.getExternalStorageDirectory() + "/JustPiano/Sounds";
        Context context = this.f5050e;
        this.f5048c = C1342p.m4158b(str);
        if (this.f5048c != null) {
            int size = this.f5048c.size();
            this.f5046a = new CharSequence[(size + 2)];
            this.f5047b = new CharSequence[(size + 2)];
            for (int i = 0; i < size; i++) {
                str = ((File) this.f5048c.get(i)).getName();
                this.f5046a[i] = str.subSequence(0, str.lastIndexOf("."));
                this.f5047b[i] = Environment.getExternalStorageDirectory() + "/JustPiano/Sounds/" + ((File) this.f5048c.get(i)).getName();
            }
            this.f5046a[size] = "原生音源";
            this.f5047b[size] = "original";
            this.f5046a[size + 1] = "更多音源...";
            this.f5047b[size + 1] = "more";
            return;
        }
        this.f5046a = new CharSequence[1];
        this.f5047b = new CharSequence[1];
        this.f5046a[0] = "原生音源";
        this.f5047b[0] = "original";
        this.f5046a[1] = "更多音源...";
        this.f5047b[1] = "more";
    }

    /* renamed from: a */
    public final void mo3014a(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f5050e);
        if (!str.equals("original") && defaultSharedPreferences.getString("sound_list", "original").equals(str)) {
            file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Sounds/Sound");
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            }
        }
        m3922a();
        this.f5049d.mo3583a(this.f5046a, this.f5047b);
        this.f5049d.notifyDataSetChanged();
    }

    protected void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
    }

    protected void onPrepareDialogBuilder(Builder builder) {
        m3922a();
        this.f5053h = new C1253ke(this.f5050e);
        this.f5052g = new LinearLayout(this.f5050e);
        this.f5052g.setLayoutParams(new LayoutParams(-1, -2));
        this.f5052g.setOrientation(LinearLayout.VERTICAL);
        this.f5052g.setMinimumWidth(400);
        this.f5052g.setPadding(20, 20, 20, 20);
        this.f5052g.setBackgroundColor(-1);
        this.f5051f = new ListView(this.f5050e);
        this.f5051f.setDivider(null);
        this.f5049d = new C1324mv(this, this.f5050e, this.f5046a, this.f5047b);
        this.f5051f.setAdapter(this.f5049d);
        this.f5052g.addView(this.f5051f);
        builder.setView(this.f5052g);
    }
}
