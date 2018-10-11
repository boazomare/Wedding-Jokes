// a simplejava code that will check that only invited guests are allowed into the ceremony.
import java.util.*;
import javax.swing.*;
import static javax.swing.JOptionPane.YES_NO_OPTION;
class Abutwalib{
public static void boaz(){
	Scanner in= new Scanner(System.in);
String username="QUAIBIKI13";
String userpassword="MySqL13Q";
System.out.println("ENTER YOUR USERNAME");
String use=in.next();
System.out.println("ENTER THE CARD NUMBER");
String pass= in.next();
if(use.equals(username)&&pass.equals(userpassword)){
JOptionPane.showMessageDialog(null,"WELCOME TO THE WEDDING OF MYSQL AND ORACLE");
System.out.println("PLEASE CHOOSE AN OPTION TO PROCEED TO THE CEREMONY");
System.out.println("1.PRESENT GIFT AND LEAVE \n 2.STAY UNTIL GIFTS ARE RECEIVED\n 3.EXIT UNTIL THE BRIDE ARRIVES\n 4.LEAVE UNEXPLAINED");

int n=0;
switch(n){
case 1:
System.out.println("KINDLY SPECIFY THE KIND OF GIFT YOU HAVE.");
int k=0;
System.out.println("1.CASH \n 2.HARD GIFT i.e Cakes");
switch(k){
case 1:
System.out.println("PLEASE DEPOSIT THE FUNDS TO THE FOLLOWING.\n MOBILE CASH NUMBER=+254713957302. OR \n PAYBAL =98765456736");
JOptionPane.showMessageDialog(null,"THANKS YOUR GIFT WAS RECEIVED SUCCESSFULLY");
break;
case 2:
System.out.println("PLEASE CALL +254795766211 TO HAND OVER YOUR GIFT");
JOptionPane.showMessageDialog(null,"WE ARE GRATEFUL THAT YOU SPARED YOUR TIME FOR US");
break;
default:
System.out.println("SPECIFY THE TYPE OF GIFT PLEASE");
}
break;
case 2:
System.out.println("WELCOME AND PLEASE DO STAY WITH US");
break;
case 3:
System.out.println("WE ARE HERE TO SERVE YOU");
break;
case 4:
System.out.println("THANKS FOR COMING SIR /MADAM");
break;
default:
System.out.println("PLEASE CHOOSE AN OPTION FROM THOSE PROVIDED ABOVE");
}
}else{
int conftext=JOptionPane.showConfirmDialog(null,"THIS EVENT WAS FOR THOSE INVITED ONLY \n YOU ARE GOING TO EXIT","CONFIRM ACTION",YES_NO_OPTION);
}
}
public static void main(String[] args){
Abutwalib bu= new Abutwalib();
bu.boaz();
}
}
