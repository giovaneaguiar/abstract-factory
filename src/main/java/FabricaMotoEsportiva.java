class FabricaMotoEsportiva implements FabricaMoto {
    @Override
    public Moto criarMoto() {
        return new MotoEsportiva();
    }
}