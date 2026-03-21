import java.io.*;

public class FileCopyUppercase {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("source.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destination.txt"));

            int ch;
            while ((ch = bis.read()) != -1) {
                char upperChar = Character.toUpperCase((char) ch);
                bos.write(upperChar);
            }

            bis.close();
            bos.close();

            System.out.println("File copied and converted to uppercase successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}