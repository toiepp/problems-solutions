package me.mikholskiy.medium;

// https://leetcode.com/problems/string-to-integer-atoi/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
Проходимся по строке
Идем до первого числа или до знака +/-
Проходимся до конца числа
После чего собираем число в Integer*/

public class StringToInteger {
	public int myAtoi(String s) {
		s = s.trim();

		boolean isNegative = false;
		List<Character> places = new ArrayList<>();

		for (int i = 0; i < s.length(); ++i) {

		}

		return 0;
	}

	public static void main(String[] args) {
//		System.out.println(new StringToInteger().myAtoi(new Scanner(System.in).next()));

		Stream.of(" -+0123456789".split("")).forEach(e -> System.out.println(e + " => " + (int) e.charAt(0)));
	}
}
