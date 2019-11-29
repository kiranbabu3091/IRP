
package IR_Project;

public class DocumentFields{

    private String title;
    private String content;
    private String path;


    /**
     * Constructor(Title,contents,path) and its getter and setter methods 
     */
    public DocumentFields(String  title, String content,String path) {
        this.title = title;
        this.content = content;
        this.path = path;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getTitle() {
        return title;
    }

   public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public String getPath() {
        return path;
    }

}
