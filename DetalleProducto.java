public class DetalleProducto {
    public static void main(String[] args) {
        String nombreProducto = "Arroz";
        int precio = 2700;
        int cantidad = 12;
        boolean isDisponible = true;

        System.out.println(nombreProducto);
        System.out.println(precio);
        System.out.println(cantidad);
        System.out.println(isDisponible);

        nombreProducto = "Frijol";
        precio =  2000;
        cantidad =  9;
        isDisponible = false;

        System.out.println(nombreProducto);
        System.out.println(precio);
        System.out.println(cantidad);
        System.out.println(isDisponible);

    }
}
