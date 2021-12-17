import java.nio.file.Path;
import java.nio.file.Paths;

public class JoinPathDemo {
    public static void main(String[] args) {
        Path basicPath = Paths.get("C:/JavaProgramming");
        Path newPath = Paths.get("IO/Logs");

        //display the paths to the console.
        System.out.println(basicPath.toString());
        System.out.println(newPath.toString());

        //Add a path not found in it(adds newPath to basicPath)
        Path basicPath2 = basicPath.resolve(newPath.toString());

        //returns the absolute portion(basicPath)
        Path newPath2 = newPath.resolve(basicPath.toString());

        //display the resulting paths to the console.
        System.out.println(basicPath2.toString());
        System.out.println(newPath2.toString());


    }// end main
}// end JoinPathDemo
