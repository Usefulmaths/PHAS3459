package module2;

public class ThreeVector {
	double x;
	double y;
	double z;

	public ThreeVector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}
	
	double magnitude(){
		return Math.sqrt(this.x * this.x + this.y*this.y + this.z * this.z);
	}
	
	ThreeVector unitVector(){
		double normx = this.x/this.magnitude();
		double normy = this.y/this.magnitude();
		double normz = this.z/this.magnitude();
		
		return new ThreeVector(normx, normy, normz);
		
	}
	
	public String toString(){
		return "x: " + this.x +" y: " + this.y + " z: " + this.z;
	}
	
	static double scalarProduct(ThreeVector threeVec1, ThreeVector threeVec2){
		return threeVec1.x*threeVec2.x + threeVec1.y*threeVec2.y + threeVec1.z*threeVec2.z;
	}
	
	static ThreeVector vectorProduct(ThreeVector threeVec1, ThreeVector threeVec2){
		return new ThreeVector(threeVec1.y*threeVec2.z - threeVec1.z*threeVec2.y, threeVec1.z*threeVec2.x - threeVec1.x*threeVec2.z, threeVec1.x*threeVec2.y - threeVec1.y*threeVec2.x);
	}
	
	static ThreeVector add(ThreeVector threeVec1, ThreeVector threeVec2){
		return new ThreeVector(threeVec1.x+threeVec2.x, threeVec1.y + threeVec2.y, threeVec1.z + threeVec2.z);
	}
	
	static double angle(ThreeVector threeVec1, ThreeVector threeVec2){
		return Math.acos(ThreeVector.scalarProduct(threeVec1, threeVec2) / (threeVec1.magnitude()*threeVec2.magnitude()));
	}
	
	double scalarProduct(ThreeVector threeVec){
		return threeVec.x*this.x + threeVec.y*this.y + threeVec.z*this.z;
	}
	
	ThreeVector vectorProduct(ThreeVector threeVec){
		return new ThreeVector(threeVec.y*this.z - threeVec.z*this.y, threeVec.z*this.x - threeVec.x*this.z, threeVec.x*this.y - threeVec.y*this.x);
		
	}
	ThreeVector add(ThreeVector threeVec){
		return new ThreeVector(threeVec.x + this.x, threeVec.y + this.y, threeVec.z + this.z);
	}
	
	double angle(ThreeVector threeVec){
		return  Math.acos(ThreeVector.scalarProduct(threeVec, this) / (threeVec.magnitude()*this.magnitude()));
		
	}

}
