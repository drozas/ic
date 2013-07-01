package automocion;

import java.util.ArrayList;
import java.util.List;

public class ListaCoches {

	private ArrayList<Coche> lista = new ArrayList<Coche>();
	
	public ListaCoches(){
		// Insertamos la base de datos de todos los coches
		Coche coche1 = new Coche("Seat Ibiza","manual","normal","gasolina","70","11624","1.2");
		lista.add(coche1);
		Coche coche2 = new Coche("Seat Ibiza", "manual" , "normal", "gasolina", "105", "14820", "1.6");
		lista.add(coche2);
		Coche coche3 = new Coche("Seat Ibiza", "manual" , "normal", "gasolina", "180", "21552","1.8");
		lista.add(coche3);
		Coche coche4 = new Coche("Seat Ibiza", "manual" , "normal", "diesel","70", "13000", "1.4");
		lista.add(coche4);
		Coche coche5 = new Coche("Seat Ibiza", "manual" , "normal", "diesel", "100", "16546", "1.9");
		lista.add(coche5);
		Coche coche6 = new Coche("Seat Ibiza", "manual" , "normal", "diesel", "160", "21338", "1.9");
		lista.add(coche6);
		Coche coche7 = new Coche("Seat Toledo", "manual" , "familiar", "gasolina", "102", "19307", "1.6");
		lista.add(coche7);
		Coche coche8 = new Coche("Seat Toledo", "manual" , "familiar", "gasolina", "150", "24854", "2.0");
		lista.add(coche8);
		Coche coche9 = new Coche("Seat Toledo", "manual" , "familiar", "diesel", "105", "21307", "1.9");
		lista.add(coche9);
		Coche coche10 = new Coche("Nissan Note", "manual" , "normal", "gasolina", "110", "13450", "1.6");
		lista.add(coche10);
		Coche coche11 = new Coche("Seat Toledo", "manual" , "familiar", "diesel", "140", "25457", "2.0");
		lista.add(coche11);
		Coche coche12 = new Coche("Seat Leon", "automatica" , "deportivo", "gasolina", "240", "26900", "2.0");
		lista.add(coche12);
		Coche coche13 = new Coche("Seat Leon", "automatica" , "deportivo", "diesel", "170", "24983", "2.0");
		lista.add(coche13);
		Coche coche14 = new Coche("BMW Serie 630i Coupé", "automatica" , "deportivo", "gasolina", "258", "69300", "3.0");
		lista.add(coche14);
		Coche coche15 = new Coche("BMW 318d Berlina", "manual" , "familiar", "diesel", "122", "31500", "2.0");
		lista.add(coche15);
		Coche coche16 = new Coche("BMW 320i Berlina", "manual" , "familiar", "gasolina", "150", "33000", "2.0");
		lista.add(coche16);
		Coche coche17 = new Coche("BMW Z4 2.0i Roadster", "manual" , "deportivo", "gasolina", "150", "34600", "2.0");
		lista.add(coche17);
		Coche coche18 = new Coche("BMW X3", "manual" , "todo terreno", "diesel", "150", "39300", "2.0");
		lista.add(coche18);
		Coche coche19 = new Coche("BMW X3", "manual" , "todo terreno", "gasolina", "150", "38900", "2.0");
		lista.add(coche19);
		Coche coche20 = new Coche("BMW X5", "automatica" , "todo terreno", "diesel", "235", "56631", "3.0");
		lista.add(coche20);
		Coche coche21 = new Coche("BMW X5", "automatica" , "todo terreno", "gasolina", "272", "55131","3.0");
		lista.add(coche21);
		Coche coche22 = new Coche("Porsche Boxter", "automatica" , "deportivo", "gasolina", "245", "49382", "2.7");
		lista.add(coche22);
		Coche coche23 = new Coche("Porsche 911 Carrera", "automatica" , "deportivo", "gasolina", "325", "86886", "3.6");
		lista.add(coche23);
		Coche coche24 = new Coche("Porsche Cayenne", "manual" , "todo terreno", "gasolina", "290", "57251", "3.6");
		lista.add(coche24);
		Coche coche25 = new Coche("Hyundai Elantra", "manual" , "familiar", "gasolina", "105", "16790", "1.6");
		lista.add(coche25);
		Coche coche26 = new Coche("Renault Clio", "manual" , "pequeño", "diesel", "75", "13900", "1.2");
		lista.add(coche26);
		Coche coche27 = new Coche("Hyundai Atos", "manual" , "pequeño", "gasolina", "65", "9650", "1.1");
		lista.add(coche27);
		Coche coche28 = new Coche("Hyundai Coupé", "manual" , "deportivo", "gasolina", "100", "20450", "1.6");
		lista.add(coche28);
		Coche coche29 = new Coche("Hyundai Tucson CVVT", "manual" , "todo terreno", "gasolina", "150", "20800", "2.0");
		lista.add(coche29);
		Coche coche30 = new Coche("Hyundai Matrix", "manual" , "pequeño", "gasolina", "105", "14900", "1.6");
		lista.add(coche30);
		Coche coche31 = new Coche("Renault Clio", "manual" , "pequeño", "gasolina", "75", "12500", "1.2");
		lista.add(coche31);
		Coche coche32 = new Coche("Renault Clio", "automatica" , "pequeño", "gasolina", "110", "18500", "1.6");
		lista.add(coche32);
		Coche coche33 = new Coche("Renault Megane", "manual" , "normal", "diesel", "85", "18650", "1.5");
		lista.add(coche33);
		Coche coche34 = new Coche("Renault Megane", "manual" , "normal", "gasolina", "110", "18500","1.6");
		lista.add(coche34);
		Coche coche35 = new Coche("Renault Megane Sport", "manual" , "normal", "gasolina", "225", "30810", "2.0");
		lista.add(coche35);
		Coche coche36 = new Coche("Renault Megane Coupé Cabriolet", "manual" , "deportivo", "diesel", "105", "24910", "1.5");
		lista.add(coche36);
		Coche coche37 = new Coche("Renault Megane Coupé Cabriolet", "manual" , "deportivo", "gasolina", "110", "22810","1.5");
		lista.add(coche37);
		Coche coche38 = new Coche("Renault Megane Coupé Cabriolet", "automatica" , "deportivo", "gasolina", "110", "24660", "1.5");
		lista.add(coche38);
		Coche coche39 = new Coche("Nissan Terrano", "manual" , "todo terreno", "diesel", "125", "29290", "2.7");
		lista.add(coche39);
		Coche coche40 = new Coche("Renault Espace", "manual" , "monovolumen", "diesel", "130", "29980", "2.0");
		lista.add(coche40);
		Coche coche41 = new Coche("Renault Espace", "manual" , "monovolumen", "gasolina", "140", "26980", "2.0");
		lista.add(coche41);
		Coche coche42 = new Coche("Renault Espace", "automatica" , "monovolumen", "gasolina", "170", "35700", "2.0");
		lista.add(coche42);
		Coche coche43 = new Coche("Renault Espace", "automatica" , "monovolumen", "diesel", "130", "29980", "2.0");
		lista.add(coche43);
		Coche coche44 = new Coche("Renault Laguna", "manual" , "familiar", "diesel", "110", "23700", "1.9");
		lista.add(coche44);
		Coche coche45 = new Coche("Renault Laguna", "automatica" , "familiar", "diesel", "140", "32550", "2.2");
		lista.add(coche45);
		Coche coche46 = new Coche("Renault Laguna", "manual" , "familiar", "gasolina", "115", "22100", "1.6");
		lista.add(coche46);
		Coche coche47 = new Coche("Renault Laguna", "automatica" , "familiar", "gasolina", "135", "29800", "2.0");
		lista.add(coche47);
		Coche coche48 = new Coche("Renault Clio Sport", "manual" , "deportivo", "gasolina", "200", "23000", "2.0");
		lista.add(coche48);
		Coche coche49 = new Coche("Nissan Micra", "manual" , "pequeño", "gasolina", "65", "6500", "1.1");
		lista.add(coche49);
		Coche coche50 = new Coche("Nissan Micra CC", "manual" , "deportivo", "gasolina", "110", "17200", "1.6");
		lista.add(coche50);
		Coche coche51 = new Coche("Nissan 350Z", "manual" , "deportivo", "gasolina", "300", "44250", "3.5");
		lista.add(coche51);
		Coche coche52 = new Coche("Nissan Patrol", "manual" , "todo terreno", "diesel", "160", "39300", "3.0");
		lista.add(coche52);

	}
	
	public Coche dameCoche(int i){
		return lista.get(i);
	}
}

