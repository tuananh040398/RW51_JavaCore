	package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
	private static final Scanner scanner = null;
	private static void printErrString(String errString) {
		System.out.println(errString);
	}

	public static int inputInt(Scanner scanner, String errString) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	public static float inputFloat(Scanner scanner, String errString) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	public static double inputDouble(Scanner scanner, String errString) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	public static String inputString(String errString) {
		while (true) {
			try {
				String input = scanner.nextLine().trim();
				if (input != null && !input.isEmpty()) {
					return input;
				}
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}
	public static String inputPassWord(String Error) {
		while (true) {
			String pass = ScannerUtils.inputString(Error);
			if (pass.length() < 6 || pass.length() >12 ) {
				System.err.println(Error);
				System.out.println("Nhập sai định dạng mật khẩu.");
				continue;
			}
			
			boolean hasAtLeast1Charater = false;
			
			for (int i = 0; i < pass.length(); i++) {
				if (Character.isUpperCase(pass.charAt(i)) == true) {
					hasAtLeast1Charater = true;
					break;
				}
				
			}
			if (hasAtLeast1Charater == true ) {
				return pass;
			} else {
				System.err.println(Error);
				System.out.println("Nhập sai định dạng mật khẩu.");
			}
		}
	}
}
