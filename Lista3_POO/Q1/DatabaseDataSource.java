public class DatabaseDataSource implements IDataSource {
    private string dataBaseName;

    public DatabaseDataSource(String dataBaseName){
        this.dataBaseName = dataBaseName;
    }

    @Override
    public Object getDados(){
        return "Here's the data from the " + dataBaseName " database";
    }
}
