package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStreamExample {
	public static void main(String[] args) {
		// writing
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"C:\\Users\\chira\\Desktop\\Code\\JavaEclipse\\src\\FileIO\\demo.txt");
			String name = "We are learning java io classes";
			byte arr[] = name.getBytes(); // converting char to byte array
			fileOutputStream.write(arr);
			fileOutputStream.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		// reading
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"C:\\Users\\chira\\Desktop\\Code\\JavaEclipse\\src\\FileIO\\demo.txt");
			int i = 0;
			while ((i = fileInputStream.read()) != -1) {
				System.out.print((char) i);
			}
			fileInputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
