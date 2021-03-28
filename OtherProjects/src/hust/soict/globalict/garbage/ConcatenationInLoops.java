package hust.soict.globalict.garbage;

import java.util.Random;

public class ConcatenationInLoops {

	private static String str;

	public static void main(String[] args) {
		Random r = new Random(123);
//		System.err.println(r.nextInt());
//		System.err.println(r.nextInt());
//		System.err.println(r.nextInt());
		long start = System.currentTimeMillis();
		String str = "";
		for(int i = 0; i < 65536; i++)
			str += r.nextInt(2);
		System.out.println(System.currentTimeMillis() - start);
		
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sBuilder = new StringBuilder();
		for(int i = 0; i < 65536; i++)
			sBuilder.append(r.nextInt(2));
		str = sBuilder.toString();
		System.out.println(System.currentTimeMillis() - start);
		
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuffer sBuffer = new StringBuffer();
		for(int i = 0; i < 65536; i++)
			sBuffer.append(r.nextInt(2));
		str = sBuffer.toString();
		System.out.println(System.currentTimeMillis() - start);
	}
}
