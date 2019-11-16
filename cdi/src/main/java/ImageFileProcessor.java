import javax.inject.Inject;

public class ImageFileProcessor {
    
    private ImageFileEditor editor;

    @Inject
    public ImageFileProcessor(ImageFileEditor editor) {
        this.editor = editor;
    }

    public String openFile(String filename) {
        return editor.openFile(filename);
    }
}