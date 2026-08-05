// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 09 — Generics: Reusable Data Storage Box
//the type parameters here are F and S, meaning first and second. they can be any object, 
// except null maybe, but that would throw an runtime error not a compile error
public class Pair<F, S>{
    private F first;
    private S second;
    public Pair(F first, S second){
        this.first=first;
        this.second=second;
    }
    public F getFirst(){
        return first;
    }
    public S getSecond(){
        return second;
    }
    public void setFirst(F first){
        this.first = first;
    }
    public void setSecond(S second){
        this.second = second;
    }
    @Override
    public String toString(){
        return String.format("Pair: (%s, %s)", first, second);
    }
}