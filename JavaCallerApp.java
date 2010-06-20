class JavaCallerApp {
    public static void main(String[] args) {
      JrubyAdderImpl jrubyImpl = new JrubyAdderImpl();
      System.out.println("Adding 3+5=" + jrubyImpl.add(3,5)); // Display the string.
    }
}
