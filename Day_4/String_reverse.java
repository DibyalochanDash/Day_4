package Day_4;

public class String_reverse {

	public static void main(String[] args) {
		String str = "Welcome to Java Programming";

		ReverseString(str);
	}

	private static void ReverseString(String str) {
		String [] s = str.split(" ");
		
		String out = "";
		for (int i = s.length-1;i >= 0 ; i--) {
			out += s[i] + " ";
		}
		System.out.println(out);
	}

}
