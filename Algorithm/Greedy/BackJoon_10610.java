import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main{	
    /*
      문제
      어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다.
      미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
      미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.

      입력
      N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.

      출력
      미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.
    */
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] N = br.readLine().split("");
		Arrays.sort(N);
		
		int check = 0;
        
		StringBuilder sb = new StringBuilder();
    // StringBuilder는 가변이 비동기이며 싱글 스레드일 경우 성능이 가장 좋다.
      
		for(int i = N.length-1; i >= 0; i--) {
			int num = Integer.parseInt(N[i]); 
			check += num; // 합을 구한 후 3의 배수인지 확인해야한다.
			sb.append(String.valueOf(num));
		}

		if(!N[0].equals("0") || check % 3 != 0) {
			System.out.println(-1);
		}else {
			System.out.println(sb.toString());
      // 처음에 int 타입의 변수를 만들어서 했다가 문제를 다시 보고 int로 안된다는 것을 확인
		}
	}
}
