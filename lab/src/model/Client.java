package model;
import java.util.ArrayList;

public class Client{

//Atributes
private String nameClient;
private int identify;
private String address;
private int cellPhone;

//Relations
private ArrayList<Pet> pets;

	public Client(String nameClient,int identify, String address , int cellPhone){

		this.nameClient = nameClient;
		this.identify = identify;
		this.address= address;
		this.cellPhone = cellPhone;
	  pets = new ArrayList<Pet>();

		}

	public String getNameClient(){

			return nameClient;
		}

	public void setNameClient(String nameClient){

			this.nameClient = nameClient;
		}

	public int getIdentify(){

			return identify;
		}

	public void setIdentify(int identify){

		this.identify = identify;
	}

	public String getAddress(){

			return address;

		}

	public void setAddress(String address){

			this.address = address;

		}

	public int getCellPhone(){

			return cellPhone;
		}

	public void setCellPhone(int cellPhone){

		this.cellPhone = cellPhone;

	}

	 public ArrayList<Pet> getPets(){
		 return pets;
	 	}

	 public void setPets(ArrayList<Pet> pets){
			 this.pets = pets;
		 }

	 public void addPet(ArrayList<Pet> clientsPets){
		 pets = clientsPets;

		 }

//Show info of client
		public String infoClient(){
			String msj = "Nombre: " + nameClient + "\n // identificacion:" + identify+ "\n // direccion:" + address + "\n // numero:" + cellPhone + "\n";

			int j = 0;
			for(int i = 0; i<pets.size(); i++){
				++j;
				msj += "Pet"+ j + " ";
				msj += pets.get(i).showInfoPet();
				}

			return msj;
			}

//Find Pet
		public Pet findPet(String petName){

			Pet nn = null;
			boolean find = false;

			for(int i = 0; i<pets.size() && !find; i++){

				if(pets.get(i).getNamePet().equals(petName)){
					nn = pets.get(i);
					find = true;
				}

			}

			return nn;
		}

//Start hospitalization
		public void startHospita(String namePe, ClinicalHistory newMedRec, Medicament medic){
			boolean petts = false;

			for(int i = 0; i < pets.size() && !petts; i++)
			if(pets.get(i).getNamePet().equals(namePe)){
			  petts = true;

				pets.get(i).addMedRec(newMedRec,medic);

				}
		}
//Show Hospitalization
		public String showInfoHospi(){
			String msj = "";

			for(int i = 0; i < pets.size(); i++){

			msj += pets.get(i).showHospitalization();

			}

			return msj;

		}

}
