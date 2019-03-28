package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.ai */
public final class C0987ai {
    /* renamed from: a */
    public static ByteBuffer m3945a(byte b, byte b2, byte b3, String str) {
        ByteBuffer byteBuffer = null;
        try {
            Object bytes = str.getBytes("UTF-8");
            Object obj = new byte[]{b, b2, b3};

            Object obj2 = new byte[(((byte[]) obj).length + ((byte[]) bytes).length)];
            System.arraycopy(obj, 0, obj2, 0, ((byte[]) obj).length);
            System.arraycopy(bytes, 0, obj2, ((byte[]) obj).length, ((byte[]) bytes).length);
            return ByteBuffer.wrap((byte[])obj2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return byteBuffer;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m3946a(byte b, byte b2, byte b3, byte[] bArr) {
        byte[] bArr2 = new byte[]{b, b2, b3};
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + bArr2.length);
        allocate.put(bArr2);
        allocate.put(bArr);
        return allocate;
    }

    /* renamed from: a */
    public static ByteBuffer m3947a(String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("P", str3);
            jSONObject.put("V", str4);
            jSONObject.put("N", str);
            jSONObject.put("K", str2);
            jSONObject.put("C", str5);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return C0987ai.m3945a((byte) 10, (byte) 0, (byte) 0, jSONObject.toString());
    }

    /* renamed from: a */
    public static void m3948a(byte b, String str) {
        int i = 0;
        Message message = new Message();
        try {
            C1268kt.m4107a();
            if (C1268kt.m4109b() instanceof PianoPlay) {
                C1268kt.m4107a();
                PianoPlay pianoPlay = (PianoPlay) C1268kt.m4109b();
                JSONObject jSONObject = new JSONObject(str);
                C1245jx c1245jx = (C1245jx) pianoPlay.f4587F.get(Byte.valueOf((byte) jSONObject.getInt("I")));
                Bundle bundle = new Bundle();
                Bundle bundle2;
                switch (b) {
                    case (byte) 25:
                        int i2 = jSONObject.getInt("S");
                        int i3 = jSONObject.getInt("T");
                        if (i2 < 0) {
                            c1245jx.mo3392c("OPEN");
                            c1245jx.mo3387a("");
                        } else {
                            c1245jx.mo3389b(i2);
                            c1245jx.mo3386a(i3);
                        }
                        /*for (C1245jx c1245jx2 : pianoPlay.f4587F.values()) {
                            if (!c1245jx2.mo3385a().equals("")) {
                                bundle2 = new Bundle();
                                bundle2.putString("G", String.valueOf(c1245jx2.mo3402m()));
                                bundle2.putString("U", c1245jx2.mo3385a());
                                bundle2.putString("M", c1245jx2.mo3395f());
                                bundle2.putString("T", c1245jx2.mo3405p() > 0 ? "combo x" + c1245jx2.mo3405p() : "");
                                bundle.putBundle(String.valueOf(i), bundle2);
                                i++;
                            }
                        }*/
                        break;
                    case (byte) 39:
                        /*c1245jx2.mo3390b(jSONObject.getString("S"));
                        for (C1245jx c1245jx22 : pianoPlay.f4587F.values()) {
                            bundle2 = new Bundle();
                            bundle2.putString("U", c1245jx22.mo3385a());
                            bundle2.putString("M", c1245jx22.mo3395f());
                            if (c1245jx22.mo3391c().equals("G")) {
                                bundle2.putString("S", "载入完成");
                            } else {
                                bundle2.putString("S", "载入中...");
                            }
                            c1245jx22.mo3391c();
                            bundle.putBundle(String.valueOf(i), bundle2);
                            i++;
                        }*/
                        break;
                }
                message.what = 2;
                message.setData(bundle);
                pianoPlay.f4590I.handleMessage(message);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m3949a(int i, String str) {
        int i2 = 0;
        Message message = new Message();
        Bundle bundle = new Bundle();
        Bundle bundle2;
        JSONObject jSONObject;
        Bundle bundle3;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        Handler handler;
        JSONArray jSONArray;
        int length;
        String string;
        switch (i) {
            case 3:
                message.what = 5;
                bundle2 = new Bundle();
                try {
                    JSONObject jSONObject4 = new JSONObject(str);
                    bundle2.putString("S", jSONObject4.getString("S"));
                    bundle2.putInt("T", jSONObject4.getInt("T"));
                    message.setData(bundle2);
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof OLPlayRoom) {
                        C1268kt.m4107a();
                        ((OLPlayRoom) C1268kt.m4109b()).f4482G.handleMessage(message);
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            case 5:
                try {
                    message.what = 3;
                    JSONArray jSONArray2 = new JSONArray(C1340nk.m4156b(new JSONObject(str).getString("L")));
                    int length2 = jSONArray2.length();
                    while (i2 < length2) {
                        jSONObject = jSONArray2.getJSONObject(i2);
                        bundle3 = new Bundle();
                        bundle3.putString("I", jSONObject.getString("I"));
                        bundle3.putString("N", jSONObject.getString("N"));
                        bundle3.putString("S", jSONObject.getString("S"));
                        bundle3.putString("SC", jSONObject.getString("SC"));
                        JSONObject jSONObject5 = new JSONObject(jSONObject.getString("SI"));
                        bundle3.putString("P", jSONObject5.getString("P"));
                        bundle3.putString("C", jSONObject5.getString("C"));
                        bundle3.putString("G", jSONObject5.getString("G"));
                        bundle3.putString("B", jSONObject5.getString("B"));
                        bundle3.putString("M", jSONObject5.getString("M"));
                        bundle3.putString("T", jSONObject5.getString("T"));
                        bundle3.putString("E", jSONObject5.getString("E"));
                        bundle3.putString("GR", jSONObject5.getString("GR"));
                        bundle.putBundle(String.valueOf(i2), bundle3);
                        i2++;
                    }
                    message.setData(bundle);
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof PianoPlay) {
                        C1268kt.m4107a();
                        ((PianoPlay) C1268kt.m4109b()).f4590I.handleMessage(message);
                        return;
                    }
                    return;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
            case 9:
                message.what = 8;
                C1268kt.m4107a();
                if (C1268kt.m4109b() instanceof OLPlayRoom) {
                    C1268kt.m4107a();
                    ((OLPlayRoom) C1268kt.m4109b()).f4482G.handleMessage(message);
                    return;
                }
                return;
            case 13:
                try {
                    jSONObject2 = new JSONObject(str);
                    message.what = 2;
                    bundle.putString("U", jSONObject2.getString("U"));
                    bundle.putString("M", jSONObject2.getString("M"));
                    bundle.putInt("T", jSONObject2.getInt("T"));
                    if (jSONObject2.getInt("T") == 1) {
                        bundle.putInt("V", jSONObject2.getInt("V"));
                    }
                    message.setData(bundle);
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof OLPlayRoom) {
                        C1268kt.m4107a();
                        ((OLPlayRoom) C1268kt.m4109b()).f4482G.handleMessage(message);
                        return;
                    }
                    return;
                } catch (JSONException e22) {
                    e22.printStackTrace();
                    return;
                }
            case 15:
                message.what = 3;
                bundle2 = new Bundle();
                bundle2.putString("song_path", str);
                message.setData(bundle2);
                C1268kt.m4107a();
                if (C1268kt.m4109b() instanceof OLPlayRoom) {
                    C1268kt.m4107a();
                    ((OLPlayRoom) C1268kt.m4109b()).f4482G.handleMessage(message);
                    return;
                }
                return;
            case 17:
                try {
                    jSONObject3 = new JSONObject(str);
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof OLPlayHallRoom) {
                        C1268kt.m4107a();
                        handler = ((OLPlayHallRoom) C1268kt.m4109b()).f4468s;
                        if (handler != null) {
                            message.what = 6;
                            if (!jSONObject3.equals("")) {
                                bundle.putInt("C", jSONObject3.getInt("C"));
                                bundle.putInt("D", jSONObject3.getInt("D"));
                                bundle.putString("U", jSONObject3.getString("U"));
                                bundle.putString("M", jSONObject3.getString("M"));
                                message.setData(bundle);
                                handler.handleMessage(message);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException e222) {
                    e222.printStackTrace();
                    return;
                }
            case 24:
                message.what = 1;
                message.arg1 = 0;
                try {
                    jSONArray = new JSONArray(str);
                    length = jSONArray.length();
                    while (i2 < length) {
                        jSONObject = jSONArray.getJSONObject(i2);
                        bundle3 = new Bundle();
                        bundle3.putString("G", jSONObject.getString("G"));
                        bundle3.putString("U", jSONObject.getString("U"));
                        bundle3.putString("M", jSONObject.getString("M"));
                        bundle.putBundle(String.valueOf(i2), bundle3);
                        //jSONObject.getString("U") + "SCORELIST";
                        i2++;
                    }
                    message.setData(bundle);
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof PianoPlay) {
                        C1268kt.m4107a();
                        ((PianoPlay) C1268kt.m4109b()).f4590I.handleMessage(message);
                        return;
                    }
                    return;
                } catch (JSONException e2222) {
                    e2222.printStackTrace();
                    return;
                }
            case 27:
                try {
                    jSONObject2 = new JSONObject(str);
                    message.what = 4;
                    bundle.putString("U", jSONObject2.getString("U"));
                    bundle.putString("M", "推荐歌曲：");
                    bundle.putString("I", jSONObject2.getString("I"));
                    bundle.putInt("T", jSONObject2.getInt("T"));
                    message.setData(bundle);
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof OLPlayRoom) {
                        C1268kt.m4107a();
                        ((OLPlayRoom) C1268kt.m4109b()).f4482G.handleMessage(message);
                        return;
                    }
                    return;
                } catch (JSONException e22222) {
                    e22222.printStackTrace();
                    return;
                }
            case 31:
                try {
                    jSONObject3 = new JSONObject(str);
                    length = jSONObject3.getInt("T");
                    handler = null;
                    switch (jSONObject3.getInt("S")) {
                        case 0:
                            C1268kt.m4107a();
                            if (C1268kt.m4109b() instanceof OLPlayRoom) {
                                C1268kt.m4107a();
                                handler = ((OLPlayRoom) C1268kt.m4109b()).f4482G;
                                message.what = 9;
                                break;
                            }
                            return;
                        case 1:
                            C1268kt.m4107a();
                            if (C1268kt.m4109b() instanceof OLPlayHall) {
                                C1268kt.m4107a();
                                handler = ((OLPlayHall) C1268kt.m4109b()).f4403s;
                                message.what = 8;
                                break;
                            }
                            return;
                    }
                    if (handler != null) {
                        string = jSONObject3.getString("F");
                        if (!string.equals("")) {
                            bundle.putInt("T", length);
                            if (length == 1) {
                                bundle.putInt("I", jSONObject3.getInt("I"));
                                if (jSONObject3.getInt("I") == 3) {
                                    bundle.putString("title", jSONObject3.getString("H"));
                                    bundle.putString("Message", jSONObject3.getString("M"));
                                }
                            }
                            bundle.putString("F", string);
                            message.setData(bundle);
                            handler.handleMessage(message);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException e222222) {
                    e222222.printStackTrace();
                    return;
                }
            case 32:
                message.what = 1;
                message.arg1 = 1;
                try {
                    jSONArray = new JSONArray(str);
                    length = jSONArray.length();
                    while (i2 < length) {
                        jSONObject = jSONArray.getJSONObject(i2);
                        bundle3 = new Bundle();
                        bundle3.putString("G", jSONObject.getString("G"));
                        bundle3.putString("U", jSONObject.getString("U"));
                        bundle3.putString("M", jSONObject.getString("M"));
                        bundle.putBundle(String.valueOf(i2), bundle3);
                        i2++;
                    }
                    message.setData(bundle);
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof PianoPlay) {
                        C1268kt.m4107a();
                        ((PianoPlay) C1268kt.m4109b()).f4590I.handleMessage(message);
                        return;
                    }
                    return;
                } catch (JSONException e2222222) {
                    e2222222.printStackTrace();
                    return;
                }
            case 37:
                try {
                    jSONObject3 = new JSONObject(str);
                    length = jSONObject3.getInt("T");
                    handler = null;
                    switch (jSONObject3.getInt("S")) {
                        case 0:
                            C1268kt.m4107a();
                            if (C1268kt.m4109b() instanceof OLPlayRoom) {
                                C1268kt.m4107a();
                                handler = ((OLPlayRoom) C1268kt.m4109b()).f4482G;
                                message.what = 14;
                                break;
                            }
                            return;
                        case 1:
                            C1268kt.m4107a();
                            if (C1268kt.m4109b() instanceof OLPlayHall) {
                                C1268kt.m4107a();
                                handler = ((OLPlayHall) C1268kt.m4109b()).f4403s;
                                message.what = 9;
                                break;
                            }
                            return;
                        case 2:
                            C1268kt.m4107a();
                            if (C1268kt.m4109b() instanceof OLPlayHallRoom) {
                                C1268kt.m4107a();
                                handler = ((OLPlayHallRoom) C1268kt.m4109b()).f4468s;
                                message.what = 5;
                                break;
                            }
                            return;
                    }
                    if (handler != null) {
                        string = jSONObject3.getString("I");
                        if (!string.equals("")) {
                            bundle.putInt("T", length);
                            bundle.putString("Ti", jSONObject3.getString("N"));
                            bundle.putString("P", jSONObject3.getString("P"));
                            bundle.putString("I", string);
                            bundle.putInt("C", jSONObject3.getInt("C"));
                            bundle.putInt("H", jSONObject3.getInt("H"));
                            bundle.putInt("R", jSONObject3.getInt("R"));
                            message.setData(bundle);
                            handler.handleMessage(message);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException e22222222) {
                    e22222222.printStackTrace();
                    return;
                }
            case 45:
                message.what = 22;
                C1268kt.m4107a();
                if (C1268kt.m4109b() instanceof OLPlayRoom) {
                    bundle.putString("MSG", str);
                    message.setData(bundle);
                    C1268kt.m4107a();
                    ((OLPlayRoom) C1268kt.m4109b()).f4482G.handleMessage(message);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static void m3950a(String str) {
        Bundle bundle = new Bundle();
        Message message = new Message();
        OLPlayHall oLPlayHall = null;
        message.what = 3;
        try {
            JSONArray jSONArray = new JSONArray(C1340nk.m4156b(new JSONObject(str).getString("L")));
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (i < length) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    Bundle bundle2 = new Bundle();
                    C1264kp c1264kp = new C1264kp((byte) jSONObject.getInt("I"), jSONObject.getString("N"), jSONObject.getInt("F"), jSONObject.getInt("M"), jSONObject.getInt("S"), jSONObject.getInt("P"), jSONObject.getInt("V"), jSONObject.getInt("C"), jSONObject.getInt("D"));
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof OLPlayHall) {
                        C1268kt.m4107a();
                        oLPlayHall = (OLPlayHall) C1268kt.m4109b();
                        oLPlayHall.mo2825a(c1264kp.mo3442a(), c1264kp);
                        bundle2.putByte("I", c1264kp.mo3442a());
                        bundle2.putString("N", c1264kp.mo3443b());
                        bundle2.putIntArray("UA", c1264kp.mo3447f());
                        bundle2.putBoolean("IF", c1264kp.mo3448g());
                        bundle2.putInt("IP", c1264kp.mo3446e());
                        bundle2.putInt("PA", c1264kp.mo3449h());
                        bundle2.putInt("V", c1264kp.mo3450i());
                        bundle2.putInt("D", c1264kp.mo3451j());
                        bundle.putBundle(String.valueOf(i), bundle2);
                        i++;
                    } else {
                        return;
                    }
                }
                message.setData(bundle);
                oLPlayHall.f4403s.handleMessage(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m3951a(String str, String str2) {
        C1268kt.m4107a();
        if (C1268kt.m4109b() instanceof OLPlayHall) {
            C1268kt.m4107a();
            OLPlayHall oLPlayHall = (OLPlayHall) C1268kt.m4109b();
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = jSONObject.getInt("G");
                Message message = new Message();
                Bundle bundle;
                if (str2.equals("H")) {
                    bundle = new Bundle();
                    switch (i) {
                        case 0:
                            bundle.putString("result", "房间数已满！");
                            message.what = 4;
                            break;
                        case 1:
                            message.what = 2;
                            bundle.putString("R", jSONObject.getString("R"));
                            bundle.putString("PL", C1340nk.m4156b(jSONObject.getString("P")));
                            bundle.putString("ID", String.valueOf(jSONObject.getInt("I")));
                            bundle.putString("D", jSONObject.getString("D"));
                            bundle.putString("isHost", str2);
                            bundle.putString("SI", jSONObject.getString("S"));
                            bundle.putInt("mode", jSONObject.getInt("M"));
                            break;
                    }
                    message.setData(bundle);
                } else if (str2.equals("G")) {
                    bundle = new Bundle();
                    switch (i) {
                        case 0:
                            bundle.putString("result", "该房间正在弹奏中！");
                            message.what = 4;
                            break;
                        case 1:
                            bundle.putString("result", "该房间人数已满！");
                            message.what = 4;
                            break;
                        case 2:
                            bundle.putString("result", "房间数已满！");
                            message.what = 4;
                            break;
                        case 3:
                            bundle.putString("result", "密码有误！");
                            message.what = 4;
                            break;
                        case 4:
                            message.what = 2;
                            bundle.putString("R", jSONObject.getString("R"));
                            bundle.putString("D", jSONObject.getString("D"));
                            bundle.putString("ID", String.valueOf(jSONObject.getInt("I")));
                            bundle.putString("isHost", str2);
                            bundle.putInt("mode", jSONObject.getInt("M"));
                            break;
                    }
                    message.setData(bundle);
                }
                oLPlayHall.f4403s.handleMessage(message);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m3952b(byte b, byte b2, byte b3, String str) {
        switch (b) {
            case (byte) 3:
                return C0987ai.m3945a(b, b2, b3, str);
            case (byte) 4:
                return C0987ai.m3945a(b, b2, b3, str);
            case (byte) 5:
                return C0987ai.m3945a(b, b2, b3, str);
            case 12:
                return C0987ai.m3945a(b, b2, b3, str);
            case (byte) 13:
                return C0987ai.m3945a(b, b2, b3, str);
            case 15:
                return C0987ai.m3945a(b, b2, b3, str);
            case (byte) 25:
                return C0987ai.m3945a(b, b2, b3, str);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static void m3953b(byte b, String str) {
        int i = 0;
        Message message = new Message();
        Bundle bundle;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i2;
        JSONArray jSONArray;
        int length;
        Bundle bundle2;
        switch (b) {
            case (byte) 28:
                bundle = new Bundle();
                Bundle bundle3 = new Bundle();
                message.what = 0;
                try {
                    JSONObject jSONObject3 = new JSONObject(str);
                    JSONArray jSONArray2 = new JSONArray(C1340nk.m4156b(jSONObject3.getString("L")));
                    int length2 = jSONArray2.length();
                    while (i < length2) {
                        jSONObject = jSONArray2.getJSONObject(i);
                        Bundle bundle4 = new Bundle();
                        bundle4.putByte("I", (byte) jSONObject.getInt("I"));
                        bundle4.putString("N", jSONObject.getString("N"));
                        bundle4.putInt("PN", jSONObject.getInt("P"));
                        bundle4.putInt("TN", jSONObject.getInt("T"));
                        bundle4.putInt("W", jSONObject.getInt("W"));
                        bundle3.putBundle(String.valueOf(i), bundle4);
                        i++;
                    }
                    bundle.putBundle("L", bundle3);
                    bundle.putString("U", jSONObject3.getString("U"));
                    bundle.putString("S", jSONObject3.getString("S"));
                    bundle.putInt("LV", jSONObject3.getInt("LV"));
                    bundle.putInt("CL", jSONObject3.getInt("CL"));
                    bundle.putInt("E", jSONObject3.getInt("E"));
                    bundle.putInt("X", jSONObject3.getInt("X"));
                    bundle.putInt("M", jSONObject3.getInt("M"));
                    bundle.putString("DR", jSONObject3.getString("DR"));
                    bundle.putInt("CP", jSONObject3.getInt("CP"));
                    message.setData(bundle);
                    C1268kt.m4107a();
                    if (C1268kt.m4109b() instanceof OLPlayHallRoom) {
                        C1268kt.m4107a();
                        ((OLPlayHallRoom) C1268kt.m4109b()).f4468s.handleMessage(message);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case (byte) 33:
                Bundle bundle5 = new Bundle();
                message.what = 2;
                try {
                    bundle5.putString("T", new JSONObject(str).getString("T"));
                    message.setData(bundle5);
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
            case (byte) 34:
                bundle = new Bundle();
                try {
                    jSONObject2 = new JSONObject(str);
                    String string = jSONObject2.getString("T");
                    //"type:" + string;
                    if (string.equals("L")) {
                        i2 = jSONObject2.getInt("S");
                        jSONArray = new JSONArray(C1340nk.m4156b(jSONObject2.getString("L")));
                        length = jSONArray.length();
                        if (length > 0) {
                            while (i < length) {
                                bundle2 = new Bundle();
                                jSONObject = jSONArray.getJSONObject(i);
                                bundle2.putString("F", jSONObject.getString("F"));
                                bundle2.putInt("O", jSONObject.getInt("O"));
                                bundle2.putString("S", jSONObject.getString("S"));
                                bundle2.putInt("LV", jSONObject.getInt("LV"));
                                bundle.putBundle(String.valueOf(i), bundle2);
                                i++;
                            }
                        }
                        switch (i2) {
                            case 0:
                                message.what = 3;
                                new Bundle().putBundle("L", bundle);
                                message.setData(bundle);
                                C1268kt.m4107a();
                                if (C1268kt.m4109b() instanceof OLPlayHallRoom) {
                                    C1268kt.m4107a();
                                    ((OLPlayHallRoom) C1268kt.m4109b()).f4468s.handleMessage(message);
                                    return;
                                }
                                return;
                            case 1:
                                message.what = 5;
                                message.setData(bundle);
                                C1268kt.m4107a();
                                if (C1268kt.m4109b() instanceof OLPlayHall) {
                                    C1268kt.m4107a();
                                    ((OLPlayHall) C1268kt.m4109b()).f4403s.handleMessage(message);
                                    return;
                                }
                                return;
                            case 2:
                                C1268kt.m4107a();
                                if (C1268kt.m4109b() instanceof OLPlayRoom) {
                                    message.what = 11;
                                    message.setData(bundle);
                                    C1268kt.m4107a();
                                    ((OLPlayRoom) C1268kt.m4109b()).f4482G.handleMessage(message);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    } else if (string.equals("M")) {
                        JSONArray jSONArray3 = new JSONArray(C1340nk.m4156b(jSONObject2.getString("L")));
                        length = jSONArray3.length();
                        if (length > 0) {
                            while (i < length) {
                                Bundle bundle6 = new Bundle();
                                JSONObject jSONObject4 = jSONArray3.getJSONObject(i);
                                bundle6.putString("F", jSONObject4.getString("F"));
                                bundle6.putString("M", jSONObject4.getString("M"));
                                bundle6.putString("T", jSONObject4.getString("T"));
                                bundle6.putInt("type", 0);
                                bundle.putBundle(String.valueOf(i), bundle6);
                                i++;
                            }
                        }
                        message.what = 4;
                        message.setData(bundle);
                        C1268kt.m4107a();
                        if (C1268kt.m4109b() instanceof OLPlayHallRoom) {
                            C1268kt.m4107a();
                            ((OLPlayHallRoom) C1268kt.m4109b()).f4468s.handleMessage(message);
                            return;
                        }
                        return;
                    } else if (string.equals("C")) {
                        bundle.putString("U", jSONObject2.getString("U"));
                        bundle.putString("S", jSONObject2.getString("S"));
                        bundle.putInt("LV", jSONObject2.getInt("L"));
                        bundle.putInt("CL", jSONObject2.getInt("C"));
                        bundle.putString("DR", jSONObject2.getString("D"));
                        bundle.putString("IN", jSONObject2.getString("I"));
                        bundle.putInt("CP", jSONObject2.getInt("P"));
                        message.what = 22;
                        message.setData(bundle);
                        C1268kt.m4107a();
                        if (C1268kt.m4109b() instanceof OLPlayHallRoom) {
                            C1268kt.m4107a();
                            ((OLPlayHallRoom) C1268kt.m4109b()).f4468s.handleMessage(message);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            case (byte) 36:
                bundle = new Bundle();
                try {
                    jSONObject2 = new JSONObject(str);
                    i2 = jSONObject2.getInt("S");
                    jSONArray = new JSONArray(C1340nk.m4156b(jSONObject2.getString("L")));
                    length = jSONArray.length();
                    if (length > 0) {
                        while (i < length) {
                            bundle2 = new Bundle();
                            jSONObject = jSONArray.getJSONObject(i);
                            bundle2.putString("U", jSONObject.getString("U"));
                            bundle2.putString("S", jSONObject.getString("S"));
                            bundle2.putInt("V", jSONObject.getInt("V"));
                            bundle2.putInt("LV", jSONObject.getInt("LV"));
                            bundle2.putInt("R", jSONObject.getInt("R"));
                            bundle.putBundle(String.valueOf(i), bundle2);
                            i++;
                        }
                    }
                    switch (i2) {
                        case 0:
                            message.what = 7;
                            message.setData(bundle);
                            C1268kt.m4107a();
                            if (C1268kt.m4109b() instanceof OLPlayHall) {
                                C1268kt.m4107a();
                                ((OLPlayHall) C1268kt.m4109b()).f4403s.handleMessage(message);
                                return;
                            }
                            return;
                        case 1:
                            message.what = 15;
                            message.setData(bundle);
                            C1268kt.m4107a();
                            if (C1268kt.m4109b() instanceof OLPlayRoom) {
                                C1268kt.m4107a();
                                ((OLPlayRoom) C1268kt.m4109b()).f4482G.handleMessage(message);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (Exception e32) {
                    e32.printStackTrace();
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: b */
    public static void m3954b(String str) {
        Bundle bundle = new Bundle();
        Message message = new Message();
        try {
            C1268kt.m4107a();
            if (C1268kt.m4109b() instanceof OLPlayHall) {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray("L");
                int i = jSONObject.getInt("R");
                C1268kt.m4107a();
                OLPlayHall oLPlayHall = (OLPlayHall) C1268kt.m4109b();
                Bundle bundle2 = new Bundle();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    Bundle bundle3 = new Bundle();
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    bundle3.putString("U", jSONObject2.getString("U"));
                    bundle3.putString("S", jSONObject2.getString("S"));
                    bundle3.putInt("LV", jSONObject2.getInt("LV"));
                    bundle3.putInt("R", i);
                    bundle2.putBundle(String.valueOf(i2), bundle3);
                }
                bundle.putBundle("L", bundle2);
                bundle.putInt("R", i);
                bundle.putInt("S", jSONObject.getInt("S"));
                bundle.putInt("P", jSONObject.getInt("P"));
                message.setData(bundle);
                message.what = 12;
                oLPlayHall.f4403s.handleMessage(message);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m3955c(String str) {
        Bundle bundle = new Bundle();
        Message message = new Message();
        message.what = 3;
        try {
            C1268kt.m4107a();
            if (C1268kt.m4109b() instanceof OLPlayHall) {
                C1268kt.m4107a();
                OLPlayHall oLPlayHall = (OLPlayHall) C1268kt.m4109b();
                JSONObject jSONObject = new JSONObject(str);
                C1264kp c1264kp = new C1264kp((byte) jSONObject.getInt("I"), jSONObject.getString("N"), jSONObject.getInt("F"), jSONObject.getInt("M"), jSONObject.getInt("S"), jSONObject.getInt("P"), jSONObject.getInt("V"), jSONObject.getInt("C"), jSONObject.getInt("D"));
                if (c1264kp.mo3444c() + c1264kp.mo3445d() == 0) {
                    oLPlayHall.f4392h.remove(Byte.valueOf(c1264kp.mo3442a()));
                } else {
                    oLPlayHall.mo2825a(c1264kp.mo3442a(), c1264kp);
                }
                Iterator it = oLPlayHall.f4392h.values().iterator();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (it.hasNext()) {
                        c1264kp = (C1264kp) it.next();
                        c1264kp.mo3443b();
                        Bundle bundle2 = new Bundle();
                        bundle2.putByte("I", c1264kp.mo3442a());
                        bundle2.putString("N", c1264kp.mo3443b());
                        bundle2.putIntArray("UA", c1264kp.mo3447f());
                        bundle2.putBoolean("IF", c1264kp.mo3448g());
                        bundle2.putInt("IP", c1264kp.mo3446e());
                        bundle2.putInt("PA", c1264kp.mo3449h());
                        bundle2.putInt("V", c1264kp.mo3450i());
                        bundle2.putInt("D", c1264kp.mo3451j());
                        bundle.putBundle(String.valueOf(i2), bundle2);
                        i = i2 + 1;
                    } else {
                        message.setData(bundle);
                        oLPlayHall.f4403s.handleMessage(message);
                        return;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m3956d(String str) {
        try {
            Message message = new Message();
            message.what = 1;
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            C1268kt.m4107a();
            if (C1268kt.m4109b() instanceof OLPlayRoom) {
                C1245jx c1245jx;
                C1268kt.m4107a();
                OLPlayRoom oLPlayRoom = (OLPlayRoom) C1268kt.m4109b();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    c1245jx = jSONObject.getString("N").equals("") ? new C1245jx((byte) jSONObject.getInt("P"), jSONObject.getString("N"), null, jSONObject.getString("S"), jSONObject.getString("R"), jSONObject.getString("H"), jSONObject.getInt("L"), jSONObject.getInt("V"), jSONObject.getInt("C"), jSONObject.getInt("G"), jSONObject.getInt("O")) : new C1245jx((byte) jSONObject.getInt("P"), jSONObject.getString("N"), jSONObject.getJSONObject("F"), jSONObject.getString("S"), jSONObject.getString("R"), jSONObject.getString("H"), jSONObject.getInt("L"), jSONObject.getInt("V"), jSONObject.getInt("C"), jSONObject.getInt("G"), jSONObject.getInt("O"));
                    oLPlayRoom.mo2858a(c1245jx.mo3394e(), c1245jx);
                    i = i2 + 1;
                }
                Bundle bundle = new Bundle();
                Iterator it = oLPlayRoom.f4531o.mo2700O().values().iterator();
                i = 0;
                while (true) {
                    int i3 = i;
                    if (it.hasNext()) {
                        c1245jx = (C1245jx) it.next();
                        Bundle bundle2 = new Bundle();
                        bundle2.putByte("PI", c1245jx.mo3394e());
                        bundle2.putString("N", c1245jx.mo3385a());
                        c1245jx.mo3385a();
                        bundle2.putString("S", c1245jx.mo3388b());
                        bundle2.putString("IR", c1245jx.mo3391c());
                        bundle2.putString("IH", c1245jx.mo3393d());
                        bundle2.putInt("IV", c1245jx.mo3396g());
                        bundle2.putInt("LV", c1245jx.mo3397h());
                        bundle2.putInt("TR", c1245jx.mo3398i());
                        bundle2.putInt("JA", c1245jx.mo3399j());
                        bundle2.putInt("HA", c1245jx.mo3400k());
                        bundle2.putInt("SH", c1245jx.mo3404o());
                        bundle2.putInt("CL", c1245jx.mo3401l());
                        bundle2.putInt("GR", c1245jx.mo3402m());
                        bundle2.putInt("CP", c1245jx.mo3403n());
                        bundle.putBundle(String.valueOf(i3), bundle2);
                        i = i3 + 1;
                    } else {
                        bundle.putString("SI", "");
                        bundle.putString("MSG", "");
                        message.setData(bundle);
                        oLPlayRoom.f4482G.handleMessage(message);
                        return;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m3957e(String str) {
        C1268kt.m4107a();
        if (C1268kt.m4109b() instanceof OLPlayRoom) {
            C1268kt.m4107a();
            OLPlayRoom oLPlayRoom = (OLPlayRoom) C1268kt.m4109b();
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = new JSONArray(C1340nk.m4156b(jSONObject.getString("P")));
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                int length = jSONArray.length();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        bundle.putString("SI", jSONObject.getString("S"));
                        bundle.putString("MSG", jSONObject.getString("MSG"));
                        message.setData(bundle);
                        oLPlayRoom.f4482G.handleMessage(message);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    C1245jx c1245jx = jSONObject2.getString("N").equals("") ? new C1245jx((byte) jSONObject2.getInt("P"), jSONObject2.getString("N"), null, jSONObject2.getString("S"), jSONObject2.getString("R"), jSONObject2.getString("H"), jSONObject2.getInt("L"), jSONObject2.getInt("V"), jSONObject2.getInt("C"), jSONObject2.getInt("G"), jSONObject2.getInt("O")) : new C1245jx((byte) jSONObject2.getInt("P"), jSONObject2.getString("N"), jSONObject2.getJSONObject("F"), jSONObject2.getString("S"), jSONObject2.getString("R"), jSONObject2.getString("H"), jSONObject2.getInt("L"), jSONObject2.getInt("V"), jSONObject2.getInt("C"), jSONObject2.getInt("G"), jSONObject2.getInt("O"));
                    oLPlayRoom.mo2858a(c1245jx.mo3394e(), c1245jx);
                    bundle2.putByte("PI", c1245jx.mo3394e());
                    bundle2.putString("N", c1245jx.mo3385a());
                    bundle2.putString("S", c1245jx.mo3388b());
                    bundle2.putString("IR", c1245jx.mo3391c());
                    bundle2.putString("IH", c1245jx.mo3393d());
                    bundle2.putInt("IV", c1245jx.mo3396g());
                    bundle2.putInt("LV", c1245jx.mo3397h());
                    bundle2.putInt("TR", c1245jx.mo3398i());
                    bundle2.putInt("JA", c1245jx.mo3399j());
                    bundle2.putInt("HA", c1245jx.mo3400k());
                    bundle2.putInt("SH", c1245jx.mo3404o());
                    bundle2.putInt("CL", c1245jx.mo3401l());
                    bundle2.putInt("GR", c1245jx.mo3402m());
                    bundle2.putInt("CP", c1245jx.mo3403n());
                    bundle.putBundle(String.valueOf(i2), bundle2);
                    i = i2 + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
