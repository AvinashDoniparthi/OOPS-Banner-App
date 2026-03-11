public class OopsBannerAppUC5{
public static void main(String Args[]){
String[] lines = {
String.join(" ", "   ***   ", "   ***   ", "******   ", "   ***** "),
String.join(" ", " **   ** ", " **   ** ", "**    ** ", " **      "),
String.join(" ", "**     **", "**     **", "**     **", "**       "),
String.join(" ", "**     **", "**     **", "**    ** ", " **      "),
String.join(" ", "**     **", "**     **", "******   ", "   ***   "),
String.join(" ", "**     **", "**     **", "**       ", "      ** "),
String.join(" ", "**     **", "**     **", "**       ", "       **"),
String.join(" ", " **   ** ", " **   ** ", "**       ", "      ** "),
String.join(" ", "   ***   ", "   ***   ", "**       ", " *****   ")
};
for (String line : lines){
System.out.println(line);
}
}
}