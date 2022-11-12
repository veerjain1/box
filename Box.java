class Box{
//declare private variables which are reachable to the rest of the class
  private double height;
  private double width;
  private double depth;
  private double s1;
  private double s2;
  private double s3;

  //default constructor
  public Box(){
    height =1;
    width =1;
    depth=1;
    s1=1;
    s2=2;
    s3=3;
  }

  //parameter constructor for height width depth
  public Box(double height, double width, double depth){

    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  //parameter constructor for sides instead of height width and depth
  public Box(double side){
     this.s1 = this.height;
     this.s2 = this.width;
     this.s3 = this.depth;
  }
//--------------------------
  //METHODS

  //find volume of box 
  public double volume(){
    double vol =0;
    vol =height*width*depth;
    return vol;
  }
  //find surface area of box
  public double surfaceArea(){
    double surf =0;
    surf =2*((height*width)+(depth*width)+(depth*height));
    return surf;
  }

  //accessor, print the dimensions to user
  public String toString(){
    String info = "Box with dimensions "+height+" "+width+" "+depth;
    return info;
  }

  //ACCESSOR METHODS TO ACCESS SIDES
  public double accessS1(){
    return height;
  }
  public double accessS2(){
    return width;
  }
  public double accessS3(){
    return depth;
  }

  //MUTATOR METHODSS TO MULTIPLY EACH SIDE BY 5 TO GET DIMENSIONS THAT ARE PENTUPLE THE ORIGINAL SIZE
  public double mutateS1(){
    height = height*5;
    return height;
  }
  public double mutateS2(){
    width = width*5;
    return width;
  }
  
  public double mutateS3(){
    depth = depth*5;
    return depth;
  }
  
}