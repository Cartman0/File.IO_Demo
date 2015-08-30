/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo;

import java.io.File;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 *
 * @author nabana
 */
public class FileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //定数を表示
            System.out.println("pathSeparatorChar = " + File.pathSeparatorChar);
            System.out.println("separatorChar = " + File.separatorChar);
            
            // いくつかのメソッドテスト
            String file_path = "src\\filedemo\\FileDemo.java";
            File file = new File(file_path);
            if(file.canRead()){
                System.out.println("getName() = " + file.getName());
                System.out.println("getParent() = " + file.getParent());
                System.out.println("getAbsolutePath() = " + file.getAbsolutePath());
                System.out.println("getCanonicalPath() = " + file.getCanonicalPath());
                System.out.println("getPath() = " + file.getPath());
                System.out.println("canWrite() = " + file.canWrite());
                
                //copy
                File copy_file = new File(file.getParent() + "\\copy");
                Files.copy(file.toPath(), copy_file.toPath(), REPLACE_EXISTING);
                System.out.println("Copy");
                
                // rename
                System.out.println("renameTo " + copy_file.renameTo(new File(copy_file.getParent() + "\\rename")));
                
            }else{
                System.out.println("Not file.canRead()");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
