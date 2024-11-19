package ejemploDos_ProcesamientodePedidos;

public class EnvioService {
    public void enviarPedido(Pedido pedido) {
    System.out.println("Enviando pedido con total: " + pedido.getTotal());
    }
}