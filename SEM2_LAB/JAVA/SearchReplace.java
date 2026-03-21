import java.io.*;

public class SearchReplace {
    public static void main(String[] args) {
        String searchWord = "old";
        String replaceWord = "new";
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                int index;
                
                while ((index = line.indexOf(searchWord)) != -1) {
                    line = line.substring(0, index) + replaceWord +
                           line.substring(index + searchWord.length());
                    count++;
                }

                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Replacements made: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}