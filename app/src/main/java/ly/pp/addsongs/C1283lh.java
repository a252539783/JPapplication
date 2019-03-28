package ly.pp.addsongs;

import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


/* renamed from: ly.pp.addsongs.lh */
public final class C1283lh extends AsyncTask {
    /* renamed from: a */
    byte[] f5878a = null;
    /* renamed from: b */
    final /* synthetic */ ShowSongsInfo f5879b;

    public C1283lh(ShowSongsInfo showSongsInfo) {
        this.f5879b = showSongsInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_10 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x004b} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_10 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x004b} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:19:0x0071, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x0072, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:24:0x007b, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x007c, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        if (this.f5879b.f4969e != null) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/DownloadSong");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", this.f5879b.f4981q.mo2695K()));
            arrayList.add(new BasicNameValuePair("songID", String.valueOf(this.f5879b.f4969e)));
            try {
                ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            try {
                HttpResponse execute = new DefaultHttpClient().execute(httpPost);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    this.f5878a = EntityUtils.toByteArray(execute.getEntity());
                }
            } catch (ParseException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f5878a == null || this.f5878a.length <= 3) {
            this.f5879b.f4971g.dismiss();
            Toast.makeText(this.f5879b, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
            return;
        }
        OLMelodySelect.f4294d = this.f5878a;
        Intent intent = new Intent();
        intent.putExtra("head", 1);
        intent.putExtra("songBytes", this.f5878a);
        intent.putExtra("songName", this.f5879b.f4968d);
        intent.putExtra("songID", this.f5879b.f4969e);
        intent.putExtra("topScore", this.f5879b.f4973i);
        intent.putExtra("degree", this.f5879b.f4972h);
        intent.setClass(this.f5879b, PianoPlay.class);
        this.f5879b.startActivity(intent);
        this.f5879b.f4971g.dismiss();
    }


    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5879b.f4971g.setMessage("正在载入曲谱,请稍后...");
        this.f5879b.f4971g.setCancelable(true);
        this.f5879b.f4971g.setOnCancelListener(new C1284li(this));
        this.f5879b.f4971g.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate( objArr[0]);
    }
}
