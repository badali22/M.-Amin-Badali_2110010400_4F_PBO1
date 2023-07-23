package pbo;

//inheritance
public class CekresiDetail extends CekResi{
    //overriding
    public CekresiDetail(String nama, String resi) {
        super(nama, resi);
    }
    
    public String getProvinsi(){
        String kodeProv = getResi().substring(0, 2);
        //seleksi if
        if(kodeProv.equals("20")){
            return "Kalimantan Selatan";
        } else {
            return "Provinsi lain";
        }
    }
    
    public String getKabupaten(){
        String kodeKab = getResi().substring(2, 4);
        //seleksi switch
        switch(kodeKab){
            case "01":
                return "Kota Banjarmasin";
            case "02":
                return "Kota Banjarbaru"; 
            case "03":
                return "Kab.Banjar";  
            case "04":
                return "Kab.Tanah Laut";
            case "05":
                return "Kab.Tapin";
            case "06":
                return "Kab.Hulu Sungai Selatan";
            case "07":
                return "Kab.Hulu Sungai Utara";
            case "08":
                return "Kab.Hulu Sungai Tengah";    
            case "09":
                return "Kab.Balangan";
            case "10":
                return "Kab.Tabalong";
            case "11":
                return "Kab.Tanah Bumbu";
            case "12":
                return "Kab.KotaBaru";
            case "13":
                return "Kab.Batola";
            default:
                return "Kab/Kota Tidak Ditemukan";
        }
    }
    
    public String getEkspedisi(){
        String kodeEks = getResi().substring(4, 6);
        //seleksi switch
        switch(kodeEks){
            case "01":
                return "JNT";
            case "02":
                return "JNE";
            case "03":
                return "Sicepat";
            case "04":
                return "Kantor Pos";
            case "05":
                return "Shoppe Express";
            case "06":
                return "Tiki";
            default:
                return "Ekspedisi Lain";
        }
    }
    
    public int getNoreg(){
        return Integer.parseInt(getResi().substring(6));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nProvinsi : "+getProvinsi()+
                "\nKota/Kabupaten : "+getKabupaten()+
                "\nNama Ekspedisi : "+getEkspedisi()+
                "\nNomor Registrasi Anda : "+getNoreg();
    }
}
