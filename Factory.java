/**************************
*@author: Robbin Woods Rodriguez 15201
*@version: 1.0
******************************/

import java.util.*;

public class Factory{
	private Set datos;

	public Factory(int tipo){
		if(tipo==1)
			datos=new TreeSet();
		else if(tipo==2)
			datos=new HashSet();
		else
			datos=new LinkedHashSet();
	}

	public Set resultado(){
		return datos;
	}	
}