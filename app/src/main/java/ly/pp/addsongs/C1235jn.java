package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.jn */
final class C1235jn implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1227jf f5721a;
    /* renamed from: b */
    private final /* synthetic */ PianoPlay f5722b;
    /* renamed from: c */
    private final /* synthetic */ Message f5723c;

    C1235jn(C1227jf c1227jf, PianoPlay pianoPlay, Message message) {
        this.f5721a = c1227jf;
        this.f5722b = pianoPlay;
        this.f5723c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5722b.f4632w.mo3539b("考级结果");
        Bundle data = this.f5723c.getData();
        int i = data.getInt("R");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("您的分数:" + data.getInt("S") + "\n");
        stringBuffer.append("合格分数:" + data.getInt("G") + "\n");
        switch (i) {
            case 0:
                stringBuffer.append("很遗憾,您未通过该首曲目,请再接再厉!\n");
                break;
            case 1:
                stringBuffer.append("恭喜您,您已通过该首曲目,请再接再厉!\n");
                break;
            case 2:
                stringBuffer.append("恭喜您,您已通过该阶段的全部曲目,晋升一级!\n");
                break;
        }
        this.f5722b.f4632w.mo3535a(stringBuffer.toString());
        this.f5722b.f4632w.mo3537a();
        this.f5722b.f4632w.mo3536a("确定", new C1236jo(this, this.f5722b));
        this.f5722b.f4632w.mo3541c();
    }
}
