package logicadenegocios;

/**
 *
 * @author Vaglio
 */
public abstract class Usuario {
    
    //Creacion de variables
    protected String nombreUsuario;
    protected String contrasena;
    protected String correo;
    protected String rol;

    /**
     * METODO CONSTRUCTOR 
     * @param nombreUsuario
     * @param contrasena
     * @param correo
     * @param rol 
     */
    public Usuario(String nombreUsuario, String contrasena, String correo, String rol) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.rol = rol;
    }
    
    /**
     * METODOS ACCESORES
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    /**
     * 
     * @return Valida el inicio de sesion del usuario
     */
    public abstract boolean iniciarSesion();
    
    
    
    
}
