public class HiFuncs{
  public static void main(String[] args){
    System.out.println(sayHi("Zero"));

  }

  public static String sayHi(String name) {
    return String.format("Hello %s!",name);
  }
}
