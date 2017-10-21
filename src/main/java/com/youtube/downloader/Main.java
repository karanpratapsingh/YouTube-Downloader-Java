package com.youtube.downloader;

import java.util.Scanner;

public class Main {

    /*
     *This is a simple program that downloads YouTube videos using VGet API. may give exceptions , not fully tested
     *ps. i haven't tested this on other sites
     */

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ApiVget apiVget = new ApiVget();

        use();
        System.out.print((char) 27 + "[31m" + "\n[>] Please paste the url of the youtube video : " + (char) 27 + "[0m");
        String url = scanner.nextLine();
        apiVget.function(url);

        // Uncomment the below code if you use linux.

        CommandExec commandExec = new CommandExec();
        String pathForNautilus = "nautilus " + apiVget.getPath();
        System.out.println((char) 27 + "[36m" + "\n[*] Opening Downloads directory ...." + (char) 27 + "[0m");
        commandExec.exec(pathForNautilus);

    }

    private static void use() {

        System.out.println((char) 27 + "[36m" + ":: Use : Paste the url and press space then enter. ::" + (char) 27 + "[0m");
    }
}
