Algoritmo numerosCambiados
	definir num1 como entero;
	definir num2 como entero;	
	definir aux como entero;
	escribir "Ingrese un primer numero:";
	
	leer num1;
	
	escribir "Ingrese un segundo numero:";
	
	leer num2;
	si num1 > 0 y num2 > 0 Entonces
		aux = num1;
		num1 =num2;
		num2=aux;

		Mostrar  "Su numero cambiados son num1= " num1 " y num2= " num2;		
	SiNo
		Escribir "El numero que ingreso no es valido. Debe ser de tipo entero";
	FinSi
	
FinAlgoritmo
