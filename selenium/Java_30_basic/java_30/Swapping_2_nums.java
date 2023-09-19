package java_30;

public class Swapping_2_nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;int b=20;
		System.out.println("value of a and b before swapping"+a+" "+b);

//by using teh 3rd varibale
		{	int t=a;
		a=b;
		b=t;
		System.out.println("value of a and b after swapping"+a+" "+b);
		}
		//By using the + and - without using teh 3rd varible
		{
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("value of a and b after swapping"+a+" "+b);

		}
		//By using the * and / without using teh 3rd varible
				{
					a=a*b;
					b=a/b;
					a=a/b;
					System.out.println("value of a and b after swapping"+a+" "+b);

				}
				//By using the bitwise operator
				{
					a=a^b;
					b=a^b;
					a=a^b;
					System.out.println("value of a and b after swapping"+a+" "+b);

				}
				//By using the single statemet
				{
					b=a+b-(a=b);
					System.out.println("value of a and b after swapping"+a+" "+b);

				}
	}

}
