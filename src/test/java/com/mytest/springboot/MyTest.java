package com.mytest.springboot;

import com.efund.utils.Sm4Util;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MyTest {

    @Test
    public void helloWorld() {
        System.out.println("hw");
    }

    @Test
    public void testJar() {
        String str = "password=14725836&certType=0&needGenAutoLoginToken=1&fundCode=000009&certID=44018319920330643X";

        try {
            str = Sm4Util.encrypt("2b5a44a4bf5b5db056df6e773b3c6b8d", str);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        System.out.println(str);
        str = "3520SusqelPTcHy9dtJbGQ3YhpV2Q1dXpTSftDDLNiu7/jmiknjeAz11tD6XTpHVDBninjQIrcQF6SFA7Di7sn0xSScswzWke8EwayoFl9lC6D8KUFr/8JjkIE0XROAR";

        try {
            System.out.println("--->" + Sm4Util.decrypt("9113395f41c83cbeac1b0a81fc67c17a", str));
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }
}
