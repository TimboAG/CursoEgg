Algoritmo sin_titulo
	
	definir cantidadA Como Entero
	definir i Como Entero
	definir notaTpIntegrador Como Real
	definir nombre Como Caracter
	Definir  notaExposicion Como Real
	definir notaParcial Como Real
	definir promedioFinal Como Real
	definir unaPersonaDesaprobada Como Caracter
	definir unaPersonaAprobada Como Caracter
	definir porcentajeAlumnosMayorIntegrador Como real
	definir porcentajeAlumnosMenorIntegrador como real
	definir notaMayorExp Como Real
	definir totalEstudiantesParcial como real
	definir totalAlumnos Como Caracter
	
	
	Escribir "Ingrese cantidad de alumnos"
	leer cantidadA
	
	
	notaTpIntegrador = 0
	notaExposicion = 0
	notaParcial = 0
	promedioFinal = 0
	unaPersonaDesaprobada = ""
	unaPersonaAprobada = ""
	porcentajeAlumnosMayorIntegrador = 0
	porcentajeAlumnosMenorIntegrador = 0
	notaMayorExp = 0
	totalEstudiantesParcial = 0
	totalAlumnos = ""
	
	
	Para i = 1 Hasta cantidadA Con Paso 1 Hacer
		
		Escribir "Ingrese el nombre del alumno"
		leer nombre
		
		Escribir "Ingrese la nota del trabajo práctico Integrador"
		leer notaTpIntegrador
				
		Si notaTpIntegrador > 7.5 Entonces
			porcentajeAlumnosMayorIntegrador = porcentajeAlumnosMayorIntegrador + 1 
		SiNo
			porcentajeAlumnosMenorIntegrador = porcentajeAlumnosMenorIntegrador + 1 

		Fin Si
		
		
		Escribir "Ingrese la nota de exposicion "
		leer notaExposicion
		
		      
		Si notaMayorExp < notaExposicion Entonces
			notaMayorExp = notaExposicion
		
		
		Fin Si
		
		
		Escribir "Ingrese la nota del parcial"
		leer notaParcial
		
		Si notaParcial >= 4.0 y  notaParcial <= 7.5 Entonces
			totalEstudiantesParcial = totalEstudiantesParcial + 1	
		Fin Si
		
		
		
		
		promedioFinal =  (notaTpIntegrador + notaExposicion + notaParcial) / 3
		
		Si promedioFinal <  6.5 Entonces
			unaPersonaDesaprobada = unaPersonaDesaprobada + "El alumno " + nombre + " Reprobo  su nota final es: " + ConvertirATexto(promedioFinal) + "            " 
		SiNo
			unaPersonaAprobada = unaPersonaAprobada + "El alumno " + nombre + " Aprobo  su nota final es: " + ConvertirATexto(promedioFinal) + "            "
		Fin Si
		
		
		totalAlumnos = totalAlumnos + "El alumno " + nombre + " Su nota de integrador es: " + ConvertirATexto(notaTpIntegrador) + " Su nota de Exposicion es: " +  ConvertirATexto(notaExposicion) +  " Su nota de parcial es: " + ConvertirATexto(notaParcial) + "                       "
		
		
	Fin Para
	
	
	porcentajeAlumnosMayorIntegrador = (porcentajeAlumnosMayorIntegrador * 100) / cantidadA
	porcentajeAlumnosMenorIntegrador = (porcentajeAlumnosMenorIntegrador * 100) / cantidadA
	escribir "Total de alumnos --->> " cantidadA
	escribir totalAlumnos	
	escribir "Personas desaprobadas --->>  " unaPersonaDesaprobada + "     " 
	escribir "Personas aprobadas  --->> " unaPersonaAprobada + "     " 
	escribir " porcentaje Alumnos Mayor Integrador  --->> " porcentajeAlumnosMayorIntegrador
	escribir " porcentaje Alumnos Menor Integrador  --->> " porcentajeAlumnosMenorIntegrador	
	escribir "La nota mayor de exposicion es ----->> " notaMayorExp
	escribir "Total de estudiantes con nota de Parcial entre 4.0 y 7.5 ----->> " totalEstudiantesParcial
	
FinAlgoritmo



//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:
		//§ Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
	    //reprueba el curso si tiene una nota final inferior a 6.5
		//§ Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
		//§ La mayor nota obtenida en las exposiciones.
		//§ Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
		//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//las 3 notas y calculará todos informes claves que requiere el docente.

//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//las 3 notas y calculará todos informes claves que requiere el docente.