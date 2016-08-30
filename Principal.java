/**************************
*@author: Robbin Woods Rodriguez 15201
*@version: 1.0
******************************/
import java.util.*;

public class Principal{
	public static void main(String args[]){
		Scanner usuario = new Scanner(System.in);

		//pidiendo los datos
		System.out.println("Bienvenido");
		System.out.println("Como quiere que funcione su programa: \n1.TreeSet \n 2.HashSet \n 3. LinkedHashSet");

		int tipo=usuario.nextInt();

		Calculos miPrograma=new Calculos(tipo);

		boolean finalizado=false;

		while(finalizado==false){
			System.out.println("Ingrese el nombre del Programador");
			String tempNombre=usuario.next();
			System.out.println("Ingrese la edad del Programador");
			int tempEdad=usuario.nextInt();
			System.out.println("Es el programador un desesarrollador Web? (s/n)");
			String tempWeb1=usuario.next();
			boolean tempWeb2;
			if(tempWeb1=="s")
				tempWeb2=true;
			else
				tempWeb2=false;
			System.out.println("Es el programador un desesarrollador Java? (s/n)");
			String tempJava1=usuario.next();
			boolean tempJava2;
			if(tempJava1=="s")
				tempJava2=true;
			else
				tempJava2=false;
			System.out.println("Es el programador un desesarrollador de Moviles? (s/n)");
			String tempMoviles1=usuario.next();
			boolean tempMoviles2;
			if(tempMoviles1=="s")
				tempMoviles2=true;
			else
				tempMoviles2=false;
			Programadores tempProgramador=new Programadores(tempNombre,tempEdad,tempWeb2,tempJava2,tempMoviles2);

			if(tempJava2==true)
				miPrograma.addJava(tempProgramador);
			if(tempWeb2==true)
				miPrograma.addWeb(tempProgramador);
			if(tempMoviles2==true)
				miPrograma.addMoviles(tempProgramador);
			System.out.println("Desea ingresar otro programador? \n(1.s/2.n) \n (el numero)");
			int tempContinuar=usuario.nextInt();
			if(tempContinuar==1)
				finalizado=false;
			else
				finalizado=true;
		}

		System.out.println("Interseccion de los 3: ");
		System.out.println(miPrograma.interseccionTres());

		System.out.println("java no web");
		System.out.println(miPrograma.javaNoWeb());

		System.out.println("interseccion web-celulares");
		System.out.println(miPrograma.webYCelularesInterseccion());

		System.out.println("union web-celulares");
		System.out.println(miPrograma.webYCelularesUnion());

		System.out.println("Java subconjunto de web?");
		System.out.println(miPrograma.javaSubConjuntoWeb());

		System.out.println("Conjunto mayor");
		System.out.println(miPrograma.conjuntoMayor());

	}	
}