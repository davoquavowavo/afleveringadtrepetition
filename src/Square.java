public class Square<T> implements Comparable<Square>{
    int height;

    int width;


    public Square(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getPerimeter(){
        return ((height*2) + (width*2));
    }

    public int compareTo(Square o) {
        int inte = 0;
        if (getPerimeter() == o.getPerimeter()) {
            System.out.println(0);
            return inte;
        } else if (getPerimeter() > o.getPerimeter()) {
            System.out.println(1);
            return (inte + 1);
        } else if (getPerimeter() < o.getPerimeter()) {
            System.out.println(-1);
            return (inte -1);
        } return inte;

    }



}
