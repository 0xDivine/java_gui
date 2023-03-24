import java.awt.*;

public class Main {






	public static void main(String[] args) {

		Bar bar = new Bar();
		bar.toevoegen(new Water("groot"));
		int plek = bar.zoekDrank("een groot glas water");
		System.out.println(plek);
		bar.toevoegen(new WarmeDrank(true, true, true));
		bar.print();
		int plek2 = bar.zoekDrank("thee");
		System.out.println(plek2);
		int plek3 = bar.zoekDrank("thee met melk en suiker");
		System.out.println(plek3);
	}





//======================== code om WarmeDrank (opgave 1) te testen ========================

/*
	//---------------------- code om opgave 1(b) te testen --------------------
	//
	public static void main(String[] args) {
		WarmeDrank thee = new WarmeDrank(true, false, true);
		System.out.println(thee);            //>>   thee met suiker (1.25)
		String bes = thee.getOmschrijving();
		System.out.println(bes);             //>>   thee met suiker

		WarmeDrank koffieZwart = new WarmeDrank(false, false, false);
		System.out.println(koffieZwart);     //>>   koffie (2.0)

		WarmeDrank koffieMetMelk = new WarmeDrank(false, true, false);
		System.out.println(koffieMetMelk);   //>>   koffie met melk (2.5)

		 // let op de "en" tussen melk en suiker!
		WarmeDrank koffieMetAlles = new WarmeDrank(false, true, true);
		System.out.println(koffieMetAlles);  //>>   koffie met melk en suiker (2.75)
	}
*/




//======================== code om Bar (opgave 2) te testen ========================

/*
	//---------------------- code om opgave 2(b) te testen --------------------
	//
	public static void main(String[] args) {
		Bar bar = new Bar();
		bar.print();  //>>   aantalOpgehaaldeGlazen = 0
		              //>>   totaleInkomsten = 0.0

		bar.toevoegen(new Water("groot"));
		bar.toevoegen(new Water());
		bar.print();  //>>   aantalOpgehaaldeGlazen = 0
		              //>>   totaleInkomsten = 0.0
		              //>>       1e: een groot glas water (0.0)
		              //>>       2e: een normaal glas water (0.0)
	}
*/


/*
	//---------------------- code om opgave 2(b) te testen --------------------
	//
	public static void main(String[] args) {
		Bar bar = new Bar();
		 // de waarde van totaleInkomsten verandert door toevoegen(...)
		bar.toevoegen(new WarmeDrank(false, true, false));
		bar.toevoegen(new WarmeDrank(true, true, true));

		 // niet leegmaken (... , false)
		bar.toevoegen(new Water(), false);
		bar.print();  //>>   aantalOpgehaaldeGlazen = 0
		              //>>   totaleInkomsten = 4.25
		              //>>       1e: koffie met melk (2.5)
		              //>>       2e: thee met melk en suiker (1.75)
		              //>>       3e: een normaal glas water (0.0)

		 // leegmaken via de toevoegen(... , boolean) methode:
		 // er wordt true meegegeven, dus drankenOpTafel wordt eerst leeggemaakt.
		 // De waarde van aantalOpgehaaldeGlazen verandert door het leegmaken.
		bar.toevoegen(new Water(), true);
		bar.print();  //>>   aantalOpgehaaldeGlazen = 3
		              //>>   totaleInkomsten = 4.25
		              //>>       1e: een normaal glas water (0.0)
	}
*/


/*
	//---------------------- code om opgave 2(b) te testen --------------------
	//
	public static void main(String[] args) {
		Bar bar = new Bar();
		bar.toevoegen(new Water("groot"));
		bar.toevoegen(new Water("groot"));
		bar.toevoegen(new Water("normaal"));
		bar.toevoegen(new Water("normaal"));
		bar.toevoegen(new Water("klein"));

		bar.print();  //>>   aantalOpgehaaldeGlazen = 0
		              //>>   totaleInkomsten = 0.0
		              //>>       1e: een groot glas water (0.0)
		              //>>       2e: een groot glas water (0.0)
		              //>>       3e: een normaal glas water (0.0)
		              //>>       4e: een normaal glas water (0.0)
		              //>>       5e: een klein glas water (0.0)

		 // Automatisch leegmaken omdat tafel te vol is: Dit is namelijk het 6e drankje.
		 // Dus de tafel wordt leegemaakt (en aantalOpgehaaldeGlazen aangepast).
		 // Daarna wordt de input toegevoegd.
		bar.toevoegen(new WarmeDrank(true, true, true));

		bar.print();  //>>   aantalOpgehaaldeGlazen = 5
		              //>>   totaleInkomsten = 1.75
		              //>>       1e: thee met melk en suiker (1.75)
	}
*/


/*
	//---------------------- code om opgave 2(c) te testen --------------------
	//
	public static void main(String[] args) {
		Bar bar = new Bar();
		bar.toevoegen(new Water("groot"));
		bar.print();               //>>   aantalOpgehaaldeGlazen = 0
		                           //>>   totaleInkomsten = 0.0
		                           //>>       1e: een groot glas water (0.0)

		 // niet aanwezig:
		int plek = bar.zoekDrank("thee met melk en suiker");
		System.out.println(plek);  //>>   0

		 // ook niet aanwezig:
		plek = bar.zoekDrank("water");
		System.out.println(plek);  //>>   0

		 // wel aanwezig, op de eerste plek:
		plek = bar.zoekDrank("een groot glas water");
		System.out.println(plek);  //>>   1

		bar.toevoegen(new WarmeDrank(true, true, true));
		bar.print();               //>>   aantalOpgehaaldeGlazen = 0
		                           //>>   totaleInkomsten = 1.75
		                           //>>       1e: een groot glas water (0.0)
		                           //>>       2e: thee met melk en suiker (1.75)

		 // niet aanwezig:
		plek = bar.zoekDrank("thee");
		System.out.println(plek);  //>>   0

		 // wel aanwezig op de tweede plek:
		plek = bar.zoekDrank("thee met melk en suiker");
		System.out.println(plek);  //>>   2
	}
*/


}