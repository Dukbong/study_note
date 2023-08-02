import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  /*
    문제
    상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
    상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
    상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

    출력
    상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
  */
	public static void main(String[] args) throws IOException {

    // 방법 1 : 메모리 : 14280KB 시간 : 124ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		int five = N / 5;
		if(N % 5 == 0) { // 단순하게 5의 배수
			result = five;
		}else {
			while(true) {
				int check = 0;
				if(five > 0) {					
					check = N - (five * 5);
				}else {
					check = N;
				}
				if(check % 3 == 0) { // 나머지에서 3의 배수를 찾는다.
					result = five + (check / 3);
					break;
				}else if(five > 0) {
					five --;
				}else if (five == 0 && check % 3 != 0) {
					result = -1; // 못만드는 경우 -1을 반환한다.
					break;
				}
			}
		}
		System.out.println(result);

    // 방법 2 : 메모리 : 14288KB 시간 : 124ms
    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		int N2 = Integer.parseInt(br.readLine());
		int result2 = 0;
		
		int five2 = N / 5;
        int check2 = N2 % 5;
		if(N2 % 5 == 0) {
			result2 = five2;
		}else {
			if(N2 == 4 || N2 == 7){
                result2 = -1;
            }else if(check2 == 1 || check2 == 3){
                result2 = five2 + 1;
            }else if(check2 == 2 || check2 == 4){
                result2 = five2 + 2;
            }
		}
		System.out.println(result2);
	}
}
