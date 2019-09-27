class Point {
	
   private double x;
   private double y;
	
   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }
   
   public double getX() {
      return x;	
   }
	
   public double getY() {
      return y;
   }


   public double getRadius(){
      return Math.sqrt(x*x + y*y);
   }


   public double getAngle(){
     if(this.x==0){
        if(this.y<0)
           return Math.PI/-2;
        if(this.y>0)
           return Math.PI/2;
        if(this.y==0)
           return 0;
     }
     if(this.x!=0 && this.y==0){
        if(this.x<0) 
           return Math.PI;
        if(this.x>0) 
           return 0;
     }
     if(this.x<0 && this.y > 0){
        return Math.atan(this.y/this.x) + Math.PI;
     }
     if(this.x<0 && this.y<0){
        return Math.atan(this.y/this.x) - Math.PI;
     }      
     return Math.atan(this.y/this.x);
   }



   public Point rotate90(){
      return new Point(this.getRadius()*-1*
         Math.sin(this.getAngle()),this.getRadius()*Math.cos(this.getAngle())); 
   }

}
