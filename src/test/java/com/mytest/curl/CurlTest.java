package com.mytest.curl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.poi.excel.ExcelUtil;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurlTest {

    public static String execCurl(String[] cmds) {
        ProcessBuilder process = new ProcessBuilder(cmds);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            return builder.toString();

        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void testCurl() {
        String[] cmds = {"curl", "-X", "POST",
                "http://www.baidu.com",
                "-H", "accept: */*", "-H", "Content-Type: application/json;charset=UTF-8", "-d"
                , "{ \\\"bodyName\\\": \\\"bodyValue\\\"}"};
        System.out.println(execCurl(cmds));

    }
}
