package homework02;
import java.io.InputStream;
/*
 * To. 개발자님
저희는 비트올림픽 위원회입니다.
한번의 트랙에서 육상선수는 총 3명 입니다.
총 세명의 100m 기록을 입력받아서 
1, 2, 3 등을 가려야 합니다.

A 선수 기록 : 10.5초
B 선수 기록 : 10.8초
C 선수 기록 : 10.1초 
라고 입력받았다면

###### 성적 랭킹 #######

1등 : C 선수 기록 (10.1초)
2등 : A 선수 기록 (10.5초)
3등 : B 선수 기록 (10.8초)

 */
import java.util.Scanner;
public class Ranking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = {"A","B","C"}, time = new String[name.length];
		int arrayLength = name.length;
		boolean[] check = new boolean[arrayLength];
		for(int i = 0; i < arrayLength; i++) {
			System.out.print(name[i]+" 선수 기록 : ");
			time[i] = scan.next();
		}
		String result = "####### 성적 랭킹 #######\n";
		//A와 B를 비교  A와 C를 비교해서 상위를  sort[]에 저장 다시 B와 C를 비교해서 상위에 저장.
		//처음시도 실패 i 와 j 둘다 0에서 시작하면 맨 나중놈의 기록이 젤 좋을경우 맨 마지막놈 기록으로 도배됨. 기록을 저장한놈은 비교목록에서 제외가 되어야함..
		//단순히 빅목록에서 제외하면 중간에 거쳐가는놈도 제외될수도..
		//if문으로 변경. 어떻게했는지 모르게했음;.. 
		//최적화작업 if문 하나로 줄임.
		for(int i = 0; i < arrayLength; i++) {
			int temp = i;
			String tempS = String.format("%d등 : %s 선수(%s초)\n",i + 1, name[i], time[i]);
			for(int j = 0; j < arrayLength; j++) {				
				if(check[temp] == true || (check[j] != true && Double.parseDouble(time[temp]) > Double.parseDouble(time[j]))){
					tempS = String.format("%d등 : %s 선수(%s초)\n",i + 1, name[j], time[j]);
					temp = j;
				}
			}
			check[temp] = true; 
			result += tempS;
		}
		System.out.println(result);
	}
}
