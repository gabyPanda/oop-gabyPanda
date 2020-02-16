public class OsoPolar extends Oso {
    public OsoPolar(String nombre, String tamanno, String color,  String alimentacion) {
        super(nombre, tamanno, color, alimentacion);
    }

    @Override
    public void comer(){
        System.out.println(getNombre() +" comiendo  "+getAlimentacion());
    }
    @Override
    public void caminar(){
        System.out.println(getNombre() +" caminando");
    }
    @Override
    public void dormir(){
        System.out.println(getNombre() +" durmiendo");
    }

    @Override
    public String mostrarDatos() {
        return "Nombre:"+this.getNombre()+ "   tamanno :"+ this.getTamanno() + "  color:"+this.getColor()+" "+
                "alimentacion:"+this.getAlimentacion();
    }

}
