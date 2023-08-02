import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Program7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int add = 0;
		int result = 0;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Integer[] p = new Integer[N];
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		// Collections를 이용해서 오름차순 정렬하기
		// 메모리 : 14452KB / 시간 : 160ms
		List<Integer> list = Arrays.asList(p);
		Collections.sort(list);
		
		// Arrays를 이용해서 오름차순 정렬하기
		// 메모리 : 14372KB / 시간 : 144ms
		Arrays.sort(p);
		
		for(int i = 0; i < list.size(); i++) {
			add += p[i];
			result += add;
		}
		System.out.println(result);
	}
}
