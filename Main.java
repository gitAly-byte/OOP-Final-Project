import Methods.Fill_UpStudent;
public class Main {
    public static void main(String[] args) {
        System.out.println(" - ".repeat(5) + "Batangas State University Lipa Campus" + "- ".repeat(5));
        Fill_UpStudent fill = new Fill_UpStudent();
        fill.enterInfo();
    }
}