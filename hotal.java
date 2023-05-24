import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.midi.Soundbank;

public class hotal {
    
    public static void main(String[] args) {
        int i=1;
        int j=2 ,k=3,o=4,m=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("                                                    A TO Z HOTEL          ");
        System.out.println("                         ***************************************************************");
        System.out.println("Seleted the table number 1 to 5 :");
        int a=sc.nextInt();
        if(a==i){
        System.out.println("You table Number="+a+" Booked");

        System.out.println("Total chair Number is= 4");
        System.out.println("Enter your total Person number:");
        int b=sc.nextInt();
        System.out.println("Seleted the Opetion :");
        

        System.out.println("1=FAST FOOD MENU");
        System.out.println("2=LUNCH MENU");
        int d=1;
        int t=2;
        int q=sc.nextInt();
        if(q==d){
            // FOOD MENU
            int as=1;
            int sa=2;
            int xx=3;
            int vv=4;
            int bb=5;
            System.out.println("Welcom to the FAST FOOD MENU");
            System.out.println("1.PIZZAS                  PRICE=100 ");
            System.out.println("2.DOUBLE CHEESES PIZZAS   PRICE=200");
            System.out.println("3.NON VEG BURGERS         PRICE=300");
            System.out.println("4.VEG BURGERS             PRICE=100 ");
            System.out.println("5.DRINKS                  PRICE=80");
            System.out.println("Choose the FAST FOOD MENU Options:");
            int asd=sc.nextInt();
            if(asd==as){
                // PIZZAS 
                int jj=100*b;/* total */
                int ss=jj/100;/* div */
                int kk=ss*25;/* food d */
                int ll=ss*5;/*s.text & gst*/
                int zzz=(jj-kk)+ll+ll;/* total */
               System.out.println(" ");

               System.out.println(" ");
               System.out.println("               BILL ");
               System.out.println("------------------------------------------ ");
               System.out.println("Table number:                "+a);
               System.out.println("Item Name:                   PIZZAS");
               System.out.println("Total person                 "+b   );
               System.out.println("Total Amount of item         "+jj);
               System.out.println("FOOD discount: 25%           " +kk );
               System.out.println("G.S.T        : 5%            "+ll );
               System.out.println("Service text : 5%            "+ll);
             System.out.println("------------------------------------------");

            System.out.println("You total Amount is:          "+zzz);
                System.out.println( "**************************************************THANKYOU****************************************");
    
                }else if(asd==sa){
                    // DOUBLE CHEESES PIZZAS
                    int jj=200*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("            BILL ");
               System.out.println("--------------------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   DOUBLE CHEESES PIZZAS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("---------------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "*****************************************************THANKYOU****************************************");
    
                }else if(asd==xx){
                    // NON VEG BURGERS
                    int jj=300*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("            BILL");
               System.out.println("-------------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   NON VEG BURGERS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("-------------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "********************************************************THANKYOU****************************************");
    
                }else if(asd==vv){
                    // VEG BURGERS
                    int jj=100*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("              BILL ");
               System.out.println("----------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   VEG BURGERS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("-------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
    
                }else if(asd==bb){
                    // DRINKS 
                    int jj=80*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("               BILL ");
               System.out.println("--------------------------------------------");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   DRINKS ");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("----------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
    
                }else {
                  System.out.println("ENTER THE WORNG KEY ");
                }

        }else if (q==t){
            // LUNCH MENU
            System.out.println("                                             Welcom to the LUNCH MENU");
            int as=1;
            int sa=2;
            int xx=3;
            int vv=4;
            int bb=5;
            System.out.println("1.SOUTH INDIAN THALI  PRICE=1000  ");
            System.out.println("2.NORTH INDIAN THALI  PRICE=2000  ");
            System.out.println("3.HARYANA THALI       PRICE=1500");
            System.out.println("4.GUJARATI THALI      PRICE=1200");
            System.out.println("5.INDIAN SWEETS       PRICE=1100");
            System.out.println("Choose the lunch Options:");
            int asd=sc.nextInt();
            // SOUTH INDIAN THALI
            if(asd==as){
              int jj=1000*b;/* total */
              int ss=jj/100;/* div */
              int kk=ss*0;/* food d */
              int ll=ss*5;/*s.text & gst*/
              int zzz=(jj-kk)+ll+ll;/* total */
             System.out.println(" ");

             System.out.println(" ");
             System.out.println("              BILL ");
             System.out.println("--------------------------------------------------- ");

             System.out.println("Table number:                "+a);
             System.out.println("Item Name:                   SOUTH INDIAN THALI");
             System.out.println("Total person                 "+b   );
             System.out.println("Total Amount of item         "+jj);
             System.out.println("FOOD discount: 25%           " +kk );
             System.out.println("G.S.T        : 5%            "+ll );
             System.out.println("Service text : 5%            "+ll);
             System.out.println("----------------------------------------------------");

          System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");
            }else if(asd==sa){
                // NORTH INDIAN THALI
                int jj=2000*b;/* total */
                int ss=jj/100;/* div */
                int kk=ss*25;/* food d */
                int ll=ss*5;/*s.text & gst*/
                int zzz=(jj-kk)+ll+ll;/* total */
               System.out.println(" ");

               System.out.println(" ");
               System.out.println("              BILL ");
               System.out.println("--------------------------------------------------- ");

               System.out.println("Table number:                "+a);
               System.out.println("Item Name:                   NORTH INDIAN THALI");
               System.out.println("Total person                 "+b   );
               System.out.println("Total Amount of item         "+jj);
               System.out.println("FOOD discount: 25%           " +kk );
               System.out.println("G.S.T        : 5%            "+ll );
               System.out.println("Service text : 5%            "+ll);
             System.out.println("------------------------------------------------------");

            System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");

            }
            else if(asd==xx){
                // HARYANA THALI
                int jj=1500*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("             BILL ");
               System.out.println("---------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   HARYANA THALI");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("--------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");
            }else if(asd==vv){
                // GUJARATI THALI
                int jj=1200*b;/* total */
                int ss=jj/100;/* div */
                int kk=ss*25;/* food d */
                int ll=ss*5;/*s.text & gst*/
                int zzz=(jj-kk)+ll+ll;/* total */
               System.out.println(" ");

               System.out.println(" ");
               System.out.println("              BILL ");
               System.out.println("-----------------------------------------------");
               System.out.println("Table number:                "+a);
               System.out.println("Item Name:                   GUJARATI THALI");
               System.out.println("Total person                 "+b   );
               System.out.println("Total Amount of item         "+jj);
               System.out.println("FOOD discount: 25%           " +kk );
               System.out.println("G.S.T        : 5%            "+ll );
               System.out.println("Service text : 5%            "+ll);
             System.out.println("--------------------------------------------------");

            System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");
            }else if(asd==bb){
                // INDIAN SWEETS
                int jj=1100*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("               BILL ");
               System.out.println("------------------------------------------------ ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   INDIAN SWEETS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("---------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
            System.out.println("");

            System.out.println( "******************************************************THANKYOU****************************************");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            }else {
               System.out.println("ENTER THE WORNG KEY ");
             }
            
        }else {
         System.out.println("ENTER THE WORNG KEY ");
       }
        
           }else if(a==j){
        System.out.println("You table Number= "+a+" Booked");

        System.out.println("Total chair Number is= 2");
        System.out.println("Enter your total Person number:");
        int b=sc.nextInt();
        System.out.println("Seleted the Opetion :");
        

        System.out.println("1=FAST FOOD MENU");
        System.out.println("2=LUNCH MENU");
        int d=1;
        int t=2;
        int q=sc.nextInt();
        if(q==d){
            // FOOD MENU
            int as=1;
            int sa=2;
            int xx=3;
            int vv=4;
            int bb=5;
            System.out.println("Welcom to the FAST FOOD MENU");
            System.out.println("1.PIZZAS                  PRICE=100 ");
            System.out.println("2.DOUBLE CHEESES PIZZAS   PRICE=200");
            System.out.println("3.NON VEG BURGERS         PRICE=300");
            System.out.println("4.VEG BURGERS             PRICE=100 ");
            System.out.println("5.DRINKS                  PRICE=80");
            System.out.println("Choose the FAST FOOD MENU Options:");
            int asd=sc.nextInt();
            if(asd==as){
                // PIZZAS 
                int jj=100*b;/* total */
                int ss=jj/100;/* div */
                int kk=ss*25;/* food d */
                int ll=ss*5;/*s.text & gst*/
                int zzz=(jj-kk)+ll+ll;/* total */
               System.out.println(" ");

               System.out.println(" ");
               System.out.println("               BILL ");
               System.out.println("------------------------------------------ ");
               System.out.println("Table number:                "+a);
               System.out.println("Item Name:                   PIZZAS");
               System.out.println("Total person                 "+b   );
               System.out.println("Total Amount of item         "+jj);
               System.out.println("FOOD discount: 25%           " +kk );
               System.out.println("G.S.T        : 5%            "+ll );
               System.out.println("Service text : 5%            "+ll);
             System.out.println("------------------------------------------");

            System.out.println("You total Amount is:          "+zzz);
                System.out.println( "**************************************************THANKYOU****************************************");
    
                }else if(asd==sa){
                    // DOUBLE CHEESES PIZZAS
                    int jj=200*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("            BILL ");
               System.out.println("--------------------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   DOUBLE CHEESES PIZZAS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("---------------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "*****************************************************THANKYOU****************************************");
    
                }else if(asd==xx){
                    // NON VEG BURGERS
                    int jj=300*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("            BILL");
               System.out.println("-------------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   NON VEG BURGERS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("-------------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "********************************************************THANKYOU****************************************");
    
                }else if(asd==vv){
                    // VEG BURGERS
                    int jj=100*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("              BILL ");
               System.out.println("----------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   VEG BURGERS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("-------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
    
                }else if(asd==bb){
                    // DRINKS 
                    int jj=80*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("               BILL ");
               System.out.println("--------------------------------------------");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   DRINKS ");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("----------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
    
                }else {
                  System.out.println("ENTER THE WORNG KEY ");
                }

        }else if (q==t){
            // LUNCH MENU
            System.out.println("                                             Welcom to the LUNCH MENU");
            int as=1;
            int sa=2;
            int xx=3;
            int vv=4;
            int bb=5;
            System.out.println("1.SOUTH INDIAN THALI  PRICE=1000  ");
            System.out.println("2.NORTH INDIAN THALI  PRICE=2000  ");
            System.out.println("3.HARYANA THALI       PRICE=1500");
            System.out.println("4.GUJARATI THALI      PRICE=1200");
            System.out.println("5.INDIAN SWEETS       PRICE=1100");
            System.out.println("Choose the lunch Options:");
            int asd=sc.nextInt();
            // SOUTH INDIAN THALI
            if(asd==as){
              int jj=1000*b;/* total */
              int ss=jj/100;/* div */
              int kk=ss*0;/* food d */
              int ll=ss*5;/*s.text & gst*/
              int zzz=(jj-kk)+ll+ll;/* total */
             System.out.println(" ");

             System.out.println(" ");
             System.out.println("              BILL ");
             System.out.println("--------------------------------------------------- ");

             System.out.println("Table number:                "+a);
             System.out.println("Item Name:                   SOUTH INDIAN THALI");
             System.out.println("Total person                 "+b   );
             System.out.println("Total Amount of item         "+jj);
             System.out.println("FOOD discount: 25%           " +kk );
             System.out.println("G.S.T        : 5%            "+ll );
             System.out.println("Service text : 5%            "+ll);
             System.out.println("----------------------------------------------------");

          System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");
            }else if(asd==sa){
                // NORTH INDIAN THALI
                int jj=2000*b;/* total */
                int ss=jj/100;/* div */
                int kk=ss*25;/* food d */
                int ll=ss*5;/*s.text & gst*/
                int zzz=(jj-kk)+ll+ll;/* total */
               System.out.println(" ");

               System.out.println(" ");
               System.out.println("              BILL ");
               System.out.println("--------------------------------------------------- ");

               System.out.println("Table number:                "+a);
               System.out.println("Item Name:                   NORTH INDIAN THALI");
               System.out.println("Total person                 "+b   );
               System.out.println("Total Amount of item         "+jj);
               System.out.println("FOOD discount: 25%           " +kk );
               System.out.println("G.S.T        : 5%            "+ll );
               System.out.println("Service text : 5%            "+ll);
             System.out.println("------------------------------------------------------");

            System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");

            }
            else if(asd==xx){
                // HARYANA THALI
                int jj=1500*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("             BILL ");
               System.out.println("---------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   HARYANA THALI");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("--------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");
            }else if(asd==vv){
                // GUJARATI THALI
                int jj=1200*b;/* total */
                int ss=jj/100;/* div */
                int kk=ss*25;/* food d */
                int ll=ss*5;/*s.text & gst*/
                int zzz=(jj-kk)+ll+ll;/* total */
               System.out.println(" ");

               System.out.println(" ");
               System.out.println("              BILL ");
               System.out.println("-----------------------------------------------");
               System.out.println("Table number:                "+a);
               System.out.println("Item Name:                   GUJARATI THALI");
               System.out.println("Total person                 "+b   );
               System.out.println("Total Amount of item         "+jj);
               System.out.println("FOOD discount: 25%           " +kk );
               System.out.println("G.S.T        : 5%            "+ll );
               System.out.println("Service text : 5%            "+ll);
             System.out.println("--------------------------------------------------");

            System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");
            }else if(asd==bb){
                // INDIAN SWEETS
                int jj=1100*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("               BILL ");
               System.out.println("------------------------------------------------ ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   INDIAN SWEETS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("---------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
            System.out.println("");

            System.out.println( "******************************************************THANKYOU****************************************");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            }else {
               System.out.println("ENTER THE WORNG KEY ");
             }
            
        }else {
         System.out.println("ENTER THE WORNG KEY ");
       }
        
           }else if(a==k){
        System.out.println("You table Number= "+a+" Booked");

        System.out.println("Total chair Number is= 5");
        System.out.println("Enter your total Person number:");
        int b=sc.nextInt();
        System.out.println("Seleted the Opetion :");
        

        System.out.println("1=FAST FOOD MENU");
        System.out.println("2=LUNCH MENU");
        int d=1;
        int t=2;
        int q=sc.nextInt();
        if(q==d){
            // FOOD MENU
            int as=1;
            int sa=2;
            int xx=3;
            int vv=4;
            int bb=5;
            System.out.println("Welcom to the FAST FOOD MENU");
            System.out.println("1.PIZZAS                  PRICE=100 ");
            System.out.println("2.DOUBLE CHEESES PIZZAS   PRICE=200");
            System.out.println("3.NON VEG BURGERS         PRICE=300");
            System.out.println("4.VEG BURGERS             PRICE=100 ");
            System.out.println("5.DRINKS                  PRICE=80");
            System.out.println("Choose the FAST FOOD MENU Options:");
            int asd=sc.nextInt();
            if(asd==as){
                // PIZZAS 
                int jj=100*b;/* total */
                int ss=jj/100;/* div */
                int kk=ss*25;/* food d */
                int ll=ss*5;/*s.text & gst*/
                int zzz=(jj-kk)+ll+ll;/* total */
               System.out.println(" ");

               System.out.println(" ");
               System.out.println("               BILL ");
               System.out.println("------------------------------------------ ");
               System.out.println("Table number:                "+a);
               System.out.println("Item Name:                   PIZZAS");
               System.out.println("Total person                 "+b   );
               System.out.println("Total Amount of item         "+jj);
               System.out.println("FOOD discount: 25%           " +kk );
               System.out.println("G.S.T        : 5%            "+ll );
               System.out.println("Service text : 5%            "+ll);
             System.out.println("------------------------------------------");

            System.out.println("You total Amount is:          "+zzz);
                System.out.println( "**************************************************THANKYOU****************************************");
    
                }else if(asd==sa){
                    // DOUBLE CHEESES PIZZAS
                    int jj=200*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("            BILL ");
               System.out.println("--------------------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   DOUBLE CHEESES PIZZAS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("---------------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "*****************************************************THANKYOU****************************************");
    
                }else if(asd==xx){
                    // NON VEG BURGERS
                    int jj=300*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("            BILL");
               System.out.println("-------------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   NON VEG BURGERS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("-------------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "********************************************************THANKYOU****************************************");
    
                }else if(asd==vv){
                    // VEG BURGERS
                    int jj=100*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("              BILL ");
               System.out.println("----------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   VEG BURGERS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("-------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
    
                }else if(asd==bb){
                    // DRINKS 
                    int jj=80*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("               BILL ");
               System.out.println("--------------------------------------------");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   DRINKS ");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("----------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
    
                }else {
                  System.out.println("ENTER THE WORNG KEY ");
                }

        }else if (q==t){
            // LUNCH MENU
            System.out.println("                                             Welcom to the LUNCH MENU");
            int as=1;
            int sa=2;
            int xx=3;
            int vv=4;
            int bb=5;
            System.out.println("1.SOUTH INDIAN THALI  PRICE=1000  ");
            System.out.println("2.NORTH INDIAN THALI  PRICE=2000  ");
            System.out.println("3.HARYANA THALI       PRICE=1500");
            System.out.println("4.GUJARATI THALI      PRICE=1200");
            System.out.println("5.INDIAN SWEETS       PRICE=1100");
            System.out.println("Choose the lunch Options:");
            int asd=sc.nextInt();
            // SOUTH INDIAN THALI
            if(asd==as){
              int jj=1000*b;/* total */
              int ss=jj/100;/* div */
              int kk=ss*0;/* food d */
              int ll=ss*5;/*s.text & gst*/
              int zzz=(jj-kk)+ll+ll;/* total */
             System.out.println(" ");

             System.out.println(" ");
             System.out.println("              BILL ");
             System.out.println("--------------------------------------------------- ");

             System.out.println("Table number:                "+a);
             System.out.println("Item Name:                   SOUTH INDIAN THALI");
             System.out.println("Total person                 "+b   );
             System.out.println("Total Amount of item         "+jj);
             System.out.println("FOOD discount: 25%           " +kk );
             System.out.println("G.S.T        : 5%            "+ll );
             System.out.println("Service text : 5%            "+ll);
             System.out.println("----------------------------------------------------");

          System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");
            }else if(asd==sa){
                // NORTH INDIAN THALI
                int jj=2000*b;/* total */
                int ss=jj/100;/* div */
                int kk=ss*25;/* food d */
                int ll=ss*5;/*s.text & gst*/
                int zzz=(jj-kk)+ll+ll;/* total */
               System.out.println(" ");

               System.out.println(" ");
               System.out.println("              BILL ");
               System.out.println("--------------------------------------------------- ");

               System.out.println("Table number:                "+a);
               System.out.println("Item Name:                   NORTH INDIAN THALI");
               System.out.println("Total person                 "+b   );
               System.out.println("Total Amount of item         "+jj);
               System.out.println("FOOD discount: 25%           " +kk );
               System.out.println("G.S.T        : 5%            "+ll );
               System.out.println("Service text : 5%            "+ll);
             System.out.println("------------------------------------------------------");

            System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");

            }
            else if(asd==xx){
                // HARYANA THALI
                int jj=1500*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("             BILL ");
               System.out.println("---------------------------------------------- ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   HARYANA THALI");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("--------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");
            }else if(asd==vv){
                // GUJARATI THALI
                int jj=1200*b;/* total */
                int ss=jj/100;/* div */
                int kk=ss*25;/* food d */
                int ll=ss*5;/*s.text & gst*/
                int zzz=(jj-kk)+ll+ll;/* total */
               System.out.println(" ");

               System.out.println(" ");
               System.out.println("              BILL ");
               System.out.println("-----------------------------------------------");
               System.out.println("Table number:                "+a);
               System.out.println("Item Name:                   GUJARATI THALI");
               System.out.println("Total person                 "+b   );
               System.out.println("Total Amount of item         "+jj);
               System.out.println("FOOD discount: 25%           " +kk );
               System.out.println("G.S.T        : 5%            "+ll );
               System.out.println("Service text : 5%            "+ll);
             System.out.println("--------------------------------------------------");

            System.out.println("You total Amount is:         "+zzz);
            System.out.println( "******************************************************THANKYOU****************************************");
            }else if(asd==bb){
                // INDIAN SWEETS
                int jj=1100*b;/* total */
                 int ss=jj/100;/* div */
                 int kk=ss*25;/* food d */
                 int ll=ss*5;/*s.text & gst*/
                 int zzz=(jj-kk)+ll+ll;/* total */
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("               BILL ");
               System.out.println("------------------------------------------------ ");

                System.out.println("Table number:                "+a);
                System.out.println("Item Name:                   INDIAN SWEETS");
                System.out.println("Total person                 "+b   );
                System.out.println("Total Amount of item         "+jj);
                System.out.println("FOOD discount: 25%           " +kk );
                System.out.println("G.S.T        : 5%            "+ll );
                System.out.println("Service text : 5%            "+ll);
             System.out.println("---------------------------------------------------");

             System.out.println("You total Amount is:         "+zzz);
            System.out.println("");

            System.out.println( "******************************************************THANKYOU****************************************");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            }else {
               System.out.println("ENTER THE WORNG KEY ");
             }
            
        }else {
         System.out.println("ENTER THE WORNG KEY ");
       }
        

           }else if(a==o){
        System.out.println("You table Number= "+a+" Booked");

            System.out.println("Total chair Number is= 8");
            System.out.println("Enter your total Person number:");
            int b=sc.nextInt();
            System.out.println("Seleted the Opetion :");
            
    
            System.out.println("1=FAST FOOD MENU");
            System.out.println("2=LUNCH MENU");
            int d=1;
            int t=2;
            int q=sc.nextInt();
            if(q==d){
                // FOOD MENU
                int as=1;
                int sa=2;
                int xx=3;
                int vv=4;
                int bb=5;
                System.out.println("Welcom to the FAST FOOD MENU");
                System.out.println("1.PIZZAS                  PRICE=100 ");
                System.out.println("2.DOUBLE CHEESES PIZZAS   PRICE=200");
                System.out.println("3.NON VEG BURGERS         PRICE=300");
                System.out.println("4.VEG BURGERS             PRICE=100 ");
                System.out.println("5.DRINKS                  PRICE=80");
                System.out.println("Choose the FAST FOOD MENU Options:");
                int asd=sc.nextInt();
                if(asd==as){
                    // PIZZAS 
                    int jj=100*b;/* total */
                    int ss=jj/100;/* div */
                    int kk=ss*25;/* food d */
                    int ll=ss*5;/*s.text & gst*/
                    int zzz=(jj-kk)+ll+ll;/* total */
                   System.out.println(" ");
    
                   System.out.println(" ");
                   System.out.println("               BILL ");
                   System.out.println("------------------------------------------ ");
                   System.out.println("Table number:                "+a);
                   System.out.println("Item Name:                   PIZZAS");
                   System.out.println("Total person                 "+b   );
                   System.out.println("Total Amount of item         "+jj);
                   System.out.println("FOOD discount: 25%           " +kk );
                   System.out.println("G.S.T        : 5%            "+ll );
                   System.out.println("Service text : 5%            "+ll);
                 System.out.println("------------------------------------------");
    
                System.out.println("You total Amount is:          "+zzz);
                    System.out.println( "**************************************************THANKYOU****************************************");
        
                    }else if(asd==sa){
                        // DOUBLE CHEESES PIZZAS
                        int jj=200*b;/* total */
                     int ss=jj/100;/* div */
                     int kk=ss*25;/* food d */
                     int ll=ss*5;/*s.text & gst*/
                     int zzz=(jj-kk)+ll+ll;/* total */
                    System.out.println(" ");
    
                    System.out.println(" ");
                    System.out.println("            BILL ");
                   System.out.println("--------------------------------------------------------- ");
    
                    System.out.println("Table number:                "+a);
                    System.out.println("Item Name:                   DOUBLE CHEESES PIZZAS");
                    System.out.println("Total person                 "+b   );
                    System.out.println("Total Amount of item         "+jj);
                    System.out.println("FOOD discount: 25%           " +kk );
                    System.out.println("G.S.T        : 5%            "+ll );
                    System.out.println("Service text : 5%            "+ll);
                 System.out.println("---------------------------------------------------------");
    
                 System.out.println("You total Amount is:         "+zzz);
                    System.out.println( "*****************************************************THANKYOU****************************************");
        
                    }else if(asd==xx){
                        // NON VEG BURGERS
                        int jj=300*b;/* total */
                     int ss=jj/100;/* div */
                     int kk=ss*25;/* food d */
                     int ll=ss*5;/*s.text & gst*/
                     int zzz=(jj-kk)+ll+ll;/* total */
                    System.out.println(" ");
    
                    System.out.println(" ");
                    System.out.println("            BILL");
                   System.out.println("-------------------------------------------------- ");
    
                    System.out.println("Table number:                "+a);
                    System.out.println("Item Name:                   NON VEG BURGERS");
                    System.out.println("Total person                 "+b   );
                    System.out.println("Total Amount of item         "+jj);
                    System.out.println("FOOD discount: 25%           " +kk );
                    System.out.println("G.S.T        : 5%            "+ll );
                    System.out.println("Service text : 5%            "+ll);
                 System.out.println("-------------------------------------------------------");
    
                 System.out.println("You total Amount is:         "+zzz);
                    System.out.println( "********************************************************THANKYOU****************************************");
        
                    }else if(asd==vv){
                        // VEG BURGERS
                        int jj=100*b;/* total */
                     int ss=jj/100;/* div */
                     int kk=ss*25;/* food d */
                     int ll=ss*5;/*s.text & gst*/
                     int zzz=(jj-kk)+ll+ll;/* total */
                    System.out.println(" ");
    
                    System.out.println(" ");
                    System.out.println("              BILL ");
                   System.out.println("----------------------------------------------- ");
    
                    System.out.println("Table number:                "+a);
                    System.out.println("Item Name:                   VEG BURGERS");
                    System.out.println("Total person                 "+b   );
                    System.out.println("Total Amount of item         "+jj);
                    System.out.println("FOOD discount: 25%           " +kk );
                    System.out.println("G.S.T        : 5%            "+ll );
                    System.out.println("Service text : 5%            "+ll);
                 System.out.println("-------------------------------------------------");
    
                 System.out.println("You total Amount is:         "+zzz);
                    System.out.println( "******************************************************THANKYOU****************************************");
        
                    }else if(asd==bb){
                        // DRINKS 
                        int jj=80*b;/* total */
                     int ss=jj/100;/* div */
                     int kk=ss*25;/* food d */
                     int ll=ss*5;/*s.text & gst*/
                     int zzz=(jj-kk)+ll+ll;/* total */
                    System.out.println(" ");
    
                    System.out.println(" ");
                    System.out.println("               BILL ");
                   System.out.println("--------------------------------------------");
    
                    System.out.println("Table number:                "+a);
                    System.out.println("Item Name:                   DRINKS ");
                    System.out.println("Total person                 "+b   );
                    System.out.println("Total Amount of item         "+jj);
                    System.out.println("FOOD discount: 25%           " +kk );
                    System.out.println("G.S.T        : 5%            "+ll );
                    System.out.println("Service text : 5%            "+ll);
                 System.out.println("----------------------------------------------");
    
                 System.out.println("You total Amount is:         "+zzz);
                    System.out.println( "******************************************************THANKYOU****************************************");
        
                    }else {
                      System.out.println("ENTER THE WORNG KEY ");
                    }
    
            }else if (q==t){
                // LUNCH MENU
                System.out.println("                                             Welcom to the LUNCH MENU");
                int as=1;
                int sa=2;
                int xx=3;
                int vv=4;
                int bb=5;
                System.out.println("1.SOUTH INDIAN THALI  PRICE=1000  ");
                System.out.println("2.NORTH INDIAN THALI  PRICE=2000  ");
                System.out.println("3.HARYANA THALI       PRICE=1500");
                System.out.println("4.GUJARATI THALI      PRICE=1200");
                System.out.println("5.INDIAN SWEETS       PRICE=1100");
                System.out.println("Choose the lunch Options:");
                int asd=sc.nextInt();
                // SOUTH INDIAN THALI
                if(asd==as){
                  int jj=1000*b;/* total */
                  int ss=jj/100;/* div */
                  int kk=ss*0;/* food d */
                  int ll=ss*5;/*s.text & gst*/
                  int zzz=(jj-kk)+ll+ll;/* total */
                 System.out.println(" ");
    
                 System.out.println(" ");
                 System.out.println("              BILL ");
                 System.out.println("--------------------------------------------------- ");
    
                 System.out.println("Table number:                "+a);
                 System.out.println("Item Name:                   SOUTH INDIAN THALI");
                 System.out.println("Total person                 "+b   );
                 System.out.println("Total Amount of item         "+jj);
                 System.out.println("FOOD discount: 25%           " +kk );
                 System.out.println("G.S.T        : 5%            "+ll );
                 System.out.println("Service text : 5%            "+ll);
                 System.out.println("----------------------------------------------------");
    
              System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
                }else if(asd==sa){
                    // NORTH INDIAN THALI
                    int jj=2000*b;/* total */
                    int ss=jj/100;/* div */
                    int kk=ss*25;/* food d */
                    int ll=ss*5;/*s.text & gst*/
                    int zzz=(jj-kk)+ll+ll;/* total */
                   System.out.println(" ");
    
                   System.out.println(" ");
                   System.out.println("              BILL ");
                   System.out.println("--------------------------------------------------- ");
    
                   System.out.println("Table number:                "+a);
                   System.out.println("Item Name:                   NORTH INDIAN THALI");
                   System.out.println("Total person                 "+b   );
                   System.out.println("Total Amount of item         "+jj);
                   System.out.println("FOOD discount: 25%           " +kk );
                   System.out.println("G.S.T        : 5%            "+ll );
                   System.out.println("Service text : 5%            "+ll);
                 System.out.println("------------------------------------------------------");
    
                System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
    
                }
                else if(asd==xx){
                    // HARYANA THALI
                    int jj=1500*b;/* total */
                     int ss=jj/100;/* div */
                     int kk=ss*25;/* food d */
                     int ll=ss*5;/*s.text & gst*/
                     int zzz=(jj-kk)+ll+ll;/* total */
                    System.out.println(" ");
    
                    System.out.println(" ");
                    System.out.println("             BILL ");
                   System.out.println("---------------------------------------------- ");
    
                    System.out.println("Table number:                "+a);
                    System.out.println("Item Name:                   HARYANA THALI");
                    System.out.println("Total person                 "+b   );
                    System.out.println("Total Amount of item         "+jj);
                    System.out.println("FOOD discount: 25%           " +kk );
                    System.out.println("G.S.T        : 5%            "+ll );
                    System.out.println("Service text : 5%            "+ll);
                 System.out.println("--------------------------------------------------");
    
                 System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
                }else if(asd==vv){
                    // GUJARATI THALI
                    int jj=1200*b;/* total */
                    int ss=jj/100;/* div */
                    int kk=ss*25;/* food d */
                    int ll=ss*5;/*s.text & gst*/
                    int zzz=(jj-kk)+ll+ll;/* total */
                   System.out.println(" ");
    
                   System.out.println(" ");
                   System.out.println("              BILL ");
                   System.out.println("-----------------------------------------------");
                   System.out.println("Table number:                "+a);
                   System.out.println("Item Name:                   GUJARATI THALI");
                   System.out.println("Total person                 "+b   );
                   System.out.println("Total Amount of item         "+jj);
                   System.out.println("FOOD discount: 25%           " +kk );
                   System.out.println("G.S.T        : 5%            "+ll );
                   System.out.println("Service text : 5%            "+ll);
                 System.out.println("--------------------------------------------------");
    
                System.out.println("You total Amount is:         "+zzz);
                System.out.println( "******************************************************THANKYOU****************************************");
                }else if(asd==bb){
                    // INDIAN SWEETS
                    int jj=1100*b;/* total */
                     int ss=jj/100;/* div */
                     int kk=ss*25;/* food d */
                     int ll=ss*5;/*s.text & gst*/
                     int zzz=(jj-kk)+ll+ll;/* total */
                    System.out.println(" ");
    
                    System.out.println(" ");
                    System.out.println("               BILL ");
                   System.out.println("------------------------------------------------ ");
    
                    System.out.println("Table number:                "+a);
                    System.out.println("Item Name:                   INDIAN SWEETS");
                    System.out.println("Total person                 "+b   );
                    System.out.println("Total Amount of item         "+jj);
                    System.out.println("FOOD discount: 25%           " +kk );
                    System.out.println("G.S.T        : 5%            "+ll );
                    System.out.println("Service text : 5%            "+ll);
                 System.out.println("---------------------------------------------------");
    
                 System.out.println("You total Amount is:         "+zzz);
                System.out.println("");
    
                System.out.println( "******************************************************THANKYOU****************************************");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                }else {
                   System.out.println("ENTER THE WORNG KEY ");
                 }
                
            }else {
               System.out.println("ENTER THE WORNG KEY ");
             }
            
    
               }else if(a==m){
        System.out.println("You table Number= "+a+" Booked");

                System.out.println("Total chair Number is= 6");
                System.out.println("Enter your total Person number:");
                int b=sc.nextInt();
                System.out.println("Seleted the Opetion :");
                
        
                System.out.println("1=FAST FOOD MENU");
                System.out.println("2=LUNCH MENU");
                int d=1;
                int t=2;
                int q=sc.nextInt();
                if(q==d){
                    // FOOD MENU
                    int as=1;
                    int sa=2;
                    int xx=3;
                    int vv=4;
                    int bb=5;
                    System.out.println("Welcom to the FAST FOOD MENU");
                    System.out.println("1.PIZZAS                  PRICE=100 ");
                    System.out.println("2.DOUBLE CHEESES PIZZAS   PRICE=200");
                    System.out.println("3.NON VEG BURGERS         PRICE=300");
                    System.out.println("4.VEG BURGERS             PRICE=100 ");
                    System.out.println("5.DRINKS                  PRICE=80");
                    System.out.println("Choose the FAST FOOD MENU Options:");
                    int asd=sc.nextInt();
                    if(asd==as){
                        // PIZZAS 
                        int jj=100*b;/* total */
                        int ss=jj/100;/* div */
                        int kk=ss*25;/* food d */
                        int ll=ss*5;/*s.text & gst*/
                        int zzz=(jj-kk)+ll+ll;/* total */
                       System.out.println(" ");
        
                       System.out.println(" ");
                       System.out.println("               BILL ");
                       System.out.println("------------------------------------------ ");
                       System.out.println("Table number:                "+a);
                       System.out.println("Item Name:                   PIZZAS");
                       System.out.println("Total person                 "+b   );
                       System.out.println("Total Amount of item         "+jj);
                       System.out.println("FOOD discount: 25%           " +kk );
                       System.out.println("G.S.T        : 5%            "+ll );
                       System.out.println("Service text : 5%            "+ll);
                     System.out.println("------------------------------------------");
        
                    System.out.println("You total Amount is:          "+zzz);
                        System.out.println( "**************************************************THANKYOU****************************************");
            
                        }else if(asd==sa){
                            // DOUBLE CHEESES PIZZAS
                            int jj=200*b;/* total */
                         int ss=jj/100;/* div */
                         int kk=ss*25;/* food d */
                         int ll=ss*5;/*s.text & gst*/
                         int zzz=(jj-kk)+ll+ll;/* total */
                        System.out.println(" ");
        
                        System.out.println(" ");
                        System.out.println("            BILL ");
                       System.out.println("--------------------------------------------------------- ");
        
                        System.out.println("Table number:                "+a);
                        System.out.println("Item Name:                   DOUBLE CHEESES PIZZAS");
                        System.out.println("Total person                 "+b   );
                        System.out.println("Total Amount of item         "+jj);
                        System.out.println("FOOD discount: 25%           " +kk );
                        System.out.println("G.S.T        : 5%            "+ll );
                        System.out.println("Service text : 5%            "+ll);
                     System.out.println("---------------------------------------------------------");
        
                     System.out.println("You total Amount is:         "+zzz);
                        System.out.println( "*****************************************************THANKYOU****************************************");
            
                        }else if(asd==xx){
                            // NON VEG BURGERS
                            int jj=300*b;/* total */
                         int ss=jj/100;/* div */
                         int kk=ss*25;/* food d */
                         int ll=ss*5;/*s.text & gst*/
                         int zzz=(jj-kk)+ll+ll;/* total */
                        System.out.println(" ");
        
                        System.out.println(" ");
                        System.out.println("            BILL");
                       System.out.println("-------------------------------------------------- ");
        
                        System.out.println("Table number:                "+a);
                        System.out.println("Item Name:                   NON VEG BURGERS");
                        System.out.println("Total person                 "+b   );
                        System.out.println("Total Amount of item         "+jj);
                        System.out.println("FOOD discount: 25%           " +kk );
                        System.out.println("G.S.T        : 5%            "+ll );
                        System.out.println("Service text : 5%            "+ll);
                     System.out.println("-------------------------------------------------------");
        
                     System.out.println("You total Amount is:         "+zzz);
                        System.out.println( "********************************************************THANKYOU****************************************");
            
                        }else if(asd==vv){
                            // VEG BURGERS
                            int jj=100*b;/* total */
                         int ss=jj/100;/* div */
                         int kk=ss*25;/* food d */
                         int ll=ss*5;/*s.text & gst*/
                         int zzz=(jj-kk)+ll+ll;/* total */
                        System.out.println(" ");
        
                        System.out.println(" ");
                        System.out.println("              BILL ");
                       System.out.println("----------------------------------------------- ");
        
                        System.out.println("Table number:                "+a);
                        System.out.println("Item Name:                   VEG BURGERS");
                        System.out.println("Total person                 "+b   );
                        System.out.println("Total Amount of item         "+jj);
                        System.out.println("FOOD discount: 25%           " +kk );
                        System.out.println("G.S.T        : 5%            "+ll );
                        System.out.println("Service text : 5%            "+ll);
                     System.out.println("-------------------------------------------------");
        
                     System.out.println("You total Amount is:         "+zzz);
                        System.out.println( "******************************************************THANKYOU****************************************");
            
                        }else if(asd==bb){
                            // DRINKS 
                            int jj=80*b;/* total */
                         int ss=jj/100;/* div */
                         int kk=ss*25;/* food d */
                         int ll=ss*5;/*s.text & gst*/
                         int zzz=(jj-kk)+ll+ll;/* total */
                        System.out.println(" ");
        
                        System.out.println(" ");
                        System.out.println("               BILL ");
                       System.out.println("--------------------------------------------");
        
                        System.out.println("Table number:                "+a);
                        System.out.println("Item Name:                   DRINKS ");
                        System.out.println("Total person                 "+b   );
                        System.out.println("Total Amount of item         "+jj);
                        System.out.println("FOOD discount: 25%           " +kk );
                        System.out.println("G.S.T        : 5%            "+ll );
                        System.out.println("Service text : 5%            "+ll);
                     System.out.println("----------------------------------------------");
        
                     System.out.println("You total Amount is:         "+zzz);
                        System.out.println( "******************************************************THANKYOU****************************************");
            
                        }else {
                          System.out.println("ENTER THE WORNG KEY ");
                        }
        
                }else if (q==t){
                    // LUNCH MENU
                    System.out.println("                                             Welcom to the LUNCH MENU");
                    int as=1;
                    int sa=2;
                    int xx=3;
                    int vv=4;
                    int bb=5;
                    System.out.println("1.SOUTH INDIAN THALI  PRICE=1000  ");
                    System.out.println("2.NORTH INDIAN THALI  PRICE=2000  ");
                    System.out.println("3.HARYANA THALI       PRICE=1500");
                    System.out.println("4.GUJARATI THALI      PRICE=1200");
                    System.out.println("5.INDIAN SWEETS       PRICE=1100");
                    System.out.println("Choose the lunch Options:");
                    int asd=sc.nextInt();
                    // SOUTH INDIAN THALI
                    if(asd==as){
                      int jj=1000*b;/* total */
                      int ss=jj/100;/* div */
                      int kk=ss*0;/* food d */
                      int ll=ss*5;/*s.text & gst*/
                      int zzz=(jj-kk)+ll+ll;/* total */
                     System.out.println(" ");
        
                     System.out.println(" ");
                     System.out.println("              BILL ");
                     System.out.println("--------------------------------------------------- ");
        
                     System.out.println("Table number:                "+a);
                     System.out.println("Item Name:                   SOUTH INDIAN THALI");
                     System.out.println("Total person                 "+b   );
                     System.out.println("Total Amount of item         "+jj);
                     System.out.println("FOOD discount: 25%           " +kk );
                     System.out.println("G.S.T        : 5%            "+ll );
                     System.out.println("Service text : 5%            "+ll);
                     System.out.println("----------------------------------------------------");
        
                  System.out.println("You total Amount is:         "+zzz);
                    System.out.println( "******************************************************THANKYOU****************************************");
                    }else if(asd==sa){
                        // NORTH INDIAN THALI
                        int jj=2000*b;/* total */
                        int ss=jj/100;/* div */
                        int kk=ss*25;/* food d */
                        int ll=ss*5;/*s.text & gst*/
                        int zzz=(jj-kk)+ll+ll;/* total */
                       System.out.println(" ");
        
                       System.out.println(" ");
                       System.out.println("              BILL ");
                       System.out.println("--------------------------------------------------- ");
        
                       System.out.println("Table number:                "+a);
                       System.out.println("Item Name:                   NORTH INDIAN THALI");
                       System.out.println("Total person                 "+b   );
                       System.out.println("Total Amount of item         "+jj);
                       System.out.println("FOOD discount: 25%           " +kk );
                       System.out.println("G.S.T        : 5%            "+ll );
                       System.out.println("Service text : 5%            "+ll);
                     System.out.println("------------------------------------------------------");
        
                    System.out.println("You total Amount is:         "+zzz);
                    System.out.println( "******************************************************THANKYOU****************************************");
        
                    }
                    else if(asd==xx){
                        // HARYANA THALI
                        int jj=1500*b;/* total */
                         int ss=jj/100;/* div */
                         int kk=ss*25;/* food d */
                         int ll=ss*5;/*s.text & gst*/
                         int zzz=(jj-kk)+ll+ll;/* total */
                        System.out.println(" ");
        
                        System.out.println(" ");
                        System.out.println("             BILL ");
                       System.out.println("---------------------------------------------- ");
        
                        System.out.println("Table number:                "+a);
                        System.out.println("Item Name:                   HARYANA THALI");
                        System.out.println("Total person                 "+b   );
                        System.out.println("Total Amount of item         "+jj);
                        System.out.println("FOOD discount: 25%           " +kk );
                        System.out.println("G.S.T        : 5%            "+ll );
                        System.out.println("Service text : 5%            "+ll);
                     System.out.println("--------------------------------------------------");
        
                     System.out.println("You total Amount is:         "+zzz);
                    System.out.println( "******************************************************THANKYOU****************************************");
                    }else if(asd==vv){
                        // GUJARATI THALI
                        int jj=1200*b;/* total */
                        int ss=jj/100;/* div */
                        int kk=ss*25;/* food d */
                        int ll=ss*5;/*s.text & gst*/
                        int zzz=(jj-kk)+ll+ll;/* total */
                       System.out.println(" ");
        
                       System.out.println(" ");
                       System.out.println("              BILL ");
                       System.out.println("-----------------------------------------------");
                       System.out.println("Table number:                "+a);
                       System.out.println("Item Name:                   GUJARATI THALI");
                       System.out.println("Total person                 "+b   );
                       System.out.println("Total Amount of item         "+jj);
                       System.out.println("FOOD discount: 25%           " +kk );
                       System.out.println("G.S.T        : 5%            "+ll );
                       System.out.println("Service text : 5%            "+ll);
                     System.out.println("--------------------------------------------------");
        
                    System.out.println("You total Amount is:         "+zzz);
                    System.out.println( "******************************************************THANKYOU****************************************");
                    }else if(asd==bb){
                        // INDIAN SWEETS
                        int jj=1100*b;/* total */
                         int ss=jj/100;/* div */
                         int kk=ss*25;/* food d */
                         int ll=ss*5;/*s.text & gst*/
                         int zzz=(jj-kk)+ll+ll;/* total */
                        System.out.println(" ");
        
                        System.out.println(" ");
                        System.out.println("               BILL ");
                       System.out.println("------------------------------------------------ ");
        
                        System.out.println("Table number:                "+a);
                        System.out.println("Item Name:                   INDIAN SWEETS");
                        System.out.println("Total person                 "+b   );
                        System.out.println("Total Amount of item         "+jj);
                        System.out.println("FOOD discount: 25%           " +kk );
                        System.out.println("G.S.T        : 5%            "+ll );
                        System.out.println("Service text : 5%            "+ll);
                     System.out.println("---------------------------------------------------");
        
                     System.out.println("You total Amount is:         "+zzz);
                    System.out.println("");
        
                    System.out.println( "******************************************************THANKYOU****************************************");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    }else {
                       System.out.println("ENTER THE WORNG KEY ");
                     }
                    
                }else {
                  System.out.println("ENTER THE WORNG KEY ");
                }
                
        
                   }else {
                     System.out.println("ENTER THE WORNG KEY ");
                  
                   }
        


       


      

    }
}
