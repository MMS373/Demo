package java_30;

public class Count_occurence_of_a_character_in_a_string {

	public static void main(String[] args) {
		String s = "Java Programming oops"; // use lowercase s for consistency
		int TC = s.length(); // declare and initialize TC as int
		int TCA = s.replaceAll("a", "").length(); // declare and initialize TCA as int and subtract the lengths
		int count=TC-TCA;
		System.out.println("The occurrence of 'a' in " + s + " is: " + count); // print the result
	}


}
