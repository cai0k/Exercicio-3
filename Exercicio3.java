class Exercicio3{
public static void main(String[] args){
      
      int i = 100;
      short s = 67;
      float f = 5.55f;
      long l = 100000l;
      byte b = 8;
      
      i = s;
      System.out.println(i);
      i = b;
      System.out.println(i);
      i = (int)l;
      System.out.println(i);
      i = (int)f;
      System.out.println(i);


      System.out.println("************************");
      
      f = l;
      System.out.println(f);
      f = i;
      System.out.println(f);
      f = s;
      System.out.println(f);
      f = b;
      System.out.println(s);


      System.out.println("************************");
      
      
      s = b;
      System.out.println(s); 
      s = (short)i; 
      System.out.println(s);
      s = (short)l; 
      System.out.println(s);
      s = (short)f; 
      System.out.println(s);


      
      System.out.println("************************");
      
      
      
      l = i;
      System.out.println(l);
      l = (long)f;
      System.out.println(l);
      l = s;
      System.out.println(l);
      l = b;
      System.out.println(l);


      System.out.println("************************");


      b = (byte)f;
      System.out.println(b);
      b = (byte)l;
      System.out.println(b);
      b = (byte)s;
      System.out.println(b);
      b = (byte)i;
      System.out.println(b);
      
      
    }

}