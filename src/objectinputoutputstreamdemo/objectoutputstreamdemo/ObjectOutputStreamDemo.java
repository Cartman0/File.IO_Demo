/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectinputoutputstreamdemo.objectoutputstreamdemo;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.util.Date;

/**
 * ObjectOutputStreamDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/ObjectOutputStream.html
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        try {
            String file_path = "src\\objectinputoutputstreamdemo\\object_stream_file.tmp";
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file_path));
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            
            // write
            oos.writeBoolean(true);
            oos.writeByte(127);
            oos.writeChar('A');
            oos.writeDouble(1.2345);
            oos.writeFloat(98.76f);
            oos.writeInt(12345);
            oos.writeLong(123456789l);
            oos.writeShort(254);
            oos.writeUTF("writeUTF");
            oos.writeObject("writeObject");
            oos.writeObject(new Date());
            
            oos.flush();
            oos.close();
            System.out.println("Wrote " + file_path);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        // すべてをwriteObjectで書き込む        
        try {
            String file_path = "src\\objectinputoutputstreamdemo\\object_stream_file2.tmp";
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file_path));
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            
            // write
            oos.writeObject(true);
            oos.writeObject(127);
            oos.writeObject('A');
            oos.writeObject(1.2345);
            oos.writeObject(98.76f);
            oos.writeObject(12345);
            oos.writeObject(123456789l);
            oos.writeObject(254);
            oos.writeObject("writeUTF");
            oos.writeObject("writeObject");
            oos.writeObject(new Date());
            
            oos.flush();
            oos.close();
            System.out.println("Wrote " + file_path);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
