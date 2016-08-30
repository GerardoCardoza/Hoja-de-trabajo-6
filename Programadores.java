/**************************
*@author: Robbin Woods Rodriguez 15201
*@version: 1.0
******************************/

public class Programadores{
	private String nombre;
	private int edad;
	private boolean desarrolladorWeb;
	private boolean desarrolladorJava;
	private boolean desarrolladorCelulares;

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setEdad(int edad){
		this.edad=edad;
	}

	public void setDesarrolladorWeb(boolean web){
		this.desarrolladorWeb=web;
	}

	public void setDesarrolladorJava(boolean java){
		this.desarrolladorJava=java;
	}

	public void setDesarrolladorCelulares(boolean celulares){
		this.desarrolladorCelulares=celulares;
	}

	public String getNombre(){
		return nombre;
	}

	public int getEdad(){
		return edad;
	}

	public boolean getDesarrolladorWeb(){
		return desarrolladorWeb;
	}

	public boolean getDesarrolladorJava(){
		return desarrolladorJava;
	}

	public boolean getDesarrolladorCelulares(){
		return desarrolladorCelulares;
	}

	public Programadores(String nombre, int edad, boolean web, boolean java, boolean celulares){
		this.nombre=nombre;
		this.edad=edad;
		this.desarrolladorWeb=web;
		this.desarrolladorJava=java;
		this.desarrolladorCelulares=celulares;
	}
}