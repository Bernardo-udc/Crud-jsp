
package WebService_client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicios {


    /**
     * 
     * @return
     *     returns java.util.List<WebService_client.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://WebService/", className = "WebService_client.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://WebService/", className = "WebService_client.ListarResponse")
    @Action(input = "http://WebService/Servicios/listarRequest", output = "http://WebService/Servicios/listarResponse")
    public List<User> listar();

    /**
     * 
     * @param id
     * @return
     *     returns WebService_client.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarID", targetNamespace = "http://WebService/", className = "WebService_client.ListarID")
    @ResponseWrapper(localName = "listarIDResponse", targetNamespace = "http://WebService/", className = "WebService_client.ListarIDResponse")
    @Action(input = "http://WebService/Servicios/listarIDRequest", output = "http://WebService/Servicios/listarIDResponse")
    public User listarID(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param apellidos
     * @param nombres
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregar", targetNamespace = "http://WebService/", className = "WebService_client.Agregar")
    @ResponseWrapper(localName = "agregarResponse", targetNamespace = "http://WebService/", className = "WebService_client.AgregarResponse")
    @Action(input = "http://WebService/Servicios/agregarRequest", output = "http://WebService/Servicios/agregarResponse")
    public String agregar(
        @WebParam(name = "nombres", targetNamespace = "")
        String nombres,
        @WebParam(name = "apellidos", targetNamespace = "")
        String apellidos);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminar", targetNamespace = "http://WebService/", className = "WebService_client.Eliminar")
    @ResponseWrapper(localName = "eliminarResponse", targetNamespace = "http://WebService/", className = "WebService_client.EliminarResponse")
    @Action(input = "http://WebService/Servicios/eliminarRequest", output = "http://WebService/Servicios/eliminarResponse")
    public String eliminar(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param apellidos
     * @param id
     * @param nombres
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizar", targetNamespace = "http://WebService/", className = "WebService_client.Actualizar")
    @ResponseWrapper(localName = "actualizarResponse", targetNamespace = "http://WebService/", className = "WebService_client.ActualizarResponse")
    @Action(input = "http://WebService/Servicios/actualizarRequest", output = "http://WebService/Servicios/actualizarResponse")
    public String actualizar(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "nombres", targetNamespace = "")
        String nombres,
        @WebParam(name = "apellidos", targetNamespace = "")
        String apellidos);

}
