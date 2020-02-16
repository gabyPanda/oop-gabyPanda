public class OsoPardoTest {
    public static void main(String[] args) {
        Oso oso3 = new OsoPardo("Yogi", "2.8m", "cafe","carne");
        System.out.println(oso3.mostrarDatos());
        oso3.caminar();
        oso3.comer();
        oso3.dormir();
    }
}
