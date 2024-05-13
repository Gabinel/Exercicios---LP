public class Arquivo {

    private String name;
    private int size;
    private String content;

    public Arquivo(String name) {
        this.name = name;
        size = 0;
        content = "";
    }

    public void edit(String content) {
        this.content = content;
        size = content.length();
    }

    public void rename(String name) {
        this.name = name;
    }

    public void clear() {
        content = "";
        size = 0;
    }

    public String open() {
        return "Arquivo {\n" +
                "name='" + name + "',\n" +
                ", size=" + size + " bits, " + size * 8 + " bytes\n" +
                ", content='" + content + "'\n" +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getContent() {
        return content;
    }

}