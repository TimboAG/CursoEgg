Algoritmo unidadDecenaCentena
	
	definir unidad Como entero;
	definir decena como entero;
	definir centena Como entero;
	definir num como entero;
	definir resto Como entero;
	
	Escribir "Escriba un numero de 3 cifras:";
	leer num;
	
	
	si num > 99 y num < 1000 Entonces
		
		centena =  (num - (num MOD 100))/100;
		resto = num MOD 100;
		decena= (resto - (resto MOD 10))/10;
		unidad = resto MOD 10;
		
		Mostrar  "CENTENA:" centena;
		Mostrar  "DECENA:" decena;		
		Mostrar  "UNIDAD:" unidad;		
		
	SiNo
		escribir "El numero no es valido, debe ser un numero de 3 cifras.";
 	FinSi
	
	
	
FinAlgoritmo
