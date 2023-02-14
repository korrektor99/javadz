import java.io.*;
public class sem2zad2 { public static void main(String[] args) {
    
    //запись файла
    String directory = System.getProperty("user.home"); 
    String fileName = "text.txt"; 
    String absolutePath = directory + File.separator + fileName; 
    try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath)) {
        for (int i=0;i<100;i++){
    String fileContent = "TEST  "; 
        
    fileOutputStream.write(fileContent.getBytes()); 
        }
    } catch (FileNotFoundException e) { 

    } catch (IOException e) { 
    
    } 
    
    // чтение файла 
    try(FileInputStream fileInputStream = new FileInputStream(absolutePath)) { 
    int ch = fileInputStream.read(); 
    while(ch != -1) { 
    System.out.print((char)ch); 
    ch = fileInputStream.read(); 
    } 
    } catch (FileNotFoundException e) { 
    } catch (IOException e) {  
    } 
}
}