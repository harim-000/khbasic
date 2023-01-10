package khie;

public class PracticStar {
	public static void main(String[] args) 
	{
		for(int i = 0; i <= 3; i++)
		{
			if(i == 0)
			{
				for(int j = 0; j <= 2; j++)
					System.out.print(" ");
				System.out.print("*");
				for(int j = 0; j <= 2; j++)
					System.out.print(" ");
			}
			if(i == 1)
			{
				for(int j = 0; j <= 1; j++)
					System.out.print(" ");
				for(int j = 0; j <=2; j++)
					System.out.print("*");
				for(int j = 0; j <= 1; j++)
					System.out.print(" ");
			}
			if(i == 2)
			{
				for(int j = 0; j < 1; j++)
					System.out.print(" ");
				for(int j = 0; j <5; j++)
					System.out.print("*");
				for(int j = 0; j < 1; j++)
					System.out.print(" ");
			}
			else if(i ==3)
			{
				for(int j = 0; j < 7; j++)
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		for(int i = 0; i <= 6; i++)
		{
			if(i == 0 || i == 6)
			{
				for(int j = 0; j <= 2; j++)
					System.out.print(" ");
				System.out.print("*");
				for(int j = 0; j <= 2; j++)
					System.out.print(" ");
			}
			if(i == 1 || i == 5)
			{
				for(int j = 0; j <= 1; j++)
					System.out.print(" ");
				for(int j = 0; j <=2; j++)
					System.out.print("*");
				for(int j = 0; j <= 1; j++)
					System.out.print(" ");
			}
			if(i == 2 || i == 4)
			{
				for(int j = 0; j < 1; j++)
					System.out.print(" ");
				for(int j = 0; j <5; j++)
					System.out.print("*");
				for(int j = 0; j < 1; j++)
					System.out.print(" ");
			}
			else if(i ==3)
			{
				for(int j = 0; j < 7; j++)
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();

	}
}
