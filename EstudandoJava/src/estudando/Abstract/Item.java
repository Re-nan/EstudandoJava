package estudando.Abstract;

public abstract class Item {
    
    private int posX;
    private int posY;
    
    //Quem extender está class abstract tem por obrigatoriedade sobreescrever este método
    public abstract void pegar();

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
            
}
