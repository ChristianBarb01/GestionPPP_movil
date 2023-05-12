package model;

public class Empresa {

    private Integer idEmpresa;
    private String rucEmpresa;
    private String nombreEmpresa;
    private String correo;
    private String ciudad;
    private String numeroTelefono;
    private String direccion;
    private String codigoPostal;
    private String descripcion;

    public Empresa(Integer idEmpresa, String rucEmpresa, String nombreEmpresa, String correo, String ciudad, String numeroTelefono, String direccion, String codigoPostal, String descripcion) {
        this.idEmpresa = idEmpresa;
        this.rucEmpresa = rucEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.correo = correo;
        this.ciudad = ciudad;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.descripcion = descripcion;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
