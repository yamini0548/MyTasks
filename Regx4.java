import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regx4
{
public static void main(String args[])
{
Pattern compile=Pattern.compile("[A-Za-z]*[.][a-z]{1}@[a-z]{5}[.][a-z]{3}");
Matcher matcher=compile.matcher("Yamini.g@gmail.com");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}
