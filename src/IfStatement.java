public class IfStatement{
  public static void main(String[] args) {
    boolean isBluetoothEnabled = true;
    int fileSended = 3;

    if (isBluetoothEnabled){
      // Send File
      fileSended++;
      System.out.println("File Sended!");
    }else{
      System.out.println("Please turn on the Bluetooth!")
    }
  }
}
