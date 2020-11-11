/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan47.nilaimahasiswa;

/**
 *
 * @author RYP
 */
public class Nilai {
     private double quiz;
     private double uts;
     private double uas;
    
    public Nilai(double quiz, double uts, double uas){
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }
    
    public double getQuiz(){
     return quiz;   
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }
    
    public double hitungNilaiAkhir(double parQuiz, double parUts, double parUas){
        return (0.2*parQuiz)+(0.3*parUts)+(0.5*parUas);
    }
    
    public char aturanIndex(){
        double nA = hitungNilaiAkhir(quiz, uts, uas);
        if (nA <= 100 && nA >= 80){
            return 'A';
        } else if (nA < 80 && nA >= 68){
            return 'B';
         } else if (nA < 68 && nA >= 56){
                return 'C';
           } else if (nA < 56 && nA >= 45){
                return 'D';
            } else {
                  return 'E';
              }
    }
    
    public String aturanKetarangan(){
       switch(aturanIndex()){
           case 'A' : return "Sangat Baik";
           case 'B' : return "Baik";
           case 'C' : return "Cukup";
           case 'D' : return "Kurang";
           default : return "Sangat Kurang";
       } 
    }
}
