package by.epam.learn.io.print;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintMain {

	public static void main(String[] args) {
		File file =  new File("data\\res.txt");
		double [] values = { 1.2, 2.2, 5.5, 6.05, 7. , .9};
		try(PrintStream stream = new PrintStream(new FileOutputStream(file))) {
			for (double elem: values) {
				stream.printf("Java % .2g %n", elem);
				System.setOut(stream);
				System.out.printf("% .2g %n", elem);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
		 new PrintWriter( new PrintStream(new FileOutputStream(file)));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
