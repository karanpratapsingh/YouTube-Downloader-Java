package com.youtube.downloader;

import com.github.axet.vget.VGet;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiVget {

    /*
     * This class uses VGet API , which automatically parses the URL and starts downloading
     */

    private String url = null;
    private String path = null;

    public void function(String url) {

        this.url = url;

        try {

            File downloadDir = new File("Downloads");
            downloadDir.mkdir();

            this.path = downloadDir.getAbsolutePath();

            VGet vGet = new VGet(new URL(url), new File(path));

            System.out.println("\n[*] Please wait ....\n" +
                    "[*] Downloading files at path : "
                    + this.path + "\n");

            vGet.download();

            // List the Files :
            try {

                fileList(downloadDir);
            } catch (Exception e) {

                e.printStackTrace();
            }
        } catch (MalformedURLException mue) {

            mue.printStackTrace();
        }

    }

    private void fileList(File file) throws Exception {

        System.out.println("[>] File are : ");
        File[] files = file.listFiles();

        for (File n : files) {

            System.out.println((char) 27 + "[32m" + "    -> " + n.getName() + (char) 27 + "[0m");
        }
    }

    public String getPath() {
        return path;
    }
}
