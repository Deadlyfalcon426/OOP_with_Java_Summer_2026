// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 09 — Generics: Reusable Data Storage Box
//the type parameter here is T. it can be any object, except null as it would cause a runtime error
public class StorageBox<T>{
    private T item;
    private String label;
    public StorageBox(String label, T item){
        this.label = label;
        this.item = item;
    }
    public T getItem(){
        return item;
    }
    public String getLabel(){
        return label;
    }
    public void setItem(T item){
        this.item=item;
    }
    public void setLabel(String label){
        this.label = label;
    }
    @Override
    public String toString(){
        return String.format("Box [%s]: %s",label,item.toString());
    }
}