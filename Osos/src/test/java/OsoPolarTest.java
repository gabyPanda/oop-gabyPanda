public class OsoPolarTest {
    public static void main(String[] args) {
        Oso oso4 = new OsoPolar("Garras", "3m", "blanco","carne");
        System.out.println(oso4.mostrarDatos());
        oso4.caminar();
        oso4.comer();
        oso4.dormir();
    }
}
