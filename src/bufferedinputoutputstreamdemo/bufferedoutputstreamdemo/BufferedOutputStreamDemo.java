/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedinputoutputstreamdemo.bufferedoutputstreamdemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * BufferedOutputStreamDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/BufferedOutputStream.html
 */
public class BufferedOutputStreamDemo {
     public static void main(String[] args){
        try {
            // FileOutputStream
            String file_path = "src\\bufferedinputoutputstreamdemo\\buffered_stream_file";
            FileOutputStream fos = new FileOutputStream(file_path);
            
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            for(int i = 0; i < 256; i++){
                bos.write(i);
            }
            
            bos.write('\n');
            String str = "Wrote BufferedOutputStream";
            bos.write(str.getBytes());
            
            // BufferedOutputStreamをclose
            bos.close();
            System.out.println("Completed! Wrote " + file_path);
            
        } catch (Exception e) {
            e.printStackTrace();
        }         
     }
}
