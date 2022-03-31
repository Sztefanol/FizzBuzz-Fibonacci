public class FizzBuzz {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            str.delete(0, str.length());
            if(i % 3 == 0) str.append("Fizz");
            if(i % 5 == 0) str.append("Buzz");
            if(str.length() == 0) str.append(i);
            System.out.println(str);
        }
    }
}
