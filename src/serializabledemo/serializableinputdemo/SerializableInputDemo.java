/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabledemo.serializableinputdemo;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.ObjectInputStream;
import serializabledemo.Person;
import java.util.Date;

/**
 *
 * @author nabana
 */
public class SerializableInputDemo {
    public static void main(String[] args) {
        String file_path = "src\\serializabledemo\\serialize_file";
        try {  
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file_path));
            ObjectInputStream ois = new ObjectInputStream(bis);
           
            Object o;
            while(true){
                try {
                    o = ois.readObject();
                    System.out.println(o);
                } catch (EOFException eofe) {
                    break;
                }
            }
            
            System.out.println("\nRead serialize file.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
