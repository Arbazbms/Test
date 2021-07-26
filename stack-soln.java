import java.util.*;
import java.util.regex.*;
public class HelloWorld{

     public static void main(String []args){
String initial = "com.fmr.income::SimpleKey:[eeeeeehhjh6766776,123-31-4321]";
String processed = initial.replaceAll("\\d{3}\\-\\d{2}(?=\\-\\d{4})","XXX-XX");
System.out.println(initial);
System.out.println(processed);
     }
}
//com.fmr.income::SimpleKey:[eeeeeehhjh6766776,123-31-4321]
// com.fmr.income::SimpleKey:[eeeeeehhjh6766776,XXX-XX-4321]
// https://stackoverflow.com/questions/57663989/mask-all-ssn-with-only-partial-mask-from-a-file-with-multiple-ssns