/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datainputoutputstreamdemo.dataoutputstreamdemo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * DataOutputStreamDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/DataOutputStream.html
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try {
            String file_path = "src\\datainputoutputstreamdemo\\data_output_stream_file";
            
            FileOutputStream fos = new FileOutputStream(file_path);
            
            // DataOutputStream
            DataOutputStream dos = new DataOutputStream(fos);
            
            // write
            dos.writeBoolean(false);
            dos.writeBoolean(true);
            dos.writeByte(Byte.MAX_VALUE);
            dos.writeChar('A');
            dos.writeDouble(Double.MAX_VALUE);
            dos.writeFloat(Float.MAX_VALUE);
            dos.writeInt(Integer.MAX_VALUE);
            dos.writeLong(Long.MAX_VALUE);
            dos.writeShort(Short.MAX_VALUE);
            dos.writeUTF("This File is written DataOutputStreamDemo."); // Stringの書き込み
            
            dos.flush();
            // close
            dos.close();
            
            System.out.println("Completed! Wrote " + file_path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
