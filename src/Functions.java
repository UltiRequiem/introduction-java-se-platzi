public class Functions {
  public static void main(final String[] args) {

    System.out.println(circleArea(8));
  }
   
  public static double circleArea(double radio){
    return Math.PI * Math.pow(radio,2);
  }
}
