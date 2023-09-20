public class FabricaMotoPadrao implements FabricaMoto {
    @Override
    public Moto criarMoto() {
        return new MotoPadrao();
    }
}