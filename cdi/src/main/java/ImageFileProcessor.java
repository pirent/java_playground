import javax.inject.Inject;
import javax.inject.Named;

public class ImageFileProcessor {
    
    private ImageFileEditor editor;
    private TimeLogger timeLogger;

    @Inject
    public ImageFileProcessor(@Named("GifFileEditor") ImageFileEditor editor, TimeLogger timeLogger) {
        this.editor = editor;
        this.timeLogger = timeLogger;
    }

    public String openFile(String filename) {
        return editor.openFile(filename) + " at " + timeLogger.getTime();
    }
}