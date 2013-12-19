package kata7;

public class Currency {

    private String code;

    public Currency(String Code) {
        this.code = Code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code; 
    }
    
    
}
