public class FileDataSource implements IDataSource {
    private String fileName;

    public FileDataSource(String fileName){
        this.fileName = fileName;
    }

    @Override
    public Object getDados(){
        return "Here's the data from the " + fileName + " file";
    }
}
