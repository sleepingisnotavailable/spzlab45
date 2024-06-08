package lab4_5;

public class
SymLink extends Link{
    String pathName;

    public SymLink(int id, String name, String pathName) {
        super(id, name);
        this.pathName = pathName;
    }

    @Override
    public String toString() {
        return "lab4_5.SymLink{" + "id=" + id + ", pathName='" + pathName + '\'' + ", name='" + name + '\'' + '}';
    }
}
