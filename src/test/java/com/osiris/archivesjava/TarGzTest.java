package com.osiris.archivesjava;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class TarGzTest {
    @Test
    void test() throws IOException {
        File f1 = new File(System.getProperty("user.dir")+"/src/test/f1.txt");
        File f2 = new File(System.getProperty("user.dir")+"/src/test/f2.txt");
        File f3 = new File(System.getProperty("user.dir")+"/src/test/folder/f3.txt");
        File f4 = new File(System.getProperty("user.dir")+"/src/test/folder/f4.txt");
        f4.getParentFile().mkdirs();
        f1.createNewFile();
        Files.write(f1.toPath(), "File nr1".getBytes(StandardCharsets.UTF_8));
        f2.createNewFile();
        Files.write(f2.toPath(), "File nr2".getBytes(StandardCharsets.UTF_8));
        f3.createNewFile();
        Files.write(f3.toPath(), "File nr3".getBytes(StandardCharsets.UTF_8));
        f4.createNewFile();
        Files.write(f4.toPath(), "File nr4".getBytes(StandardCharsets.UTF_8));
        new TarGz("test").addFile(f1, f2, f3, f4).createInDir(System.getProperty("user.dir")+"/src/test");
    }
}