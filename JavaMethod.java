public class JavaMethod {

    public static void main(String[] args) {
        mataKuliah();
        nilai("Zihan", 90);
    }
    
    static void mataKuliah(){
        System.out.println("Praktikum Akuntansi Manajemen");
    }

    static void nilai (String namaMahasiswa, int nilai){
        if(nilai>=0 && nilai <= 75){
            System.out.println("anda tidak lulus mata kuliah ini");
        } else {
            System.out.println("anda lulus mata kuliah ini");
        }
    }
}
