public class IfStatement {
  public static void main(final String[] args) {
    final boolean isBluetoothEnabled = true;
    int fileSended = 3;

    if (isBluetoothEnabled) {
      fileSended++;
      System.out.println("File Sended!");
    } else {
      System.out.println("Please turn on the Bluetooth!");
    }

    System.out.printf("Total sended files: %d", fileSended);
  }
}
