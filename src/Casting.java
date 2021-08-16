public class Casting {
  public static void main(final String[] args) {

    final double monthlyDogs = 30.0 / 12.0;
    System.out.println(monthlyDogs);

    // Estimation
    final int estimatedMonthlyDogs = (int) monthlyDogs;
    System.out.println(estimatedMonthlyDogs);
  }
}
