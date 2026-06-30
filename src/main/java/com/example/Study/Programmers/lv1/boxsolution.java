package com.example.Study.Programmers.lv1;

import java.util.List;

public class boxsolution {

    /** int N:  상자 개수
     *  int w: row 수
     *  int num : 손님의 상자 갯수
     *  w /n +1 한 이유는
     *  ex ) w =2 고
     *  */

    public int solution(int n, int w, int num) {
        int answer = 0;
        /** 굳이 저 상자를 똑같이 만들어야 하나?
         *  이미 위치는 동일하지 않나..?'
         *
         *  만들어보라는게 그거겠지
         *
         *  odd일땐, 역순, 짝수 일땐 순방향 (0포함)(왼->오)
         * */

        int[][] boxTotal = new int[w][n/w +1];
        //열 만들기
        for(int i = 1; i < boxTotal.length; i++){
            // true면 짝수
            boolean order =  (i == 0 || i%2 == 0);
            // row 쌓기 계산식이 쉽지 않네
            if(order){
                for(int r = w-1; r >= 0; r--){
                  boxTotal[i-1][r] = (w*i)  - (w-r) ;
                }
            }else{
                for(int r = 0; r <= w-1; r++){
                    boxTotal[i-1][r] = (w * i) - r;
                }
            }

        }



        return answer;
    }
}
