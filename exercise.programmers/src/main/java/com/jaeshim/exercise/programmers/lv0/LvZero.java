package com.jaeshim.exercise.programmers.lv0;

import java.util.*;

public class LvZero {

  public static int[] solution(int[] sequence, int k) {
    int[] answer = new int[2];
    int n = sequence.length;

    int lt=0;
    int sum =0;


    for (int rt = 0; rt < n; rt++) {
      sum+=sequence[rt];
      if(sum==k){
        int len = rt-lt;
        if(len < answer[1]-answer[0]){
          answer[0] = lt;
          answer[1] = rt;
        }
      }
      while(sum>=k){
        sum-=sequence[lt++];
        if(sum==k){
          int len = rt-lt;
          if(len < answer[1]-answer[0]){
            answer[0] = lt;
            answer[1] = rt;
          }
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] sequence = {1,2,3,4,5};
    int k = 7;

    System.out.println(solution(sequence,k));
  }
}
