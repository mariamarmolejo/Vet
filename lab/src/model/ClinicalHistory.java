package model;
import java.util.ArrayList;

public class ClinicalHistory{

//ConstanT

private final static boolean STATE_OPEN = true;
private final static boolean STATE_CLOSE = false;

//AtributEs
private String petInfo;
private String ownerInfo;
private String symptom;
private String diagnostic;
private boolean state;


//RelaTIONS
private ArrayList<Medicament> medicaments;
private HistorialDated date1;
private HistorialDated date2;
private Pet petsAll;

//ConstructOR

public ClinicalHistory(String petInfo, String ownerInfo,String symptom, String diagnostic, boolean state, HistorialDated date1, HistorialDated date2,Pet petsAll){

  this.symptom = symptom;
  this.diagnostic = diagnostic;
  this.state = state;
  this.date1 = date1;
  this.date2 = date2;
  medicaments = new ArrayList<Medicament>();
  }
public String getPetInfo(){
  return petInfo;
}
public void setPetInfo(String petInfo){
  this.petInfo = petInfo;
}
public String getOwnerInfo(){
  return ownerInfo;
}
public void setOwnerInfo( String ownerInfo){
  this.ownerInfo = ownerInfo;
}
public String getSymptom(){
  return symptom;
}
public void setSymptom(String symptom){
  this.symptom = symptom;
}
public String getDiagnostic(){
  return diagnostic;
}
public void setDiagnostic(String diagnostic){
  this.diagnostic = diagnostic;
}
public boolean getState(){
  return state;
}
public void setState(boolean state){
  this.state = state;
}
public HistorialDated getDate1(){
  return date1;
}
public void setDate1(HistorialDated date1){
  this.date1 = date1;
}
public HistorialDated getDate2(){
  return date2;
}
public void setDate2(HistorialDated date2){
  this.date2 = date2;
}
public ArrayList<Medicament> getMedicaments(){
 return medicaments;
}
public void setMedicaments(ArrayList<Medicament> medicaments){
 this.medicaments = medicaments;
}
public Pet getPetsAll(){
  return petsAll;
}
public void setPetsAll(Pet petsAll){
  this.petsAll = petsAll;
}

//shOW INITIAL DATA
public String inicialDate1(){
  String msj = "";

  msj += date1.getDay() +"\n" + date1.getMonth() +"\n"+ date1.getYear();

  return msj;
  }
//show final date
public String finalDate2(){
  String msj = "";

  msj += date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear();

  return msj;
}
//Show info of the animal
public String infoAnimalHistory(){
  String msj = "===========================================================================================================================================\nsintomas:" + symptom+"\ndiagnostico:" + diagnostic+"\nfecha inicial:" + inicialDate1()+"\nfecha de Salida:"  + finalDate2()+"===========================================================================================================================================\n";
    for(int i = 0; i< medicaments.size(); i++){
  msj += medicaments.get(i).showInfoMedica();
  }
  return msj;

}

public String infoAnimalHistoryHospi(){
    String msj = "===========================================================================================================================================\nsintomas es:" + symptom+"diagnostico:" + diagnostic+"\nfecha inicial es:" + inicialDate1()+"\nfecha de Salida es:"  + finalDate2()+"===========================================================================================================================================";
      for(int i = 0; i< medicaments.size(); i++){
    msj += medicaments.get(i).showInfoMedica();
  }
    return msj;

  }

//Add medicine
public void addMedicaments(Medicament medic){

  medicaments.add(medic);

}

//Cost by hospitalization
public int daysInHospitalization(int actualDay, int actualMonth, int actualYear){
  int i =0;

  i += date1.getFrecuencyOfTheMedicament(actualDay, actualYear, actualYear);

  return i;
  }

public double medicamentCosts(){
  double doseXcost = 0.0;

  for(int i = 0; i < medicaments.size(); i++){
  doseXcost += medicaments.get(i).calculatedDose();

  }
   return doseXcost;
  }


}
