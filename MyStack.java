package Bloque3;

public class MyStack {
	char[] stack = new char[25];
	char[] reversed = new char[25];
	String palabraInversa = "";
	int top = 0;
	int MAX = stack.length;
	char poppedLetter;
	int i=0;
	
	public void push(char letra) {
		if(top == stack.length) {
			System.out.println("Stack is full");
		}
		else {
			
			stack[top] = letra;  
			top = top+1;
		}
	}
	

	public char pop() { 

		if(top == 0) {
			System.out.println("Stack is empty");
			return ('#'); 
		}
		else { 
			top = top-1; 
			poppedLetter = stack[top];
			stack[top] = ' ';
			return (poppedLetter);  
		}
	
	}
	
	public String reverse (String cadena) {
		
		for(i = 0; i <= cadena.length()-1; i++){
				push(cadena.charAt(i));
		}
		
		for(i = 0; i <= cadena.length()-1; i++){
			reversed[i] = stack[cadena.length()-1-i];
		}
		
		for(i = 0; i <= cadena.length()-1; i++){
			palabraInversa += reversed[i];
		}
		
		return (palabraInversa);
	}

	public boolean revisarPalindromo(String cadena) {
	 	cadena = cadena.toLowerCase();
	 	String palabra = "";
	 	
		boolean respuesta;
		
			if(cadena.contains(" ")) {
				int i = 0;	
				String[] splitString = cadena.split(" ");
				
				for(i = 0; i <= splitString.length - 1; i++){
					palabra = palabra + splitString[i];
				}
	
				
				
				palabraInversa =(reverse(palabra));
				
				
				if(palabra.equals(palabraInversa)) {
	
					respuesta = true;
				}
				else {
					respuesta = false;

				}
			}
			
			else{
				palabra = cadena;
				
				
				palabraInversa =(reverse(palabra));

				
				if(palabra.equals(palabraInversa)) {
	
					respuesta = true;
				}
				else {
					respuesta = false;

				}
			}
			System.out.println(respuesta);
		return(respuesta);
 }

	
	
}