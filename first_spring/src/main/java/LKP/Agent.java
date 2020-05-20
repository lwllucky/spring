package LKP;

/**
 * @auter liwinallucky
 */
public class Agent {
    private Star myStar;
    private Company myCompany;
    private Fans myFans;
    public void setMyStar(Star myStar) {
        this.myStar = myStar;
    }

    public void setMyCompany(Company myCompany) {
        this.myCompany = myCompany;
    }

    public void setMyFans(Fans myFans) {
        this.myFans = myFans;
    }

    public void meeting(){
        System.out.println(myStar.getName()+"跟粉丝"+myFans.getName()+"见面");
    }
    public void business(){
        System.out.println(myStar.getName()+"跟老板"+myCompany.getName()+"谈生意");
    }
}
