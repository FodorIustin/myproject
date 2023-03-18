import java.io.*;
import java.util.Scanner;

public class NrRanduri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numele fisierului: ");
        String fileName = scanner.nextLine();

        System.out.print("Introduceti linia de text: ");
        String searchLine = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            int index = 0;
            while (line != null) {
                if (line.equals(searchLine)) 
                    index++;
                line = reader.readLine();
            }
            reader.close();
            System.out.println("Numarul de linii egale este " + index);
        } catch (IOException e) {
        	System.out.println("A aparut o eroare: "+e);
        }
    }
}
