/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamreaderwriterdemo.outputstreamwriterdemo2;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriterDemo2
 * OuputStreamで出力されたファイル（バイト）を         
 * InputStreamReaderで読み込み,
 * OutputStreamWriterで出力
 * @author nabana
 * String or char で出力されたbyte fileであれば復元可能
 */
public class OutputStreamWriterDemo2 {
    public static void main(String[] args) {
        try {
            String read_outstream_file_psth = "src\\bufferedinputoutputstreamdemo\\buffered_stream_file";
            FileInputStream fis = new FileInputStream(read_outstream_file_psth);
            InputStreamReader isr_read_outstream_file = new InputStreamReader(new BufferedInputStream(fis));
            
            OutputStreamWriter osw = new OutputStreamWriter(System.out);
            int c;
            while((c = isr_read_outstream_file.read()) != -1){
                osw.write((char)c);
                osw.flush();
            }
            osw.close();
            isr_read_outstream_file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
}
