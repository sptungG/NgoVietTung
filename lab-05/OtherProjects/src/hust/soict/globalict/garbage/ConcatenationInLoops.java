package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class ConcatenationInLoops {
	public static void main(String[] args) throws IOException {
	String filename ="test.exe";
	byte[] inputBytes= {0};
	long startTime, endTime;
	
	inputBytes = Files.readAllBytes(Paths.get(filename));
	startTime =System.currentTimeMillis();
	
	//endTime = 4
	StringBuilder outputStringBuilder = new StringBuilder();
	for(byte b: inputBytes) {
		outputStringBuilder.append((char)b);
	}
	//endTime = 174 -> take too much time for long file
	endTime= System.currentTimeMillis();
	System.out.println(endTime - startTime);
	
	}
}