package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import org.json.JSONException;
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.ca */
public final class C1033ca {
    /* renamed from: a */
    public static boolean f5240a = true;

    /* renamed from: a */
    public static void m3976a(String str, ConnectionService connectionService) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("H");
            String string = jSONObject.getString("C");
            OLPlayHall oLPlayHall;
            Message message;
            Bundle bundle;
            switch (i) {
                case 3:
                    C0987ai.m3949a(3, string);
                    return;
                case 4:
                    C0987ai.m3949a(4, string);
                    return;
                case 5:
                    C0987ai.m3949a(5, string);
                    return;
                case 6:
                    C0987ai.m3951a(string, "H");
                    return;
                case 7:
                    C0987ai.m3951a(string, "G");
                    return;
                case 9:
                    C0987ai.m3949a(9, string);
                    return;
                case 10:
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof OLMainMode) {
                        C1268kt.m4107a();
                        OLMainMode oLMainMode = (OLMainMode) C1268kt.m4109b();
                        Message message2 = new Message();
                        if (string.equals("N")) {
                            message2.what = 4;
                        } else if (string.equals("E")) {
                            message2.what = 5;
                        } else if (string.equals("V")) {
                            message2.what = 6;
                        } else {
                            message2.what = 1;
                        }
                        oLMainMode.f4284j.handleMessage(message2);
                        return;
                    }
                    return;
                case 12:
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof OLPlayHall) {
                        C1268kt.m4107a();
                        oLPlayHall = (OLPlayHall) C1268kt.m4109b();
                        try {
                            JSONObject jSONObject2 = new JSONObject(string);
                            message = new Message();
                            message.what = 1;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("M", jSONObject2.getString("M"));
                            bundle2.putString("U", jSONObject2.getString("U"));
                            bundle2.putInt("T", jSONObject2.getInt("T"));
                            if (jSONObject2.getInt("T") == 1) {
                                bundle2.putInt("V", jSONObject2.getInt("V"));
                            }
                            message.setData(bundle2);
                            oLPlayHall.f4403s.handleMessage(message);
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    return;
                case 13:
                    C0987ai.m3949a(13, string);
                    return;
                case 15:
                    C0987ai.m3949a(15, string);
                    return;
                case 17:
                    C0987ai.m3949a(17, string);
                    return;
                case 19:
                    C0987ai.m3950a(string);
                    return;
                case 20:
                    C0987ai.m3956d(string);
                    return;
                case 21:
                    C0987ai.m3957e(string);
                    return;
                case 22:
                    C0987ai.m3955c(string);
                    return;
                case 24:
                    C0987ai.m3949a(24, string);
                    return;
                case 25:
                    C0987ai.m3948a((byte) 25, string);
                    return;
                case 27:
                    C0987ai.m3949a(27, string);
                    return;
                case 28:
                    C0987ai.m3953b((byte) 28, string);
                    return;
                case 29:
                    try {
                        jSONObject = new JSONObject(string);
                        bundle = new Bundle();
                        if (jSONObject.getInt("T") == 0) {
                            bundle.putInt("T", jSONObject.getInt("T"));
                            bundle.putByte("hallID", (byte) jSONObject.getInt("I"));
                            bundle.putString("hallName", jSONObject.getString("N"));
                        } else {
                            bundle.putInt("T", (byte) jSONObject.getInt("T"));
                            bundle.putString("I", jSONObject.getString("I"));
                            bundle.putString("N", jSONObject.getString("N"));
                        }
                        message = new Message();
                        message.what = 1;
                        message.setData(bundle);
                        C1268kt.m4107a();
                        if (C1268kt.m4109b() instanceof OLPlayHallRoom) {
                            C1268kt.m4107a();
                            ((OLPlayHallRoom) C1268kt.m4109b()).f4468s.handleMessage(message);
                            return;
                        }
                        return;
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        return;
                    }
                case 31:
                    C0987ai.m3949a(31, string);
                    return;
                case 32:
                    C0987ai.m3949a(32, string);
                    return;
                case 33:
                    C0987ai.m3953b((byte) 33, string);
                    return;
                case 34:
                    C0987ai.m3953b((byte) 34, string);
                    return;
                case 36:
                    C0987ai.m3953b((byte) 36, string);
                    return;
                case 37:
                    C0987ai.m3949a(37, string);
                    return;
                case 39:
                    C0987ai.m3948a((byte) 39, string);
                    return;
                case 40:
                    bundle = new Bundle();
                    message = new Message();
                    try {
                        JSONObject jSONObject3 = new JSONObject(string);
                        PianoPlay pianoPlay;
                        switch (jSONObject3.getInt("T")) {
                            case 0:
                                C1268kt.m4107a();
                                if (C1268kt.m4109b() instanceof OLPlayHall) {
                                    C1268kt.m4107a();
                                    oLPlayHall = (OLPlayHall) C1268kt.m4109b();
                                    oLPlayHall.f4394j.dismiss();
                                    bundle.putInt("result", jSONObject3.getInt("R"));
                                    bundle.putString("info", jSONObject3.getString("I"));
                                    bundle.putString("path", jSONObject3.getString("P"));
                                    bundle.putInt("type", jSONObject3.getInt("T"));
                                    message.setData(bundle);
                                    message.what = 11;
                                    oLPlayHall.f4403s.handleMessage(message);
                                    return;
                                }
                                return;
                            case 1:
                                C1268kt.m4107a();
                                if (C1268kt.m4109b() instanceof PianoPlay) {
                                    C1268kt.m4107a();
                                    pianoPlay = (PianoPlay) C1268kt.m4109b();
                                    message.setData(bundle);
                                    message.what = 5;
                                    pianoPlay.f4590I.handleMessage(message);
                                    return;
                                }
                                return;
                            case 2:
                                C1268kt.m4107a();
                                if (C1268kt.m4109b() instanceof PianoPlay) {
                                    C1268kt.m4107a();
                                    pianoPlay = (PianoPlay) C1268kt.m4109b();
                                    bundle.putInt("R", jSONObject3.getInt("R"));
                                    bundle.putInt("G", jSONObject3.getInt("G"));
                                    bundle.putInt("S", jSONObject3.getInt("S"));
                                    message.setData(bundle);
                                    message.what = 6;
                                    pianoPlay.f4590I.handleMessage(message);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    } catch (JSONException e22) {
                        e22.printStackTrace();
                        return;
                    }
                    //e22.printStackTrace();
                case 41:
                    connectionService.mo2676a((byte) 41, (byte) 0, (byte) 0, "1", null);
                    return;
                case 43:
                    C0987ai.m3954b(string);
                    return;
                case 45:
                    C0987ai.m3949a(45, string);
                    return;
                default:
                    return;
            }
        } catch (JSONException e222) {
            e222.printStackTrace();
        }
    }
}
