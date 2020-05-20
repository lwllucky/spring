package LKP;

/**
 * @auter liwinallucky
 */
public class Main {
    public static void main(String[] args) {
        Agent agent=new Agent();
        agent.setMyStar(new Star("李白"));
        agent.setMyFans(new Fans("杜甫"));
        agent.setMyCompany(new Company("穿越公司"));
        agent.meeting();
        agent.business();
    }
}
