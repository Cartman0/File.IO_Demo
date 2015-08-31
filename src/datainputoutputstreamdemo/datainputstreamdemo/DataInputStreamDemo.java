/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datainputoutputstreamdemo.datainputstreamdemo;

import java.io.FileInputStream;
import java.io.DataInputStream;

/**
 * DataInputStreamDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/DataInputStream.html
 */
public class DataInputStreamDemo {
     public static void main(String[] args) {
        try {
            String file_path = "src\\datainputoutputstreamdemo\\data_output_stream_file";
            FileInputStream fis = new FileInputStream(file_path);
            
            // DataInputStream
            DataInputStream dis = new DataInputStream(fis);
            
            // read             
            System.out.println(dis.readBoolean());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readShort());
            System.out.println(dis.readUTF());
            
            dis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}
