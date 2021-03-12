package ec.edu.espe.tax;

public class BasicTax {

    public static float computeIva(float baseprice, float percetangeValue) {
        float iva;
        iva = baseprice * percetangeValue / 100;
        return iva;
    }

}
