class DuplicateOrNot {

	public static void main(String[] args) {
		String str = "India is my country";
		char ch ='I';
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			char charVal = str.charAt(i);
			if(ch == charVal)
				cnt++;
		}
		if(cnt>1)
			System.out.println("char ch " + ch + " is duplicated " + cnt + " times");
		else if(cnt == 0)
			System.out.println("char ch = " + ch + " not found");
		else
			System.out.println("char ch = " +ch+" is not duplicated");

	}
}
