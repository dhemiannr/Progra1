package logicadenegocios;

/**
 *
 * @author Vaglio
 */
public class Proveedor extends Usuario{
    
    //Atributos 
    private String id;
    private String nombreProveedor;
    private String nombreEmpresa;
    private String provincia;
    private String canton;
    private String distrito;
    private String sennas;
    private String telefono;
    //private String correo;
    private String horarioAtencion;
    private String ubicacionGoogleMaps;
    private String perfilFacebook;
    private String perfilInstagram;

    
    //METODO CONSTRUCTOR
    public Proveedor(String pId, String pNombreProveedor, String pNombreEmpresa, String pTelefono, String horarioAtencion, String ubicacionGoogleMaps, String nombreUsuario, String contrasena, String correo, String rol) {
        super(nombreUsuario, contrasena, correo, rol);
        this.id = pId;
        this.nombreProveedor = pNombreProveedor;
        this.nombreEmpresa = pNombreEmpresa;
        this.telefono = pTelefono;
        //this.correo = correo;
        this.horarioAtencion = horarioAtencion;
        this.ubicacionGoogleMaps = ubicacionGoogleMaps;
    }
    
    //--------------------------------------- METODOS ACCESORES --------------------------------------- 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getUbicacionGoogleMaps() {
        return ubicacionGoogleMaps;
    }

    public void setUbicacionGoogleMaps(String ubicacionGoogleMaps) {
        this.ubicacionGoogleMaps = ubicacionGoogleMaps;
    }

    public String getPerfilFacebook() {
        return perfilFacebook;
    }

    public void setPerfilFacebook(String perfilFacebook) {
        this.perfilFacebook = perfilFacebook;
    }

    public String getPerfilInstagram() {
        return perfilInstagram;
    }

    public void setPerfilInstagram(String perfilInstagram) {
        this.perfilInstagram = perfilInstagram;
    }
    
    // --------------------------------------- --------------------------------------- --------------------------------------- 
    
    /**
     * @return Valida el inicio de sesion
     */
    public boolean iniciarSesion(){
        return true;
    }
    
    //-------------------------------------------- Gestion de productos --------------------------------------------
    public String ingresarProducto(){
        return "Producto registrado exitosamente.";
    }
    
    public String consultarProducto(){
        String msg = "";
        return msg;
    }
    
    public String actualizarProducto(){
        return "datos del producto actualizados.";
    }
    
    public String borrarProducto(){
        return "Producto eliminiado.";
    }
    //----------------------------------------------------------------------------------------
    
    /**
     * Consulta de clientes 
     */
    public void consultarClientes(){
        
    }
    
    /**
     * Muestra los pedidos que tienen
     */
    public void mostrarPedidos(){
        
    }
    
    /**
     * 
     * @return el proveedor registrado como un usuario del sistema 
     */
    public String registrarUsuario(){
        return "Registrado como usuario.";
    }
    
}
