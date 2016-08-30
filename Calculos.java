/**************************
*@author: Robbin Woods Rodriguez 15201
*@version: 1.0
******************************/

import java.util.*;

public class Calculos{
	private Set listaJava;
	private Set listaWeb;
	private Set listaMoviles;


	public Calculos(int tipo){
		Factory temp=new Factory(tipo);
		listaJava= temp.resultado();
		listaWeb= temp.resultado();
		listaJava=temp.resultado();
	}

	public ArrayList interseccionTres(){
		ArrayList temp=new ArrayList();
		Object[] listaJava1=listaJava.toArray();
		for(int i=0;i<listaJava.size();i++){
			if(listaWeb.contains(listaJava1[i])==true){
				if(listaMoviles.contains(listaJava1[i])==true)
					temp.add(listaJava1[i]);
			}
		}
		return temp;
	}

	public boolean javaSubConjuntoWeb(){
		if(listaWeb.contains(listaJava)==true)
			return true;
		else
			return false;
	}	

	public ArrayList javaNoWeb(){
		ArrayList temp=new ArrayList();
		Object[] listaJava1=listaJava.toArray();
		for(int i=0;i<listaJava.size();i++){
			if(listaWeb.contains(listaJava1[i])==false)
				temp.add(listaJava1[i]);
		}
		return temp;
	}

	public ArrayList webYCelularesInterseccion(){
		ArrayList temp= new ArrayList();
		Object[] listaWeb1=listaWeb.toArray();
		for(int i=0;i<listaWeb.size();i++){
			if(listaMoviles.contains(listaWeb1[i])==true)
				temp.add(listaWeb1[i]);
		}
		return temp;
	}

	public ArrayList webYCelularesUnion(){
		ArrayList temp=new ArrayList();
		Object[] listaWeb1=listaWeb.toArray();
		Object[] listaMoviles1=listaMoviles.toArray();
		for(int i=0;i<listaWeb.size();i++)
			temp.add(listaWeb1[i]);
		for(int i=0;i<listaMoviles.size();i++){
			for(int j=0;j<temp.size();j++){
				if(listaMoviles1[i]!=temp.get(j))
					temp.add(listaMoviles1[j]);
			}
		}
		return temp;
	}

	public Set conjuntoMayor(){
		Set temp;
		if(listaMoviles.size()>listaWeb.size() && listaMoviles.size()>listaJava.size())
			temp=listaMoviles;
		else if(listaJava.size()>listaWeb.size() && listaJava.size()>listaMoviles.size())
			temp=listaJava;
		else
			temp=listaWeb;
		return temp;
	}

	public Set getListaJava(){
		return listaJava;
	}

	public Set getListaWeb(){
		return listaWeb;
	}

	public Set getListaMoviles(){
		return listaMoviles;
	}

	public void addJava(Programadores prog){
		listaJava.add(prog);
	}

	public void addWeb(Programadores prog){
		listaWeb.add(prog);
	}

	public void addMoviles(Programadores prog){
		listaMoviles.add(prog);
	}

}