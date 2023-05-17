# Projecte fonaments de gestió de fitxers UF3, per Jan Plata

He dividit la documentació en dues seccions per a poder resumir el projecte en la memòria i donar informació detallada sobre el funcionament d'aquest a la documentació tècnica (**Enllaços als títols de secció**). Resumidament, aquest projecte ha consistit en fer un programa amb un Plain Old Java Object (POJO) i mètodes CRUD fent servir lectura/escriptura de fitxers binaris per a obtindre persistència de dades dintre d'aquest programa.

### 1.[Creació del POJO i estructura del programa:](./PojoEstructura.md)
Primerament, he començat donant forma als aspectes bàsics del meu POJO com serien els paràmetres que el constitueixen, els tipus de dades que el conformaran i l'estructura que tindrà:

![image](https://user-images.githubusercontent.com/96839905/221435026-d016d07a-89ec-451d-a6d8-012cba10b353.png)

He programat els getters/setters dels paràmetres del POJO :

![image](https://user-images.githubusercontent.com/96839905/221435016-eaa5fb1b-c124-4a81-9709-0ea7deac5eb2.png)

Seguidament, he creat el Main del projecte fent el menú de consola tenint les diferents opcions del CRUD amb el que l'usuari interactuarà:

![image](https://user-images.githubusercontent.com/96839905/221435245-e1b8806c-b2cc-4e4f-88b3-a40170dc7fb2.png)

### 2.[Creació del CRUD i els mètodes d'aquest.](./CRUD.md)

Un cop creat el menú amb les opcions i el loop switch amb les crides als mètodes he creat la classe del CRUD i els mètodes pertinents:

![image](https://user-images.githubusercontent.com/96839905/221435414-52ab206c-1407-4fe2-bdcd-6ba9f66c53b4.png)

### 3.[Tractament d'excepcions del projecte](./TractamentExcepcions.md)

Per a què les excepcions no forcessin la tancada del programa he fet servir un bucle "while" i una variable de control anomenada validInput a cada try/catch, d'aquesta forma assegurant el correcte funcionament de cada mètode demanant l'entrada reiteradament en cas de ser incorrecta a qualsevol dels inputs dels mètodes:

![image](https://user-images.githubusercontent.com/96839905/221434790-b489b218-6b93-4c1e-9871-72d7516e9d42.png)

### 4.[Persistència de dades en arxius binaris.](./PersistenciaDades.md)

Un cop finalitzat el "troubleshooting" als mètodes he creat la persistència de dades a un arxiu binari de forma que puguem recuperar les dades de l'anterior sessió a una classe anomenada EscripturaLectura que consisteix en un mètode per a guardar les dades al sortir i un altre per a recuperar-les a l'iniciar el programa:

![image](https://user-images.githubusercontent.com/96839905/221435971-6ecfa938-0ae7-4f71-91cb-2e3e4f894a3a.png)

### Conclusió

En el transcurs d'aquest projecte he après sobre tractament d'excepcions per a evitar parades i mals funcionaments als mètodes/codi del programa. He après sobre les classes de lectura i escriptura de dades en arxius binaris i sobre com persistir informació del meu programa en aquests. Malgrat que no he pogut fer la part de la GUI crec que ha sigut un projecte molt interessant i proactiu a l'hora d'aprendre a gestionar excepcions i errors del codi.
