/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomaccessfiledemo;

import java.io.EOFException;
import java.io.File;
import java.io.RandomAccessFile;

/**
 * RandomAccessFileDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/RandomAccessFile.html
 */
public class RandomAccessFileDemo {
    // byte num
    private final static long COUNT_FROM_TAIL = 40;
    static String file_path_str = "src\\randomaccessfiledemo\\RandomAccessFileDemo.java";
    public static void main(String[] args) {
        try {
            //RandomAccessFile
            File f = new File(file_path_str);
            RandomAccessFile raf = new RandomAccessFile(f, "r");
            
            // 先頭からのファイルの長さ
            long position = raf.length() - COUNT_FROM_TAIL;
            if (position < 0) {
                position = 0;
            }
            
            // seek            
            raf.seek(position);
            
            int i = 1;
            while (true) {
                try {          
                    byte b = raf.readByte();
//                    System.out.println(i++ + " " + (char)b);
                    System.out.print((char)b);
                } catch (EOFException eofe) {
                    break;
                }
            }
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}