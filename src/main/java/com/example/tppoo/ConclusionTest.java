public class ConclusionTest {
    private Test test;
    private String conclusion;

    public ConclusionTest(String conclusion,Test test){
        this.conclusion = conclusion;
        this.test = test;
        test.setConclusionTest(this);
    }

    public String getConclusionTest(){
        return conclusion;
    }
    
}
