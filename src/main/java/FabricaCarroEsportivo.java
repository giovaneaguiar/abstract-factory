class FabricaCarroEsportivo implements FabricaCarro {
    @Override
    public Carro criarCarro() {
        return new CarroEsportivo();
    }
}
