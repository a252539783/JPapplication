package ly.pp.addsongs;

import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


/* renamed from: ly.pp.addsongs.do */
public final class C1074do extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ OLMelodySelect f5338a;

    public C1074do(OLMelodySelect oLMelodySelect) {
        this.f5338a = oLMelodySelect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_9 'e' org.apache.http.client.ClientProtocolException), Splitter: B:5:0x003e} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_9 'e' org.apache.http.client.ClientProtocolException), Splitter: B:5:0x003e} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:15:0x0064, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:17:?, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:18:0x0069, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:19:0x006a, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:20:0x006e, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute(obj);
        if (OLMelodySelect.f4294d == null || OLMelodySelect.f4294d.length <= 3) {
            this.f5338a.f4319h.cancel();
            Toast.makeText(this.f5338a, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("head", 1);
        intent.putExtra("songBytes", OLMelodySelect.f4294d);
        intent.putExtra("songName", this.f5338a.f4318f);
        intent.putExtra("songID", OLMelodySelect.f4295g);
        intent.putExtra("topScore", this.f5338a.f4301F);
        intent.putExtra("degree", this.f5338a.f4300E);
        intent.setClass(this.f5338a, PianoPlay.class);
        this.f5338a.startActivity(intent);
        this.f5338a.f4319h.cancel();
    }


    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5338a.f4319h.setMessage("正在载入曲谱,请稍后...");
        this.f5338a.f4319h.setCancelable(true);
        this.f5338a.f4319h.setOnCancelListener(new C1075dp(this));
        this.f5338a.f4319h.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{objArr[0]});
    }
}
