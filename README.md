# progra1-laboratorio
#Ejercicio en Clase 3 – Modularización en Java
#Curso: Programación 1
#Parte 1 – Análisis del Programa Original
#En esta sección deben analizar el programa entregado.
#1️⃣ Identificación de Tareas Repetitivas
#Responder:
#¿Qué partes del código pueden convertirse en métodos?
#//La primera parte del codigo donde pide al usuario ingresar una opcion esa la podriamos colocar como metodo "menu", los siguientes serian: agregarEstudiantes, #listaEstudiantes, calcularPromedio y mostrarEstudianteCalificacionMasAlta estos los convertiriamos en metodos para que el codigo se vea mas limpio y organizado.
#¿Qué bloques de código se repiten?
#//Uno de los que vimos fue el if-else este bloque se repetia mucho y decidimos cambiarlo a un switch case para mejorarlo.
#¿Qué responsabilidades pueden separarse?
#//Quitar tooo el codigo que esta dentro del main ya que no es practico y colocar el menu dentro del main para que sea mas optimo.
#
#Ejemplos de posibles tareas:
#Agregar estudiante.
#Mostrar estudiantes.
#Calcular promedio.
#Mostrar estudiante con mayor calificación.
#Explicar por qué dividir estas tareas mejora el programa.
#//Porque es mas practico, mejora la visibilidad de nuestro codigo, es mas facil realizar cambios y lo mas util reciclar codigo.
#
#2️⃣ Variables Locales vs Globales
#Responder:
#¿Qué variables deberían declararse como globales (atributos static de la clase)?
#//
#¿Cuáles deberían ser locales dentro de un método?
#//
#¿Por qué?
#//
#Reflexionar sobre:
#
#Alcance (scope)
#Tiempo de vida de la variable
#Riesgos de modificar datos globales accidentalmente
#//
