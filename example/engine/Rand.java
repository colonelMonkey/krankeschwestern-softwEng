package engine;

public class Rand extends Zellen {
	  public Rand(int sx, int sy) { 
		    super(sx + 2, sy + 2);
		  }
		  public Rand(Rand other) { //Konvertierung von Torus zu Rand
		    super(other);
		  }
		  public Zellen clone() { //braucht man für Rückkopieren beim Stepover
		    return new Rand(this);
		  }
		  @Override
		  public int readZelle(int x, int y) {      //Read, yada yada 
		    return mZellen[x + 1][y + 1];
		  }
		  @Override
		  public void setZelle(int x, int y, int zelle) { //Es wird beides geschrieben, das lineare Array kann leichter gespeichert und geladen werden.
		    mData[(x + 1) + (y + 1) * SX] = zelle;
		    mZellen[x + 1][y + 1] = zelle;
		  }
}
