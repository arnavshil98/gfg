
public class AggregationPra2 {

	/*
	 * aggregation is used for code reusability, it is the best way.
	 * in case we don't need to make inheritance/ relationship for lifetime.
	 */
	
	AggregationPra aggregationPra;

	double pi = 3.14;

	public double circleArea(double r) {
		// this instance is valid inside the method only.
		aggregationPra = new AggregationPra();
		double squareVar = aggregationPra.square(r);
		return pi * squareVar;

	}
	
	public double squareArea(double s) {
		// this instance is valid inside the method only.
		aggregationPra = new AggregationPra();
		double squareVar = aggregationPra.square(s);
		return squareVar;

	}

	public static void main(String[] args) {
		AggregationPra2 obj = new AggregationPra2();
		
		System.out.println(obj.circleArea(5));
		System.out.println(obj.squareArea(5));
	}

}
