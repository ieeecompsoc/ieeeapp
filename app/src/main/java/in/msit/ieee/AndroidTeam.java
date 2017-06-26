package in.msit.ieee;

/**
 * Created by Akanksha Jolly on 25-06-2017.
 */

public class AndroidTeam {
    private String teamName;
    private int tImageResourceId;

    public AndroidTeam(int image, String tName){
        teamName=tName;
        tImageResourceId=image;
    }

    public int gettImageResourceId() {
        return tImageResourceId;
    }

    public String getTeamName() {
        return teamName;
    }
}
