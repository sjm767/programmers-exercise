package com.jaeshim.exercise.programmers.lv0;

import java.util.*;

public class Main {

  public static String solution(String s, String skip, int index) {
    String answer = "";


    List<Character> list = new ArrayList<>();
    for (char ch = 'a'; ch<='z';ch++){
      list.add(ch);
    }
    for (Character character : skip.toCharArray()){
      list.remove(character);
    }

    Map<Character, Integer> map = new HashMap<>();
    for (int i=0;i<list.size();i++){
      map.put(list.get(i), i);
    }
    int totalCnt = map.size();
    for (Character ss : s.toCharArray()) {
      Integer idx = map.get(ss);

      int nIdx = (idx + index) % totalCnt;
      answer += list.get(nIdx);
    }

    return answer;
  }

  public static void main(String[]args) {
    String s= "aukks";
    String skip = "wbqd";
    int index = 5;

    System.out.println(solution(s,skip,index));
  }
}
