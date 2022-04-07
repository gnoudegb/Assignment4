
public class Plot {
	
	private int x;
	private int y;
	private int width;
	private int depth;
	
	
	public Plot() {
		x =0;
		y= 0;
		depth = 1;
		width = 1;
	}
	
	public Plot(Plot p) {
		x = p.getX();
		y = p.getY();
		width = p.getWidth();
		depth = p.getDepth();
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Upper left: (" + x + ","+ y + "); Width: "+ width + " Depth: " + depth ;
	}
	
	public boolean overlaps (Plot plot) {
		boolean overlaps;
		if (x==plot.getX() && y == plot.getY() && (width == plot.getWidth() || depth == plot.getDepth())) {
			overlaps = true;}
		else
			overlaps = false;
		return overlaps;
	}
	
	public boolean encompasses (Plot plot) {
		boolean encom;
		if (x==plot.getX() && y == plot.getY() && (width <= plot.getWidth() || depth <= plot.getDepth())) {
			encom = true;}
		else
			encom = false;
		return encom;
	}
}
