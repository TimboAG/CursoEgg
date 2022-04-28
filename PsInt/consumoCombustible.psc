Algoritmo consumoCombustible
	definir litros como real;
	definir kilometros como real;	
	definir consumo como real;
	
	escribir "Ingrese la cantidd de combustible que cargo en litros:"
	
	leer litros;
	
	escribir "Ingrese la cantidd de kilometros a recorrer:"
	
	leer kilometros;

	
	
	
	si litros > 0 Entonces
		
		consumo = kilometros / litros;

		Mostrar  "Su consumo sera de " consumo " litros por km";	
		
	SiNo
		Escribir "La medida que ingreso no es valida. Debe ser al menos 1 litro"
	FinSi
	
FinAlgoritmo
