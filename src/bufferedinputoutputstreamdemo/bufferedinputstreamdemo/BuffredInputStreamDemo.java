/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedinputoutputstreamdemo.bufferedinputstreamdemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * BuffredInputStreamDemo
 * byteデータを読み込める、
 * がObjectへの復元はできない。
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/BufferedInputStream.html
 */
public class BuffredInputStreamDemo {
     public static void main(String[] args) {       
        try {
            String file_path = "src\\bufferedinputoutputstreamdemo\\buffered_stream_file";
            FileInputStream fis = new FileInputStream(file_path);
            
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            // 読み取り
            int i;
            while ((i = bis.read()) != -1) {                
                System.out.println(i);
            }
            
            // close
            bis.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
