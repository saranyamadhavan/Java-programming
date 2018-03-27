{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter 1 no");
		n=s.nextInt();
		if(n<100000)
		{
			if(n<0)
			{
			System.out.println("negative");
			}
			else if(n>0)
			{
			System.out.println("positive");
			}
			else
			{
				System.out.println("zero");
			}
			
			
		}
		
	}
}
