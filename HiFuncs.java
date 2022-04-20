public class HiFuncs {
  public static void main(final String[] args) {
    System.out.println(sayHi("Zero"));
  }

  public static String sayHi(final String name) {
    return String.format("Hello %s!", name);
  }
}
