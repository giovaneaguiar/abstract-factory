public class FabricaCarroFamiliar implements FabricaCarro {
    @Override
    public Carro criarCarro() {
        return new CarroFamiliar();
    }
}