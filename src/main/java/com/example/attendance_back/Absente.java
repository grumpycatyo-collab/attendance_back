package com.example.attendance_back;



import java.util.ArrayList;
import java.util.Date;

public class Absente {
    private Integer id;
    private String numeProf;
    private String subject;
    private ArrayList<Date> datesAbsenta;
    private ArrayList<Date> datesRecuperare;
   private String status;
    private String numeStudent;




    public String getNumeProf() {
        return numeProf;
    }

    public void setNumeProf(String numeProf) {
        this.numeProf = numeProf;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Date> getDatesAbsenta() {
        return datesAbsenta;
    }

    public void setDatesAbsenta(ArrayList<Date> datesAbsenta) {
        this.datesAbsenta = datesAbsenta;
    }

    public ArrayList<Date> getDatesRecuperare() {
        return datesRecuperare;
    }

    public void setDatesRecuperare(ArrayList<Date> datesRecuperare) {
        this.datesRecuperare = datesRecuperare;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getNumeStudent() {
        return numeStudent;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Absente(Integer id, String numeProf, String subject, ArrayList<Date> datesAbsenta, ArrayList<Date> datesRecuperare, String status, String numeStudent) {
        this.id = id;
        this.numeProf = numeProf;
        this.subject = subject;
        this.datesAbsenta = datesAbsenta;
        this.datesRecuperare = datesRecuperare;
        this.status = status;
        this.numeStudent = numeStudent;
    }

    public void setNumeStudent(String numeStudent) {
        this.numeStudent = numeStudent;
    }

    @Override
    public String toString() {
        return "Absente{" +
                "id=" + id +
                ", numeProf='" + numeProf + '\'' +
                ", subject='" + subject + '\'' +
                ", datesAbsenta=" + datesAbsenta +
                ", datesRecuperare=" + datesRecuperare +
                ", status='" + status + '\'' +
                ", numeStudent='" + numeStudent + '\'' +
                '}';
    }

    static ArrayList list = new ArrayList<Absente>();
    public static void startAbsente(){
        ArrayList<Date> dataAps = new ArrayList<>();
        dataAps.add(new Date(22,12,13));
        dataAps.add(new Date(22,12,13));

        ArrayList<Date> dataRec = new ArrayList<>();
        dataRec.add(new Date(23,12,13, 11,30));
        dataRec.add(new Date(23,12,12,12,2));
        list.add(new Absente(1,"Gavrilita Mihail","PCAIT", dataAps,dataRec,"Neachitat","Gusev Roman"));

        ArrayList<Date> dataAps2 = new ArrayList<>();
        dataAps2.add(new Date(25, 1, 14));

        ArrayList<Date> dataRec2 = new ArrayList<>();
        dataRec2.add(new Date(27, 3, 14, 9, 30));

        list.add(new Absente(2, "Gavrilita Mihail", "AI", dataAps2, dataRec2, "Achitat", "Popa Maria"));

        ArrayList<Date> dataAps3 = new ArrayList<>();
        dataAps3.add(new Date(10, 5, 15));
        dataAps3.add(new Date(11, 6, 15));

        ArrayList<Date> dataRec3 = new ArrayList<>();
        dataRec3.add(new Date(12, 7, 15, 13, 15));
        dataRec3.add(new Date(13, 8, 15, 16, 20));

        list.add(new Absente(3, "Cojuhari Elena", "MSp", dataAps3, dataRec3, "Recuperat", "Popa Maria"));

        ArrayList<Date> dataAps4 = new ArrayList<>();
        dataAps4.add(new Date(14, 9, 16));


        ArrayList<Date> dataRec4 = new ArrayList<>();
        dataRec4.add(new Date(16, 11, 16, 11, 0));

        list.add(new Absente(4, "Cojuhari Elena", "AM", dataAps4, dataRec4, "In Progres", "Georgescu Andrei"));

        ArrayList<Date> dataAps5 = new ArrayList<>();
        dataAps5.add(new Date(18, 1, 17));
        dataAps5.add(new Date(19, 2, 17));

        ArrayList<Date> dataRec5 = new ArrayList<>();
        dataRec5.add(new Date(20, 3, 17, 15, 45));
        dataRec5.add(new Date(21, 4, 17, 16, 15));

        list.add(new Absente(5, "Bostan Viorel", "MN", dataAps5, dataRec5, "Neachitat", "Ionescu George"));

        ArrayList<Date> dataAps6 = new ArrayList<>();
        dataAps6.add(new Date(22, 5, 18));
        dataAps6.add(new Date(23, 6, 18));

        ArrayList<Date> dataRec6 = new ArrayList<>();
        dataRec6.add(new Date(24, 7, 18, 14, 0));
        dataRec6.add(new Date(25, 8, 18, 17, 30));

        list.add(new Absente(6, "Bostan Viorel", "MD", dataAps6, dataRec6, "Achitat", "Popescu Ion"));

        ArrayList<Date> dataAps7 = new ArrayList<>();
        dataAps7.add(new Date(26, 9, 18));
        dataAps7.add(new Date(27, 10, 18));

        ArrayList<Date> dataRec7 = new ArrayList<>();
        dataRec7.add(new Date(28, 11, 18, 9, 0));
        dataRec7.add(new Date(29, 12, 18, 11, 30));

        list.add(new Absente(7, "Bostan Viorel", "PSA", dataAps7, dataRec7, "Neachitat", "Vasilescu Ioana"));

        ArrayList<Date> dataAps8 = new ArrayList<>();
        dataAps8.add(new Date(30, 1, 19));
        dataAps8.add(new Date(31, 2, 19));

        ArrayList<Date> dataRec8 = new ArrayList<>();
        dataRec8.add(new Date(1, 3, 19, 15, 0));
        dataRec8.add(new Date(2, 4, 19, 16, 30));

        list.add(new Absente(8, "Gavrilita Mihail", "PCAIT", dataAps8, dataRec8, "Achitat", "Vasilescu Ioana"));

        ArrayList<Date> dataAps9 = new ArrayList<>();
        dataAps9.add(new Date(3, 5, 19));
        dataAps9.add(new Date(4, 6, 19));

        ArrayList<Date> dataRec9 = new ArrayList<>();
        dataRec9.add(new Date(5, 7, 19, 12, 0));
        dataRec9.add(new Date(6, 8, 19, 14, 30));

        list.add(new Absente(9, "Gavrilita Mihail", "AI", dataAps9, dataRec9, "Recuperat", "Vasilescu Ioana"));

        ArrayList<Date> dataAps10 = new ArrayList<>();
        dataAps10.add(new Date(7, 9, 19));
        dataAps10.add(new Date(8, 10, 19));

        ArrayList<Date> dataRec10 = new ArrayList<>();
        dataRec10.add(new Date(9, 11, 19, 10, 0));
        dataRec10.add(new Date(10, 12, 19, 12, 30));

        list.add(new Absente(10, "Cojuhari Elena", "MSp", dataAps10, dataRec10, "In Progres", "Ionescu Ana"));

        ArrayList<Date> dataAps11 = new ArrayList<>();
        dataAps11.add(new Date(11, 1, 20));
        dataAps11.add(new Date(12, 2, 20));

        ArrayList<Date> dataRec11 = new ArrayList<>();
        dataRec11.add(new Date(13, 3, 20, 11, 0));
        dataRec11.add(new Date(14, 4, 20, 14, 30));

        list.add(new Absente(11, "Cojuhari Elena", "AM", dataAps11, dataRec11, "Neachitat", "Vasilescu Maria"));


        ArrayList<Date> dataAps13 = new ArrayList<>();
        dataAps13.add(new Date(19, 9, 20));

        ArrayList<Date> dataRec13 = new ArrayList<>();
        dataRec13.add(new Date(20, 9, 20, 9, 0));

        list.add(new Absente(13, "Bostan Viorel", "MD", dataAps13, dataRec13, "Neachitat", "Grigoras Maria"));

        // Element 14
        ArrayList<Date> dataAps14 = new ArrayList<>();
        dataAps14.add(new Date(21, 10, 20));
        dataAps14.add(new Date(22, 10, 20));
        dataAps14.add(new Date(23, 10, 20));

        ArrayList<Date> dataRec14 = new ArrayList<>();
        dataRec14.add(new Date(24, 10, 20, 11, 0));
        dataRec14.add(new Date(25, 10, 20, 12, 0));
        dataRec14.add(new Date(26, 10, 20, 13, 0));

        list.add(new Absente(14, "Gavrilita Mihail", "PCAIT", dataAps14, dataRec14, "Achitat", "Grigoras Maria"));

        // Element 15
        ArrayList<Date> dataAps15 = new ArrayList<>();
        dataAps15.add(new Date(27, 11, 20));

        ArrayList<Date> dataRec15 = new ArrayList<>();
        dataRec15.add(new Date(28, 11, 20, 14, 0));

        list.add(new Absente(15, "Gavrilita Mihail", "AI", dataAps15, dataRec15, "Recuperat", "Popescu Ion"));

        // Element 16
        ArrayList<Date> dataAps16 = new ArrayList<>();
        dataAps16.add(new Date(29, 12, 20));
        dataAps16.add(new Date(30, 12, 20));

        ArrayList<Date> dataRec16 = new ArrayList<>();
        dataRec16.add(new Date(31, 12, 20, 15, 0));
        dataRec16.add(new Date(1, 1, 21, 10, 0));

        list.add(new Absente(16, "Cojuhari Elena", "MSp", dataAps16, dataRec16, "In Progres", "Popescu Andrei"));

        // Element 17
        ArrayList<Date> dataAps17 = new ArrayList<>();
        dataAps17.add(new Date(2, 2, 21));
        dataAps17.add(new Date(3, 2, 21));
        dataAps17.add(new Date(4, 2, 21));

        ArrayList<Date> dataRec17 = new ArrayList<>();
        dataRec17.add(new Date(5, 2, 21, 12, 0));
        dataRec17.add(new Date(6, 2, 21, 13, 0));
        dataRec17.add(new Date(7, 2, 21, 14, 0));

        list.add(new Absente(17, "Cojuhari Elena", "AM", dataAps17, dataRec17, "Neachitat", "Gluga Andrei"));

        // Element 18
        ArrayList<Date> dataAps18 = new ArrayList<>();
        dataAps18.add(new Date(8, 3, 21));

        ArrayList<Date> dataRec18 = new ArrayList<>();
        dataRec18.add(new Date(9, 3, 21, 15, 0));

        list.add(new Absente(18, "Bostan Viorel", "MN", dataAps18, dataRec18, "Achitat", "Popescu Ion"));

        // Element 19
        ArrayList<Date> dataAps19 = new ArrayList<>();
        dataAps19.add(new Date(10, 4, 21));
        dataAps19.add(new Date(11, 4, 21));
        dataAps19.add(new Date(12, 4, 21));

        ArrayList<Date> dataRec19 = new ArrayList<>();
        dataRec19.add(new Date(13, 4, 21, 16, 0));
        dataRec19.add(new Date(14, 4, 21, 17, 0));
        dataRec19.add(new Date(15, 4, 21, 18, 0));

        list.add(new Absente(19, "Bostan Viorel", "MD", dataAps19, dataRec19, "Recuperat", "Popescu Maria"));

        // Element 20
        ArrayList<Date> dataAps20 = new ArrayList<>();
        dataAps20.add(new Date(16, 5, 21));
        dataAps20.add(new Date(17, 5, 21));

        ArrayList<Date> dataRec20 = new ArrayList<>();
        dataRec20.add(new Date(18, 5, 21, 11, 0));
        dataRec20.add(new Date(19, 5, 21, 12, 0));

        list.add(new Absente(20, "Gavrilita Mihail", "PCAIT", dataAps20, dataRec20, "In Progres", "Plamadeala Maria"));

        // Element 21
        ArrayList<Date> dataAps21 = new ArrayList<>();
        dataAps21.add(new Date(20, 6, 21));

        ArrayList<Date> dataRec21 = new ArrayList<>();
        dataRec21.add(new Date(21, 6, 21, 13, 0));

        list.add(new Absente(21, "Gavrilita Mihail", "AI", dataAps21, dataRec21, "Neachitat", "Vasile Ion"));

        // Element 22
        ArrayList<Date> dataAps22 = new ArrayList<>();
        dataAps22.add(new Date(22, 7, 21));
        dataAps22.add(new Date(23, 7, 21));
        dataAps22.add(new Date(24, 7, 21));

        ArrayList<Date> dataRec22 = new ArrayList<>();
        dataRec22.add(new Date(25, 7, 21, 14, 0));
        dataRec22.add(new Date(26, 7, 21, 15, 0));
        dataRec22.add(new Date(27, 7, 21, 16, 0));

        list.add(new Absente(22, "Cojuhari Elena", "MSp", dataAps22, dataRec22, "Neachitat", "Ciornii Andrei"));
    }
}
