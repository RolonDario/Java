public class Contacto {

    private String nombre;
    private String nro_tel;
    private String correo;

    Contacto() {

    }

    Contacto(String nombre, String nro_tel, String correo) {
        this.nombre = nombre;
        this.nro_tel = nro_tel;
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNroTel() {
        return this.nro_tel;
    }

    public String getCorreo() {
        return this.correo;
    }

    public String getInfo() {
        return String.valueOf(this.nombre) +
                " - " + this.nro_tel +
                " - " + this.correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTel(String nro_tel) {
        this.nro_tel = nro_tel;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setInfo(String nombre, String nro_tel, String correo) {
        this.nombre = nombre;
        this.nro_tel = nro_tel;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return String.valueOf("Nombre: " + this.nombre) +
                " Numero de tel: " + this.nro_tel +
                " Correo: " + this.correo;
    }

}
