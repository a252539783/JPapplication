package ly.pp.addsongs;

import java.io.File;
import java.util.LinkedList;

/* renamed from: ly.pp.addsongs.p */
public final class C1342p {
    /* renamed from: a */
    public static LinkedList m4157a(String str) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            int i = 0;
            while (i < listFiles.length) {
                if (listFiles[i].isFile() && listFiles[i].getName().endsWith(".ps")) {
                    linkedList.add(listFiles[i]);
                }
                i++;
            }
        }
        return linkedList;
    }

    /* renamed from: b */
    public static LinkedList m4158b(String str) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            int i = 0;
            while (i < listFiles.length) {
                if (listFiles[i].isFile() && listFiles[i].getName().endsWith(".ss")) {
                    linkedList.add(listFiles[i]);
                }
                i++;
            }
        }
        return linkedList;
    }
}
