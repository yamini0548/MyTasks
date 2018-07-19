import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regx3
{
public static void main(String args[])
{
Pattern compile=Pattern.compile("[a-z]{4}[.][a-z]{3}[.][a-z]{2}");
Matcher matcher=compile.matcher("yaah.com.co");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}
