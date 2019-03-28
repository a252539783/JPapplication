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


/* renamed from: ly.pp.addsongs.kw */
public final class C1271kw extends AsyncTask {
    /* renamed from: a */
    byte[] f5852a = null;
    /* renamed from: b */
    final /* synthetic */ SearchSongs f5853b;

    public C1271kw(SearchSongs searchSongs) {
        this.f5853b = searchSongs;
    }

    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        if (this.f5853b.f4950e != null) {
            HttpResponse execute;
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/DownloadSong");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", this.f5853b.f4959n.mo2695K()));
            arrayList.add(new BasicNameValuePair("songID", String.valueOf(this.f5853b.f4950e)));
            try {
                ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            try {
                execute = new DefaultHttpClient().execute(httpPost);
            } catch (ClientProtocolException e2) {
                e2.printStackTrace();
                execute = null;
            } catch (IOException e3) {
                e3.printStackTrace();
                execute = null;
            }
            if (execute.getStatusLine().getStatusCode() == 200) {
                try {
                    this.f5852a = EntityUtils.toByteArray(execute.getEntity());
                } catch (ParseException e4) {
                    e4.printStackTrace();
                } catch (IOException e32) {
                    e32.printStackTrace();
                }
            }
        }
        return null;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f5852a == null || this.f5852a.length <= 3) {
            this.f5853b.f4952g.cancel();
            Toast.makeText(this.f5853b, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
            return;
        }
        OLMelodySelect.f4294d = this.f5852a;
        Intent intent = new Intent();
        intent.putExtra("head", 1);
        intent.putExtra("songBytes", this.f5852a);
        intent.putExtra("songName", this.f5853b.f4949d);
        intent.putExtra("songID", this.f5853b.f4950e);
        intent.putExtra("topScore", this.f5853b.f4954i);
        intent.putExtra("degree", this.f5853b.f4953h);
        intent.setClass(this.f5853b, PianoPlay.class);
        this.f5853b.startActivity(intent);
        this.f5853b.f4952g.cancel();
    }



    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5853b.f4952g.setMessage("正在载入曲谱,请稍后...");
        this.f5853b.f4952g.setCancelable(true);
        this.f5853b.f4952g.setOnCancelListener(new C1272kx(this));
        this.f5853b.f4952g.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(objArr[0]);
    }
}
