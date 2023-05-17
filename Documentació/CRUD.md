 Creació del CRUD i els mètodes d'aquest.

En aquest apartat parlaré sobre com he creat els mètodes CRUD per a que s'adaptessin a l'estructura i funcionament del POJO creat anteriorment.

Per a mantenir un registre/índex sobre els objectes dintre del vector he fet servir la variable global "contador" de manera que cada vegada que es cree o esborri algun objecte aquest valor determini la seva posició al vector.

## Mètode crearSushi

Aquest mètode omplirà tot el vector de l'objecte Sushi demanant per consola els setters de cada propietat de l'objecte:

![image](https://user-images.githubusercontent.com/96839905/221445880-2c76d3eb-3ba4-45ed-81bf-b38cbca718df.png)

## Mètode llegirSushi

Aquest mètode llegirà tots els objectes existents del vector "Sushi" i les seves respectives propietats, en cas de no tenir dades que llegir ho notificarà a l'usuari.

![image](https://user-images.githubusercontent.com/96839905/221445440-3b8e6a24-7be8-4e04-9906-5df61ba261f7.png)

## Mètode modificarSushi

Aquest mètode sobreescriurà tots els paràmetres de l'objecte indicat dintre del vector segons el seu ìndex(contador).

![image](https://user-images.githubusercontent.com/96839905/221445669-31db83c6-8a35-4780-a268-0a5fe0a55ea8.png)

## Mètode borrarSushi

Aquest mètode esborrarà un objecte del vector i mourá les posicions dels objectes posteriors si cal, en cas de no haber dades a al vector o a l'index seleccionat es notificarà a l'usuari.

![image](https://user-images.githubusercontent.com/96839905/221445727-86eb814f-ecb3-4b4a-8766-eb26c0738567.png)
