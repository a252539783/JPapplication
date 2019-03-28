package ly.pp.addsongs;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/* renamed from: ly.pp.addsongs.RecordFiles */
public class RecordFiles extends Activity {
    /* renamed from: a */
    AudioTrack f4916a = null;
    /* renamed from: b */
    List f4917b = null;
    /* renamed from: c */
    int f4918c = 0;
    /* renamed from: d */
    private ListView f4919d;
    /* renamed from: e */
    private String f4920e;
    /* renamed from: f */
    private TextView f4921f;
    /* renamed from: g */
    private LayoutInflater f4922g;
    /* renamed from: h */
    private int[] f4923h = new int[]{R.drawable.umeng_socialize_share_music, R.drawable.umeng_socialize_share_music, R.drawable.umeng_socialize_share_music};
    /* renamed from: i */
    private File[] f4924i;
    /* renamed from: j */
    private C1255kg f4925j;
    /* renamed from: k */
    private JPApplication f4926k;

    /* renamed from: a */
    private void m3824a(File file) {
        this.f4924i = file.listFiles();
        if (!this.f4924i.equals(null)) {
            this.f4920e = file.getPath();
            this.f4921f.setText("录音文件目录为:" + file.getPath());
            this.f4917b = new ArrayList();
            int i = 0;
            while (i < this.f4924i.length) {
                Map hashMap = new HashMap();
                if (this.f4924i[i].isFile() && this.f4924i[i].getName().endsWith(".wav")) {
                    hashMap.put("image", Integer.valueOf(this.f4923h[0]));
                    hashMap.put("path", this.f4924i[i].getPath());
                    hashMap.put("filenames", this.f4924i[i].getName());
                    hashMap.put("time", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(this.f4924i[i].lastModified())));
                    hashMap.put("timelong", Long.valueOf(this.f4924i[i].lastModified()));
                    this.f4917b.add(hashMap);
                }
                i++;
            }
            Collections.sort(this.f4917b, new C1258kj(this));
            this.f4925j = new C1255kg(this.f4917b, this.f4926k, this);
            this.f4919d.setAdapter(this.f4925j);
            if (this.f4917b.size() == 0) {
                Toast.makeText(this, "没有录音文件!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    /* renamed from: a */
    public final void mo2948a(int i, String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        this.f4917b.remove(i);
        this.f4925j.mo3422a(this.f4917b);
        this.f4925j.notifyDataSetChanged();
    }

    /* renamed from: a */
    protected final void mo2949a(int i, String str, String str2) {
        Builder builder = new Builder(this);
        builder.setMessage("确认删除[" + str + "]吗？");
        builder.setTitle("提示");
        builder.setPositiveButton("确认", new C1259kk(this, i, str2));
        builder.setNegativeButton("取消", new C1260kl(this));
        builder.create().show();
    }

    /* renamed from: a */
    public final void mo2950a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(67108864);
        intent.putExtra("oneshot", 0);
        intent.putExtra("configchange", 0);
        intent.setDataAndType(Uri.fromFile(new File(str)), "audio/*");
        startActivity(intent);
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(this, MainMode.class);
        startActivity(intent);
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4926k = (JPApplication) getApplication();
        this.f4922g = (LayoutInflater) getSystemService("layout_inflater");
        LinearLayout linearLayout = (LinearLayout) this.f4922g.inflate(R.layout.record_list, null);
        setContentView(R.layout.record_list);
        this.f4926k.mo2706a((Context) this, "ground", linearLayout);
        this.f4919d = (ListView) findViewById(R.id.listFile);
        this.f4919d.setCacheColorHint(0);
        this.f4921f = (TextView) findViewById(R.id.txt1);
        m3824a(new File(Environment.getExternalStorageDirectory() + "/JustPiano/Record/"));
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    protected void onResume() {
        super.onResume();

    }
}
