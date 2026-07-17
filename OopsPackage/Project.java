package OopsPackage;

public class Project
{
    private int projectId;
    private String projectName;

    public Project(int projectId, String projectName)
    {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public void displayProjectDetails()
    {
        System.out.println("Project ID : " + projectId);
        System.out.println("Project Name : " + projectName);
    }
}