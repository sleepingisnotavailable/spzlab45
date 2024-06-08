package lab4_5;
import java.util.Scanner;
import static lab4_5.Driver.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] argv) {
        while (true){
            System.out.print("Enter command:\n"+currentDir.getAbsPath()+"$ ");
            String command = scanner.nextLine();
            if ("stop".equals(command)) break;
            String[] args = command.split(" ");
            switch (args[0]) {
                case "stat" -> stat(args[1]);
                case "ls" -> ls();
                case "create" -> create(args[1], args[2]);
                case "open" -> open(args[1]);
                case "close" -> close(args[1]);
                case "read" -> read(args[1], args[2]);
                case "write" -> write(args[1], args[2], args[3]);
                case "link" -> link(args[1], args[2]);
                case "unlink" -> unlink(args[1]);
                case "truncate" -> truncate(args[1], args[2]);
                case "mkdir" -> mkDir(args[1]);
                case "rmdir" -> rmDir(args[1]);
                case "cd" -> cd(args[1]);
                case "symLink" -> symLink(args[1],args[2]);
            }
        }
    }
}
