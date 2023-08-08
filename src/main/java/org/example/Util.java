package org.example;

import java.nio.file.Paths;

public class Util {
    public static String getPathToProjectFolder() {
        return Paths.get("").toAbsolutePath().toString();
    }
}
