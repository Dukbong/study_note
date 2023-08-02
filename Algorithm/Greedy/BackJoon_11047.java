import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    /*
      문제
      준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
      동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

      입력 
      첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
      둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

      출력
      첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
    */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 방법 1 >> 메모리 : 14288KB / 시간 : 120ms
        // StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 방법 2 >> 메모리 : 14276KB / 시간 : 124ms
        String[] str = br.readLine().split(" ");
        
        int result = 0; // 결과값
        // 방법 1
        // int N = Integer.parseInt(st.nextToken()); // 종류 개수
        // int K = Integer.parseInt(st.nextToken()); // 만들어야하는 값
        // 방법 2
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        
        int[] pack = new int[N];
        // 오름 차순으로 부여된다.
        for(int i = 0; i < N; i++){
            pack[i] = Integer.parseInt(br.readLine());
        }
        
        // 큰값부터 확인한다.
        for(int i = N-1; i >= 0; i--){
            if(pack[i] <= K)
                result += K / pack[i]; // 지금 값을 몇개 쓸 수 있는지 확인
                K = K % pack[i]; // 나머지를 이용해서 다음 값을 가져온다.
        }
        System.out.println(result);
    }
}
