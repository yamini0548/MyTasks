import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regx2
{
public static void main(String args[])
{
Pattern compile=Pattern.compile("[a-z]{5}[.][a-z]{3}[.][a-z]{2}[.][a-z]{2}");
Matcher matcher=compile.matcher("gmail.com.co.in");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}
