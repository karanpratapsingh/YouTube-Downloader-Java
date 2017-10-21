package com.youtube.downloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandExec {

    /*
    * This class executes shell commands via bash shell, {Not used in this project yet}
    */
    public void exec(String command) {

        try {


            Process process = Runtime.getRuntime().exec(command);
            getResult(process);


        } catch (Exception exception) {

            exception.printStackTrace();
        }

    }

    private void getResult(Process process) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String content = null;

        try {

            while ((content = bufferedReader.readLine()) != null) {

                System.out.println(content);
            }
        } catch (IOException ioe) {

            ioe.printStackTrace();
        }


    }

}
