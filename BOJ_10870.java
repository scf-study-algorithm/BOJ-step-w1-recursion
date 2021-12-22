package BOJ;
//https://www.acmicpc.net/problem/10870

import java.io.IOException;
import java.util.Scanner;

public class BOJ_10870 {

    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        //logic

        int answer = Fibonacci(number);


        //output
        System.out.println(answer);
    }

    public static int Fibonacci(int num) {
        //int start = 0;

        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return Fibonacci(num - 1) + Fibonacci(num - 2);
        }

    }
}
