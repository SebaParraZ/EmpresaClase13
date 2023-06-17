public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Usuario usuarioValores = new Usuario("Sebastián Parra","08-01-1992","181162856");

        Cliente cliente = new Cliente();
        Cliente clienteValores = new Cliente("18116285-6","Daniel","Oyarzún",7795503,"Provida","Los Altos 5678","Buin",23);

        Capacitacion capacitacion = new Capacitacion();
        Capacitacion capacitacionValores = new Capacitacion(1001,178307462, 04,"19:30","Edificio Cousiño","2 horas",25);

        System.out.println(usuario.toString());
        System.out.println(usuarioValores.toString());
        System.out.println("");
        System.out.println(cliente.toString());
        System.out.println(clienteValores.toString());
        System.out.println("");
        System.out.println(capacitacion.toString());
        System.out.println(capacitacionValores.toString());
    }
}
