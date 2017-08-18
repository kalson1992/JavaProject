package com.csot.lijiaxiang;

class Fu
{
         int num =4;
         Fu()
         {
                   //obiect();
                   show();//0
                   //int num =4;
                   System.out.println("1-FU"+num);//4
         }
         void show()
         {
                   System.out.println("fu.show");
         }
         
         void show1()
         {
                   System.out.println("fu.show"+num);
         }
         
}

class Zi extends Fu
{

         int num =5;
         Zi()
         {//super();
         //show();
                   System.out.println("2-Zi"+num);
                   
         }
                   
         void show()
         {
                   System.out.println("Zi.show"+num);
                   show1();
         }
}

public class testy
{
         public static void main(String[] args)
{
         Fu f=new Zi();//此步骤可以看出
         Zi z=new Zi();
         System.out.println(f.num);
         System.out.println(z.num);
         f.show();
         z.show();

}

}

