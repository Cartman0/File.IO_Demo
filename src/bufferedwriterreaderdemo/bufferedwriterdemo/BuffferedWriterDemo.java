/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedwriterreaderdemo.bufferedwriterdemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BuffferedWriterDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/BufferedWriter.html
 */
public class BuffferedWriterDemo {
    public static void main(String[] args){
        // バッファ付き文字ストリームの書き込み        
        try {
            // FileWriter
            String write_file_path = "src\\bufferedwriterreaderdemo\\buffered_write_file";
            FileWriter fw = new FileWriter(write_file_path);
            
            // BufferedWriter
            BufferedWriter bw = new BufferedWriter(fw);
            
            //
            for (int i = 0; i < 12; i++) {
                bw.write("Line " + i + "\n");
            }
            
            bw.close();
            System.out.println("CompleteWrote");
            
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
