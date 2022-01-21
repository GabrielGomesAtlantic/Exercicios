package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {

	//EXEMPLO ARRAY	
		int numeros[] = new int[10];
		
		numeros [0] = 100;
		numeros [1] = 85;
		numeros [2] = 999;
		numeros [3] = 93;
		numeros [4] = 123;
		numeros [5] = 952;
		numeros [6] = 344;
		numeros [7] = 233;
		numeros [8] = 622;
		numeros [9] = 8522;

		System.out.println("\nARRAY\n");
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		System.out.println("\n--------"+numeros[2]+"----------");
	
		System.out.println("---------------------");
		
	//EXEMPLO ARRAYLIST	
        String aula1 = "Array";
        String aula2 = "ArrayList";
        String aula3 = "Renan";
        String aula4 = "HashMap";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        System.out.println("\nARRAYLIST\n");
        
        for(String i: aulas){   
            System.out.println(i); 
        }
        
        System.out.println("\n--------"+aulas.get(2)+"----------");
    	
        
        System.out.println("-----------------------");
        
	//EXEMPLO HASHSET
		HashSet<String> carros = new HashSet<String>();
		
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Renan");
		carros.add("BMW");
		carros.add("Mazda");
		carros.add("Tesla");
		
		System.out.println("\nHASHSET\n");
		
		for(String i: carros){
			System.out.println(i); 
        }
		
		String[] cars = carros.toArray(new String[carros.size()]);
		
		System.out.println("\n--------"+cars[3]+"----------");
		
		
		System.out.println("-----------------------");
		
	//EXEMPLO DE HASHMAP
		Map<String,String> example = new HashMap<String,String>();
		
		example.put( "K1", ( "V1" ));
		example.put( "K2", ( "V2" ));
		example.put( "RenanChave", ( "RenanValor" ));
		example.put( "K4", ( "V4" ));
		example.put( "K5", ( "V5" ));

		System.out.println("\nHASHMAP\n");
		  
		for(String i: example.keySet()){   
		  String value = example.get(i);
          System.out.println(value);
	    }
		  
		System.out.println("\n--------"+example.get("RenanChave")+"----------");
		  
		System.out.println("----------------------------");

	}
}