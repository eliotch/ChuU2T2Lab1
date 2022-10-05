public class Point {
    private int x;
    private int y;

        public Point(int x, int y){
            this.x=x;
            this.y=y;
    }
        public Point(int setBoth){
            x=setBoth;
            y=setBoth;
        }
        public Point(){
            x=0;
            y=0;
        }

        public void setX(int newX){
            x=newX;
        }
        public void setY(int newY){
            y=newY;
        }
        public void origin(){
            x=0;
            y=0;
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public String coordinate(){
            return "("+x+","+y+")";
        }
        public String quadrant() {
            if (x > 0 && y > 0) {
                return "I";
            }
            if (x < 0 && y > 0) {
                return "II";
            }
            if (x < 0 && y < 0) {
                return "III";
            }
            if (x > 0 && y < 0) {
                return "IV";
            }
            if (x==0 || y==0){
                return"On axis";
            }
            return null;
        }
    }

