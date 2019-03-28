package ly.pp.addsongs;

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
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.dm */
public final class C1072dm extends AsyncTask {
    /* renamed from: a */
    String f5335a = "";
    /* renamed from: b */
    final /* synthetic */ OLMelodySelect f5336b;

    public C1072dm(OLMelodySelect oLMelodySelect) {
        this.f5336b = oLMelodySelect;
    }

    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        if (!this.f5336b.f4317e.equals("")) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/GetListByType");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", this.f5336b.f4304I.mo2695K()));
            arrayList.add(new BasicNameValuePair("page", String.valueOf(this.f5336b.f4303H)));
            arrayList.add(new BasicNameValuePair("type", this.f5336b.f4317e));
            try {
                ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            try {
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(10000));
                defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));
                HttpResponse execute = defaultHttpClient.execute(httpPost);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    try {
                        JSONObject jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                        this.f5335a = C1340nk.m4156b(jSONObject.getString("L"));
                        String str = this.f5335a;
                        if (this.f5336b.f4303H == 0) {
                            this.f5336b.f4305J = jSONObject.getInt("P");
                        }
                    } catch (ParseException e2) {
                        e2.printStackTrace();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (ClientProtocolException e4) {
                e4.printStackTrace();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        return this.f5335a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f5335a.length() > 4) {
            this.f5336b.m3643a(this.f5336b.f4305J);
            this.f5336b.f4307L.notifyDataSetChanged();
            OLMelodySelect oLMelodySelect = this.f5336b;
            //this.f5336b.f4327p;
            String str = this.f5335a;
            //this.f5336b.f4322k;
            oLMelodySelect.mo2809a(str);
            this.f5336b.mo2808a(this.f5336b.f4327p, this.f5336b.f4316c, this.f5336b.f4322k);
            this.f5336b.f4327p.setCacheColorHint(0);
            this.f5336b.f4319h.cancel();
            return;
        }
        this.f5336b.f4319h.cancel();
        Toast.makeText(this.f5336b, "获取数据出错！", Toast.LENGTH_SHORT).show();
    }



    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5336b.f4319h.setMessage("正在载入曲库列表,请稍后...");
        this.f5336b.f4319h.setOnCancelListener(new C1073dn(this));
        this.f5336b.f4319h.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{(Integer[]) objArr[0]});
    }
}
