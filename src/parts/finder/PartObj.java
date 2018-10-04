/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parts.finder;

/**
 *
 * @author mikeg
 */
public class PartObj {
     private int partNumber;
     private String Name;
     private String Version;
     private String Station_Step;
     private String MPI_Number;
     private String  Station_Step1;
     private String Station_Step2;
     private String MPI_Number1;
     private String MPI_Number2;

    PartObj() {
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getStation_Step() {
        return Station_Step;
    }

    public void setStation_Step(String Station_Step) {
        this.Station_Step = Station_Step;
    }

    public String getMPI_Number() {
        return MPI_Number;
    }

    public void setMPI_Number(String MPI_Number) {
        this.MPI_Number = MPI_Number;
    }

    public String getStation_Step1() {
        return Station_Step1;
    }

    public void setStation_Step1(String Station_Step1) {
        this.Station_Step1 = Station_Step1;
    }

    public String getStation_Step2() {
        return Station_Step2;
    }

    public void setStation_Step2(String Station_Step2) {
        this.Station_Step2 = Station_Step2;
    }

    public String getMPI_Number1() {
        return MPI_Number1;
    }

    public void setMPI_Number1(String MPI_Number1) {
        this.MPI_Number1 = MPI_Number1;
    }

    public String getMPI_Number2() {
        return MPI_Number2;
    }

    public void setMPI_Number2(String MPI_Number2) {
        this.MPI_Number2 = MPI_Number2;
    }

    public PartObj(int partNumber, String Name, String Version, String Station_Step, String MPI_Number, String Station_Step1, String Station_Step2, String MPI_Number1, String MPI_Number2) {
        this.partNumber = partNumber;
        this.Name = Name;
        this.Version = Version;
        this.Station_Step = Station_Step;
        this.MPI_Number = MPI_Number;
        this.Station_Step1 = Station_Step1;
        this.Station_Step2 = Station_Step2;
        this.MPI_Number1 = MPI_Number1;
        this.MPI_Number2 = MPI_Number2;
    }

    @Override
    public String toString() {
        return "PartsList{" + "partNumber=" + partNumber + ", Name=" + Name + ", Version=" + Version + ", Station_Step=" + Station_Step + ", MPI_Number=" + MPI_Number + ", Station_Step1=" + Station_Step1 + ", Station_Step2=" + Station_Step2 + ", MPI_Number1=" + MPI_Number1 + ", MPI_Number2=" + MPI_Number2 + '}';
    }

    
}
