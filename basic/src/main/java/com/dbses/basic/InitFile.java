package com.dbses.basic;

import java.io.File;
import java.io.IOException;

/**
 * @author yanglulu
 * @date 2021/11/22
 */
public class InitFile {

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 3; i++) {
            File file = new File(RenameFile.path + "/" + i + "-123.txt");
            file.createNewFile();
        }
    }

}
