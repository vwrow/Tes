public class EmployeeTester {
    public static void main(String[] args) {
        
        Employe Asep = new Employe(21, "Asep", "Administrator", "Jember");
        Employe Budi = new Employe(13, "Budi", "Head Developer", "Trenggalek");
        Employe Jon = new Employe(89, "Jon", "Janitor", "Malang");
        Employe Yono = new Employe(41, "Yono", "Maintenance", "Sidoarjo");
        Employe Pri = new Employe(75, "Pri", "Security", "Sidoarjo");
        Employe Space = new Employe(0, " ", " ", " ");

        Asep.outPrint();
        Space.spacePrint();
        Budi.outPrint();
        Space.spacePrint();
        Jon.outPrint();
        Space.spacePrint();
        Yono.outPrint();
        Space.spacePrint();
        Pri.outPrint();
         
    }
}
