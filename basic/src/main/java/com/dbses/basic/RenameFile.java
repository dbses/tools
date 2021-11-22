package com.dbses.basic;

import java.io.File;

/**
 * @author yanglulu
 * @date 2021/11/22
 */
public class RenameFile {

    static final String path = "D:/test";
    private static final String target = "-123";

    public static void main(String[] args) {

        File dir = new File(path);

        for (File file : dir.listFiles()) {

            if (file.getName().contains(target)) {
                String newName = file.getName().replace(target, "");
                file.renameTo(new File(path + "/" + newName));
            }
        }

    }

}
