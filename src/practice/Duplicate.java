package practice;

public class Duplicate {
	public static void main(String[] args) {
	String str = new String("Java");
	int count = 0;
	char[] ch = str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	for(int j=i+1;j<ch.length;j++)
	{
	if(ch[i]==ch[j])
	{
	System.out.println("Duplicate characters:"+ch[i]);
	count++;
	}
	}
	}
	System.out.println("Duplicate characters count:"+count);
	}
}
