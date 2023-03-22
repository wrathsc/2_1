import org.hamcrest.core.IsInstanceOf;

class Main {
  public static void main(String[] args) {
    String s = "Hello world!";
    char c[]=s.toCharArray();
    for( int i=0; i<s.length(); i++ ){
      System.out.println(c[i]);
    }
  
  }
}