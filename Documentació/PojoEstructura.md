## Persistència de dades en arxius binaris.

En aquest apartat tractaré el fitxer LecturaEscriptura del projecte i la part de persistència de dades, que consisteix en dos mètodes per a realitzar les funcions de recuperació (sessió anterior) i guardat de dades (sessió actual):

El mètode **guardarDades()** utilitza un objecte de tipus FileOutputStream per escriure les dades al fitxer i un objecte de tipus DataOutputStream per escriure les dades en un format que pugui ser interpretat pel mètode "recuperarDades()".

El mètode també fa servir un bucle "for" per recórrer tots els objectes "Sushi" al vector i escriure els valors de cada propietat al fitxer utilitzant els mètodes de DataOutputStream per escriure els valors de les propietats "nomSushi", "peixContingut", "numIngredients", " gramsProteina", "umamiRate" i "isVeggie", respectivament.

![image](https://user-images.githubusercontent.com/96839905/221443474-bdcb2d72-2903-4778-8720-5b72281c38d7.png)

El mètode **recuperarDades()** té com a propòsit recuperar les dades del fitxer "sushi.dat" i carregar-les en un vector d'objectes del nostre POJO "Sushi". El mètode fa servir un objecte de tipus FileInputStream per llegir les dades del fitxer binari i un objecte de tipus DataInputStream per interpretar les dades llegides al fitxer.

El mètode fa servir un bucle "while" per llegir tots els objectes "Sushi" al fitxer. Després, les dades de cada objecte llegit s'assignen a les propietats corresponents d'un nou objecte "Sushi" i s'afegeix a un vector d'objectes "Sushi". El comptador s'incrementa a cada iteració del bucle per mantenir un registre indexat de la quantitat d'objectes "Sushi" al vector.

![image](https://user-images.githubusercontent.com/96839905/221442911-ab3d973f-6c23-4a45-a33c-9bd72dc489a3.png)
