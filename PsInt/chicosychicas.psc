Algoritmo chicosychicas
	
	
	definir chicos como entero;
	definir chicas como entero;	
	definir porcentajeChicos como entero;
	definir porcentajeChicas como entero;
	definir suma como entero;


	escribir "Ingrese el total de niños:";
	
	leer chicos;
	
	escribir "Ingrese el total de niñas:";
	
	leer chicas;	
	
	si chicas > 0 y chicos > 0 Entonces
		suma = chicos + chicas;
		porcentajeChicas = (chicas / suma) *100  ;
		porcentajeChicos= (chicos / suma) * 100 ;
		
		Mostrar  "El porcentahe de chicos que hay en el curso es " porcentajeChicos "% y el porcentaje que hay de chicas en el curso es " porcentajeChicas "%";		
	SiNo
		Escribir "El numero que ingreso no es valido. Debe ser de tipo entero";
	FinSi
	
	
	
FinAlgoritmo
