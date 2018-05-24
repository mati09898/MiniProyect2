// Nuestro valor null va a ser el "0".

public class MiniProyect {

    public static void main(String[] args) {

        String[] docName = new String[10];
        String[] docSurname = new String[10];
        int[] docAge = new int[10];
        int[] docSalary = new int[10];
        String[] docCar = new String[10];
        String[] docEmail = new String[10];

        for (int n = 0; n < docName.length; n++) {
            docName[n] = "0";
            docSurname[n] = "0";
            docAge[n] = 0;
            docSalary[n] = 0;
            docCar[n] = "0";
            docEmail[n] = "0";
        }
        /*------------------------------------------------------------------------------*/
        String[] patName = new String[130];
        String[] patSurname = new String[130];
        int[] patAge = new int[130];
        String[] patAddres = new String[130];
        int[] patPhone = new int[130];
        char[] patType = new char[130];

        for (int n = 0; n < patName.length; n++) {
            patName[n] = "0";
            patSurname[n] = "0";
            patAge[n] = 0;
            patAddres[n] = "0";
            patPhone[n] = 0;
            patType[n] = '0';
        }
        IBIO.output("if there is no data to input, please input " + '"' + '0' + '"' + '.');
        int counter = 0;
        int count = 0;

        IBIO.output("The actions available are: Delete, Add, Transfer.");
        String modify = IBIO.input("What do you want to do?");

        if (modify.equalsIgnoreCase("delete")) {
            String dele = "";
            String delete = IBIO.inputString("What do you want to delete, a patient or a doctor?");

            if (delete.equalsIgnoreCase("patient") || delete.equalsIgnoreCase("patients")) {
                counter = 0;
                count = 0;
                String del = IBIO.input("Whats the first name of the patient?");
                boolean ret = false;
                while (ret == false && counter < patName.length) {
                    if (patName[counter] == del) {
                        ret = true;
                    }
                    counter++;

                    dele = IBIO.input("Whats the Second name of the patient?");

                    boolean retur = false;
                    while (retur == false && count < patSurname.length) {
                        if (patSurname[count] == dele) {
                            ret = true;
                        }
                        count++;
                    }
                }
                if (counter != count) {
                    if (patSurname[counter] == dele) {
                        count = counter;
                    } else {
                        counter = count;
                    }
                }
                patName[count] = "0";
                patSurname[count] = "0";
                patAge[count] = 0;
                patAddres[count] = "0";
                patPhone[count] = 0;
                patType[count] = '0';

            } else if (delete.equalsIgnoreCase("doctor") || delete.equalsIgnoreCase("doctors")) {
                counter = 0;
                count = 0;
                String del = IBIO.input("Whats the first name of the doctor?");
                boolean ret = false;
                while (ret == false && counter < docName.length) {
                    if (docName[counter] == del) {
                        ret = true;
                    }
                    counter++;
                }
                dele = IBIO.input("Whats the Second name of the doctor?");

                boolean retur = false;
                while (retur == false && count < docSurname.length) {
                    if (docSurname[count] == dele) {
                        ret = true;
                    }

                    count++;
                }

                if (counter != count) {
                    if (docSurname[counter] == dele) {
                        count = counter;
                    } else {
                        counter = count;
                    }
                }
                docName[count] = "0";
                docSurname[count] = "0";
                docAge[count] = 0;
                docSalary[count] = 0;
                docCar[count] = "0";
                docEmail[count] = "0";
            }

        } else if (modify.equalsIgnoreCase("add")) {
            counter = 0;
            count = 0;
            String add = IBIO.inputString("what do you want to add, a doctor or patient?");

            if (add.equalsIgnoreCase("patient")) {
                String DName = IBIO.inputString("Whats the name of the doctor that will treat the patient?");
                String DSurname = IBIO.inputString("Whats the surnamename of the doctor that will treat the patient?");

                boolean ret = false;
                while (ret == false && counter < docName.length) {
                    if (docName[counter].equalsIgnoreCase(DName)) {
                        ret = true;
                    }
                    counter++;
                }
                boolean retur = false;
                while (retur == false && count < docSurname.length) {
                    if (docSurname[count].equalsIgnoreCase(DSurname)) {
                        ret = true;
                    }
                    count++;
                }
                if (counter != count) {
                    if (docSurname[counter].equalsIgnoreCase(DSurname)) {
                        count = counter;
                    } else {
                        counter = count;
                    }
                }
                int secCounter = (count * 13) - 13;

                boolean empt = false;
                while (empt == false && secCounter <= docName.length) {
                    if (patName[secCounter].equals("0") && patSurname[secCounter].equals("0")) {
                        empt = true;
                    }
                    counter++;
                }

                if (empt = true) {
                    IBIO.output(" ");
                    patName[counter] = IBIO.inputString("Whats the patient Name");
                    patSurname[counter] = IBIO.inputString("Whats the patient Surname?");
                    patAge[counter] = IBIO.inputInt("Whats the patient Age?");
                    patAddres[counter] = IBIO.inputString("Whats the patient Address?");
                    patPhone[counter] = IBIO.inputInt("Whats the patient Phone number?");
                    patType[counter] = IBIO.inputChar("Whats the patient Type?");
                } else {
                    IBIO.output("That doctor isnt available.");
                }

                IBIO.output(" ");
                patName[counter] = IBIO.inputString("Whats the patient Name");
                patSurname[counter] = IBIO.inputString("Whats the patient Surname?");
                patAge[counter] = IBIO.inputInt("Whats the patient Age?");
                patAddres[counter] = IBIO.inputString("Whats the patient Address?");
                patPhone[counter] = IBIO.inputInt("Whats the patient Phone number?");
                patType[counter] = IBIO.inputChar("Whats the patient Type?");

            } else if (add.equalsIgnoreCase("doctor")) {
                counter = 0;
                boolean empt = false;
                while (empt == false && counter <= docName.length) {
                    if (docName[counter].equals("0")) {
                        empt = true;
                    }
                    counter++;
                }
                if (empt = true) {

                    boolean empty = false;
                    while (empty == false && counter <= docName.length) {
                        if (docName[counter].equals("0")) {
                            empty = true;
                        }
                        counter++;
                    }
                    docName[counter] = IBIO.inputString("Whats your name?");
                    docSurname[counter] = IBIO.inputString("Whats your surname?");
                    docAge[counter] = IBIO.inputInt("Whats your age?");
                    docSalary[counter] = IBIO.inputInt("Whats your salary?");
                    docCar[counter] = IBIO.inputString("Do you own a car?");
                    docEmail[counter] = IBIO.inputString("Whats your email?");
                } else {
                    IBIO.output("The hospital dosnt have the budget to hire another doctor.");
                }
            }
        } else if (modify.equals("transfer")) {
            int patCounter = 0;
            String pName = IBIO.inputString("Whats the name of the patient?");
            String pSurname = IBIO.inputString("Whats the last name of the patient?");

            String DName = IBIO.inputString("Whats the first name of the doctor that will be trating this patient?");
            String DSurname = IBIO.inputString("Whats the second name of the doctor?");
            boolean ret = false;

            while (ret == false && patCounter < patName.length) {
                if (patName[patCounter].equalsIgnoreCase(pName)) {
                    ret = true;
                }
                counter++;
            }
            boolean retur = false;
            while (retur == false && count < docSurname.length) {
                if (patSurname[count].equalsIgnoreCase(pSurname)) {
                    ret = true;
                }
                count++;
            }
            if (counter != count) {
                if (patSurname[counter].equalsIgnoreCase(pSurname)) {
                    count = counter;
                } else {
                    counter = count;
                }
            }
// Found Patient location
            int dCounter = 0;
            int Dcounter = 0;
            while (ret == false && dCounter < docName.length) {
                if (docName[dCounter].equalsIgnoreCase(DName)) {
                    ret = true;
                }
                dCounter++;
            }
            boolean retu = false;
            while (retu == false && Dcounter < docSurname.length) {
                if (docSurname[Dcounter].equalsIgnoreCase(DSurname)) {
                    retu = true;
                }
                Dcounter++;
            }
            if (Dcounter != dCounter) {
                if (docSurname[dCounter].equalsIgnoreCase(DSurname)) {
                    Dcounter = dCounter;
                } else {
                    dCounter = Dcounter;
                }
            }
// Found doctor location

            int secCounter = (Dcounter * 13) - 13;

            boolean empt = false;
            while (empt == false && secCounter <= docName.length) {
                if (patName[secCounter].equals("0") && patSurname[secCounter].equals("0")) {
                    empt = true;
                }
                secCounter++;
            }

            if (empt = true) {
                IBIO.output(" ");
                patName[secCounter] = patName[count];
                patSurname[secCounter] = patSurname[count];
                patAge[secCounter] = patAge[count];
                patAddres[secCounter] = patAddres[count];
                patPhone[secCounter] = patPhone[count];
                patType[secCounter] = patType[count];
                
                patName[count] = "0";
                patSurname[count] = "0";
                patAge[count]= 0;
                patAddres[count] = "0";
                patPhone[count] = 0;
                patType[count]= '0';
                
                
                
            } else {
                IBIO.output("That doctor isnt available.");
            }

        }
    }
}
