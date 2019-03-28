package model;
import java.util.ArrayList;

public class Pet{

	//COnstant

	public final static String DOG = "Perro";
	public final static String CAT = "Gato";
	public final static String BIRD = "Ave";
	public final static String OTHER = "Otro";

	//Atributes
	private String namePet;
	private int ageOfPet;
	private String typeOfPet;
	private double weightPet;

  //Relations
	private ArrayList<ClinicalHistory> clientWithHisto;



	//Constructor
	public Pet(String namePet , int ageOfPet , String typeOfPet, double weightPet){
		this.namePet = namePet;
		this.ageOfPet = ageOfPet;
		this.typeOfPet = typeOfPet;
		this.weightPet = weightPet;
		clientWithHisto = new ArrayList<ClinicalHistory>();

	}

	public String getNamePet(){
		return namePet;
	}

	public void setNamePet(String namePet){
		this.namePet = namePet;
	}

	public int getAgeOfPet(){
		return ageOfPet;
	}

	public void setAgeOfPet(int ageOfPet){
		this.ageOfPet = ageOfPet;
	}

	public String getTypeOfPet(){
		return typeOfPet;
	}

	public void setTypeOfPet(){
		this.typeOfPet = typeOfPet;
	}

	public double getWeightPet(){
		return weightPet;
	}

	public void setWeightPet(){
		this.weightPet = weightPet;
	}
	public ArrayList<ClinicalHistory> getClientWithHisto(){
 	 return clientWithHisto;
  }
	public void setClientWithHisto(ArrayList<ClinicalHistory> clientWithHisto){
	 this.clientWithHisto = clientWithHisto;
	}
  public void setPets(ArrayList<ClinicalHistory> clientWithHisto){
 	 this.clientWithHisto = clientWithHisto;
  }
//Show info of pets
 public String showInfoPet(){
 	String msj = "===========================================================================================================================================\nname:" + namePet + "\nedad:" + ageOfPet + "\npeso:" + weightPet + "\ntipo:" + typeOfPet + "\n===========================================================================================================================================\n";
	return msj;

		}

//Add clinic histories
		public void addMedRec(ClinicalHistory newMedRec, Medicament medic){

					newMedRec.setPetInfo(showInfoPet());
					clientWithHisto.add(newMedRec);

					clientWithHisto.get((clientWithHisto.size()-1)).addMedicaments(medic);

				}
//Add Hospitalization
	public double costOfHospitalizate(String typeAnimal, double weight,int actualDay, int actualMonth, int actualYear){

				double total = 0.0;

				for(int i = 0; i < clientWithHisto.size(); i++){
					int diasPreciso = clientWithHisto.get(i).daysInHospitalization(actualDay, actualMonth, actualYear);
					double medicamentCost = clientWithHisto.get(i).medicamentCosts();

				if(typeAnimal.equals(CAT)){
					if(weight >= 1.0 && 3.0 <= weight){
						total += (double) (diasPreciso * 10000)+ medicamentCost;
					}else if(weight >= 3.1 && 10.0 <= weight){
						total += (double) (diasPreciso* 12000)+ medicamentCost;
					}else if(weight >= 10.1 && 20.0 <= weight){
						total += (double) (diasPreciso * 15000)+ medicamentCost;
				 }else if(weight > 20.0 ){
					 total +=(double) (diasPreciso * 20000)+ medicamentCost;
				 }
				} else if(typeAnimal.equals(DOG)){
					if(weight>= 1.0 && 3.0 <= weight){
						total += (double) (diasPreciso * 15000)+ medicamentCost;
					}else if(weight >= 3.1 && 10.0 <= weight){
						total += (double)(diasPreciso * 17000)+ medicamentCost;
					}else if(weight >= 10.1 && 20.0 <= weight){
						total += (double) (diasPreciso * 20000)+ medicamentCost;
				 }else if(weight > 20.0 ){
					 total += (double) (diasPreciso * 25000)+ medicamentCost;
				 }

				}else if(typeAnimal.equals(BIRD)){
					if( weight >= 1.0 && 3.0 <= weight){
						total += (double) (diasPreciso * 10000)+ medicamentCost;
					}else if(weight >= 3.1 && 10.0 <= weight){
						total +=(double)  (diasPreciso * 12000)+ medicamentCost;
					}else if(weight >= 10.1 && 20.0 <= weight){
						total += (double) (diasPreciso * 20000)+ medicamentCost;
				 }else if(weight > 20.0 ){
					 total +=(double) (diasPreciso * 25000)+ medicamentCost;
				 }

				}else if(typeAnimal.equals(OTHER)){
					if( weight >= 1.0 && 3.0 <= weight){
						total += (double)  (diasPreciso * 10000)+ medicamentCost;
					}else if(weight >= 3.1 && 10.0 <= weight){
						total += (double) (diasPreciso * 17000)+ medicamentCost;
					}else if(weight >= 10.1 && 20.0 <= weight){
						total += (double) (diasPreciso * 30000)+ medicamentCost;
				 }else if(weight > 20.0 ){
					 total += (double) (diasPreciso * 30000)+ medicamentCost;
				  }

				 }
				}
				return total;

				}
//Show hospitalization
	public String showHospitalization(){
			String msj = "";
			int k =0;

			for(int i= 0; i < clientWithHisto.size(); i++){
			++k;
			msj += "===========================================================================================================================================\nname:" + namePet + "\nedad:" + ageOfPet + "\npeso:" + weightPet + "\ntipo" + typeOfPet + "\nHisto" + k + clientWithHisto.get(i).infoAnimalHistory()+"===========================================================================================================================================";
			}
			 return msj;


			}
//Show INFO OF PET HOSPITALIZAED
	public String showInfoPetHospit(){
			String msj = "";

			for(int k = 0; k  < clientWithHisto.size(); k++){
				msj = "===========================================================================================================================================\nnombre:" + namePet + "\nedad:" + ageOfPet + "\npeso:" + weightPet + "\ntipo:" + typeOfPet + "\nanimal:" + clientWithHisto.get(k).infoAnimalHistoryHospi() + "===========================================================================================================================================\n";
					}
				 return msj;
		}

}
