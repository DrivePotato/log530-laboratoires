/*
 * Created on : 20-06-17
 * Author     : Olivier Rheault Gagnon et Gazi Hyder
 * Description: Fichier principal contenant les fonctionnalit�s de conversions. Ce fichier a �t� automatiquement
 * 				g�n�r� grace � un logiciel de convertisseur de langage. Les erreurs de compilations ont �t� 
 * 				corrig�s. Le code puant a �t� identifi� et inscrit dans le rapport de laboratoire.
 */

import java.util.Scanner;

public class GlobalMembers
{
	//Funciones de conversion de Joule a otras unidades

	public static float conversionJouleCaloria(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_CALORIA);
	}

	public static float conversionJouleKCaloria(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_KCALORIA);
	}

	public static float conversionJouleBTU(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_BTU);
	}

	public static float conversionJouleKWHR(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_KWHR);
	}

	public static float conversionJouleHPHR(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_HPHR);
	}

	public static float conversionJoulePielb(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_PIELB);
	}

	public static float conversionJouleLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_LITROATM);
	}

	//Tomando las funciones de conversion de Joule a otras unidades, hacemos las funciones inversas

	public static float conversionCaloriaJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_CALORIA);
	}

	public static float conversionKCaloriaJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_KCALORIA);
	}

	public static float conversionBTUJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_BTU);
	}

	public static float conversionKWHRJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_KWHR);
	}

	public static float conversionHPHRJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_HPHR);
	}

	public static float conversionPielbJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_PIELB);
	}

	public static float conversionLitroAtmJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_LITROATM);
	}

	//Funciones de conversión de Caloria a otras unidades, descontando aquellas que envuelven Joules

	public static float conversionCaloriaKCaloria(float numero)
	{
		return numero * DefineConstants.CALORIA_KCALORIA;
	}

	public static float conversionCaloriaBTU(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_BTU);
	}

	public static float conversionCaloriaKWHR(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_KWHR);
	}

	public static float conversionCaloriaHPHR(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_HPHR);
	}

	public static float conversionCaloriaPielb(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_PIELB);
	}

	public static float conversionCaloriaLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_LITROATM);
	}

	//Tomando las funciones de conversion de Caloria, hacemos las funciones inversas

	public static float conversionKCaloriaCaloria(float numero)
	{
		return numero / DefineConstants.CALORIA_KCALORIA;
	}

	public static float conversionBTUCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_BTU);
	}

	public static float conversionKWHRCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_KWHR);
	}

	public static float conversionHPHRCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_HPHR);
	}

	public static float conversionPielbCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_PIELB);
	}

	public static float conversionLitroAtmCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_LITROATM);
	}

	//Funciones de conversion de Kcaloria a otras unidades, menos las funciones que contengan Joule y Caloria

	public static float conversionKCaloriaBTU(float numero)
	{
		return (float) (numero * DefineConstants.KCALORIA_BTU);
	}

	public static float conversionKCaloriaKWHR(float numero)
	{
		return (float) (numero * DefineConstants.KCALORIA_KWHR);
	}

	public static float conversionKCaloriaHPHR(float numero)
	{
		return (float) (numero * DefineConstants.KCALORIA_HPHR);
	}

	public static float conversionKCaloriaPielb(float numero)
	{
		return numero * DefineConstants.KCALORIA_PIELB;
	}

	public static float conversionKCaloriaLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.KCALORIA_LITROATM);
	}

	//Tomando las funciones de conversion de KCaloria, hacemos las funciones inversas

	public static float conversionBTUKCaloria(float numero)
	{
		return (float) (numero / DefineConstants.KCALORIA_BTU);
	}

	public static float conversionKWHRKCaloria(float numero)
	{
		return (float) (numero / DefineConstants.KCALORIA_KWHR);
	}

	public static float conversionHPHRKCaloria(float numero)
	{
		return (float) (numero / DefineConstants.KCALORIA_HPHR);
	}

	public static float conversionPielbKCaloria(float numero)
	{
		return numero / DefineConstants.KCALORIA_PIELB;
	}

	public static float conversionLitroAtmKCaloria(float numero)
	{
		return (float) (numero / DefineConstants.KCALORIA_LITROATM);
	}

	//Funciones de conversion de BTU a otras unidades, menos las funciones que contengan Joule, Caloria y KCaloria

	public static float conversionBTUKWHR(float numero)
	{
		return (float) (numero * DefineConstants.BTU_KWHR);
	}

	public static float conversionBTUHPHR(float numero)
	{
		return (float) (numero * DefineConstants.BTU_HPHR);
	}

	public static float conversionBTUPielb(float numero)
	{
		return (float) (numero * DefineConstants.BTU_PIELB);
	}

	public static float conversionBTULitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.BTU_LITROATM);
	}

	//Tomando las funciones de conversion de BTU, hacemos las funciones inversas

	public static float conversionKWHRBTU(float numero)
	{
		return (float) (numero / DefineConstants.BTU_KWHR);
	}

	public static float conversionHPHRBTU(float numero)
	{
		return (float) (numero / DefineConstants.BTU_HPHR);
	}

	public static float conversionPielbBTU(float numero)
	{
		return (float) (numero / DefineConstants.BTU_PIELB);
	}

	public static float conversionLitroAtmBTU(float numero)
	{
		return (float) (numero / DefineConstants.BTU_LITROATM);
	}

	//Funciones de conversion de KWHR a otras unidades, menos las funciones que contengan Joule, Caloria, KCaloria ni BTU

	public static float conversionKWHRHPHR(float numero)
	{
		return (float) (numero * DefineConstants.KWHR_HPHR);
	}

	public static float conversionKWHRPielb(float numero)
	{
		return numero * DefineConstants.KWHR_PIELB;
	}

	public static float conversionKWHRLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.KWHR_LITROATM);
	}

	//Tomando las funciones de conversion de KWHR, hacemos las funciones inversas

	public static float conversionHPHRKWHR(float numero)
	{
		return (float) (numero / DefineConstants.KWHR_HPHR);
	}

	public static float conversionPielbKWHR(float numero)
	{
		return numero / DefineConstants.KWHR_PIELB;
	}

	public static float conversionLitroAtmKWHR(float numero)
	{
		return (float) (numero / DefineConstants.KWHR_LITROATM);
	}

	//Funciones de conversion de HPHR a otras unidades, menos las funciones que contengan Joule, Caloria, KCaloria, BTU ni KWHR

	public static float conversionHPHRPielb(float numero)
	{
		return numero * DefineConstants.HPHR_PIELB;
	}

	public static float conversionHPHRLitroAtm(float numero)
	{
		return numero * DefineConstants.HPHR_LITROATM;
	}

	//Tomando las funciones de conversion de HPHR, hacemos las funciones inversas

	public static float conversionPielbHPHR(float numero)
	{
		return numero / DefineConstants.HPHR_PIELB;
	}

	public static float conversionLitroAtmHPHR(float numero)
	{
		return numero / DefineConstants.HPHR_LITROATM;
	}

	//Funciones de conversion de LitroAtm a otras unidades, menos las funciones que contengan Joule, Caloria, KCaloria, BTU, KWHR ni HPHR

	public static float conversionLitroAtmPielb(float numero)
	{
		return (float) (numero * DefineConstants.LITROATM_PIELB);
	}

	//Tomando las funciones de conversion de HPHR, hacemos las funciones inversas

	public static float conversionPielbLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.LITROATM_PIELB);
	}
	public static void menu_seleccion()
	{

		System.out.print("\nEscriba la cantidad, después el número correspondiente a la unidad que quiere convertir");

		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- KW-HR");
		System.out.print("\n6 -- HP-HR");
		System.out.print("\n7 -- Pie-Libra");
		System.out.print("\n8 -- Litro-Atmosfera\n");
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			numero = Float.parseFloat(tempVar);
		}
		
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			opcion = Integer.parseInt(tempVar2);
		}
		System.out.printf("\n%f",numero);

		switch (opcion)
		{
			case 1:
			menu_conversionJoule();
			break;

			case 2:
			menu_conversionCaloria();
			break;

			case 3:
			menu_conversionKCaloria();
			break;

			case 4:
			menu_conversionBTU();
			break;

			case 5:
			menu_conversionKWHR();
			break;

			case 6:
			menu_conversionHPHR();
			break;

			case 7:
			menu_conversionPielb();
			break;

			case 8:
			menu_conversionLitroAtm();
			break;
		}

		// La variable resultado est popul�e dans une des m�thodes de menu_conversion
		System.out.printf("El resultado es %f\n", resultado);
	}
	public static void pressEnterKey(){
		   System.out.println("Pressione \"ENTER \" para continuar...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
	}
	public static void menu_conversionJoule()
	{

		System.out.print("\n\nElija la unidad a la que desea convertir");

		System.out.print("\n1 -- Caloría");
		System.out.print("\n2 -- KCaloría");
		System.out.print("\n3 -- BTU - British Thermal Unit");
		System.out.print("\n4 -- KW-HR");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		pressEnterKey();
		String tempVar = ConsoleInput. scanfRead();
		
		
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
		{
			case 1:
				resultado = conversionJouleCaloria(numero);
			break;

			case 2:
				resultado = conversionJouleKCaloria(numero);
			break;

			case 3:
				resultado = conversionJouleBTU(numero);
			break;

			case 4:
				resultado = conversionJouleKWHR(numero);
			break;

			case 5:
				resultado = conversionJouleHPHR(numero);
			break;

			case 6:
				resultado = conversionJoulePielb(numero);
			break;

			case 7:
				resultado = conversionJouleLitroAtm(numero);
			break;

			case 8:

			break;
		}
	}
	public static float menu_conversionCaloria()
	{
		System.out.print("Elija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- KCaloría");
		System.out.print("\n3 -- BTU - British Thermal Unit");
		System.out.print("\n4 -- KW-HR");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		pressEnterKey();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
		{
			case 1:
				resultado = conversionCaloriaJoule(numero);
			break;

			case 2:
				resultado = conversionCaloriaKCaloria(numero);
			break;

			case 3:
				resultado = conversionCaloriaBTU(numero);
			break;

			case 4:
				resultado = conversionCaloriaKWHR(numero);
			break;

			case 5:
				resultado = conversionCaloriaHPHR(numero);
			break;

			case 6:
				resultado = conversionCaloriaPielb(numero);
			break;

			case 7:
				resultado = conversionCaloriaLitroAtm(numero);
			break;

			case 8:

			break;
		}
		return 0;
	}
	public static float menu_conversionKCaloria()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- BTU - British Thermal Unit");
		System.out.print("\n4 -- KW-HR");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		pressEnterKey();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
		{
			case 1:
				resultado = conversionKCaloriaJoule(numero);
			break;

			case 2:
				resultado = conversionKCaloriaCaloria(numero);
			break;

			case 3:
				resultado = conversionKCaloriaBTU(numero);
			break;

			case 4:
				resultado = conversionKCaloriaKWHR(numero);
			break;

			case 5:
				resultado = conversionKCaloriaHPHR(numero);
			break;

			case 6:
				resultado = conversionKCaloriaPielb(numero);
			break;

			case 7:
				resultado = conversionKCaloriaLitroAtm(numero);
			break;

			case 8:

			break;
		}
		return 0;
	}
	public static float menu_conversionBTU()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- KW-HR");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		pressEnterKey();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
		{
			case 1:
				resultado = conversionBTUJoule(numero);
			break;

			case 2:
				resultado = conversionBTUCaloria(numero);
			break;

			case 3:
				resultado = conversionBTUKCaloria(numero);
			break;

			case 4:
				resultado = conversionBTUKWHR(numero);
			break;

			case 5:
				resultado = conversionBTUHPHR(numero);
			break;

			case 6:
				resultado = conversionBTUPielb(numero);
			break;

			case 7:
				resultado = conversionBTULitroAtm(numero);
			break;

			case 8:

			break;
		}
		return 0;
	}
	public static float menu_conversionKWHR()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		pressEnterKey();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
		{
			case 1:
				resultado = conversionKWHRJoule(numero);
			break;

			case 2:
				resultado = conversionKWHRCaloria(numero);
			break;

			case 3:
				resultado = conversionKWHRKCaloria(numero);
			break;

			case 4:
				resultado = conversionKWHRBTU(numero);
			break;

			case 5:
				resultado = conversionKWHRHPHR(numero);
			break;

			case 6:
				resultado = conversionKWHRPielb(numero);
			break;

			case 7:
				resultado = conversionKWHRLitroAtm(numero);
			break;

			case 8:

			break;
		}
		return 0;
	}
	public static float menu_conversionHPHR()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- KW-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		pressEnterKey();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
		{
			case 1:
				resultado = conversionHPHRJoule(numero);
			break;

			case 2:
				resultado = conversionHPHRCaloria(numero);
			break;

			case 3:
				resultado = conversionHPHRKCaloria(numero);
			break;

			case 4:
				resultado = conversionHPHRBTU(numero);
			break;

			case 5:
				resultado = conversionHPHRKWHR(numero);
			break;

			case 6:
				resultado = conversionHPHRPielb(numero);
			break;

			case 7:
				resultado = conversionHPHRLitroAtm(numero);
			break;

			case 8:

			break;
		}
		return 0;
	}
	public static float menu_conversionPielb()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- KW-HR");
		System.out.print("\n6 -- HP-HR");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		pressEnterKey();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
		{
			case 1:
				resultado = conversionPielbJoule(numero);
			break;

			case 2:
				resultado = conversionPielbCaloria(numero);
			break;

			case 3:
				resultado = conversionPielbKCaloria(numero);
			break;

			case 4:
				resultado = conversionPielbBTU(numero);
			break;

			case 5:
				resultado = conversionPielbKWHR(numero);
			break;

			case 6:
				resultado = conversionPielbHPHR(numero);
			break;

			case 7:
				resultado = conversionPielbLitroAtm(numero);
			break;

			case 8:

			break;
		}
		return 0;
	}
	public static void menu_conversionLitroAtm()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- KW-HR");
		System.out.print("\n6 -- HP-HR");
		System.out.print("\n7 -- Pie-Libra\n");

		pressEnterKey();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
		{
			case 1:
				resultado = conversionLitroAtmJoule(numero);
			break;

			case 2:
				resultado = conversionLitroAtmCaloria(numero);
			break;

			case 3:
				resultado = conversionLitroAtmKCaloria(numero);
			break;

			case 4:
				resultado = conversionLitroAtmBTU(numero);
			break;

			case 5:
				resultado = conversionLitroAtmKWHR(numero);
			break;

			case 6:
				resultado = conversionLitroAtmHPHR(numero);
			break;

			case 7:
				resultado = conversionLitroAtmPielb(numero);
			break;

			case 8:

			break;
		}
	}

	public static float resultado;
	public static float numero;
	public static int opcion;
}