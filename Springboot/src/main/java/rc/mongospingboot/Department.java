package rc.mongospingboot;

public class Department {
    private String deptname;
    private int deptno;

    protected Department() {
    }

    public Department(String deptname, int deptno) {
        this.deptname = deptname;
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public int getDeptno() {
        return deptno;
    }
}
