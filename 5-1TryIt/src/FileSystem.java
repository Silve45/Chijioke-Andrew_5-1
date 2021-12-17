import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.*;

public class FileSystem {
    public static void main(String[] args) {
        Path[] paths = new Path[1];

        paths[0] = Paths.get("C:/JavaProgramming/NIO2");

        System.out.println(paths[0].toAbsolutePath());

    }
}
//comment