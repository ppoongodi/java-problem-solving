package questionset;

public class ProblemSolvingSetOne {
	
	/* Reverse a string preserving space position
	 * Input - I Am Not String
	 * Output - g ni rtS toNMAI
	 */
	public String stringReversePreserveSpace(String input)
	{
		StringBuilder br= new StringBuilder(input);
		String output = br.reverse().toString();	
		output =output.replace(" ", "");			
		for(int i=0; i< input.length() ;i++ )
		{
			if(input.charAt(i)== ' ')
			{				
				output=output.substring(0, i) +" "+output.substring(i);				
			}			
		}
		return output;
	}
	
}
