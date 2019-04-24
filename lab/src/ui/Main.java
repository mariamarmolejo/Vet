package ui;

import model.*;
import java.util.Scanner;
import java.util.ArrayList;

//Cambio prueba.


public class Main{

//Relations
  private Veterinary apo1;
  private Scanner input;

//constructor Main
  public Main(){
    init();
    input = new Scanner(System.in);
    }

//Main
  public static void main(String[] args) {
    Main m = new Main();
    m.showMenu();
    }

//Menu
  public void showMenu(){
    int optionUser =0;
    System.out.println("==============================================================");
    System.out.println("                Veterinaria Mi Pequena Mascota                ");
    System.out.println("==============================================================");
    System.out.println("Escoga presionando el numero lo que desea hacer:\n1.informacion del usuario\n2.Registrar una mascota con su dueño\n3.Informacion medica\n4.Buscar una mascota\n5.Calcular los ingresos por hospitalizacion\n6.Dar de alta a un paciente\n7.Informacion de los clientes\n8.Informacion de minicuartos\n9.Salir");
    System.out.println("==============================================================");
     optionUser =input.nextInt();
    switch(optionUser){
     case 1:
       System.out.println("==============================================================");
       System.out.println("Digite su identificacion  ");
       int id = input.nextInt();
       System.out.println("==============================================================");
       System.out.println("                 Informacion de "+id+"                ");
       System.out.println("==============================================================");
       System.out.println(apo1.infoPet1(id));
       apo1.infoPet1(id);
       System.out.println("==============================================================");
       showMenu();
       break;

     case 2:
       System.out.println("==============================================================");
       System.out.println("              Registrar una mascota con su dueño              ");
       System.out.println("==============================================================");
       System.out.println("Digite el nombre del usuario");
       String name = input.next();
       input.next();
       System.out.println("______________________________________________________________");
       System.out.println("Digite su identificacion");
       int iden = input.nextInt();
       System.out.println("______________________________________________________________");
       System.out.println("Digite su dirección ");
       String addres = input.next();
       input.next();
       System.out.println("______________________________________________________________");
       System.out.println("Digite su celular");
       int phone = input.nextInt();
       System.out.println("______________________________________________________________");
       Client client = new Client(name,iden,addres,phone);

       System.out.println("Digite el numero de mascotas que quiere agregar");
       int numberOfUser = input.nextInt();
       System.out.println("______________________________________________________________");
       ArrayList<Pet> clientsPets = new ArrayList<Pet>();

       for(int i = 0; i < numberOfUser; i++){
       System.out.println("Digite el nombre de su mascota ");
       String nameP = input.next();
       input.next();
       System.out.println("______________________________________________________________");
       System.out.println("Digite la edad de su mascota ");
       int ageOfM = input.nextInt();
       System.out.println("______________________________________________________________");
       System.out.println("Digite el tipo de su mascota : \n1.Perro \n2.Gato\n3.Pajaro\n4.Otro");
       String typeOfM = " ";
       int ageOfMN = input.nextInt();
       switch(ageOfMN){
        case 1:
        typeOfM = "Perro";
        break;
        case 2:
        typeOfM = "Gato";
        break;
        case 3:
        typeOfM = "Pajaro";
        break;
        case 4:
        typeOfM = "Otro";
        break;
        }
       System.out.println("______________________________________________________________");
       System.out.println("Digite el peso de su mascota ");
       double weightOfM = input.nextDouble();
       System.out.println("______________________________________________________________");
       Pet pet3 = new Pet(nameP, ageOfM, typeOfM, weightOfM);
       clientsPets.add(pet3);
       apo1.addClient(client,clientsPets);
       System.out.println("              Se ha añadido la mascota con exito              ");
       System.out.println("==============================================================");
        }
       showMenu();
       break;

     case 3:
       System.out.println("==============================================================");
       System.out.println("                      Informacion Medica                      ");
       System.out.println("==============================================================");
       System.out.println(apo1.showClinicalHistories());
       System.out.println("==============================================================");
       showMenu();
        break;

     case 4:
       System.out.println("==============================================================");
       System.out.println("                       Buscar una mascota                     ");
       System.out.println("==============================================================");
       System.out.println("Cliente:               ");
        System.out.println(apo1.showClients());
        System.out.println("==============================================================");
        System.out.println("Digite el id del cliente");
        int clientId = input.nextInt();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el nombre de la mascota");
        String petName = input.next();
        input.next();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el dia de ingreso");
        int dai = input.nextInt();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el mes de ingreso");
        int mon = input.nextInt();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el año de ingreso ");
        int yea = input.nextInt();
        System.out.println("______________________________________________________________");
        HistorialDated dateIn = new HistorialDated(dai, mon, yea);
        System.out.println("Digite el dia de salida");
        int dai2 = input.nextInt();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el mes de salida");
        int mon2 = input.nextInt();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el año de salida");
        int yea2 = input.nextInt();
        System.out.println("______________________________________________________________");
        HistorialDated dateOut = new HistorialDated(dai2, mon2, yea2);

        System.out.println("Digite el nombre del dueño ");
        String nameClie = input.next();
        input.next();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el id del cliente");
        int idClie = input.nextInt();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el nombre completo de la mascota");
        String namePe = input.next();
        input.next();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el sintoma del animal");
        String symp = input.next();
        input.next();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el diagnostico ");
        String diag = input.next();
        input.next();
        System.out.println("______________________________________________________________");
        System.out.println("Digite el estado: \n1.true\n2.false");
        boolean stat = false;
        int boo = input.nextInt();
        switch(boo){
          case 1:
          stat = true;
          break;
          case 2:
          stat = false;
          break;
          }
        System.out.println("______________________________________________________________");
        System.out.println("Digite el nombre del medicamento");
        String medi = input.next();
        input.next();
        System.out.println("______________________________________________________________");
        System.out.println("Digite la dosis");
        double dos = input.nextDouble();
        System.out.println("______________________________________________________________");
        System.out.println("Digite la total de dosis");
        double totaldos = input.nextDouble();
        System.out.println("______________________________________________________________");
        System.out.println("Digite la frecuencia del medicamento");
        int frec = input.nextInt();
        System.out.println("______________________________________________________________");
            Pet pet2 = apo1.findPett(nameClie, idClie, namePe);

            ClinicalHistory newMedRec = new ClinicalHistory( nameClie, namePe , symp, diag, stat, dateIn,dateOut, pet2);

            Medicament medics = new Medicament(medi, dos, totaldos, frec);

            apo1.hospitalizeVet(nameClie, idClie, namePe, newMedRec, medics);
            System.out.println("==============================================================");
            System.out.println(apo1.hospitalize(clientId, petName));
            System.out.println("==============================================================");
            break;

     case 5:
       System.out.println("==============================================================");
       System.out.println("          Calcular los ingresos por hospitalizacion           ");
       System.out.println("==============================================================");
       System.out.println("Digite el tipo de su mascota : \n1.Perro \n2.Gato\n3.Pajaro\n4.Otro");
       String typeAnimal = " ";
       int ty = input.nextInt();
       switch(ty){
        case 1:
        typeAnimal = "Perro";
        break;
        case 2:
        typeAnimal = "Gato";
        break;
        case 3:
        typeAnimal = "Pajaro";
        break;
        case 4:
        typeAnimal = "Otro";
        break;
        }
         System.out.println("______________________________________________________________");
         System.out.println("Digite el peso de de su Mascota");
         double weight = input.nextDouble();
         System.out.println("______________________________________________________________");
         System.out.println("Por favor digite el dia actual");
         int actualDay = input.nextInt();
         System.out.println("______________________________________________________________");
         System.out.println("Por favor digite el mes actual");
         int actualMonth = input.nextInt();
         System.out.println("______________________________________________________________");
         System.out.println("Por favor digite el año actual");
         int actualYear = input.nextInt();
         System.out.println("______________________________________________________________");
         apo1.costOfhospis(typeAnimal, weight,actualDay, actualMonth, actualYear);
         System.out.println(apo1.costOfhospis(typeAnimal,weight,actualDay, actualMonth, actualYear));

       break;

     case 6:
       System.out.println("==============================================================");
       System.out.println("                  Dar de alta a un paciente                   ");
       System.out.println("==============================================================");
      System.out.println(apo1.showClients());
      System.out.println("==============================================================");
      System.out.println("Por favor digite la identificacion del usuario para dar de alto a su animal");
      int idClientt = input.nextInt();
      System.out.println("______________________________________________________________");
      System.out.println("Por favor digite el nombre de la mascota para darlo de alto");
      String nampe = input.next();
      input.next();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el dia de ingreso");
      int daii = input.nextInt();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el mes de ingreso");
      int monn = input.nextInt();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el año de ingreso ");
      int yeaa = input.nextInt();
      System.out.println("______________________________________________________________");
      HistorialDated dateInn = new HistorialDated(daii, monn, yeaa);

      System.out.println("Digite el dia de salida");
      int dai22 = input.nextInt();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el mes de salida");
      int mon22 = input.nextInt();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el año de salida ");
      int yea22 = input.nextInt();
      System.out.println("______________________________________________________________");
      HistorialDated dateOutt = new HistorialDated(dai22, mon22, yea22);

      System.out.println("Digite el nombre del dueño ");
      String nameClien = input.next();
      input.next();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el id del cliente");
      int idClie1 = input.nextInt();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el nombre completo de la mascota");
      String namePe1 = input.next();
      input.next();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el sintoma del animal");
      String symp1 = input.next();
      input.next();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el diagnostico ");
      String diag1 = input.next();
      input.next();
      System.out.println("______________________________________________________________");
      System.out.println("Digite el estado: \n1.true\n2.false");
      boolean stat1 = false;
      int boo1 = input.nextInt();
      switch(boo1){
        case 1:
        stat = true;
        break;
        case 2:
        stat = false;
        break;
        }
      System.out.println("______________________________________________________________");
      System.out.println("Digite el nombre del medicamento");
      String medi1 = input.next();
      input.next();
      System.out.println("______________________________________________________________");
      System.out.println("Digite la dosis");
      double dos1 = input.nextDouble();
      System.out.println("______________________________________________________________");
      System.out.println("Digite la total de dosis");
      double totaldos1 = input.nextDouble();
      System.out.println("______________________________________________________________");
      System.out.println("Digite la frecuencia del medicamento");
      int frec1 = input.nextInt();
      System.out.println("______________________________________________________________");
      Pet pet22 = apo1.findPett(nameClien, idClie1, namePe1);

      ClinicalHistory newMedRec1 = new ClinicalHistory( nameClien, namePe1 , symp1, diag1, stat1, dateInn,dateOutt, pet22);

      Medicament medics1 = new Medicament(medi1, dos1, totaldos1, frec1);

      apo1.hospitalizeVet(nameClien, idClie1, namePe1, newMedRec1, medics1);


      System.out.println(apo1.findToHospitalize(idClientt,nampe));

      break;

     case 7:
       System.out.println("==============================================================");
       System.out.println("                 Informacion de los clientes                  ");
       System.out.println("==============================================================");
       System.out.println(apo1.showClients());
       System.out.println("==============================================================");
       break;

     case 8:
       System.out.println("==============================================================");
       System.out.println("                  Informacion de minicuartos                  ");
       System.out.println("==============================================================");
       System.out.println(apo1.showRoom());
       System.out.println("==============================================================");
      break;

     case 9:
       System.out.println("==============================================================");
       System.out.println("            Creado por: Maria Jose Marmolejo Muñoz            ");
       System.out.println("==============================================================");
        System.exit(1);
       break;

    default:
       System.out.println("!!!!!!!!!!!!!!!!!!!!!opcion invalida!!!!!!!!!!!!!!!!!!!!!!!");
       showMenu();
       break;
    }
  }

//Initialization
  public void init(){

    apo1 = new Veterinary("Mi Pequena Mascota");

    Client Maria = new Client("Maria", 077, "Caney", 1234);
		Pet Molly = new Pet("Molly",10, "Perro", 23.0);
		ArrayList<Pet> PetsMaria = new ArrayList<Pet>();
		PetsMaria.add(Molly);
		apo1.addClient(Maria,PetsMaria);

		Client Andres = new Client("Andres", 055, "Valle del lili", 4567);
		Pet Tigre = new Pet("Tigre", 12, "Gato", 58.0);
		ArrayList<Pet> PetsAndres = new ArrayList<Pet>();
		PetsAndres.add(Tigre);
		apo1.addClient(Andres, PetsAndres);

		Client Elsa = new Client("Elsa Pato", 044, "Ciudad Jardin", 8910);
		Pet Pancracio = new Pet("Pancracio",11, "Otro", 76.0);
		Pet Arnulfito = new Pet("Arnulfito",10, "Otro", 45.0);
		ArrayList<Pet> PetsElsa = new ArrayList<Pet>();
		PetsElsa.add(Pancracio);
    PetsElsa.add(Arnulfito);
		apo1.addClient(Elsa,PetsElsa);

		Client Armando  = new Client("Armando Casas", 033, "Calicanto", 1112);
		Pet Octaviano = new Pet("Octaviano",8, "Gato",34.0);
		Pet Peggie = new Pet("Peggie",9,"Ave",12.2);
		ArrayList<Pet> PetsArmando = new ArrayList<Pet>();
		PetsArmando.add(Octaviano);
    PetsArmando.add(Peggie);
		apo1.addClient(Armando, PetsArmando);

    Client Elzo  = new Client("Elzo Baco", 022, "Ciudad Real", 1314);
    Pet Ramses = new Pet("Ramses",5, "Gato",10.0);
    Pet Linda = new Pet("Linda",6,"Ave",9.2);
    ArrayList<Pet> PetsElzo = new ArrayList<Pet>();
    PetsElzo.add(Ramses);
    PetsElzo.add(Linda);
    apo1.addClient(Elzo, PetsElzo);

    Client Susana  = new Client("Susana Horia", 011, "Ciudadela Comfandi", 1516);
    Pet Cosa = new Pet("Cosa",7, "Otro",23.0);
    ArrayList<Pet> PetsSusana = new ArrayList<Pet>();
    PetsSusana.add(Cosa);
    apo1.addClient(Susana, PetsSusana);

    Room miniRoom1 = new Room(false, 1, Pancracio);
		Room miniRoom2 = new Room(false, 2, Arnulfito);
		Room miniRoom3 = new Room(false, 3, Octaviano );
		Room miniRoom4 = new Room(false, 4, Peggie);
		Room miniRoom5 = new Room(false, 5, Ramses);
		Room miniRoom6 = new Room(false,6,Linda);
		Room miniRoom7 = new Room(false, 7,Cosa);
		Room miniRoom8 = new Room(false, 8,Molly);
		apo1.addMiniRoom(miniRoom1, miniRoom2, miniRoom3 ,miniRoom4, miniRoom5, miniRoom6, miniRoom7, miniRoom8);

}

}
