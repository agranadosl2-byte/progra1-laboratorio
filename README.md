#progra1-laboratorio
# 📘 Ejercicio en Clase 3 – Modularización en Java
## Curso: Programación 1

---

## 🎯 Objetivo

Aplicar los conceptos de:

- Modularización mediante métodos.
- Uso correcto de variables locales y globales.
- Validación de entradas del usuario.
- Manejo básico de excepciones.
- Mejora de la organización y legibilidad del código.

---

## 📌 Instrucciones Generales

- Trabajar en parejas (**Obligatorio**).
- No utilizar IA para el análisis.
- Se proporcionará un programa base en Java.
- Analizarlo, mejorarlo y documentar el proceso en este archivo `README.md`.

---

# 🧠 Parte 1 – Análisis del Programa Original

En esta sección deben analizar el programa entregado.

## 1️⃣ Identificación de Tareas Repetitivas

Responder:

- ¿Qué partes del código pueden convertirse en métodos?
- //La primera parte del codigo donde pide al usuario ingresar una opcion esa la podriamos colocar como metodo "menu", los siguientes serian: agregarEstudiantes, listaEstudiantes,             calcularPromedio y mostrarEstudianteCalificacionMasAlta estos los convertiriamos en metodos para que el codigo se vea mas limpio y organizado.
- ¿Qué bloques de código se repiten?
- //Uno de los que vimos fue el if-else este bloque se repetia mucho y decidimos cambiarlo a un switch case para mejorarlo.
- ¿Qué responsabilidades pueden separarse?
- //Quitar tooo el codigo que esta dentro del main ya que no es practico y colocar el menu dentro del main para que sea mas optimo.

Ejemplos de posibles tareas:

- Agregar estudiante.
- Mostrar estudiantes.
- Calcular promedio.
- Mostrar estudiante con mayor calificación.

Explicar por qué dividir estas tareas mejora el programa.
- //Porque es mas practico, mejora la visibilidad de nuestro codigo, es mas facil realizar cambios y lo mas util reciclar codigo.

---

## 2️⃣ Variables Locales vs Globales

Responder:

- ¿Qué variables deberían declararse como globales (atributos `static` de la clase)?
- // Las variables que deben declararse globales son: Estudiantes, Calificaciones y scanner.
- ¿Cuáles deberían ser locales dentro de un método?
- //Las variables locales deben de ser Suma, Promedio, Nombre, Calificaciones y Maxcalificación.
- ¿Por qué?
- //Solo nos serán de ayuda en momentos específicos donde las necesitemos como por ejemplo a la hora de usar una variable como lo seria Suma.

Reflexionar sobre:

- Alcance (scope)
- Tiempo de vida de la variable
- Riesgos de modificar datos globales accidentalmente
- //Solo se inician cuando entramos al método en el cuál las necesitaremos y termina al salir de ese método. Uno de los riesgos seria que el código empiece a fallar por la estructuración y funcionalidad que daba esa variable global.
---

# 🏗️ Parte 2 – Modularización del Programa

Reestructurar el programa aplicando modularización:

- Crear métodos claros y específicos.
- Cada método debe tener una sola responsabilidad.
- Todos los métodos deben ser llamados desde `main`.
- Mantener el programa completamente funcional.

No es obligatorio usar nombres específicos, pero deben ser descriptivos.

Ejemplo de buenas prácticas:

- Un método = una responsabilidad.
- No mezclar múltiples tareas en un mismo método.
- Mantener el código ordenado e indentado.

---

# 🔐 Parte 3 – Validaciones y Manejo de Excepciones

Implementar mejoras en el programa:

- Validar entradas numéricas.
- Evitar que el programa falle si el usuario ingresa texto en lugar de números.
- Verificar que las calificaciones estén en un rango válido.
- Usar `try-catch` cuando sea necesario.

Explicar en esta sección:

- Qué errores podrían ocurrir.
- // Errores encontramos varios, uno de ellos fue en el metodo de menu encontramos que cuando el usario enviaba un numero mayor a 5 o que no fuera valor numerico nos daba instantaneamente eror, lo corregimos con try-catch y un do-wihle, otro error fue cuando ingresan un estudiante, vi que podia simplemente agregar "ae" como nombre y valores numericos "1234" y los daba por nombres reales lo corregi usando un if y un comando que solo permitia letras, asi mismo encontramos errores como en calificacion, el problema era que el usuario podia agregar una calificacion mayor a 100 y colocar numeros negativos, los corregimos con try-catch y while.
- Qué validaciones implementaron.
- // try-catch, do-while, if y .matches
- Por qué son importantes.
- Para que no hayan errores a la hora de ejecutar el programa, porque mas de alguna vez puede escribir el usuario una letra en vez de un numero en el programa y este de error y el usuario no pueda realizar nada.

---

# 🧩 Parte 4 – Preguntas de Reflexión

Responder con sus propias palabras.

## 1️⃣ ¿Qué ventajas tiene dividir el código en métodos?

Reflexionar sobre:

- Organización
- Reutilización
- Mantenimiento
- Claridad
- //Tenemos una mejor estructuración del código ya que se dividen en pequeños segmentos y si necesitamos una pequeña parte del código de un método para otro similar solo es buscar ese método y poder usarlo en el que necesitemos y si llegase a ver algún error es más fácil solucionarlo ya que únicamente afecta a un método y no a todos y cada uno de los métodos tiene su función entonces es fácil de entender que es lo que hacen.
---

## 2️⃣ ¿Por qué no es recomendable usar muchas variables globales?

Reflexionar sobre:

- Posibilidad de errores inesperados
- Dificultad para depurar
- Dependencia entre métodos
- //El programa puede ser algo difícil de entender por demasiadas variables y cuando las variables son globales al surgir errores en el programa suelen ser difíciles de encontrar ya que a veces los métodos suelen modificar esas variables y eso hace que se creen dependencias innecesarias y ocasiona errores en nuestro código.

---

## 3️⃣ ¿Cómo mejora la modularización la legibilidad del código?
- //Nos ayuda limpiando el codigo y mejorando la vision ya que divide el codigo en partes pequeñas y optimizando el programa.
---

# 📦 Entregables

## 1️⃣ Código Java

- Archivo `Main.java`.
- Modularizado correctamente.
- Funcional.
- Con validaciones básicas.
- Ordenado y bien indentado.

---

## 2️⃣ Este archivo `README.md`

Debe contener:

- Análisis del programa original.
- Decisiones de modularización.
- Justificación de variables locales y globales.
- Respuestas a las preguntas guía.
- Explicación de validaciones implementadas.

---

# 📊 Criterios de Evaluación

| Criterio | Puntos |
|----------|--------|
| Programa funciona correctamente | 30 |
| Modularización adecuada | 25 |
| Uso correcto de variables locales y globales | 15 |
| Validaciones implementadas | 15 |
| Calidad del README | 15 |
| **Total** | **100 puntos** |



