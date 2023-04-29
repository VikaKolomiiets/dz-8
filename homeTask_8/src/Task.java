import java.util.UUID;

public class Task {
    //region id
    private UUID id;
    public UUID getId() {
        return id;
    }
    //endregion

    //region description
    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) throws Exception {
        Guard.checkString(description);
        this.description = description;
    }
    //endregion

    public Task(String description) throws Exception {
        Guard.checkString(description);
        this.id = UUID.randomUUID();
        this.description = description;
    }
}
