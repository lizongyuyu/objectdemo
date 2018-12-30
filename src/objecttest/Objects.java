package objecttest;

public class Objects {
/*	protected int a;
	protected String x;*/
	public int length;
	public int kuan;
	public Objects(int length, int kuan) {
		super();
		this.length = length;
		this.kuan = kuan;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getKuan() {
		return kuan;
	}
	public void setKuan(int kuan) {
		this.kuan = kuan;
	}
	@Override
	public String toString() {
		return "Objects [length=" + length + ", kuan=" + kuan + ", getLength()=" + getLength() + ", getKuan()="
				+ getKuan() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Objects other = (Objects) obj;
		if (kuan != other.kuan)
			return false;
		if (length != other.length)
			return false;
		return true;
	}
	
}
