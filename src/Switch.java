public class Switch {
  public static void main(final String[] args) {
    final String colorModeSelected = "Dark";

    switch (colorModeSelected) {
      case "Light":
        System.out.println("You selected the Light mode!");
        break;
      case "Dark":
        System.out.println("You selected the Dark mode!");
        break;
      default:
        break;
    }

  }
}
