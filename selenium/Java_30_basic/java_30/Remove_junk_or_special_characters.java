package java_30;

public class Remove_junk_or_special_characters {

	public static void main(String[] args) {
		String S="a&*^&@^*@&*@*@f()@)d(b(*><??}:}:><>";
		S=S.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(S);
	}

}
