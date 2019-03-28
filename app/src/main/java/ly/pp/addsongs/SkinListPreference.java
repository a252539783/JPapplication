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


/* renamed from: ly.pp.addsongs.SkinListPreference */
public class SkinListPreference extends DialogPreference {
    /* renamed from: a */
    CharSequence[] f5021a;
    /* renamed from: b */
    CharSequence[] f5022b;
    /* renamed from: c */
    LinkedList f5023c;
    /* renamed from: d */
    File f5024d;
    /* renamed from: e */
    C1305mc f5025e;
    /* renamed from: f */
    public Context f5026f;
    /* renamed from: g */
    private ListView f5027g = null;
    /* renamed from: h */
    private LinearLayout f5028h = null;
    /* renamed from: i */
   public  C1253ke f5029i;

    public SkinListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5026f = context;
    }

    /* renamed from: a */
    private void m3906a() {
        String str = Environment.getExternalStorageDirectory() + "/JustPiano/Skins";
        Context context = this.f5026f;
        this.f5023c = C1342p.m4157a(str);
        if (this.f5023c != null) {
            int size = this.f5023c.size();
            //"listFile != null    " + size;
            this.f5021a = new CharSequence[(size + 2)];
            this.f5022b = new CharSequence[(size + 2)];
            for (int i = 0; i < size; i++) {
                str = ((File) this.f5023c.get(i)).getName();
                this.f5021a[i] = str.subSequence(0, str.lastIndexOf("."));
                this.f5022b[i] = Environment.getExternalStorageDirectory() + "/JustPiano/Skins/" + ((File) this.f5023c.get(i)).getName();
            }
            this.f5021a[size] = "原生主题";
            this.f5022b[size] = "original";
            this.f5021a[size + 1] = "更多主题...";
            this.f5022b[size + 1] = "more";
            return;
        }
        this.f5021a = new CharSequence[1];
        this.f5022b = new CharSequence[1];
        this.f5021a[0] = "原生主题";
        this.f5022b[0] = "original";
        this.f5021a[1] = "更多主题...";
        this.f5022b[1] = "more";
    }

    /* renamed from: a */
    public final void mo3001a(String str) {
        int i = 0;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f5026f);
        if (!str.equals("original") && defaultSharedPreferences.getString("skin_list", "original").equals(str)) {
            file = this.f5026f.getDir("Skin", 0);
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    while (i < listFiles.length) {
                        listFiles[i].delete();
                        i++;
                    }
                }
            }
        }
        m3906a();
        this.f5025e.mo3544a(this.f5021a, this.f5022b);
        this.f5025e.notifyDataSetChanged();
    }

    protected void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
    }

    protected void onPrepareDialogBuilder(Builder builder) {
        m3906a();
        this.f5029i = new C1253ke(this.f5026f);
        this.f5028h = new LinearLayout(this.f5026f);
        this.f5028h.setLayoutParams(new LayoutParams(-1, -2));
        this.f5028h.setOrientation(LinearLayout.VERTICAL);
        this.f5028h.setMinimumWidth(400);
        this.f5028h.setPadding(20, 20, 20, 20);
        this.f5028h.setBackgroundColor(-1);
        this.f5027g = new ListView(this.f5026f);
        this.f5027g.setDivider(null);
        this.f5025e = new C1305mc(this, this.f5026f, this.f5021a, this.f5022b);
        this.f5027g.setAdapter(this.f5025e);
        this.f5028h.addView(this.f5027g);
        builder.setView(this.f5028h);
    }
}
