public class Oso {
    private String nombre;
    private String tamanno;
    private String color;
    private String alimentacion;

    public Oso(String nombre, String tamanno, String color, String alimentacion) {
        this.nombre = nombre;
        this.tamanno = tamanno;
        this.color = color;
        this.alimentacion = alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void comer(){
        System.out.println(getNombre() +" comiendo  "+getAlimentacion());
    }
    public void caminar(){
        System.out.println(getNombre() +" caminando");
    }
    public void dormir(){
        System.out.println(getNombre() +" durmiendo");
    }


    public String mostrarDatos() {
        return "Nombre:"+nombre+ "   Tamanno: "+tamanno + "  color:"+color+" "+
                "  alimentacion:"+alimentacion;
    }


}
