import java.io.IOException;

public class Buch {
    private String name;
    private Integer pages;

    public Buch (String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPages () {
        return this.pages;
    }

    public void setName(String name) throws IOException {
        if(name == null || name.equals("")) {
            throw new IOException("Unusable Name!");
        }
        this.name = name;
    }

    public void setPages(Integer pages) throws IOException{
        if(pages < 1){
            throw new IOException("No valid Value!");
        }
        this.pages = pages;
    }
}
