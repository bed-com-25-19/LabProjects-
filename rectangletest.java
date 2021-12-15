
public class rectangletest {

  double length;
  double breadth;

  rectangletest() {

  }
  rectangletest(double length,  double breadth ) {
    this.length = length;
    this.breadth = breadth;
  }
  // return area
  public double getArea () {
    return length * breadth;
  }
}
