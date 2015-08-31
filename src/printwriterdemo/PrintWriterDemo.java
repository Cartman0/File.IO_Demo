/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printwriterdemo;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

/**
 * PrintWriterDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/PrintWriter.html
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        
        try {
            // PrintWriter でのfile書き込みテスト           
            String file_path = "src\\printwriterdemo\\printwriter_file.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(file_path));
            
            PrintWriter pw = new PrintWriter(bw, true);
               
            pw.println(true);
            pw.println('A');
            pw.println(500);
            pw.println(40000L);
            pw.println(45.7f);
            pw.println(45.7);
            pw.println("Hello");
            pw.println(new Integer("99"));
            
            pw.flush();
            pw.close();
            
            System.out.println("Wrote PrintWriter file");
            
           } catch (Exception e) {
               e.printStackTrace();
           }
        
        try {
            // PrintWriter での標準出力書き込みテスト       
            PrintWriter pw = new PrintWriter(System.out, false);

            pw.println(true);
            pw.println('A');
            pw.println(500);
            pw.println(40000L);
            pw.println(45.7f);
            pw.println(45.7);
            pw.println("Hello");
            pw.println(new Integer("99"));

            pw.flush();
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
