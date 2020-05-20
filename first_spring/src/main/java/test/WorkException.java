package test;

/**
 * @auter liwinallucky
 */
public class WorkException implements Cloneable {
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    protected Object clone(){
        WorkException workException=null;
        try {
            workException=(WorkException)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return workException;
    }

    public static void main(String[] args) {
        WorkException w=new WorkException();
        w.setCompany("sss");
        w.setWorkDate("ddd");
        w.getCompany();
        w.getWorkDate();
    }
}
