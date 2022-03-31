import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arr.add(s.nextInt());
        }

        for (int i: arr) {
            str.delete(0, str.length());
            if (i % 3 == 0) str.append("Fizz");
            if (i % 5 == 0) str.append("Buzz");
            if (str.length() == 0) str.append(i);
            System.out.println(str);
        }
    }
}
