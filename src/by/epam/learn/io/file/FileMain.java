package by.epam.learn.io.file;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileMain {
	public static void main(String[] args) {
		File file  = new File("data" + File.separator + "info.txt");
		if (file.exists() && file.isFile()) {
			System.out.println("Path " + file.getPath());
			System.out.println("Absolute path " + file.getAbsolutePath());
			System.out.println("Size " + file.length());
			System.out.println("Dir " + file.getParent());
			file.delete();
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		File dir = new File("data");
		if(dir.exists() && dir.isDirectory()){
			for (File current: dir.listFiles()) {
				long millis = current.lastModified();
				LocalDateTime dateTime = Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
				System.out.println(current.getPath() + "\t" + current.length() + "\t" + dateTime);
			}
			File root = File.listRoots()[0];
			System.out.printf("\n %s %,d from %,d free bytes", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
		}
	}
}
