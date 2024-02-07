public class ProductoIVA extends Producto {

    private double IVA;

    public ProductoIVA(double IVA) {
        this.IVA = IVA;
    }

    @Override
    public double getPrecioNeto() {
        return super.getPrecioNeto();
    }

    @Override
    public String toString() {
        return getPrecioNeto();
    }
}
