package Programmers.lv0;


/** 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
 * 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
 * 1 ≤ n ≤ 100
 * 10	5
 * 15	8
 * */
public class CompositeCnt {

    public static int solution(int n){
        int answer = 0;

        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int ii =1; ii<=i; ii++){
                if(i% ii == 0){
                    cnt++;
                }
            }
            if(cnt >=3){
                answer++;
            }
        }

        return answer;
    }

}
