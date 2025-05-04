package Programmers.lv1;

public class SortOne {
            /** @Date : 25.05.04
             * 함수 solution은 정수 n을 매개변수로 입력받습니다.
             * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
             * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
             * 제한 조건
             * n은 1이상 8000000000 이하인 자연수입니다.
             * 입출력 예
             * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
             * |   n   | return|
             * .
             * |118372 | 873211|
             * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
             * */
        public static long solution(long n) {
        System.out.println("============sortOne========");
        long answer = 0;
        String rex = String.valueOf(n);
        int[] li = new int[rex.length()];

       for(int i = 0; i<rex.length(); i++){
            int b = Integer.parseInt(String.valueOf(rex.charAt(i)));
            li[i] = b;
        }
        for (int i = 0; i < li.length - 1; i++) {
            for (int j = 0; j < li.length - 1 - i; j++) {
                if (li[j] < li[j + 1]) {  // 내림차순 조건
                    int temp = li[j];
                    li[j] = li[j + 1];
                    li[j + 1] = temp;
                }
            }
        }
        String test ="";
        for(int x=0; x<rex.length(); x++){
            test+= String.valueOf(li[x]);
        }
        answer = Long.parseLong(test);
         System.out.println("============sortOne end========");
        return answer;
    }
}
