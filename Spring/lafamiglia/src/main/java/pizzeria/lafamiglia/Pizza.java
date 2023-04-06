package pizzeria.lafamiglia;

public class Pizza {
    private int id;
    private boolean vegetariana;
    private int precio;
    private String descripcion;
    private String[] ingredientes;
    private String imagen;

    public Pizza(int id, boolean vegetariana, int precio, String descripcion, String[] ingredientes, String imagen) {
        this.id = id;
        this.vegetariana = vegetariana;
        this.precio = precio;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVegetariana() {
        return vegetariana;
    }

    public void setVegetariana(boolean vegetariana) {
        this.vegetariana = vegetariana;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
