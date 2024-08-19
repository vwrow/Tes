public class Employe {

    int id;
    String nama;
    String unit;
    String domisili;

    public Employe(int id, String nama, String unit, String domisili) {

        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.domisili = domisili;
    }

    public void spacePrint() {
        System.out.println("    ");
    }

    public void outPrint() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Unit: " + unit);
        System.out.println("Domisili: " + domisili);
    }

}
