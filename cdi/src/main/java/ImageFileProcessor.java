import javax.inject.Inject;
import javax.inject.Named;

public class ImageFileProcessor {
    
    private ImageFileEditor editor;

    @Inject
    public ImageFileProcessor(@Named("GifFileEditor") ImageFileEditor editor) {
        this.editor = editor;
    }

    public String openFile(String filename) {
        return editor.openFile(filename);
    }
}