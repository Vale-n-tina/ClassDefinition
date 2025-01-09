package Es1;

import java.util.Scanner;

public class TestRettangolo {

  public static void main(String[] args){
	  Scanner scanner=new Scanner(System.in);
   //primo rettangolo
	  System.out.println("inserisci l'altezza del primo rettangolo");
	  double altezza1=scanner.nextDouble();
	  System.out.println("inserisci la largezza del primo rettangolo");

	  double larghezza1=scanner.nextDouble();



	  //secondo rettangolo
	  System.out.println("inserisci  l'altezza del secondo rettangolo");
	  double altezza2=scanner.nextDouble();
	  System.out.println("inserisci la largezza del secondo rettangolo");

	  double larghezza2=scanner.nextDouble();


	  Rettangolo mioRettangolo1=new Rettangolo(altezza1, larghezza1);
	  Rettangolo mioRettangolo2 =new Rettangolo(altezza2, larghezza2);
	  scanner.close();
	  System.out.println("L'area del rettangolo1 è "+ mioRettangolo1.calcoloArea() + " cm2" );
	  System.out.println("L'area del rettangolo2 è "+ mioRettangolo2.calcoloArea() + " cm2" );
	  System.out.println("Il perimetro del rettangolo1 è "+ mioRettangolo1.calcoloPerimetro() + " cm" );
	  System.out.println("Il perimetro del rettangolo1 è "+ mioRettangolo2.calcoloPerimetro() + " cm" );
	  System.out.println("L'area e il perimetro dei due rettangoli sommati sono rispettivamente " + (mioRettangolo1.calcoloArea()+mioRettangolo2.calcoloArea()) + " cm2 e " + (mioRettangolo1.calcoloPerimetro()+mioRettangolo2.calcoloPerimetro()) + "cm" );



  }

}
