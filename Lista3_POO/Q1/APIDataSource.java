public class APIDataSource implements IDataSource {
    private string apiName;

    public APIDataSource(String apiName){
        this.apiName = apiName;
    }

    @Override
    public Object getDados(){
        return "Here's the data from the " + apiName " API";
    }
}
