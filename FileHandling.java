import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileHandling {
    public static void main(String[] args) {
        FileHandling a = new FileHandling();
        //a.output();
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile();
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
      
          // write in the file
          try {
            FileWriter fw = new FileWriter("new-file.txt");
            
            fw.write("Har Har Mahadev");
            fw.close();
          } catch (IOException e) {
            System.out.println(e.getMessage());
          }
      
          // reading from a file
          try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
            while (br.ready()) {
              System.out.println(br.readLine());
            }
          } catch (IOException e) {
              System.out.println(e.getMessage());      
          }
      
          // create
          try {
            File fo = new File("random.txt");
            fo.createNewFile();
            if(fo.delete()) {
              System.out.println(fo.getName());
            }
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
    }
  static void input() {
    try (InputStreamReader isr = new InputStreamReader(System.in)) {
      System.out.print("Enter some letters:");
      int letters = isr.read();
      while(isr.ready()) {
        System.out.println((char) letters);
        letters = isr.read();
      }
      // isr.close();
      System.out.println();
    } catch (IOException e) {
        System.out.println(e.getMessage());      
    }

    try (FileReader fr = new FileReader("note.txt")) {
      int letters = fr.read();
      while(fr.ready()) {
        System.out.println((char)letters);
        letters = fr.read();
      }
      // fr.close();
      System.out.println();
    } catch (IOException e) {
        System.out.println(e.getMessage());      
    }

    // byte to char stream and then reading char stream
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("You typed: " + br.readLine());
    } catch (IOException e) {
        System.out.println(e.getMessage());      
    }

    try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
      while (br.ready()) {
        System.out.println(br.readLine());
      }
    } catch (IOException e) {
        System.out.println(e.getMessage());      
    }
  }
  static void output() {
      // output
    OutputStream os = System.out;
    // os.write(😍); // range is exceeded

    try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
      osw.write("Hello World");
      osw.write(97);
      osw.write(10);
      osw.write('A');
      osw.write('\n');
      char[] arr = "hello world".toCharArray();
      osw.write(arr);
      // osw.write(😍);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    try (FileWriter fw = new FileWriter("note.txt", true)) {
      fw.write("this should be appended");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
      bw.write("Hare Krishna");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    }
}
