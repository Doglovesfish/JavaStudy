package com.yide.n2;

import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;
import java.io.IOException;

@Slf4j(topic = "c.Sync")
public class Sync {
    public static void main(String[] args) throws IOException {
        String fileaddress = "C:\\Users\\I525920\\OneDrive - SAP SE\\java-study\\JavaBasicTest\\java-Thread\\src\\main\\test.txt";
        FileReader fr = new FileReader(fileaddress);
        fr.read();
        log.debug("do other things...");
    }
}
