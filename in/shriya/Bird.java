package in.shriya;

public abstract class Bird implements Flyable{
private final String breed;
public Bird (String breed ){
    this.breed=breed;
}
public String getbreed(){
    return breed;
}
}
