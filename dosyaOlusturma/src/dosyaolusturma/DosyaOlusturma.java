
package dosyaolusturma;

import java.io.*;

public class DosyaOlusturma {

    public static void main(String[] args) throws IOException {
        File file = new File("kod.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        String val = "Kodlama Vakti!";
        FileWriter fWriter = new FileWriter(file,false);// file dosyasının okunabilir olup olmadığını sorgular
        BufferedWriter bWriter = new BufferedWriter (fWriter);// işi hızlandırıyor
        bWriter.write(val);
        bWriter.write("\nJava Dersleri");
        bWriter.close();
        
        FileReader fReader = new FileReader(file);// hangi dosyayı okusun istiyosak onu içine yazıyoruz
        String line;
        
        BufferedReader bReader = new BufferedReader(fReader);//hangi dosyayı okusun istiyosak onu içine yazıyoruz
        
        while((line = bReader.readLine())!= null){// readline her satırı tek tek okuyor
            System.out.println(line);
            
        }
        bReader.close();
        
        
    }
    
}
