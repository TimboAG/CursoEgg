Algoritmo Medidas
	
	definir medida como real;
	definir cm como real;	
	definir milimetro como real;
	definir pulgada como real;

	
	
	escribir "Ingrese la medida en metros que desea convertir:"
	
	leer medida;
	
	

	
	
	si medida > 0 Entonces
		cm = medida * 100;
		milimetro = medida * 1000;
		
		pulgada = medida * 39.3701;
		Mostrar  "Su medida en cm es: " cm;
		Mostrar  "Su medida en milimetro es: " milimetro;
		Mostrar  "Su medida en pulgadas es: " pulgada;		
	SiNo
		Escribir "La medida que ingreso no es valida. Debe ser al menos 1 mt"
	FinSi
	
	
	
	
	
FinAlgoritmo
