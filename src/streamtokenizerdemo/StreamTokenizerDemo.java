/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamtokenizerdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StreamTokenizer;

/**
 * StreamTokenizerDemo
 * @author nabana
 * http://docs.oracle.com/javase/jp/8/api/java/io/StreamTokenizer.html
 * /コメントと*コメントの文は認識しない
 */
public class StreamTokenizerDemo {
    final static String file_path_str = "src\\streamtokenizerdemo\\StreamTokenizerDemo.java"; 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(file_path_str);
            StreamTokenizer st = new StreamTokenizer(new BufferedReader(fr));
            
            // . を通常文字(次のトークン)として定義
            st.ordinaryChar('.');
            
            // ' ' を単語文字として定義
            st.wordChars('\'', '\'');
            
            // Tokenを処理
            while (st.nextToken() != StreamTokenizer.TT_EOF){
                switch (st.ttype) {
                    case StreamTokenizer.TT_WORD:
                       System.out.format("%02dw) %s\n", st.lineno(), st.sval);
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.format("%02dn) %f\n", st.lineno(), st.nval);
                        break;
                    default:
                        System.out.format("%02dc) %c\n", st.lineno(), st.ttype );
                }
            }         
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
}
/*
* Anderson's
*/