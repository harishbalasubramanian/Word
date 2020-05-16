import java.io.*;
public class Word {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int upper = 0;
		int lower = 0;
		for(int i = 0; i < s.length(); i++) {
			int c = (int)s.charAt(i);
			if(c < 91) {
				upper++;
			}else lower++;
		}
		if(upper > lower) {
			System.out.println(s.toUpperCase());
		}else {
			System.out.println(s.toLowerCase());
		}
	}
}
