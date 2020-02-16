public class OsoPandaTest {
    public static void main(String[] args) {
        Oso oso2 = new OsoPanda("Lucas", "1.2m", "blanco y negro","bamboo");
        System.out.println(oso2.mostrarDatos());
        oso2.caminar();
        oso2.comer();
        oso2.dormir();
    }
}
