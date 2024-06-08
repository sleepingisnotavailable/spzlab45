package lab4_5;

public class FilePart implements IEntityPart {
    File file;
    int startIndex;
    int endIndex;
    String dataPart;

    public FilePart(File file, int startIndex, int endIndex) {
        this.file = file;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.dataPart = file.data.substring(startIndex, endIndex);
    }

    @Override
    public String toString() {
        return "lab4_5.FilePart{" + "fileId=" + file.id + ", dataPart=" + dataPart + '}';
    }
}
