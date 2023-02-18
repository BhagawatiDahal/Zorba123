package grouppractice;

public class QuestionSessionClass {

	public static void main(String[] args) {
		
	int [][][] abc= {
			
			
			{
				
				{111, 222, 234, 456},
				{123, 345, 567,789},
				{432, 445, 657, 889}	
			},
			{
				
				{234, 567, 789, 998},
				{999, 879, 567, 345},
				{456, 345, 234, 223}	
				
			}
			};
	
		
	
	for(int i=0; i<abc.length; i++) {
		
		int [][] row= abc[i];
		for ( int j=0; j<row.length; j++) {
			
			int [] column= row[j]; 
				
				
			for ( int k= 0; k<column.length; k++)	{
				
				System.out.println(column[k]);
					
			}
			}
			}
	
	System.out.println("---------------------------------");
	
	
/*	for(int[][]aaa:abc) {
		
		for(int []aa:aaa) {
			
			
		for (int ac:aa)	{
			
		System.out.println(ac);	
			}
			}}
	*/
	
	
	int i=1;
	
	while(i<11) {
		System.out.println(i);
		i++;
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}











	
	





