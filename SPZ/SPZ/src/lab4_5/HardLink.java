package lab4_5;

public class HardLink extends Link {
    File file;

    public HardLink(int id, File file, String name) {
        super(id, name);
        this.file = file;
    }

    @Override
    public String toString() {
        return "lab4_5.HardLink{" + "id=" + id + ", fileId=" + file.id + ", name='" + name + '\'' + '}';
    }
}
