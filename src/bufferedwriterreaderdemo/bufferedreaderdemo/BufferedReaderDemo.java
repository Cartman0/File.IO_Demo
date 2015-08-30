/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedwriterreaderdemo.bufferedreaderdemo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * BufferedReaderDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/BufferedReader.html
 */
public class BufferedReaderDemo {
    public static void main(String[] args){
        // バッファ付き文字ストリームの読み取り
         try {
            // Reader
            String read_path = "src\\bufferedwriterreaderdemo\\buffered_write_file";
            FileReader fr = new FileReader(read_path);
            
            // BufferedReader
            BufferedReader br = new BufferedReader(fr);
            
            // ファイルから行をとって表示
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            
            // buffered を閉じる            
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
