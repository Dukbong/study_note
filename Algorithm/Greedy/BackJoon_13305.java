import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main{
// https://www.acmicpc.net/problem/13305
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int result = 0;
		int N = Integer.parseInt(br.readLine());
		
//		방법 1. 총 소요시간 : 432ms <지금부터 aop를 이용해서 소요시간 확인> 17점
//		Queue<Integer> distance = new LinkedList<>();
//		ArrayList<Integer> price = new ArrayList<>();
//		ArrayList<Integer> reversePrice = new ArrayList<>(); // 정렬을 위한 List
//		
//		for(int i = 0; i < 2; i++) {
//			StringTokenizer st;
//				st = new StringTokenizer(br.readLine(), " ");
//			for(int j = 0; j < N-1; j++) {
//				if(i == 0) {
//					distance.add(Integer.parseInt(st.nextToken()));
//				}else {
//					price.add(Integer.parseInt(st.nextToken()));
//				}
//			}
//		}
//		reversePrice.addAll(price);
//		reversePrice.sort(Comparator.reverseOrder());
//		 
//		for(int i = 0; i < N-1; i++) {
//			if(distance.size() == 0) {
//				break;
//			}
//			if(price.get(i) == reversePrice.get(i)) {
//				result += price.get(i) * distance.poll();
//			}else {
//				for(int j = i; j < N-1; j++) {
//					if(price.get(i) <= reversePrice.get(j)) {
//						result += price.get(i) * distance.poll(); 
//					}
//				}
//			}
//		}
		
//		방법 2. 소요시간 : 336ms 58점
//		int[] distance = new int[N-1];
//		int[] price = new int[N-1];
//		for(int i = 0; i < 2; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			for(int j = 0; j < N-1; j++) {
//				if(i == 0) {
//					distance[j] = Integer.parseInt(st.nextToken());
//				}else {
//					price[j] = Integer.parseInt(st.nextToken());
//				}
//			}
//		}
//		int start = price[0];
//		result += start * distance[0];
//		for(int i = 1; i < N-1; i++) {
//			if(start < price[i]) {
//				price[i] = start;
//			}
//			start = price[i];
//			result += start * distance[i];
//		}
		
//		방법 3. 소요시간 : 612ms 100점
		BigInteger[] distance = new BigInteger[N-1];
		BigInteger[] price = new BigInteger[N-1];
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N-1; j++) {
				if(i == 0) {
					distance[j] = new BigInteger(st.nextToken());
				}else {
					price[j] = new BigInteger(st.nextToken());
				}
			}
		}
		BigInteger start = price[0];
		BigInteger result = start.multiply(distance[0]);
		for(int i = 1; i < N-1; i++) {
			if(price[i].compareTo(start)==1) { // price[i] > start
				price[i] = start;
			}
			start = price[i];
			result = result.add(start.multiply(distance[i]));
		}
		System.out.println(result);
  }
}
