public class Main{
  /*
    문제
    서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?

    입력
    첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.

    출력
    첫째 줄에 자연수 N의 최댓값을 출력한다.
  */
  static long result = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    long S = Long.parseLong(br.readLine());
	    result = S <= 2? 1 : func(S); // 2보다 작다면 1을 반환 아닌 경우 함수 실행
	    
	    System.out.println(result);
	}
  // 합을 구한 후 같다면 그 결과를 커진다면 하나를 뺀 수를 더한다.
	public static long func(long S) {
		long sum = 0;
		for(long l = 1; l < S; l++){
			sum += l;
			result++;
			if(sum == S){
				break;
			}else if(sum > S) {
				result--;
				break;
			}
		}
		return result;
	}
}
