package logicadenegocios;

/**
 *
 * @author Vaglio
 */
public class Cliente extends Usuario{
    
    //Atributos
    private String cedula;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String provincia;
    private String canton;
    private String distrito;
    private String sennas;
    private String telefono;
    private String ubicacionGoogleMaps;
    
    //METODO CONSTRUCTOR

    public Cliente(String pCedula, String pPrimerNombre, String pPrimerApellido, String pSegundoApellido, String pTelefono, String nombreUsuario, String contrasena, String correo, String rol) {
        super(nombreUsuario, contrasena, correo, rol);
        this.cedula = pCedula;
        this.primerNombre = pPrimerNombre;
        this.primerApellido = pPrimerApellido;
        this.segundoApellido = pSegundoApellido;
        this.telefono = pTelefono;
    }
    
    //--------------------------------------- METODOS ACCESORES ---------------------------------------

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getSennas() {
        return sennas;
    }

    public void setSennas(String sennas) {
        this.sennas = sennas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacionGoogleMaps() {
        return ubicacionGoogleMaps;
    }

    public void setUbicacionGoogleMaps(String ubicacionGoogleMaps) {
        this.ubicacionGoogleMaps = ubicacionGoogleMaps;
    }
    
    /**
     * @return Valida el inicio de sesion
     */
    public boolean iniciarSesion(){
        return true;
    }
    
    //-------------------------------------------- Gestion de clientes --------------------------------------------
    /*public String ingresarCliente(){
        return "cliente registrado exitosamente.";
    }  */
    
    public String consultarCliente(){
        String msg = "";
        return msg;
    }
    
    public String actualizarCliente(){
        return "datos del cliente actualizados.";
    }
    
    /*public String borrarCliente(){
        return "cliente eliminiado.";
    }*/
    //----------------------------------------------------------------------------------------
    
    //-------------------------------------------- Gestion de Pedidos --------------------------------------------
    public String ingresarPedido(){
        return "pedido registrado exitosamente.";
    }   
    public String consultarPedido(){
        String msg = "";
        return msg;
    }
    
    public String actualizarPedido(){
        return "datos del cliente actualizados.";
    }   
    
    public String borrarPedido(){
        return "Pedido eliminado.";
    }
    
    
}
