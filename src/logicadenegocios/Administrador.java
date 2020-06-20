package logicadenegocios;

/**
 *
 * @author Vaglio
 */
public class Administrador extends Usuario{
    
    //Metodo Constructor
    public Administrador(String nombreUsuario, String contrasena, String correo, String rol) {
        super(nombreUsuario, contrasena, correo, rol);
    }
    
    /**
     * @return Valida el inicio de sesion 
     */
    public boolean iniciarSesion(){
        return true;
    }
    //-------------------------------------------- Gestion de proveedores --------------------------------------------
    public String ingresarProveedor(){
        return "Proveedor registrado exitosamente.";
    }
    
    public String consultarProveedor(){
        String msg = "";
        return msg;
    }
    
    public String actualizarProveedor(){
        return "datos del proveedor actualizados.";
    }
    
    public String borrarProveedor(){
        return "Proveedor eliminiado.";
    }
    
    public void inactivarProveedor(){
        
    }
    //------------------------------------------------------------------------------------------------------------------------------------
    
    //-------------------------------------------- Gestion de Categorias --------------------------------------------
    public String ingresarCategoria(){
        return "Categoria registrada exitosamente.";
    }
    
    public String consultarCategoria(){
        String msg = "";
        return msg;
    }
    
    public String actualizarCategoria(){
        return "Categoria actualizada.";
    }
    
    public String borrarCategoria(){
        return "Categoria eliminiada.";
    }
    //------------------------------------------------------------------------------------------------------------------------------------
    
    //-------------------------------------------- Gestion de Estados de pedidos --------------------------------------------
    public String ingresarEstadoPedido(){
        return "Estado de pedido registrado.";
    }
    
    public String consultarEstadoPedido(){
        String msg = "";
        return msg;
    }
    
    public String actualizarEstadoPedido(){
        return "Estado del pedido actualizado.";
    }
    
    public String borrarEstadoPedido(){
        return "Estado de Pedido eliminiado.";
    }
    //------------------------------------------------------------------------------------------------------------------------------------
    
    //-------------------------------------------- Gestion de Administradores --------------------------------------------
    public String ingresarAdministrador(){
        return "Administrador agregado";
    }
    
    
}
