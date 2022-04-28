Algoritmo baseYaltura
	definir base como real;
	definir altura como real;	
	definir perimetro como real;

	
	
	
	escribir "Ingrese la base:"
	
	leer base;
	
	
	escribir "Ingrese la altura:"
	
	leer altura;
	

	
	
	si base > 0 y altura > 0 Entonces
		area = base * altura;
		perimetro = (2 * altura) + (2 * base);
		Mostrar  "el area del rectangulo es: " area;
		Mostrar  "El perimetro del rectangulo: " perimetro;
		
	SiNo
		Escribir "La medida que ingreso no es valida."
	FinSi
	
	
FinAlgoritmo
