package com.jaeshim.exercise.programmers.lv0;

import java.util.Optional;

public class OptionalTest {

  public static void main(String[] args) {
    Optional<String> empty = Optional.empty(); //빈 객체를 생성
    System.out.println(empty.isEmpty());


    String nullString = null;
    Optional<String> nullString1 = Optional.ofNullable(nullString);
    System.out.println(nullString1.isEmpty());
  }
}
