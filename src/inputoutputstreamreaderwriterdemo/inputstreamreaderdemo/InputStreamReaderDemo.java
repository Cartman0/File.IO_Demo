/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamreaderwriterdemo.inputstreamreaderdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * InputStreamReaderDemo
 * InputStreamReaderはバイト・ストリームから文字ストリームへの橋渡し
 * キーボード入力に使える
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/InputStreamReader.html
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            String s;
            StringBuffer sb;
            while((s = br.readLine()) != null){
                sb = new StringBuffer(s);
                System.out.println(sb.reverse().toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
    }
}
