import java.io.IOException;
import java.util.*;


//종료 조건: 1개일 때 A 에서 B로 이동한 함수가 닫히면 그 전 단계 재귀로 다시 돌아오면 원판이 2개일 때가 된다. 1개의 원판이 A 에서 C로 이동하면 되므로,
    // 이 때의 경우를 출력한다

//1. A에서 가장 큰 원판(제일 아래판)을 옮기기 위해서는 n-1 개의 원판이 A 에서 B 로 가야한다
//->그럼 A 원판이 C로 이동, 이동횟수 +1
//2. B 에 있는 (n-1)개의 원판을 C 로 이동한다
// n 개의 원판을 이동시키기 위해 Hanoi(n-1) 횟수만큼 이동한 횟수가 2번이고, 가장 아래 원판은 1번 이동
// => Hanoi(n) = 2 × Hanoi(n-1) + 1

//기본 코드:
/*
	N : 원판의 개수
	start : 출발지
	mid : 옮기기 위해 이동해야 장소
	to : 목적지

  */



public class BOJ_11729 {
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
        if(number == 1){ //종료조건
            sb.append(start + " " + to + "\n");
            return; 
        }
        // STEP 1 : N-1개를 A에서 B로 이동
        HanoiTower(number - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동
        sb.append(start + " " + to + "\n");

        // STEP 3 : N-1개를 B에서 C로 이동
        HanoiTower(number - 1, mid, start, to);

    }
}