package ly.pp.addsongs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;


/* renamed from: ly.pp.addsongs.ho */
final class C1182ho implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5568a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5569b;
    /* renamed from: c */
    private final /* synthetic */ Message f5570c;

    C1182ho(C1164gx c1164gx, OLPlayRoom oLPlayRoom, Message message) {
        this.f5568a = c1164gx;
        this.f5569b = oLPlayRoom;
        this.f5570c = message;
    }

    /* renamed from: run */
    public final void run() {
        if (this.f5569b.f4536t != null) {
            while (this.f5569b.f4536t.isAlive()) {
                this.f5569b.f4536t.f5738b = false;
            }
            this.f5569b.f4536t = null;
        }
        String string = this.f5570c.getData().getString("S");
        int i = this.f5570c.getData().getInt("T");
        if (!this.f5569b.f4508ag) {
            this.f5569b.f4531o.mo2697M().mo2676a((byte) 8, this.f5569b.f4529m, this.f5569b.f4477B, this.f5569b.f4530n, null);
            Intent intent = new Intent(this.f5569b, OLPlayHall.class);
            Bundle bundle = new Bundle();
            bundle.putString("hallName", this.f5569b.f4478C);
            bundle.putByte("hallID", this.f5569b.f4477B);
            intent.putExtras(bundle);
            this.f5569b.startActivity(intent);
            this.f5569b.finish();
        } else if (string != null && !string.equals("")) {
            string = "songs/" + string + ".pm";
            String str = this.f5569b.mo2864a(string)[0];
            if (str != null) {
                Intent intent2 = new Intent(this.f5569b, PianoPlay.class);
                intent2.putExtra("head", 2);
                intent2.putExtra("path", string);
                intent2.putExtra("name", str);
                intent2.putExtra("name", str);
                intent2.putExtra("uploadTimes", i);
                intent2.putExtra("roomMode", this.f5569b.f4516ao);
                intent2.putExtra("hand", this.f5569b.mo2866c());
                intent2.putExtra("bundle", this.f5569b.f4538v);
                intent2.putExtra("bundleHall", this.f5569b.f4539w);
                this.f5569b.startActivity(intent2);
                this.f5569b.finish();
            }
        }
    }
}
