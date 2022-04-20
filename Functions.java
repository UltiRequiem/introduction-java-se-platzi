public class Functions {
  public static void main(final String[] args) {

    System.out.println(circleArea(8));
    System.out.println(sphereArea(4));
  }

  public static double circleArea(final double radio) {
    return Math.PI * Math.pow(radio, 2);
  }

  public static double sphereVolume(final double radio) {
    return (4 / 3) * Math.PI * Math.pow(radio, 3);
  }

  public static double sphereArea(final double radio) {
    return 4 * Math.PI * Math.pow(radio, 2);
  }
}
