//Write a program that will read in a name from the command line and write it out 100 times


public class Hundred1Trial3{
	public static void main(String[] args){
		String inputstr = args[0];

		String str = inputstr + " ";
		int consolelength = 80;
		int lesserthanconsolelength = 0;
		int lessercount = 0;
		int stringLength = str.length();
		System.out.println("Input string length + 1 is: " + stringLength);
		System.out.println("So number of times a string to be printed is: " + consolelength/(stringLength));

		for (int i=0; i<100; i++){
			lesserthanconsolelength = lesserthanconsolelength + stringLength;
			if(lesserthanconsolelength<=consolelength){
				System.out.print(str);
			} else {
				i--;
				lessercount++; 
				System.out.println("end" + lessercount);
				lesserthanconsolelength = lesserthanconsolelength-consolelength;
			}
//			System.out.print(lesserthanconsolelength);			
		}	
		System.out.println();		
	}	
}

