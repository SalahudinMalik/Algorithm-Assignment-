package RE;
import java.util.Scanner;
public class TrasitionTable {
	public static void main(String[] arg)
	{
		int countAlphabat=0 ;
		int [] rem= new int[10];
		char[] set={'(' , ')' , '+' , '*' , 'a' ,'b'};
		int openBraces , closeBraces = 0;
		
		System.out.print("Enter Regular Expression: ");
		Scanner sc = new Scanner(System.in);
		String  input = sc.next();
		char [] arrin = input.toLowerCase().toCharArray();
		int stat=0;
		for(int i=0; i<arrin.length; i++)
		{
			stat=0;
			for(int j=0 ; j<set.length; j++)
			{
				if(arrin[i]==set[j])
				{
					stat++;
				}
				
			}
			if(stat==0)
			{
				System.out.println("Invalid Expression.");
				System.exit(0);
			}
		}
		for(int i=0; i<arrin.length; i++)
		{
			int ascii = (int) arrin[i];
			if(ascii>=97 || ascii<=122)
			{
				rem[i]=ascii;
				countAlphabat++;
				
			}
			//System.out.print(arrin[i]+"\n");
			
		}
		char [] alphabat = new char [countAlphabat];
		int ii=0;
		for(int i = 0; i<countAlphabat; i++)
		{
			int ascii = (int) arrin[i];
			if(ascii>=97 && ascii<=122)
			{
				alphabat [ii] = arrin[i];
				ii++;
			}
		}
		/* for( int j=0; j<=countAlphabat; j++)
		{
			for(int k=0; k<=countAlphabat; k++)
			{
				if(j!=k && rem[j]==rem[k])
				{
					System.out.println(rem[k]);
				}
			}
			
		} */
		boolean found = true;
		char [][] output = new char [countAlphabat][1];
		System.out.println("  Trasition Table");
		System.out.print("\tA | B\n");
		for( int j=0; j<ii; j++)
		{
			System.out.print(j+"\t");
			found = true;
			for(int k=0; k<2; k++)
			{
				
				if(alphabat[j]=='a' && found == true && k==0)
				{
					System.out.print((j+1)+"   " );
					found = false;
				}
				else if(alphabat[j]=='b' && found == true && k==1)
				{
					System.out.print((j+1) +  "   ");
					found = false;
				}
				else
					System.out.print('N'+ "   ");
				
			}
			
			System.out.println();
		}
		
//		for(char c : input.toCharArray())
//		{
//			input.charAt(i);
//		}
		//System.out.print("done");
	}
}
