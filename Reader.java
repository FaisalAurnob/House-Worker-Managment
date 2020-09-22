import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {

	public void read(String fileName) {
		try {
			byte[] buffer = new byte[1000];
			FileInputStream inputStream = new FileInputStream(fileName);
			while (inputStream.read(buffer) != -1) {
				System.out.println(new String(buffer));
				
			}
			inputStream.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}
	
	
}
