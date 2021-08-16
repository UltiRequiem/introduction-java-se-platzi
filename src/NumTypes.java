public class NumTypes {
  public static void main(final String[] args) {
    System.out.println("bits tipo byte:" + Byte.SIZE);
    System.out.println("bytes tipo byte:" + Byte.BYTES);
    System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);
    System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);

    System.out.println("bits tipo short:" + Short.SIZE);
    System.out.println("bytes tipo short:" + Short.BYTES);
    System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);
    System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);

    System.out.println("bits tipo int:" + Integer.SIZE);
    System.out.println("bytes tipo int:" + Integer.BYTES);
    System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
    System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);

    System.out.println("bits tipo long:" + Long.SIZE);
    System.out.println("bytes tipo long:" + Long.BYTES);
    System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
    System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);

    final byte byteVar = 15;
    final short shortVar = 100;
    final int intVar = 500;
    final long longVar = 100000000000000L;
    final var numb = 100;
  }
}
