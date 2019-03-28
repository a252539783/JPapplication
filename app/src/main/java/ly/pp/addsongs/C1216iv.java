package ly.pp.addsongs;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.iv */
final class C1216iv implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ PianoPlay f5684a;

    C1216iv(PianoPlay pianoPlay) {
        this.f5684a = pianoPlay;
    }

    public final void onClick(View view) {
        Intent intent = new Intent(this.f5684a, OLPlayRoom.class);
        intent.putExtras(this.f5684a.f4606Y);
        this.f5684a.startActivity(intent);
        this.f5684a.finish();
    }
}
