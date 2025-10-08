package org.kanha.M_switch_expression;

public class SwitchExample {
	public static void main(String[] args) {
		String day = "MONDAY";
		int result = switch (day) {
		case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
		case "TUESDAY" -> 7;
		default -> throw new IllegalArgumentException("Unknown day: " + day);
		};
		System.out.println("Result = " + result);
	}
}
