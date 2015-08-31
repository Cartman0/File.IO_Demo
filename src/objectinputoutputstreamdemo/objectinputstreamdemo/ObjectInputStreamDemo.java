/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectinputoutputstreamdemo.objectinputstreamdemo;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.EOFException;

/**
 * ObjectInputStreamDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/ObjectInputStream.html
 */
public class ObjectInputStreamDemo {
     public static void main(String[] args) {
        try {
            String file_path = "src\\objectinputoutputstreamdemo\\object_stream_file.tmp";
            
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file_path));
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            System.out.println(ois.readBoolean());
            System.out.println(ois.readByte());
            System.out.println(ois.readChar());
            System.out.println(ois.readDouble());
            System.out.println(ois.readFloat());
            System.out.println(ois.readInt());
            System.out.println(ois.readLong());
            System.out.println(ois.readShort());
            System.out.println(ois.readUTF());
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
           
            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        // writeObjectを読み込む
        
        try {
            String file_path = "src\\objectinputoutputstreamdemo\\object_stream_file2.tmp";
            System.out.println("\ninput ObjectInputStream " + file_path);
            
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file_path));
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            Object o;
            while (true) {
                try {
                    o = ois.readObject();
                    System.out.println(o);
                } catch (EOFException ex) {
                    break;
                }
            } 
            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
     }
}
