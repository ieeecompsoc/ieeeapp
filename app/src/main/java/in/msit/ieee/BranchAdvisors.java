package in.msit.ieee;

/**
 * Created by Akanksha Jolly on 24-06-2017.
 *
 */

public class BranchAdvisors {
    private String BranchAdvisorName;
    private String BranchAdvisorPost;
    private String BranchAdvisorEmail;
    private int ImageResourceId;

    public BranchAdvisors(int imageResourceId,String branchAdvisorName,String branchAdvisorPost,String branchAdvisorEmail){
        ImageResourceId=imageResourceId;
        BranchAdvisorName=branchAdvisorName;
        BranchAdvisorPost=branchAdvisorPost;
        BranchAdvisorEmail=branchAdvisorEmail;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public String getBranchAdvisorName() {
        return BranchAdvisorName;
    }

    public String getBranchAdvisorPost() {
        return BranchAdvisorPost;
    }

    public String getBranchAdvisorEmail() {
        return BranchAdvisorEmail;
    }
}
