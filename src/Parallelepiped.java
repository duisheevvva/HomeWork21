public class Parallelepiped {
    private int height;
    private int lenght;
    private int widght;

    public Parallelepiped(){

    }

    public Parallelepiped(int height, int lenght, int widght) {
        this.height = height;
        this.lenght = lenght;
        this.widght = widght;
    }

    public int getHeight() {
       return height;
    }

    public void setHeight(int height) throws AreaException{
        if (height<=0){
            throw new AreaException("Value cannot be a negative number!");
        }else {
            this.height = height;
        }
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) throws AreaException {
        if (lenght<=0){
            throw new AreaException("Value cannot be a negative number!");
        }else {
            this.lenght = lenght;
        }
    }

    public int getWidght() {
        return widght;
    }

    public void setWidght(int widght) throws AreaException {
        if (widght<=0){
            throw new AreaException("Value cannot be a negative number!");
        }else {
            this.widght = widght;
        }
    }

   public void area(){
        System.out.println(2 * (height * lenght)
                + (lenght + widght) +
                (height * widght));
    }

    void volume(){
        System.out.println(getLenght()*getWidght()* getHeight());

    }

}
