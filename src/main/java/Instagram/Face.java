package Instagram;

public class Face {

    //В статик метод можно использовать по названию класса (Software.cry()) без создания объекта в Software
//non static метод надо создавать объект и вызывать метод через название объекта (object.cry()).

        String skinColor;
        String eyeColor;
        String sizeOfNose;
        String shapeOfFace;


        public  void  happyFace(){
            System.out.println("Face is happy.");
        }
        public  void  sadFace(){
            System.out.println("Face is sad.");
        }
        public  void smileFace(){
            System.out.println("Face is smiling.");
        }
        public  void displayFace() {
            smileFace();


            if (eyeColor == null && sizeOfNose == null) {
                System.out.println("Characteristics: " +
                        "\nSkin color: " + skinColor +
                        "\nShape of face: " + shapeOfFace);
            } else{
                System.out.println("Characteristics: " +
                        "\nSkin color: " + skinColor + "\nEye color: " + eyeColor + "\nSize of nose: " + sizeOfNose
                        + "\nShape of face: " + shapeOfFace);
                System.out.println();
            }
        }

        public Face(String ColorOfSkin, String shapeOfFace){
            skinColor =ColorOfSkin; //existing variable should be assigned to parameter
            this.shapeOfFace = shapeOfFace; // it's the same as previous one.
        }

        public Face(String skinColor, String eyeColor, String sizeOfNose, String shapeOfFace ){
            this.skinColor = skinColor;
            this.shapeOfFace = shapeOfFace;
            this.eyeColor = eyeColor;
            this.sizeOfNose = sizeOfNose;
        }
    }

    class Software{
        public static void main(String[] args) {
            Face object1 = new Face("White", "Blue", "Big", "Triangle");
            Face object2 = new Face("Brown", "Brown", "Small", "Oval");
            Face object3 = new Face("Yellow", "Grey", "Small", "Round");
            Face object4 = new Face("Red", "Square");

            object4.shapeOfFace ="HEART";
            object1.skinColor = "PALE";
            object4.displayFace();


            object1.sadFace();
            object2.happyFace();
            object3.smileFace();


        }
}
