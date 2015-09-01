/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabledemo.serializableoutputdemo;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import serializabledemo.Person;
import java.util.Date;

/**
 * SerializableOutputDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/Serializable.html
 */
public class SerializableOutputDemo {
    public static void main(String[] args) {
         String file_path = "src\\serializabledemo\\serialize_file";
  
        try {  
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file_path));
            ObjectOutputStream oos = new ObjectOutputStream(bos);
           
            oos.writeObject(new Person("hoge", 20, "a-123", "070-123-5679"));
            oos.writeObject(new Person("hage", 10, "b-345", "090-321-1234"));
            oos.writeObject(new Date());
            
            oos.flush();
            oos.close();
            
            System.out.println("Wrote serialize file.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
