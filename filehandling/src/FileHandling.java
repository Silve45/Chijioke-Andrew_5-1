import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandling {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
        writeFile(employees);
    }//end method main

    static void displayEmployees(ArrayList<String> employees){
    for (String employee: employees)
        System.out.println(employee);
    }

    public static void writeFile(ArrayList<String> employess){
        Path path = Paths.get("C:/JavaProgramming/employees.txt");
        try {
            BufferedWriter bw = Files.newBufferedWriter(path,
                    Charset.forName("ISO-8859-1"),
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            for (String employee: employess){
                bw.write(employee);
                bw.newLine();
            }//endfor
            bw.close();
        }//end try
        catch (IOException ioe){
            System.out.println("error reading file.");
            System.out.println(0);
        }


    }

    static void readFile (ArrayList<String> employees){
        String line = "";
        Path path = Paths.get("C:/JavaProgramming/employees.txt");
        try {
            BufferedReader fileInput =
                    Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));
            line = fileInput.readLine();
            while (line != null){
                employees.add(line);
                line = fileInput.readLine();
            }
            fileInput.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }//end catch1
        catch (EOFException eofe){
            System.out.println("no more lines to read.");
        }// end catch 2
        catch (IOException ioe){
            System.out.println("Error reading file.");
        }// end catch 3
    }

}
