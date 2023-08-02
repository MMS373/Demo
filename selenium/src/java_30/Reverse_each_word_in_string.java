package java_30;

public class Reverse_each_word_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Welcome to java";
		String Words[]=S.split("\\S");
		String reverseword="";
		for(String W:Words) {
			StringBuilder sb=new StringBuilder(W);
			sb.reverse();
			reverseword=reverseword+sb.toString()+" ";
			
		}System.out.println(reverseword);

	}

}
 