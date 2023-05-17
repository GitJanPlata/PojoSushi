# Tractament d'excepcions al projecte

Durant la realització d'aquest projecte he tingut que tractar varies Excepcions per a fer que les entrades de dades fossin el mes correctes possibles i no interrompissin el funcionament del programa.

Com he esmentat a la documentació principal he fet servir un bucle "while" amb una condició booleana per a reiterar la petició de dades en cas de que donés com a resultat una excepció al bloc try/catch. En els seguents punts explicarè les excepcions/problemes trobats i com els he sol·lucionat amb els blocs try/catch.

## Tractament excepcions als mètodes CRUD i menú CRUD.
Per a evitar que s'intrudïs un número mes alt que les opcions permeses o negatiu al menú i aparegués l'excepció "InputMismatchException" he creat els seguents blocs:

![image](https://user-images.githubusercontent.com/96839905/221444223-17bb928e-577b-4d63-8a94-bb491935cb59.png)

Per a evitar que els valors numèrics introduïts per a navegar dintre dels mètodes que ho necessitessin (Create, Update, Delete) he fet servir les següents blocs try/catch per evitar valors no permesos:

![image](https://user-images.githubusercontent.com/96839905/221444549-ae565a73-cd6b-46ac-b59c-c7a769d530b6.png)

He fet servir el mateix bloc per a cada input de dades canviant la variable inicialitzada al principi abans de cada bloc per a settejarla amb el valor correcte al final dels blocs try/catch.

## Tractament excepcions als mètodes de persistència de dades.

Per a tractar les excepcions "IOException" d'escriptura/lectura de dades als mètodes de persistència de dades he fet servir els següents blocs per a notificar a l'usuari. (al mètode de recuperarDades he seguit el mateix procediment canviant els paràmetres del bucle).

![image](https://user-images.githubusercontent.com/96839905/221445143-9afe8cb4-af40-48bc-8d4a-e2e1ff49e661.png)
