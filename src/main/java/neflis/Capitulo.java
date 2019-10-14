package neflis;

public class Capitulo extends ContenidoUnitario{
    protected Integer duracion;
    protected Integer numeroCap;
    protected Serie serie;
    protected String genero;

    public Capitulo(Integer numeroCap, String actores) {
        this.actores=actores;
        this.numeroCap=numeroCap;}


    public void setSerie(Serie serie){this.serie=serie;}

    public Boolean fueVistoCompletaX(Usuario usuario){
        return usuario.getContenido().contains( this );}

    public void setGenero(String genero) {
        this.genero = genero;}

    public String genero() { return this.serie.genero();}

     /**tengo duracion de un capitulo**/
    public void setDuracion(Integer minutos) {
        duracion = duracion;
    }
    public Integer duracion() {
        return this.duracion;
    }
}




