package com.vm.training.java.string;

public class StringObjectCreation {
public static void main(String arg[])

{
/*String s1=new String("mani teja");	
String s2=new String("mani teja");

String s3="mani teja";
String s4="mani teja";
System.out.println(s3==s4);
System.out.println(s3.equals(s4));
System.out.println(s1.length());
s1=s1.concat(" p");
System.out.println(s1.length());
System.out.println(s1.toUpperCase());
System.out.println(s1.charAt(8));
System.out.println(s1.compareTo(s4));


System.out.println(s1.intern());
String s5="A";
String s6="a";
System.out.println(s6.compareTo(s5));
System.out.println(s1.codePointAt(1));
System.out.println(s1.codePointBefore(2));
System.out.println(s1.codePointCount(1, 3));
System.out.println(s5.compareToIgnoreCase(s6));
System.out.println(s2.endsWith(s3));
System.out.println(s1.contains(s2));
System.out.println(s1.contentEquals(s6));
System.out.println(s1.contentEquals(s2));
System.out.println(s1.contentEquals(s1));
System.out.println(s2.matches(s3));
String s="   value   Momentum   ";
System.out.println(s.replaceAll(" ", ""));
String str="nic ra nic ra nic ra nic ra";
String word ="ra";
String arr[]=str.split(" ");
int count=0;
for(int i=0;i<arr.length;i++)
{
	if(word.equals(arr[i]))
	{
		count++;
	}
	
}
System.out.println("the word ra has occurs "+count);


StringBuilder sb=new StringBuilder("ABC")
;
sb.append("EFG");
System.out.println(sb);
StringBuffer sbuffer=new StringBuffer("abced");
sbuffer.append("efgh");
System.out.println(sbuffer);
*/






char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
String chStr = String.copyValueOf(ch);
System.out.println(chStr);
String subStr = String.copyValueOf(ch,3,6);
System.out.println(subStr);
String c="My Java example";
c.contentEquals(subStr);
System.out.println("equal");
byte b[]=c.getBytes();
System.out.println(b.length);
System.out.println(c.indexOf("a"));
System.out.println(c.indexOf('a',7));

}


}
