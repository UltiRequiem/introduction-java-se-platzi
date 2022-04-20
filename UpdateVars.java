class UpdateVars {
  public static void main(final String[] args) {

    final String employeeName = "Zero";
    int salary = 900;
    final String currency = "$";

    System.out.printf("The initial salary of %s is %s%d.\n", employeeName, currency, salary);

    // Zero stars working hard...
    System.out.printf("%s has earned a promotion!\n", employeeName);

    salary += 1100;

    System.out.printf("Now %s wins %s%d.\n", employeeName, currency, salary);
  }
}
