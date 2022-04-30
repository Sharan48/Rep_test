package PGM;

public class Pgm1 {
	public static void main(String[] args) {
		String s1="jh23@$#fg#6";
		String s2char="";
		String s3int="";
		String s4spec="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				s2char=s2char+ch;
			}
			else if(Character.isDigit(ch))
			{
				s3int=s3int+ch;
			}
			else
			{
			s4spec=s4spec+ch;	
			}
			System.out.println(s4spec);
			System.out.println(s3int);
			System.out.println(s2char);
		}
	}
}
