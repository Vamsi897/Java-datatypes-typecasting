public class Main
{
  public static void main(String[] args)
  {
  String mycls="10th";
  char mysection='b';
  String mynameis  = "vamsigopal";
  boolean therankis = true;
  boolean notrankis = false;
  char var1 = 55;
  char Myrank = var1;
  System.out.println("My Class= " +mycls);
  System.out.println("my Section = " +mysection);
  System.out.println("my Name is = " +mynameis); 
  System.out.println("my rank = " +therankis);
  System.out.println("my rank = " +Myrank);
  //widening type casting//
  /*converting smaller size number into larger size number*/
  int numb = 9;
  double numb1 = numb;// automatic choose data type//
  System.out.println("widening casting is =" +numb);
  System.out.println("widening casting of numb2 =" +numb1);
  //narrowing type casting//
  /*converting larger size number into smaller size type*/
  double numb2 = 10.98D;
  int numb3 = (int)numb2;//manually involving datatype(int)//
  System.out.println("Narrowing casting is =" +numb2);
  System.out.println("narrowing casting is =" +numb3);
  }
}
