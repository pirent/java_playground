public interface ImageFileEditor {
    String openFile(String filename);

    String editFile(String filename);

    String writeFile(String filename);

    String saveFile(String filename);
}