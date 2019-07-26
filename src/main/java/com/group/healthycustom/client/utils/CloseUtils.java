package com.group.healthycustom.client.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * 关闭工具类
 * @outhor zsx
 * @time 07.25
 */



//关闭
public class CloseUtils {
    public static void closeAll(Closeable... closeable) {
        for (Closeable c :
                closeable) {
            if (c != null) {
                try {
                    c.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
