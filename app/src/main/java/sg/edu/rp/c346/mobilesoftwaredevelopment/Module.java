package sg.edu.rp.c346.mobilesoftwaredevelopment;


public class Module {

    private String code;
    private boolean prog;

    public Module(String code, boolean prog){
        this.code=code;
        this.prog=prog;
    }

    public String getCode() {
        return code;
    }

    public boolean isProg() {
        return prog;
    }

}



