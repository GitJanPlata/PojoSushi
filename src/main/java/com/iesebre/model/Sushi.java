package com.iesebre.model;

import java.io.*;
/**
 * Aquesta classe és on s'instancien els paràmetres del POJO i els seus getters/setters.
 */
public class Sushi implements Serializable {
    String nomSushi;
    String peixContingut;
    int numIngredients;
    double gramsProteina;
    char umamiRate;
    boolean isVeggie;

    //He fet funcions per a crear els getters i setters de cada variable.
        public String getPeixContingut(){
        return peixContingut;
        }
        public void setPeixContingut(String peixContingut){
            this.peixContingut=peixContingut;
        }
        public int getNumIngredients(){
            return numIngredients;
        }
        public void setNumIngredients(int numIngredients){
            this.numIngredients=numIngredients;
        }
        public double getGramsProteina(){
            return gramsProteina;
        }
        public void setGramsProteina(double gramsProteina){
            this.gramsProteina=gramsProteina;
        }
        public char getUmamiRate(){
            return umamiRate;
        }
        public void setUmamiRate(char umamiRate){
           this.umamiRate=umamiRate;
        }
        public boolean getIsVeggie(){
            return isVeggie;
        }
        public void setIsVeggie(boolean isVeggie){
            this.isVeggie = isVeggie;
        }
        public String getNomSushi(){
            return nomSushi;
        }
        public void setNomSushi(String nomSushi){
        this.nomSushi= nomSushi;
        }

    }

