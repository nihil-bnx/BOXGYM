package DATOS;
import java.time.LocalDate;
public class Registro {
    
    private Cliente cliente;
    private Membresia membresia;
    private LocalDate fechaInicio;
    private String estado;
    private boolean pagado;


    public Registro() {
    }

    public Registro(Cliente cliente, Membresia membresia, LocalDate fechaInicio, String estado, boolean pagado) {
        this.cliente = cliente;
        this.membresia = membresia;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.pagado = pagado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
        
   
 
}
