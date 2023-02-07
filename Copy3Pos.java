class Copy3Pos
{
	public static void main(String [] args)
{
	int [] a = new int [] {10,20,30,40,50,60,70,80,90,100};
	int [] b = new int [3];
	int j = 0;
	for(int k=4;k<=5;k++)
	{
		b[j] = a[k];
		j++;
	}
	System.out.println("Copied array from 3rd to 5th position from array ");
	// j=0;
	// while(j<b.length)
	for(j=0;j<b.length;j++)
		System.out.print(b[j] + " ");
}
}
