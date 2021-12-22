package BOJ;
//https://www.acmicpc.net/problem/11729

import java.io.IOException;
import java.util.*;

//Hanoi(N) = 2 * Hanoi(N-1) + 1
//N개의 원판을 이동시키기 위해 Hanoi(n-1) 횟수만큼 이동한 횟수가 2번에 가장 아래 원판은 1번 이동
//종료 조건: 1개일 때 A 에서 B로 이동한 함수가 닫히면 그 전 단계 재귀로 다시 돌아오면 원판이 2개일 때가 된다. 1개의 원판이 A 에서 C로 이동하면 되므로,
    // 이 때의 경우를 출력한다

//기본 코드:
/*
	N : 원판의 개수
	start : 출발지
	mid : 옮기기 위해 이동해야 장소
	to : 목적지


void Hanoi(int N, int start, int mid, int to) {

        // 이동할 원반의 수가 1개라면?
        if (N == 1) {
        print(start + " " + to + "\n");
        return;
        }

        // STEP 1 : N-1개를 A에서 B로 이동
        Hanoi(N - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동
        print(start + " " + to + "\n");

        // STEP 3 : N-1개를 B에서 C로 이동
        Hanoi(N - 1, mid, start, to);

        }
  */



public class BOJ_10872 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        sb.append((int) (Math.pow(2, number) - 1)).append('\n');

        //logic
        HanoiTower(number, 1, 2, 3);

        //output
        System.out.println(sb);
    }

    public static void HanoiTower(int number, int start, int mid, int to){
        if(number == 1){
            sb.append(start + " " + to + "\n");
            return; //종료
        }
        // STEP 1 : N-1개를 A에서 B로 이동
        HanoiTower(number - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동
        sb.append(start + " " + to + "\n");

        // STEP 3 : N-1개를 B에서 C로 이동
        HanoiTower(number - 1, mid, start, to);

    }
}
