package org.software;

import java.io.OutputStream; 
import java.util.Scanner;

public class App {
	
	/** The output stream to the port */
	private static OutputStream output;
	
	public static void main(String[] args) {
		String puerto = args[0]; 
		SerialCom main = new SerialCom();
		main.initialize(puerto); 
		output = main.getOutput(); 
		System.out.println("=== INICIO DEL PROGRAMA ===");
		
	}

}
