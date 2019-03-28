package ly.pp.addsongs;

import android.os.AsyncTask;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.nf */
public final class C1335nf extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ UsersInfo f6007a;

    public C1335nf(UsersInfo usersInfo) {
        this.f6007a = usersInfo;
    }

    protected final /* synthetic */ Object doInBackground(Object... objArr) {
        String[] strArr = (String[]) objArr;
        UsersInfo usersInfo = this.f6007a;
        return UsersInfo.m3931b(strArr[0], strArr[1], strArr[2]);
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        super.onPostExecute(str);
        if (str.equals("0")) {
            this.f6007a.f5060d.cancel();
            Toast.makeText(this.f6007a, "修改成功！", Toast.LENGTH_LONG).show();
            return;
        }
        this.f6007a.f5060d.cancel();
        Toast.makeText(this.f6007a, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f6007a.f5060d.setCancelable(true);
        this.f6007a.f5060d.setOnCancelListener(new C1336ng(this));
        this.f6007a.f5060d.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{(Integer[]) objArr[0]});
    }
}
