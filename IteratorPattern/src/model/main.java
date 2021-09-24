package model;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class main {

	public static void main(String[] args) {
		System.out.println("Iterrator Pattern");
		TacoIterator oredered_tacos = new TacoIterator(); // created a general iterator
		CheeseTacoIterator cheese_tacos = new CheeseTacoIterator();
		VeggieTacoIterator veggie_tacos = new VeggieTacoIterator();

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Press 1 for  CheeseTaco and 2 for VeggieTaco:");
			int input = scanner.nextInt();
			System.out.println("Command Pattern Example");

			if (input == 1) {
				MXStyleCheeseTaco cheesetacoobj = new MXStyleCheeseTaco();
				cheese_tacos.addTaco(cheesetacoobj);
				printCheestacos(cheese_tacos.iterator());

//				 Taco taco1 = new Taco("MXCHEESE TACO", "CHEESE", "CHEESE SAUCE","ONION CHEESE");
//				 oredered_tacos.addTaco(taco1);  // created a generic Taco Model
			} else {

				MXStyleVeggieTaco veggieobj = new MXStyleVeggieTaco();
				veggie_tacos.addTaco(veggieobj);
				printVeggie(veggie_tacos.iterator());

//				 Taco taco1 = new Taco("MXVEGGIE TACO", "VEGGIE", "VEGGIE SAUCE","ONION VEGGIE");
//				 oredered_tacos.addTaco(taco1);   // created a generic Taco Model
			}
//			printTacos(oredered_tacos.iterator());   // Printing a generic Taco List

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void printVeggie(Iterator<MXStyleVeggieTaco> iterator) {

		System.out.printf("%10s | %35s | %15s | %15s\n", "Taco Name", "TacoType", "TacoSauce", "Tacotopping");
		System.out.println("-----------------------------------------------------------------------------------------");

		while (iterator.hasNext()) {
			MXStyleVeggieTaco taco = iterator.next();

			System.out.printf("%10s | %35s | %15s | %15s\n", taco.getTaco_Name(), taco.getTaco_Type(),
					taco.getTopping_sauce(), taco.getTaco_topping());

		}
		System.out.println("---------------------------------------------------------------------------------------");

		System.out.println();

	}

	private static void printCheestacos(Iterator<MXStyleCheeseTaco> iterator) {

		System.out.printf("%10s | %35s | %15s | %15s\n", "Taco Name", "TacoType", "TacoSauce", "Tacotopping");

		System.out.println("-----------------------------------------------------------------------------------------");

		while (iterator.hasNext()) {

			MXStyleCheeseTaco taco = iterator.next();

			System.out.printf("%10s | %35s | %15s | %15s\n", taco.getTaco_Name(), taco.getTaco_Type(),
					taco.getTopping_sauce(), taco.getTaco_topping());

		}

		System.out.println("---------------------------------------------------------------------------------------");

		System.out.println();

	}

	private static void printTacos(Iterator<Taco> iterator) {

		System.out.printf("%10s | %35s | %15s | %15s\n", "Taco Name", "TacoType", "TacoSauce", "Tacotopping");

		System.out.println("-----------------------------------------------------------------------------------------");

		while (iterator.hasNext()) {

			Taco taco = iterator.next();

			System.out.printf("%10s | %35s | %15s | %15s\n", taco.getTaco_Name(), taco.getTaco_Type(),
					taco.getTopping_sauce(), taco.getTaco_topping());

		}

		System.out.println("---------------------------------------------------------------------------------------");

		System.out.println();

	}

}
