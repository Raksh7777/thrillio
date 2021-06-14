package com.company.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class IOUtil {

    public static void read(List<String> data, String filename) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String read(InputStream in) {
        StringBuilder text = new StringBuilder();
        // TODO Auto-generated method stub
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return text.toString();
    }

    public static void write(String webpage, long id) {
        // TODO Auto-generated method stub
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Software/JID/GitHubProjects/JavaInDepth/thrillio/pages"+String.valueOf(id)+".html"), "UTF-8"))) {
            writer.write(webpage);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}