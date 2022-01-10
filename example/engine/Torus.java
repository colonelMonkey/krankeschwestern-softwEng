package engine;

public class Torus extends Zellen {

	Torus(int sx, int sy){
		super(sx, sy);
	}
	Torus(Zellen other){
		super(other);
	}
	
	@Override
	public Zellen clone() {
		return new Torus(this);
	}

	@Override
	public int readZelle(int x, int y) {
	    return mData[(x % SX) + (y % SY) * SX];
	}

	@Override
	public void setZelle(int x, int y, int zelle) {
	    mData[(x % SX) + (y % SY) * SX] = zelle;
		mZellen[x%SX][y%SY] = zelle;
	}

}
