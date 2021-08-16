public class Functions {
  public static void main(final String[] args) {

    System.out.println(circleArea(8));
    System.out.println(sphereArea(4));
  }
   
  public static double circleArea(double radio){
    return Math.PI * Math.pow(radio,2);
  }

  public static double sphereArea(double radio) {
    return 4 * Math.PI * Math.pow(radio, 2);
  }
}
