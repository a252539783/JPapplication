package ly.pp.addsongs;

import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;

/* renamed from: ly.pp.addsongs.my */
public final class C1327my extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ SoundListPreference f5992a;

    public C1327my(SoundListPreference soundListPreference) {
        this.f5992a = soundListPreference;
    }

    /* renamed from: a */

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute(obj);
        this.f5992a.f5053h.cancel();
        Toast.makeText(this.f5992a.f5050e, "音源载入成功!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5992a.f5053h.show();
        Toast.makeText(this.f5992a.f5050e, "正在载入音源,请稍后。。。", Toast.LENGTH_SHORT).show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{objArr[0]});
    }
}
