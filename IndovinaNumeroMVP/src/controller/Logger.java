package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Logger {
	
	public String creaLog(String messaggio) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("Log.txt",true);
			fw.write(messaggio);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return messaggio;
	}

	public void mostraLog() {
		FileReader fr = null;

		try {
			fr = new FileReader("log.txt");
			int i = 0;
			while((i = fr.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
