public class ConvertDollars {
  public static void main(final String[] args) {
    System.out.println(convertToDollars(200, "pesos"));
    System.out.println(convertToDollars(4, "soles"));
  }

  public static double convertToDollars(double quantity, final String currency) {
    switch (currency) {
      case "pesos":
        quantity = quantity * 0.052;
        break;
      case "soles":
        quantity = quantity * 4.08;
        break;
    }
    return quantity;
  }

}
