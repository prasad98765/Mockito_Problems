public class ClassToTest {
    private final MyDataBase MyDataBase;

    public ClassToTest(MyDataBase dataBaseMock) {
        this.MyDataBase = dataBaseMock;
    }

    public boolean query(String query){
        return this.MyDataBase.query(query);
    }
}
