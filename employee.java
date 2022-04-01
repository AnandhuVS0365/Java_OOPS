/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author sjcet
 */
public class employee {
    int empid;
    String empname;
    int salary;
    float totalsalary;
     employee(int a,String b,int c) {
         empid=a;
         empname=b;
         salary=c;
    }
     
     public void salary()
     {
         totalsalary=salary+(salary*20)/100;
         System.out.println("id :"+empid);
         System.out.println("name : "+empname);
         System.out.println("total salary : "+totalsalary);
     }
     
     public static void main(String []arg)
     {
         employee s1=new employee(123,"anandhu",85600);
         employee s2=new employee(124,"tomin",64600);
         s1.salary();
         s2.salary();
         
     }
             
}
    

