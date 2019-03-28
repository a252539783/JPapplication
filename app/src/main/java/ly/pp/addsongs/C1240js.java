package ly.pp.addsongs;

import android.os.AsyncTask;

/* renamed from: ly.pp.addsongs.js */
public final class C1240js extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ PianoPlay f5733a;

    public C1240js(PianoPlay pianoPlay) {
        this.f5733a = pianoPlay;
    }

    protected final /* synthetic */ Object doInBackground(Object... objArr) {
        PianoPlay.m3802m(this.f5733a);
        return null;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        this.f5733a.f4621l.cancel();
        this.f5733a.m3794f();
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5733a.f4621l.setCancelable(false);
        this.f5733a.f4621l.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{(Integer[]) objArr[0]});
    }
}
