package hello;

public class helloworld {
  public static void main(String[] args) {
    String myline;
    BufferedReader my = new BufferedReader(new FileReader("//src//helloworld.txt"));
    while((myline = my.readLine()) != null)
    {
      System.out.println(myline);
    }
  }
}
