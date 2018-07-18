import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regx1
{
public static void main(String args[])
{
Pattern compile=Pattern.compile("[a-zA-Z0-9]*@gmail[.][a-zA-Z]{3}");
Matcher matcher=compile.matcher("yaminikonatham@gmail.com");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}
