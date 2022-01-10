package engine;

public abstract class Zellen {
	protected int [][] mZellen;
	protected int [] mData;
	public final int SX;
	public final int SY;
	protected Zellen(int sx, int sy) {
		SX = sx;
		SY = sy;
		mData = new int[sx*sy];
		for (int i=0; i<mData.length; i++) {
			mData[i]=0;
		}
		
		mZellen = new int [SX][SY];
		for (int y =0; y<SY;y++ ) {
			for (int x =0; x<SY;x++ ) {
				mZellen[x][y] = 0;
			}
		}
	}
	protected Zellen(Zellen other) {
		SX=other.SX;
		SY=other.SY;
		mData = other.mData.clone();
	}
	public abstract Zellen clone();
	public abstract int readZelle (int x, int y);
	public abstract void setZelle (int x, int y, int zelle);
}
