class Arrayapp
{
public static void main(String args[])
{
	int[]a1;
	a1=new int[100];
	int j;
	
	//----------------
	a1[0]= 55;
	a1[1]= 33;
	a1[2]= 22;
	a1[3]= 11;
	a1[4]= 66;
	a1[5]= 88;
	a1[6]= 0;
	a1[7]= 44;
	a1[8]= 99;
	a1[9]= 22;
	int n=10;

	//---------------
	for(int i=0;i<n;i++)
	{
		System.out.print(a1[i]+" ");
	}

	//-------------------
	int key=66;
	for(j=0;j<n;j++)
	{
		if(a1[j] == key)
			break;
	}
	if(a1[j]==n)
		System.out.println("Not found");
	else
		System.out.println("Found");
	
	//-------------------------
	key =66;
	for(j=0;j<n;j++)
	{
		if(a1[j] == key)
			break;
	}
	for(int k=j;k<n;k++)
		a1[k]=a1[k+1];
	n--;
	
	//---------------
	for(int i=0;i<n;i++)
	{
		System.out.print(a1[i]+" ");
	}
	
}

}