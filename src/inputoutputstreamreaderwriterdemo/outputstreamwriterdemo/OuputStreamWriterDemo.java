/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamreaderwriterdemo.outputstreamwriterdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

/**
 * OuputStreamWriterDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/OutputStreamWriter.html
 */
public class OuputStreamWriterDemo {
     public static void main(String[] args) {
        // キーボード入力をOutputStreamWriterのSystem.outとfileへ出力         
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            OutputStreamWriter ow_system = new OutputStreamWriter(System.out);
            String file_path = "src\\inputoutputstreamreaderwriterdemo\\outputstreamwriterdemo\\OutputStreamWriter.txt";
            OutputStreamWriter ow_file = new OutputStreamWriter(new FileOutputStream(file_path));
            String s;
            while((s = br.readLine()) != null){
                ow_system.write(s + '\n');
                ow_file.write(s + '\n');
                ow_system.flush();
                ow_file.flush();
            }
            ow_system.close();
            ow_file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
}
