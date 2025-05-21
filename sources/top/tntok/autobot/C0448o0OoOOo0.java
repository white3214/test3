package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: top.tntok.autobot.o0OoOOo0  reason: case insensitive filesystem */
public enum C0448o0OoOOo0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String javaName;

    /* access modifiers changed from: public */
    C0448o0OoOOo0(String str) {
        this.javaName = str;
    }

    public static List<C0448o0OoOOo0> i1LIL11l(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String iiI1L1iI : strArr) {
            arrayList.add(iiI1L1iI(iiI1L1iI));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static C0448o0OoOOo0 iiI1L1iI(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c = 0;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c = 1;
                    break;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    c = 2;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TLS_1_1;
            case 1:
                return TLS_1_2;
            case 2:
                return TLS_1_3;
            case 3:
                return SSL_3_0;
            case 4:
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    public String illlI1lLIL() {
        return this.javaName;
    }
}
