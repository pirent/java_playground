import javax.inject.Inject;

import qualifier.PngFileEditorQualifier;

public class ImageFileProcessor {
    
    private ImageFileEditor editor;
    private TimeLogger timeLogger;

    @Inject
    public ImageFileProcessor(@PngFileEditorQualifier ImageFileEditor editor, TimeLogger timeLogger) {
        this.editor = editor;
        this.timeLogger = timeLogger;
    }

    public String openFile(String filename) {
        return editor.openFile(filename) + " at " + timeLogger.getTime();
    }
}