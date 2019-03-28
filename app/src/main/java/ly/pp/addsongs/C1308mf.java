package ly.pp.addsongs;

import android.os.AsyncTask;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;

/* renamed from: ly.pp.addsongs.mf */
public final class C1308mf extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ SkinListPreference f5946a;

    public C1308mf(SkinListPreference skinListPreference) {
        this.f5946a = skinListPreference;
    }

    /* renamed from: a */
    protected String doInBackground(Object[] objects){
            File dir = this.f5946a.f5026f.getDir("Skin", 0);
            if (dir.isDirectory()) {
                File[] listFiles = dir.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            }
            C1340nk.m4155a(this.f5946a.f5024d, dir.toString());
        return null;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        this.f5946a.f5029i.cancel();
        Toast.makeText(this.f5946a.f5026f, "皮肤设置成功!", Toast.LENGTH_SHORT).show();
    }



    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5946a.f5029i.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{(Integer[]) objArr[0]});
    }
}
