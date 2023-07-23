
package pbo;

//class
public class CekResi {
    //atribut dan encapsulation
    private String nama;
    private String resi;

    //constructor
    public CekResi(String nama, String resi) {
        this.nama = nama;
        this.resi = resi;
    }

    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setResi(String resi) {
        this.resi = resi;
    }

    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getResi() {
        return resi;
    }
    
    public String displayInfo(){
        return "Nama : "+getNama()+"\nNomor Resi: "+getResi();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String ekspedisi){
        return displayInfo() + "\nEkspedisi : "+ekspedisi;
    }
    
}
