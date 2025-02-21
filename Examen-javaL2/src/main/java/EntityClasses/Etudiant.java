/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntityClasses;

/**
 *
 * @author HP
 */
   public class Etudiant {
    public int matricule = 001;
    public String prenom = "ali";
    public String nom = "faye";
    public int age = 20;
    public int idfiliere = 11;
    
    // Constructeur avec parametres
    public Etudiant (int matricule, String prenom, String nom, int age, 
            int idfiliere){
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.idfiliere = idfiliere;
    
    }
    // Constructeur sans parametre
    public Etudiant(){
    }
    // La méthode getter
      public int getMatricule(){
        return matricule;
    }
    public String getPrenom() {
	return prenom;
    }
    public String getNom() {
	return nom;
    }
    public int getAge() {
	return age;
    }
    public int IdFiliere() {
	return idfiliere;
    }
    // La méthode setter
     public void setmatricule(int matricule){
        this.matricule=matricule;
    }
    public void setprenom(String prenom){
	this.prenom=prenom;
    }
    public void setnom(String nom){
	this.nom=nom;
    }
    public void setage(int age){
	this.age=age;
    }
    public void setidFiliere(int idFiliere){
	this.idfiliere=idFiliere;
    }
}
    public static void main (String []args) {

}
    

    
