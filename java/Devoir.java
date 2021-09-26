import java.util.*;

public class Devoir {
    public String nom;
    public String description;
    public Date deadline;
    public double nbpoints;

    public Devoir(String n, String des, Date dl, double p) {
        this.nom = n;
        this.description = des;
        this.deadline = dl;
        this.nbpoints = p;
    }

    private void getnom(){
        return this.nom;
    }

    private void setnom(String n){
        this.nom = n;
    }

    private void getdescription(){
        return this.description;
    }

    private void setdescription(String des){
        this.description = des;
    }

    private void getdeadline(){
        return this.deadline;
    }

    private void setdeadline(String dl){
        this.deadline = dl;
    }

    private void getnbpoints(){
        return this.nbpoints;
    }

    private void setnbpoints(double p){
        this.nbpoints = p;
    } 
}