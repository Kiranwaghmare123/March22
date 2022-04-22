public class Recursion9 {



		static void display(String str, String ans)
		{

			if (str.length() == 0) {
				System.out.print(ans + " ");
				return;
			}

			for (int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);
				String res = str.substring(0, i) + str.substring(i + 1);
				display(res, ans + ch);
			}
		}

	
		public static void main(String[] args)
		{
			String s = "abc";
			display(s, "");
		}
	

}